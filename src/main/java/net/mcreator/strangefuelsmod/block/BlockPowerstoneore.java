
package net.mcreator.strangefuelsmod.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.NonNullList;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.strangefuelsmod.world.WorldHuangdanzhidiweidu;
import net.mcreator.strangefuelsmod.item.ItemPowerstone;
import net.mcreator.strangefuelsmod.creativetab.TabStrangeFuelsMod;
import net.mcreator.strangefuelsmod.ElementsStrangeFuelsMod;

import java.util.Random;
import java.util.List;

@ElementsStrangeFuelsMod.ModElement.Tag
public class BlockPowerstoneore extends ElementsStrangeFuelsMod.ModElement {
	@GameRegistry.ObjectHolder("strangefuelsmod:powerstoneore")
	public static final Block block = null;
	public BlockPowerstoneore(ElementsStrangeFuelsMod instance) {
		super(instance, 328);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("powerstoneore"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("strangefuelsmod:powerstoneore", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if (dimID == WorldHuangdanzhidiweidu.DIMID)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;
		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX, 128, chunkZ));
		if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("strangefuelsmod:huangdanzhidiqunxi")))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
		for (int i = 0; i < 16; i++) {
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(43) + 5;
			int z = chunkZ + random.nextInt(16);
			(new WorldGenMinable(block.getDefaultState(), 8, new com.google.common.base.Predicate<IBlockState>() {
				public boolean apply(IBlockState blockAt) {
					boolean blockCriteria = false;
					IBlockState require;
					if (blockAt.getBlock() == Blocks.EMERALD_BLOCK.getDefaultState().getBlock())
						blockCriteria = true;
					if (blockAt.getBlock() == Blocks.BEDROCK.getDefaultState().getBlock())
						blockCriteria = true;
					if (blockAt.getBlock() == Blocks.EMERALD_ORE.getDefaultState().getBlock())
						blockCriteria = true;
					if (blockAt.getBlock() == Blocks.REDSTONE_BLOCK.getDefaultState().getBlock())
						blockCriteria = true;
					if (blockAt.getBlock() == Blocks.REDSTONE_BLOCK.getDefaultState().getBlock())
						blockCriteria = true;
					return blockCriteria;
				}
			})).generate(world, random, new BlockPos(x, y, z));
		}
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("powerstoneore");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 3);
			setHardness(1.8F);
			setResistance(10F);
			setLightLevel(0.4F);
			setLightOpacity(255);
			setCreativeTab(TabStrangeFuelsMod.tab);
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("\u70AB\u5F69\u7684\u5B9D\u77F3\u539F\u77FF");
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(ItemPowerstone.block, (int) (3)));
		}
	}
}
