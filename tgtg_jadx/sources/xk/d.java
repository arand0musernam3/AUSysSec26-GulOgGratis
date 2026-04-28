package xk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DEFAULT;
    public static final d MAX;
    public static final d MIN;
    public static final d STEP;
    private final double radius;

    static {
        d dVar = new d("MIN", 0, 1.0d);
        MIN = dVar;
        d dVar2 = new d("DEFAULT", 1, 5.0d);
        DEFAULT = dVar2;
        d dVar3 = new d("MAX", 2, 20.0d);
        MAX = dVar3;
        d dVar4 = new d("STEP", 3, 1.0d);
        STEP = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = new a80.b(dVarArr);
    }

    public d(String str, int i11, double d3) {
        this.radius = d3;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final double a() {
        return this.radius;
    }
}
