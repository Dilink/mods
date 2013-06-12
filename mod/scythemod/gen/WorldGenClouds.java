package scythemod.gen;
import java.util.Random;

import scythemod.BaseScytheFile;


import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenClouds extends WorldGenerator
{

	public WorldGenClouds()
	{
	}


	public boolean generate(World world, Random random, int i, int j, int k) // x y z
	{
		int hight = random.nextInt(1000);
		int cloud = BaseScytheFile.Cloud.blockID;
		int spawner = BaseScytheFile.Angel.blockID;
		if(world.provider.dimensionId == 0){

			//CLOUD 1 
			if ( hight <= 250)
			{
				// first layer
				world.setBlockMetadataWithNotify(i, j, k, cloud,0);
				world.setBlockMetadataWithNotify(i, j, k+1, cloud,0);
				//second layer
				world.setBlockMetadataWithNotify(i, j+1, k, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+1, k, cloud,0);
				world.setBlockMetadataWithNotify(i+2, j+1, k, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+1, k, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j+1, k, cloud,0);
				world.setBlockMetadataWithNotify(i, j+1, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i, j+1, k-2, cloud,0);
				world.setBlockMetadataWithNotify(i, j+1, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i, j+1, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i, j+1, k-2, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+1, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+1, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+1, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+1, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+1, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+1, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j+1, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i+2, j+1, k+1, cloud,0);
				//third layer
				world.setBlockMetadataWithNotify(i, j+2, k, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+2, k, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+2, k, cloud,0);
				world.setBlockMetadataWithNotify(i, j+2, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i, j+2, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i, j+2, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+2, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+2, k+1, cloud,0);
				//final layer
				world.setBlockMetadataWithNotify(i, j-2, k, cloud,0);
				world.setBlockMetadataWithNotify(i, j-2, k+1, cloud,0);
				//world.setBlock(i, j, k+1, cloud,0, 1);
			}
			//ALTERNATIVE OF CLOUD 1
			if ( hight > 250 && hight <= 500)
			{
				// first layer
				world.setBlockMetadataWithNotify(i, j, k, 0,0);
				//second layer
				world.setBlockMetadataWithNotify(i, j+1, k, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+1, k, cloud,0);
				world.setBlockMetadataWithNotify(i+2, j+1, k, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+1, k, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j+1, k, cloud,0);
				world.setBlockMetadataWithNotify(i, j+1, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i, j+1, k-2, cloud,0);
				world.setBlockMetadataWithNotify(i, j+1, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i, j+1, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i, j+1, k-2, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+1, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+1, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+1, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+1, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+1, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+1, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j+1, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i+2, j+1, k+1, cloud,0);
				//third layer
				world.setBlockMetadataWithNotify(i, j+2, k, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+2, k, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+2, k, cloud,0);
				world.setBlockMetadataWithNotify(i, j+2, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i, j+2, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i, j+2, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j+2, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j+2, k+1, cloud,0);
			}
			//FLAT CLOUD
			if(hight > 500 && hight <= 600)
			{
				world.setBlockMetadataWithNotify(i, j, k, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j, k, cloud,0);
				world.setBlockMetadataWithNotify(i+2, j, k, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j, k, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j, k, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j, k, cloud,0);
				world.setBlockMetadataWithNotify(i-3, j, k, cloud,0);
				world.setBlockMetadataWithNotify(i, j, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i+2, j, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i-3, j, k+1, cloud,0);
				world.setBlockMetadataWithNotify(i, j, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i+2, j, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i-3, j, k-1, cloud,0);
				world.setBlockMetadataWithNotify(i, j, k-2, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j, k-2, cloud,0);
				world.setBlockMetadataWithNotify(i+2, j, k-2, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j, k-2, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j, k-2, cloud,0);
				world.setBlockMetadataWithNotify(i, j, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i-1, j, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i-2, j, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i+1, j, k+2, cloud,0);
				world.setBlockMetadataWithNotify(i+2, j, k+2, cloud,0);

			}

			// CASTLE !!
			if(hight > 600 && hight <= 605)
			{
				world.setBlock(i , j , k , 0);
				world.setBlock(i + 0, j + 0, k + 11, cloud);
				world.setBlock(i + 1, j + 0, k + 10, cloud);
				world.setBlock(i + 1, j + 0, k + 11, cloud);
				world.setBlock(i + 1, j + 0, k + 12, cloud);
				world.setBlock(i + 2, j + 0, k + 12, cloud);
				world.setBlock(i + 3, j + 0, k + 8, cloud);
				world.setBlock(i + 3, j + 0, k + 15, cloud);
				world.setBlock(i + 4, j + 0, k + 7,cloud);
				world.setBlock(i + 4, j + 0, k + 8,cloud);
				world.setBlock(i + 4, j + 0, k + 9,cloud);
				world.setBlock(i + 4, j + 0, k + 13,cloud);
				world.setBlock(i + 4, j + 0, k + 14,cloud);
				world.setBlock(i + 4, j + 0, k + 15,cloud);
				world.setBlock(i + 4, j + 0, k + 19,cloud);
				world.setBlock(i + 5, j + 0, k + 6,cloud);
				world.setBlock(i + 5, j + 0, k + 7,cloud);
				world.setBlock(i + 5, j + 0, k + 8,cloud);
				world.setBlock(i + 5, j + 0, k + 9,cloud);
				world.setBlock(i + 5, j + 0, k + 10,cloud);
				world.setBlock(i + 5, j + 0, k + 11,cloud);
				world.setBlock(i + 5, j + 0, k + 12,cloud);
				world.setBlock(i + 5, j + 0, k + 13,cloud);
				world.setBlock(i + 5, j + 0, k + 14,cloud);
				world.setBlock(i + 5, j + 0, k + 15,cloud);
				world.setBlock(i + 5, j + 0, k + 16,cloud);
				world.setBlock(i + 5, j + 0, k + 17,cloud);
				world.setBlock(i + 5, j + 0, k + 18,cloud);
				world.setBlock(i + 6, j + 0, k + 5,cloud);
				world.setBlock(i + 6, j + 0, k + 6,cloud);
				world.setBlock(i + 6, j + 0, k + 7,cloud);
				world.setBlock(i + 6, j + 0, k + 8,cloud);
				world.setBlock(i + 6, j + 0, k + 9,cloud);
				world.setBlock(i + 6, j + 0, k + 10,cloud);
				world.setBlock(i + 6, j + 0, k + 11,cloud);
				world.setBlock(i + 6, j + 0, k + 12,cloud);
				world.setBlock(i + 6, j + 0, k + 13,cloud);
				world.setBlock(i + 6, j + 0, k + 14,cloud);
				world.setBlock(i + 6, j + 0, k + 15,cloud);
				world.setBlock(i + 6, j + 0, k + 16,cloud);
				world.setBlock(i + 6, j + 0, k + 17,cloud);
				world.setBlock(i + 6, j + 1, k + 7,cloud);
				world.setBlock(i + 6, j + 1, k + 14,cloud);
				world.setBlock(i + 7, j + 0, k + 5,cloud);
				world.setBlock(i + 7, j + 0, k + 6,cloud);
				world.setBlock(i + 7, j + 0, k + 7,cloud);
				world.setBlock(i + 7, j + 0, k + 8,cloud);
				world.setBlock(i + 7, j + 0, k + 9,cloud);
				world.setBlock(i + 7, j + 0, k + 10,cloud);
				world.setBlock(i + 7, j + 0, k + 11,cloud);
				world.setBlock(i + 7, j + 0, k + 12,cloud);
				world.setBlock(i + 7, j + 0, k + 13,cloud);
				world.setBlock(i + 7, j + 0, k + 14,cloud);
				world.setBlock(i + 7, j + 0, k + 15,cloud);
				world.setBlock(i + 7, j + 0, k + 16,cloud);
				world.setBlock(i + 7, j + 0, k + 17,cloud);
				world.setBlock(i + 7, j + 0, k + 18,cloud);
				world.setBlock(i + 7, j + 1, k + 6,cloud);
				world.setBlock(i + 7, j + 1, k + 7,cloud);
				world.setBlock(i + 7, j + 1, k + 8,cloud);
				world.setBlock(i + 7, j + 1, k + 9,cloud);
				world.setBlock(i + 7, j + 1, k + 13,cloud);
				world.setBlock(i + 7, j + 1, k + 14,cloud);
				world.setBlock(i + 7, j + 1, k + 15,cloud);
				world.setBlock(i + 7, j + 1, k + 16,cloud);
				world.setBlock(i + 7, j + 2, k + 7,cloud);
				world.setBlock(i + 7, j + 2, k + 8,cloud);
				world.setBlock(i + 7, j + 2, k + 9,cloud);
				world.setBlock(i + 7, j + 2, k + 13,cloud);
				world.setBlock(i + 7, j + 2, k + 14,cloud);
				world.setBlock(i + 7, j + 2, k + 15,cloud);
				world.setBlock(i + 7, j + 3, k + 7,cloud);
				world.setBlock(i + 7, j + 3, k + 8,cloud);
				world.setBlock(i + 7, j + 3, k + 9,cloud);
				world.setBlock(i + 7, j + 3, k + 10,cloud);
				world.setBlock(i + 7, j + 3, k + 12,cloud);
				world.setBlock(i + 7, j + 3, k + 13,cloud);
				world.setBlock(i + 7, j + 3, k + 14,cloud);
				world.setBlock(i + 7, j + 3, k + 15,cloud);
				world.setBlock(i + 7, j + 4, k + 7,cloud);
				world.setBlock(i + 7, j + 4, k + 8,cloud);
				world.setBlock(i + 7, j + 4, k + 9,cloud);
				world.setBlock(i + 7, j + 4, k + 10,cloud);
				world.setBlock(i + 7, j + 4, k + 11,cloud);
				world.setBlock(i + 7, j + 4, k + 12,cloud);
				world.setBlock(i + 7, j + 4, k + 13,cloud);
				world.setBlock(i + 7, j + 4, k + 14,cloud);
				world.setBlock(i + 7, j + 4, k + 15,cloud);
				world.setBlock(i + 7, j + 5, k + 7,cloud);
				world.setBlock(i + 7, j + 5, k + 8,cloud);
				world.setBlock(i + 7, j + 5, k + 9,cloud);
				world.setBlock(i + 7, j + 5, k + 10,cloud);
				world.setBlock(i + 7, j + 5, k + 11,cloud);
				world.setBlock(i + 7, j + 5, k + 12,cloud);
				world.setBlock(i + 7, j + 5, k + 13,cloud);
				world.setBlock(i + 7, j + 5, k + 14,cloud);
				world.setBlock(i + 7, j + 5, k + 15,cloud);
				world.setBlock(i + 7, j + 6, k + 7,cloud);
				world.setBlock(i + 7, j + 6, k + 9,cloud);
				world.setBlock(i + 7, j + 6, k + 11,cloud);
				world.setBlock(i + 7, j + 6, k + 13,cloud);
				world.setBlock(i + 7, j + 6, k + 15,cloud);
				world.setBlock(i + 8, j + 0, k + 4,cloud);
				world.setBlock(i + 8, j + 0, k + 5,cloud);
				world.setBlock(i + 8, j + 0, k + 6,cloud);
				world.setBlock(i + 8, j + 0, k + 7,cloud);
				world.setBlock(i + 8, j + 0, k + 8,cloud);
				world.setBlock(i + 8, j + 0, k + 9,cloud);
				world.setBlock(i + 8, j + 0, k + 10,cloud);
				world.setBlock(i + 8, j + 0, k + 11,cloud);
				world.setBlock(i + 8, j + 0, k + 12,cloud);
				world.setBlock(i + 8, j + 0, k + 13,cloud);
				world.setBlock(i + 8, j + 0, k + 14,cloud);
				world.setBlock(i + 8, j + 0, k + 15,cloud);
				world.setBlock(i + 8, j + 0, k + 16,cloud);
				world.setBlock(i + 8, j + 0, k + 17,cloud);
				world.setBlock(i + 8, j + 0, k + 18,cloud);
				world.setBlock(i + 8, j + 0, k + 19,cloud);
				world.setBlock(i + 8, j + 0, k + 21,cloud);
				world.setBlock(i + 8, j + 1, k + 7,cloud);
				world.setBlock(i + 8, j + 1, k + 15,cloud);
				world.setBlock(i + 8, j + 1, k + 16,cloud);
				world.setBlock(i + 8, j + 2, k + 7,cloud);
				world.setBlock(i + 8, j + 2, k + 15,cloud);
				world.setBlock(i + 8, j + 3, k + 7,cloud);
				world.setBlock(i + 8, j + 3, k + 15,cloud);
				world.setBlock(i + 8, j + 4, k + 7,cloud);
				world.setBlock(i + 8, j + 4, k + 15,cloud);
				world.setBlock(i + 8, j + 5, k + 7,cloud);
				world.setBlock(i + 8, j + 5, k + 8,cloud);
				world.setBlock(i + 8, j + 5, k + 9,cloud);
				world.setBlock(i + 8, j + 5, k + 10,cloud);
				world.setBlock(i + 8, j + 5, k + 11,cloud);
				world.setBlock(i + 8, j + 5, k + 12,cloud);
				world.setBlock(i + 8, j + 5, k + 13,cloud);
				world.setBlock(i + 8, j + 5, k + 14,cloud);
				world.setBlock(i + 8, j + 5, k + 15,cloud);
				world.setBlock(i + 9, j + 0, k + 3,cloud);
				world.setBlock(i + 9, j + 0, k + 4,cloud);
				world.setBlock(i + 9, j + 0, k + 5,cloud);
				world.setBlock(i + 9, j + 0, k + 6,cloud);
				world.setBlock(i + 9, j + 0, k + 7,cloud);
				world.setBlock(i + 9, j + 0, k + 8,cloud);
				world.setBlock(i + 9, j + 0, k + 9,cloud);
				world.setBlock(i + 9, j + 0, k + 10,cloud);
				world.setBlock(i + 9, j + 0, k + 11,cloud);
				world.setBlock(i + 9, j + 0, k + 12,cloud);
				world.setBlock(i + 9, j + 0, k + 13,cloud);
				world.setBlock(i + 9, j + 0, k + 14,cloud);
				world.setBlock(i + 9, j + 0, k + 15,cloud);
				world.setBlock(i + 9, j + 0, k + 16,cloud);
				world.setBlock(i + 9, j + 0, k + 17,cloud);
				world.setBlock(i + 9, j + 0, k + 18,cloud);
				world.setBlock(i + 9, j + 0, k + 21,cloud);
				world.setBlock(i + 9, j + 0, k + 22,cloud);
				world.setBlock(i + 9, j + 1, k + 6,cloud);
				world.setBlock(i + 9, j + 1, k + 7,cloud);
				world.setBlock(i + 9, j + 1, k + 15,cloud);
				world.setBlock(i + 9, j + 1, k + 16,cloud);
				world.setBlock(i + 9, j + 1, k + 17,cloud);
				world.setBlock(i + 9, j + 2, k + 7,cloud);
				world.setBlock(i + 9, j + 2, k + 15,cloud);
				world.setBlock(i + 9, j + 2, k + 16,cloud);
				world.setBlock(i + 9, j + 3, k + 7,cloud);
				world.setBlock(i + 9, j + 3, k + 15,cloud);
				world.setBlock(i + 9, j + 4, k + 7,cloud);
				world.setBlock(i + 9, j + 4, k + 15,cloud);
				world.setBlock(i + 9, j + 5, k + 7,cloud);
				world.setBlock(i + 9, j + 5, k + 8,cloud);
				world.setBlock(i + 9, j + 5, k + 9,cloud);
				world.setBlock(i + 9, j + 5, k + 10,cloud);
				world.setBlock(i + 9, j + 5, k + 11,cloud);
				world.setBlock(i + 9, j + 5, k + 12,cloud);
				world.setBlock(i + 9, j + 5, k + 13,cloud);
				world.setBlock(i + 9, j + 5, k + 14,cloud);
				world.setBlock(i + 9, j + 5, k + 15,cloud);
				world.setBlock(i + 9, j + 6, k + 7,cloud);
				world.setBlock(i + 9, j + 6, k + 15,cloud);
				world.setBlock(i + 10, j + 0, k + 4,cloud);
				world.setBlock(i + 10, j + 0, k + 5,cloud);
				world.setBlock(i + 10, j + 0, k + 6,cloud);
				world.setBlock(i + 10, j + 0, k + 7,cloud);
				world.setBlock(i + 10, j + 0, k + 8,cloud);
				world.setBlock(i + 10, j + 0, k + 9,cloud);
				world.setBlock(i + 10, j + 0, k + 10,cloud);
				world.setBlock(i + 10, j + 0, k + 11,cloud);
				world.setBlock(i + 10, j + 0, k + 12,cloud);
				world.setBlock(i + 10, j + 0, k + 13,cloud);
				world.setBlock(i + 10, j + 0, k + 14,cloud);
				world.setBlock(i + 10, j + 0, k + 15,cloud);
				world.setBlock(i + 10, j + 0, k + 16,cloud);
				world.setBlock(i + 10, j + 0, k + 17,cloud);
				world.setBlock(i + 10, j + 0, k + 18,cloud);
				world.setBlock(i + 10, j + 0, k + 21,cloud);
				world.setBlock(i + 10, j + 1, k + 6,cloud);
				world.setBlock(i + 10, j + 1, k + 7,cloud);
				world.setBlock(i + 10, j + 1, k + 15,cloud);
				world.setBlock(i + 10, j + 1, k + 16,cloud);
				world.setBlock(i + 10, j + 2, k + 7,cloud);
				world.setBlock(i + 10, j + 2, k + 15,cloud);
				world.setBlock(i + 10, j + 2, k + 16,cloud);
				world.setBlock(i + 10, j + 3, k + 7,cloud);
				world.setBlock(i + 10, j + 3, k + 15,cloud);
				world.setBlock(i + 10, j + 4, k + 7,cloud);
				world.setBlock(i + 10, j + 4, k + 15,cloud);
				world.setBlock(i + 10, j + 5, k + 7,cloud);
				world.setBlock(i + 10, j + 5, k + 8,cloud);
				world.setBlock(i + 10, j + 5, k + 9,cloud);
				world.setBlock(i + 10, j + 5, k + 10,cloud);
				world.setBlock(i + 10, j + 5, k + 11,cloud);
				world.setBlock(i + 10, j + 5, k + 12,cloud);
				world.setBlock(i + 10, j + 5, k + 13,cloud);
				world.setBlock(i + 10, j + 5, k + 14,cloud);
				world.setBlock(i + 10, j + 5, k + 15,cloud);
				world.setBlock(i + 11, j + 0, k + 1,cloud);
				world.setBlock(i + 11, j + 0, k + 5,cloud);
				world.setBlock(i + 11, j + 0, k + 6,cloud);
				world.setBlock(i + 11, j + 0, k + 7,cloud);
				world.setBlock(i + 11, j + 0, k + 8,cloud);
				world.setBlock(i + 11, j + 0, k + 9,cloud);
				world.setBlock(i + 11, j + 0, k + 10,cloud);
				world.setBlock(i + 11, j + 0, k + 11,cloud);
				world.setBlock(i + 11, j + 0, k + 12,cloud);
				world.setBlock(i + 11, j + 0, k + 13,cloud);
				world.setBlock(i + 11, j + 0, k + 14,cloud);
				world.setBlock(i + 11, j + 0, k + 15,cloud);
				world.setBlock(i + 11, j + 0, k + 16,cloud);
				world.setBlock(i + 11, j + 0, k + 17,cloud);
				world.setBlock(i + 11, j + 1, k + 7,cloud);
				world.setBlock(i + 11, j + 1, k + 15,cloud);
				world.setBlock(i + 11, j + 1, k + 16,cloud);
				world.setBlock(i + 11, j + 2, k + 7,cloud);
				world.setBlock(i + 11, j + 2, k + 15,cloud);
				world.setBlock(i + 11, j + 3, k + 7,cloud);
				world.setBlock(i + 11, j + 3, k + 15,cloud);
				world.setBlock(i + 11, j + 4, k + 7,cloud);
				world.setBlock(i + 11, j + 4, k + 15,cloud);
				world.setBlock(i + 11, j + 5, k + 7,cloud);
				world.setBlock(i + 11, j + 5, k + 8,cloud);
				world.setBlock(i + 11, j + 5, k + 9,cloud);
				world.setBlock(i + 11, j + 5, k + 10,cloud);
				world.setBlock(i + 11, j + 5, k + 11,cloud);
				world.setBlock(i + 11, j + 5, k + 12,cloud);
				world.setBlock(i + 11, j + 5, k + 13,cloud);
				world.setBlock(i + 11, j + 5, k + 14,cloud);
				world.setBlock(i + 11, j + 5, k + 15,cloud);
				world.setBlock(i + 11, j + 6, k + 7,cloud);
				world.setBlock(i + 11, j + 6, k + 15,cloud);
				world.setBlock(i + 12, j + 0, k + 1,cloud);
				world.setBlock(i + 12, j + 0, k + 6,cloud);
				world.setBlock(i + 12, j + 0, k + 7,cloud);
				world.setBlock(i + 12, j + 0, k + 8,cloud);
				world.setBlock(i + 12, j + 0, k + 9,cloud);
				world.setBlock(i + 12, j + 0, k + 10,cloud);
				world.setBlock(i + 12, j + 0, k + 11,cloud);
				world.setBlock(i + 12, j + 0, k + 12,cloud);
				world.setBlock(i + 12, j + 0, k + 13,cloud);
				world.setBlock(i + 12, j + 0, k + 14,cloud);
				world.setBlock(i + 12, j + 0, k + 15,cloud);
				world.setBlock(i + 12, j + 0, k + 16,cloud);
				world.setBlock(i + 12, j + 0, k + 17,cloud);
				world.setBlock(i + 12, j + 0, k + 19,cloud);
				world.setBlock(i + 12, j + 1, k + 7,cloud);
				world.setBlock(i + 12, j + 1, k + 15,cloud);
				world.setBlock(i + 12, j + 1, k + 16,cloud);
				world.setBlock(i + 12, j + 2, k + 7,cloud);
				world.setBlock(i + 12, j + 2, k + 15,cloud);
				world.setBlock(i + 12, j + 3, k + 7,cloud);
				world.setBlock(i + 12, j + 3, k + 15,cloud);
				world.setBlock(i + 12, j + 4, k + 7,cloud);
				world.setBlock(i + 12, j + 4, k + 15,cloud);
				world.setBlock(i + 12, j + 5, k + 7,cloud);
				world.setBlock(i + 12, j + 5, k + 8,cloud);
				world.setBlock(i + 12, j + 5, k + 9,cloud);
				world.setBlock(i + 12, j + 5, k + 10,cloud);
				world.setBlock(i + 12, j + 5, k + 11,cloud);
				world.setBlock(i + 12, j + 5, k + 12,cloud);
				world.setBlock(i + 12, j + 5, k + 13,cloud);
				world.setBlock(i + 12, j + 5, k + 14,cloud);
				world.setBlock(i + 12, j + 5, k + 15,cloud);
				world.setBlock(i + 13, j + 0, k + 0,cloud);
				world.setBlock(i + 13, j + 0, k + 5,cloud);
				world.setBlock(i + 13, j + 0, k + 6,cloud);
				world.setBlock(i + 13, j + 0, k + 7,cloud);
				world.setBlock(i + 13, j + 0, k + 8,cloud);
				world.setBlock(i + 13, j + 0, k + 9,cloud);
				world.setBlock(i + 13, j + 0, k + 10,cloud);
				world.setBlock(i + 13, j + 0, k + 11, spawner);
				world.setBlock(i + 13, j + 0, k + 12,cloud);
				world.setBlock(i + 13, j + 0, k + 13,cloud);
				world.setBlock(i + 13, j + 0, k + 14,cloud);
				world.setBlock(i + 13, j + 0, k + 15,cloud);
				world.setBlock(i + 13, j + 0, k + 16,cloud);
				world.setBlock(i + 13, j + 0, k + 17,cloud);
				world.setBlock(i + 13, j + 0, k + 19,cloud);
				world.setBlock(i + 13, j + 1, k + 7,cloud);
				world.setBlock(i + 13, j + 1, k + 15,cloud);
				world.setBlock(i + 13, j + 2, k + 7,cloud);
				world.setBlock(i + 13, j + 2, k + 15,cloud);
				world.setBlock(i + 13, j + 3, k + 7,cloud);
				world.setBlock(i + 13, j + 3, k + 15,cloud);
				world.setBlock(i + 13, j + 4, k + 7,cloud);
				world.setBlock(i + 13, j + 4, k + 15,cloud);
				world.setBlock(i + 13, j + 5, k + 7,cloud);
				world.setBlock(i + 13, j + 5, k + 8,cloud);
				world.setBlock(i + 13, j + 5, k + 9,cloud);
				world.setBlock(i + 13, j + 5, k + 10,cloud);
				world.setBlock(i + 13, j + 5, k + 11,cloud);
				world.setBlock(i + 13, j + 5, k + 12,cloud);
				world.setBlock(i + 13, j + 5, k + 13,cloud);
				world.setBlock(i + 13, j + 5, k + 14,cloud);
				world.setBlock(i + 13, j + 5, k + 15,cloud);
				world.setBlock(i + 13, j + 6, k + 7,cloud);
				world.setBlock(i + 13, j + 6, k + 15,cloud);
				world.setBlock(i + 13, j + 10, k + 11,cloud);
				world.setBlock(i + 14, j + 0, k + 4,cloud);
				world.setBlock(i + 14, j + 0, k + 5,cloud);
				world.setBlock(i + 14, j + 0, k + 6,cloud);
				world.setBlock(i + 14, j + 0, k + 7,cloud);
				world.setBlock(i + 14, j + 0, k + 8,cloud);
				world.setBlock(i + 14, j + 0, k + 9,cloud);
				world.setBlock(i + 14, j + 0, k + 10,cloud);
				world.setBlock(i + 14, j + 0, k + 11,cloud);
				world.setBlock(i + 14, j + 0, k + 12,cloud);
				world.setBlock(i + 14, j + 0, k + 13,cloud);
				world.setBlock(i + 14, j + 0, k + 14,cloud);
				world.setBlock(i + 14, j + 0, k + 15,cloud);
				world.setBlock(i + 14, j + 0, k + 16,cloud);
				world.setBlock(i + 14, j + 0, k + 17,cloud);
				world.setBlock(i + 14, j + 0, k + 20,cloud);
				world.setBlock(i + 14, j + 1, k + 6,cloud);
				world.setBlock(i + 14, j + 1, k + 7,cloud);
				world.setBlock(i + 14, j + 1, k + 15,cloud);
				world.setBlock(i + 14, j + 2, k + 7,cloud);
				world.setBlock(i + 14, j + 2, k + 15,cloud);
				world.setBlock(i + 14, j + 3, k + 7,cloud);
				world.setBlock(i + 14, j + 3, k + 15,cloud);
				world.setBlock(i + 14, j + 4, k + 7,cloud);
				world.setBlock(i + 14, j + 4, k + 15,cloud);
				world.setBlock(i + 14, j + 5, k + 7,cloud);
				world.setBlock(i + 14, j + 5, k + 8,cloud);
				world.setBlock(i + 14, j + 5, k + 9,cloud);
				world.setBlock(i + 14, j + 5, k + 10,cloud);
				world.setBlock(i + 14, j + 5, k + 11,cloud);
				world.setBlock(i + 14, j + 5, k + 12,cloud);
				world.setBlock(i + 14, j + 5, k + 13,cloud);
				world.setBlock(i + 14, j + 5, k + 14,cloud);
				world.setBlock(i + 14, j + 5, k + 15,cloud);
				world.setBlock(i + 14, j + 10, k + 11,cloud);
				world.setBlock(i + 14, j + 10, k + 12,cloud);
				world.setBlock(i + 14, j + 10, k + 13,cloud);
				world.setBlock(i + 14, j + 11, k + 11,cloud);
				world.setBlock(i + 15, j + 0, k + 3,cloud);
				world.setBlock(i + 15, j + 0, k + 4,cloud);
				world.setBlock(i + 15, j + 0, k + 5,cloud);
				world.setBlock(i + 15, j + 0, k + 6,cloud);
				world.setBlock(i + 15, j + 0, k + 7,cloud);
				world.setBlock(i + 15, j + 0, k + 8,cloud);
				world.setBlock(i + 15, j + 0, k + 9,cloud);
				world.setBlock(i + 15, j + 0, k + 10,cloud);
				world.setBlock(i + 15, j + 0, k + 11,cloud);
				world.setBlock(i + 15, j + 0, k + 12,cloud);
				world.setBlock(i + 15, j + 0, k + 13,cloud);
				world.setBlock(i + 15, j + 0, k + 14,cloud);
				world.setBlock(i + 15, j + 0, k + 15,cloud);
				world.setBlock(i + 15, j + 0, k + 16,cloud);
				world.setBlock(i + 15, j + 0, k + 17,cloud);
				world.setBlock(i + 15, j + 1, k + 6,cloud);
				world.setBlock(i + 15, j + 1, k + 7,cloud);
				world.setBlock(i + 15, j + 1, k + 15,cloud);
				world.setBlock(i + 15, j + 2, k + 6,cloud);
				world.setBlock(i + 15, j + 2, k + 7,cloud);
				world.setBlock(i + 15, j + 2, k + 15,cloud);
				world.setBlock(i + 15, j + 3, k + 7,cloud);
				world.setBlock(i + 15, j + 3, k + 15,cloud);
				world.setBlock(i + 15, j + 4, k + 7,cloud);
				world.setBlock(i + 15, j + 4, k + 15,cloud);
				world.setBlock(i + 15, j + 5, k + 7,cloud);
				world.setBlock(i + 15, j + 5, k + 8,cloud);
				world.setBlock(i + 15, j + 5, k + 9,cloud);
				world.setBlock(i + 15, j + 5, k + 10,cloud);
				world.setBlock(i + 15, j + 5, k + 11,cloud);
				world.setBlock(i + 15, j + 5, k + 12,cloud);
				world.setBlock(i + 15, j + 5, k + 13,cloud);
				world.setBlock(i + 15, j + 5, k + 14,cloud);
				world.setBlock(i + 15, j + 5, k + 15,cloud);
				world.setBlock(i + 15, j + 6, k + 7,cloud);
				world.setBlock(i + 15, j + 6, k + 15,cloud);
				world.setBlock(i + 15, j + 10, k + 11,cloud);
				world.setBlock(i + 15, j + 10, k + 12,cloud);
				world.setBlock(i + 16, j + 0, k + 4,cloud);
				world.setBlock(i + 16, j + 0, k + 5,cloud);
				world.setBlock(i + 16, j + 0, k + 6,cloud);
				world.setBlock(i + 16, j + 0, k + 7,cloud);
				world.setBlock(i + 16, j + 0, k + 8,cloud);
				world.setBlock(i + 16, j + 0, k + 9,cloud);
				world.setBlock(i + 16, j + 0, k + 10,cloud);
				world.setBlock(i + 16, j + 0, k + 11,cloud);
				world.setBlock(i + 16, j + 0, k + 12,cloud);
				world.setBlock(i + 16, j + 0, k + 13,cloud);
				world.setBlock(i + 16, j + 0, k + 14,cloud);
				world.setBlock(i + 16, j + 0, k + 15,cloud);
				world.setBlock(i + 16, j + 0, k + 16,cloud);
				world.setBlock(i + 16, j + 0, k + 17,cloud);
				world.setBlock(i + 16, j + 0, k + 18,cloud);
				world.setBlock(i + 16, j + 1, k + 6,cloud);
				world.setBlock(i + 16, j + 1, k + 7,cloud);
				world.setBlock(i + 16, j + 1, k + 15,cloud);
				world.setBlock(i + 16, j + 2, k + 7,cloud);
				world.setBlock(i + 16, j + 2, k + 15,cloud);
				world.setBlock(i + 16, j + 3, k + 7,cloud);
				world.setBlock(i + 16, j + 3, k + 15,cloud);
				world.setBlock(i + 16, j + 4, k + 7,cloud);
				world.setBlock(i + 16, j + 4, k + 15,cloud);
				world.setBlock(i + 16, j + 5, k + 7,cloud);
				world.setBlock(i + 16, j + 5, k + 8,cloud);
				world.setBlock(i + 16, j + 5, k + 9,cloud);
				world.setBlock(i + 16, j + 5, k + 10,cloud);
				world.setBlock(i + 16, j + 5, k + 11,cloud);
				world.setBlock(i + 16, j + 5, k + 12,cloud);
				world.setBlock(i + 16, j + 5, k + 13,cloud);
				world.setBlock(i + 16, j + 5, k + 14,cloud);
				world.setBlock(i + 16, j + 5, k + 15,cloud);
				world.setBlock(i + 16, j + 10, k + 10,cloud);
				world.setBlock(i + 17, j + 0, k + 4,cloud);
				world.setBlock(i + 17, j + 0, k + 5,cloud);
				world.setBlock(i + 17, j + 0, k + 6,cloud);
				world.setBlock(i + 17, j + 0, k + 7,cloud);
				world.setBlock(i + 17, j + 0, k + 8,cloud);
				world.setBlock(i + 17, j + 0, k + 9,cloud);
				world.setBlock(i + 17, j + 0, k + 10,cloud);
				world.setBlock(i + 17, j + 0, k + 11,cloud);
				world.setBlock(i + 17, j + 0, k + 12,cloud);
				world.setBlock(i + 17, j + 0, k + 13,cloud);
				world.setBlock(i + 17, j + 0, k + 14,cloud);
				world.setBlock(i + 17, j + 0, k + 15,cloud);
				world.setBlock(i + 17, j + 0, k + 16,cloud);
				world.setBlock(i + 17, j + 0, k + 17,cloud);
				world.setBlock(i + 17, j + 1, k + 7,cloud);
				world.setBlock(i + 17, j + 1, k + 15,cloud);
				world.setBlock(i + 17, j + 1, k + 16,cloud);
				world.setBlock(i + 17, j + 2, k + 7,cloud);
				world.setBlock(i + 17, j + 2, k + 15,cloud);
				world.setBlock(i + 17, j + 3, k + 7,cloud);
				world.setBlock(i + 17, j + 3, k + 15,cloud);
				world.setBlock(i + 17, j + 4, k + 7,cloud);
				world.setBlock(i + 17, j + 4, k + 15,cloud);
				world.setBlock(i + 17, j + 5, k + 7,cloud);
				world.setBlock(i + 17, j + 5, k + 8,cloud);
				world.setBlock(i + 17, j + 5, k + 9,cloud);
				world.setBlock(i + 17, j + 5, k + 10,cloud);
				world.setBlock(i + 17, j + 5, k + 11,cloud);
				world.setBlock(i + 17, j + 5, k + 12,cloud);
				world.setBlock(i + 17, j + 5, k + 13,cloud);
				world.setBlock(i + 17, j + 5, k + 14,cloud);
				world.setBlock(i + 17, j + 5, k + 15,cloud);
				world.setBlock(i + 17, j + 6, k + 7,cloud);
				world.setBlock(i + 17, j + 6, k + 15,cloud);
				world.setBlock(i + 18, j + 0, k + 2,cloud);
				world.setBlock(i + 18, j + 0, k + 3,cloud);
				world.setBlock(i + 18, j + 0, k + 5,cloud);
				world.setBlock(i + 18, j + 0, k + 6,cloud);
				world.setBlock(i + 18, j + 0, k + 7,cloud);
				world.setBlock(i + 18, j + 0, k + 8,cloud);
				world.setBlock(i + 18, j + 0, k + 9,cloud);
				world.setBlock(i + 18, j + 0, k + 10,cloud);
				world.setBlock(i + 18, j + 0, k + 11,cloud);
				world.setBlock(i + 18, j + 0, k + 12,cloud);
				world.setBlock(i + 18, j + 0, k + 13,cloud);
				world.setBlock(i + 18, j + 0, k + 14,cloud);
				world.setBlock(i + 18, j + 0, k + 15,cloud);
				world.setBlock(i + 18, j + 0, k + 16,cloud);
				world.setBlock(i + 18, j + 1, k + 7,cloud);
				world.setBlock(i + 18, j + 1, k + 15,cloud);
				world.setBlock(i + 18, j + 1, k + 16,cloud);
				world.setBlock(i + 18, j + 2, k + 7,cloud);
				world.setBlock(i + 18, j + 2, k + 15,cloud);
				world.setBlock(i + 18, j + 2, k + 16,cloud);
				world.setBlock(i + 18, j + 3, k + 7,cloud);
				world.setBlock(i + 18, j + 3, k + 15,cloud);
				world.setBlock(i + 18, j + 4, k + 7,cloud);
				world.setBlock(i + 18, j + 4, k + 15,cloud);
				world.setBlock(i + 18, j + 5, k + 7,cloud);
				world.setBlock(i + 18, j + 5, k + 8,cloud);
				world.setBlock(i + 18, j + 5, k + 9,cloud);
				world.setBlock(i + 18, j + 5, k + 10,cloud);
				world.setBlock(i + 18, j + 5, k + 11,cloud);
				world.setBlock(i + 18, j + 5, k + 12,cloud);
				world.setBlock(i + 18, j + 5, k + 13,cloud);
				world.setBlock(i + 18, j + 5, k + 14,cloud);
				world.setBlock(i + 18, j + 5, k + 15,cloud);
				world.setBlock(i + 19, j + 0, k + 6,cloud);
				world.setBlock(i + 19, j + 0, k + 7,cloud);
				world.setBlock(i + 19, j + 0, k + 8,cloud);
				world.setBlock(i + 19, j + 0, k + 9,cloud);
				world.setBlock(i + 19, j + 0, k + 10,cloud);
				world.setBlock(i + 19, j + 0, k + 11,cloud);
				world.setBlock(i + 19, j + 0, k + 12,cloud);
				world.setBlock(i + 19, j + 0, k + 13,cloud);
				world.setBlock(i + 19, j + 0, k + 14,cloud);
				world.setBlock(i + 19, j + 0, k + 15,cloud);
				world.setBlock(i + 19, j + 0, k + 16,cloud);
				world.setBlock(i + 19, j + 0, k + 17,cloud);
				world.setBlock(i + 19, j + 1, k + 7,cloud);
				world.setBlock(i + 19, j + 1, k + 8,cloud);
				world.setBlock(i + 19, j + 1, k + 9,cloud);
				world.setBlock(i + 19, j + 1, k + 10,cloud);
				world.setBlock(i + 19, j + 1, k + 11,cloud);
				world.setBlock(i + 19, j + 1, k + 12,cloud);
				world.setBlock(i + 19, j + 1, k + 13,cloud);
				world.setBlock(i + 19, j + 1, k + 14,cloud);
				world.setBlock(i + 19, j + 1, k + 15,cloud);
				world.setBlock(i + 19, j + 1, k + 16,cloud);
				world.setBlock(i + 19, j + 2, k + 7,cloud);
				world.setBlock(i + 19, j + 2, k + 8,cloud);
				world.setBlock(i + 19, j + 2, k + 9,cloud);
				world.setBlock(i + 19, j + 2, k + 10,cloud);
				world.setBlock(i + 19, j + 2, k + 11,cloud);
				world.setBlock(i + 19, j + 2, k + 12,cloud);
				world.setBlock(i + 19, j + 2, k + 13,cloud);
				world.setBlock(i + 19, j + 2, k + 14,cloud);
				world.setBlock(i + 19, j + 2, k + 15,cloud);
				world.setBlock(i + 19, j + 3, k + 7,cloud);
				world.setBlock(i + 19, j + 3, k + 8,cloud);
				world.setBlock(i + 19, j + 3, k + 9,cloud);
				world.setBlock(i + 19, j + 3, k + 10,cloud);
				world.setBlock(i + 19, j + 3, k + 11,cloud);
				world.setBlock(i + 19, j + 3, k + 12,cloud);
				world.setBlock(i + 19, j + 3, k + 13,cloud);
				world.setBlock(i + 19, j + 3, k + 14,cloud);
				world.setBlock(i + 19, j + 3, k + 15,cloud);
				world.setBlock(i + 19, j + 4, k + 7,cloud);
				world.setBlock(i + 19, j + 4, k + 8,cloud);
				world.setBlock(i + 19, j + 4, k + 9,cloud);
				world.setBlock(i + 19, j + 4, k + 10,cloud);
				world.setBlock(i + 19, j + 4, k + 11,cloud);
				world.setBlock(i + 19, j + 4, k + 12,cloud);
				world.setBlock(i + 19, j + 4, k + 13,cloud);
				world.setBlock(i + 19, j + 4, k + 14,cloud);
				world.setBlock(i + 19, j + 4, k + 15,cloud);
				world.setBlock(i + 19, j + 5, k + 7,cloud);
				world.setBlock(i + 19, j + 5, k + 8,cloud);
				world.setBlock(i + 19, j + 5, k + 9,cloud);
				world.setBlock(i + 19, j + 5, k + 10,cloud);
				world.setBlock(i + 19, j + 5, k + 11,cloud);
				world.setBlock(i + 19, j + 5, k + 12,cloud);
				world.setBlock(i + 19, j + 5, k + 13,cloud);
				world.setBlock(i + 19, j + 5, k + 14,cloud);
				world.setBlock(i + 19, j + 5, k + 15,cloud);
				world.setBlock(i + 19, j + 6, k + 7,cloud);
				world.setBlock(i + 19, j + 6, k + 9,cloud);
				world.setBlock(i + 19, j + 6, k + 11,cloud);
				world.setBlock(i + 19, j + 6, k + 13,cloud);
				world.setBlock(i + 19, j + 6, k + 15,cloud);
				world.setBlock(i + 20, j + 0, k + 3,cloud);
				world.setBlock(i + 20, j + 0, k + 6,cloud);
				world.setBlock(i + 20, j + 0, k + 7,cloud);
				world.setBlock(i + 20, j + 0, k + 8,cloud);
				world.setBlock(i + 20, j + 0, k + 9,cloud);
				world.setBlock(i + 20, j + 0, k + 10,cloud);
				world.setBlock(i + 20, j + 0, k + 11,cloud);
				world.setBlock(i + 20, j + 0, k + 12,cloud);
				world.setBlock(i + 20, j + 0, k + 13,cloud);
				world.setBlock(i + 20, j + 0, k + 14,cloud);
				world.setBlock(i + 20, j + 0, k + 15,cloud);
				world.setBlock(i + 20, j + 0, k + 16,cloud);
				world.setBlock(i + 20, j + 0, k + 17,cloud);
				world.setBlock(i + 20, j + 0, k + 22,cloud);
				world.setBlock(i + 20, j + 0, k + 24,cloud);
				world.setBlock(i + 20, j + 1, k + 8,cloud);
				world.setBlock(i + 20, j + 1, k + 9,cloud);
				world.setBlock(i + 20, j + 1, k + 10,cloud);
				world.setBlock(i + 20, j + 1, k + 13,cloud);
				world.setBlock(i + 20, j + 1, k + 15,cloud);
				world.setBlock(i + 20, j + 1, k + 16,cloud);
				world.setBlock(i + 21, j + 0, k + 3,cloud);
				world.setBlock(i + 21, j + 0, k + 4,cloud);
				world.setBlock(i + 21, j + 0, k + 7,cloud);
				world.setBlock(i + 21, j + 0, k + 8,cloud);
				world.setBlock(i + 21, j + 0, k + 9,cloud);
				world.setBlock(i + 21, j + 0, k + 10,cloud);
				world.setBlock(i + 21, j + 0, k + 11,cloud);
				world.setBlock(i + 21, j + 0, k + 12,cloud);
				world.setBlock(i + 21, j + 0, k + 13,cloud);
				world.setBlock(i + 21, j + 0, k + 15,cloud);
				world.setBlock(i + 21, j + 0, k + 16,cloud);
				world.setBlock(i + 21, j + 0, k + 21,cloud);
				world.setBlock(i + 21, j + 0, k + 22,cloud);
				world.setBlock(i + 21, j + 0, k + 23,cloud);
				world.setBlock(i + 21, j + 1, k + 9,cloud);
				world.setBlock(i + 21, j + 1, k + 16,cloud);
				world.setBlock(i + 21, j + 1, k + 22,cloud);
				world.setBlock(i + 22, j + 0, k + 8,cloud);
				world.setBlock(i + 22, j + 0, k + 9,cloud);
				world.setBlock(i + 22, j + 0, k + 12,cloud);
				world.setBlock(i + 22, j + 0, k + 15,cloud);
				world.setBlock(i + 22, j + 0, k + 22,cloud);
				world.setBlock(i + 22, j + 0, k + 23,cloud);
				world.setBlock(i + 23, j + 0, k + 9,cloud);
				world.setBlock(i + 24, j + 0, k + 5,cloud);
				world.setBlock(i + 24, j + 0, k + 6,cloud);
				world.setBlock(i + 25, j + 0, k + 6,cloud);
				world.setBlock(i + 25, j + 0, k + 7,cloud);
				world.setBlock(i + 25, j + 0, k + 12,cloud);
				world.setBlock(i + 25, j + 0, k + 13,cloud);
				world.setBlock(i + 25, j + 0, k + 14,cloud);
				world.setBlock(i + 25, j + 0, k + 15,cloud);
				world.setBlock(i + 25, j + 0, k + 21,cloud);
				world.setBlock(i + 25, j + 1, k + 6,cloud);
				world.setBlock(i + 25, j + 1, k + 13,cloud);
				world.setBlock(i + 26, j + 0, k + 7,cloud);
				world.setBlock(i + 26, j + 0, k + 12,cloud);
				world.setBlock(i + 26, j + 0, k + 14,cloud);
				world.setBlock(i + 26, j + 0, k + 15,cloud);
				world.setBlock(i + 26, j + 1, k + 13,cloud);
				world.setBlock(i + 27, j + 1, k + 14,cloud);
				world.setBlock(i + 28, j + 0, k + 13,cloud);
				world.setBlock(i + 28, j + 0, k + 14,cloud);
				world.setBlock(i + 28, j + 0, k + 15,cloud);
				world.setBlock(i + 28, j + 1, k + 14,cloud);
				world.setBlock(i + 29, j + 0, k + 13,cloud);
			}

			// filler Cloud
			if(hight > 605 && hight <= 999)
			{
				world.setBlock(i + 1, j + 0, k + 1,cloud);
				world.setBlock(i + 1, j + 0, k + 2,cloud);
				world.setBlock(i + 1, j + 1, k + 1,cloud);
				world.setBlock(i + 1, j + 1, k + 7,cloud);
				world.setBlock(i + 2, j + 0, k + 0,cloud);
				world.setBlock(i + 2, j + 1, k + 7,cloud);
				world.setBlock(i + 3, j + 1, k + 8,cloud);
				world.setBlock(i + 4, j + 0, k + 2,cloud);
				world.setBlock(i + 4, j + 0, k + 3,cloud);
				world.setBlock(i + 4, j + 0, k + 4,cloud);
				world.setBlock(i + 5, j + 0, k + 0,cloud);
				world.setBlock(i + 5, j + 0, k + 1,cloud);
				world.setBlock(i + 5, j + 0, k + 2,cloud);
				world.setBlock(i + 5, j + 0, k + 3,cloud);
				world.setBlock(i + 5, j + 0, k + 4,cloud);
				world.setBlock(i + 5, j + 1, k + 3,cloud);
				world.setBlock(i + 5, j + 1, k + 4,cloud);
				world.setBlock(i + 5, j + 1, k + 5,cloud);
				world.setBlock(i + 6, j + 0, k + 1,cloud);
				world.setBlock(i + 6, j + 0, k + 2,cloud);
				world.setBlock(i + 6, j + 0, k + 3,cloud);
				world.setBlock(i + 6, j + 0, k + 4,cloud);
				world.setBlock(i + 6, j + 1, k + 4,cloud);
				world.setBlock(i + 6, j + 1, k + 5,cloud);
				world.setBlock(i + 6, j + 2, k + 4,cloud);
				world.setBlock(i + 7, j + 0, k + 2,cloud);
				world.setBlock(i + 7, j + 0, k + 3,cloud);
				world.setBlock(i + 7, j + 0, k + 4,cloud);
				world.setBlock(i + 7, j + 0, k + 5,cloud);
				world.setBlock(i + 8, j + 0, k + 4,cloud);
				world.setBlock(i + 8, j + 0, k + 5,cloud);
				world.setBlock(i + 8, j + 0, k + 6,cloud);
				world.setBlock(i + 8, j + 1, k + 5,cloud);
			}
		}
		return true;
	}
}