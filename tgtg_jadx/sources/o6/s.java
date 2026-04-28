package o6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s CENTER;
    public static final s END;
    public static final s NONE;
    public static final s START;

    static {
        s sVar = new s("NONE", 0);
        NONE = sVar;
        s sVar2 = new s("START", 1);
        START = sVar2;
        s sVar3 = new s("END", 2);
        END = sVar3;
        s sVar4 = new s("CENTER", 3);
        CENTER = sVar4;
        $VALUES = new s[]{sVar, sVar2, sVar3, sVar4};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
