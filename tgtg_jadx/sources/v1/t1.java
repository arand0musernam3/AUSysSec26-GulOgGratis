package v1;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends fv.b {
    @Override // fv.b, v1.q1
    public final void a(long j9, long j11, float f11) {
        if (!Float.isNaN(f11)) {
            ((Magnifier) this.f17968a).setZoom(f11);
        }
        long j12 = 9223372034707292159L & j11;
        Magnifier magnifier = (Magnifier) this.f17968a;
        if (j12 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)));
        }
    }
}
