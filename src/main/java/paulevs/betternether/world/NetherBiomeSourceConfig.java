package paulevs.betternether.world;

import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.source.BiomeSourceConfig;
import net.minecraft.world.level.LevelGeneratorType;

public class NetherBiomeSourceConfig implements BiomeSourceConfig
{
	final LevelGeneratorType type;
	final long seed;
	
	public NetherBiomeSourceConfig(IWorld world, LevelGeneratorType type)
	{
		this.type = type;
		this.seed = world.getSeed();
	}
	
	public NetherBiomeSourceConfig(World world)
	{
		this.type = world.getGeneratorType();
		this.seed = world.getSeed();
	}
	
	public long getSeed()
	{
		return seed;
	}
	
	public boolean isVolumetric()
	{
		return type == LevelGeneratorType.DEFAULT || type == LevelGeneratorType.BUFFET;
	}
}