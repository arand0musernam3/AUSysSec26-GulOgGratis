package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ c2[] $VALUES;
    public static final c2 CROPPED_RAW;
    public static final c2 DEFAULT;
    public static final c2 PREVIEW;
    public static final c2 PREVIEW_VIDEO_STILL;
    public static final c2 STILL_CAPTURE;
    public static final c2 VIDEO_CALL;
    public static final c2 VIDEO_RECORD;
    private final long value;

    static {
        c2 c2Var = new c2("DEFAULT", 0, 0);
        DEFAULT = c2Var;
        c2 c2Var2 = new c2("PREVIEW", 1, 1);
        PREVIEW = c2Var2;
        c2 c2Var3 = new c2("VIDEO_RECORD", 2, 3);
        VIDEO_RECORD = c2Var3;
        c2 c2Var4 = new c2("STILL_CAPTURE", 3, 2);
        STILL_CAPTURE = c2Var4;
        c2 c2Var5 = new c2("VIDEO_CALL", 4, 5);
        VIDEO_CALL = c2Var5;
        c2 c2Var6 = new c2("PREVIEW_VIDEO_STILL", 5, 4);
        PREVIEW_VIDEO_STILL = c2Var6;
        c2 c2Var7 = new c2("CROPPED_RAW", 6, 6);
        CROPPED_RAW = c2Var7;
        c2[] c2VarArr = {c2Var, c2Var2, c2Var3, c2Var4, c2Var5, c2Var6, c2Var7};
        $VALUES = c2VarArr;
        $ENTRIES = new a80.b(c2VarArr);
    }

    public c2(String str, int i11, int i12) {
        this.value = i12;
    }

    public static c2 valueOf(String str) {
        return (c2) Enum.valueOf(c2.class, str);
    }

    public static c2[] values() {
        return (c2[]) $VALUES.clone();
    }

    public final long a() {
        return this.value;
    }
}
