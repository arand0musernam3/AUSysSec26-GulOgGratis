package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f3806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3808g;

    public final void a(RecyclerView recyclerView) {
        int i11 = this.f3805d;
        if (i11 >= 0) {
            this.f3805d = -1;
            recyclerView.S(i11);
            this.f3807f = false;
            return;
        }
        if (!this.f3807f) {
            this.f3808g = 0;
            return;
        }
        Interpolator interpolator = this.f3806e;
        if (interpolator != null && this.f3804c < 1) {
            com.braze.h2.b("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i12 = this.f3804c;
        if (i12 < 1) {
            com.braze.h2.b("Scroll duration must be a positive number");
            return;
        }
        recyclerView.f3594k1.c(this.f3802a, this.f3803b, i12, interpolator);
        int i13 = this.f3808g + 1;
        this.f3808g = i13;
        if (i13 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f3807f = false;
    }
}
