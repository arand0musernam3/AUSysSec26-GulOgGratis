package f0;

import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f16970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.n f16971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f16973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f16974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0.g0 f16975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0.q1 f16976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f16977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f16979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16980k;
    public w0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k0.b f16981m;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public x0(q1 q1Var, h0.n nVar, int i11, Map map, Map map2, i0.g0 g0Var, e0.q1 q1Var2, boolean z11) {
        q1Var.getClass();
        nVar.getClass();
        map.getClass();
        map2.getClass();
        q1Var2.getClass();
        this.f16970a = q1Var;
        this.f16971b = nVar;
        this.f16972c = i11;
        this.f16973d = map;
        this.f16974e = map2;
        this.f16975f = g0Var;
        this.f16976g = q1Var2;
        this.f16977h = z11;
        r80.b bVar = y0.f17000a;
        bVar.getClass();
        this.f16978i = r80.b.f37780b.incrementAndGet(bVar);
        this.f16979j = new Object();
        ?? r42 = g0Var.f22657f;
        k0.b bVarQ = null;
        if (!r42.isEmpty()) {
            i0.c0 c0Var = (i0.c0) CollectionsKt.O(r42);
            Surface inputSurface = q1Var.getInputSurface();
            if (inputSurface == null) {
                com.braze.h2.b("inputSurface is required to create instance of imageWriter.");
                throw null;
            }
            try {
                bVarQ = bx.k.q(inputSurface, c0Var.f22608a, new e0.o1(c0Var.f22609b), nVar.a());
            } catch (RuntimeException e5) {
                Log.e("CXCP", "Failed to create ImageWriter for session " + this.f16970a + "! Reprocessing will not be supported!", e5);
            }
            if (bVarQ != null) {
                Log.d("CXCP", "Created ImageWriter " + bVarQ + " for session " + this.f16970a);
            }
        }
        this.f16981m = bVarQ;
    }

    public static final void a(x0 x0Var, w0 w0Var) {
        Log.d("CXCP", "Waiting for the last repeating request sequence: " + w0Var);
        if (((Unit) x0Var.f16971b.b(ConversationFragment.COORDINATOR_INITIALIZATION_TIMEOUT, new a3.c2(w0Var, null, 6))) == null) {
            Log.e("CXCP", x0Var + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + w0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0208 A[LOOP:0: B:7:0x0053->B:101:0x0208, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05ef A[LOOP:8: B:252:0x05ab->B:270:0x05ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05f9 A[LOOP:7: B:244:0x0584->B:273:0x05f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:? A[LOOP:11: B:55:0x0142->B:346:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9 A[LOOP:14: B:23:0x009f->B:40:0x00e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9 A[LOOP:13: B:15:0x0078->B:43:0x00f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0199 A[LOOP:12: B:63:0x0161->B:80:0x0199, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f0.w0 b(boolean r29, java.util.List r30, java.util.Map r31, java.util.Map r32, java.util.Map r33, a50.c r34, java.util.List r35) {
        /*
            Method dump skipped, instruction units count: 1751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.x0.b(boolean, java.util.List, java.util.Map, java.util.Map, java.util.Map, a50.c, java.util.List):f0.w0");
    }

    public final void c() {
        w0 w0Var;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.f16979j) {
                try {
                    if (this.f16980k) {
                        w0Var = null;
                    } else {
                        this.f16980k = true;
                        k0.b bVar = this.f16981m;
                        if (bVar != null) {
                            e0.f.B(bVar);
                        }
                        Surface inputSurface = this.f16970a.getInputSurface();
                        if (inputSurface != null) {
                            inputSurface.release();
                        }
                        w0Var = this.l;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f16977h && w0Var != null) {
                a(this, w0Var);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer d(f0.w0 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f16979j
            monitor-enter(r0)
            boolean r1 = r4.f16980k     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            java.lang.String r1 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            r2.append(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = " disconnected. "
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            r2.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = " won't be submitted"
            r2.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L28
            android.util.Log.w(r1, r5)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)
            r5 = 0
            return r5
        L28:
            r5 = move-exception
            goto L71
        L2a:
            java.util.ArrayList r1 = r5.f16940c     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L28
            r2 = 1
            if (r1 != r2) goto L5e
            f0.q1 r1 = r4.f16970a     // Catch: java.lang.Throwable -> L28
            boolean r2 = r1 instanceof f0.c     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L5e
            boolean r2 = r5.f16939b     // Catch: java.lang.Throwable -> L28
            r3 = 0
            if (r2 == 0) goto L51
            boolean r2 = r4.f16977h     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L44
            r4.l = r5     // Catch: java.lang.Throwable -> L28
        L44:
            java.util.ArrayList r2 = r5.f16940c     // Catch: java.lang.Throwable -> L28
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L28
            android.hardware.camera2.CaptureRequest r2 = (android.hardware.camera2.CaptureRequest) r2     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r5 = r1.V(r2, r5)     // Catch: java.lang.Throwable -> L28
            goto L6f
        L51:
            java.util.ArrayList r2 = r5.f16940c     // Catch: java.lang.Throwable -> L28
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L28
            android.hardware.camera2.CaptureRequest r2 = (android.hardware.camera2.CaptureRequest) r2     // Catch: java.lang.Throwable -> L28
            java.lang.Integer r5 = r1.k0(r2, r5)     // Catch: java.lang.Throwable -> L28
            goto L6f
        L5e:
            boolean r1 = r5.f16939b     // Catch: java.lang.Throwable -> L28
            f0.q1 r2 = r4.f16970a
            java.util.ArrayList r3 = r5.f16940c
            if (r1 == 0) goto L6b
            java.lang.Integer r5 = r2.S(r3, r5)     // Catch: java.lang.Throwable -> L28
            goto L6f
        L6b:
            java.lang.Integer r5 = r2.w(r3, r5)     // Catch: java.lang.Throwable -> L28
        L6f:
            monitor-exit(r0)
            return r5
        L71:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.x0.d(f0.w0):java.lang.Integer");
    }

    public final String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.f16978i;
    }
}
