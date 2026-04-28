package f0;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f16612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16613b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16614c;

    public d4(d dVar) {
        this.f16612a = dVar;
    }

    @Override // f0.r1
    public final void A(int i11) {
        this.f16612a.A(i11);
    }

    @Override // f0.r1
    public final void G() {
        this.f16612a.G();
    }

    @Override // f0.r1
    public final boolean J(ArrayList arrayList, p1 p1Var) {
        boolean zJ;
        p1Var.getClass();
        synchronized (this.f16613b) {
            try {
                if (this.f16614c) {
                    Log.w("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
                    ((s2) p1Var).a();
                    zJ = false;
                } else {
                    zJ = this.f16612a.J(arrayList, p1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zJ;
    }

    @Override // f0.r1
    public final CaptureRequest.Builder L(int i11) {
        CaptureRequest.Builder builderL;
        synchronized (this.f16613b) {
            try {
                if (this.f16614c) {
                    Log.w("CXCP", "createCaptureRequest failed: Virtual device disconnected");
                    builderL = null;
                } else {
                    builderL = this.f16612a.L(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return builderL;
    }

    @Override // f0.r1
    public final boolean Q(z3 z3Var) {
        boolean zQ;
        synchronized (this.f16613b) {
            try {
                if (this.f16614c) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    z3Var.f17024e.a();
                    zQ = false;
                } else {
                    zQ = this.f16612a.Q(z3Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zQ;
    }

    @Override // f0.r1
    public final boolean Z(List list, p1 p1Var) {
        boolean Z;
        list.getClass();
        p1Var.getClass();
        synchronized (this.f16613b) {
            try {
                if (this.f16614c) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    p1Var.a();
                    Z = false;
                } else {
                    Z = this.f16612a.Z(list, p1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Z;
    }

    @Override // f0.r1
    public final boolean a0(ArrayList arrayList, p1 p1Var) {
        boolean zA0;
        p1Var.getClass();
        synchronized (this.f16613b) {
            try {
                if (this.f16614c) {
                    Log.w("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
                    ((s2) p1Var).a();
                    zA0 = false;
                } else {
                    zA0 = this.f16612a.a0(arrayList, p1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zA0;
    }

    @Override // f0.r1
    public final boolean g(z2 z2Var, ArrayList arrayList, p1 p1Var) {
        boolean zG;
        p1Var.getClass();
        synchronized (this.f16613b) {
            try {
                if (this.f16614c) {
                    Log.w("CXCP", "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
                    ((s2) p1Var).a();
                    zG = false;
                } else {
                    zG = this.f16612a.g(z2Var, arrayList, p1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zG;
    }

    @Override // f0.r1
    public final void i0() {
        this.f16612a.i0();
    }

    @Override // f0.r1
    public final boolean p(x2 x2Var) {
        boolean zP;
        synchronized (this.f16613b) {
            try {
                if (this.f16614c) {
                    Log.w("CXCP", "createExtensionSession failed: Virtual device disconnected");
                    x2Var.f16989g.a();
                    zP = false;
                } else {
                    zP = this.f16612a.p(x2Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zP;
    }

    @Override // f0.r1
    public final String r() {
        return this.f16612a.f16599c;
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        kClass.getClass();
        return this.f16612a.t(kClass);
    }

    @Override // f0.r1
    public final CaptureRequest.Builder u(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderU;
        synchronized (this.f16613b) {
            try {
                if (this.f16614c) {
                    Log.w("CXCP", "createReprocessCaptureRequest failed: Virtual device disconnected");
                    builderU = null;
                } else {
                    builderU = this.f16612a.u(totalCaptureResult);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return builderU;
    }

    @Override // f0.r1
    public final boolean u0(InputConfiguration inputConfiguration, ArrayList arrayList, p1 p1Var) {
        boolean zU0;
        p1Var.getClass();
        synchronized (this.f16613b) {
            try {
                if (this.f16614c) {
                    Log.w("CXCP", "createReprocessableCaptureSession failed: Virtual device disconnected");
                    ((s2) p1Var).a();
                    zU0 = false;
                } else {
                    zU0 = this.f16612a.u0(inputConfiguration, arrayList, p1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zU0;
    }
}
