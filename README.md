**Pokémon Explorer App 🎮**

Una aplicación Android moderna desarrollada en Kotlin con Jetpack
Compose que te permite explorar el mundo Pokémon de manera interactiva.

**🌟 Características**

**✨ Funcionalidades Principales**

-   **Lista de Pokémon**: Visualiza los primeros 100 Pokémon con
    imágenes y nombres

-   **Detalles Completos**: Accede a información detallada de cada
    Pokémon

-   **Vistas Múltiples**: Observa cada Pokémon desde 4 ángulos
    diferentes:

    -   Vista frontal normal

    -   Vista trasera normal

    -   Vista frontal shiny

    -   Vista trasera shiny

-   **Navegación Fluida**: Interfaz intuitiva con navegación entre
    pantallas

-   **Diseño Moderno**: Implementado completamente con Material Design 3

**🛠 Tecnologías Utilizadas**

  -----------------------------------------------------------------------
Tecnología              Versión            Propósito
  ----------------------- ------------------ ----------------------------
**Kotlin**              1.9+               Lenguaje de programación

**Jetpack Compose**     BOM 2023.10+       UI Declarativa

**Material Design 3**   1.1+               Sistema de diseño

**Retrofit2**           2.9.0              Cliente HTTP

**Coil**                2.5.0              Carga de imágenes

**Navigation Compose**  2.7+               Navegación entre pantallas

**Corrutinas**          1.7+               Programación asíncrona
-----------------------------------------------------------------------

**📸 Capturas de Pantalla**

**Pantalla de Lista**

-   Muestra grid de Pokémon con imágenes

-   Nombres formateados correctamente

-   Indicador de carga durante la obtención de datos

-   Manejo de errores con opción de reintento

**Pantalla de Detalle**

-   4 vistas diferentes del Pokémon seleccionado

-   Información organizada en tarjetas

-   Botón de navegación de regreso

-   Diseño responsive para diferentes tamaños de pantalla

**🚀 Instalación**

**Prerrequisitos**

-   Android Studio Arctic Fox o superior

-   SDK Android 34 (API 34)

-   Gradle 8.0+

-   Dispositivo o emulador con Android 8.0+ (API 26+)

**Pasos de Instalación**

1.  Clona el repositorio:

bash

git clone https://github.com/tu-usuario/pokemon-explorer.git

2.  Abre el proyecto en Android Studio

3.  Sincroniza las dependencias de Gradle

4.  Ejecuta la aplicación en un emulador o dispositivo físico

**Configuración**

La aplicación requiere permisos de internet para acceder a la PokeAPI.
Los permisos están configurados automáticamente en el AndroidManifest.

**🏗 Arquitectura del Proyecto**

text

app/

├── src/main/java/uvg/edu/lab5/

│ ├── data/

│ │ └── models/

│ │ ├── Pokemon.kt

│ │ ├── PokemonResponse.kt

│ │ └── PokemonDetail.kt

│ ├── network/

│ │ └── RetrofitClient.kt

│ ├── ui/

│ │ ├── pokemonList/

│ │ │ └── PokemonListScreen.kt

│ │ └── pokemonDetail/

│ │ └── PokemonDetailScreen.kt

│ └── MainActivity.kt

├── res/

│ └── values/

│ └── strings.xml

└── AndroidManifest.xml

**Estructura de Módulos**

-   **Data Layer**: Modelos de datos y objetos de transferencia

-   **Network Layer**: Configuración de Retrofit y servicios API

-   **UI Layer**: Pantallas y componentes de Compose

-   **Resources**: Recursos de internacionalización y temas

**🔌 API Utilizada**

