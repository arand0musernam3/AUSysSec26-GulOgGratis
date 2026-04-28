package b0;

import android.util.Log;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3 f5233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0.b0 f5234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z.d f5235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w.l0 f5236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v80.j0 f5238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f5239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinkedHashMap f5240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v80.q f5241i;

    public i3(k3 k3Var, e0.b0 b0Var, z.d dVar, w.l0 l0Var) {
        k3Var.getClass();
        l0Var.getClass();
        this.f5233a = k3Var;
        this.f5234b = b0Var;
        this.f5235c = dVar;
        this.f5236d = l0Var;
        this.f5237e = new Object();
        this.f5239g = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(b0.i3 r4, java.util.List r5, long r6, z70.c r8) {
        /*
            boolean r0 = r8 instanceof b0.h3
            if (r0 == 0) goto L13
            r0 = r8
            b0.h3 r0 = (b0.h3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            b0.h3 r0 = new b0.h3
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.f5217j
            y70.a r8 = y70.a.COROUTINE_SUSPENDED
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ba0.g.M(r4)
            goto L41
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L2e:
            ba0.g.M(r4)
            a3.b2 r4 = new a3.b2
            r1 = 0
            r3 = 7
            r4.<init>(r5, r1, r3)
            r0.l = r2
            java.lang.Object r4 = v80.j2.c(r6, r4, r0)
            if (r4 != r8) goto L41
            return r8
        L41:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L47
            kotlin.collections.n0 r4 = kotlin.collections.n0.f26529a
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.i3.a(b0.i3, java.util.List, long, z70.c):java.lang.Object");
    }

    public static final void b(i3 i3Var) {
        Set setKeySet;
        e0.h0 h0VarA = i3Var.f5234b.a();
        h0VarA.getClass();
        synchronized (h0VarA.f15345a) {
            try {
                h0VarA.f15347c.add(i3Var);
                LinkedHashMap linkedHashMap = h0VarA.f15346b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap2.keySet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            i3Var.d((Surface) it.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(b0.i3 r4, z70.c r5) {
        /*
            boolean r0 = r5 instanceof b0.g3
            if (r0 == 0) goto L13
            r0 = r5
            b0.g3 r0 = (b0.g3) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            b0.g3 r0 = new b0.g3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f5204j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)     // Catch: java.util.concurrent.CancellationException -> L48
            return r5
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L2e:
            ba0.g.M(r5)
            java.lang.Object r5 = r4.f5237e
            monitor-enter(r5)
            v80.j0 r2 = r4.f5238f     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L5d
            v80.q r4 = r4.f5241i     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L3d
            goto L5d
        L3d:
            monitor-exit(r5)
            r0.l = r3     // Catch: java.util.concurrent.CancellationException -> L48
            java.lang.Object r4 = r2.m(r0)     // Catch: java.util.concurrent.CancellationException -> L48
            if (r4 != r1) goto L47
            return r1
        L47:
            return r4
        L48:
            java.lang.String r4 = "CXCP"
            r5 = 5
            boolean r4 = wd.a.B(r5, r4)
            if (r4 == 0) goto L58
            java.lang.String r4 = "CXCP"
            java.lang.String r5 = "Surface setup was cancelled"
            android.util.Log.w(r4, r5)
        L58:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L5b:
            r4 = move-exception
            goto L61
        L5d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r5)
            return r4
        L61:
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.i3.c(b0.i3, z70.c):java.lang.Object");
    }

    public final void d(Surface surface) {
        s0.x0 x0Var;
        surface.getClass();
        synchronized (this.f5237e) {
            try {
                LinkedHashMap linkedHashMap = this.f5240h;
                if (linkedHashMap != null && (x0Var = (s0.x0) linkedHashMap.get(surface)) != null && !this.f5239g.containsKey(surface)) {
                    if (wd.a.B(3, "CXCP")) {
                        Log.d("CXCP", "SurfaceActive " + x0Var + " in " + this);
                    }
                    this.f5239g.put(surface, x0Var);
                    try {
                        x0Var.d();
                    } catch (DeferrableSurface$SurfaceClosedException e5) {
                        if (wd.a.B(5, "CXCP")) {
                            Log.w("CXCP", "Error when " + surface + " going to increase the use count.", e5);
                        }
                        w.l0 l0Var = this.f5236d;
                        s0.x0 x0Var2 = e5.f2218a;
                        x0Var2.getClass();
                        l0Var.a(x0Var2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f5237e) {
            try {
                if (this.f5239g.isEmpty() && this.f5240h == null) {
                    if (wd.a.B(3, "CXCP")) {
                        Log.d("CXCP", this + " remove surface listener");
                    }
                    e0.h0 h0VarA = this.f5234b.a();
                    h0VarA.getClass();
                    synchronized (h0VarA.f15345a) {
                        h0VarA.f15347c.remove(this);
                    }
                    v80.q qVar = this.f5241i;
                    if (qVar != null) {
                        qVar.R(Unit.f26487a);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
