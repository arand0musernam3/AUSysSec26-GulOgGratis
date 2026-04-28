package y9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n ADD;
    public static final n NO_OP;
    public static final n REMOVE;

    static {
        n nVar = new n("NO_OP", 0);
        NO_OP = nVar;
        n nVar2 = new n("ADD", 1);
        ADD = nVar2;
        n nVar3 = new n("REMOVE", 2);
        REMOVE = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        $VALUES = nVarArr;
        $ENTRIES = new a80.b(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