La aplicación consume
la **PokeAPI** ([pokeapi.co](https://pokeapi.co/)):

**Endpoints Utilizados**

-   GET /pokemon?limit=100 - Lista de Pokémon

-   GET /pokemon/{name} - Detalles específicos del Pokémon

**Características de la API**

-   **RESTful**: Arquitectura REST estándar

-   **JSON**: Formato de respuesta

-   **Gratuita**: Sin requerimiento de API key

-   **Completa**: Información exhaustiva sobre Pokémon

**🎨 Personalización**

**Modificaciones Fáciles de Realizar**

**Cambiar Número de Pokémon Mostrados**

En PokemonListScreen.kt, modifica el parámetro limit:

kotlin

val response = RetrofitClient.apiService.getPokemonList(150) // Cambiar
100 por otro valor

**Agregar Nuevas Vistas de Pokémon**

En PokemonDetail.kt, extiende el modelo PokemonSprites:

kotlin

data class PokemonSprites(

// \... propiedades existentes

\@SerializedName(\"front_female\") val frontFemale: String?

)

**Modificar el Tema**

Edita Theme.kt para personalizar colores y tipografía.

**🐛 Solución de Problemas**

**Problemas Comunes y Soluciones**

  -----------------------------------------------------------------------
Problema               Solución
  ---------------------- ------------------------------------------------
**Error de conexión**  Verificar permisos de internet en el manifest

**Imágenes no cargan** Revisar configuración de Coil y URLs

**App se cierra**      Verificar manejo de nulos en modelos de datos

**Navegación falla**   Confirmar rutas en NavHost
-----------------------------------------------------------------------

**Logs de Depuración**

La aplicación incluye logging detallado. Busca en Logcat:

-   🔄 Intentando cargar Pokémon\... - Inicio de carga

-   ✅ Pokémon cargados: X - Carga exitosa

-   ❌ Error al cargar Pokémon - Errores específicos

**📈 Próximas Mejoras**

**Características Planeadas**

-   Búsqueda en tiempo real

-   Filtros por tipo de Pokémon

-   Modo oscuro mejorado

-   Animaciones de transición

-   Cache de imágenes offline

-   Compartir Pokémon en redes sociales

**Mejoras Técnicas**

-   Implementar Repository Pattern

-   Agregar tests unitarios

-   Implementar caching con Room

-   Agregar analytics

**🤝 Contribución**

Las contribuciones son bienvenidas. Por favor:

1.  Fork el proyecto

2.  Crea una rama para tu feature (git checkout -b
    feature/AmazingFeature)

3.  Commit tus cambios (git commit -m \'Add some AmazingFeature\')

4.  Push a la rama (git push origin feature/AmazingFeature)

5.  Abre un Pull Request

**📄 Licencia**

Este proyecto está bajo la Licencia MIT. Ver el archivo LICENSE para más
detalles.

**👨‍💻 Autor**

**Pablo** - Desarrollo y diseño de la aplicación

**🙏 Agradecimientos**

-   **PokeAPI** por proporcionar datos gratuitos de Pokémon

-   **JetBrains** por Kotlin y Android Studio

-   **Google** por Jetpack Compose y Material Design

-   **Comunidad Android** por el apoyo continuo

**¡Atrapa todos!** ⚡ ¿Listo para explorar el mundo Pokémon?

\<div align=\"center\"\>

<https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png>\
<https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png>\
<https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png>\
<https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png>

\</div\>

**📁 Estructura Completa del Proyecto**

**Archivos Principales del Código**

**🏠 MainActivity.kt**

kotlin

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

\@Composable

fun PokemonApp() {

val navController = rememberNavController()

NavHost(

navController = navController,

startDestination = \"pokemonList\"

) {

composable(\"pokemonList\") {

PokemonListScreen(navController = navController)

}

composable(\"pokemonDetail/{pokemonName}\") { backStackEntry -\>

val pokemonName = backStackEntry.arguments?.getString(\"pokemonName\")

PokemonDetailScreen(

navController = navController,

pokemonName = pokemonName

)

}

}

}

\@Preview(showBackground = true)

\@Composable

fun PokemonAppPreview() {

Lab5Theme {

PokemonApp()

}

}

**📋 PokemonListScreen.kt**

kotlin

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

import androidx.compose.ui.res.stringResource

import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

import coil.compose.AsyncImage

import uvg.edu.lab5.R

import uvg.edu.lab5.data.models.Pokemon

import uvg.edu.lab5.network.RetrofitClient

\@Composable

fun PokemonListScreen(navController: NavController) {

val pokemonList = remember { mutableStateOf\<List\<Pokemon\>?\>(null) }

val isLoading = remember { mutableStateOf(true) }

val errorMessage = remember { mutableStateOf\<String?\>(null) }

LaunchedEffect(Unit) {

try {

val response = RetrofitClient.apiService.getPokemonList(100)

pokemonList.value = response.results

} catch (e: Exception) {

errorMessage.value = e.message ?: \"Error desconocido\"

pokemonList.value = emptyList()

} finally {

isLoading.value = false

}

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

isLoading.value -\> {

Column(

modifier = Modifier.fillMaxWidth(),

horizontalAlignment = Alignment.CenterHorizontally

) {

CircularProgressIndicator()

Spacer(modifier = Modifier.height(8.dp))

Text(stringResource(R.string.loading_pokemon))

}

}

errorMessage.value != null -\> {

Column(

modifier = Modifier.fillMaxWidth(),

horizontalAlignment = Alignment.CenterHorizontally

) {

Text(stringResource(R.string.error_loading_pokemon, errorMessage.value
?: \"Unknown error\"))

Spacer(modifier = Modifier.height(8.dp))

Button(onClick = {

isLoading.value = true

errorMessage.value = null

LaunchedEffect(Unit) {

try {

val response = RetrofitClient.apiService.getPokemonList(100)

pokemonList.value = response.results

} catch (e: Exception) {

errorMessage.value = e.message ?: \"Error desconocido\"

} finally {

isLoading.value = false

}

}

}) {

Text(stringResource(R.string.retry_button))

}

}

}

pokemonList.value.isNullOrEmpty() -\> {

Text(stringResource(R.string.no_pokemon_found))

}

else -\> {

Text(stringResource(R.string.pokemon_found, pokemonList.value!!.size))

Spacer(modifier = Modifier.height(8.dp))

LazyColumn {

items(pokemonList.value!!.size) { index -\>

PokemonListItem(

pokemon = pokemonList.value!!\[index\],

onItemClick = {

navController.navigate(\"pokemonDetail/\${pokemonList.value!!\[index\].name}\")

}

)

Spacer(modifier = Modifier.height(8.dp))

}

}

}

}

}

}

\@Composable

fun PokemonListItem(pokemon: Pokemon, onItemClick: () -\> Unit) {

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

val imageUrl =
\"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/\$pokemonId.png\"

AsyncImage(

model = imageUrl,

contentDescription = stringResource(R.string.pokemon_image_description,
pokemon.name),

modifier = Modifier.size(64.dp)

)

Spacer(modifier = Modifier.width(16.dp))

Text(

text = \"#\$pokemonId - \${pokemon.name.replaceFirstChar {
it.uppercase() }}\",

style = MaterialTheme.typography.titleMedium

)

}

}

}

private fun extractPokemonId(url: String): String {

return try {

url.split(\"/\").dropLast(1).lastOrNull() ?: \"1\"

} catch (e: Exception) {

\"1\"

}

}

**🔍 PokemonDetailScreen.kt**

kotlin

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

import androidx.compose.ui.res.painterResource

import androidx.compose.ui.res.stringResource

import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

import coil.compose.AsyncImage

import uvg.edu.lab5.R

import uvg.edu.lab5.network.RetrofitClient

\@OptIn(ExperimentalMaterial3Api::class)

\@Composable

fun PokemonDetailScreen(navController: NavController, pokemonName:
String?) {

val pokemonDetail = remember {
mutableStateOf\<uvg.edu.lab5.data.models.PokemonDetail?\>(null) }

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

) { paddingValues -\>

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

text = \"#\${pokemon.id} - \${pokemon.name.replaceFirstChar {
it.uppercase() }}\",

style = MaterialTheme.typography.headlineMedium

)

Spacer(modifier = Modifier.height(16.dp))

Text(

text = stringResource(R.string.pokemon_views),

style = MaterialTheme.typography.titleMedium

)

Spacer(modifier = Modifier.height(16.dp))

// Primera fila de imágenes

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

// Segunda fila de imágenes

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

// Botón de regreso al final

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

\@Composable

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

**🌐 RetrofitClient.kt**

kotlin

package uvg.edu.lab5.network

import retrofit2.Retrofit

import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.http.GET

import retrofit2.http.Path

import retrofit2.http.Query

import uvg.edu.lab5.data.models.PokemonResponse

import uvg.edu.lab5.data.models.PokemonDetail

object RetrofitClient {

private const val BASE_URL = \"https://pokeapi.co/api/v2/\"

private val retrofit: Retrofit by lazy {

Retrofit.Builder()

.baseUrl(BASE_URL)

.addConverterFactory(GsonConverterFactory.create())

.build()

}

val apiService: ApiService by lazy {

retrofit.create(ApiService::class.java)

}

}

interface ApiService {

\@GET(\"pokemon\")

suspend fun getPokemonList(@Query(\"limit\") limit: Int):
PokemonResponse

\@GET(\"pokemon/{name}\")

suspend fun getPokemonDetail(@Path(\"name\") name: String):
PokemonDetail

}

**📊 Modelos de Datos**

**PokemonResponse.kt**

kotlin

package uvg.edu.lab5.data.models

data class PokemonResponse(

val count: Int,

val next: String?,

val previous: String?,

val results: List\<Pokemon\>

)

**Pokemon.kt**

kotlin

package uvg.edu.lab5.data.models

data class Pokemon(

val name: String,

val url: String

)

**PokemonDetail.kt**

kotlin

package uvg.edu.lab5.data.models

import com.google.gson.annotations.SerializedName

data class PokemonDetail(

val id: Int,

val name: String,

val sprites: PokemonSprites

)

data class PokemonSprites(

\@SerializedName(\"front_default\") val frontDefault: String?,

\@SerializedName(\"back_default\") val backDefault: String?,

\@SerializedName(\"front_shiny\") val frontShiny: String?,

\@SerializedName(\"back_shiny\") val backShiny: String?

)

**📝 strings.xml**

xml

\<?xml version=\"1.0\" encoding=\"utf-8\"?\>

\<resources\>

\<!\-- Main Activity \--\>

\<string name=\"app_name\"\>Pokémon Explorer\</string\>

\<!\-- Pokemon List Screen \--\>

\<string name=\"pokemon_list_title\"\>Pokémon List\</string\>

\<string name=\"loading_pokemon\"\>Cargando Pokémon...\</string\>

\<string name=\"error_loading_pokemon\"\>Error: %s\</string\>

\<string name=\"retry_button\"\>Reintentar\</string\>

\<string name=\"no_pokemon_found\"\>No se encontraron Pokémon\</string\>

\<string name=\"pokemon_found\"\>Pokémon encontrados: %d\</string\>

\<string name=\"pokemon_image_description\"\>Pokemon %s\</string\>

\<!\-- Pokemon Detail Screen \--\>

\<string name=\"pokemon_detail_title\"\>Pokémon Detail\</string\>

\<string name=\"loading_pokemon_detail\"\>Cargando Pokémon...\</string\>

\<string name=\"error_loading_pokemon_detail\"\>Error al cargar el
Pokémon\</string\>

\<string name=\"return_to_list\"\>Regresar a la lista\</string\>

\<string name=\"back_button\"\>Regresar\</string\>

\<string name=\"pokemon_views\"\>Vistas del Pokémon:\</string\>

\<string name=\"front_view\"\>Front View\</string\>

\<string name=\"back_view\"\>Back View\</string\>

\<string name=\"shiny_front\"\>Shiny Front\</string\>

\<string name=\"shiny_back\"\>Shiny Back\</string\>

\<string name=\"no_image\"\>No image\</string\>

\</resources\>

**🔧 build.gradle (Module: app)**

gradle

plugins {

id \'com.android.application\'

id \'org.jetbrains.kotlin.android\'

}

android {

namespace \'uvg.edu.lab5\'

compileSdk 34

defaultConfig {

applicationId \"uvg.edu.lab5\"

minSdk 26

targetSdk 34

versionCode 1

versionName \"1.0\"

testInstrumentationRunner \"androidx.test.runner.AndroidJUnitRunner\"

vectorDrawables {

useSupportLibrary true

}

}

buildTypes {

release {

minifyEnabled false

proguardFiles getDefaultProguardFile(\'proguard-android-optimize.txt\'),
\'proguard-rules.pro\'

}

}

compileOptions {

sourceCompatibility JavaVersion.VERSION_1\_8

targetCompatibility JavaVersion.VERSION_1\_8

}

kotlinOptions {

jvmTarget = \'1.8\'

}

buildFeatures {

compose true

}

composeOptions {

kotlinCompilerExtensionVersion \'1.5.3\'

}

packagingOptions {

resources {

excludes += \'/META-INF/{AL2.0,LGPL2.1}\'

}

}

}

dependencies {

implementation \'androidx.core:core-ktx:1.12.0\'

implementation \'androidx.lifecycle:lifecycle-runtime-ktx:2.6.2\'

implementation \'androidx.activity:activity-compose:1.8.0\'

implementation platform(\'androidx.compose:compose-bom:2023.10.01\')

implementation \'androidx.compose.ui:ui\'

implementation \'androidx.compose.ui:ui-graphics\'

implementation \'androidx.compose.ui:ui-tooling-preview\'

implementation \'androidx.compose.material3:material3\'

// Navigation

implementation \"androidx.navigation:navigation-compose:2.7.5\"

// Retrofit

implementation \'com.squareup.retrofit2:retrofit:2.9.0\'

implementation \'com.squareup.retrofit2:converter-gson:2.9.0\'

// Coil

implementation \"io.coil-kt:coil-compose:2.5.0\"

// Coroutines

implementation
\'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3\'

testImplementation \'junit:junit:4.13.2\'

androidTestImplementation \'androidx.test.ext:junit:1.1.5\'

androidTestImplementation \'androidx.test.espresso:espresso-core:3.5.1\'

androidTestImplementation
platform(\'androidx.compose:compose-bom:2023.10.01\')

androidTestImplementation \'androidx.compose.ui:ui-test-junit4\'

debugImplementation \'androidx.compose.ui:ui-tooling\'

debugImplementation \'androidx.compose.ui:ui-test-manifest\'

}

**📄 AndroidManifest.xml**

xml

\<?xml version=\"1.0\" encoding=\"utf-8\"?\>

\<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"

xmlns:tools=\"http://schemas.android.com/tools\"\>

\<!\-- Permiso de internet \--\>

\<uses-permission android:name=\"android.permission.INTERNET\" /\>

\<uses-permission
android:name=\"android.permission.ACCESS_NETWORK_STATE\" /\>

\<application

android:allowBackup=\"true\"

android:dataExtractionRules=\"@xml/data_extraction_rules\"

android:fullBackupContent=\"@xml/backup_rules\"

android:icon=\"@mipmap/ic_launcher\"

android:label=\"@string/app_name\"

android:roundIcon=\"@mipmap/ic_launcher_round\"

android:supportsRtl=\"true\"

android:theme=\"@style/Theme.Lab5\"

tools:targetApi=\"31\"\>

\<activity

android:name=\".MainActivity\"

android:exported=\"true\"

android:theme=\"@style/Theme.Lab5\"\>

\<intent-filter\>

\<action android:name=\"android.intent.action.MAIN\" /\>

\<category android:name=\"android.intent.category.LAUNCHER\" /\>

\</intent-filter\>

\</activity\>

\</application\>

\</manifest\>

**🎯 Cómo Usar la Aplicación**

1.  **Inicio**: La app carga automáticamente la lista de Pokémon

2.  **Navegación**: Toca cualquier Pokémon para ver sus detalles

3.  **Vistas**: En la pantalla de detalles, observa 4 ángulos diferentes

4.  **Regreso**: Usa el botón de flecha o el botón \"Regresar\" para
    volver

**📱 Compatibilidad**

-   **Versión mínima de Android**: 8.0 (API 26)

-   **Versión objetivo de Android**: 14 (API 34)

-   **Orientación**: Portrait y Landscape

-   **Idiomas**: Español (fácil de internacionalizar)
