package uvg.edu.lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uvg.edu.lab5.ui.pokemonList.PokemonListScreen
import uvg.edu.lab5.ui.pokemonDetail.PokemonDetailScreen
import uvg.edu.lab5.ui.theme.Lab5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab5Theme {
                PokemonApp()
            }
        }
    }
}

@Composable
fun PokemonApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "pokemonList"
    ) {
        composable("pokemonList") {
            PokemonListScreen(navController = navController)
        }
        composable("pokemonDetail/{pokemonName}") { backStackEntry ->
            val pokemonName = backStackEntry.arguments?.getString("pokemonName")
            PokemonDetailScreen(
                navController = navController,
                pokemonName = pokemonName
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonAppPreview() {
    Lab5Theme {
        PokemonApp()
    }
}