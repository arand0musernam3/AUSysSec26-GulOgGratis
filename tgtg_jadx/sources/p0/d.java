package p0;

import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34102a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f34103b = b.IMAGE_FORMAT;

    @Override // n0.b
    public final b a() {
        return this.f34103b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i11 = this.f34102a;
        return l1.f(sb2, i11 != 0 ? i11 != 1 ? a0.l("UNDEFINED(", i11, ')') : "JPEG_R" : "JPEG", ')');
    }
}
