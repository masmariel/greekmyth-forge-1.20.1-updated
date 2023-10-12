package net.rafiki.greekmyth.client;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import net.rafiki.greekmyth.item.custom.AolusItem;
import net.rafiki.greekmyth.item.custom.DrakonBoneWingsItem;

public class DrakonBoneWingsRenderer extends GeoItemRenderer<DrakonBoneWingsItem> {
    public DrakonBoneWingsRenderer() {
        super(new DrakonBoneWingsModel());
    }
}