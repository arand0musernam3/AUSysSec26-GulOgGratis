package k10;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f25740a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f25742c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25743d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25744e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f25741b = 150;

    public f(long j9) {
        this.f25740a = j9;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f25740a);
        animator.setDuration(this.f25741b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f25743d);
            valueAnimator.setRepeatMode(this.f25744e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f25742c;
        return timeInterpolator != null ? timeInterpolator : a.f25731b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f25740a == fVar.f25740a && this.f25741b == fVar.f25741b && this.f25743d == fVar.f25743d && this.f25744e == fVar.f25744e) {
            return b().getClass().equals(fVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f25740a;
        long j11 = this.f25741b;
        return ((((b().getClass().hashCode() + (((((int) (j9 ^ (j9 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f25743d) * 31) + this.f25744e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(f.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f25740a);
        sb2.append(" duration: ");
        sb2.append(this.f25741b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f25743d);
        sb2.append(" repeatMode: ");
        return k.i(this.f25744e, "}\n", sb2);
    }
}
