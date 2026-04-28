package i20;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import com.app.tgtg.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends c5.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u8.a f22993k = k10.a.f25731b;
    public static final int[] l = {0, 1500, 3000, 4500};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float[] f22994m = {0.1f, 0.87f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c20.d f22995n = new c20.d(6, "animationFraction", Float.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c20.d f22996o = new c20.d(7, "completeEndFraction", Float.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f22997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f22998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f22999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f23000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f23003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.vectordrawable.graphics.drawable.c f23004j;

    public j(Context context, k kVar) {
        super(1);
        this.f23001g = 0;
        this.f23004j = null;
        this.f23000f = kVar;
        this.f22999e = ox.h.Q(context, R.attr.motionEasingStandardInterpolator, f22993k);
    }

    @Override // c5.b
    public final void d() {
        ObjectAnimator objectAnimator = this.f22997c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // c5.b
    public final void m() {
        z();
        ObjectAnimator objectAnimator = this.f22997c;
        k kVar = this.f23000f;
        objectAnimator.setDuration((long) (kVar.f22965n * 6000.0f));
        this.f22998d.setDuration((long) (kVar.f22965n * 500.0f));
        this.f23001g = 0;
        ((o) ((ArrayList) this.f7114b).get(0)).f23038c = kVar.f22957e[0];
        this.f23003i = 0.0f;
    }

    @Override // c5.b
    public final void u(c cVar) {
        this.f23004j = cVar;
    }

    @Override // c5.b
    public final void v() {
        ObjectAnimator objectAnimator = this.f22998d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((r) this.f7113a).isVisible()) {
            this.f22998d.start();
        } else {
            d();
        }
    }

    @Override // c5.b
    public final void x() {
        z();
        this.f23001g = 0;
        ((o) ((ArrayList) this.f7114b).get(0)).f23038c = this.f23000f.f22957e[0];
        this.f23003i = 0.0f;
        this.f22997c.start();
    }

    @Override // c5.b
    public final void y() {
        this.f23004j = null;
    }

    public final void z() {
        ObjectAnimator objectAnimator = this.f22997c;
        k kVar = this.f23000f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f22995n, 0.0f, 1.0f);
            this.f22997c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (kVar.f22965n * 6000.0f));
            this.f22997c.setInterpolator(null);
            this.f22997c.setRepeatCount(-1);
            this.f22997c.addListener(new i(this, 0));
        }
        if (this.f22998d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f22996o, 0.0f, 1.0f);
            this.f22998d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (kVar.f22965n * 500.0f));
            this.f22998d.addListener(new i(this, 1));
        }
    }
}
