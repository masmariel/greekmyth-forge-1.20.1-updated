package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.BrokenWingedSandalsItem;
import net.rafiki.greekmyth.item.custom.WingedSandalsOfHermesItem;

public class BrokenWingedSandalsRenderer extends GeoArmorRenderer<BrokenWingedSandalsItem> {
    public BrokenWingedSandalsRenderer() {
        super(new BrokenWingedSandalsModel());
    }
}
