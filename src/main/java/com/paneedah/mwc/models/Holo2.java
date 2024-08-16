// Date: 1/15/2016 10:22:13 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Holo2 extends ModelBase {
    //fields
    ModelRenderer gun1;
    ModelRenderer gun2;
    ModelRenderer gun3;
    ModelRenderer gun4;
    ModelRenderer gun5;
    ModelRenderer gun6;
    ModelRenderer gun7;
    ModelRenderer gun8;
    ModelRenderer gun9;
    ModelRenderer gun10;
    ModelRenderer gun11;
    ModelRenderer gun12;
    ModelRenderer gun13;

    public Holo2() {
        textureWidth = 128;
        textureHeight = 64;

        gun1 = new ModelRenderer(this, 0, 0);
        gun1.addBox(0F, 0F, 0F, 1, 1, 0);
        gun1.setRotationPoint(0F, -10F, 0F);
        gun1.setTextureSize(64, 32);
        gun1.mirror = true;
        setRotation(gun1, 0F, 0F, 0F);
        gun2 = new ModelRenderer(this, 0, 0);
        gun2.addBox(0F, 0F, 0F, 3, 1, 0);
        gun2.setRotationPoint(-1F, -7F, 0F);
        gun2.setTextureSize(64, 32);
        gun2.mirror = true;
        setRotation(gun2, 0F, 0F, 0F);
        gun3 = new ModelRenderer(this, 0, 0);
        gun3.addBox(0F, 0F, 0F, 3, 1, 0);
        gun3.setRotationPoint(-1F, -13F, 0F);
        gun3.setTextureSize(64, 32);
        gun3.mirror = true;
        setRotation(gun3, 0F, 0F, 0F);
        gun4 = new ModelRenderer(this, 0, 0);
        gun4.addBox(0F, 0F, 0F, 2, 1, 0);
        gun4.setRotationPoint(-5F, -10F, 0F);
        gun4.setTextureSize(64, 32);
        gun4.mirror = true;
        setRotation(gun4, 0F, 0F, 0F);
        gun5 = new ModelRenderer(this, 0, 0);
        gun5.addBox(0F, 0F, 0F, 1, 3, 0);
        gun5.setRotationPoint(3F, -11F, 0F);
        gun5.setTextureSize(64, 32);
        gun5.mirror = true;
        setRotation(gun5, 0F, 0F, 0F);
        gun6 = new ModelRenderer(this, 0, 0);
        gun6.addBox(0F, 0F, 0F, 1, 1, 0);
        gun6.setRotationPoint(-2F, -12F, 0F);
        gun6.setTextureSize(64, 32);
        gun6.mirror = true;
        setRotation(gun6, 0F, 0F, 0F);
        gun7 = new ModelRenderer(this, 0, 0);
        gun7.addBox(0F, 0F, 0F, 1, 1, 0);
        gun7.setRotationPoint(2F, -12F, 0F);
        gun7.setTextureSize(64, 32);
        gun7.mirror = true;
        setRotation(gun7, 0F, 0F, 0F);
        gun8 = new ModelRenderer(this, 0, 0);
        gun8.addBox(0F, 0F, 0F, 1, 1, 0);
        gun8.setRotationPoint(2F, -8F, 0F);
        gun8.setTextureSize(64, 32);
        gun8.mirror = true;
        setRotation(gun8, 0F, 0F, 0F);
        gun9 = new ModelRenderer(this, 0, 0);
        gun9.addBox(0F, 0F, 0F, 1, 1, 0);
        gun9.setRotationPoint(-2F, -8F, 0F);
        gun9.setTextureSize(64, 32);
        gun9.mirror = true;
        setRotation(gun9, 0F, 0F, 0F);
        gun10 = new ModelRenderer(this, 0, 0);
        gun10.addBox(0F, 0F, 0F, 2, 1, 0);
        gun10.setRotationPoint(4F, -10F, 0F);
        gun10.setTextureSize(64, 32);
        gun10.mirror = true;
        setRotation(gun10, 0F, 0F, 0F);
        gun11 = new ModelRenderer(this, 0, 0);
        gun11.addBox(0F, 0F, 0F, 1, 3, 0);
        gun11.setRotationPoint(-3F, -11F, 0F);
        gun11.setTextureSize(64, 32);
        gun11.mirror = true;
        setRotation(gun11, 0F, 0F, 0F);
        gun12 = new ModelRenderer(this, 0, 0);
        gun12.addBox(0F, 0F, 0F, 1, 2, 0);
        gun12.setRotationPoint(0F, -6F, 0F);
        gun12.setTextureSize(64, 32);
        gun12.mirror = true;
        setRotation(gun12, 0F, 0F, 0F);
        gun13 = new ModelRenderer(this, 0, 0);
        gun13.addBox(0F, 0F, 0F, 1, 2, 0);
        gun13.setRotationPoint(0F, -15F, 0F);
        gun13.setTextureSize(64, 32);
        gun13.mirror = true;
        setRotation(gun13, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        gun1.render(f5);
        gun2.render(f5);
        gun3.render(f5);
        gun4.render(f5);
        gun5.render(f5);
        gun6.render(f5);
        gun7.render(f5);
        gun8.render(f5);
        gun9.render(f5);
        gun10.render(f5);
        gun11.render(f5);
        gun12.render(f5);
        gun13.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
