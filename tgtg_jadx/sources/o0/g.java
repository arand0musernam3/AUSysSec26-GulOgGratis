package o0;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    public static final e Companion;
    public static final g IMAGE_ANALYSIS;
    public static final g IMAGE_CAPTURE;
    public static final g PREVIEW;
    public static final g STREAM_SHARING;
    public static final g UNDEFINED;
    public static final g VIDEO_CAPTURE;

    @Nullable
    private final Class<?> surfaceClass;

    static {
        g gVar = new g(0, "PREVIEW", SurfaceHolder.class);
        PREVIEW = gVar;
        g gVar2 = new g(1, "IMAGE_CAPTURE", null);
        IMAGE_CAPTURE = gVar2;
        g gVar3 = new g(2, "IMAGE_ANALYSIS", null);
        IMAGE_ANALYSIS = gVar3;
        g gVar4 = new g(3, "VIDEO_CAPTURE", MediaCodec.class);
        VIDEO_CAPTURE = gVar4;
        g gVar5 = new g(4, "STREAM_SHARING", SurfaceTexture.class);
        STREAM_SHARING = gVar5;
        g gVar6 = new g(5, "UNDEFINED", null);
        UNDEFINED = gVar6;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
        $VALUES = gVarArr;
        $ENTRIES = new a80.b(gVarArr);
        Companion = new e();
    }

    public g(int i11, String str, Class cls) {
        this.surfaceClass = cls;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final Class a() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (f.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "Preview";
            case 2:
                return "ImageCapture";
            case 3:
                return "ImageAnalysis";
            case 4:
                return "VideoCapture";
            case 5:
                return "StreamSharing";
            case 6:
                return "Undefined";
            default:
                e40.a.f();
                return null;
        }
    }
}
