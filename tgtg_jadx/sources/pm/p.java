package pm;

import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f35536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f35537c;

    public /* synthetic */ p(Function1 function1, Function1 function12, int i11) {
        this.f35535a = i11;
        this.f35536b = function1;
        this.f35537c = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f35535a;
        Function1 function1 = this.f35537c;
        Function1 function12 = this.f35536b;
        switch (i11) {
            case 0:
                BasicItem basicItem = (BasicItem) obj;
                int i12 = MapBottomSheet.f9095y;
                basicItem.getClass();
                if (basicItem.getItemType() == ItemType.FLASH_SALES) {
                    function12.invoke(ItemId.m197boximpl(basicItem.getInformation().mo340getItemIdFvU5WIY()));
                } else {
                    function1.invoke(ItemId.m197boximpl(basicItem.getInformation().mo340getItemIdFvU5WIY()));
                }
                break;
            case 1:
                BasicItem basicItem2 = (BasicItem) obj;
                basicItem2.getClass();
                if (basicItem2.getItemType() == ItemType.FLASH_SALES) {
                    function12.invoke(ItemId.m197boximpl(basicItem2.getInformation().mo340getItemIdFvU5WIY()));
                } else {
                    function1.invoke(ItemId.m197boximpl(basicItem2.getInformation().mo340getItemIdFvU5WIY()));
                }
                break;
            case 2:
                function12.invoke(obj);
                function1.invoke(obj);
                break;
            default:
                function12.invoke(obj);
                function1.invoke(obj);
                break;
        }
        return Unit.f26487a;
    }
}
