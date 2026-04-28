package ib;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CANCEL_AND_REENQUEUE;
    public static final l KEEP;

    @u70.d
    public static final l REPLACE;
    public static final l UPDATE;

    static {
        l lVar = new l("REPLACE", 0);
        REPLACE = lVar;
        l lVar2 = new l("KEEP", 1);
        KEEP = lVar2;
        l lVar3 = new l("UPDATE", 2);
        UPDATE = lVar3;
        l lVar4 = new l("CANCEL_AND_REENQUEUE", 3);
        CANCEL_AND_REENQUEUE = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
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
