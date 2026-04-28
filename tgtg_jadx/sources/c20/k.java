package c20;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f6982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f6983d;

    public k(p pVar, boolean z11, z zVar) {
        this.f6983d = pVar;
        this.f6981b = z11;
        this.f6982c = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f6980a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p pVar = this.f6983d;
        pVar.f7010r = 0;
        pVar.f7005m = null;
        if (this.f6980a) {
            return;
        }
        FloatingActionButton floatingActionButton = pVar.f7014v;
        boolean z11 = this.f6981b;
        floatingActionButton.a(z11 ? 8 : 4, z11);
        z zVar = this.f6982c;
        if (zVar != null) {
            ((w.b) zVar.f43083b).V((FloatingActionButton) zVar.f43084c);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        p pVar = this.f6983d;
        pVar.f7014v.a(0, this.f6981b);
        pVar.f7010r = 1;
        pVar.f7005m = animator;
        this.f6980a = false;
    }
}
