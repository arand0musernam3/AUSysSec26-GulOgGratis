package f0;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.n f16681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f16682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v3 f16683c;

    public g1(h0.n nVar, n1 n1Var, v3 v3Var) {
        nVar.getClass();
        n1Var.getClass();
        v3Var.getClass();
        this.f16681a = nVar;
        this.f16682b = n1Var;
        this.f16683c = v3Var;
    }

    public static final void a(g1 g1Var, r1 r1Var) throws InterruptedException {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        r80.a aVarP = w.b.p(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (r1Var.Z(kotlin.collections.c0.c(surface), new f1(countDownLatch, aVarP, surface, surfaceTexture))) {
            countDownLatch.await();
            return;
        }
        Log.e("CXCP", "Failed to create a blank capture session! Surfaces may not be disconnected properly.");
        if (aVarP.a()) {
            surface.release();
            surfaceTexture.release();
        }
    }

    public final void b(r1 r1Var, CameraDevice cameraDevice, h hVar, d0 d0Var, boolean z11, boolean z12) {
        e0 e0Var;
        d0Var.getClass();
        Pair pair = null;
        CameraDevice cameraDevice2 = r1Var != null ? (CameraDevice) r1Var.t(Reflection.getOrCreateKotlinClass(CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                c(cameraDevice, hVar);
                return;
            }
            return;
        }
        String id2 = cameraDevice2.getId();
        id2.getClass();
        e0.s.a(id2);
        if (cameraDevice != null && !Intrinsics.areEqual(id2, cameraDevice.getId())) {
            StringBuilder sbS = e0.f.s("Unwrapped camera device has camera ID ", id2, ", but the wrapped camera device has camera ID ");
            sbS.append(cameraDevice.getId());
            sbS.append('!');
            throw new IllegalStateException(sbS.toString().toString());
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            r1Var.getClass();
            if (i11 >= 30) {
                d0Var.f16609e.remove(r1Var);
            }
        }
        Log.d("CXCP", "handleQuirksBeforeClosing(" + cameraDevice2 + ')');
        String strR = r1Var.r();
        if (z11) {
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                Log.d("CXCP", "Reopening camera device");
                c(cameraDevice2, hVar);
                e0Var = ((x3) this.f16683c).a(strR, this);
            } finally {
            }
        } else {
            e0Var = new e0(r1Var, hVar);
        }
        r1 r1Var2 = e0Var.f16619a;
        h hVar2 = e0Var.f16620b;
        if (r1Var2 == null || hVar2 == null) {
            Log.e("CXCP", "Failed to retain an opened camera device!");
        } else {
            if (z12) {
                try {
                    Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                    Log.d("CXCP", "Creating an empty capture session before closing " + ((Object) e0.s.b(strR)));
                    a(this, r1Var2);
                    Log.d("CXCP", "Created an empty capture session.");
                } finally {
                }
            }
            pair = new Pair(r1Var2, hVar2);
        }
        if (pair == null) {
            Log.e("CXCP", "Failed to handle quirks before closing the camera device!");
            r1Var.G();
            r1Var.i0();
            hVar.d(cameraDevice2);
            return;
        }
        r1 r1Var3 = (r1) pair.f26485a;
        h hVar3 = (h) pair.f26486b;
        Object objT = r1Var3.t(Reflection.getOrCreateKotlinClass(CameraDevice.class));
        if (objT == null) {
            com.braze.h2.b("Required value was null.");
            return;
        }
        r1Var.G();
        c((CameraDevice) objT, hVar3);
        r1Var.i0();
        if (z11) {
            hVar.d(cameraDevice2);
        }
    }

    public final void c(CameraDevice cameraDevice, h hVar) {
        String id2 = cameraDevice.getId();
        id2.getClass();
        Log.d("CXCP", "closeCameraDevice(" + id2 + ')');
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (((Unit) this.f16681a.b(7000L, new e1(cameraDevice, booleanRef, null))) == null) {
            Log.e("CXCP", "Failed to close CameraDevice(" + id2 + ") after 7000ms. The camera is likely in a bad state.");
        }
        String id3 = cameraDevice.getId();
        id3.getClass();
        e0.s.a(id3);
        n1 n1Var = this.f16682b;
        n1Var.getClass();
        n1Var.f16785b.getClass();
        e0.u uVar = e0.v.f15412i0;
        e0.v vVarD = ((k1) n1Var.f16784a).d(id3);
        uVar.getClass();
        if (e0.u.c(vVarD) && booleanRef.element) {
            Log.d("CXCP", "Waiting for OnClosed from " + ((Object) e0.s.b(id3)));
            if (hVar.f16702r.await(ConversationFragment.COORDINATOR_INITIALIZATION_TIMEOUT, TimeUnit.MILLISECONDS)) {
                Log.d("CXCP", "Received OnClosed for " + ((Object) e0.s.b(id3)));
            } else {
                Log.w("CXCP", "Failed to close " + ((Object) e0.s.b(id3)) + " after 2000ms!");
            }
        }
    }
}
