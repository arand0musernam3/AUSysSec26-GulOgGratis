package pf;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ADD;
    public static final c APPEND;
    public static final c CLEAR_ALL;
    public static final c POST_INSERT;
    public static final c PREPEND;
    public static final c PRE_INSERT;
    public static final c REMOVE;
    public static final c SET;
    public static final c SET_ONCE;
    public static final c UNSET;

    @NotNull
    private final String operationType;

    static {
        c cVar = new c("SET", 0, "$set");
        SET = cVar;
        c cVar2 = new c("SET_ONCE", 1, "$setOnce");
        SET_ONCE = cVar2;
        c cVar3 = new c("ADD", 2, "$add");
        ADD = cVar3;
        c cVar4 = new c("APPEND", 3, "$append");
        APPEND = cVar4;
        c cVar5 = new c("CLEAR_ALL", 4, "$clearAll");
        CLEAR_ALL = cVar5;
        c cVar6 = new c("PREPEND", 5, "$prepend");
        PREPEND = cVar6;
        c cVar7 = new c("UNSET", 6, "$unset");
        UNSET = cVar7;
        c cVar8 = new c("PRE_INSERT", 7, "$preInsert");
        PRE_INSERT = cVar8;
        c cVar9 = new c("POST_INSERT", 8, "$postInsert");
        POST_INSERT = cVar9;
        c cVar10 = new c("REMOVE", 9, "$remove");
        REMOVE = cVar10;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10};
        $VALUES = cVarArr;
        $ENTRIES = new a80.b(cVarArr);
    }

    public c(String str, int i11, String str2) {
        this.operationType = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        return this.operationType;
    }
}
