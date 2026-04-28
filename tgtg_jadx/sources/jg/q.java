package jg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q HeaderItem;
    public static final q ProvinceItem;

    static {
        q qVar = new q("ProvinceItem", 0);
        ProvinceItem = qVar;
        q qVar2 = new q("HeaderItem", 1);
        HeaderItem = qVar2;
        q[] qVarArr = {qVar, qVar2};
        $VALUES = qVarArr;
        $ENTRIES = new a80.b(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
