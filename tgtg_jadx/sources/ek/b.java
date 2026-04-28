package ek;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b GO_TO_HOW_TGTG_WORKS;
    public static final b GO_TO_JOIN_TGTG;
    public static final b GO_TO_ORDER_HELP;

    static {
        b bVar = new b("GO_TO_ORDER_HELP", 0);
        GO_TO_ORDER_HELP = bVar;
        b bVar2 = new b("GO_TO_HOW_TGTG_WORKS", 1);
        GO_TO_HOW_TGTG_WORKS = bVar2;
        b bVar3 = new b("GO_TO_JOIN_TGTG", 2);
        GO_TO_JOIN_TGTG = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
