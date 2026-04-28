package pm;

import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapBottomSheet f35525b;

    public /* synthetic */ n(MapBottomSheet mapBottomSheet, int i11) {
        this.f35524a = i11;
        this.f35525b = mapBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f35524a;
        MapBottomSheet mapBottomSheet = this.f35525b;
        switch (i11) {
            case 0:
                BasicItem basicItem = (BasicItem) obj;
                int i12 = MapBottomSheet.f9095y;
                basicItem.getClass();
                mapBottomSheet.f9100n.invoke(basicItem);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                mapBottomSheet.f9104r.invoke(bool);
                break;
        }
        return Unit.f26487a;
    }
}
