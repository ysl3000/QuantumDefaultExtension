package de.ysl3000.quantumextension;

import com.ne0nx3r0.quantum.api.IQuantumConnectorsAPI;
import com.ne0nx3r0.quantum.api.QuantumExtension;
import de.ysl3000.quantumextension.receiver.*;

/**
 * Created by Yannick on 24.01.2017.
 */
public class QuantumDefaultExtension extends QuantumExtension {
    private IQuantumConnectorsAPI api;

    public void onEnable(IQuantumConnectorsAPI api) {
        this.api = api;
        this.api.getReceiverRegistry().register(this,
                LeverReceiver.class,
                OpenableReceiver.class,
                PistonReceiver.class,
                PoweredRailReceiver.class,
                RedstoneLampReceiver.class,
                TrafficLightStateReceiver.class,
                ComperatorReceiver.class);
    }

    public void onDisable() {

    }
}