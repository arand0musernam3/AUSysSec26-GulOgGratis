package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements LifecycleOwner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t0 f3512i = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3514b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f3517e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3515c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3516d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f3518f = new f0(this, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final al.u f3519g = new al.u(this, 8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a50.c f3520h = new a50.c(this, 5);

    public final void a() {
        int i11 = this.f3514b + 1;
        this.f3514b = i11;
        if (i11 == 1) {
            if (this.f3515c) {
                this.f3518f.g(w.ON_RESUME);
                this.f3515c = false;
            } else {
                Handler handler = this.f3517e;
                handler.getClass();
                handler.removeCallbacks(this.f3519g);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f3518f;
    }
}
