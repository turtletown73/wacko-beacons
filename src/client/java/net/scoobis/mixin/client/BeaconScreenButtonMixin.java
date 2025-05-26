package net.scoobis.mixin.client;

import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.gui.screen.ingame.BeaconScreen;

@Mixin(BeaconScreen.EffectButtonWidget.class)
abstract class BeaconScreenButtonMixin extends ClickableWidget {
	public BeaconScreenButtonMixin(int x, int y, int width, int height, Text message) {
		super(x, y, width, height, message);
	}

	@Inject(at = @At("TAIL"), method = "tick")
	private void tick(int level, CallbackInfo ci) {
		this.active = true;
	}
}