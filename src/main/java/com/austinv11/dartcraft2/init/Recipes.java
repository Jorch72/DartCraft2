package com.austinv11.dartcraft2.init;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import forestry.api.recipes.RecipeManagers;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
	
	public static void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.clipboard), "pip", "pap", "pap", 'p', "plankWood", 'i', "ingotIron", 'a', new ItemStack(Items.paper)));
		ItemStack twoIngots = new ItemStack(ModItems.forceIngot);
		twoIngots.stackSize = 2;
		ItemStack threeIngots = twoIngots.copy();
		threeIngots.stackSize = 3;
		GameRegistry.addRecipe(new ShapelessOreRecipe(twoIngots, "gemForce", "ingotIron", "ingotIron"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(threeIngots, "gemForce", "ingotGold", "ingotGold"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(twoIngots, "gemForce", "ingotBronze", "ingotBronze"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(threeIngots, "gemForce", "ingotRefinedIron", "ingotRefinedIron"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(threeIngots, "gemForce", "ingotSilver", "ingotSilver"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(threeIngots, "gemForce", "ingotSteel", "ingotSteel"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(twoIngots, "gemForce", "ingotCopper", "ingotCopper"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(twoIngots, "gemForce", "ingotTin", "ingotTin"));
		//TODO: Mob ingot recipes for force ingots
		if (Loader.isModLoaded("Forestry"))
			loadForestryRecipes();
	}
	
	private static void loadForestryRecipes() {
		ItemStack twoIngots = new ItemStack(ModItems.forceIngot);
		twoIngots.stackSize = 2;
		ItemStack threeIngots = twoIngots.copy();
		threeIngots.stackSize = 3;
		RecipeManagers.squeezerManager.addRecipe(40, new ItemStack[]{new ItemStack(ModItems.forceShard)}, new FluidStack(ModFluids.liquidForce, 1500)); //TODO: Force shard as remnants
		for (ItemStack stack : OreDictionary.getOres("ingotIron"))
			RecipeManagers.carpenterManager.addRecipe(40, new FluidStack(ModFluids.liquidForce, 1000), null, twoIngots, "   ", "   ", " ff", 'f', stack);
		for (ItemStack stack : OreDictionary.getOres("ingotGold"))
			RecipeManagers.carpenterManager.addRecipe(40, new FluidStack(ModFluids.liquidForce, 1000), null, threeIngots, "   ", "   ", " ff", 'f', stack);
		for (ItemStack stack : OreDictionary.getOres("ingotBronze"))
			RecipeManagers.carpenterManager.addRecipe(40, new FluidStack(ModFluids.liquidForce, 1000), null, twoIngots, "   ", "   ", " ff", 'f', stack);
		for (ItemStack stack : OreDictionary.getOres("ingotRefinedIron"))
			RecipeManagers.carpenterManager.addRecipe(40, new FluidStack(ModFluids.liquidForce, 1000), null, threeIngots, "   ", "   ", " ff", 'f', stack);
		for (ItemStack stack : OreDictionary.getOres("ingotSilver"))
			RecipeManagers.carpenterManager.addRecipe(40, new FluidStack(ModFluids.liquidForce, 1000), null, threeIngots, "   ", "   ", " ff", 'f', stack);
		for (ItemStack stack : OreDictionary.getOres("ingotSteel"))
			RecipeManagers.carpenterManager.addRecipe(40, new FluidStack(ModFluids.liquidForce, 1000), null, threeIngots, "   ", "   ", " ff", 'f', stack);
		for (ItemStack stack : OreDictionary.getOres("ingotCopper"))
			RecipeManagers.carpenterManager.addRecipe(40, new FluidStack(ModFluids.liquidForce, 1000), null, twoIngots, "   ", "   ", " ff", 'f', stack);
		for (ItemStack stack : OreDictionary.getOres("ingotTin"))
			RecipeManagers.carpenterManager.addRecipe(40, new FluidStack(ModFluids.liquidForce, 1000), null, twoIngots, "   ", "   ", " ff", 'f', stack);
		//TODO: Mob ingot recipes for force ingots
	}
}
