package i20;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends c5.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f22979k = {0, 1350, 2700, 4050};
    public static final int[] l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f22980m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c20.d f22981n = new c20.d(4, "animationFraction", Float.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c20.d f22982o = new c20.d(5, "completeEndFraction", Float.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f22983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f22984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u8.a f22985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f22986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f22988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f22989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.vectordrawable.graphics.drawable.c f22990j;

    public h(k kVar) {
        super(1);
        this.f22987g = 0;
        this.f22990j = null;
        this.f22986f = kVar;
        this.f22985e = new u8.a(1);
    }

    @Override // c5.b
    public final void d() {
        ObjectAnimator objectAnimator = this.f22983c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // c5.b
    public final void m() {
        z();
        ObjectAnimator objectAnimator = this.f22983c;
        k kVar = this.f22986f;
        objectAnimator.setDuration((long) (kVar.f22965n * 5400.0f));
        this.f22984d.setDuration((long) (kVar.f22965n * 333.0f));
        this.f22987g = 0;
        ((o) ((ArrayList) this.f7114b).get(0)).f23038c = kVar.f22957e[0];
        this.f22989i = 0.0f;
    }

    @Override // c5.b
    public final void u(c cVar) {
        this.f22990j = cVar;
    }

    @Override // c5.b
    public final void v() {
        ObjectAnimator objectAnimator = this.f22984d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((r) this.f7113a).isVisible()) {
            this.f22984d.start();
        } else {
            d();
        }
    }

    @Override // c5.b
    public final void x() {
        z();
        this.f22987g = 0;
        ((o) ((ArrayList) this.f7114b).get(0)).f23038c = this.f22986f.f22957e[0];
        this.f22989i = 0.0f;
        this.f22983c.start();
    }

    @Override // c5.b
    public final void y() {
        this.f22990j = null;
    }

    public final void z() {
        ObjectAnimator objectAnimator = this.f22983c;
        k kVar = this.f22986f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f22981n, 0.0f, 1.0f);
            this.f22983c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (kVar.f22965n * 5400.0f));
            this.f22983c.setInterpolator(null);
            this.f22983c.setRepeatCount(-1);
            this.f22983c.addListener(new g(this, 0));
        }
        if (this.f22984d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f22982o, 0.0f, 1.0f);
            this.f22984d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (kVar.f22965n * 333.0f));
            this.f22984d.setInterpolator(this.f22985e);
            this.f22984d.addListener(new g(this, 1));
        }
    }
}
