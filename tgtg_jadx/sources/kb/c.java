package kb;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import ax.g0;
import com.google.firebase.messaging.a0;
import dn.k;
import ib.e;
import ib.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import jb.f;
import jb.h;
import jb.l;
import kotlin.jvm.internal.Intrinsics;
import mb.g;
import mb.i;
import o30.m0;
import ob.j;
import qb.o;
import v80.i1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h, g, jb.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f26263o = w.f("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26264a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f26266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26267d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f26270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f26271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ib.b f26272i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f26274k;
    public final g0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sb.a f26275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0 f26276n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f26265b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f26268e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f26269f = new k(new l(0));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f26273j = new HashMap();

    public c(Context context, ib.b bVar, j jVar, f fVar, k kVar, sb.a aVar) {
        this.f26264a = context;
        jb.b bVar2 = bVar.f23698g;
        this.f26266c = new a(this, bVar2, bVar.f23695d);
        this.f26276n = new a0(bVar2, kVar);
        this.f26275m = aVar;
        this.l = new g0(jVar);
        this.f26272i = bVar;
        this.f26270g = fVar;
        this.f26271h = kVar;
    }

    @Override // jb.h
    public final void a(o... oVarArr) {
        long jMax;
        if (this.f26274k == null) {
            this.f26274k = Boolean.valueOf(rb.j.a(this.f26264a, this.f26272i));
        }
        if (!this.f26274k.booleanValue()) {
            w.d().e(f26263o, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f26267d) {
            this.f26270g.a(this);
            this.f26267d = true;
        }
        HashSet<o> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o oVar : oVarArr) {
            if (!this.f26269f.k(wd.a.v(oVar))) {
                synchronized (this.f26268e) {
                    try {
                        qb.h hVarV = wd.a.v(oVar);
                        b bVar = (b) this.f26273j.get(hVarV);
                        if (bVar == null) {
                            int i11 = oVar.f36838k;
                            this.f26272i.f23695d.getClass();
                            bVar = new b(i11, System.currentTimeMillis());
                            this.f26273j.put(hVarV, bVar);
                        }
                        jMax = (((long) Math.max((oVar.f36838k - bVar.f26261a) - 5, 0)) * 30000) + bVar.f26262b;
                    } finally {
                    }
                }
                long jMax2 = Math.max(oVar.a(), jMax);
                this.f26272i.f23695d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (oVar.f36829b == ib.g0.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax2) {
                        a aVar = this.f26266c;
                        if (aVar != null) {
                            jb.b bVar2 = aVar.f26258b;
                            HashMap map = aVar.f26260d;
                            Runnable runnable = (Runnable) map.remove(oVar.f36828a);
                            if (runnable != null) {
                                ((Handler) bVar2.f24851a).removeCallbacks(runnable);
                            }
                            m0 m0Var = new m0(aVar, oVar, false, 10);
                            map.put(oVar.f36828a, m0Var);
                            aVar.f26259c.getClass();
                            ((Handler) bVar2.f24851a).postDelayed(m0Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!Intrinsics.areEqual(e.f23710j, oVar.f36837j)) {
                        e eVar = oVar.f36837j;
                        if (eVar.f23714d) {
                            w.d().a(f26263o, "Ignoring " + oVar + ". Requires device idle.");
                        } else if (eVar.f23719i.isEmpty()) {
                            hashSet.add(oVar);
                            hashSet2.add(oVar.f36828a);
                        } else {
                            w.d().a(f26263o, "Ignoring " + oVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f26269f.k(wd.a.v(oVar))) {
                        w.d().a(f26263o, "Starting work for " + oVar.f36828a);
                        k kVar = this.f26269f;
                        kVar.getClass();
                        jb.k kVarZ = kVar.z(wd.a.v(oVar));
                        this.f26276n.a0(kVarZ);
                        k kVar2 = this.f26271h;
                        kVar2.getClass();
                        kVar2.x(kVarZ, null);
                    }
                }
            }
        }
        synchronized (this.f26268e) {
            try {
                if (!hashSet.isEmpty()) {
                    w.d().a(f26263o, "Starting tracking for " + TextUtils.join(MessageLogView.COMMA_SEPARATOR, hashSet2));
                    for (o oVar2 : hashSet) {
                        qb.h hVarV2 = wd.a.v(oVar2);
                        if (!this.f26265b.containsKey(hVarV2)) {
                            this.f26265b.put(hVarV2, i.a(this.l, oVar2, this.f26275m.f38957b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // jb.h
    public final boolean b() {
        return false;
    }

    @Override // jb.c
    public final void c(qb.h hVar, boolean z11) {
        i1 i1Var;
        jb.k kVarW = this.f26269f.w(hVar);
        if (kVarW != null) {
            this.f26276n.z(kVarW);
        }
        synchronized (this.f26268e) {
            i1Var = (i1) this.f26265b.remove(hVar);
        }
        if (i1Var != null) {
            w.d().a(f26263o, "Stopping tracking for " + hVar);
            i1Var.a(null);
        }
        if (z11) {
            return;
        }
        synchronized (this.f26268e) {
            this.f26273j.remove(hVar);
        }
    }

    @Override // jb.h
    public final void d(String str) {
        List<jb.k> listA;
        Runnable runnable;
        String str2 = f26263o;
        if (this.f26274k == null) {
            this.f26274k = Boolean.valueOf(rb.j.a(this.f26264a, this.f26272i));
        }
        if (!this.f26274k.booleanValue()) {
            w.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f26267d) {
            this.f26270g.a(this);
            this.f26267d = true;
        }
        w.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f26266c;
        if (aVar != null && (runnable = (Runnable) aVar.f26260d.remove(str)) != null) {
            ((Handler) aVar.f26258b.f24851a).removeCallbacks(runnable);
        }
        k kVar = this.f26269f;
        kVar.getClass();
        str.getClass();
        synchronized (kVar.f15019c) {
            listA = ((l) kVar.f15018b).a(str);
        }
        for (jb.k kVar2 : listA) {
            this.f26276n.z(kVar2);
            k kVar3 = this.f26271h;
            kVar3.getClass();
            kVar3.y(kVar2, -512);
        }
    }

    @Override // mb.g
    public final void e(o oVar, mb.c cVar) {
        qb.h hVarV = wd.a.v(oVar);
        boolean z11 = cVar instanceof mb.a;
        k kVar = this.f26271h;
        a0 a0Var = this.f26276n;
        String str = f26263o;
        k kVar2 = this.f26269f;
        if (z11) {
            if (kVar2.k(hVarV)) {
                return;
            }
            w.d().a(str, "Constraints met: Scheduling work ID " + hVarV);
            jb.k kVarZ = kVar2.z(hVarV);
            a0Var.a0(kVarZ);
            kVar.getClass();
            kVar.x(kVarZ, null);
            return;
        }
        w.d().a(str, "Constraints not met: Cancelling work ID " + hVarV);
        jb.k kVarW = kVar2.w(hVarV);
        if (kVarW != null) {
            a0Var.z(kVarW);
            int i11 = ((mb.b) cVar).f29904a;
            kVar.getClass();
            kVar.y(kVarW, i11);
        }
    }
}
