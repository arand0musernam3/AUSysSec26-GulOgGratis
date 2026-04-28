package zc;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import v80.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f47420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f47421b;

    public a(Lifecycle lifecycle, i1 i1Var) {
        this.f47420a = lifecycle;
        this.f47421b = i1Var;
    }

    @Override // zc.q
    public final void g() {
        this.f47420a.d(this);
    }

    @Override // androidx.lifecycle.h
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f47421b.a(null);
    }

    @Override // zc.q
    public final void start() {
        this.f47420a.a(this);
    }
}
