package com.supernoob.backroomsassets.sound;

import com.supernoob.backroomsassets.BackroomsAssetsMain;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent FLUORESCENT_LIGHT_BUZZ_SOUND = registerSoundEvent("fluorescent_light_buzz");
    public static SoundEvent SOUND_ITS_JUST_A_BURNING_NETHER = registerSoundEvent("its_just_a_burning_nether");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(BackroomsAssetsMain.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void init(){
    }
}
