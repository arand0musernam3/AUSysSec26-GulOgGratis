package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s MAIN_CAPTURE;
    public static final s POST_CAPTURE;
    public static final s PRE_CAPTURE;

    static {
        s sVar = new s("PRE_CAPTURE", 0);
        PRE_CAPTURE = sVar;
        s sVar2 = new s("MAIN_CAPTURE", 1);
        MAIN_CAPTURE = sVar2;
        s sVar3 = new s("POST_CAPTURE", 2);
        POST_CAPTURE = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        $VALUES = sVarArr;
        $ENTRIES = new a80.b(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
