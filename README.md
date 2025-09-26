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

git clone https://github.com/PabloVS044/uvg-lab5-pokemon.git

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
