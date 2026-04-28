package zc;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import v80.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.h f47517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f47518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bd.a f47519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lifecycle f47520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f47521e;

    public t(pc.h hVar, k kVar, bd.a aVar, Lifecycle lifecycle, i1 i1Var) {
        this.f47517a = hVar;
        this.f47518b = kVar;
        this.f47519c = aVar;
        this.f47520d = lifecycle;
        this.f47521e = i1Var;
    }

    @Override // zc.q
    public final void e() {
        bd.a aVar = this.f47519c;
        if (aVar.f6105b.isAttachedToWindow()) {
            return;
        }
        u uVarC = ed.k.c(aVar.f6105b);
        t tVar = uVarC.f47525d;
        if (tVar != null) {
            Lifecycle lifecycle = tVar.f47520d;
            tVar.f47521e.a(null);
            bd.a aVar2 = tVar.f47519c;
            if (aVar2 != null) {
                lifecycle.d(aVar2);
            }
            lifecycle.d(tVar);
        }
        uVarC.f47525d = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // androidx.lifecycle.h
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        ed.k.c(this.f47519c.f6105b).a();
    }

    @Override // zc.q
    public final void start() {
        Lifecycle lifecycle = this.f47520d;
        lifecycle.a(this);
        bd.a aVar = this.f47519c;
        if (aVar != null) {
            lifecycle.d(aVar);
            lifecycle.a(aVar);
        }
        u uVarC = ed.k.c(aVar.f6105b);
        t tVar = uVarC.f47525d;
        if (tVar != null) {
            Lifecycle lifecycle2 = tVar.f47520d;
            tVar.f47521e.a(null);
            bd.a aVar2 = tVar.f47519c;
            if (aVar2 != null) {
                lifecycle2.d(aVar2);
            }
            lifecycle2.d(tVar);
        }
        uVarC.f47525d = this;
    }
}
