package f0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f16721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f16722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f16723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w2.z f16724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f16725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r80.d f16726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r80.d f16727g;

    public j(d dVar, p1 p1Var, c4 c4Var, j1 j1Var, w2.z zVar, Handler handler) {
        p1Var.getClass();
        j1Var.getClass();
        handler.getClass();
        this.f16721a = dVar;
        this.f16722b = p1Var;
        this.f16723c = j1Var;
        this.f16724d = zVar;
        this.f16725e = handler;
        this.f16726f = w.b.r(c4Var);
        this.f16727g = w.b.r(null);
    }

    public final q1 a(CameraCaptureSession cameraCaptureSession, j1 j1Var) {
        q1 q1Var = (q1) this.f16727g.f37785a;
        if (q1Var != null) {
            return q1Var;
        }
        Handler handler = this.f16725e;
        boolean z11 = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
        d dVar = this.f16721a;
        q1 cVar = z11 ? new c(dVar, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, j1Var, handler) : new b(dVar, cameraCaptureSession, j1Var, handler);
        if (this.f16727g.a(null, cVar)) {
            return cVar;
        }
        Object obj = this.f16727g.f37785a;
        obj.getClass();
        return (q1) obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.f16723c);
        this.f16722b.h(a(cameraCaptureSession, this.f16723c));
        w2.z zVar = this.f16724d;
        if (zVar != null) {
            this.f16721a.f16599c.getClass();
            Iterator it = ((List) ((r80.d) zVar.f43084c).f37785a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive((b0.u1) zVar.f43083b);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.f16723c);
        this.f16722b.e(a(cameraCaptureSession, this.f16723c));
        w2.z zVar = this.f16724d;
        if (zVar != null) {
            this.f16721a.f16599c.getClass();
            b0.u1 u1Var = (b0.u1) zVar.f43083b;
            r80.d dVar = (r80.d) zVar.f43084c;
            u1Var.getClass();
            dVar.getClass();
            Iterator it = ((List) dVar.f37785a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(u1Var);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        j1 j1Var = this.f16723c;
        a(cameraCaptureSession, j1Var);
        q1 q1VarA = a(cameraCaptureSession, j1Var);
        p1 p1Var = this.f16722b;
        p1Var.f(q1VarA);
        r80.d dVar = this.f16726f;
        dVar.getClass();
        c4 c4Var = (c4) r80.d.f37784b.getAndSet(dVar, null);
        if (c4Var != null) {
            c4Var.a();
        }
        p1Var.a();
        w2.z zVar = this.f16724d;
        if (zVar != null) {
            zVar.x(this.f16721a.f16599c);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        q1 q1VarA = a(cameraCaptureSession, this.f16723c);
        p1 p1Var = this.f16722b;
        p1Var.g(q1VarA);
        r80.d dVar = this.f16726f;
        dVar.getClass();
        c4 c4Var = (c4) r80.d.f37784b.getAndSet(dVar, null);
        if (c4Var != null) {
            c4Var.a();
        }
        p1Var.a();
        w2.z zVar = this.f16724d;
        if (zVar != null) {
            zVar.y(this.f16721a.f16599c);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        this.f16722b.c(a(cameraCaptureSession, this.f16723c));
        r80.d dVar = this.f16726f;
        dVar.getClass();
        c4 c4Var = (c4) r80.d.f37784b.getAndSet(dVar, null);
        if (c4Var != null) {
            c4Var.a();
        }
        w2.z zVar = this.f16724d;
        if (zVar != null) {
            zVar.z(this.f16721a.f16599c);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.f16723c);
        this.f16722b.d(a(cameraCaptureSession, this.f16723c));
        w2.z zVar = this.f16724d;
        if (zVar != null) {
            this.f16721a.f16599c.getClass();
            Iterator it = ((List) ((r80.d) zVar.f43084c).f37785a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady((b0.u1) zVar.f43083b);
            }
        }
    }
}
