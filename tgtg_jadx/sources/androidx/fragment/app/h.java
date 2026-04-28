package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m2 f3206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f3207e;

    public h(ViewGroup viewGroup, View view, boolean z11, m2 m2Var, i iVar) {
        this.f3203a = viewGroup;
        this.f3204b = view;
        this.f3205c = z11;
        this.f3206d = m2Var;
        this.f3207e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.f3203a;
        View view = this.f3204b;
        viewGroup.endViewTransition(view);
        boolean z11 = this.f3205c;
        m2 m2Var = this.f3206d;
        if (z11 || m2Var.f3267a == q2.GONE) {
            q2 q2Var = m2Var.f3267a;
            view.getClass();
            q2Var.a(view, viewGroup);
        }
        i iVar = this.f3207e;
        iVar.f3230c.f3254a.c(iVar);
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Animator from operation " + m2Var + " has ended.");
        }
    }
}
