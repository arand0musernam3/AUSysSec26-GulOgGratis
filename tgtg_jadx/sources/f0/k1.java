package f0;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.n f16740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.h f16741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dn.k f16742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.m f16743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayMap f16744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayMap f16745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayMap f16746h;

    public k1(Context context, h0.n nVar, h0.h hVar, dn.k kVar, h0.m mVar) {
        nVar.getClass();
        hVar.getClass();
        kVar.getClass();
        mVar.getClass();
        this.f16739a = context;
        this.f16740b = nVar;
        this.f16741c = hVar;
        this.f16742d = kVar;
        this.f16743e = mVar;
        this.f16744f = new ArrayMap();
        this.f16745g = new ArrayMap();
        this.f16746h = new ArrayMap();
    }

    public static final r0 a(k1 k1Var, String str, boolean z11, int i11) {
        String str2;
        k1Var.f16743e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) e0.s.b(str)) + "#readCameraExtensionMetadata");
            try {
                Log.d("CXCP", "Loading extension metadata for " + ((Object) e0.s.b(str)));
                CameraExtensionCharacteristics cameraExtensionCharacteristicsE = k1Var.e(str);
                kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                o0Var.getClass();
                r0 r0Var = new r0(str, i11, cameraExtensionCharacteristicsE, o0Var);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (!z11) {
                    str2 = "";
                } else {
                    if (!z11) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = " (redacted)";
                }
                Log.i("CXCP", "Loaded extension metadata for " + ((Object) e0.s.b(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                return r0Var;
            } catch (Throwable th2) {
                throw new IllegalStateException("Failed to load extension metadata for " + ((Object) e0.s.b(str)) + '!', th2);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f0.t0 b(f0.k1 r14, java.lang.String r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.k1.b(f0.k1, java.lang.String, boolean):f0.t0");
    }

    public static final boolean c(k1 k1Var) {
        boolean z11;
        h0.h hVar = k1Var.f16741c;
        hVar.getClass();
        if (Intrinsics.areEqual(Build.FINGERPRINT, "robolectric")) {
            z11 = true;
        } else {
            if (!hVar.f20973b) {
                Trace.beginSection("CXCP#checkCameraPermission");
                if (hVar.f20972a.checkSelfPermission("android.permission.CAMERA") == 0) {
                    hVar.f20973b = true;
                }
                Trace.endSection();
            }
            z11 = hVar.f20973b;
        }
        return !z11;
    }

    public final e0.v d(String str) {
        e0.v vVarB;
        str.getClass();
        try {
            Trace.beginSection(((Object) e0.s.b(str)) + "#awaitMetadata");
            synchronized (this.f16744f) {
                vVarB = (e0.v) this.f16744f.get(str);
                if (vVarB == null) {
                    if (c(this)) {
                        vVarB = b(this, str, true);
                    } else {
                        vVarB = b(this, str, false);
                        this.f16744f.put(str, vVarB);
                    }
                }
            }
            return vVarB;
        } finally {
            Trace.endSection();
        }
    }

    public final CameraExtensionCharacteristics e(String str) throws CameraAccessException {
        synchronized (this.f16746h) {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.f16746h.get(str);
            if (cameraExtensionCharacteristics != null) {
                return cameraExtensionCharacteristics;
            }
            Log.d("CXCP", "Retrieving CameraExtensionCharacteristics for " + ((Object) e0.s.b(str)));
            Object systemService = this.f16739a.getSystemService("camera");
            systemService.getClass();
            str.getClass();
            CameraExtensionCharacteristics cameraExtensionCharacteristics2 = ((CameraManager) systemService).getCameraExtensionCharacteristics(str);
            cameraExtensionCharacteristics2.getClass();
            return cameraExtensionCharacteristics2;
        }
    }
}
