package com.supernoob.backroomsassets.registry;

import com.supernoob.backroomsassets.BackroomsAssetsMain;
import com.supernoob.backroomsassets.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItem {

    public static final Item ITS_JUST_A_BURNING_NETHER = register("music_disc_its_just_a_burning_nether", ModSounds.SOUND_ITS_JUST_A_BURNING_NETHER);

    private static Item register(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1);
        return Registry.register(Registries.ITEM, new Identifier(BackroomsAssetsMain.MOD_ID, id), new MusicDiscItem(15, sound, settings, 240));
    }
    public static void init() { }

}
