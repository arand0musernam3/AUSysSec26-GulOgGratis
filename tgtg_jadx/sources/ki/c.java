package ki;

import com.app.tgtg.model.remote.item.response.CharityItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f26379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CharityItem f26380c;

    public /* synthetic */ c(Function1 function1, CharityItem charityItem, int i11) {
        this.f26378a = i11;
        this.f26379b = function1;
        this.f26380c = charityItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26378a) {
            case 0:
                this.f26379b.invoke(mv.d.m(this.f26380c));
                break;
            default:
                this.f26379b.invoke(this.f26380c.getInformation().mo340getItemIdFvU5WIY());
                break;
        }
        return Unit.f26487a;
    }
}
