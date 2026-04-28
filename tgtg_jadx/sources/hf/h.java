package hf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h V3;
    private final int rawValue = 3;

    static {
        h hVar = new h();
        V3 = hVar;
        h[] hVarArr = {hVar};
        $VALUES = hVarArr;
        $ENTRIES = new a80.b(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final int a() {
        return this.rawValue;
    }
}
