package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f3254a;

    public l(m2 m2Var) {
        m2Var.getClass();
        this.f3254a = m2Var;
    }

    public final boolean a() {
        q2 q2VarA;
        m2 m2Var = this.f3254a;
        View view = m2Var.f3269c.mView;
        if (view != null) {
            q2.Companion.getClass();
            q2VarA = o2.a(view);
        } else {
            q2VarA = null;
        }
        q2 q2Var = m2Var.f3267a;
        if (q2VarA == q2Var) {
            return true;
        }
        q2 q2Var2 = q2.VISIBLE;
        return (q2VarA == q2Var2 || q2Var == q2Var2) ? false : true;
    }
}
