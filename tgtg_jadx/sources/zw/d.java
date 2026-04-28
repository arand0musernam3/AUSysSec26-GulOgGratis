package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d DASHMATCH;
    public static final d EQUALS;
    public static final d EXISTS;
    public static final d INCLUDES;

    static {
        d dVar = new d("EXISTS", 0);
        EXISTS = dVar;
        d dVar2 = new d("EQUALS", 1);
        EQUALS = dVar2;
        d dVar3 = new d("INCLUDES", 2);
        INCLUDES = dVar3;
        d dVar4 = new d("DASHMATCH", 3);
        DASHMATCH = dVar4;
        $VALUES = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
