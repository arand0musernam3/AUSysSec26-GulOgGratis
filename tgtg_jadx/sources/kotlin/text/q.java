package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q CANON_EQ;
    public static final q COMMENTS;
    public static final q DOT_MATCHES_ALL;
    public static final q IGNORE_CASE;
    public static final q LITERAL;
    public static final q MULTILINE;
    public static final q UNIX_LINES;
    private final int mask;
    private final int value;

    static {
        q qVar = new q("IGNORE_CASE", 0, 2, 0, 2, null);
        IGNORE_CASE = qVar;
        q qVar2 = new q("MULTILINE", 1, 8, 0, 2, null);
        MULTILINE = qVar2;
        q qVar3 = new q("LITERAL", 2, 16, 0, 2, null);
        LITERAL = qVar3;
        q qVar4 = new q("UNIX_LINES", 3, 1, 0, 2, null);
        UNIX_LINES = qVar4;
        q qVar5 = new q("COMMENTS", 4, 4, 0, 2, null);
        COMMENTS = qVar5;
        q qVar6 = new q("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
        DOT_MATCHES_ALL = qVar6;
        q qVar7 = new q("CANON_EQ", 6, 128, 0, 2, null);
        CANON_EQ = qVar7;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7};
        $VALUES = qVarArr;
        $ENTRIES = new a80.b(qVarArr);
    }

    public q(String str, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        i13 = (i14 & 2) != 0 ? i12 : i13;
        this.value = i12;
        this.mask = i13;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final int a() {
        return this.value;
    }
}
