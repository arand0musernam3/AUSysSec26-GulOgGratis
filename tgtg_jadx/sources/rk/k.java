package rk;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements androidx.lifecycle.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.f f38080b;

    public /* synthetic */ k(rt.f fVar, int i11) {
        this.f38079a = i11;
        this.f38080b = fVar;
    }

    @Override // androidx.lifecycle.h
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        switch (this.f38079a) {
            case 0:
                this.f38080b.c();
                break;
            default:
                this.f38080b.c();
                break;
        }
    }

    @Override // androidx.lifecycle.h
    public final void onPause(LifecycleOwner lifecycleOwner) {
        switch (this.f38079a) {
            case 0:
                this.f38080b.e();
                break;
            default:
                this.f38080b.e();
                break;
        }
    }

    @Override // androidx.lifecycle.h
    public final void onResume(LifecycleOwner lifecycleOwner) {
        int i11 = this.f38079a;
        lifecycleOwner.getClass();
        switch (i11) {
            case 0:
                this.f38080b.f();
                break;
            default:
                this.f38080b.f();
                break;
        }
    }

    @Override // androidx.lifecycle.h
    public final void onStop(LifecycleOwner lifecycleOwner) {
        switch (this.f38079a) {
            case 0:
                this.f38080b.i();
                break;
            default:
                this.f38080b.i();
                break;
        }
    }
}
