package com.Zoko.Industries.Modules.ThermalExpansion.Entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGlassPearl extends EntityThrowable {

	public EntityGlassPearl(World world) {
		super(world);
	}

	public EntityGlassPearl(World world, EntityLivingBase entity)
    {
        super(world, entity);
    }

    @SideOnly(Side.CLIENT)
    public EntityGlassPearl(World world, double p_i1784_2_, double p_i1784_4_, double p_i1784_6_)
    {
        super(world, p_i1784_2_, p_i1784_4_, p_i1784_6_);
    }
	
	
	@Override
	protected void onImpact(MovingObjectPosition p_70184_1_) {
		
	}


		
	


}
