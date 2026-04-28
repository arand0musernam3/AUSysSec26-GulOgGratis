package y9;

import a3.p2;
import android.os.Looper;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a90.d f45756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CoroutineContext f45757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f45758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rb.k f45759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a40.x f45760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f45761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f45762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f45764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f45765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45766k;

    public v() {
        new b40.d(0, this, v.class, "onClosed", "onClosed()V", 0, 20);
        h hVar = new h();
        hVar.f45666a = new AtomicInteger(0);
        hVar.f45667b = new AtomicBoolean(false);
        this.f45762g = hVar;
        this.f45764i = new ThreadLocal();
        this.f45765j = new LinkedHashMap();
        this.f45766k = true;
    }

    public final void a() {
        if (this.f45763h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            h2.b("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        ja.b bVarN = h().N();
        if (!bVarN.e0()) {
            k kVarG = g();
            kVarG.getClass();
            wd.a.F(new j(kVarG, null, 2));
        }
        if (bVarN.f24770a.isWriteAheadLoggingEnabled()) {
            bVarN.e();
        } else {
            bVarN.a();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(w0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(w.v((KClass) entry.getKey()), entry.getValue());
        }
        return kotlin.collections.n0.f26529a;
    }

    public abstract k d();

    public l8.g e() {
        throw new u70.n(null, 1, null);
    }

    public final void f() {
        h().N().p();
        if (m()) {
            return;
        }
        k kVarG = g();
        kVarG.f45683b.e(kVarG.f45686e, kVarG.f45687f);
    }

    public final k g() {
        k kVar = this.f45761f;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTracker");
        return null;
    }

    public final ia.b h() {
        a40.x xVar = this.f45760e;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            xVar = null;
        }
        ia.b bVar = (ia.b) xVar.f810h;
        if (bVar != null) {
            return bVar;
        }
        h2.b("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public final CoroutineContext i() {
        a90.d dVar = this.f45756a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            dVar = null;
        }
        return dVar.f1015a;
    }

    public Set j() {
        kotlin.collections.p0 p0Var = kotlin.collections.p0.f26531a;
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(p0Var, 10));
        Iterator<E> it = p0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(w.y((Class) it.next()));
        }
        return CollectionsKt.v0(arrayList);
    }

    public LinkedHashMap k() {
        kotlin.collections.o0.f26530a.getClass();
        int iA = w0.a(kotlin.collections.e0.o(kotlin.collections.p0.f26531a, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        kotlin.collections.m0.f26528a.getClass();
        return linkedHashMap;
    }

    public final boolean l() {
        a40.x xVar = this.f45760e;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            xVar = null;
        }
        return ((ia.b) xVar.f810h) != null;
    }

    public final boolean m() {
        return o() && h().N().e0();
    }

    public final void n(ha.a aVar) {
        aVar.getClass();
        k kVarG = g();
        kVarG.getClass();
        p0 p0Var = kVarG.f45683b;
        p0Var.getClass();
        ha.c cVarV0 = aVar.v0("PRAGMA query_only");
        try {
            cVarV0.q0();
            boolean zE = cVarV0.E();
            w.b.y(cVarV0, null);
            if (!zE) {
                z20.b.m(aVar, "PRAGMA temp_store = MEMORY");
                z20.b.m(aVar, "PRAGMA recursive_triggers = 1");
                z20.b.m(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (p0Var.f45724d) {
                    z20.b.m(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    z20.b.m(aVar, kotlin.text.y.n("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                o oVar = p0Var.f45728h;
                ReentrantLock reentrantLock = oVar.f45713a;
                reentrantLock.lock();
                try {
                    oVar.f45716d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (kVarG.f45689h) {
            }
        } finally {
        }
    }

    public final boolean o() {
        a40.x xVar = this.f45760e;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            xVar = null;
        }
        ja.b bVar = (ja.b) xVar.f811i;
        if (bVar != null) {
            return bVar.isOpen();
        }
        return false;
    }

    public final Object p(Function0 function0) {
        if (!l()) {
            return x0.A(this, false, true, new p2(15, function0));
        }
        b();
        try {
            Object objInvoke = function0.invoke();
            q();
            return objInvoke;
        } finally {
            f();
        }
    }

    public final void q() {
        h().N().A();
    }

    public final Object r(boolean z11, Function2 function2, z70.c cVar) {
        a40.x xVar = this.f45760e;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            xVar = null;
        }
        return ((aa.b) xVar.f809g).T(z11, function2, cVar);
    }
}
