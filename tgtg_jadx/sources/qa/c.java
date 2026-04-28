package qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f36643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f36644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f36646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f36650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f36651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f36652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f36653k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f36654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f36655n;

    public c(View view, Rect rect, boolean z11, Rect rect2, boolean z12, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f36643a = view;
        this.f36644b = rect;
        this.f36645c = z11;
        this.f36646d = rect2;
        this.f36647e = z12;
        this.f36648f = i11;
        this.f36649g = i12;
        this.f36650h = i13;
        this.f36651i = i14;
        this.f36652j = i15;
        this.f36653k = i16;
        this.l = i17;
        this.f36654m = i18;
    }

    @Override // qa.w
    public final void b() {
        View view = this.f36643a;
        view.setTag(R.id.transition_clip, view.getClipBounds());
        view.setClipBounds(this.f36647e ? null : this.f36646d);
    }

    @Override // qa.w
    public final void f() {
        View view = this.f36643a;
        Rect rect = (Rect) view.getTag(R.id.transition_clip);
        view.setTag(R.id.transition_clip, null);
        view.setClipBounds(rect);
    }

    @Override // qa.w
    public final void g(y yVar) {
        this.f36655n = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z11) {
        if (this.f36655n) {
            return;
        }
        Rect rect = null;
        if (z11) {
            if (!this.f36645c) {
                rect = this.f36644b;
            }
        } else if (!this.f36647e) {
            rect = this.f36646d;
        }
        View view = this.f36643a;
        view.setClipBounds(rect);
        if (z11) {
            k0.a(view, this.f36648f, this.f36649g, this.f36650h, this.f36651i);
        } else {
            k0.a(view, this.f36652j, this.f36653k, this.l, this.f36654m);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z11) {
        int i11 = this.f36650h;
        int i12 = this.f36648f;
        int i13 = this.l;
        int i14 = this.f36652j;
        int iMax = Math.max(i11 - i12, i13 - i14);
        int i15 = this.f36651i;
        int i16 = this.f36649g;
        int i17 = this.f36654m;
        int i18 = this.f36653k;
        int iMax2 = Math.max(i15 - i16, i17 - i18);
        if (z11) {
            i12 = i14;
        }
        if (z11) {
            i16 = i18;
        }
        View view = this.f36643a;
        k0.a(view, i12, i16, iMax + i12, iMax2 + i16);
        view.setClipBounds(z11 ? this.f36646d : this.f36644b);
    }

    @Override // qa.w
    public final void a(y yVar) {
    }

    @Override // qa.w
    public final void c(y yVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        onAnimationStart(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
