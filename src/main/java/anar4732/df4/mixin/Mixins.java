package anar4732.df4.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.client.renderer.GameRenderer;

public class Mixins {
	@Mixin(GameRenderer.class)
	public static class Mixin1 {
		@Shadow
		private boolean useShader;

		@Overwrite
		public void switchUseShader() {
			this.useShader = true;
			System.out.println("Shader Toggle Disabled!");
		}
	}
}