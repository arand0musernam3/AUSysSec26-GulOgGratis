package c20;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6984a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6987d;

    public l(boolean z11, View view, View view2) {
        this.f6985b = z11;
        this.f6986c = view;
        this.f6987d = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6984a) {
            case 0:
                p pVar = (p) this.f6987d;
                pVar.f7010r = 0;
                pVar.f7005m = null;
                z zVar = (z) this.f6986c;
                if (zVar != null) {
                    ((w.b) zVar.f43083b).W();
                }
                break;
            default:
                View view = (View) this.f6987d;
                if (!this.f6985b) {
                    ((View) this.f6986c).setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f6984a) {
            case 0:
                p pVar = (p) this.f6987d;
                pVar.f7014v.a(0, this.f6985b);
                pVar.f7010r = 2;
                pVar.f7005m = animator;
                break;
            default:
                View view = (View) this.f6987d;
                if (this.f6985b) {
                    ((View) this.f6986c).setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                }
                break;
        }
    }

    public l(p pVar, boolean z11, z zVar) {
        this.f6987d = pVar;
        this.f6985b = z11;
        this.f6986c = zVar;
    }
}
