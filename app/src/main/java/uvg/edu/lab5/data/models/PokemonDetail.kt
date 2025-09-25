package uvg.edu.lab5.data.models

import com.google.gson.annotations.SerializedName

data class PokemonDetail(
    val id: Int,
    val name: String,
    val sprites: PokemonSprites
)

data class PokemonSprites(
    @SerializedName("front_default") val frontDefault: String?,
    @SerializedName("back_default") val backDefault: String?,
    @SerializedName("front_shiny") val frontShiny: String?,
    @SerializedName("back_shiny") val backShiny: String?
)