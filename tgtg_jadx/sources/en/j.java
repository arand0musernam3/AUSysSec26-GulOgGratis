package en;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m1;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.model.remote.item.response.CateringItem;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.app.tgtg.model.remote.manufacturer.response.CateringItemProperties;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerInformation;
import fn.t;
import pg.b1;
import pg.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f16150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16152d;

    public /* synthetic */ j(View view, Object obj, Object obj2, int i11) {
        this.f16149a = i11;
        this.f16150b = view;
        this.f16151c = obj;
        this.f16152d = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f16149a) {
            case 0:
                this.f16150b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ManufacturerItemDetailsActivity manufacturerItemDetailsActivity = (ManufacturerItemDetailsActivity) this.f16151c;
                e eVarF = manufacturerItemDetailsActivity.F();
                ManufacturerInformation manufacturerInformation = ((ManufacturerItem) this.f16152d).getInformation().getManufacturerInformation();
                eVarF.b(manufacturerInformation != null ? manufacturerInformation.getFaqList() : null, m1.c(manufacturerItemDetailsActivity));
                break;
            case 1:
                this.f16150b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ((t) this.f16151c).q(((ConstraintLayout) ((b1) this.f16152d).f34796d).getHeight() - 2);
                break;
            case 2:
                this.f16150b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                t tVar = (t) this.f16151c;
                tVar.q(((ConstraintLayout) ((v) this.f16152d).f35202c).getHeight() - 2);
                tVar.y(false);
                break;
            default:
                this.f16150b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                CateringItemDetailsActivity cateringItemDetailsActivity = (CateringItemDetailsActivity) this.f16151c;
                vh.d dVarE = cateringItemDetailsActivity.E();
                CateringItemProperties cateringItemProperties = ((CateringItem) this.f16152d).getInformation().getCateringItemProperties();
                dVarE.b(cateringItemProperties != null ? cateringItemProperties.getFaqList() : null, m1.c(cateringItemDetailsActivity));
                break;
        }
    }
}
