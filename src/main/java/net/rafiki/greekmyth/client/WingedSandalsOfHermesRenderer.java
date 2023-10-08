package net.rafiki.greekmyth.client;

import mod.azure.azurelib.model.GeoModel;
import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.rafiki.greekmyth.item.custom.WingedSandalsOfHermesItem;

    public class WingedSandalsOfHermesRenderer extends GeoArmorRenderer<WingedSandalsOfHermesItem> {
        public WingedSandalsOfHermesRenderer() {
            super(new WingedSandalsOfHermesModel());
        }
    }
