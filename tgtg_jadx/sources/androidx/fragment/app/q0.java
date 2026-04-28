package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f3316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f3317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3320e;

    public q0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f3320e = true;
        this.f3316a = viewGroup;
        this.f3317b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j9, Transformation transformation) {
        this.f3320e = true;
        if (this.f3318c) {
            return !this.f3319d;
        }
        if (!super.getTransformation(j9, transformation)) {
            this.f3318c = true;
            h7.y.a(this.f3316a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11 = this.f3318c;
        ViewGroup viewGroup = this.f3316a;
        if (z11 || !this.f3320e) {
            viewGroup.endViewTransition(this.f3317b);
            this.f3319d = true;
        } else {
            this.f3320e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j9, Transformation transformation, float f11) {
        this.f3320e = true;
        if (this.f3318c) {
            return !this.f3319d;
        }
        if (!super.getTransformation(j9, transformation, f11)) {
            this.f3318c = true;
            h7.y.a(this.f3316a, this);
        }
        return true;
    }
}
