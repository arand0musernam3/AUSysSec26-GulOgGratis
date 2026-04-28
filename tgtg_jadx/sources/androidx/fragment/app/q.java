package androidx.fragment.app;

import android.transition.Transition;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3315d;

    public q(m2 m2Var, boolean z11, boolean z12) {
        super(m2Var);
        Fragment fragment = m2Var.f3269c;
        q2 q2Var = m2Var.f3267a;
        q2 q2Var2 = q2.VISIBLE;
        this.f3313b = q2Var == q2Var2 ? z11 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z11 ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.f3314c = m2Var.f3267a == q2Var2 ? z11 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.f3315d = z12 ? z11 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final h2 b() {
        Object obj = this.f3313b;
        h2 h2VarC = c(obj);
        Object obj2 = this.f3315d;
        h2 h2VarC2 = c(obj2);
        if (h2VarC == null || h2VarC2 == null || h2VarC == h2VarC2) {
            return h2VarC == null ? h2VarC2 : h2VarC;
        }
        e40.a.l("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", this.f3254a.f3269c, " returned Transition ", obj, " which uses a different Transition  type than its shared element transition ", obj2);
        return null;
    }

    public final h2 c(Object obj) {
        if (obj == null) {
            return null;
        }
        f2 f2Var = a2.f3139a;
        if (obj instanceof Transition) {
            return f2Var;
        }
        h2 h2Var = a2.f3140b;
        if (h2Var != null && h2Var.g(obj)) {
            return h2Var;
        }
        StringBuilder sb2 = new StringBuilder("Transition ");
        sb2.append(obj);
        Fragment fragment = this.f3254a.f3269c;
        sb2.append(" for fragment ");
        sb2.append(fragment);
        sb2.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb2.toString());
    }
}
