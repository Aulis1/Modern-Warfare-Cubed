// Date: 1/16/2017 12:15:20 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class L115Bolt2 extends ModelBase
{
  //fields
    ModelRenderer gun1;
    ModelRenderer gun2;
    ModelRenderer gun3;
  
  public L115Bolt2()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      gun1 = new ModelRenderer(this, 150, 0);
      gun1.addBox(0F, 0F, 0F, 1, 3, 1);
      gun1.setRotationPoint(1.9F, -16.6F, 6F);
      gun1.setTextureSize(64, 32);
      gun1.mirror = true;
      setRotation(gun1, 0F, 0F, 1.226894F);
      gun2 = new ModelRenderer(this, 150, 0);
      gun2.addBox(0F, 0F, 0F, 1, 2, 1);
      gun2.setRotationPoint(-1F, -15.5F, 6F);
      gun2.setTextureSize(64, 32);
      gun2.mirror = true;
      setRotation(gun2, 0.4461411F, 0.2230705F, 1.041002F);
      gun3 = new ModelRenderer(this, 150, 0);
      gun3.addBox(0F, 0F, 0F, 1, 1, 1);
      gun3.setRotationPoint(-2.4F, -14.8F, 7F);
      gun3.setTextureSize(64, 32);
      gun3.mirror = true;
      setRotation(gun3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    gun1.render(f5);
    gun2.render(f5);
    gun3.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
