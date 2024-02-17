
package net.mcreator.strangefuelsmod.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;

import net.mcreator.strangefuelsmod.entity.EntityHxxsw;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

import java.util.Random;

@ElementsStrangeFuelsMod.ModElement.Tag
public class BiomeGensokyoforest extends ElementsStrangeFuelsMod.ModElement {
	@GameRegistry.ObjectHolder("strangefuelsmod:gensokyoforest")
	public static final BiomeGenCustom biome = null;
	public BiomeGensokyoforest(ElementsStrangeFuelsMod instance) {
		super(instance, 352);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Gensokyoforest").setRainfall(0.4F).setBaseHeight(0.2F).setHeightVariation(0.9F).setTemperature(0.55F));
			setRegistryName("gensokyoforest");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = Blocks.DIRT.getStateFromMeta(0);
			decorator.generateFalls = true;
			decorator.treesPerChunk = 16;
			decorator.flowersPerChunk = 6;
			decorator.grassPerChunk = 16;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 4;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 2;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityHxxsw.EntityCustom.class, 40, 1, 5));
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return BIG_TREE_FEATURE;
		}
	}
}
