package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    private static final /* synthetic */ r[] $VALUES;
    public static final r OFF;
    public static final r ON;
    public static final r ON_ALWAYS_FLASH;
    public static final r ON_AUTO_FLASH;
    public static final r ON_AUTO_FLASH_REDEYE;
    public static final r ON_EXTERNAL_FLASH;
    public static final r UNKNOWN;

    static {
        r rVar = new r("UNKNOWN", 0);
        UNKNOWN = rVar;
        r rVar2 = new r("OFF", 1);
        OFF = rVar2;
        r rVar3 = new r("ON", 2);
        ON = rVar3;
        r rVar4 = new r("ON_AUTO_FLASH", 3);
        ON_AUTO_FLASH = rVar4;
        r rVar5 = new r("ON_ALWAYS_FLASH", 4);
        ON_ALWAYS_FLASH = rVar5;
        r rVar6 = new r("ON_AUTO_FLASH_REDEYE", 5);
        ON_AUTO_FLASH_REDEYE = rVar6;
        r rVar7 = new r("ON_EXTERNAL_FLASH", 6);
        ON_EXTERNAL_FLASH = rVar7;
        $VALUES = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
