package s0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends t1 {
    public static u1 d(o2 o2Var, Size size) {
        if (((w.s) o2Var.i(o2.L0, null)) == null) {
            m0.i1.q((String) o2Var.i(y0.i.f44569d1, o2Var.toString()), "Implementation is missing option unpacker for ");
            return null;
        }
        u1 u1Var = new u1();
        size.getClass();
        z1 z1Var = (z1) o2Var.i(o2.J0, null);
        l1 l1Var = l1.f38382c;
        l1Var.getClass();
        int i11 = z1.a().f38494g.f38440c;
        ArrayList arrayList = u1Var.f38449d;
        ArrayList arrayList2 = u1Var.f38448c;
        i0.w wVar = u1Var.f38447b;
        if (z1Var != null) {
            r0 r0Var = z1Var.f38494g;
            i11 = r0Var.f38440c;
            for (CameraDevice.StateCallback stateCallback : z1Var.f38490c) {
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : z1Var.f38491d) {
                if (!arrayList.contains(stateCallback2)) {
                    arrayList.add(stateCallback2);
                }
            }
            wVar.b(r0Var.f38441d);
            l1Var = r0Var.f38439b;
        }
        wVar.getClass();
        wVar.f22747d = i1.s(l1Var);
        if (o2Var instanceof m1) {
            Rational rational = z.g.f46374a;
            if (((PreviewPixelHDRnetQuirk) y.c.a().b(PreviewPixelHDRnetQuirk.class)) != null && !Intrinsics.areEqual(z.g.f46374a, new Rational(size.getWidth(), size.getHeight()))) {
                i1 i1VarH = i1.h();
                CaptureRequest.Key key = CaptureRequest.TONEMAP_MODE;
                key.getClass();
                i1VarH.v(y9.w.m(key), 2);
                wVar.e(new b0.b(l1.e(i1VarH)));
            }
        }
        new b0.b(o2Var);
        Object objI = o2Var.i(b0.b.f5055d, Integer.valueOf(i11));
        objI.getClass();
        wVar.f22745b = ((Number) objI).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) o2Var.i(b0.b.f5056e, null);
        if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
            arrayList2.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) o2Var.i(b0.b.f5057f, null);
        if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
            arrayList.add(stateCallback4);
        }
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) o2Var.i(b0.b.f5058g, null);
        if (captureCallback != null) {
            w.q qVar = new w.q(captureCallback);
            wVar.c(qVar);
            ArrayList arrayList3 = u1Var.f38450e;
            if (!arrayList3.contains(qVar)) {
                arrayList3.add(qVar);
            }
        }
        int iT = o2Var.t();
        if (iT != 0) {
            wVar.getClass();
            if (iT != 0) {
                ((i1) wVar.f22747d).v(o2.V0, Integer.valueOf(iT));
            }
        }
        int iO = o2Var.o();
        if (iO != 0) {
            wVar.getClass();
            if (iO != 0) {
                ((i1) wVar.f22747d).v(o2.W0, Integer.valueOf(iO));
            }
        }
        i1 i1VarH2 = i1.h();
        g gVar = b0.b.f5061j;
        String str = (String) o2Var.i(gVar, null);
        if (str != null) {
            i1VarH2.v(gVar, str);
        }
        g gVar2 = b0.b.f5059h;
        Long l = (Long) o2Var.i(gVar2, null);
        if (l != null) {
            i1VarH2.v(gVar2, Long.valueOf(l.longValue()));
        }
        wVar.e(i1VarH2);
        a50.c cVar = new a50.c(12);
        o2Var.j(new a50.d(11, cVar, o2Var));
        wVar.e(new lz.i(l1.e((i1) cVar.f822b)));
        return u1Var;
    }

    public final void a(u0 u0Var) {
        this.f38447b.e(u0Var);
    }

    public final void b(x0 x0Var, m0.c0 c0Var, int i11) {
        androidx.lifecycle.n1 n1VarA = l.a(x0Var);
        if (c0Var == null) {
            c50.w.l("Null dynamicRange");
            return;
        }
        n1VarA.f3503e = c0Var;
        n1VarA.f3501c = Integer.valueOf(i11);
        this.f38446a.add(n1VarA.g());
        ((HashSet) this.f38447b.f22746c).add(x0Var);
    }

    public final z1 c() {
        return new z1(new ArrayList(this.f38446a), new ArrayList(this.f38448c), new ArrayList(this.f38449d), new ArrayList(this.f38450e), this.f38447b.h(), this.f38451f, this.f38452g, this.f38453h, this.f38454i);
    }
}
