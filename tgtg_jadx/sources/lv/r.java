package lv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r PRIMARY;
    public static final r SECONDARY;
    public static final r TERTIARY;

    static {
        r rVar = new r("PRIMARY", 0);
        PRIMARY = rVar;
        r rVar2 = new r("SECONDARY", 1);
        SECONDARY = rVar2;
        r rVar3 = new r("TERTIARY", 2);
        TERTIARY = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
        $VALUES = rVarArr;
        $ENTRIES = new a80.b(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
