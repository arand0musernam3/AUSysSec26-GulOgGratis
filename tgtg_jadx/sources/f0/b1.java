package f0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f16572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c1 f16573k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(String str, c1 c1Var, x70.c cVar) {
        super(2, cVar);
        this.f16572j = str;
        this.f16573k = c1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new b1(this.f16572j, this.f16573k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Boolean boolValueOf;
        int i11;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        String str = this.f16572j;
        c1 c1Var = this.f16573k;
        t70.a aVar2 = c1Var.f16583a;
        j1 j1Var = c1Var.f16585c;
        int i12 = 3;
        try {
            boolValueOf = Boolean.valueOf(((CameraManager) aVar2.get()).isCameraDeviceSetupSupported(str));
        } catch (Exception e5) {
            if (e5 instanceof CameraAccessException) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e5.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e5;
                int reason = cameraAccessException.getReason();
                if (reason == 1) {
                    i11 = 3;
                } else if (reason == 2) {
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
                j1Var.a(str, i11, true);
            } else if ((e5 instanceof IllegalArgumentException) || (e5 instanceof SecurityException) || (e5 instanceof UnsupportedOperationException) || (e5 instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e5.getMessage());
                j1Var.a(str, 9, false);
            } else {
                if (!(e5 instanceof IllegalStateException)) {
                    throw e5;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            boolValueOf = null;
        }
        if (!Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            return null;
        }
        Log.d("CXCP", "Initializing CameraDeviceSetup for " + ((Object) e0.s.b(str)));
        try {
            cameraDeviceSetup = ((CameraManager) aVar2.get()).getCameraDeviceSetup(str);
        } catch (Exception e11) {
            if (e11 instanceof CameraAccessException) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e11.getMessage());
                CameraAccessException cameraAccessException2 = (CameraAccessException) e11;
                int reason2 = cameraAccessException2.getReason();
                if (reason2 != 1) {
                    if (reason2 == 2) {
                        i12 = 6;
                    } else if (reason2 == 3) {
                        i12 = 0;
                    } else if (reason2 == 4) {
                        i12 = 1;
                    } else if (reason2 != 5) {
                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException2);
                        i12 = 11;
                    } else {
                        i12 = 2;
                    }
                }
                j1Var.a(str, i12, true);
            } else if ((e11 instanceof IllegalArgumentException) || (e11 instanceof SecurityException) || (e11 instanceof UnsupportedOperationException) || (e11 instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e11.getMessage());
                j1Var.a(str, 9, false);
            } else {
                if (!(e11 instanceof IllegalStateException)) {
                    throw e11;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            cameraDeviceSetup = null;
        }
        if (cameraDeviceSetup != null) {
            return new h1(cameraDeviceSetup, str, j1Var);
        }
        return null;
    }
}
