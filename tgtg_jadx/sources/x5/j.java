package x5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j Ltr;
    public static final j Rtl;

    static {
        j jVar = new j("Ltr", 0);
        Ltr = jVar;
        j jVar2 = new j("Rtl", 1);
        Rtl = jVar2;
        j[] jVarArr = {jVar, jVar2};
        $VALUES = jVarArr;
        $ENTRIES = new a80.b(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
