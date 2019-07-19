package net.zeriteclient.util.entities

data class User(
    val username: String,
    val uuid: String,
    val cosmetics: ArrayList<Cosmetic>,
    val admin: Boolean? = false,
    val cosmeticMeta: CosmeticMeta? = CosmeticMeta(),
    val meta: UserMeta? = UserMeta()
)

data class CosmeticMeta(
    val cape: CapeMeta? = CapeMeta()
)

class UserMeta

data class CapeMeta(
    val selected: EnumCape = EnumCape.NONE,
    val url: String? = null
)

enum class EnumCape {
    NONE,
    CUSTOM
}

data class Cosmetic(
    val name: String,
    val purchasedAt: Long
)
