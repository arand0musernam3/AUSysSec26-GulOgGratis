package td;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.d0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import lx.u;
import v80.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements p, androidx.lifecycle.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.t f40048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f40049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd.a f40050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lifecycle f40051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f40052e;

    public s(fd.t tVar, i iVar, xd.a aVar, Lifecycle lifecycle, i1 i1Var) {
        this.f40048a = tVar;
        this.f40049b = iVar;
        this.f40050c = aVar;
        this.f40051d = lifecycle;
        this.f40052e = i1Var;
    }

    public final void a() {
        this.f40052e.a(null);
        xd.a aVar = this.f40050c;
        boolean z11 = aVar instanceof d0;
        Lifecycle lifecycle = this.f40051d;
        if (z11 && lifecycle != null) {
            lifecycle.d(aVar);
        }
        if (lifecycle != null) {
            lifecycle.d(this);
        }
    }

    @Override // td.p
    public final void e() {
        xd.a aVar = this.f40050c;
        if (aVar.f44235b.isAttachedToWindow()) {
            return;
        }
        t tVarH = u.H(aVar.f44235b);
        s sVar = tVarH.f40055c;
        if (sVar != null) {
            sVar.a();
        }
        tVarH.f40055c = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // td.p
    public final Object h(fd.s sVar) throws Throwable {
        Lifecycle lifecycle = this.f40051d;
        if (lifecycle == null) {
            return Unit.f26487a;
        }
        Object objA = ae.i.a(lifecycle, sVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    @Override // androidx.lifecycle.h
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        u.H(this.f40050c.f44235b).a();
    }

    @Override // td.p
    public final void start() {
        Lifecycle lifecycle = this.f40051d;
        if (lifecycle != null) {
            lifecycle.a(this);
        }
        xd.a aVar = this.f40050c;
        if ((aVar instanceof d0) && lifecycle != null) {
            xd.a aVar2 = aVar;
            lifecycle.d(aVar2);
            lifecycle.a(aVar2);
        }
        t tVarH = u.H(aVar.f44235b);
        s sVar = tVarH.f40055c;
        if (sVar != null) {
            sVar.a();
        }
        tVarH.f40055c = this;
    }
}
