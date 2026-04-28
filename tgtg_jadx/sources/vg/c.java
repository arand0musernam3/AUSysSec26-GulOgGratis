package vg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c EMPTY;
    public static final c MAP;
    public static final c SEARCH_RESULTS;

    static {
        c cVar = new c("MAP", 0);
        MAP = cVar;
        c cVar2 = new c("EMPTY", 1);
        EMPTY = cVar2;
        c cVar3 = new c("SEARCH_RESULTS", 2);
        SEARCH_RESULTS = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = new a80.b(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
