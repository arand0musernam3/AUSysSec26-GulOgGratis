package i20;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends c5.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f23073k = {533, 567, 850, 750};
    public static final int[] l = {1267, 1000, AppConstants.REQUEST_CODE_ORDER_VIEW, 0};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c20.d f23074m = new c20.d(10, "animationFraction", Float.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f23075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f23076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator[] f23077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f23078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f23081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.vectordrawable.graphics.drawable.c f23082j;

    public v(Context context, w wVar) {
        super(2);
        this.f23079g = 0;
        this.f23082j = null;
        this.f23078f = wVar;
        this.f23077e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    public final void A() {
        this.f23079g = 0;
        Iterator it = ((ArrayList) this.f7114b).iterator();
        while (it.hasNext()) {
            ((o) it.next()).f23038c = this.f23078f.f22957e[0];
        }
    }

    @Override // c5.b
    public final void d() {
        ObjectAnimator objectAnimator = this.f23075c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // c5.b
    public final void m() {
        z();
        ObjectAnimator objectAnimator = this.f23075c;
        w wVar = this.f23078f;
        objectAnimator.setDuration((long) (wVar.f22965n * 1800.0f));
        this.f23076d.setDuration((long) (wVar.f22965n * 1800.0f));
        A();
    }

    @Override // c5.b
    public final void u(c cVar) {
        this.f23082j = cVar;
    }

    @Override // c5.b
    public final void v() {
        ObjectAnimator objectAnimator = this.f23076d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        d();
        if (((r) this.f7113a).isVisible()) {
            this.f23076d.setFloatValues(this.f23081i, 1.0f);
            this.f23076d.setDuration((long) ((1.0f - this.f23081i) * 1800.0f));
            this.f23076d.start();
        }
    }

    @Override // c5.b
    public final void x() {
        z();
        A();
        this.f23075c.start();
    }

    @Override // c5.b
    public final void y() {
        this.f23082j = null;
    }

    public final void z() {
        ObjectAnimator objectAnimator = this.f23075c;
        int i11 = 0;
        w wVar = this.f23078f;
        c20.d dVar = f23074m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, dVar, 0.0f, 1.0f);
            this.f23075c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (wVar.f22965n * 1800.0f));
            this.f23075c.setInterpolator(null);
            this.f23075c.setRepeatCount(-1);
            this.f23075c.addListener(new u(this, i11));
        }
        if (this.f23076d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, dVar, 1.0f);
            this.f23076d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (wVar.f22965n * 1800.0f));
            this.f23076d.setInterpolator(null);
            this.f23076d.addListener(new u(this, 1));
        }
    }
}
