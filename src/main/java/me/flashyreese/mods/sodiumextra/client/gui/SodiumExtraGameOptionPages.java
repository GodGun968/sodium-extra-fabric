package me.flashyreese.mods.sodiumextra.client.gui;

import com.google.common.collect.ImmutableList;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.client.gui.options.storage.SodiumExtraOptionsStorage;
import me.jellysquid.mods.sodium.client.gui.options.OptionFlag;
import me.jellysquid.mods.sodium.client.gui.options.OptionGroup;
import me.jellysquid.mods.sodium.client.gui.options.OptionImpl;
import me.jellysquid.mods.sodium.client.gui.options.OptionPage;
import me.jellysquid.mods.sodium.client.gui.options.control.TickBoxControl;

import java.util.ArrayList;
import java.util.List;

public class SodiumExtraGameOptionPages {
    private static final SodiumExtraOptionsStorage sodiumExtraOpts = new SodiumExtraOptionsStorage();

    public static OptionPage animation() {
        List<OptionGroup> groups = new ArrayList<>();
        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Animations")
                        .setTooltip("Toggle all animation")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.animationSettings.animation = value, opts -> opts.animationSettings.animation)
                        .build()
                )
                .build());

        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Animate Water")
                        .setTooltip("Toggle for water animation")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.animationSettings.animateWater = value, opts -> opts.animationSettings.animateWater)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Animate Lava")
                        .setTooltip("Toggle for lava animation")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.animationSettings.animateLava = value, opts -> opts.animationSettings.animateLava)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Animate Fire")
                        .setTooltip("Toggle for fire animation")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.animationSettings.animateFire = value, opts -> opts.animationSettings.animateFire)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Animate Portal")
                        .setTooltip("Toggle for portal animation")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.animationSettings.animatePortal = value, opts -> opts.animationSettings.animatePortal)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Block Animations")
                        .setTooltip("Process block animations")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.animationSettings.blockAnimations = value, options -> options.animationSettings.blockAnimations)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Piston Animations")
                        .setTooltip("Process piston animations")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.animationSettings.pistonAnimations = value, options -> options.animationSettings.pistonAnimations)
                        .build()
                )
                .build());
        return new OptionPage("Animations", ImmutableList.copyOf(groups));
    }

    public static OptionPage particle() {
        List<OptionGroup> groups = new ArrayList<>();
        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Particles")
                        .setTooltip("Toggle all particles")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.particles = value, opts -> opts.particleSettings.particles)
                        .build()
                )
                .build());

        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Rain Splash")
                        .setTooltip("Toggle for rain splash particles")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.rainSplash = value, opts -> opts.particleSettings.rainSplash)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Explosion")
                        .setTooltip("Toggle for explosion particles")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.explosion = value, opts -> opts.particleSettings.explosion)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Water")
                        .setTooltip("Toggle for water particles")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.water = value, opts -> opts.particleSettings.water)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Smoke")
                        .setTooltip("Toggle for smoke particles")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.smoke = value, opts -> opts.particleSettings.smoke)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Potion")
                        .setTooltip("Toggle for potion particles")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.potion = value, opts -> opts.particleSettings.potion)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Portal")
                        .setTooltip("Toggle for portal particles")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.portal = value, opts -> opts.particleSettings.portal)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Redstone")
                        .setTooltip("Toggle for redstone particles")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.redstone = value, opts -> opts.particleSettings.redstone)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Dripping Particles")
                        .setTooltip("Toggle for drip particles")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.drip = value, opts -> opts.particleSettings.drip)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Firework")
                        .setTooltip("Toggle for fireworks particles")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.particleSettings.firework = value, opts -> opts.particleSettings.firework)
                        .build()
                )
                .build());
        return new OptionPage("Particles", ImmutableList.copyOf(groups));
    }

    public static OptionPage detail() {
        List<OptionGroup> groups = new ArrayList<>();
        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Rain & Snow")
                        .setTooltip("Toggle for rain & snow")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.detailSettings.rainSnow = value, opts -> opts.detailSettings.rainSnow)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Biome Colors")
                        .setTooltip("Biome colors change based on the biome")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.detailSettings.biomeColors = value, options -> options.detailSettings.biomeColors)
                        .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Sky Colors")
                        .setTooltip("Have sky colors change based on biome")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.detailSettings.skyColors = value, options -> options.detailSettings.skyColors)
                        .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Render Paintings")
                        .setTooltip("Show paintings")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.detailSettings.renderPaintings = value, options -> options.detailSettings.renderPaintings)
                        .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                        .build()
                )
                .build());
        return new OptionPage("Details", ImmutableList.copyOf(groups));
    }

    public static OptionPage extra() {
        List<OptionGroup> groups = new ArrayList<>();
        groups.add(OptionGroup.createBuilder()
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Show FPS")
                        .setTooltip("Show current, max, average and min FPS on top left corner")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.extraSettings.showFps = value, opts -> opts.extraSettings.showFps)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Show Coordinates")
                        .setTooltip("Show coordinates on top left corner")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.extraSettings.showCoords = value, opts -> opts.extraSettings.showCoords)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Fog")
                        .setTooltip("Toggle all types of fog")
                        .setControl(TickBoxControl::new)
                        .setBinding((opts, value) -> opts.extraSettings.enableFog = value, opts -> opts.extraSettings.enableFog)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Hurtcam")
                        .setTooltip("Shake the camera when the player is damaged")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.extraSettings.hurtCam = value, options -> options.extraSettings.hurtCam)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Toasts")
                        .setTooltip("Advancement and crafting recipe popups")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.extraSettings.toasts = value, options -> options.extraSettings.toasts)
                        .build())

                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Static FOV")
                        .setTooltip("Don't change FOV based on speed or effects")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.extraSettings.staticFov = value, options -> options.extraSettings.staticFov)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Instant Sneak")
                        .setTooltip("Don't lerp the camera to sneak")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.extraSettings.instantSneak = value, options -> options.extraSettings.instantSneak)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Light Updates")
                        .setTooltip("Process lighting updates")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.extraSettings.lightUpdates = value, options -> options.extraSettings.lightUpdates)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Prevent Shaders")
                        .setTooltip("Prevents any types of shaders from loading")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.extraSettings.preventShaders = value, options -> options.extraSettings.preventShaders)
                        .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                        .build()
                )
                .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                        .setName("Use Fast Random")
                        .setTooltip("If enabled, a fast random function will be used for block rendering. This can affect the rotation of randomly rotated textures when compared to vanilla.")
                        .setControl(TickBoxControl::new)
                        .setBinding((options, value) -> options.extraSettings.useFastRandom = value, options -> options.extraSettings.useFastRandom)
                        .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                        .build()
                )
                .build());

        if(!SodiumExtraClientMod.options().extraSettings.hideCheats){
            groups.add(OptionGroup.createBuilder()
                    .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                            .setName("High Max Brightness")
                            .setTooltip("Allow max brightness to go up to 1000 (reopen video settings to take effect)")
                            .setControl(TickBoxControl::new)
                            .setBinding((options, value) -> options.extraSettings.highMaxBrightness = value, options -> options.extraSettings.highMaxBrightness)
                            .build()
                    )
                    .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                            .setName("Daylight Cycle")
                            .setTooltip("Shows the sun/moon and light according to the game time")
                            .setControl(TickBoxControl::new)
                            .setBinding((options, value) -> options.extraSettings.dayLightCycle = value, options -> options.extraSettings.dayLightCycle)
                            .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                            .build()
                    )
                    .add(OptionImpl.createBuilder(boolean.class, sodiumExtraOpts)
                            .setName("No Overlays")
                            .setTooltip("Disable camera overlays")
                            .setControl(TickBoxControl::new)
                            .setBinding((options, value) -> options.extraSettings.noOverlay = value, options -> options.extraSettings.noOverlay)
                            .setFlags(OptionFlag.REQUIRES_RENDERER_RELOAD)
                            .build()
                    )
                    .build());
        }

        return new OptionPage("Extras", ImmutableList.copyOf(groups));
    }
}
