package ye;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.n1;
import b5.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import v80.b1;
import v80.d0;
import v80.f0;
import v80.j0;
import y80.g1;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f45852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.g f45853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v80.b0 f45854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v80.x f45855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v80.x f45856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v80.x f45857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f45858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u70.t f45859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public hf.g f45860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ub.a f45861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u70.t f45862k;
    public final j0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ub.a f45863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n1 f45864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u70.t f45865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u70.t f45866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g1 f45867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u70.t f45868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.google.firebase.messaging.j f45869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public gf.d f45870t;

    public b(g gVar) {
        j30.g gVar2 = new j30.g(14, (byte) 0);
        a90.d dVarB = f0.b(f0.d());
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        executorServiceNewCachedThreadPool.getClass();
        b1 b1Var = new b1(executorServiceNewCachedThreadPool);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        b1 b1Var2 = new b1(executorServiceNewSingleThreadExecutor);
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor2.getClass();
        b1 b1Var3 = new b1(executorServiceNewSingleThreadExecutor2);
        this.f45852a = gVar;
        this.f45853b = gVar2;
        this.f45854c = dVarB;
        this.f45855d = b1Var;
        this.f45856e = b1Var2;
        this.f45857f = b1Var3;
        this.f45859h = u70.l.b(new nf.a(this, 3));
        int i11 = 1;
        this.f45862k = u70.l.b(new nf.a(this, i11));
        ub.a aVar = new ub.a(i11, false);
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        setSynchronizedSet.getClass();
        aVar.f40982c = setSynchronizedSet;
        this.f45863m = aVar;
        n1 n1Var = new n1();
        n1Var.f3499a = gVar2;
        n1Var.f3500b = new Object();
        this.f45864n = n1Var;
        this.f45865o = u70.l.b(new nf.a(this, 0));
        this.f45866p = u70.l.b(new nf.a(this, 2));
        this.f45867q = new g1(y80.r.a(0, 1000, x80.a.DROP_OLDEST));
        if (StringsKt.H(gVar.f45886a) || gVar.f45888c <= 0 || gVar.f45889d <= 0) {
            i4.a.f("invalid configuration");
            throw null;
        }
        b0 b0Var = new b0();
        b0Var.f37043b = this;
        this.f45858g = b0Var;
        this.f45869s = new com.google.firebase.messaging.j(1);
        this.f45870t = new gf.d();
        j0 j0VarE = f0.e(this.f45854c, this.f45855d, d0.LAZY, new mn.g(this, this, null, 5));
        this.l = j0VarE;
        j0VarE.start();
        this.f45868r = u70.l.b(new r1(20, gVar, this));
        try {
            Runtime.getRuntime().addShutdownHook(new of.k(this, 2));
        } catch (IllegalStateException unused) {
        }
        Context context = gVar.f45887b;
        context.getClass();
        Application application = (Application) context;
        com.google.firebase.messaging.j jVar = this.f45869s;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityLifecycleCallbacks");
            jVar = null;
        }
        application.registerActivityLifecycleCallbacks(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ye.b r6, xf.b r7, z70.c r8) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.b.b(ye.b, xf.b, z70.c):java.lang.Object");
    }

    public static void h(b bVar, oz.m mVar) {
        LinkedHashMap linkedHashMapO;
        pf.b bVar2 = new pf.b();
        synchronized (mVar) {
            linkedHashMapO = ex.i.o((LinkedHashMap) mVar.f33837c);
        }
        bVar2.N = linkedHashMapO;
        bVar.i(bVar2);
    }

    public static void k(b bVar, String str, Map map, int i11) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        bVar.getClass();
        str.getClass();
        pf.a aVar = new pf.a();
        aVar.L = str;
        aVar.M = map != null ? new LinkedHashMap(map) : null;
        bVar.i(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final void a(qf.d dVar) {
        dVar.getClass();
        if (dVar instanceof gf.a) {
            j30.g gVar = this.f45853b;
            gf.a aVar = (gf.a) dVar;
            synchronized (((ArrayList) gVar.f24504d)) {
                aVar.a(this);
                ((ArrayList) gVar.f24504d).add(aVar);
            }
            return;
        }
        b0 b0Var = this.f45858g;
        b0Var.getClass();
        dVar.a(b0Var.b());
        qf.b bVar = (qf.b) b0Var.f37042a.get(dVar.getType());
        if (bVar != null) {
            bVar.f37041a.add(dVar);
        }
    }

    public final of.l c() {
        return (of.l) this.f45865o.getValue();
    }

    public final hf.g d() {
        hf.g gVar = this.f45860i;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("identifyInterceptStorage");
        return null;
    }

    public final ub.a e() {
        ub.a aVar = this.f45861j;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("identityStorage");
        return null;
    }

    public final kf.b f() {
        return (kf.b) this.f45862k.getValue();
    }

    public final hf.g g() {
        return (hf.g) this.f45859h.getValue();
    }

    public final void i(pf.a aVar) {
        if (aVar.f34736c == null) {
            aVar.f34736c = Long.valueOf(System.currentTimeMillis());
        }
        LinkedHashMap linkedHashMap = aVar.M;
        aVar.M = linkedHashMap != null ? ex.i.o(linkedHashMap) : null;
        LinkedHashMap linkedHashMap2 = aVar.N;
        aVar.N = linkedHashMap2 != null ? ex.i.o(linkedHashMap2) : null;
        LinkedHashMap linkedHashMap3 = aVar.O;
        aVar.O = linkedHashMap3 != null ? ex.i.o(linkedHashMap3) : null;
        LinkedHashMap linkedHashMap4 = aVar.P;
        aVar.P = linkedHashMap4 != null ? ex.i.o(linkedHashMap4) : null;
        f().b("Logged event with type: " + aVar.a());
        b0 b0Var = this.f45858g;
        b0Var.getClass();
        if (aVar.f34736c == null) {
            aVar.f34736c = Long.valueOf(System.currentTimeMillis());
        }
        if (b0Var.f45871c.h(new k(aVar)) instanceof x80.o) {
            b0Var.b().f().a("Failed to enqueue event: " + aVar.a() + ". Channel is closed or full.");
        }
    }

    public final void j(String str) {
        Unit unit;
        n1 n1Var = this.f45864n;
        synchronized (n1Var.f3500b) {
            try {
                ((j30.g) n1Var.f3499a).C(str);
                q2 q2Var = (q2) n1Var.f3501c;
                if (q2Var != null) {
                    xf.a aVarI = q2Var.I();
                    String str2 = aVarI.f44243a;
                    q2Var.g0(new xf.a(str, aVarI.f44244b), xf.e.Updated);
                    unit = Unit.f26487a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    n1Var.f3502d = new nf.c(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
