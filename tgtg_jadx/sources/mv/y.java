package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y MAIN_START;
    public static final y MNU_PURCHASE_COMPLETE;
    public static final y NONE;
    public static final y PURCHASE_COMPLETE;

    static {
        y yVar = new y("MAIN_START", 0);
        MAIN_START = yVar;
        y yVar2 = new y("PURCHASE_COMPLETE", 1);
        PURCHASE_COMPLETE = yVar2;
        y yVar3 = new y("NONE", 2);
        NONE = yVar3;
        y yVar4 = new y("MNU_PURCHASE_COMPLETE", 3);
        MNU_PURCHASE_COMPLETE = yVar4;
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
