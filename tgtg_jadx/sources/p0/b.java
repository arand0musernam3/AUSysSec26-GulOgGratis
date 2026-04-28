package p0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DYNAMIC_RANGE;
    public static final b FPS_RANGE;
    public static final b IMAGE_FORMAT;
    public static final b RECORDING_QUALITY;
    public static final b VIDEO_STABILIZATION;

    static {
        b bVar = new b("DYNAMIC_RANGE", 0);
        DYNAMIC_RANGE = bVar;
        b bVar2 = new b("FPS_RANGE", 1);
        FPS_RANGE = bVar2;
        b bVar3 = new b("VIDEO_STABILIZATION", 2);
        VIDEO_STABILIZATION = bVar3;
        b bVar4 = new b("IMAGE_FORMAT", 3);
        IMAGE_FORMAT = bVar4;
        b bVar5 = new b("RECORDING_QUALITY", 4);
        RECORDING_QUALITY = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
