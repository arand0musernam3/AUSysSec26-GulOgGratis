package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.f0;
import c5.v0;
import com.app.tgtg.R;
import m3.e0;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f15297a = new e0(new db0.c(23));

    public static f0 a(m3.n nVar) {
        s sVar = (s) nVar;
        f0 f0Var = (f0) sVar.j(f15297a);
        Object obj = null;
        if (f0Var == null) {
            sVar.a0(1208426157);
            View view = (View) sVar.j(v0.f7394f);
            view.getClass();
            while (true) {
                if (view == null) {
                    f0Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                f0 f0Var2 = tag instanceof f0 ? (f0) tag : null;
                if (f0Var2 != null) {
                    f0Var = f0Var2;
                    break;
                }
                Object objS = dx.f.s(view);
                view = objS instanceof View ? (View) objS : null;
            }
        } else {
            sVar.a0(1208423708);
        }
        sVar.q(false);
        if (f0Var != null) {
            sVar.a0(1208423789);
            sVar.q(false);
            return f0Var;
        }
        sVar.a0(1208428160);
        Context baseContext = (Context) sVar.j(v0.f7390b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof f0) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        f0 f0Var3 = (f0) obj;
        sVar.q(false);
        return f0Var3;
    }
}
