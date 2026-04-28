package y00;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.ye;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m3 extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3 f44961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j0 f44962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Boolean f44963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j3 f44964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledExecutorService f44965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.recyclerview.widget.j f44966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f44967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j3 f44968k;

    public m3(n1 n1Var) {
        super(n1Var);
        this.f44967j = new ArrayList();
        this.f44966i = new androidx.recyclerview.widget.j(n1Var.f44992k);
        this.f44961d = new l3(this);
        this.f44964g = new j3(this, n1Var, 0);
        this.f44968k = new j3(this, n1Var, 1);
    }

    public final void A(ComponentName componentName) {
        p();
        if (this.f44962e != null) {
            this.f44962e = null;
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45267o.b(componentName, "Disconnected from device MeasurementService");
            p();
            v();
        }
    }

    public final void B() {
        ((n1) this.f21216b).getClass();
    }

    public final void C() {
        p();
        androidx.recyclerview.widget.j jVar = this.f44966i;
        ((vz.b) jVar.f3775c).getClass();
        jVar.f3774b = SystemClock.elapsedRealtime();
        ((n1) this.f21216b).getClass();
        this.f44964g.b(((Long) g0.Y.a(null)).longValue());
    }

    public final void D(Runnable runnable) {
        p();
        if (G()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f44967j;
        long size = arrayList.size();
        n1 n1Var = (n1) this.f21216b;
        n1Var.getClass();
        if (size >= 1000) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f44968k.b(TimeConstants.ONE_MINUTE_DIFFERENCE);
            v();
        }
    }

    public final void E() {
        p();
        n1 n1Var = (n1) this.f21216b;
        w0 w0Var = n1Var.f44987f;
        n1.m(w0Var);
        u0 u0Var = w0Var.f45267o;
        ArrayList arrayList = this.f44967j;
        u0Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e5) {
                w0 w0Var2 = n1Var.f44987f;
                n1.m(w0Var2);
                w0Var2.f45260g.b(e5, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f44968k.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y00.t4 F(boolean r11) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m3.F(boolean):y00.t4");
    }

    public final boolean G() {
        p();
        q();
        return this.f44962e != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:259:0x0442 A[Catch: all -> 0x047e, TRY_ENTER, TryCatch #56 {all -> 0x047e, blocks: (B:269:0x046e, B:259:0x0442, B:261:0x0448, B:262:0x044b, B:279:0x048f, B:208:0x0379, B:210:0x0383, B:215:0x0394), top: B:399:0x046e }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x047a A[PHI: r5 r7 r24 r25 r27 r37 r38
      0x047a: PHI (r5v15 android.database.sqlite.SQLiteDatabase) = 
      (r5v12 android.database.sqlite.SQLiteDatabase)
      (r5v13 android.database.sqlite.SQLiteDatabase)
      (r5v16 android.database.sqlite.SQLiteDatabase)
     binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x047a: PHI (r7v5 int) = (r7v3 int), (r7v3 int), (r7v6 int) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x047a: PHI (r24v9 int) = (r24v6 int), (r24v7 int), (r24v10 int) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x047a: PHI (r25v9 java.lang.String) = (r25v6 java.lang.String), (r25v7 java.lang.String), (r25v10 java.lang.String) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x047a: PHI (r27v9 java.lang.String) = (r27v6 java.lang.String), (r27v7 java.lang.String), (r27v10 java.lang.String) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x047a: PHI (r37v9 int) = (r37v6 int), (r37v7 int), (r37v10 int) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x047a: PHI (r38v9 java.lang.String) = (r38v6 java.lang.String), (r38v7 java.lang.String), (r38v10 java.lang.String) binds: [B:265:0x045d, B:282:0x04a1, B:273:0x0478] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x04a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(y00.j0 r70, rz.a r71, y00.t4 r72) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m3.H(y00.j0, rz.a, y00.t4):void");
    }

    public final void I(e eVar) {
        boolean zW;
        p();
        q();
        n1 n1Var = (n1) this.f21216b;
        n1Var.getClass();
        q0 q0VarO = n1Var.o();
        n1 n1Var2 = (n1) q0VarO.f21216b;
        n1.k(n1Var2.f44990i);
        byte[] bArrZ = r4.Z(eVar);
        if (bArrZ.length > 131072) {
            w0 w0Var = n1Var2.f44987f;
            n1.m(w0Var);
            w0Var.f45261h.a("Conditional user property too long for local database. Sending directly to service");
            zW = false;
        } else {
            zW = q0VarO.w(2, bArrZ);
        }
        D(new oz.i(this, F(true), zW, new e(eVar)));
    }

    @Override // y00.i0
    public final boolean s() {
        return false;
    }

    public final void t(AtomicReference atomicReference) {
        p();
        q();
        D(new ye(this, atomicReference, F(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.p()
            r7.q()
            y00.t r4 = new y00.t
            r4.<init>(r8)
            r7.B()
            java.lang.Object r0 = r7.f21216b
            y00.n1 r0 = (y00.n1) r0
            y00.g r1 = r0.f44985d
            r2 = 0
            y00.f0 r3 = y00.g0.W0
            boolean r1 = r1.A(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            y00.q0 r0 = r0.o()
            java.lang.Object r1 = r0.f21216b
            y00.n1 r1 = (y00.n1) r1
            y00.r4 r3 = r1.f44990i
            y00.w0 r1 = r1.f44987f
            y00.n1.k(r3)
            byte[] r3 = y00.r4.Z(r4)
            if (r3 != 0) goto L3f
            y00.n1.m(r1)
            y00.u0 r0 = r1.f45261h
            java.lang.String r1 = "Null default event parameters; not writing to database"
            r0.a(r1)
        L3d:
            r0 = r2
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            y00.n1.m(r1)
            y00.u0 r0 = r1.f45261h
            java.lang.String r1 = "Default event parameters too long for local database. Sending directly to service"
            r0.a(r1)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.w(r1, r3)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = r0
            goto L5a
        L59:
            r3 = r2
        L5a:
            y00.t4 r2 = r7.F(r2)
            y00.i2 r0 = new y00.i2
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m3.u(android.os.Bundle):void");
    }

    public final void v() {
        p();
        q();
        if (G()) {
            return;
        }
        if (w()) {
            l3 l3Var = this.f44961d;
            m3 m3Var = l3Var.f44919c;
            m3Var.p();
            Context context = ((n1) m3Var.f21216b).f44982a;
            synchronized (l3Var) {
                try {
                    if (l3Var.f44917a) {
                        w0 w0Var = ((n1) l3Var.f44919c.f21216b).f44987f;
                        n1.m(w0Var);
                        w0Var.f45267o.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (l3Var.f44918b != null && (l3Var.f44918b.isConnecting() || l3Var.f44918b.isConnected())) {
                            w0 w0Var2 = ((n1) l3Var.f44919c.f21216b).f44987f;
                            n1.m(w0Var2);
                            w0Var2.f45267o.a("Already awaiting connection attempt");
                            return;
                        }
                        l3Var.f44918b = new s0(context, Looper.getMainLooper(), com.google.android.gms.common.internal.m.a(context), com.google.android.gms.common.a.f11048b, 93, l3Var, l3Var, null);
                        w0 w0Var3 = ((n1) l3Var.f44919c.f21216b).f44987f;
                        n1.m(w0Var3);
                        w0Var3.f45267o.a("Connecting to remote service");
                        l3Var.f44917a = true;
                        com.google.android.gms.common.internal.i0.h(l3Var.f44918b);
                        l3Var.f44918b.checkAvailabilityAndConnect();
                        return;
                    }
                } finally {
                }
            }
        }
        n1 n1Var = (n1) this.f21216b;
        if (n1Var.f44985d.s()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = n1Var.f44982a.getPackageManager().queryIntentServices(new Intent().setClassName(n1Var.f44982a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            w0 w0Var4 = n1Var.f44987f;
            n1.m(w0Var4);
            w0Var4.f45260g.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(n1Var.f44982a, "com.google.android.gms.measurement.AppMeasurementService"));
        l3 l3Var2 = this.f44961d;
        m3 m3Var2 = l3Var2.f44919c;
        m3Var2.p();
        Context context2 = ((n1) m3Var2.f21216b).f44982a;
        uz.a aVarB = uz.a.b();
        synchronized (l3Var2) {
            try {
                boolean z11 = l3Var2.f44917a;
                m3 m3Var3 = l3Var2.f44919c;
                if (z11) {
                    w0 w0Var5 = ((n1) m3Var3.f21216b).f44987f;
                    n1.m(w0Var5);
                    w0Var5.f45267o.a("Connection attempt already in progress");
                } else {
                    w0 w0Var6 = ((n1) m3Var3.f21216b).f44987f;
                    n1.m(w0Var6);
                    w0Var6.f45267o.a("Using local app measurement service");
                    l3Var2.f44917a = true;
                    aVarB.a(context2, intent, m3Var3.f44961d, 129);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.m3.w():boolean");
    }

    public final void x() {
        p();
        q();
        l3 l3Var = this.f44961d;
        if (l3Var.f44918b != null && (l3Var.f44918b.isConnected() || l3Var.f44918b.isConnecting())) {
            l3Var.f44918b.disconnect();
        }
        l3Var.f44918b = null;
        try {
            uz.a.b().c(((n1) this.f21216b).f44982a, l3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f44962e = null;
    }

    public final boolean y() {
        p();
        q();
        if (!w()) {
            return true;
        }
        r4 r4Var = ((n1) this.f21216b).f44990i;
        n1.k(r4Var);
        return r4Var.b0() >= ((Integer) g0.J0.a(null)).intValue();
    }

    public final boolean z() {
        p();
        q();
        if (!w()) {
            return true;
        }
        r4 r4Var = ((n1) this.f21216b).f44990i;
        n1.k(r4Var);
        return r4Var.b0() >= 241200;
    }
}
