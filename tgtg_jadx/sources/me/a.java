package me;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a REDUCED_MOTION;
    public static final a STANDARD_MOTION;

    static {
        a aVar = new a("STANDARD_MOTION", 0);
        STANDARD_MOTION = aVar;
        a aVar2 = new a("REDUCED_MOTION", 1);
        REDUCED_MOTION = aVar2;
        $VALUES = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
