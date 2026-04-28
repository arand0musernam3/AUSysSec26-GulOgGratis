package fn;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.n1;
import com.app.tgtg.feature.main.fragments.discover.herocomponent.DiscoverSheetView;
import h7.w;
import pg.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements ActivityResultCallback, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f17823a;

    public /* synthetic */ f(t tVar) {
        this.f17823a = tVar;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void a(Object obj) {
        t tVar = this.f17823a;
        n1 n1Var = tVar.f17850i;
        Boolean bool = (Boolean) obj;
        bool.getClass();
        tVar.f17860t = false;
        if (!bool.booleanValue()) {
            tVar.z();
            return;
        }
        vg.e eVar = tVar.f17861u;
        int i11 = eVar == null ? -1 : k.$EnumSwitchMapping$0[eVar.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                if (bool.booleanValue()) {
                    vg.e eVar2 = tVar.f17861u;
                    if (eVar2 != null) {
                        tVar.u(eVar2);
                    }
                    tVar.f17861u = null;
                    return;
                }
                tVar.t().getClass();
                if (ft.c.m()) {
                    tVar.z();
                    return;
                } else {
                    tVar.t().getClass();
                    ft.c.Q();
                    return;
                }
            }
            if (i11 != 2) {
                e40.a.f();
                return;
            }
            if (bool.booleanValue()) {
                vg.e eVar3 = tVar.f17861u;
                if (eVar3 != null) {
                    tVar.u(eVar3);
                }
                tVar.f17861u = null;
                return;
            }
            ((tg.i) n1Var.getValue()).getClass();
            if (ft.c.m()) {
                tVar.z();
            } else {
                ((tg.i) n1Var.getValue()).getClass();
                ft.c.Q();
            }
        }
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        x6.d dVarX = j4.s.x(view, windowInsetsCompat);
        t tVar = this.f17823a;
        o0 o0Var = tVar.f17859s;
        if (o0Var != null) {
            DiscoverSheetView discoverSheetView = (DiscoverSheetView) o0Var.f35020f;
            int paddingLeft = discoverSheetView.getPaddingLeft();
            int i11 = dVarX.f43874b;
            o0 o0Var2 = tVar.f17859s;
            o0Var2.getClass();
            discoverSheetView.setPadding(paddingLeft, i11, ((DiscoverSheetView) o0Var2.f35020f).getPaddingRight(), dVarX.f43876d);
        }
        return windowInsetsCompat;
    }
}
