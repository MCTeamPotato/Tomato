package com.teampotato.tomato;

import com.mojang.logging.LogUtils;
import com.teampotato.tomato.animation.ProgressManager;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Tomato.MODID)
public class Tomato {
    public static final String MODID = "tomato";
    public static final Logger LOGGER = LogUtils.getLogger();
    private static Tomato instance;
    private ProgressManager progress;

    public static Tomato getInstance() {
        return instance;
    }
    public ProgressManager getProgressManager() {
        return progress;
    }
}
