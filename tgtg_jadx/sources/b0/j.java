package b0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e0.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5242a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u70.t f5243b = u70.l.b(new au.a(5));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f5244c;

    public j() {
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        this.f5244c = o0Var;
    }

    public static int c(e0.k1 k1Var) {
        s0.k2 k2Var = (s0.k2) k1Var.a(e2.f5145a);
        Object obj = k2Var != null ? k2Var.f38373a.get("CAPTURE_CONFIG_ID_KEY") : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // e0.h1
    public final void A(e0.k1 k1Var) {
        k1Var.getClass();
        for (Map.Entry entry : this.f5244c.entrySet()) {
            s0.p pVar = (s0.p) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (pVar instanceof w.q) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) k1Var.t(Reflection.getOrCreateKotlinClass(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) k1Var.t(Reflection.getOrCreateKotlinClass(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new a40.l(18, (w.q) pVar, cameraCaptureSession));
                }
            } else {
                executor.execute(new f(pVar, this, k1Var, 1));
            }
        }
    }

    @Override // e0.h1
    public final void B(e0.k1 k1Var, int i11) {
        k1Var.getClass();
        for (Map.Entry entry : this.f5244c.entrySet()) {
            s0.p pVar = (s0.p) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (pVar instanceof w.q) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) k1Var.t(Reflection.getOrCreateKotlinClass(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) k1Var.t(Reflection.getOrCreateKotlinClass(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) k1Var.t(Reflection.getOrCreateKotlinClass(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new i((w.q) pVar, cameraCaptureSession, captureRequest, captureResult, 0));
                }
            } else {
                executor.execute(new androidx.activity.l(pVar, this, k1Var, i11));
            }
        }
    }

    @Override // e0.h1
    public final void H(e0.k1 k1Var, long j9, e0.j1 j1Var) {
        for (Map.Entry entry : this.f5244c.entrySet()) {
            s0.p pVar = (s0.p) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (pVar instanceof w.q) {
                CameraCaptureSession cameraCaptureSessionB = b(k1Var);
                CaptureRequest captureRequest = (CaptureRequest) k1Var.t(Reflection.getOrCreateKotlinClass(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) j1Var.t(Reflection.getOrCreateKotlinClass(CaptureFailure.class));
                if (cameraCaptureSessionB != null && captureRequest != null && captureFailure != null) {
                    executor.execute(new g(1, (w.q) pVar, cameraCaptureSessionB, captureRequest, captureFailure));
                }
            } else {
                executor.execute(new a40.q(pVar, this, k1Var, new ky.p(15), 5));
            }
        }
    }

    @Override // e0.h1
    public final void I(e0.k1 k1Var, final long j9, int i11, int i12) {
        for (Map.Entry entry : this.f5244c.entrySet()) {
            s0.p pVar = (s0.p) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (pVar instanceof w.q) {
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) k1Var.t(Reflection.getOrCreateKotlinClass(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) k1Var.t(Reflection.getOrCreateKotlinClass(CaptureRequest.class));
                final Surface surface = (Surface) k1Var.I().get(new e0.p1(i11));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    final w.q qVar = (w.q) pVar;
                    executor.execute(new Runnable() { // from class: b0.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            qVar.f42750a.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j9);
                        }
                    });
                }
            }
        }
    }

    @Override // e0.h1
    public final void L(e0.k1 k1Var, long j9, f0.n nVar) {
        for (Map.Entry entry : this.f5244c.entrySet()) {
            s0.p pVar = (s0.p) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (pVar instanceof w.q) {
                CameraCaptureSession cameraCaptureSessionB = b(k1Var);
                CaptureRequest captureRequest = (CaptureRequest) k1Var.t(Reflection.getOrCreateKotlinClass(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) nVar.t(Reflection.getOrCreateKotlinClass(TotalCaptureResult.class));
                if (cameraCaptureSessionB != null && captureRequest != null && totalCaptureResult != null) {
                    executor.execute(new g(0, (w.q) pVar, cameraCaptureSessionB, captureRequest, totalCaptureResult));
                }
            } else {
                executor.execute(new a40.q(pVar, this, k1Var, new w.y(k1Var, nVar), 4));
            }
        }
    }

    public final void a(s0.p pVar, j3 j3Var) {
        pVar.getClass();
        j3Var.getClass();
        if (this.f5244c.containsKey(pVar)) {
            throw new IllegalStateException((pVar + " was already registered!").toString());
        }
        synchronized (this.f5242a) {
            this.f5242a.put(pVar, j3Var);
            this.f5244c = kotlin.collections.x0.k(this.f5242a);
        }
    }

    public final CameraCaptureSession b(e0.k1 k1Var) {
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) k1Var.t(Reflection.getOrCreateKotlinClass(CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || ((CameraExtensionSession) k1Var.t(Reflection.getOrCreateKotlinClass(ax.y.c()))) == null) {
            return null;
        }
        return (CameraCaptureSession) this.f5243b.getValue();
    }

    @Override // e0.h1
    public final void g(e0.k1 k1Var, long j9) {
        k1Var.getClass();
        for (Map.Entry entry : this.f5244c.entrySet()) {
            s0.p pVar = (s0.p) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (pVar instanceof w.q) {
                CameraCaptureSession cameraCaptureSessionB = b(k1Var);
                CaptureRequest captureRequest = (CaptureRequest) k1Var.t(Reflection.getOrCreateKotlinClass(CaptureRequest.class));
                if (cameraCaptureSessionB != null && captureRequest != null) {
                    executor.execute(new d((w.q) pVar, cameraCaptureSessionB, j9, 0));
                }
            }
        }
    }

    @Override // e0.h1
    public final void p(e0.k1 k1Var, long j9, long j11) {
        k1Var.getClass();
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        for (Map.Entry entry : this.f5244c.entrySet()) {
            s0.p pVar = (s0.p) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (pVar instanceof w.q) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) k1Var.t(Reflection.getOrCreateKotlinClass(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) k1Var.t(Reflection.getOrCreateKotlinClass(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new e((w.q) pVar, cameraCaptureSession, captureRequest, j11, j9, 1));
                }
            }
        }
    }

    @Override // e0.h1
    public final void r(e0.k1 k1Var, long j9, long j11) {
        k1Var.getClass();
        for (Map.Entry entry : this.f5244c.entrySet()) {
            s0.p pVar = (s0.p) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (pVar instanceof w.q) {
                CameraCaptureSession cameraCaptureSessionB = b(k1Var);
                CaptureRequest captureRequest = (CaptureRequest) k1Var.t(Reflection.getOrCreateKotlinClass(CaptureRequest.class));
                if (cameraCaptureSessionB != null && captureRequest != null) {
                    executor.execute(new e((w.q) pVar, cameraCaptureSessionB, captureRequest, j11, j9, 0));
                }
            } else {
                executor.execute(new f(pVar, this, k1Var, 0));
            }
        }
    }

    @Override // e0.h1
    public final void t(e0.i1 i1Var) {
        i1Var.getClass();
        for (Map.Entry entry : this.f5244c.entrySet()) {
            s0.p pVar = (s0.p) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            Object obj = i1Var.f15357c.get(e2.f5145a);
            s0.k2 k2Var = obj instanceof s0.k2 ? (s0.k2) obj : null;
            Object obj2 = k2Var != null ? k2Var.f38373a.get("CAPTURE_CONFIG_ID_KEY") : null;
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            executor.execute(new h(pVar, num != null ? num.intValue() : -1, 0));
        }
    }

    @Override // e0.h1
    public final void u(e0.k1 k1Var, long j9, f0.o oVar) {
        k1Var.getClass();
        for (Map.Entry entry : this.f5244c.entrySet()) {
            s0.p pVar = (s0.p) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (pVar instanceof w.q) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) k1Var.t(Reflection.getOrCreateKotlinClass(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) k1Var.t(Reflection.getOrCreateKotlinClass(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) oVar.t(Reflection.getOrCreateKotlinClass(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new i((w.q) pVar, cameraCaptureSession, captureRequest, captureResult, 1));
                }
            }
        }
    }
}
