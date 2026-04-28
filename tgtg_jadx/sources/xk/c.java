package xk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c DEFAULT;
    public static final c MAX;
    public static final c MIN;
    public static final c STEP;
    private final double radius;

    static {
        c cVar = new c("MIN", 0, 1.0d);
        MIN = cVar;
        c cVar2 = new c("DEFAULT", 1, 10.0d);
        DEFAULT = cVar2;
        c cVar3 = new c("MAX", 2, 30.0d);
        MAX = cVar3;
        c cVar4 = new c("STEP", 3, 1.0d);
        STEP = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = new a80.b(cVarArr);
    }

    public c(String str, int i11, double d3) {
        this.radius = d3;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final double a() {
        return this.radius;
    }
}
