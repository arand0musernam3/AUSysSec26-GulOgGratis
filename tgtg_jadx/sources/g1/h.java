package g1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import c1.m;
import c1.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import m0.j0;
import m0.l1;
import m0.m1;
import m0.s0;
import s0.d1;
import s0.i0;
import s0.o2;
import s0.r2;
import s0.w1;
import s0.x0;
import s0.x1;
import s0.z1;
import v0.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f18097a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r2 f18101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f18102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f18103g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f18105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f18106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f18107k;
    public final b l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18098b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f18099c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f18100d = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f18104h = new g(this);

    public h(i0 i0Var, i0 i0Var2, HashSet hashSet, r2 r2Var, e.b bVar) {
        this.f18102f = i0Var;
        this.f18103g = i0Var2;
        this.f18101e = r2Var;
        this.f18097a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            m1 m1Var = (m1) it.next();
            map.put(m1Var, m1Var.o(i0Var.q(), null, m1Var.g(true, r2Var)));
        }
        this.f18106j = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.f18105i = hashSet2;
        this.f18107k = new b(i0Var, hashSet2);
        if (this.f18103g != null) {
            this.l = new b(this.f18103g, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            m1 m1Var2 = (m1) it2.next();
            this.f18100d.put(m1Var2, Boolean.FALSE);
            this.f18099c.put(m1Var2, new f(i0Var, this, bVar));
        }
    }

    public static void t(n nVar, x0 x0Var, z1 z1Var) {
        nVar.d();
        try {
            a.a.t();
            nVar.a();
            m mVar = nVar.l;
            Objects.requireNonNull(mVar);
            mVar.g(x0Var, new c1.i(mVar, 0));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            w1 w1Var = z1Var.f38493f;
            if (w1Var != null) {
                w1Var.a(z1Var, x1.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static x0 u(m1 m1Var) {
        List listB = m1Var instanceof j0 ? m1Var.f28566p.b() : Collections.unmodifiableList(m1Var.f28566p.f38494g.f38438a);
        pd.g.n(null, listB.size() <= 1);
        if (listB.size() == 1) {
            return (x0) listB.get(0);
        }
        return null;
    }

    @Override // m0.l1
    public final void c(m1 m1Var) {
        x0 x0VarU;
        a.a.t();
        n nVarW = w(m1Var);
        if (x(m1Var) && (x0VarU = u(m1Var)) != null) {
            t(nVarW, x0VarU, m1Var.f28566p);
        }
    }

    @Override // m0.l1
    public final void e(m1 m1Var) {
        a.a.t();
        if (x(m1Var)) {
            n nVarW = w(m1Var);
            x0 x0VarU = u(m1Var);
            if (x0VarU != null) {
                t(nVarW, x0VarU, m1Var.f28566p);
                return;
            }
            a.a.t();
            nVarW.a();
            nVarW.l.a();
        }
    }

    @Override // m0.l1
    public final void g(m1 m1Var) {
        a.a.t();
        if (x(m1Var)) {
            return;
        }
        this.f18100d.put(m1Var, Boolean.TRUE);
        x0 x0VarU = u(m1Var);
        if (x0VarU != null) {
            t(w(m1Var), x0VarU, m1Var.f28566p);
        }
    }

    @Override // m0.l1
    public final void r(m1 m1Var) {
        a.a.t();
        if (x(m1Var)) {
            this.f18100d.put(m1Var, Boolean.FALSE);
            n nVarW = w(m1Var);
            a.a.t();
            nVarW.a();
            nVarW.l.a();
        }
    }

    public final e1.c s(m1 m1Var, b bVar, i0 i0Var, n nVar, int i11, boolean z11) {
        int iN = i0Var.b().n(i11);
        boolean zF = o.f(nVar.f6897b);
        o2 o2Var = (o2) this.f18106j.get(m1Var);
        Objects.requireNonNull(o2Var);
        a aVarB = bVar.b(o2Var, nVar.f6899d, o.b(nVar.f6897b), z11);
        Rect rect = aVarB.f18064a;
        Size size = aVarB.f18065b;
        int iJ = o.j((nVar.f6904i + i0Var.b().n(((d1) m1Var.f28560i).w(0))) - iN);
        return new e1.c(UUID.randomUUID(), m1Var instanceof s0 ? 1 : m1Var instanceof j0 ? 4 : 2, m1Var instanceof j0 ? 256 : 34, rect, o.h(iJ, size), iJ, m1Var.n(i0Var) ^ zF);
    }

    public final HashMap v(n nVar, boolean z11) {
        HashMap map = new HashMap();
        for (m1 m1Var : this.f18097a) {
            o2 o2Var = (o2) this.f18106j.get(m1Var);
            Objects.requireNonNull(o2Var);
            Size size = this.f18107k.b(o2Var, nVar.f6899d, o.b(nVar.f6897b), z11).f18066c;
            map.put(m1Var, size);
            wd.a.p("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + m1Var);
        }
        return map;
    }

    public final n w(m1 m1Var) {
        n nVar = (n) this.f18098b.get(m1Var);
        Objects.requireNonNull(nVar);
        return nVar;
    }

    public final boolean x(m1 m1Var) {
        Boolean bool = (Boolean) this.f18100d.get(m1Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void y(HashMap map, HashMap map2) {
        HashMap map3 = this.f18098b;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            m1 m1Var = (m1) entry.getKey();
            n nVar = (n) entry.getValue();
            m1Var.z(nVar.f6899d);
            m1Var.f28563m = new Matrix(nVar.f6897b);
            g40.b bVarB = nVar.f6902g.b();
            Size size = (Size) map2.get(m1Var);
            if (size != null) {
                bVarB.f20001b = size;
            }
            m1Var.C(bVarB.d(), null);
            m1Var.q();
        }
    }
}
