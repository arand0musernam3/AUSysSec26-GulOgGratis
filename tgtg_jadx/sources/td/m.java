package td;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import v80.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements p, androidx.lifecycle.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f40027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f40028b;

    public m(Lifecycle lifecycle, i1 i1Var) {
        this.f40027a = lifecycle;
        this.f40028b = i1Var;
    }

    @Override // td.p
    public final void g() {
        this.f40027a.d(this);
    }

    @Override // td.p
    public final Object h(fd.s sVar) throws Throwable {
        Object objA = ae.i.a(this.f40027a, sVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    @Override // androidx.lifecycle.h
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f40028b.a(null);
    }

    @Override // td.p
    public final void start() {
        this.f40027a.a(this);
    }
}
