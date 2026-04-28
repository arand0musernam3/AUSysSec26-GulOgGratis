package ka;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BEGIN_DEFERRED;
    public static final c BEGIN_EXCLUSIVE;
    public static final c BEGIN_IMMEDIATE;
    public static final c END;
    public static final c ROLLBACK;

    static {
        c cVar = new c("END", 0);
        END = cVar;
        c cVar2 = new c("ROLLBACK", 1);
        ROLLBACK = cVar2;
        c cVar3 = new c("BEGIN_EXCLUSIVE", 2);
        BEGIN_EXCLUSIVE = cVar3;
        c cVar4 = new c("BEGIN_IMMEDIATE", 3);
        BEGIN_IMMEDIATE = cVar4;
        c cVar5 = new c("BEGIN_DEFERRED", 4);
        BEGIN_DEFERRED = cVar5;
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
