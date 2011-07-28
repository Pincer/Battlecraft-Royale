package net.minecraft.src;

import java.util.Random;

public class WorldGenTreasure extends WorldGenerator {

	public WorldGenTreasure()
    {
    }

    public boolean generate(World world, Random random, int i, int j, int k)
    {
        for(int l = 0; l < 16; l++)
        {
            int i1 = (i + random.nextInt(8)) - random.nextInt(8);
            int j1 = (j + random.nextInt(4)) - random.nextInt(4);
            int k1 = (k + random.nextInt(8)) - random.nextInt(8);
            if(world.isAirBlock(i1, j1, k1) && (world.getBlockId(i1, j1 - 1, k1) == Block.grass.blockID || world.getBlockId(i1, j1 - 1, k1) == Block.snow.blockID || world.getBlockId(i1, j1 - 1, k1) == Block.sand.blockID) && Block.chest.canPlaceBlockAt(world, i1, j1, k1))
            {
                world.setBlockAndMetadata(i1, j1, k1, Block.chest.blockID, random.nextInt(4));
            }
        }

        return true;
    }

}
