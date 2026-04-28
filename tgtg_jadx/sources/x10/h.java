package x10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h DAY;
    public static final h YEAR;

    static {
        h hVar = new h("DAY", 0);
        DAY = hVar;
        h hVar2 = new h("YEAR", 1);
        YEAR = hVar2;
        $VALUES = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
