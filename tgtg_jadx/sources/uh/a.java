package uh;

import android.graphics.Point;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pg.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CateringItemDetailsActivity f41145b;

    public /* synthetic */ a(CateringItemDetailsActivity cateringItemDetailsActivity, int i11) {
        this.f41144a = i11;
        this.f41145b = cateringItemDetailsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f41144a;
        CateringItemDetailsActivity cateringItemDetailsActivity = this.f41145b;
        switch (i11) {
            case 0:
                int i12 = CateringItemDetailsActivity.f8972o;
                Point point = new Point();
                cateringItemDetailsActivity.getWindowManager().getDefaultDisplay().getRealSize(point);
                int i13 = point.y;
                cateringItemDetailsActivity.getWindowManager().getDefaultDisplay().getSize(point);
                return Integer.valueOf(i13 - point.y);
            default:
                n nVar = cateringItemDetailsActivity.f8977k;
                if (nVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    nVar = null;
                }
                nVar.f35003v.setEnabled(true);
                return Unit.f26487a;
        }
    }
}
