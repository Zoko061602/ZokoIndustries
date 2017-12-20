package com.Zoko.Industries.Modules.Thaumcraft;


import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;


public class Aspects  {
	
	public static Aspect ELECTROCITY;
	public static Aspect RADIATION;
	public static Aspect STUPITDY;
	public static Aspect ETHERNITY;
	
	 public static void initAspects() {
		 ELECTROCITY = new Aspect("fluentum",0x14727D , new Aspect[] { Aspect.ENERGY,Aspect.TOOL }, new ResourceLocation("zokoindustries", "textures/aspects/fluentum.png"), 771);
		 RADIATION = new Aspect("radiatio", 0x9adc3e, new Aspect[]   { Aspect.POISON,Aspect.ENERGY }, new ResourceLocation("zokoindustries", "textures/aspects/radiatio.png"), 771);
		 STUPITDY  = new Aspect("stultitia", 0x8B8989, new Aspect[]  { Aspect.ENTROPY,Aspect.MIND }, new ResourceLocation("zokoindustries", "textures/aspects/stultitia.png"), 771);		    
		 ETHERNITY  = new Aspect("aeternitas", 0xceffff, new Aspect[]{ Aspect.MOTION,Aspect.ENTROPY  }, new ResourceLocation("zokoindustries", "textures/aspects/aeternitas.png"), 771);   
      }
	 }