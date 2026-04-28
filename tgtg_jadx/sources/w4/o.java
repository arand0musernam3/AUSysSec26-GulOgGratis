package w4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o Final;
    public static final o Initial;
    public static final o Main;

    static {
        o oVar = new o("Initial", 0);
        Initial = oVar;
        o oVar2 = new o("Main", 1);
        Main = oVar2;
        o oVar3 = new o("Final", 2);
        Final = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = new a80.b(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
