package adudecalledleo.keystrokeview.compat;

import adudecalledleo.keystrokeview.KeystrokeViewMod;
import adudecalledleo.keystrokeview.config.ModConfigGui;
import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;

public class ModMenuApiImpl implements ModMenuApi {
    @Override
    public String getModId() {
        return KeystrokeViewMod.MOD_ID;
    }

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> ModConfigGui.getConfigBuilder().setParentScreen(parent).build();
    }
}