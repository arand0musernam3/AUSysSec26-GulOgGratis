package androidx.core.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.e;
import bg.t;
import h7.d1;
import h7.e1;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPropertyAnimatorCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f2737a;

    public ViewPropertyAnimatorCompat(View view) {
        this.f2737a = new WeakReference(view);
    }

    public ViewPropertyAnimatorCompat a(float f11) {
        View view = (View) this.f2737a.get();
        if (view != null) {
            view.animate().alpha(f11);
        }
        return this;
    }

    public void b() {
        View view = (View) this.f2737a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = (View) this.f2737a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public ViewPropertyAnimatorCompat d(long j9) {
        View view = (View) this.f2737a.get();
        if (view != null) {
            view.animate().setDuration(j9);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat e(Interpolator interpolator) {
        View view = (View) this.f2737a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat f(d1 d1Var) {
        View view = (View) this.f2737a.get();
        if (view != null) {
            if (d1Var != null) {
                view.animate().setListener(new e(d1Var, view));
                return this;
            }
            view.animate().setListener(null);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat g(long j9) {
        View view = (View) this.f2737a.get();
        if (view != null) {
            view.animate().setStartDelay(j9);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat h(e1 e1Var) {
        View view = (View) this.f2737a.get();
        if (view != null) {
            view.animate().setUpdateListener(e1Var != null ? new t(e1Var, view) : null);
        }
        return this;
    }

    public void i() {
        View view = (View) this.f2737a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public ViewPropertyAnimatorCompat j(float f11) {
        View view = (View) this.f2737a.get();
        if (view != null) {
            view.animate().translationY(f11);
        }
        return this;
    }
}
