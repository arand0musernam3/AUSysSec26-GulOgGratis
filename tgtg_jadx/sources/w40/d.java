package w40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d BAD_CONFIG;
    public static final d OK;

    static {
        d dVar = new d("OK", 0);
        OK = dVar;
        d dVar2 = new d("BAD_CONFIG", 1);
        BAD_CONFIG = dVar2;
        $VALUES = new d[]{dVar, dVar2};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
