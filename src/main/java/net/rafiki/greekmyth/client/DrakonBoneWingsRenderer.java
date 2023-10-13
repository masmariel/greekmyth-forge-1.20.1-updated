package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import mod.azure.azurelib.renderer.GeoEntityRenderer;
import mod.azure.azurelib.renderer.GeoItemRenderer;
import mod.azure.azurelib.renderer.GeoObjectRenderer;
import net.rafiki.greekmyth.item.custom.DrakonBoneWingsItem;

public class DrakonBoneWingsRenderer extends GeoArmorRenderer<DrakonBoneWingsItem> {
    public DrakonBoneWingsRenderer() {
        super(new DrakonBoneWingsModel());
    }
}