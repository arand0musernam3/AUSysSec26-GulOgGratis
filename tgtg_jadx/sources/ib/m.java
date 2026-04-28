package ib;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m APPEND;
    public static final m APPEND_OR_REPLACE;
    public static final m KEEP;
    public static final m REPLACE;

    static {
        m mVar = new m("REPLACE", 0);
        REPLACE = mVar;
        m mVar2 = new m("KEEP", 1);
        KEEP = mVar2;
        m mVar3 = new m("APPEND", 2);
        APPEND = mVar3;
        m mVar4 = new m("APPEND_OR_REPLACE", 3);
        APPEND_OR_REPLACE = mVar4;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4};
        $VALUES = mVarArr;
        $ENTRIES = new a80.b(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
