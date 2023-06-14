package com.supernoob.backroomsassets.registry;

import com.supernoob.backroomsassets.BackroomsAssetsMain;
import com.supernoob.backroomsassets.block.FluorescentLight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlock {
    public static final Block Fluorescent_Light = RegisterBlock("fluorescent_light", new FluorescentLight(FabricBlockSettings.of(Material.GLASS).ticksRandomly().luminance(15).strength(0.3f,0.3f)));
    public static final Block Level_zero_wall = RegisterBlock("level_zero_wall", new Block(FabricBlockSettings.of(Material.NETHER_WOOD).strength(2f,2f).requiresTool()));
    public static final Block Level_zero_roof = RegisterBlock("level_zero_roof", new Block(FabricBlockSettings.of(Material.NETHER_WOOD).strength(2f,2f).requiresTool()));
    public static final Block Level_zero_floor = RegisterBlock("level_zero_floor", new Block(FabricBlockSettings.of(Material.NETHER_WOOD).strength(2f,2f).requiresTool()));
    private static Block RegisterBlock(String name, Block block) {
        RegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BackroomsAssetsMain.MOD_ID, name), block);
    }

    private static Item RegisterBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(BackroomsAssetsMain.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        return item;
    }
    public static void init() {}
}
