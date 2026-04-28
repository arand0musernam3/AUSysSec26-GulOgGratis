package cn;

import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems.DeliverySortingBottomSheet;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8606a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeliverySortingBottomSheet f8607b;

    public /* synthetic */ y(DeliverySortingBottomSheet deliverySortingBottomSheet) {
        this.f8607b = deliverySortingBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f8606a;
        DeliverySortingBottomSheet deliverySortingBottomSheet = this.f8607b;
        switch (i11) {
            case 0:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                deliverySortingBottomSheet.f9136k.invoke((SortingChoice) obj, bool);
                break;
            default:
                ((Integer) obj2).getClass();
                int i12 = DeliverySortingBottomSheet.f9133m;
                deliverySortingBottomSheet.a((m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ y(DeliverySortingBottomSheet deliverySortingBottomSheet, int i11) {
        this.f8607b = deliverySortingBottomSheet;
    }
}
