package q6;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f36181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36182d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q2 f36184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Interpolator f36185g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f36187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f36188j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f36190m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i6.e f36183e = new i6.e(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36186h = false;
    public final Rect l = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f36189k = System.nanoTime();

    public f0(q2 q2Var, p pVar, int i11, int i12, int i13, Interpolator interpolator, int i14, int i15) {
        this.f36190m = false;
        this.f36184f = q2Var;
        this.f36181c = pVar;
        this.f36182d = i12;
        if (((ArrayList) q2Var.f48337e) == null) {
            q2Var.f48337e = new ArrayList();
        }
        ((ArrayList) q2Var.f48337e).add(this);
        this.f36185g = interpolator;
        this.f36179a = i14;
        this.f36180b = i15;
        if (i13 == 3) {
            this.f36190m = true;
        }
        this.f36188j = i11 == 0 ? Float.MAX_VALUE : 1.0f / i11;
        a();
    }

    public final void a() {
        boolean z11 = this.f36186h;
        int i11 = this.f36180b;
        int i12 = this.f36179a;
        Interpolator interpolator = this.f36185g;
        p pVar = this.f36181c;
        q2 q2Var = this.f36184f;
        if (z11) {
            long jNanoTime = System.nanoTime();
            long j9 = jNanoTime - this.f36189k;
            this.f36189k = jNanoTime;
            float f11 = this.f36187i - (((float) (j9 * 1.0E-6d)) * this.f36188j);
            this.f36187i = f11;
            if (f11 < 0.0f) {
                this.f36187i = 0.0f;
            }
            float interpolation = this.f36187i;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            boolean zD = pVar.d(interpolation, jNanoTime, pVar.f36277b, this.f36183e);
            if (this.f36187i <= 0.0f) {
                if (i12 != -1) {
                    pVar.f36277b.setTag(i12, Long.valueOf(System.nanoTime()));
                }
                if (i11 != -1) {
                    pVar.f36277b.setTag(i11, null);
                }
                ((ArrayList) q2Var.f48338f).add(this);
            }
            if (this.f36187i > 0.0f || zD) {
                ((MotionLayout) q2Var.f48333a).invalidate();
                return;
            }
            return;
        }
        long jNanoTime2 = System.nanoTime();
        long j11 = jNanoTime2 - this.f36189k;
        this.f36189k = jNanoTime2;
        float f12 = (((float) (j11 * 1.0E-6d)) * this.f36188j) + this.f36187i;
        this.f36187i = f12;
        if (f12 >= 1.0f) {
            this.f36187i = 1.0f;
        }
        float interpolation2 = this.f36187i;
        if (interpolator != null) {
            interpolation2 = interpolator.getInterpolation(interpolation2);
        }
        boolean zD2 = pVar.d(interpolation2, jNanoTime2, pVar.f36277b, this.f36183e);
        if (this.f36187i >= 1.0f) {
            if (i12 != -1) {
                pVar.f36277b.setTag(i12, Long.valueOf(System.nanoTime()));
            }
            if (i11 != -1) {
                pVar.f36277b.setTag(i11, null);
            }
            if (!this.f36190m) {
                ((ArrayList) q2Var.f48338f).add(this);
            }
        }
        if (this.f36187i < 1.0f || zD2) {
            ((MotionLayout) q2Var.f48333a).invalidate();
        }
    }

    public final void b() {
        this.f36186h = true;
        int i11 = this.f36182d;
        if (i11 != -1) {
            this.f36188j = i11 == 0 ? Float.MAX_VALUE : 1.0f / i11;
        }
        ((MotionLayout) this.f36184f.f48333a).invalidate();
        this.f36189k = System.nanoTime();
    }
}
