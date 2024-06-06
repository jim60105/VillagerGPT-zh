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
                listOf(
                        "map",
                        "filled_map.mansion",
                        "filled_map.ocean",
                        "filled_map.buried_treasure",
                        "item_frame",
                        "banner",
                        "banner_pattern"
                )
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
                        "suspicious_stew",
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
                listOf("arrow", "flint", "bow", "crossbow", "bow", "crossbow", "tipped_arrow")
    },
    LEATHERWORKER {
        override fun SoldItemList(): Collection<String> =
                listOf(
                        "leather_leggings",
                        "leather_chestplate",
                        "leather_helmet",
                        "leather_boots",
                        "leather_chestplate",
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
                        "Brick",
                        "chiseled_stone_bricks",
                        "polished_andesite",
                        "polished_granite",
                        "polished_diorite",
                        "dripstone_block",
                        "colored terracotta",
                        "glazed_terracotta",
                        "quartz_pillar",
                        "quartz_block"
                )
    },
    SHEPHERD {
        override fun SoldItemList(): Collection<String> =
                listOf("color wool", "color Carpet", "color Bed", "color banner")
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
