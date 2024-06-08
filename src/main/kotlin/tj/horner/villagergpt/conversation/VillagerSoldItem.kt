package tj.horner.villagergpt.conversation

enum class VillagerSoldItem {
    ARMORER {
        override fun SoldItemList(): Collection<String> =
                listOf("helmet", "chestplate", "leggings", "boots", "bell", "shield")
    },
    BUTCHER {
        override fun SoldItemList(): Collection<String> =
                listOf("rabbit_stew", "cooked_porkchop", "cooked_chicken")
    },
    CARTOGRAPHER {
        override fun SoldItemList(): Collection<String> =
                listOf("map", "item_frame", "(Any colored)_banner", "globe_banner_pattern")
    },
    CLERIC {
        override fun SoldItemList(): Collection<String> =
                listOf("redstone", "lapis_lazuli", "glowstone", "ender_pearl", "experience_bottle")
    },
    FARMER {
        override fun SoldItemList(): Collection<String> =
                listOf(
                        "bread",
                        "pumpkin_pie",
                        "apple",
                        "cookie",
                        "cake",
                        "golden_carrot",
                        "glistering_melon_slice"
                )
    },
    FISHERMAN {
        override fun SoldItemList(): Collection<String> =
                listOf("cooked_cod", "cod_bucket", "cooked_salmon", "campfire", "fishing_rod")
    },
    FLETCHER {
        override fun SoldItemList(): Collection<String> =
                listOf("arrow", "flint", "bow", "crossbow")
    },
    LEATHERWORKER {
        override fun SoldItemList(): Collection<String> =
                listOf(
                        "leather_leggings",
                        "leather_chestplate",
                        "leather_helmet",
                        "leather_boots",
                        "leather_horse_armor",
                        "saddle"
                )
    },
    LIBRARIAN {
        override fun SoldItemList(): Collection<String> =
                listOf("book", "bookshelf", "lantern", "glass", "clock", "compass", "name_tag")
    },
    MASON {
        override fun SoldItemList(): Collection<String> =
                listOf(
                        "brick",
                        "chiseled_stone_bricks",
                        "polished_andesite",
                        "polished_granite",
                        "polished_diorite",
                        "dripstone_block",
                        "terracotta",
                        "(Any colored)_terracotta",
                        "(Any colored)_glazed_terracotta",
                        "quartz_pillar",
                        "quartz_block"
                )
    },
    SHEPHERD {
        override fun SoldItemList(): Collection<String> =
                listOf(
                        "(Any colored)_wool",
                        "(Any colored)_Carpet",
                        "(Any colored)_bed",
                        "(Any colored)_banner"
                )
    },
    TOOLSMITH {
        override fun SoldItemList(): Collection<String> =
                listOf("axe", "shovel", "pickaxe", "hoe", "bell")
    },
    WEAPONSMITH {
        override fun SoldItemList(): Collection<String> = listOf("axe", "sword", "bell")
    };

    abstract fun SoldItemList(): Collection<String>
}
