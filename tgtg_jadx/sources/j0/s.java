package j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s COMPLETE;
    public static final s FRAME_INFO_COMPLETE;
    public static final s STARTED;
    public static final s STREAM_RESULTS_COMPLETE;

    static {
        s sVar = new s("STARTED", 0);
        STARTED = sVar;
        s sVar2 = new s("FRAME_INFO_COMPLETE", 1);
        FRAME_INFO_COMPLETE = sVar2;
        s sVar3 = new s("STREAM_RESULTS_COMPLETE", 2);
        STREAM_RESULTS_COMPLETE = sVar3;
        s sVar4 = new s("COMPLETE", 3);
        COMPLETE = sVar4;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
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
