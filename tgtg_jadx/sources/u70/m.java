package u70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m NONE;
    public static final m PUBLICATION;
    public static final m SYNCHRONIZED;

    static {
        m mVar = new m("SYNCHRONIZED", 0);
        SYNCHRONIZED = mVar;
        m mVar2 = new m("PUBLICATION", 1);
        PUBLICATION = mVar2;
        m mVar3 = new m("NONE", 2);
        NONE = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
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
