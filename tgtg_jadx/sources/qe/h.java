package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h ADD;
    public static final h COLOR;
    public static final h COLOR_BURN;
    public static final h COLOR_DODGE;
    public static final h DARKEN;
    public static final h DIFFERENCE;
    public static final h EXCLUSION;
    public static final h HARD_LIGHT;
    public static final h HARD_MIX;
    public static final h HUE;
    public static final h LIGHTEN;
    public static final h LUMINOSITY;
    public static final h MULTIPLY;
    public static final h NORMAL;
    public static final h OVERLAY;
    public static final h SATURATION;
    public static final h SCREEN;
    public static final h SOFT_LIGHT;

    static {
        h hVar = new h("NORMAL", 0);
        NORMAL = hVar;
        h hVar2 = new h("MULTIPLY", 1);
        MULTIPLY = hVar2;
        h hVar3 = new h("SCREEN", 2);
        SCREEN = hVar3;
        h hVar4 = new h("OVERLAY", 3);
        OVERLAY = hVar4;
        h hVar5 = new h("DARKEN", 4);
        DARKEN = hVar5;
        h hVar6 = new h("LIGHTEN", 5);
        LIGHTEN = hVar6;
        h hVar7 = new h("COLOR_DODGE", 6);
        COLOR_DODGE = hVar7;
        h hVar8 = new h("COLOR_BURN", 7);
        COLOR_BURN = hVar8;
        h hVar9 = new h("HARD_LIGHT", 8);
        HARD_LIGHT = hVar9;
        h hVar10 = new h("SOFT_LIGHT", 9);
        SOFT_LIGHT = hVar10;
        h hVar11 = new h("DIFFERENCE", 10);
        DIFFERENCE = hVar11;
        h hVar12 = new h("EXCLUSION", 11);
        EXCLUSION = hVar12;
        h hVar13 = new h("HUE", 12);
        HUE = hVar13;
        h hVar14 = new h("SATURATION", 13);
        SATURATION = hVar14;
        h hVar15 = new h("COLOR", 14);
        COLOR = hVar15;
        h hVar16 = new h("LUMINOSITY", 15);
        LUMINOSITY = hVar16;
        h hVar17 = new h("ADD", 16);
        ADD = hVar17;
        h hVar18 = new h("HARD_MIX", 17);
        HARD_MIX = hVar18;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16, hVar17, hVar18};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
