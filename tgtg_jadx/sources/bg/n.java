package bg;

import android.view.View;
import android.widget.AdapterView;
import androidx.lifecycle.m1;
import com.adyen.checkout.card.internal.ui.view.CardView;
import com.app.tgtg.model.remote.Country;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.mapService.Locations;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6206b;

    public /* synthetic */ n(Object obj, int i11) {
        this.f6205a = i11;
        this.f6206b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j9) {
        List list;
        switch (this.f6205a) {
            case 0:
                p pVar = (p) this.f6206b;
                o oVar = pVar.f6213b;
                if (oVar != null) {
                    oVar.n((Country) pVar.f6212a.get(i11));
                }
                pVar.dismiss();
                break;
            case 1:
                CardView.initInstallments$lambda$27$lambda$26$lambda$25((CardView) this.f6206b, adapterView, view, i11, j9);
                break;
            default:
                uk.q qVar = (uk.q) this.f6206b;
                uk.m mVar = qVar.f41354g;
                Locations locations = (mVar == null || (list = mVar.f41341a) == null) ? null : (Locations) list.get(i11);
                uk.c cVar = qVar.f41353f;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
                    cVar = null;
                }
                uk.r rVarQ = cVar.q();
                uk.b bVar = new uk.b(cVar, 2);
                rv.a aVar = new rv.a(cVar, 12);
                rVarQ.getClass();
                LatLngInfo center = locations != null ? locations.getCenter() : null;
                if (center != null && center.isValid()) {
                    bVar.invoke(center);
                } else {
                    String placeId = locations != null ? locations.getPlaceId() : null;
                    if (placeId == null || placeId.length() == 0) {
                        aVar.invoke();
                    } else {
                        v80.f0.B(m1.d(rVarQ), null, null, new os.c(rVarQ, placeId, aVar, bVar, (x70.c) null, 16), 3);
                    }
                }
                break;
        }
    }
}
