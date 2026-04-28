package i20;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends c5.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c20.d f23064i = new c20.d(9, "animationFraction", Float.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f23065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u8.a f23066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f23067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23070h;

    public t(w wVar) {
        super(3);
        this.f23068f = 1;
        this.f23067e = wVar;
        this.f23066d = new u8.a(1);
    }

    public final void A() {
        this.f23069g = true;
        this.f23068f = 1;
        for (o oVar : (ArrayList) this.f7114b) {
            w wVar = this.f23067e;
            oVar.f23038c = wVar.f22957e[0];
            oVar.f23039d = wVar.f22961i / 2;
        }
    }

    @Override // c5.b
    public final void d() {
        ObjectAnimator objectAnimator = this.f23065c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // c5.b
    public final void m() {
        z();
        this.f23065c.setDuration((long) (this.f23067e.f22965n * 333.0f));
        A();
    }

    @Override // c5.b
    public final void x() {
        z();
        A();
        this.f23065c.start();
    }

    public final void z() {
        if (this.f23065c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f23064i, 0.0f, 1.0f);
            this.f23065c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f23067e.f22965n * 333.0f));
            this.f23065c.setInterpolator(null);
            this.f23065c.setRepeatCount(-1);
            this.f23065c.addListener(new androidx.vectordrawable.graphics.drawable.e(this, 7));
        }
    }

    @Override // c5.b
    public final void v() {
    }

    @Override // c5.b
    public final void y() {
    }

    @Override // c5.b
    public final void u(c cVar) {
    }
}
