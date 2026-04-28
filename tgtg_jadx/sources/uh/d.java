package uh;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import h7.w;
import j4.s;
import kotlin.jvm.internal.Intrinsics;
import pg.n;
import yi.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements v, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CateringItemDetailsActivity f41150a;

    @Override // yi.v
    public void b() {
        n nVar = this.f41150a.f8977k;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            nVar = null;
        }
        nVar.f35003v.setEnabled(true);
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i11 = CateringItemDetailsActivity.f8972o;
        x6.d dVarX = s.x(view, windowInsetsCompat);
        n nVar = this.f41150a.f8977k;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            nVar = null;
        }
        nVar.f35005x.setPadding(0, dVarX.f43874b, 0, 0);
        nVar.f35007z.setPadding(0, dVarX.f43874b, 0, 0);
        nVar.B.setPadding(0, dVarX.f43874b, 0, 0);
        view.setPadding(0, 0, 0, dVarX.f43876d);
        return windowInsetsCompat;
    }
}
