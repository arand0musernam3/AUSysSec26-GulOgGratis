package ty;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d DEFAULT;
    public static final d HIGHEST;
    public static final d VERY_LOW;

    static {
        d dVar = new d("DEFAULT", 0);
        DEFAULT = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        VERY_LOW = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        HIGHEST = dVar3;
        $VALUES = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
