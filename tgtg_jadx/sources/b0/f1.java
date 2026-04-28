package b0;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.util.Rational;
import androidx.camera.core.CameraControl$OperationCanceledException;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x.g f5177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w.d0 f5178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o2 f5179c;

    public f1(x.g gVar) {
        gVar.getClass();
        this.f5177a = gVar;
        this.f5178b = new w.d0(gVar.f43608d, 0, gVar.f43607c, gVar.f43609e);
    }

    @Override // b0.h2
    public final void a(o2 o2Var) {
        this.f5179c = o2Var;
        b(false);
    }

    public final v80.q b(boolean z11) {
        x.g gVar = this.f5177a;
        boolean z12 = gVar.f43608d;
        Range range = gVar.f43607c;
        if (!z12) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
            v80.q qVar = new v80.q();
            qVar.h0(illegalArgumentException);
            return qVar;
        }
        if (!range.contains(0)) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + range.getUpper() + " .. " + range.getLower() + ']');
            v80.q qVar2 = new v80.q();
            qVar2.h0(illegalArgumentException2);
            return qVar2;
        }
        o2 o2Var = this.f5179c;
        if (o2Var == null) {
            CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera is not active.");
            v80.q qVar3 = gVar.f43610f;
            if (qVar3 != null) {
                qVar3.h0(cameraControl$OperationCanceledException);
            }
            v80.q qVar4 = new v80.q();
            qVar4.h0(cameraControl$OperationCanceledException);
            return qVar4;
        }
        w.d0 d0Var = this.f5178b;
        boolean z13 = d0Var.f42663a;
        Range range2 = d0Var.f42665c;
        Rational rational = d0Var.f42666d;
        range2.getClass();
        rational.getClass();
        this.f5178b = new w.d0(z13, 0, range2, rational);
        x0 x0Var = gVar.f43606b;
        v80.q qVar5 = new v80.q();
        v80.q qVar6 = gVar.f43610f;
        if (qVar6 != null) {
            if (z11) {
                w2.l1.k("Cancelled by another setExposureCompensationIndex()", qVar6);
            } else {
                v0.n.C(qVar5, qVar6);
            }
        }
        gVar.f43610f = qVar5;
        x.f fVar = gVar.f43611g;
        if (fVar != null) {
            x0Var.b(fVar);
            gVar.f43611g = null;
        }
        o2.k(o2Var, kotlin.collections.w0.b(new Pair(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0)));
        x.f fVar2 = new x.f(qVar5);
        x0Var.a(fVar2, gVar.f43605a.f5269e);
        qVar5.J(new ry.b(28, gVar, fVar2));
        gVar.f43611g = fVar2;
        return qVar5;
    }

    @Override // b0.h2
    public final void reset() {
        w.d0 d0Var = this.f5178b;
        boolean z11 = d0Var.f42663a;
        Range range = d0Var.f42665c;
        Rational rational = d0Var.f42666d;
        range.getClass();
        rational.getClass();
        this.f5178b = new w.d0(z11, 0, range, rational);
        b(true);
    }
}
