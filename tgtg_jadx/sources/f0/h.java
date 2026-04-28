package f0;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0.v f16687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.m f16690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j1 f16691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d1 f16692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f16693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h0.n f16694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f16695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CameraDevice.StateCallback f16696k;
    public final w2.z l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f16697m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f16698n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16699o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g f16700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CountDownLatch f16702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f16703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h0.o f16704t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y80.a2 f16705u;

    public h(String str, e0.v vVar, int i11, long j9, h0.m mVar, j1 j1Var, d1 d1Var, n1 n1Var, h0.n nVar, d0 d0Var, CameraDevice.StateCallback stateCallback, w2.z zVar) {
        str.getClass();
        vVar.getClass();
        mVar.getClass();
        j1Var.getClass();
        d1Var.getClass();
        n1Var.getClass();
        nVar.getClass();
        d0Var.getClass();
        this.f16686a = str;
        this.f16687b = vVar;
        this.f16688c = i11;
        this.f16689d = j9;
        this.f16690e = mVar;
        this.f16691f = j1Var;
        this.f16692g = d1Var;
        this.f16693h = n1Var;
        this.f16694i = nVar;
        this.f16695j = d0Var;
        this.f16696k = stateCallback;
        this.l = zVar;
        r80.b bVar = e4.f16632b;
        bVar.getClass();
        this.f16697m = r80.b.f37780b.incrementAndGet(bVar);
        this.f16698n = new Object();
        this.f16702r = new CountDownLatch(1);
        this.f16705u = y80.r.c(g2.f16684a);
        Log.i("CXCP", "Opening " + ((Object) e0.s.b(str)));
        this.f16703s = i11 != 1 ? SystemClock.elapsedRealtimeNanos() : j9;
    }

    public static boolean e(n1 n1Var, String str, e0.l lVar) {
        n1Var.getClass();
        str.getClass();
        n1Var.f16785b.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            return false;
        }
        e0.u uVar = e0.v.f15412i0;
        e0.v vVarD = ((k1) n1Var.f16784a).d(str);
        uVar.getClass();
        return e0.u.c(vVarD) && lVar == null;
    }

    public final void a() {
        v1 v1Var = (v1) this.f16705u.getValue();
        r1 r1Var = v1Var instanceof y1 ? ((y1) v1Var).f17003a : null;
        b(r1Var != null ? (CameraDevice) r1Var.t(Reflection.getOrCreateKotlinClass(CameraDevice.class)) : null, new g(u2.APP_CLOSED, null, null, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.hardware.camera2.CameraDevice r11, f0.g r12) throws java.lang.Throwable {
        /*
            r10 = this;
            y80.a2 r0 = r10.f16705u
            java.lang.Object r0 = r0.getValue()
            f0.v1 r0 = (f0.v1) r0
            boolean r1 = r0 instanceof f0.y1
            r2 = 0
            if (r1 == 0) goto L13
            f0.y1 r0 = (f0.y1) r0
            f0.r1 r0 = r0.f17003a
            r4 = r0
            goto L14
        L13:
            r4 = r2
        L14:
            java.lang.Object r1 = r10.f16698n
            monitor-enter(r1)
            f0.g r0 = r10.f16700p     // Catch: java.lang.Throwable -> L9e
            if (r0 != 0) goto L27
            r10.f16700p = r12     // Catch: java.lang.Throwable -> L22
            boolean r0 = r10.f16699o     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L27
            goto L28
        L22:
            r0 = move-exception
            r11 = r0
            r6 = r10
            goto La1
        L27:
            r12 = r2
        L28:
            monitor-exit(r1)
            if (r12 == 0) goto L9c
            e0.l r0 = r12.f16672c
            r1 = 0
            if (r0 == 0) goto L3f
            f0.u2 r3 = r12.f16670a
            f0.u2 r5 = f0.u2.CAMERA2_EXCEPTION
            if (r3 == r5) goto L3f
            f0.j1 r3 = r10.f16691f
            java.lang.String r5 = r10.f16686a
            int r0 = r0.f15363a
            r3.a(r5, r0, r1)
        L3f:
            y80.a2 r0 = r10.f16705u
            f0.x1 r3 = new f0.x1
            e0.l r5 = r12.f16672c
            r3.<init>(r5)
            r0.getClass()
            r0.k(r2, r3)
            f0.u2 r0 = r12.f16670a
            f0.u2 r3 = f0.u2.CAMERA2_CLOSED
            if (r0 == r3) goto L8e
            f0.n1 r0 = r10.f16693h
            java.lang.String r3 = r10.f16686a
            e0.l r5 = r12.f16672c
            boolean r5 = e(r0, r3, r5)
            r6 = 1
            if (r5 == 0) goto L69
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L69
            r8 = r6
            goto L6a
        L69:
            r8 = r1
        L6a:
            if (r8 == 0) goto L77
            java.lang.Object r1 = r10.f16698n
            monitor-enter(r1)
            r10.f16701q = r6     // Catch: java.lang.Throwable -> L73
            monitor-exit(r1)
            goto L77
        L73:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)
            throw r11
        L77:
            f0.d1 r0 = r10.f16692g
            f0.d0 r7 = r10.f16695j
            f0.n1 r1 = r10.f16693h
            java.lang.String r3 = r10.f16686a
            e0.l r5 = r12.f16672c
            boolean r9 = e(r1, r3, r5)
            r3 = r0
            f0.g1 r3 = (f0.g1) r3
            r6 = r10
            r5 = r11
            r3.b(r4, r5, r6, r7, r8, r9)
            goto L8f
        L8e:
            r6 = r10
        L8f:
            y80.a2 r11 = r6.f16705u
            f0.w1 r12 = r10.c(r12)
            r11.getClass()
            r11.k(r2, r12)
            return
        L9c:
            r6 = r10
            return
        L9e:
            r0 = move-exception
            r6 = r10
            r11 = r0
        La1:
            monitor-exit(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.h.b(android.hardware.camera2.CameraDevice, f0.g):void");
    }

    public final w1 c(g gVar) {
        this.f16690e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        h0.o oVar = this.f16704t;
        long j9 = gVar.f16671b;
        h0.d dVar = oVar != null ? new h0.d(oVar.f20991a - this.f16689d) : null;
        h0.d dVar2 = oVar != null ? new h0.d(oVar.f20991a - this.f16703s) : null;
        h0.d dVar3 = oVar == null ? null : new h0.d(j9 - oVar.f20991a);
        long j11 = jElapsedRealtimeNanos - j9;
        u2 u2Var = gVar.f16670a;
        int i11 = this.f16688c - 1;
        return new w1(this.f16686a, u2Var, Integer.valueOf(i11), dVar, gVar.f16673d, dVar2, dVar3, new h0.d(j11), gVar.f16672c);
    }

    public final void d(CameraDevice cameraDevice) throws Throwable {
        Trace.beginSection(((Object) e0.s.b(this.f16686a)) + "#onFinalized");
        Log.d("CXCP", this + ": onFinalized");
        b(cameraDevice, new g(u2.CAMERA2_CLOSED, null, null, 14));
        CameraDevice.StateCallback stateCallback = this.f16696k;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) throws Throwable {
        cameraDevice.getClass();
        if (!Intrinsics.areEqual(cameraDevice.getId(), this.f16686a)) {
            com.braze.h2.b("Check failed.");
            return;
        }
        Log.d("CXCP", ((Object) e0.s.b(this.f16686a)) + ": onClosed");
        this.f16702r.countDown();
        synchronized (this.f16698n) {
            if (!this.f16701q) {
                d(cameraDevice);
                return;
            }
            Log.i("CXCP", this + "#onClosed: Delaying finalizing.");
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) throws Throwable {
        cameraDevice.getClass();
        String id2 = cameraDevice.getId();
        String str = this.f16686a;
        if (!Intrinsics.areEqual(id2, str)) {
            com.braze.h2.b("Check failed.");
            return;
        }
        Trace.beginSection(((Object) e0.s.b(str)) + "#onDisconnected");
        Log.d("CXCP", ((Object) e0.s.b(str)) + ": onDisconnected");
        this.f16702r.countDown();
        b(cameraDevice, new g(u2.CAMERA2_DISCONNECTED, new e0.l(6), null, 10));
        CameraDevice.StateCallback stateCallback = this.f16696k;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i11) throws Throwable {
        cameraDevice.getClass();
        String id2 = cameraDevice.getId();
        String str = this.f16686a;
        if (!Intrinsics.areEqual(id2, str)) {
            com.braze.h2.b("Check failed.");
            return;
        }
        Trace.beginSection(((Object) e0.s.b(str)) + "#onError-" + i11);
        Log.d("CXCP", ((Object) e0.s.b(str)) + ": onError " + i11);
        this.f16702r.countDown();
        u2 u2Var = u2.CAMERA2_ERROR;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 != 4) {
                        i12 = 5;
                        if (i11 != 5) {
                            i4.a.f(j4.s.f(i11, "Unexpected StateCallback error code: "));
                            return;
                        }
                    }
                }
            }
        }
        b(cameraDevice, new g(u2Var, new e0.l(i12), null, 10));
        CameraDevice.StateCallback stateCallback = this.f16696k;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, i11);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String strI;
        g gVar;
        g gVar2;
        cameraDevice.getClass();
        if (!Intrinsics.areEqual(cameraDevice.getId(), this.f16686a)) {
            com.braze.h2.b("Check failed.");
            return;
        }
        this.f16690e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.f16704t = new h0.o(jElapsedRealtimeNanos);
        Trace.beginSection(((Object) e0.s.b(this.f16686a)) + "#onOpened");
        long j9 = jElapsedRealtimeNanos - this.f16703s;
        long j11 = jElapsedRealtimeNanos - this.f16689d;
        int i11 = this.f16688c;
        String str = this.f16686a;
        x70.c cVar = null;
        if (i11 == 1) {
            StringBuilder sb2 = new StringBuilder("Opened ");
            sb2.append((Object) e0.s.b(str));
            sb2.append(" in ");
            strI = e0.f.q(new Object[]{Double.valueOf(j9 / 1000000.0d)}, 1, null, "%.3f ms", sb2);
        } else {
            StringBuilder sb3 = new StringBuilder("Opened ");
            sb3.append((Object) e0.s.b(str));
            sb3.append(" in ");
            sb3.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j9 / 1000000.0d)}, 1)));
            sb3.append(" (");
            sb3.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j11 / 1000000.0d)}, 1)));
            sb3.append(" total) after ");
            strI = r8.k.i(this.f16688c, " attempts.", sb3);
        }
        Log.i("CXCP", strI);
        synchronized (this.f16698n) {
            gVar = this.f16700p;
            if (gVar == null) {
                this.f16699o = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.f16696k;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (gVar != null) {
            d1 d1Var = this.f16692g;
            d0 d0Var = this.f16695j;
            n1 n1Var = this.f16693h;
            String str2 = this.f16686a;
            ((g1) d1Var).b(null, cameraDevice, this, d0Var, e(n1Var, str2, gVar.f16672c) && n1Var.a(str2), e(this.f16693h, this.f16686a, gVar.f16672c));
            return;
        }
        d dVar = new d(this.f16687b, cameraDevice, this.f16686a, this.f16691f, this.l, this.f16694i);
        d0 d0Var2 = this.f16695j;
        d0Var2.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            synchronized (d0Var2.f16607c) {
                d0Var2.f16609e.add(dVar);
                e0.c cVarA = d0Var2.a();
                if (cVarA != null) {
                    lz.i iVar = d0Var2.f16606b;
                    a90.d dVar2 = d0Var2.f16605a;
                    aa.l0 l0Var = new aa.l0(dVar, cVarA, cVar, 14);
                    iVar.getClass();
                    dVar2.getClass();
                    v80.f0.B(dVar2, null, v80.d0.UNDISPATCHED, new al.n(iVar, l0Var, (x70.c) null), 1);
                }
            }
        }
        y80.a2 a2Var = this.f16705u;
        y1 y1Var = new y1(dVar);
        a2Var.getClass();
        a2Var.k(null, y1Var);
        synchronized (this.f16698n) {
            this.f16699o = false;
            gVar2 = this.f16700p;
        }
        if (gVar2 != null) {
            y80.a2 a2Var2 = this.f16705u;
            x1 x1Var = new x1(gVar2.f16672c);
            a2Var2.getClass();
            a2Var2.k(null, x1Var);
            d1 d1Var2 = this.f16692g;
            d0 d0Var3 = this.f16695j;
            n1 n1Var2 = this.f16693h;
            String str3 = this.f16686a;
            ((g1) d1Var2).b(dVar, cameraDevice, this, d0Var3, e(n1Var2, str3, gVar2.f16672c) && n1Var2.a(str3), e(this.f16693h, this.f16686a, gVar2.f16672c));
            y80.a2 a2Var3 = this.f16705u;
            w1 w1VarC = c(gVar2);
            a2Var3.getClass();
            a2Var3.k(null, w1VarC);
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CameraState-" + this.f16697m;
    }
}
