package en;

import android.view.ViewTreeObserver;
import com.app.tgtg.customview.ExpandableTextView;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import kotlin.jvm.internal.Intrinsics;
import pg.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExpandableTextView f16147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f16148c;

    public /* synthetic */ i(g gVar, ExpandableTextView expandableTextView, int i11) {
        this.f16146a = i11;
        this.f16148c = gVar;
        this.f16147b = expandableTextView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f16146a) {
            case 0:
                a2 a2Var = ((ManufacturerItemDetailsActivity) this.f16148c).f9143m;
                if (a2Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    a2Var = null;
                }
                a2Var.H.f34942f.getViewTreeObserver().removeOnPreDrawListener(this);
                ExpandableTextView expandableTextView = this.f16147b;
                expandableTextView.setVisibility(8);
                expandableTextView.setVisibility(0);
                expandableTextView.setOnTouchListener(new l20.h(3));
                break;
            default:
                pg.n nVar = ((CateringItemDetailsActivity) this.f16148c).f8977k;
                if (nVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    nVar = null;
                }
                ((ExpandableTextView) nVar.F.f35056v).getViewTreeObserver().removeOnPreDrawListener(this);
                ExpandableTextView expandableTextView2 = this.f16147b;
                expandableTextView2.setVisibility(8);
                expandableTextView2.setVisibility(0);
                expandableTextView2.setOnTouchListener(new l20.h(3));
                break;
        }
        return true;
    }
}
