package lv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q DANGER;
    public static final q GREY;
    public static final q INVERTED;
    public static final q REGULAR;

    static {
        q qVar = new q("REGULAR", 0);
        REGULAR = qVar;
        q qVar2 = new q("DANGER", 1);
        DANGER = qVar2;
        q qVar3 = new q("GREY", 2);
        GREY = qVar3;
        q qVar4 = new q("INVERTED", 3);
        INVERTED = qVar4;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4};
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
