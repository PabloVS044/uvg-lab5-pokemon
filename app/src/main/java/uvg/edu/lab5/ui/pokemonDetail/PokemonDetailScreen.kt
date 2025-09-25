package uvg.edu.lab5.ui.pokemonDetail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import uvg.edu.lab5.R
import uvg.edu.lab5.network.RetrofitClient

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokemonDetailScreen(navController: NavController, pokemonName: String?) {
    val pokemonDetail = remember { mutableStateOf<uvg.edu.lab5.data.models.PokemonDetail?>(null) }
    val isLoading = remember { mutableStateOf(true) }

    LaunchedEffect(pokemonName) {
        if (pokemonName != null) {
            try {
                val response = RetrofitClient.apiService.getPokemonDetail(pokemonName)
                pokemonDetail.value = response
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                isLoading.value = false
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.pokemon_detail_title)) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            painter = painterResource(android.R.drawable.ic_menu_revert),
                            contentDescription = stringResource(R.string.back_button)
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            if (isLoading.value) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    CircularProgressIndicator()
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(stringResource(R.string.loading_pokemon_detail))
                }
            } else if (pokemonDetail.value == null) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(stringResource(R.string.error_loading_pokemon_detail))
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = { navController.popBackStack() }) {
                        Text(stringResource(R.string.return_to_list))
                    }
                }
            } else {
                val pokemon = pokemonDetail.value!!

                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "#${pokemon.id} - ${pokemon.name.replaceFirstChar { it.uppercase() }}",
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = stringResource(R.string.pokemon_views),
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        PokemonImageCard(
                            imageUrl = pokemon.sprites.frontDefault,
                            description = stringResource(R.string.front_view)
                        )

                        PokemonImageCard(
                            imageUrl = pokemon.sprites.backDefault,
                            description = stringResource(R.string.back_view)
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))


                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        PokemonImageCard(
                            imageUrl = pokemon.sprites.frontShiny,
                            description = stringResource(R.string.shiny_front)
                        )

                        PokemonImageCard(
                            imageUrl = pokemon.sprites.backShiny,
                            description = stringResource(R.string.shiny_back)
                        )
                    }

                    Spacer(modifier = Modifier.height(32.dp))
                    Button(
                        onClick = { navController.popBackStack() },
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(stringResource(R.string.return_to_list))
                    }
                }
            }
        }
    }
}

@Composable
fun PokemonImageCard(imageUrl: String?, description: String) {
    Card(
        modifier = Modifier.padding(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (!imageUrl.isNullOrEmpty()) {
                AsyncImage(
                    model = imageUrl,
                    contentDescription = description,
                    modifier = Modifier.size(120.dp)
                )
            } else {
                Text(
                    stringResource(R.string.no_image),
                    modifier = Modifier
                        .size(120.dp)
                        .padding(16.dp),
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = description, style = MaterialTheme.typography.bodySmall)
        }
    }
}