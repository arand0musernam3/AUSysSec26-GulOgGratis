package e0;

import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15389a;

    public static final String a(int i11) {
        if (i11 == 0) {
            return "UNKNOWN";
        }
        if (i11 == 34) {
            return "PRIVATE";
        }
        if (i11 == 1144402265) {
            return "DEPTH16";
        }
        if (i11 == 1768253795) {
            return "DEPTH_JPEG";
        }
        if (i11 == 257) {
            return "DEPTH_POINT_CLOUD";
        }
        if (i11 == 41) {
            return "FLEX_RGB_888";
        }
        if (i11 == 42) {
            return "FLEX_RGBA_8888";
        }
        if (i11 == 1212500294) {
            return "HEIC";
        }
        if (i11 == 256) {
            return "JPEG";
        }
        if (i11 == 4101) {
            return "JPEG_R";
        }
        if (i11 == 16) {
            return "NV16";
        }
        if (i11 == 17) {
            return "NV21";
        }
        if (i11 == 37) {
            return "RAW10";
        }
        if (i11 == 38) {
            return "RAW12";
        }
        if (i11 == 4098) {
            return "RAW_DEPTH";
        }
        if (i11 == 36) {
            return "RAW_PRIVATE";
        }
        if (i11 == 32) {
            return "RAW_SENSOR";
        }
        if (i11 == 4) {
            return "RGB_565";
        }
        if (i11 == 842094169) {
            return "Y12";
        }
        if (i11 == 540422489) {
            return "Y16";
        }
        if (i11 == 538982489) {
            return "Y8";
        }
        if (i11 == 54) {
            return "YCBCR_P010";
        }
        if (i11 == 35) {
            return "YUV_420_888";
        }
        if (i11 == 39) {
            return "YUV_422_888";
        }
        if (i11 == 40) {
            return "YUV_444_888";
        }
        if (i11 == 20) {
            return "YUY2";
        }
        if (i11 == 842094169) {
            return "YV12";
        }
        StringBuilder sb2 = new StringBuilder("UNKNOWN(");
        String string = Integer.toString(i11, CharsKt.checkRadix(16));
        string.getClass();
        sb2.append(string);
        sb2.append(')');
        return sb2.toString();
    }

    public static String b(int i11) {
        return "StreamFormat(" + a(i11) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            return this.f15389a == ((o1) obj).f15389a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15389a);
    }

    public final String toString() {
        return b(this.f15389a);
    }
}
