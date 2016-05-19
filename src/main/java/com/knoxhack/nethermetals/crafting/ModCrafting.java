package com.knoxhack.nethermetals.crafting;

import com.knoxhack.nethermetals.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public final class ModCrafting {

	public static void initCrafting() {

		GameRegistry.addSmelting(ModBlocks.nethercopperOre, new ItemStack(cyanoBlocks.copper_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.nethertinOre, new ItemStack(cyanoBlocks.tin_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.nethersilverOre, new ItemStack(cyanoBlocks.silver_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherzincOre, new ItemStack(cyanoBlocks.zinc_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.nethernickelOre, new ItemStack(cyanoBlocks.nickel_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherleadOre, new ItemStack(cyanoBlocks.lead_ore, 2), 1.0f);

		GameRegistry.addSmelting(ModBlocks.netherironOre, new ItemStack(Blocks.IRON_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherredstoneOre, new ItemStack(Blocks.REDSTONE_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherdiamondOre, new ItemStack(Blocks.DIAMOND_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherlapisOre, new ItemStack(Blocks.LAPIS_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.nethergoldOre, new ItemStack(Blocks.GOLD_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.nethercoalOre, new ItemStack(Blocks.COAL_ORE, 2), 1.0f);
	}
}
