package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {
    private static final /* synthetic */ q2[] $VALUES;
    public static final q2 IMAGE_ANALYSIS;
    public static final q2 IMAGE_CAPTURE;
    public static final q2 METERING_REPEATING;
    public static final q2 PREVIEW;
    public static final q2 STREAM_SHARING;
    public static final q2 VIDEO_CAPTURE;

    static {
        q2 q2Var = new q2("IMAGE_CAPTURE", 0);
        IMAGE_CAPTURE = q2Var;
        q2 q2Var2 = new q2("PREVIEW", 1);
        PREVIEW = q2Var2;
        q2 q2Var3 = new q2("IMAGE_ANALYSIS", 2);
        IMAGE_ANALYSIS = q2Var3;
        q2 q2Var4 = new q2("VIDEO_CAPTURE", 3);
        VIDEO_CAPTURE = q2Var4;
        q2 q2Var5 = new q2("STREAM_SHARING", 4);
        STREAM_SHARING = q2Var5;
        q2 q2Var6 = new q2("METERING_REPEATING", 5);
        METERING_REPEATING = q2Var6;
        $VALUES = new q2[]{q2Var, q2Var2, q2Var3, q2Var4, q2Var5, q2Var6};
    }

    public static q2 valueOf(String str) {
        return (q2) Enum.valueOf(q2.class, str);
    }

    public static q2[] values() {
        return (q2[]) $VALUES.clone();
    }
}
