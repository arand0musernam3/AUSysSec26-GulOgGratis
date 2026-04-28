package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s CONVERGED;
    public static final s FLASH_REQUIRED;
    public static final s INACTIVE;
    public static final s LOCKED;
    public static final s SEARCHING;
    public static final s UNKNOWN;

    static {
        s sVar = new s("UNKNOWN", 0);
        UNKNOWN = sVar;
        s sVar2 = new s("INACTIVE", 1);
        INACTIVE = sVar2;
        s sVar3 = new s("SEARCHING", 2);
        SEARCHING = sVar3;
        s sVar4 = new s("FLASH_REQUIRED", 3);
        FLASH_REQUIRED = sVar4;
        s sVar5 = new s("CONVERGED", 4);
        CONVERGED = sVar5;
        s sVar6 = new s("LOCKED", 5);
        LOCKED = sVar6;
        $VALUES = new s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
