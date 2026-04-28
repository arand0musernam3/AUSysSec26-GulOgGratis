package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f3539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f3540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v80.l f3541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo.b f3542d;

    public v1(Lifecycle.State state, Lifecycle lifecycle, v80.l lVar, qo.b bVar) {
        this.f3539a = state;
        this.f3540b = lifecycle;
        this.f3541c = lVar;
        this.f3542d = bVar;
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, w wVar) {
        Object pVar;
        w.Companion.getClass();
        w wVarC = u.c(this.f3539a);
        v80.l lVar = this.f3541c;
        Lifecycle lifecycle = this.f3540b;
        if (wVar != wVarC) {
            if (wVar == w.ON_DESTROY) {
                lifecycle.d(this);
                u70.o oVar = u70.q.f40850b;
                lVar.resumeWith(new u70.p(new LifecycleDestroyedException(null)));
                return;
            }
            return;
        }
        lifecycle.d(this);
        qo.b bVar = this.f3542d;
        try {
            u70.o oVar2 = u70.q.f40850b;
            pVar = bVar.invoke();
        } catch (Throwable th2) {
            u70.o oVar3 = u70.q.f40850b;
            pVar = new u70.p(th2);
        }
        lVar.resumeWith(pVar);
    }
}
