package ve;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ValueAnimator implements Choreographer.FrameCallback {
    public he.k l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f42252a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f42253b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f42254c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f42255d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42256e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f42257f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f42258g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f42259h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42260i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f42261j = -2.1474836E9f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f42262k = 2.1474836E9f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42263m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f42264n = false;

    public final float a() {
        he.k kVar = this.l;
        if (kVar == null) {
            return 0.0f;
        }
        float f11 = this.f42259h;
        float f12 = kVar.l;
        return (f11 - f12) / (kVar.f21937m - f12);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f42253b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f42254c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f42252a.add(animatorUpdateListener);
    }

    public final float b() {
        he.k kVar = this.l;
        if (kVar == null) {
            return 0.0f;
        }
        float f11 = this.f42262k;
        return f11 == 2.1474836E9f ? kVar.f21937m : f11;
    }

    public final float c() {
        he.k kVar = this.l;
        if (kVar == null) {
            return 0.0f;
        }
        float f11 = this.f42261j;
        return f11 == -2.1474836E9f ? kVar.l : f11;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f42253b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        f(d());
        i(true);
    }

    public final boolean d() {
        return this.f42255d < 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j9) {
        boolean z11 = false;
        if (this.f42263m) {
            i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        he.k kVar = this.l;
        if (kVar == null || !this.f42263m) {
            return;
        }
        he.a aVar = he.e.f21898a;
        float fAbs = (this.f42257f != 0 ? j9 - r2 : 0L) / ((1.0E9f / kVar.f21938n) / Math.abs(this.f42255d));
        float f11 = this.f42258g;
        if (d()) {
            fAbs = -fAbs;
        }
        float f12 = f11 + fAbs;
        float fC = c();
        float fB = b();
        PointF pointF = g.f42266a;
        if (f12 >= fC && f12 <= fB) {
            z11 = true;
        }
        float f13 = this.f42258g;
        float fB2 = g.b(f12, c(), b());
        this.f42258g = fB2;
        if (this.f42264n) {
            fB2 = (float) Math.floor(fB2);
        }
        this.f42259h = fB2;
        this.f42257f = j9;
        if (z11) {
            if (!this.f42264n || this.f42258g != f13) {
                h();
            }
        } else if (getRepeatCount() == -1 || this.f42260i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f42256e = !this.f42256e;
                this.f42255d = -this.f42255d;
            } else {
                float fB3 = d() ? b() : c();
                this.f42258g = fB3;
                this.f42259h = fB3;
            }
            this.f42257f = j9;
            if (!this.f42264n || this.f42258g != f13) {
                h();
            }
            Iterator it = this.f42253b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f42260i++;
        } else {
            float fC2 = this.f42255d < 0.0f ? c() : b();
            this.f42258g = fC2;
            this.f42259h = fC2;
            i(true);
            if (!this.f42264n || this.f42258g != f13) {
                h();
            }
            f(d());
        }
        if (this.l != null) {
            float f14 = this.f42259h;
            float f15 = this.f42261j;
            if (f14 < f15 || f14 > this.f42262k) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f15), Float.valueOf(this.f42262k), Float.valueOf(this.f42259h)));
            }
        }
        he.a aVar2 = he.e.f21898a;
    }

    public final void f(boolean z11) {
        Iterator it = this.f42253b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z11);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fC;
        float fB;
        float fC2;
        if (this.l == null) {
            return 0.0f;
        }
        if (d()) {
            fC = b() - this.f42259h;
            fB = b();
            fC2 = c();
        } else {
            fC = this.f42259h - c();
            fB = b();
            fC2 = c();
        }
        return fC / (fB - fC2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        he.k kVar = this.l;
        if (kVar == null) {
            return 0L;
        }
        return (long) kVar.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h() {
        Iterator it = this.f42252a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void i(boolean z11) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z11) {
            this.f42263m = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f42263m;
    }

    public final void j(float f11) {
        if (this.f42258g == f11) {
            return;
        }
        float fB = g.b(f11, c(), b());
        this.f42258g = fB;
        if (this.f42264n) {
            fB = (float) Math.floor(fB);
        }
        this.f42259h = fB;
        this.f42257f = 0L;
        h();
    }

    public final void k(float f11, float f12) {
        if (f11 > f12) {
            j4.d.g("minFrame (", f11, ") must be <= maxFrame (", f12, ")");
            return;
        }
        he.k kVar = this.l;
        float f13 = kVar == null ? -3.4028235E38f : kVar.l;
        float f14 = kVar == null ? Float.MAX_VALUE : kVar.f21937m;
        float fB = g.b(f11, f13, f14);
        float fB2 = g.b(f12, f13, f14);
        if (fB == this.f42261j && fB2 == this.f42262k) {
            return;
        }
        this.f42261j = fB;
        this.f42262k = fB2;
        j((int) g.b(this.f42259h, fB, fB2));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f42253b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f42252a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f42253b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f42254c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f42252a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j9) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i11) {
        super.setRepeatMode(i11);
        if (i11 == 2 || !this.f42256e) {
            return;
        }
        this.f42256e = false;
        this.f42255d = -this.f42255d;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j9) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j9) {
        setDuration(j9);
        throw null;
    }
}
