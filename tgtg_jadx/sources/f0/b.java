package f0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f16568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraCaptureSession f16569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f16570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f16571d;

    public b(r1 r1Var, CameraCaptureSession cameraCaptureSession, j1 j1Var, Handler handler) {
        r1Var.getClass();
        cameraCaptureSession.getClass();
        j1Var.getClass();
        handler.getClass();
        this.f16568a = r1Var;
        this.f16569b = cameraCaptureSession;
        this.f16570c = j1Var;
        this.f16571d = handler;
        r80.b bVar = e0.t.f15406a;
        bVar.getClass();
        r80.b.f37780b.incrementAndGet(bVar);
    }

    @Override // f0.q1
    public final boolean K() throws Throwable {
        double d3;
        String strR;
        j1 j1Var;
        Unit unit;
        StringBuilder sb2 = new StringBuilder("CXCP#abortCaptures-");
        r1 r1Var = this.f16568a;
        sb2.append(r1Var.r());
        String string = sb2.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            strR = r1Var.r();
            j1Var = this.f16570c;
            d3 = 1000000.0d;
        } catch (Throwable th2) {
            th = th2;
            d3 = 1000000.0d;
        }
        try {
            try {
                this.f16569b.abortCaptures();
                unit = Unit.f26487a;
            } catch (Exception e5) {
                if (e5 instanceof CameraAccessException) {
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
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
            return unit != null;
        } catch (Throwable th3) {
            th = th3;
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
            throw th;
        }
    }

    @Override // f0.q1
    public final r1 P() {
        return this.f16568a;
    }

    @Override // f0.q1
    public final Integer S(ArrayList arrayList, w0 w0Var) throws Throwable {
        double d3;
        Integer numValueOf;
        arrayList.getClass();
        StringBuilder sb2 = new StringBuilder("CXCP#setRepeatingBurst-");
        r1 r1Var = this.f16568a;
        sb2.append(r1Var.r());
        String string = sb2.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strR = r1Var.r();
            j1 j1Var = this.f16570c;
            try {
                d3 = 1000000.0d;
                try {
                    try {
                        numValueOf = Integer.valueOf(this.f16569b.setRepeatingBurst(arrayList, w0Var, this.f16571d));
                    } catch (Exception e5) {
                        e = e5;
                        int i11 = 0;
                        if (e instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i11 = 3;
                            } else if (reason == 2) {
                                i11 = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
                                    i11 = 1;
                                } else if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i11 = 11;
                                } else {
                                    i11 = 2;
                                }
                            }
                            j1Var.a(strR, i11, true);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            j1Var.a(strR, 9, false);
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        numValueOf = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                d3 = 1000000.0d;
            }
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
            return numValueOf;
        } catch (Throwable th3) {
            th = th3;
            d3 = 1000000.0d;
        }
    }

    @Override // f0.q1
    public final Integer V(CaptureRequest captureRequest, w0 w0Var) throws Throwable {
        double d3;
        Integer numValueOf;
        captureRequest.getClass();
        StringBuilder sb2 = new StringBuilder("CXCP#setRepeatingRequest-");
        r1 r1Var = this.f16568a;
        sb2.append(r1Var.r());
        String string = sb2.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strR = r1Var.r();
            j1 j1Var = this.f16570c;
            try {
                d3 = 1000000.0d;
                try {
                    try {
                        numValueOf = Integer.valueOf(this.f16569b.setRepeatingRequest(captureRequest, w0Var, this.f16571d));
                    } catch (Exception e5) {
                        e = e5;
                        int i11 = 0;
                        if (e instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i11 = 3;
                            } else if (reason == 2) {
                                i11 = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
                                    i11 = 1;
                                } else if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i11 = 11;
                                } else {
                                    i11 = 2;
                                }
                            }
                            j1Var.a(strR, i11, true);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            j1Var.a(strR, 9, false);
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        numValueOf = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                d3 = 1000000.0d;
            }
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
            return numValueOf;
        } catch (Throwable th3) {
            th = th3;
            d3 = 1000000.0d;
        }
    }

    @Override // f0.q1
    public final boolean c0(List list) throws Throwable {
        double d3;
        Unit unit;
        CameraCaptureSession cameraCaptureSession;
        list.getClass();
        StringBuilder sb2 = new StringBuilder("CXCP#finalizeOutputConfigurations-");
        r1 r1Var = this.f16568a;
        sb2.append(r1Var.r());
        String string = sb2.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strR = r1Var.r();
            j1 j1Var = this.f16570c;
            try {
                try {
                    cameraCaptureSession = this.f16569b;
                    d3 = 1000000.0d;
                } catch (Throwable th2) {
                    th = th2;
                    Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                d3 = 1000000.0d;
            }
            try {
                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((OutputConfiguration) ((r) it.next()).t(Reflection.getOrCreateKotlinClass(OutputConfiguration.class)));
                }
                cameraCaptureSession.getClass();
                cameraCaptureSession.finalizeOutputConfigurations(arrayList);
                unit = Unit.f26487a;
            } catch (Exception e11) {
                e = e11;
                if (e instanceof CameraAccessException) {
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
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
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    j1Var.a(strR, 9, false);
                } else {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                }
                unit = null;
            }
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
            return unit != null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f16569b.close();
    }

    @Override // f0.q1
    public final boolean d0() throws Throwable {
        double d3;
        String strR;
        j1 j1Var;
        Unit unit;
        StringBuilder sb2 = new StringBuilder("CXCP#stopRepeating-");
        r1 r1Var = this.f16568a;
        sb2.append(r1Var.r());
        String string = sb2.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            strR = r1Var.r();
            j1Var = this.f16570c;
            d3 = 1000000.0d;
        } catch (Throwable th2) {
            th = th2;
            d3 = 1000000.0d;
        }
        try {
            try {
                this.f16569b.stopRepeating();
                unit = Unit.f26487a;
            } catch (Exception e5) {
                if (e5 instanceof CameraAccessException) {
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
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
            return unit != null;
        } catch (Throwable th3) {
            th = th3;
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
            throw th;
        }
    }

    @Override // f0.q1
    public final Surface getInputSurface() {
        return this.f16569b.getInputSurface();
    }

    @Override // f0.q1
    public final Integer k0(CaptureRequest captureRequest, w0 w0Var) throws Throwable {
        double d3;
        Integer numValueOf;
        captureRequest.getClass();
        StringBuilder sb2 = new StringBuilder("CXCP#capture-");
        r1 r1Var = this.f16568a;
        sb2.append(r1Var.r());
        String string = sb2.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strR = r1Var.r();
            j1 j1Var = this.f16570c;
            try {
                d3 = 1000000.0d;
                try {
                    try {
                        numValueOf = Integer.valueOf(this.f16569b.capture(captureRequest, w0Var, this.f16571d));
                    } catch (Exception e5) {
                        e = e5;
                        int i11 = 0;
                        if (e instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i11 = 3;
                            } else if (reason == 2) {
                                i11 = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
                                    i11 = 1;
                                } else if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i11 = 11;
                                } else {
                                    i11 = 2;
                                }
                            }
                            j1Var.a(strR, i11, true);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            j1Var.a(strR, 9, false);
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        numValueOf = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                d3 = 1000000.0d;
            }
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
            return numValueOf;
        } catch (Throwable th3) {
            th = th3;
            d3 = 1000000.0d;
        }
    }

    @Override // e0.r1
    public Object t(KClass kClass) {
        if (r8.k.D(kClass, CameraCaptureSession.class, kClass)) {
            return this.f16569b;
        }
        return null;
    }

    @Override // f0.q1
    public final Integer w(ArrayList arrayList, w0 w0Var) throws Throwable {
        double d3;
        Integer numValueOf;
        arrayList.getClass();
        StringBuilder sb2 = new StringBuilder("CXCP#captureBurst-");
        r1 r1Var = this.f16568a;
        sb2.append(r1Var.r());
        String string = sb2.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strR = r1Var.r();
            j1 j1Var = this.f16570c;
            try {
                d3 = 1000000.0d;
                try {
                    try {
                        numValueOf = Integer.valueOf(this.f16569b.captureBurst(arrayList, w0Var, this.f16571d));
                    } catch (Exception e5) {
                        e = e5;
                        int i11 = 0;
                        if (e instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i11 = 3;
                            } else if (reason == 2) {
                                i11 = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
                                    i11 = 1;
                                } else if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i11 = 11;
                                } else {
                                    i11 = 2;
                                }
                            }
                            j1Var.a(strR, i11, true);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            j1Var.a(strR, 9, false);
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        numValueOf = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                d3 = 1000000.0d;
            }
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
            return numValueOf;
        } catch (Throwable th3) {
            th = th3;
            d3 = 1000000.0d;
        }
    }
}
