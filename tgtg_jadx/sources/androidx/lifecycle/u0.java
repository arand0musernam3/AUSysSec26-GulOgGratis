package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f3523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f3524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f3525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f3526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v80.l f3527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e90.c f3528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z70.i f3529g;

    /* JADX WARN: Multi-variable type inference failed */
    public u0(w wVar, Ref.ObjectRef objectRef, v80.b0 b0Var, w wVar2, v80.l lVar, e90.c cVar, Function2 function2) {
        this.f3523a = wVar;
        this.f3524b = objectRef;
        this.f3525c = b0Var;
        this.f3526d = wVar2;
        this.f3527e = lVar;
        this.f3528f = cVar;
        this.f3529g = (z70.i) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, v80.b2] */
    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, w wVar) {
        w wVar2 = this.f3523a;
        Ref.ObjectRef objectRef = this.f3524b;
        if (wVar == wVar2) {
            objectRef.element = v80.f0.B(this.f3525c, null, null, new al.n(this.f3528f, (Function2) this.f3529g, (x70.c) null), 3);
            return;
        }
        if (wVar == this.f3526d) {
            v80.i1 i1Var = (v80.i1) objectRef.element;
            if (i1Var != null) {
                i1Var.a(null);
            }
            objectRef.element = null;
        }
        if (wVar == w.ON_DESTROY) {
            u70.o oVar = u70.q.f40850b;
            this.f3527e.resumeWith(Unit.f26487a);
        }
    }
}
