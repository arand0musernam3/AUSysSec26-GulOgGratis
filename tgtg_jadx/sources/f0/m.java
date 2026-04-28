package f0;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends CameraExtensionSession$StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f16765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f16766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f16767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w2.z f16768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d7.e f16769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r80.d f16770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r80.d f16771g;

    public m(d dVar, y2 y2Var, c4 c4Var, j1 j1Var, w2.z zVar, d7.e eVar) {
        j1Var.getClass();
        this.f16765a = dVar;
        this.f16766b = y2Var;
        this.f16767c = j1Var;
        this.f16768d = zVar;
        this.f16769e = eVar;
        this.f16770f = w.b.r(c4Var);
        this.f16771g = w.b.r(null);
    }

    public final s1 a(CameraExtensionSession cameraExtensionSession, j1 j1Var) {
        s1 s1Var = (s1) this.f16771g.f37785a;
        if (s1Var != null) {
            return s1Var;
        }
        f fVar = new f(this.f16765a, cameraExtensionSession, j1Var, this.f16769e);
        if (this.f16771g.a(null, fVar)) {
            return fVar;
        }
        Object obj = this.f16771g.f37785a;
        obj.getClass();
        return (s1) obj;
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        a(cameraExtensionSession, this.f16767c);
        s1 s1VarA = a(cameraExtensionSession, this.f16767c);
        y2 y2Var = this.f16766b;
        y2Var.getClass();
        y2Var.f17004a.f(s1VarA);
        r80.d dVar = this.f16770f;
        dVar.getClass();
        c4 c4Var = (c4) r80.d.f37784b.getAndSet(dVar, null);
        if (c4Var != null) {
            c4Var.a();
        }
        this.f16766b.a();
        w2.z zVar = this.f16768d;
        if (zVar != null) {
            zVar.x(this.f16765a.f16599c);
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        s1 s1VarA = a(cameraExtensionSession, this.f16767c);
        y2 y2Var = this.f16766b;
        y2Var.getClass();
        y2Var.f17004a.g(s1VarA);
        r80.d dVar = this.f16770f;
        dVar.getClass();
        c4 c4Var = (c4) r80.d.f37784b.getAndSet(dVar, null);
        if (c4Var != null) {
            c4Var.a();
        }
        this.f16766b.a();
        w2.z zVar = this.f16768d;
        if (zVar != null) {
            zVar.y(this.f16765a.f16599c);
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        s1 s1VarA = a(cameraExtensionSession, this.f16767c);
        y2 y2Var = this.f16766b;
        y2Var.getClass();
        y2Var.f17004a.c(s1VarA);
        r80.d dVar = this.f16770f;
        dVar.getClass();
        c4 c4Var = (c4) r80.d.f37784b.getAndSet(dVar, null);
        if (c4Var != null) {
            c4Var.a();
        }
        w2.z zVar = this.f16768d;
        if (zVar != null) {
            zVar.z(this.f16765a.f16599c);
        }
    }
}
