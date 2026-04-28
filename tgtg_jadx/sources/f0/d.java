package f0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.v f16597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraDevice f16598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1 f16600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w2.z f16601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0.n f16602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r80.a f16603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r80.d f16604h;

    public d(e0.v vVar, CameraDevice cameraDevice, String str, j1 j1Var, w2.z zVar, h0.n nVar) {
        vVar.getClass();
        str.getClass();
        j1Var.getClass();
        nVar.getClass();
        this.f16597a = vVar;
        this.f16598b = cameraDevice;
        this.f16599c = str;
        this.f16600d = j1Var;
        this.f16601e = zVar;
        this.f16602f = nVar;
        this.f16603g = w.b.p(false);
        this.f16604h = w.b.r(null);
    }

    @Override // f0.r1
    public final void A(int i11) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.f16599c;
            j1 j1Var = this.f16600d;
            try {
                w.b(this.f16598b, i11);
            } catch (Exception e5) {
                int i12 = 0;
                if (e5 instanceof CameraAccessException) {
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
                    j1Var.a(str, i12, true);
                } else if ((e5 instanceof IllegalArgumentException) || (e5 instanceof SecurityException) || (e5 instanceof UnsupportedOperationException) || (e5 instanceof NullPointerException)) {
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e5.getMessage());
                    j1Var.a(str, 9, false);
                } else {
                    if (!(e5 instanceof IllegalStateException)) {
                        throw e5;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // f0.r1
    public final void G() {
        c4 c4Var;
        if (!this.f16603g.a() || (c4Var = (c4) this.f16604h.f37785a) == null) {
            return;
        }
        b(c4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // f0.r1
    public final boolean J(ArrayList arrayList, p1 p1Var) throws Throwable {
        String str;
        ?? r92;
        String str2;
        boolean z11;
        c4 c4Var;
        boolean z12;
        Unit unit;
        ?? r93;
        h0.n nVar = this.f16602f;
        CameraDevice cameraDevice = this.f16598b;
        p1Var.getClass();
        Pair pairA = a(p1Var);
        boolean zBooleanValue = ((Boolean) pairA.f26485a).booleanValue();
        c4 c4Var2 = (c4) pairA.f26486b;
        if (!zBooleanValue) {
            return false;
        }
        if (c4Var2 != null) {
            b(c4Var2);
        }
        String str3 = this.f16599c;
        String strK = e0.f.k("CXCP#createConstrainedHighSpeedCaptureSession-", str3);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strK);
            j1 j1Var = this.f16600d;
            try {
                c4Var = c4Var2;
                try {
                    j1 j1Var2 = this.f16600d;
                    w2.z zVar = this.f16601e;
                    try {
                        Handler handlerA = nVar.a();
                        str2 = strK;
                        z11 = true;
                        try {
                            try {
                                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, new j(this, p1Var, c4Var, j1Var2, zVar, handlerA), nVar.a());
                                unit = Unit.f26487a;
                                z12 = false;
                                r93 = z11;
                            } catch (Exception e5) {
                                e = e5;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i11 = 3;
                                    if (reason != z11) {
                                        if (reason == 2) {
                                            i11 = 6;
                                        } else if (reason == 3) {
                                            i11 = 0;
                                        } else if (reason == 4) {
                                            i11 = z11 ? 1 : 0;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i11 = 11;
                                        } else {
                                            i11 = 2;
                                        }
                                    }
                                    j1Var.a(str3, i11, z11);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z12 = false;
                                    j1Var.a(str3, 9, false);
                                    unit = null;
                                    r93 = z11;
                                }
                                z12 = false;
                                unit = null;
                                r93 = z11;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str = str2;
                            r92 = z11;
                            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, r92, null, "%.3f ms", e0.f.r(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        str2 = strK;
                        z11 = true;
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = strK;
                        z11 = true;
                    }
                } catch (Exception e12) {
                    e = e12;
                    z11 = true;
                    str2 = strK;
                } catch (Throwable th4) {
                    th = th4;
                    z11 = true;
                    str2 = strK;
                }
            } catch (Exception e13) {
                e = e13;
                str2 = strK;
                c4Var = c4Var2;
                z11 = true;
            } catch (Throwable th5) {
                th = th5;
                str2 = strK;
                z11 = true;
            }
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, r93, null, "%.3f ms", e0.f.r(str2, " - ")));
            if (unit == null) {
                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                if (c4Var != null) {
                    c(c4Var);
                }
            }
            return unit != null ? r93 : z12;
        } catch (Throwable th6) {
            th = th6;
            str = strK;
            r92 = 1;
        }
    }

    @Override // f0.r1
    public final CaptureRequest.Builder L(int i11) throws Throwable {
        double d3;
        CaptureRequest.Builder builderCreateCaptureRequest;
        StringBuilder sb2 = new StringBuilder("CXCP#createCaptureRequest-");
        String str = this.f16599c;
        sb2.append(str);
        String string = sb2.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                j1 j1Var = this.f16600d;
                try {
                    d3 = 1000000.0d;
                    try {
                        builderCreateCaptureRequest = this.f16598b.createCaptureRequest(i11);
                    } catch (Exception e5) {
                        e = e5;
                        int i12 = 0;
                        if (e instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
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
                            j1Var.a(str, i12, true);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            j1Var.a(str, 9, false);
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        builderCreateCaptureRequest = null;
                    }
                } catch (Exception e11) {
                    e = e11;
                    d3 = 1000000.0d;
                }
                Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
                return builderCreateCaptureRequest;
            } catch (Throwable th2) {
                th = th2;
                Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0255 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0238  */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, u70.j] */
    @Override // f0.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q(f0.z3 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d.Q(f0.z3):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [h0.n] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // f0.r1
    public final boolean Z(List list, p1 p1Var) throws Throwable {
        String str;
        ?? r92;
        String str2;
        String str3;
        c4 c4Var;
        boolean z11;
        boolean z12;
        Unit unit;
        ?? r93;
        ?? r94 = this.f16602f;
        CameraDevice cameraDevice = this.f16598b;
        list.getClass();
        p1Var.getClass();
        Pair pairA = a(p1Var);
        boolean zBooleanValue = ((Boolean) pairA.f26485a).booleanValue();
        c4 c4Var2 = (c4) pairA.f26486b;
        if (!zBooleanValue) {
            return false;
        }
        if (c4Var2 != null) {
            b(c4Var2);
        }
        String str4 = this.f16599c;
        String strK = e0.f.k("CXCP#createCaptureSession-", str4);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strK);
                j1 j1Var = this.f16600d;
                try {
                    c4Var = c4Var2;
                    try {
                        j1 j1Var2 = this.f16600d;
                        w2.z zVar = this.f16601e;
                        try {
                            Handler handlerA = r94.a();
                            str3 = strK;
                            z11 = true;
                            try {
                                cameraDevice.createCaptureSession(list, new j(this, p1Var, c4Var, j1Var2, zVar, handlerA), r94.a());
                                unit = Unit.f26487a;
                                z12 = false;
                                r93 = z11;
                            } catch (Exception e5) {
                                e = e5;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i11 = 3;
                                    if (reason != z11) {
                                        if (reason == 2) {
                                            i11 = 6;
                                        } else if (reason == 3) {
                                            i11 = 0;
                                        } else if (reason == 4) {
                                            i11 = z11 ? 1 : 0;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i11 = 11;
                                        } else {
                                            i11 = 2;
                                        }
                                    }
                                    j1Var.a(str4, i11, z11);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z12 = false;
                                    j1Var.a(str4, 9, false);
                                    unit = null;
                                    r93 = z11;
                                }
                                z12 = false;
                                unit = null;
                                r93 = z11;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str3 = strK;
                            z11 = true;
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = strK;
                            r94 = 1;
                            str = str2;
                            r92 = r94;
                            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, r92, null, "%.3f ms", e0.f.r(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        z11 = true;
                        str3 = strK;
                    } catch (Throwable th3) {
                        th = th3;
                        r94 = 1;
                        str2 = strK;
                    }
                } catch (Exception e13) {
                    e = e13;
                    str3 = strK;
                    c4Var = c4Var2;
                    z11 = true;
                } catch (Throwable th4) {
                    th = th4;
                    str2 = strK;
                    r94 = 1;
                }
                Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, r93, null, "%.3f ms", e0.f.r(str3, " - ")));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (c4Var != null) {
                        c(c4Var);
                    }
                }
                return unit != null ? r93 : z12;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            str = strK;
            r92 = 1;
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, r92, null, "%.3f ms", e0.f.r(str, " - ")));
            throw th;
        }
    }

    public final Pair a(c4 c4Var) {
        if (this.f16603g.b()) {
            c(c4Var);
            return new Pair(Boolean.FALSE, null);
        }
        Boolean bool = Boolean.TRUE;
        r80.d dVar = this.f16604h;
        dVar.getClass();
        return new Pair(bool, r80.d.f37784b.getAndSet(dVar, c4Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[Catch: all -> 0x006f, TryCatch #4 {all -> 0x006f, blocks: (B:8:0x003c, B:9:0x0041, B:10:0x0052, B:12:0x0058, B:18:0x0077, B:20:0x007c, B:22:0x0083, B:24:0x0089, B:32:0x00a0, B:34:0x00a4, B:43:0x00d1, B:50:0x00f8, B:52:0x00fd, B:54:0x0103, B:56:0x0107, B:58:0x010b, B:61:0x0110, B:63:0x0114, B:64:0x011a, B:65:0x011b), top: B:86:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd A[Catch: all -> 0x006f, TryCatch #4 {all -> 0x006f, blocks: (B:8:0x003c, B:9:0x0041, B:10:0x0052, B:12:0x0058, B:18:0x0077, B:20:0x007c, B:22:0x0083, B:24:0x0089, B:32:0x00a0, B:34:0x00a4, B:43:0x00d1, B:50:0x00f8, B:52:0x00fd, B:54:0x0103, B:56:0x0107, B:58:0x010b, B:61:0x0110, B:63:0x0114, B:64:0x011a, B:65:0x011b), top: B:86:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0175 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0177  */
    @Override // f0.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a0(java.util.ArrayList r22, f0.p1 r23) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d.a0(java.util.ArrayList, f0.p1):boolean");
    }

    public final void b(c4 c4Var) {
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            c4Var.b();
        } finally {
            Trace.endSection();
        }
    }

    public final void c(c4 c4Var) {
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            c4Var.a();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0181 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0183  */
    @Override // f0.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(f0.z2 r23, java.util.ArrayList r24, f0.p1 r25) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d.g(f0.z2, java.util.ArrayList, f0.p1):boolean");
    }

    @Override // f0.r1
    public final void i0() {
        if (!this.f16603g.b()) {
            com.braze.h2.b("Check failed.");
            return;
        }
        r80.d dVar = this.f16604h;
        dVar.getClass();
        c4 c4Var = (c4) r80.d.f37784b.getAndSet(dVar, null);
        if (c4Var != null) {
            c(c4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5 A[Catch: all -> 0x00af, TryCatch #7 {all -> 0x00af, blocks: (B:25:0x008d, B:27:0x0099, B:29:0x009f, B:31:0x00ab, B:36:0x00b5, B:37:0x00bc, B:38:0x00bd, B:46:0x00d1, B:48:0x00d5, B:57:0x0102, B:63:0x0121, B:66:0x0127, B:68:0x012b, B:70:0x012f, B:72:0x0133, B:75:0x0138, B:77:0x013c, B:78:0x0142, B:79:0x0143), top: B:96:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127 A[Catch: all -> 0x00af, TryCatch #7 {all -> 0x00af, blocks: (B:25:0x008d, B:27:0x0099, B:29:0x009f, B:31:0x00ab, B:36:0x00b5, B:37:0x00bc, B:38:0x00bd, B:46:0x00d1, B:48:0x00d5, B:57:0x0102, B:63:0x0121, B:66:0x0127, B:68:0x012b, B:70:0x012f, B:72:0x0133, B:75:0x0138, B:77:0x013c, B:78:0x0142, B:79:0x0143), top: B:96:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1  */
    @Override // f0.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(f0.x2 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d.p(f0.x2):boolean");
    }

    @Override // f0.r1
    public final String r() {
        return this.f16599c;
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        if (r8.k.D(kClass, CameraDevice.class, kClass)) {
            return this.f16598b;
        }
        return null;
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) e0.s.b(this.f16599c)) + ')';
    }

    @Override // f0.r1
    public final CaptureRequest.Builder u(TotalCaptureResult totalCaptureResult) throws Throwable {
        double d3;
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        StringBuilder sb2 = new StringBuilder("CXCP#createReprocessCaptureRequest-");
        String str = this.f16599c;
        sb2.append(str);
        String string = sb2.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                j1 j1Var = this.f16600d;
                try {
                    d3 = 1000000.0d;
                    try {
                        builderCreateReprocessCaptureRequest = this.f16598b.createReprocessCaptureRequest(totalCaptureResult);
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
                            j1Var.a(str, i11, true);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            j1Var.a(str, 9, false);
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        builderCreateReprocessCaptureRequest = null;
                    }
                } catch (Exception e11) {
                    e = e11;
                    d3 = 1000000.0d;
                }
                Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / d3)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
                return builderCreateReprocessCaptureRequest;
            } catch (Throwable th2) {
                th = th2;
                Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", e0.f.r(string, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [h0.n] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // f0.r1
    public final boolean u0(InputConfiguration inputConfiguration, ArrayList arrayList, p1 p1Var) throws Throwable {
        String str;
        ?? r92;
        String str2;
        String str3;
        c4 c4Var;
        boolean z11;
        boolean z12;
        Unit unit;
        ?? r93;
        ?? r94 = this.f16602f;
        CameraDevice cameraDevice = this.f16598b;
        p1Var.getClass();
        Pair pairA = a(p1Var);
        boolean zBooleanValue = ((Boolean) pairA.f26485a).booleanValue();
        c4 c4Var2 = (c4) pairA.f26486b;
        if (!zBooleanValue) {
            return false;
        }
        if (c4Var2 != null) {
            b(c4Var2);
        }
        String str4 = this.f16599c;
        String strK = e0.f.k("CXCP#createReprocessableCaptureSession-", str4);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strK);
                j1 j1Var = this.f16600d;
                try {
                    c4Var = c4Var2;
                    try {
                        j1 j1Var2 = this.f16600d;
                        w2.z zVar = this.f16601e;
                        try {
                            Handler handlerA = r94.a();
                            str3 = strK;
                            z11 = true;
                            try {
                                cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayList, new j(this, p1Var, c4Var, j1Var2, zVar, handlerA), r94.a());
                                unit = Unit.f26487a;
                                z12 = false;
                                r93 = z11;
                            } catch (Exception e5) {
                                e = e5;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i11 = 3;
                                    if (reason != z11) {
                                        if (reason == 2) {
                                            i11 = 6;
                                        } else if (reason == 3) {
                                            i11 = 0;
                                        } else if (reason == 4) {
                                            i11 = z11 ? 1 : 0;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i11 = 11;
                                        } else {
                                            i11 = 2;
                                        }
                                    }
                                    j1Var.a(str4, i11, z11);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z12 = false;
                                    j1Var.a(str4, 9, false);
                                    unit = null;
                                    r93 = z11;
                                }
                                z12 = false;
                                unit = null;
                                r93 = z11;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str3 = strK;
                            z11 = true;
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = strK;
                            r94 = 1;
                            str = str2;
                            r92 = r94;
                            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, r92, null, "%.3f ms", e0.f.r(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        z11 = true;
                        str3 = strK;
                    } catch (Throwable th3) {
                        th = th3;
                        r94 = 1;
                        str2 = strK;
                    }
                } catch (Exception e13) {
                    e = e13;
                    str3 = strK;
                    c4Var = c4Var2;
                    z11 = true;
                } catch (Throwable th4) {
                    th = th4;
                    str2 = strK;
                    r94 = 1;
                }
                Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, r93, null, "%.3f ms", e0.f.r(str3, " - ")));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                    if (c4Var != null) {
                        c(c4Var);
                    }
                }
                return unit != null ? r93 : z12;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            str = strK;
            r92 = 1;
            Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, r92, null, "%.3f ms", e0.f.r(str, " - ")));
            throw th;
        }
    }
}
