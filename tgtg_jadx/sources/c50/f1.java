package c50;

import android.util.Log;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f50.k f7533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f7534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f7535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f7536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d8.f f7537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f7538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineContext f7539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l0 f7540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7543k;

    public f1(f50.k kVar, w0 w0Var, u0 u0Var, k1 k1Var, d8.f fVar, g0 g0Var, CoroutineContext coroutineContext) {
        kVar.getClass();
        w0Var.getClass();
        u0Var.getClass();
        k1Var.getClass();
        fVar.getClass();
        g0Var.getClass();
        coroutineContext.getClass();
        this.f7533a = kVar;
        this.f7534b = w0Var;
        this.f7535c = u0Var;
        this.f7536d = k1Var;
        this.f7537e = fVar;
        this.f7538f = g0Var;
        this.f7539g = coroutineContext;
        b1 b1Var = b1.GENERAL;
        this.f7543k = "";
        v80.f0.B(v80.f0.b(coroutineContext), null, null, new a1(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(c50.f1 r4, java.lang.String r5, c50.b1 r6, x70.c r7) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c50.f1.a(c50.f1, java.lang.String, c50.b1, x70.c):java.lang.Object");
    }

    public final void b() {
        this.f7541i = false;
        if (this.f7540h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f7538f.a());
        v80.f0.B(v80.f0.b(this.f7539g), null, null, new a1(this, null, 1), 3);
    }

    public final void c() {
        this.f7541i = true;
        l0 l0Var = this.f7540h;
        if (l0Var == null) {
            this.f7542j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        x70.c cVar = null;
        if (l0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localSessionData");
            l0Var = null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f7538f.a());
        if (e(l0Var) || d(l0Var)) {
            v80.f0.B(v80.f0.b(this.f7539g), null, null, new a3.x(this, l0Var, cVar, 24), 3);
        }
    }

    public final boolean d(l0 l0Var) {
        Map map = l0Var.f7601c;
        boolean z11 = true;
        g0 g0Var = this.f7538f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + g0Var.a());
            return true;
        }
        g0Var.getClass();
        e0 e0Var = (e0) map.get(g0Var.a());
        if (e0Var != null && e0Var.f7520a == g0Var.f7550c && Intrinsics.areEqual(e0Var.f7521b, (String) g0Var.f7551d.getValue())) {
            z11 = false;
        }
        if (z11) {
            Log.d("FirebaseSessions", "Process " + g0Var.a() + " is stale");
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(c50.l0 r12) {
        /*
            r11 = this;
            c50.j1 r0 = r12.f7600b
            c50.q0 r12 = r12.f7599a
            java.lang.String r1 = "Session "
            java.lang.String r2 = "FirebaseSessions"
            r3 = 0
            if (r0 == 0) goto L77
            c50.k1 r4 = r11.f7536d
            r4.getClass()
            c50.j1 r4 = c50.k1.a()
            p80.c r5 = p80.d.f34559b
            long r4 = r4.f7590a
            long r6 = r0.f7590a
            long r4 = r4 - r6
            p80.h r0 = p80.h.MILLISECONDS
            long r4 = p80.g.h(r4, r0)
            f50.k r0 = r11.f7533a
            f50.p r6 = r0.f17357a
            p80.d r6 = r6.b()
            r7 = 0
            if (r6 == 0) goto L3a
            long r9 = r6.f34563a
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L3a
            boolean r6 = p80.d.h(r9)
            if (r6 != 0) goto L3a
            goto L57
        L3a:
            f50.p r0 = r0.f17358b
            p80.d r0 = r0.b()
            if (r0 == 0) goto L4f
            long r9 = r0.f34563a
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4f
            boolean r0 = p80.d.h(r9)
            if (r0 != 0) goto L4f
            goto L57
        L4f:
            r0 = 30
            p80.h r6 = p80.h.MINUTES
            long r9 = p80.g.g(r0, r6)
        L57:
            int r0 = p80.d.d(r4, r9)
            if (r0 <= 0) goto L5e
            r3 = 1
        L5e:
            if (r3 == 0) goto L76
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f7613a
            r0.append(r12)
            java.lang.String r12 = " is expired"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
        L76:
            return r3
        L77:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f7613a
            r0.append(r12)
            java.lang.String r12 = " has not backgrounded yet"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c50.f1.e(c50.l0):boolean");
    }
}
