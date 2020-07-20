package net.fabricmc.example.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
	// A mixin to reproduce the problem
	@Overwrite
	private boolean shouldKeepTicking() {
		// Just returning true to have something in the mixin
		return true;
	}
}
