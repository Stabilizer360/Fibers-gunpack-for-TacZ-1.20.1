package com.ifibers.fibers;

import com.tacz.guns.client.init.*;
import com.tacz.guns.init.CommonRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;

public class FibersGunClient implements ClientModInitializer {
    public FibersGunClient() {
    }

    public void onInitializeClient() {
        ClientSetup.onClientSetup();
        ModContainerScreen.clientSetup();
        ClientLifecycleEvents.CLIENT_STARTED.register((client) -> {
            CommonRegistry.onLoadComplete();
        });
    }
}
