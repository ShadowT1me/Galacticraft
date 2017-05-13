package micdoodle8.mods.galacticraft.core.world.gen;

import micdoodle8.mods.galacticraft.core.Constants;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSpider;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedZombie;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import net.minecraft.world.biome.Biome;

public class BiomeOrbit extends Biome
{
    public static final Biome space = new BiomeOrbit(new BiomeProperties("Space").setRainfall(0.0F));

    @SuppressWarnings("unchecked")
    private BiomeOrbit(BiomeProperties properties)
    {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedZombie.class, 10, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedSpider.class, 10, 4, 4));
        Biome.registerBiome(ConfigManagerCore.biomeIDbase + 3, Constants.TEXTURE_PREFIX + this.getBiomeName(), this);
    }

    @Override
    public float getSpawningChance()
    {
        return 0.01F;
    }
}