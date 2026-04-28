package a3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l AFTER;
    public static final l BEFORE;
    public static final l ON;

    static {
        l lVar = new l("BEFORE", 0);
        BEFORE = lVar;
        l lVar2 = new l("ON", 1);
        ON = lVar2;
        l lVar3 = new l("AFTER", 2);
        AFTER = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = new a80.b(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
