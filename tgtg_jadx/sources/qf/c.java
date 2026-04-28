package qf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c Before;
    public static final c Destination;
    public static final c Enrichment;
    public static final c Observe;
    public static final c Utility;

    static {
        c cVar = new c("Before", 0);
        Before = cVar;
        c cVar2 = new c("Enrichment", 1);
        Enrichment = cVar2;
        c cVar3 = new c("Destination", 2);
        Destination = cVar3;
        c cVar4 = new c("Utility", 3);
        Utility = cVar4;
        c cVar5 = new c("Observe", 4);
        Observe = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
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
