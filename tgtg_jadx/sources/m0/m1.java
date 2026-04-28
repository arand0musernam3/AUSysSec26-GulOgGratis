package m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import s0.n2;
import s0.o2;
import s0.r2;
import s0.u1;
import s0.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o2 f28557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o2 f28558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashSet f28559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o2 f28560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s0.n f28561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o2 f28562k;
    public Rect l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s0.i0 f28564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s0.i0 f28565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public z1 f28566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z1 f28567q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28552a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f28553b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f28554c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f28555d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k1 f28556e = k1.INACTIVE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Matrix f28563m = new Matrix();

    public m1(o2 o2Var) {
        new i1(this);
        this.f28566p = z1.a();
        this.f28567q = z1.a();
        this.f28558g = o2Var;
        this.f28560i = o2Var;
    }

    public final void A(s0.i0 i0Var) {
        y();
        synchronized (this.f28554c) {
            try {
                s0.i0 i0Var2 = this.f28564n;
                if (i0Var == i0Var2) {
                    this.f28553b.remove(i0Var2);
                    this.f28564n = null;
                }
                s0.i0 i0Var3 = this.f28565o;
                if (i0Var == i0Var3) {
                    this.f28553b.remove(i0Var3);
                    this.f28565o = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f28555d) {
        }
        this.f28561j = null;
        this.l = null;
        this.f28560i = this.f28558g;
        this.f28557f = null;
        this.f28562k = null;
    }

    public final void B(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f28566p = (z1) list.get(0);
        if (list.size() > 1) {
            this.f28567q = (z1) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (s0.x0 x0Var : ((z1) it.next()).b()) {
                if (x0Var.f38474j == null) {
                    x0Var.f38474j = getClass();
                }
            }
        }
    }

    public final void C(s0.n nVar, s0.n nVar2) {
        this.f28561j = x(nVar, nVar2);
    }

    public final void a(u1 u1Var, s0.n nVar) {
        Range range = s0.n.f38401h;
        if (!range.equals(nVar.f38406e)) {
            Range range2 = nVar.f38406e;
            i0.w wVar = u1Var.f38447b;
            wVar.getClass();
            ((s0.i1) wVar.f22747d).v(s0.r0.f38437h, range2);
            return;
        }
        synchronized (this.f28554c) {
            try {
                s0.i0 i0Var = this.f28564n;
                i0Var.getClass();
                ArrayList arrayListC = i0Var.q().s().c(AeFpsRangeQuirk.class);
                boolean z11 = true;
                if (arrayListC.size() > 1) {
                    z11 = false;
                }
                pd.g.i("There should not have more than one AeFpsRangeQuirk.", z11);
                if (!arrayListC.isEmpty()) {
                    Range range3 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListC.get(0))).f2171a.getValue();
                    if (range3 != null) {
                        range = range3;
                    }
                    i0.w wVar2 = u1Var.f38447b;
                    wVar2.getClass();
                    ((s0.i1) wVar2.f22747d).v(s0.r0.f38437h, range);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(s0.i0 i0Var, s0.i0 i0Var2, o2 o2Var, o2 o2Var2) {
        synchronized (this.f28554c) {
            this.f28564n = i0Var;
            this.f28565o = i0Var2;
            this.f28553b.add(i0Var);
            if (i0Var2 != null) {
                this.f28553b.add(i0Var2);
            }
        }
        this.f28557f = o2Var;
        this.f28562k = o2Var2;
        this.f28560i = o(i0Var.q(), this.f28557f, this.f28562k);
        synchronized (this.f28555d) {
        }
        r();
    }

    public final Size c() {
        s0.n nVar = this.f28561j;
        if (nVar != null) {
            return nVar.f38402a;
        }
        return null;
    }

    public final s0.i0 d() {
        s0.i0 i0Var;
        synchronized (this.f28554c) {
            i0Var = this.f28564n;
        }
        return i0Var;
    }

    public final s0.f0 e() {
        synchronized (this.f28554c) {
            try {
                s0.i0 i0Var = this.f28564n;
                if (i0Var == null) {
                    return s0.f0.f38328a;
                }
                return i0Var.f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String f() {
        s0.i0 i0VarD = d();
        pd.g.m(i0VarD, "No camera attached to use case: " + this);
        return i0VarD.q().d();
    }

    public abstract o2 g(boolean z11, r2 r2Var);

    public final String h() {
        String str = (String) this.f28560i.i(y0.i.f44569d1, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int i(s0.i0 i0Var, boolean z11) {
        int iN = i0Var.q().n(((s0.d1) this.f28560i).w(0));
        return (i0Var.o() || !z11) ? iN : v0.o.j(-iN);
    }

    public final s0.i0 j() {
        s0.i0 i0Var;
        synchronized (this.f28554c) {
            i0Var = this.f28565o;
        }
        return i0Var;
    }

    public Set k(s0.g0 g0Var) {
        return null;
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public abstract n2 m(s0.u0 u0Var);

    public final boolean n(s0.i0 i0Var) {
        int iIntValue = ((Integer) ((s0.d1) this.f28560i).i(s0.d1.C0, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return i0Var.d();
        }
        i4.a.d(j4.s.f(iIntValue, "Unknown mirrorMode: "));
        return false;
    }

    public final o2 o(s0.g0 g0Var, o2 o2Var, o2 o2Var2) {
        s0.i1 i1VarH;
        if (o2Var2 != null) {
            i1VarH = s0.i1.s(o2Var2);
            i1VarH.y(y0.i.f44569d1);
        } else {
            i1VarH = s0.i1.h();
        }
        TreeMap treeMap = i1VarH.f38383a;
        s0.g gVar = s0.d1.f38313z0;
        o2 o2Var3 = this.f28558g;
        if (o2Var3.g(gVar) || o2Var3.g(s0.d1.D0)) {
            s0.g gVar2 = s0.d1.H0;
            if (treeMap.containsKey(gVar2)) {
                i1VarH.y(gVar2);
            }
        }
        s0.g gVar3 = s0.d1.H0;
        if (o2Var3.g(gVar3)) {
            s0.g gVar4 = s0.d1.F0;
            if (treeMap.containsKey(gVar4) && ((f1.b) o2Var3.d(gVar3)).f17042b != null) {
                i1VarH.y(gVar4);
            }
        }
        Iterator it = o2Var3.c().iterator();
        while (it.hasNext()) {
            s0.u0.r(i1VarH, i1VarH, o2Var3, (s0.g) it.next());
        }
        if (o2Var != null) {
            for (s0.g gVar5 : o2Var.c()) {
                if (!gVar5.f38329a.equals(y0.i.f44569d1.f38329a)) {
                    s0.u0.r(i1VarH, i1VarH, o2Var, gVar5);
                }
            }
        }
        if (treeMap.containsKey(s0.d1.D0)) {
            s0.g gVar6 = s0.d1.f38313z0;
            if (treeMap.containsKey(gVar6)) {
                i1VarH.y(gVar6);
            }
        }
        s0.g gVar7 = s0.d1.H0;
        if (treeMap.containsKey(gVar7) && ((f1.b) i1VarH.d(gVar7)).f17043c != 0) {
            i1VarH.v(o2.S0, Boolean.TRUE);
        }
        wd.a.p("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.f28559h + ", this = " + this);
        HashSet<n0.b> hashSet = this.f28559h;
        if (hashSet != null) {
            int i11 = p0.a.f34095c;
            Range range = s0.n.f38401h;
            u0.b bVar = p0.f.f34104c;
            c0 c0Var = c0.f28478d;
            for (n0.b bVar2 : hashSet) {
                if (bVar2 instanceof p0.a) {
                    c0Var = ((p0.a) bVar2).f34096a;
                } else if (bVar2 instanceof p0.c) {
                    p0.c cVar = (p0.c) bVar2;
                    range = new Range(Integer.valueOf(cVar.f34099a), Integer.valueOf(cVar.f34100b));
                } else if (bVar2 instanceof p0.f) {
                    bVar = ((p0.f) bVar2).f34105a;
                }
            }
            if ((this instanceof s0) || v0.p.c(this)) {
                i1VarH.v(s0.c1.f38309y0, c0Var);
            }
            i1VarH.v(o2.P0, range);
            int i12 = j1.f28545a[bVar.ordinal()];
            if (i12 == 1) {
                i1VarH.v(o2.V0, 0);
                i1VarH.v(o2.W0, 0);
            } else if (i12 == 2) {
                i1VarH.v(o2.V0, 1);
                i1VarH.v(o2.W0, 1);
            } else if (i12 == 3) {
                i1VarH.v(o2.V0, 0);
                i1VarH.v(o2.W0, 2);
            } else if (i12 == 4) {
                i1VarH.v(o2.V0, 2);
                i1VarH.v(o2.W0, 0);
            }
        }
        return t(g0Var, m(i1VarH));
    }

    public final void p() {
        Iterator it = this.f28553b.iterator();
        while (it.hasNext()) {
            ((l1) it.next()).c(this);
        }
    }

    public final void q() {
        int iOrdinal = this.f28556e.ordinal();
        HashSet hashSet = this.f28553b;
        if (iOrdinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((l1) it.next()).g(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((l1) it2.next()).r(this);
            }
        }
    }

    public o2 t(s0.g0 g0Var, n2 n2Var) {
        return n2Var.f();
    }

    public void u() {
        this.f28552a = true;
    }

    public void v() {
        this.f28552a = false;
    }

    public s0.n w(s0.u0 u0Var) {
        s0.n nVar = this.f28561j;
        if (nVar == null) {
            h2.a("Attempt to update the implementation options for a use case without attached stream specifications.");
            return null;
        }
        g40.b bVarB = nVar.b();
        bVarB.f20005f = u0Var;
        return bVarB.d();
    }

    public abstract s0.n x(s0.n nVar, s0.n nVar2);

    public abstract void y();

    public void z(Rect rect) {
        this.l = rect;
    }

    public void r() {
    }

    public void s() {
    }
}
