package lq;

import com.app.tgtg.feature.tabdiscover.discoveritems.DiscoverFavoritesPromoItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xj.k f28119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f28120c;

    public /* synthetic */ b(xj.k kVar, b1 b1Var, int i11) {
        this.f28118a = i11;
        this.f28119b = kVar;
        this.f28120c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f28118a;
        b1 b1Var = this.f28120c;
        xj.k kVar = this.f28119b;
        switch (i11) {
            case 0:
                int i12 = DiscoverFavoritesPromoItemView.f9294k;
                b1Var.setValue(Boolean.TRUE);
                kVar.d(dv.d.DISCOVER_PAGE);
                break;
            case 1:
                b1Var.setValue(Boolean.TRUE);
                kVar.d(dv.d.FAVORITES_PAGE);
                break;
            default:
                ((cv.b) kVar.f44413h.f28697a).b(cv.i.TEMP_REJECT_POP_UP_CHANGE_PUSH_SETTINGS);
                b1Var.setValue(Boolean.FALSE);
                break;
        }
        return Unit.f26487a;
    }
}
