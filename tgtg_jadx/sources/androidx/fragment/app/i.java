package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends l2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f3230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f3231d;

    public i(g gVar) {
        this.f3230c = gVar;
    }

    @Override // androidx.fragment.app.l2
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.f3231d;
        m2 m2Var = this.f3230c.f3254a;
        if (animatorSet == null) {
            m2Var.c(this);
            return;
        }
        if (m2Var.f3273g) {
            k.f3245a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (FragmentManager.L(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(m2Var);
            sb2.append(" has been canceled");
            sb2.append(m2Var.f3273g ? " with seeking." : ".");
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // androidx.fragment.app.l2
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        m2 m2Var = this.f3230c.f3254a;
        AnimatorSet animatorSet = this.f3231d;
        if (animatorSet == null) {
            m2Var.c(this);
            return;
        }
        animatorSet.start();
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Animator from operation " + m2Var + " has started.");
        }
    }

    @Override // androidx.fragment.app.l2
    public final void d(androidx.activity.b bVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        m2 m2Var = this.f3230c.f3254a;
        AnimatorSet animatorSet = this.f3231d;
        if (animatorSet == null) {
            m2Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !m2Var.f3269c.mTransitioning) {
            return;
        }
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + m2Var);
        }
        long jA = j.f3241a.a(animatorSet);
        long jA2 = (long) (bVar.a() * jA);
        if (jA2 == 0) {
            jA2 = 1;
        }
        if (jA2 == jA) {
            jA2 = jA - 1;
        }
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + jA2 + " for Animator " + animatorSet + " on operation " + m2Var);
        }
        k.f3245a.b(animatorSet, jA2);
    }

    @Override // androidx.fragment.app.l2
    public final void e(ViewGroup viewGroup) {
        i iVar;
        viewGroup.getClass();
        g gVar = this.f3230c;
        if (gVar.a()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        p0 p0VarB = gVar.b(context);
        this.f3231d = p0VarB != null ? p0VarB.f3311b : null;
        m2 m2Var = gVar.f3254a;
        Fragment fragment = m2Var.f3269c;
        boolean z11 = m2Var.f3267a == q2.GONE;
        View view = fragment.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f3231d;
        if (animatorSet != null) {
            iVar = this;
            animatorSet.addListener(new h(viewGroup, view, z11, m2Var, iVar));
        } else {
            iVar = this;
        }
        AnimatorSet animatorSet2 = iVar.f3231d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
