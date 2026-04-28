package bn;

import com.app.tgtg.model.remote.item.response.CategoryCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym.y f6508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CategoryCard f6509c;

    public /* synthetic */ r(ym.y yVar, CategoryCard categoryCard, int i11) {
        this.f6507a = i11;
        this.f6508b = yVar;
        this.f6509c = categoryCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6507a) {
            case 0:
                ym.y yVar = this.f6508b;
                if (yVar != null) {
                    ((ym.u) yVar).v(this.f6509c);
                }
                break;
            default:
                ym.y yVar2 = this.f6508b;
                if (yVar2 != null) {
                    ((ym.u) yVar2).v(this.f6509c);
                }
                break;
        }
        return Unit.f26487a;
    }
}
