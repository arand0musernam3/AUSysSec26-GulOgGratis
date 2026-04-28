package r9;

import android.view.View;
import c5.v0;
import com.app.tgtg.R;
import dx.f;
import m3.e0;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f37790a = new e0(new qw.c(19));

    public static q9.d a(n nVar) {
        q9.d dVar;
        s sVar = (s) nVar;
        q9.d dVar2 = (q9.d) sVar.j(f37790a);
        if (dVar2 != null) {
            sVar.a0(950834231);
            sVar.q(false);
            return dVar2;
        }
        sVar.a0(950836184);
        View view = (View) sVar.j(v0.f7394f);
        view.getClass();
        while (true) {
            dVar = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            q9.d dVar3 = tag instanceof q9.d ? (q9.d) tag : null;
            if (dVar3 != null) {
                dVar = dVar3;
                break;
            }
            Object objS = f.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        sVar.q(false);
        return dVar;
    }
}
