package f0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f16633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraExtensionSession f16634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f16635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f16636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r80.c f16637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f16638f;

    public f(d dVar, CameraExtensionSession cameraExtensionSession, j1 j1Var, d7.e eVar) {
        dVar.getClass();
        cameraExtensionSession.getClass();
        j1Var.getClass();
        eVar.getClass();
        this.f16633a = dVar;
        this.f16634b = cameraExtensionSession;
        this.f16635c = j1Var;
        this.f16636d = eVar;
        r80.b bVar = e0.t.f15406a;
        bVar.getClass();
        r80.b.f37780b.incrementAndGet(bVar);
        r80.c cVar = new r80.c();
        cVar.f37783a = 0L;
        this.f16637e = cVar;
        this.f16638f = new HashMap();
    }

    @Override // f0.q1
    public final boolean K() {
        return false;
    }

    @Override // f0.q1
    public final r1 P() {
        return this.f16633a;
    }

    @Override // f0.q1
    public final Integer S(ArrayList arrayList, w0 w0Var) {
        arrayList.getClass();
        if (arrayList.size() == 1) {
            return V((CaptureRequest) CollectionsKt.h0(arrayList), w0Var);
        }
        com.braze.h2.b("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
        return null;
    }

    @Override // f0.q1
    public final Integer V(CaptureRequest captureRequest, w0 w0Var) throws Exception {
        captureRequest.getClass();
        String strR = this.f16633a.r();
        try {
            int i11 = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.f16634b;
            Executor executor = this.f16636d;
            return Integer.valueOf(i11 >= 33 ? cameraExtensionSession.setRepeatingRequest(captureRequest, executor, new e(this, w0Var)) : cameraExtensionSession.setRepeatingRequest(captureRequest, executor, new e(this, w0Var, new LinkedHashMap())));
        } catch (Exception e5) {
            boolean z11 = e5 instanceof CameraAccessException;
            int i12 = 0;
            j1 j1Var = this.f16635c;
            if (!z11) {
                if (!(e5 instanceof IllegalArgumentException) && !(e5 instanceof SecurityException) && !(e5 instanceof UnsupportedOperationException) && !(e5 instanceof NullPointerException)) {
                    if (!(e5 instanceof IllegalStateException)) {
                        throw e5;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e5.getMessage());
                j1Var.a(strR, 9, false);
                return null;
            }
            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e5.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e5;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i12 = 3;
            } else if (reason == 2) {
                i12 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i12 = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i12 = 11;
                } else {
                    i12 = 2;
                }
            }
            j1Var.a(strR, i12, true);
            return null;
        }
    }

    @Override // f0.q1
    public final boolean c0(List list) {
        list.getClass();
        Log.w("CXCP", "CameraExtensionSession does not support finalizeOutputConfigurations()");
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws CameraAccessException {
        this.f16634b.close();
    }

    @Override // f0.q1
    public final boolean d0() throws Exception {
        Unit unit;
        String strR = this.f16633a.r();
        try {
            this.f16634b.stopRepeating();
            unit = Unit.f26487a;
        } catch (Exception e5) {
            boolean z11 = e5 instanceof CameraAccessException;
            j1 j1Var = this.f16635c;
            if (z11) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e5.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e5;
                int reason = cameraAccessException.getReason();
                int i11 = 3;
                if (reason != 1) {
                    if (reason == 2) {
                        i11 = 6;
                    } else if (reason == 3) {
                        i11 = 0;
                    } else if (reason == 4) {
                        i11 = 1;
                    } else if (reason != 5) {
                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                        i11 = 11;
                    } else {
                        i11 = 2;
                    }
                }
                j1Var.a(strR, i11, true);
            } else if ((e5 instanceof IllegalArgumentException) || (e5 instanceof SecurityException) || (e5 instanceof UnsupportedOperationException) || (e5 instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e5.getMessage());
                j1Var.a(strR, 9, false);
            } else {
                if (!(e5 instanceof IllegalStateException)) {
                    throw e5;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            unit = null;
        }
        return unit != null;
    }

    @Override // f0.q1
    public final Surface getInputSurface() {
        return null;
    }

    @Override // f0.q1
    public final Integer k0(CaptureRequest captureRequest, w0 w0Var) throws Exception {
        captureRequest.getClass();
        String strR = this.f16633a.r();
        try {
            int i11 = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.f16634b;
            Executor executor = this.f16636d;
            return Integer.valueOf(i11 >= 33 ? cameraExtensionSession.capture(captureRequest, executor, new e(this, w0Var)) : cameraExtensionSession.capture(captureRequest, executor, new e(this, w0Var, new LinkedHashMap())));
        } catch (Exception e5) {
            boolean z11 = e5 instanceof CameraAccessException;
            int i12 = 0;
            j1 j1Var = this.f16635c;
            if (!z11) {
                if (!(e5 instanceof IllegalArgumentException) && !(e5 instanceof SecurityException) && !(e5 instanceof UnsupportedOperationException) && !(e5 instanceof NullPointerException)) {
                    if (!(e5 instanceof IllegalStateException)) {
                        throw e5;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e5.getMessage());
                j1Var.a(strR, 9, false);
                return null;
            }
            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e5.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e5;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i12 = 3;
            } else if (reason == 2) {
                i12 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i12 = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i12 = 11;
                } else {
                    i12 = 2;
                }
            }
            j1Var.a(strR, i12, true);
            return null;
        }
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        if (r8.k.D(kClass, ax.y.c(), kClass)) {
            return this.f16634b;
        }
        return null;
    }

    @Override // f0.q1
    public final Integer w(ArrayList arrayList, w0 w0Var) throws Exception {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k0((CaptureRequest) it.next(), w0Var);
        }
        return null;
    }
}
