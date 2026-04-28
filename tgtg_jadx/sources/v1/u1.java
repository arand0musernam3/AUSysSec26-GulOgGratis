package v1;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f41850a = new u1();

    @Override // v1.r1
    public final boolean a() {
        return true;
    }

    @Override // v1.r1
    public final q1 b(View view, boolean z11, long j9, float f11, float f12, boolean z12, z5.c cVar, float f13) {
        if (z11) {
            return new t1(new Magnifier(view));
        }
        long jX0 = cVar.x0(j9);
        float fC0 = cVar.c0(f11);
        float fC02 = cVar.c0(f12);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jX0 != 9205357640488583168L) {
            builder.setSize(j80.c.b(Float.intBitsToFloat((int) (jX0 >> 32))), j80.c.b(Float.intBitsToFloat((int) (jX0 & 4294967295L))));
        }
        if (!Float.isNaN(fC0)) {
            builder.setCornerRadius(fC0);
        }
        if (!Float.isNaN(fC02)) {
            builder.setElevation(fC02);
        }
        if (!Float.isNaN(f13)) {
            builder.setInitialZoom(f13);
        }
        builder.setClippingEnabled(z12);
        return new t1(builder.build());
    }
}
