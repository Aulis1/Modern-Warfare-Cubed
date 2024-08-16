package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Dragunov98Handguard extends ModelBase {
    private final ModelRenderer handguard;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer gun267_r1;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer rail5;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;

    public Dragunov98Handguard() {
        textureWidth = 370;
        textureHeight = 370;

        handguard = new ModelRenderer(this);
        handguard.setRotationPoint(0.0F, -14.0F, -91.0F);
        handguard.cubeList.add(new ModelBox(handguard, 65, 129, -2.5F, -2.0F, -4.0F, 2, 1, 52, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 94, 234, -2.0F, -1.4F, -6.0F, 1, 1, 35, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 28, 71, -1.6F, -1.0F, -6.001F, 1, 1, 6, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 54, -2.4F, -1.0F, -6.001F, 1, 1, 6, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 52, 44, -1.8F, -1.0F, -5.9F, 1, 1, 4, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 42, -2.002F, -0.6F, -6.0F, 1, 1, 6, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 44, -2.201F, -1.0F, -5.901F, 1, 1, 4, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 35, -2.25F, -0.75F, -6.0F, 1, 1, 6, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 47, 192, -1.75F, -0.75F, -6.0F, 1, 1, 35, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 28, -1.75F, -1.25F, -6.0F, 1, 1, 6, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 14, -2.25F, -1.25F, -6.0F, 1, 1, 6, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 178, 264, -2.15F, 2.05F, -21.9F, 1, 1, 41, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 233, 0, -1.85F, 2.05F, -21.9F, 1, 1, 41, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 233, 50, -1.85F, 1.75F, -21.9F, 1, 1, 41, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 7, -2.25F, 1.65F, -10.0F, 1, 1, 6, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 0, -1.75F, 1.65F, -10.0F, 1, 1, 6, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 46, 64, -1.75F, 2.15F, -10.0F, 1, 1, 6, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 28, 64, -2.25F, 2.15F, -10.0F, 1, 1, 6, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 228, 262, -2.0F, 2.2F, -21.9F, 1, 1, 41, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 51, 234, -2.0F, 1.6F, -21.9F, 1, 1, 41, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 39, -2.201F, 1.9F, -5.901F, 1, 1, 4, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 11, 64, -2.002F, 2.3F, -10.0F, 1, 1, 6, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 30, 56, -2.4F, 1.9F, -10.001F, 1, 1, 6, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 16, 56, -1.6F, 1.9F, -10.001F, 1, 1, 6, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 48, 53, -2.0F, 1.5F, -10.0F, 1, 1, 6, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 238, -2.15F, 1.75F, -21.9F, 1, 1, 41, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 229, 169, -1.7F, 1.9F, -21.9F, 1, 1, 41, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 135, 234, -2.3F, 1.9F, -21.9F, 1, 1, 41, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 132, 17, -1.65F, 2.25F, -37.0F, 1, 1, 16, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 132, 0, -1.5F, 1.9F, -37.001F, 1, 1, 16, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 130, 84, -1.65F, 1.55F, -37.0F, 1, 1, 16, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 95, 0, -2.002F, 2.4F, -37.0F, 1, 1, 16, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 91, 93, -2.35F, 2.25F, -37.0F, 1, 1, 16, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 93, 65, -2.5F, 1.9F, -37.001F, 1, 1, 16, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 26, 93, -2.35F, 1.55F, -37.0F, 1, 1, 16, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 28, 64, -2.0F, 1.4F, -37.0F, 1, 1, 16, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 47, 27, -0.1F, 0.8F, 41.0F, 1, 2, 7, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 6, 17, -0.2F, 1.8F, -15.0F, 1, 3, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 87, 60, -0.2F, 2.8F, -7.0F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 87, 51, -0.2F, 2.8F, -11.0F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 52, 87, -0.2F, 2.8F, -3.0F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 184, 51, -0.2F, 1.8F, 1.0F, 1, 3, 47, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 64, 0.05F, 2.05F, 2.0F, 1, 3, 26, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 27, -4.05F, 2.05F, 2.0F, 1, 3, 26, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 0, -2.5F, 5.15F, 2.0F, 2, 1, 26, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 132, 34, -0.2F, 1.8F, -14.0F, 1, 1, 15, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 57, -0.2F, 2.05F, -14.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 54, -0.2F, 3.55F, -14.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 45, -0.2F, 3.55F, -10.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 46, 67, -0.2F, 2.05F, -10.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 38, -0.2F, 3.55F, -6.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 42, -0.2F, 2.05F, -6.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 31, -0.2F, 3.55F, -2.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 35, -0.2F, 2.05F, -2.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 130, 101, -0.2F, 3.8F, -14.0F, 1, 1, 15, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 192, -0.1F, 0.8F, -4.0F, 1, 1, 45, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 45, 17, -3.9F, 0.8F, 41.0F, 1, 2, 7, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 17, -3.8F, 1.8F, -15.0F, 1, 3, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 40, 87, -3.8F, 2.8F, -7.0F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 44, 87, -3.8F, 2.8F, -11.0F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 48, 87, -3.8F, 2.8F, -3.0F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 184, 0, -3.8F, 1.8F, 1.0F, 1, 3, 47, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 30, 0, -3.8F, 1.8F, -14.0F, 1, 1, 15, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 3, -3.8F, 2.05F, -14.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 7, -3.8F, 3.55F, -14.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 10, -3.8F, 3.55F, -10.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 11, 67, -3.8F, 2.05F, -10.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 14, -3.8F, 3.55F, -6.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 67, 17, -3.8F, 2.05F, -6.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 19, 67, -3.8F, 3.55F, -2.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 28, 67, -3.8F, 2.05F, -2.0F, 1, 1, 2, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 98, 28, -3.8F, 3.8F, -14.0F, 1, 1, 15, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 0, -2.5F, 4.75F, -15.0F, 2, 1, 63, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 47, 36, -2.5F, 5.1F, 43.0F, 2, 1, 5, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 130, 183, -3.9F, 0.8F, -4.0F, 1, 1, 45, 0.0F, false));

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(-3.8F, 0.8F, -4.0F);
        handguard.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.5411F, 0.0F, 0.0F);
        cube_r21.cubeList.add(new ModelBox(cube_r21, 67, 28, 0.0F, 0.0F, -2.0F, 1, 1, 2, -0.001F, false));
        cube_r21.cubeList.add(new ModelBox(cube_r21, 65, 75, 3.6F, 0.0F, -2.0F, 1, 1, 2, -0.001F, false));

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(-2.5F, 6.1F, 43.0F);
        handguard.addChild(cube_r22);
        setRotationAngle(cube_r22, -0.2618F, 0.0F, 0.0F);
        cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 64, 0.0F, -1.0F, -2.0F, 2, 1, 2, -0.001F, false));

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(-3.9F, 2.8F, 41.0F);
        handguard.addChild(cube_r23);
        setRotationAngle(cube_r23, -0.2618F, 0.0F, 0.0F);
        cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 17, 0.0F, -1.0F, -4.0F, 1, 1, 4, -0.001F, false));
        cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 27, 3.8F, -1.0F, -4.0F, 1, 1, 4, -0.001F, false));

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(-2.5F, 5.75F, 48.0F);
        handguard.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, 0.0F, -0.9425F);
        cube_r24.cubeList.add(new ModelBox(cube_r24, 65, 65, 0.0F, -1.0F, -63.0F, 1, 1, 63, -0.001F, false));
        cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 64, 0.0F, -1.6F, -63.0F, 1, 1, 63, -0.002F, false));

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(-0.5F, 5.75F, 48.0F);
        handguard.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0F, 0.0F, 0.9425F);
        cube_r25.cubeList.add(new ModelBox(cube_r25, 67, 1, -1.0F, -1.6F, -63.0F, 1, 1, 63, -0.002F, false));
        cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 128, -1.0F, -1.0F, -63.0F, 1, 1, 63, -0.001F, false));

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(-4.05F, 5.05F, 28.0F);
        handguard.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0F, 0.0F, -0.9774F);
        cube_r26.cubeList.add(new ModelBox(cube_r26, 65, 65, 0.0F, 0.0F, -26.0F, 1, 2, 26, -0.001F, false));

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(1.05F, 5.05F, 28.0F);
        handguard.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, 0.0F, 0.9774F);
        cube_r27.cubeList.add(new ModelBox(cube_r27, 67, 0, -1.0F, 0.0F, -26.0F, 1, 2, 26, -0.001F, false));

        gun267_r1 = new ModelRenderer(this);
        gun267_r1.setRotationPoint(-1.0F, -1.4F, -6.0F);
        handguard.addChild(gun267_r1);
        setRotationAngle(gun267_r1, -0.7505F, 0.0F, 0.0F);
        gun267_r1.cubeList.add(new ModelBox(gun267_r1, 30, 16, -1.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(-3.9F, 0.8F, 24.0F);
        handguard.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, 0.0F, -1.117F);
        cube_r28.cubeList.add(new ModelBox(cube_r28, 67, 0, 0.25F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 46, 64, 1.75F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 36, 87, 1.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 64, 0.25F, 0.0F, -3.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 19, 64, 1.75F, 0.0F, -3.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 32, 87, 1.0F, 0.0F, -3.0F, 1, 1, 1, 0.001F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 11, 64, 0.25F, 0.0F, -6.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 56, 56, 1.75F, 0.0F, -6.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 87, 1.0F, 0.0F, -6.0F, 1, 1, 1, 0.001F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 56, 53, 0.25F, 0.0F, -9.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 47, 56, 1.75F, 0.0F, -9.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 22, 87, 1.0F, 0.0F, -9.0F, 1, 1, 1, 0.001F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 56, 36, 0.25F, 0.0F, -12.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 56, 29, 1.75F, 0.0F, -12.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 87, 20, 1.0F, 0.0F, -12.0F, 1, 1, 1, 0.001F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 56, 26, 0.25F, 0.0F, -15.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 43, 47, 1.75F, 0.0F, -15.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 87, 1.0F, 0.0F, -15.0F, 1, 1, 1, 0.001F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 47, 30, 0.25F, 0.0F, -18.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 47, 1.75F, 0.0F, -18.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 47, 27, 0.25F, 0.0F, -21.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 45, 19, 1.75F, 0.0F, -21.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 45, 16, 1.75F, 0.0F, -26.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 43, 44, 0.25F, 0.0F, -26.0F, 1, 1, 2, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 12, 87, 1.0F, 0.0F, -18.0F, 1, 1, 1, 0.001F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 44, 1.0F, 0.0F, -23.0F, 1, 1, 2, 0.001F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 175, 118, 2.0F, 0.0F, -26.0F, 1, 1, 50, 0.001F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 132, 0, 0.0F, 0.0F, -26.0F, 1, 1, 50, 0.001F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 23, 0.0F, 0.0F, -28.0F, 3, 1, 2, 0.001F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 128, 1.0F, 0.0F, 3.0F, 1, 1, 21, 0.001F, false));

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(-3.9F, 0.8F, 46.0F);
        handguard.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 0.4189F, -1.117F);
        cube_r29.cubeList.add(new ModelBox(cube_r29, 8, 87, 0.7F, -0.2F, 0.6F, 1, 1, 1, 0.001F, false));

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(-3.9F, 0.8F, 43.0F);
        handguard.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, 0.4189F, -1.117F);
        cube_r30.cubeList.add(new ModelBox(cube_r30, 87, 7, 0.7F, -0.2F, 0.6F, 1, 1, 1, 0.001F, false));

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(0.9F, 0.8F, 43.0F);
        handguard.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.0F, -0.4189F, 1.117F);
        cube_r31.cubeList.add(new ModelBox(cube_r31, 87, 9, -1.7F, -0.2F, 0.6F, 1, 1, 1, 0.001F, false));

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(0.9F, 0.8F, 46.0F);
        handguard.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.0F, -0.4189F, 1.117F);
        cube_r32.cubeList.add(new ModelBox(cube_r32, 87, 11, -1.7F, -0.2F, 0.6F, 1, 1, 1, 0.001F, false));

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(0.9F, 0.8F, 27.0F);
        handguard.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.0F, 0.0F, 1.117F);
        cube_r33.cubeList.add(new ModelBox(cube_r33, 65, 129, -2.0F, 0.0F, 0.0F, 1, 1, 21, 0.001F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 28, 71, -1.25F, 0.0F, -3.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 20, 71, -2.75F, 0.0F, -3.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 65, 87, -2.0F, 0.0F, -3.0F, 1, 1, 1, 0.001F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 18, 74, -1.25F, 0.0F, -6.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 73, -2.75F, 0.0F, -6.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 87, 66, -2.0F, 0.0F, -6.0F, 1, 1, 1, 0.001F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 74, 49, -1.25F, 0.0F, -9.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 28, 74, -2.75F, 0.0F, -9.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 69, 87, -2.0F, 0.0F, -9.0F, 1, 1, 1, 0.001F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 13, 75, -1.25F, 0.0F, -12.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 7, 75, -2.75F, 0.0F, -12.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 73, 87, -2.0F, 0.0F, -12.0F, 1, 1, 1, 0.001F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 17, -1.25F, 0.0F, -15.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 14, -2.75F, 0.0F, -15.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 77, 87, -2.0F, 0.0F, -15.0F, 1, 1, 1, 0.001F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 31, -1.25F, 0.0F, -18.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 28, -2.75F, 0.0F, -18.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 87, 81, -2.0F, 0.0F, -18.0F, 1, 1, 1, 0.001F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 38, -1.25F, 0.0F, -21.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 35, -2.75F, 0.0F, -21.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 45, -1.25F, 0.0F, -24.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 42, -2.75F, 0.0F, -24.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 54, -2.75F, 0.0F, -29.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 56, 75, -1.25F, 0.0F, -29.0F, 1, 1, 2, 0.0F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 83, 87, -2.0F, 0.0F, -21.0F, 1, 1, 1, 0.001F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 57, -2.0F, 0.0F, -26.0F, 1, 1, 2, 0.001F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 177, 169, -3.0F, 0.0F, -29.0F, 1, 1, 50, 0.001F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 78, 183, -1.0F, 0.0F, -29.0F, 1, 1, 50, 0.001F, false));
        cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 23, -3.0F, 0.0F, -31.0F, 3, 1, 2, 0.001F, false));

        rail5 = new ModelRenderer(this);
        rail5.setRotationPoint(-0.7F, -2.0F, -7.8F);
        handguard.addChild(rail5);
        setRotationAngle(rail5, 0.0F, 0.0F, -3.1416F);
        rail5.cubeList.add(new ModelBox(rail5, 83, 58, -0.2F, -0.2F, 12.05F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 83, 54, -0.2F, -0.2F, 13.3F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 52, 83, -0.2F, -0.2F, 14.55F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 83, 46, -0.2F, -0.2F, 15.8F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 46, 83, -0.2F, -0.2F, 18.3F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 83, 43, -0.2F, -0.2F, 17.05F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 40, 83, -0.2F, -0.2F, 20.8F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 83, 39, -0.2F, -0.2F, 19.55F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 83, 36, -0.2F, -0.2F, 23.3F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 34, 83, -0.2F, -0.2F, 22.05F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 83, 32, -0.2F, -0.2F, 25.8F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 83, 28, -0.2F, -0.2F, 24.55F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 28, 83, -0.2F, -0.2F, 28.3F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 83, 16, -0.2F, -0.2F, 27.05F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 83, 13, -0.2F, -0.2F, 7.05F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 12, 83, -0.2F, -0.2F, 8.3F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 6, 83, -0.2F, -0.2F, 9.55F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 0, 83, -0.2F, -0.2F, 10.8F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 82, 82, -0.2F, -0.2F, 5.8F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 34, 81, -0.2F, -0.2F, 35.8F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 40, 81, -0.2F, -0.2F, 37.05F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 46, 81, -0.2F, -0.2F, 38.3F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 52, 81, -0.2F, -0.2F, 39.55F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 65, 81, -0.2F, -0.2F, 42.05F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 71, 81, -0.2F, -0.2F, 40.8F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 77, 81, -0.2F, -0.2F, 44.55F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 81, 77, -0.2F, -0.2F, 43.3F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 82, 0, -0.2F, -0.2F, 47.05F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 82, 2, -0.2F, -0.2F, 45.8F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 82, 6, -0.2F, -0.2F, 49.55F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 82, 8, -0.2F, -0.2F, 48.3F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 82, 10, -0.2F, -0.2F, 52.05F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 17, 82, -0.2F, -0.2F, 50.8F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 28, 81, -0.2F, -0.2F, 53.3F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 81, 24, -0.2F, -0.2F, 54.55F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 82, 21, -0.2F, -0.2F, 30.8F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 82, 50, -0.2F, -0.2F, 32.05F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 57, 82, -0.2F, -0.2F, 33.3F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 82, 65, -0.2F, -0.2F, 34.55F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 82, 80, -0.2F, -0.2F, 29.55F, 2, 1, 1, -0.2F, false));
        rail5.cubeList.add(new ModelBox(rail5, 0, 6, -0.2F, -0.2F, 3.55F, 2, 1, 2, -0.2F, false));

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(0.0F, 0.6F, 4.75F);
        rail5.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.0F, 0.0F, -0.9425F);
        cube_r34.cubeList.add(new ModelBox(cube_r34, 20, 27, -0.2F, -0.8F, -1.2F, 1, 1, 2, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 82, 84, -0.2F, -0.8F, 24.8F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 17, 84, -0.2F, -0.8F, 29.8F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 75, 83, -0.2F, -0.8F, 28.55F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 83, 71, -0.2F, -0.8F, 27.3F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 83, 69, -0.2F, -0.8F, 26.05F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 38, 58, -0.2F, -0.8F, 49.8F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 58, 46, -0.2F, -0.8F, 48.55F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 81, -0.2F, -0.8F, 47.3F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 79, -0.2F, -0.8F, 46.05F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 40, 78, -0.2F, -0.8F, 44.8F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 50, 77, -0.2F, -0.8F, 43.55F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 69, 75, -0.2F, -0.8F, 42.3F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 75, 61, -0.2F, -0.8F, 41.05F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 75, 7, -0.2F, -0.8F, 39.8F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 75, 2, -0.2F, -0.8F, 38.55F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 74, -0.2F, -0.8F, 37.3F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 73, -0.2F, -0.8F, 36.05F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 71, -0.2F, -0.8F, 34.8F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 65, 65, -0.2F, -0.8F, 33.55F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 59, 20, -0.2F, -0.8F, 32.3F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 59, 2, -0.2F, -0.8F, 31.05F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 85, -0.2F, -0.8F, 1.05F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 12, 85, -0.2F, -0.8F, 6.05F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 28, 85, -0.2F, -0.8F, 4.8F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 32, 85, -0.2F, -0.8F, 3.55F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 36, 85, -0.2F, -0.8F, 2.3F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 44, 85, -0.2F, -0.8F, 23.55F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 48, 85, -0.2F, -0.8F, 22.3F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 85, 56, -0.2F, -0.8F, 21.05F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 65, 85, -0.2F, -0.8F, 19.8F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 85, 75, -0.2F, -0.8F, 18.55F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 77, 85, -0.2F, -0.8F, 17.3F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 86, 18, -0.2F, -0.8F, 16.05F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 86, 23, -0.2F, -0.8F, 14.8F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 86, 68, -0.2F, -0.8F, 13.55F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 86, 70, -0.2F, -0.8F, 12.3F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 86, 78, -0.2F, -0.8F, 11.05F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 87, -0.2F, -0.8F, 9.8F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 87, 3, -0.2F, -0.8F, 8.55F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 87, 5, -0.2F, -0.8F, 7.3F, 1, 1, 1, -0.202F, false));
        cube_r34.cubeList.add(new ModelBox(cube_r34, 121, 130, -0.1F, -0.9F, -0.45F, 1, 1, 52, -0.3F, false));

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(1.6F, 0.6F, 4.75F);
        rail5.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 0.0F, 0.9425F);
        cube_r35.cubeList.add(new ModelBox(cube_r35, 20, 34, -0.8F, -0.8F, -1.2F, 1, 1, 2, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 84, 61, -0.8F, -0.8F, 24.8F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 57, 84, -0.8F, -0.8F, 29.8F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 79, 83, -0.8F, -0.8F, 28.55F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 83, 73, -0.8F, -0.8F, 27.3F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 71, 83, -0.8F, -0.8F, 26.05F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 58, 44, -0.8F, -0.8F, 49.8F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 59, 0, -0.8F, -0.8F, 48.55F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 83, 67, -0.8F, -0.8F, 47.3F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 22, 83, -0.8F, -0.8F, 46.05F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 69, 78, -0.8F, -0.8F, 44.8F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 58, 78, -0.8F, -0.8F, 43.55F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 21, 77, -0.8F, -0.8F, 42.3F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 77, -0.8F, -0.8F, 41.05F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 11, 75, -0.8F, -0.8F, 39.8F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 75, 9, -0.8F, -0.8F, 38.55F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 75, 0, -0.8F, -0.8F, 37.3F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 75, -0.8F, -0.8F, 36.05F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 40, 73, -0.8F, -0.8F, 34.8F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 65, 67, -0.8F, -0.8F, 33.55F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 59, 51, -0.8F, -0.8F, 32.3F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 59, 16, -0.8F, -0.8F, 31.05F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 4, 85, -0.8F, -0.8F, 1.05F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 8, 85, -0.8F, -0.8F, 6.05F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 20, 85, -0.8F, -0.8F, 4.8F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 85, 30, -0.8F, -0.8F, 3.55F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 85, 34, -0.8F, -0.8F, 2.3F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 40, 85, -0.8F, -0.8F, 23.55F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 85, 41, -0.8F, -0.8F, 22.3F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 85, 48, -0.8F, -0.8F, 21.05F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 52, 85, -0.8F, -0.8F, 19.8F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 69, 85, -0.8F, -0.8F, 18.55F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 73, 85, -0.8F, -0.8F, 17.3F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 85, 85, -0.8F, -0.8F, 16.05F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 15, 86, -0.8F, -0.8F, 14.8F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 55, 86, -0.8F, -0.8F, 13.55F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 59, 86, -0.8F, -0.8F, 12.3F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 86, 72, -0.8F, -0.8F, 11.05F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 80, 86, -0.8F, -0.8F, 9.8F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 87, 1, -0.8F, -0.8F, 8.55F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 4, 87, -0.8F, -0.8F, 7.3F, 1, 1, 1, -0.202F, false));
        cube_r35.cubeList.add(new ModelBox(cube_r35, 130, 65, -0.9F, -0.9F, -0.45F, 1, 1, 52, -0.3F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        handguard.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
