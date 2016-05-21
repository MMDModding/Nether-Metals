package com.knoxhack.nethermetals.crafting;

import com.knoxhack.nethermetals.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static void initCrafting() {
		// Vanilla
		GameRegistry.addSmelting(ModBlocks.netherironOre, new ItemStack(Blocks.iron_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherredstoneOre, new ItemStack(Blocks.redstone_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherdiamondOre, new ItemStack(Blocks.diamond_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherlapisOre, new ItemStack(Blocks.lapis_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.nethergoldOre, new ItemStack(Blocks.gold_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.nethercoalOre, new ItemStack(Blocks.coal_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netheremeraldOre, new ItemStack(Blocks.emerald_ore, 2), 1.0f); 

		// Base Metals
		GameRegistry.addSmelting(ModBlocks.nethercopperOre, new ItemStack(cyanoBlocks.copper_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.nethertinOre, new ItemStack(cyanoBlocks.tin_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.nethersilverOre, new ItemStack(cyanoBlocks.silver_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherzincOre, new ItemStack(cyanoBlocks.zinc_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.nethernickelOre, new ItemStack(cyanoBlocks.nickel_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherleadOre, new ItemStack(cyanoBlocks.lead_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.nethermercuryOre, new ItemStack(cyanoBlocks.mercury_ore, 2), 1.0f);
//		GameRegistry.addSmelting(ModBlocks.netherplatinumOre, new ItemStack(cyanoBlocks.platinum_ore, 2), 1.0f); // Not supported in BM 1.8.0

		// TODO: Modern Metals
	}
}
