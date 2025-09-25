package uvg.edu.lab5.ui.pokemonList

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import uvg.edu.lab5.R
import uvg.edu.lab5.data.models.Pokemon
import uvg.edu.lab5.network.RetrofitClient

@Composable
fun PokemonListScreen(navController: NavController) {
    val pokemonList = remember { mutableStateOf<List<Pokemon>?>(null) }
    val isLoading = remember { mutableStateOf(true) }
    val errorMessage = remember { mutableStateOf<String?>(null) }

    fun loadPokemon() {
        isLoading.value = true
        errorMessage.value = null

        CoroutineScope(Dispatchers.Main).launch {
            try {
                println("Intentando cargar Pokémon...")
                val response = RetrofitClient.apiService.getPokemonList(100)
                println("Pokémon cargados: ${response.results.size}")
                pokemonList.value = response.results
            } catch (e: Exception) {
                println("Error al cargar Pokémon: ${e.message}")
                e.printStackTrace()
                errorMessage.value = e.message ?: "Error desconocido"
                pokemonList.value = emptyList()
            } finally {
                isLoading.value = false
            }
        }
    }

    LaunchedEffect(Unit) {
        loadPokemon()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = stringResource(R.string.pokemon_list_title),
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(16.dp))

        when {
            isLoading.value -> {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CircularProgressIndicator()
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(stringResource(R.string.loading_pokemon))
                }
            }
            errorMessage.value != null -> {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(stringResource(R.string.error_loading_pokemon, errorMessage.value ?: "Unknown error"))
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(onClick = { loadPokemon() }) {
                        Text(stringResource(R.string.retry_button))
                    }
                }
            }
            pokemonList.value.isNullOrEmpty() -> {
                Text(stringResource(R.string.no_pokemon_found))
            }
            else -> {
                Text(stringResource(R.string.pokemon_found, pokemonList.value!!.size))
                Spacer(modifier = Modifier.height(8.dp))

                LazyColumn {
                    items(pokemonList.value!!.size) { index ->
                        PokemonListItem(
                            pokemon = pokemonList.value!![index],
                            onItemClick = {
                                navController.navigate("pokemonDetail/${pokemonList.value!![index].name}")
                            }
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun PokemonListItem(pokemon: Pokemon, onItemClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick() },
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val pokemonId = extractPokemonId(pokemon.url)
            val imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$pokemonId.png"

            AsyncImage(
                model = imageUrl,
                contentDescription = stringResource(R.string.pokemon_image_description, pokemon.name),
                modifier = Modifier.size(64.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "#$pokemonId - ${pokemon.name.replaceFirstChar { it.uppercase() }}",
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

private fun extractPokemonId(url: String): String {
    return try {
        url.split("/").dropLast(1).lastOrNull() ?: "1"
    } catch (e: Exception) {
        "1" // Fallback a Bulbasaur
    }
}