package w;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import s0.b1;
import s0.i1;
import s0.l1;
import s0.o2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f42780b = new t();

    @Override // w.r
    public final void a(o2 o2Var, i0.w wVar) {
        o2Var.getClass();
        super.a(o2Var, wVar);
        if (!(o2Var instanceof b1)) {
            i4.a.f("config is not ImageCaptureConfig");
            return;
        }
        i1 i1VarH = i1.h();
        b1 b1Var = (b1) o2Var;
        if (((ImageCapturePixelHDRPlusQuirk) y.c.a().b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
            s0.g gVar = b1.f38285b;
            if (b1Var.g(gVar)) {
                int iIntValue = ((Integer) b1Var.d(gVar)).intValue();
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    key.getClass();
                    i1VarH.v(y9.w.m(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    key2.getClass();
                    i1VarH.v(y9.w.m(key2), Boolean.FALSE);
                }
            }
        }
        wVar.e(new b0.b(l1.e(i1VarH)));
    }
}
