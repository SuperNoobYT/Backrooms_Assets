package com.supernoob.backroomsassets;

import com.supernoob.backroomsassets.block.FluorescentLight;
import com.supernoob.backroomsassets.block.ModBlock;
import com.supernoob.backroomsassets.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BackroomsAssetsMain implements ModInitializer {
	public static final String MOD_ID = "backrooms_assets";
	public static final Logger LOGGER = LoggerFactory.getLogger("backrooms_assets");

	public static final ItemGroup BACKROOMS_ASSETS = FabricItemGroup.builder(new Identifier("exemple", "backrooms_assets_group"))
			.displayName(Text.literal("Backrooms Assets"))
			.icon(() -> new ItemStack(Items.YELLOW_WOOL))
			.entries((context, entries) -> {
				entries.add(ModBlock.Fluorescent_Light);
			})
			.build();

	@Override
	public void onInitialize() {

		ModBlock.init();
		ModSounds.init();
	}

}