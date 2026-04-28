package e4;

import androidx.fragment.app.r;
import b4.s;
import b4.x;
import b5.b0;
import b5.o;
import b5.p2;
import b5.q2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o30.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends s implements q2, k, b0, l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Function1 f15742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f15743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public k f15744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f15745r;

    public i(x xVar, int i11) {
        this.f15742o = (i11 & 2) != 0 ? null : xVar;
        this.f15745r = 0L;
    }

    @Override // e4.k
    public final boolean D(d dVar) {
        i iVar = this.f15743p;
        if (iVar != null) {
            return iVar.D(dVar);
        }
        k kVar = this.f15744q;
        if (kVar != null) {
            return kVar.D(dVar);
        }
        return false;
    }

    @Override // e4.k
    public final void E0(d dVar) {
        q2 q2Var;
        i iVar;
        i iVar2 = this.f15743p;
        if (iVar2 == null || !j.a(iVar2, e0.x(dVar))) {
            if (getNode().isAttached()) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                o.r(this, new h(objectRef, this, dVar));
                q2Var = (q2) objectRef.element;
            } else {
                q2Var = null;
            }
            iVar = (i) q2Var;
        } else {
            iVar = iVar2;
        }
        if (iVar != null && iVar2 == null) {
            iVar.y(dVar);
            iVar.E0(dVar);
            k kVar = this.f15744q;
            if (kVar != null) {
                kVar.Q(dVar);
            }
        } else if (iVar == null && iVar2 != null) {
            k kVar2 = this.f15744q;
            if (kVar2 != null) {
                kVar2.y(dVar);
                kVar2.E0(dVar);
            }
            iVar2.Q(dVar);
        } else if (!Intrinsics.areEqual(iVar, iVar2)) {
            if (iVar != null) {
                iVar.y(dVar);
                iVar.E0(dVar);
            }
            if (iVar2 != null) {
                iVar2.Q(dVar);
            }
        } else if (iVar != null) {
            iVar.E0(dVar);
        } else {
            k kVar3 = this.f15744q;
            if (kVar3 != null) {
                kVar3.E0(dVar);
            }
        }
        this.f15743p = iVar;
    }

    @Override // e4.k
    public final void I0(d dVar) {
        r rVar = new r(dVar, 13);
        if (rVar.invoke(this) != p2.ContinueTraversal) {
            return;
        }
        o.r(this, rVar);
    }

    @Override // e4.k
    public final void Q(d dVar) {
        k kVar = this.f15744q;
        if (kVar != null) {
            kVar.Q(dVar);
        }
        i iVar = this.f15743p;
        if (iVar != null) {
            iVar.Q(dVar);
        }
        this.f15743p = null;
    }

    @Override // b5.q2
    public final Object g() {
        return f.f15735a;
    }

    @Override // b5.b0
    public final void k(long j9) {
        this.f15745r = j9;
    }

    @Override // b4.s
    public final void onDetach() {
        this.f15744q = null;
        this.f15743p = null;
    }

    @Override // e4.k
    public final void y(d dVar) {
        k kVar = this.f15744q;
        if (kVar != null) {
            kVar.y(dVar);
            return;
        }
        i iVar = this.f15743p;
        if (iVar != null) {
            iVar.y(dVar);
        }
    }

    @Override // e4.k
    public final void z(d dVar) {
        k kVar = this.f15744q;
        if (kVar != null) {
            kVar.z(dVar);
            return;
        }
        i iVar = this.f15743p;
        if (iVar != null) {
            iVar.z(dVar);
        }
    }
}
