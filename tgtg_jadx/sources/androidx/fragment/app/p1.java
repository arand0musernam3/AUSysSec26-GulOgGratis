package androidx.fragment.app;

import androidx.lifecycle.ViewModelProvider$Factory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3312a;

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final androidx.lifecycle.l1 create(Class cls) {
        switch (this.f3312a) {
            case 0:
                return new q1(true);
            default:
                return new b9.d();
        }
    }
}
