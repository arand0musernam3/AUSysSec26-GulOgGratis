package d2;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends d1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function1 f13879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z2 f13880s;

    @Override // d2.z0, b4.s
    public final void onAttach() {
        View viewN = b5.o.n(this);
        WeakHashMap weakHashMap = z2.f13983w;
        z2 z2VarF = b.f(viewN);
        z2VarF.a(viewN);
        y2 y2Var = (y2) this.f13879r.invoke(z2VarF);
        if (!Intrinsics.areEqual(y2Var, this.f13773q)) {
            this.f13773q = y2Var;
            M0();
        }
        this.f13880s = z2VarF;
        super.onAttach();
    }

    @Override // d2.z0, b4.s
    public final void onDetach() {
        View viewN = b5.o.n(this);
        z2 z2Var = this.f13880s;
        if (z2Var != null) {
            int i11 = z2Var.f14003u - 1;
            z2Var.f14003u = i11;
            if (i11 == 0) {
                ViewCompat.k0(viewN, null);
                ViewCompat.q0(viewN, null);
                viewN.removeOnAttachStateChangeListener(z2Var.f14004v);
            }
        }
        super.onDetach();
    }
}
