package w2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y Deletion;
    public static final y Insertion;
    public static final y Replacement;
    public static final y Untransformed;

    static {
        y yVar = new y("Untransformed", 0);
        Untransformed = yVar;
        y yVar2 = new y("Insertion", 1);
        Insertion = yVar2;
        y yVar3 = new y("Replacement", 2);
        Replacement = yVar3;
        y yVar4 = new y("Deletion", 3);
        Deletion = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        $VALUES = yVarArr;
        $ENTRIES = new a80.b(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
