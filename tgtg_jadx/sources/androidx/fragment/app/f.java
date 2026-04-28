package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends l2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f3184c;

    public f(g gVar) {
        this.f3184c = gVar;
    }

    @Override // androidx.fragment.app.l2
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        m2 m2Var = this.f3184c.f3254a;
        View view = m2Var.f3269c.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        m2Var.c(this);
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + m2Var + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.l2
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        g gVar = this.f3184c;
        m2 m2Var = gVar.f3254a;
        if (gVar.a()) {
            m2Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = m2Var.f3269c.mView;
        context.getClass();
        p0 p0VarB = gVar.b(context);
        if (p0VarB == null) {
            com.braze.h2.b("Required value was null.");
            return;
        }
        Animation animation = p0VarB.f3310a;
        if (animation == null) {
            com.braze.h2.b("Required value was null.");
            return;
        }
        if (m2Var.f3267a != q2.REMOVED) {
            view.startAnimation(animation);
            m2Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        q0 q0Var = new q0(animation, viewGroup, view);
        q0Var.setAnimationListener(new e(m2Var, viewGroup, view, this));
        view.startAnimation(q0Var);
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + m2Var + " has started.");
        }
    }
}
