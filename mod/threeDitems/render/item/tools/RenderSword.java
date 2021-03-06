package threeDitems.render.item.tools;

import net.minecraft.client.model.ModelBase;

import org.lwjgl.opengl.GL11;

import threeDitems.render.Render3DInterface;

public class RenderSword extends Render3DInterface {

	public RenderSword(ModelBase model, String texture) {
		super(model, texture);
	}

	@Override
	public void renderEquippedFP() {
		GL11.glRotatef(50,0,1,0);
		GL11.glRotatef(250,0,0,1);
		GL11.glRotatef(90,1,0,0);
		
		GL11.glTranslatef(-0.3f, 1f, 0f);		
	}

	@Override
	public void renderEntity() {
		float f = 3f;
		GL11.glRotatef(180, 1, 0, 0);
		GL11.glScalef(f, f, f);		
	}

	@Override
	public void renderEquipped() {
		GL11.glRotatef(0,0,1,0);
		GL11.glRotatef(-55,0,0,1);
		GL11.glRotatef(90,1,0,0);
			
		GL11.glTranslatef(0.1f, -0.05f, -0.8f);	
		float f = 0.8f;
		GL11.glScalef(f, f, f);		
	}

	@Override
	public void renderScale() {
		float f = 2f;
		GL11.glScalef(f, f, f);		
	}

}