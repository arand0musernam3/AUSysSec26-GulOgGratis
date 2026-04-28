package eg;

import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f16023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicItem f16024c;

    public /* synthetic */ k(Function1 function1, BasicItem basicItem, int i11) {
        this.f16022a = i11;
        this.f16023b = function1;
        this.f16024c = basicItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f16022a;
        BasicItem basicItem = this.f16024c;
        Function1 function1 = this.f16023b;
        switch (i11) {
            case 0:
                if (function1 != null) {
                    function1.invoke(basicItem);
                }
                break;
            case 1:
                if (function1 != null) {
                    function1.invoke(basicItem);
                }
                break;
            case 2:
                int i12 = MapBottomSheet.f9095y;
                function1.invoke(basicItem);
                break;
            case 3:
                function1.invoke(basicItem);
                break;
            case 4:
                function1.invoke(basicItem);
                break;
            default:
                function1.invoke(basicItem);
                break;
        }
        return Unit.f26487a;
    }
}
