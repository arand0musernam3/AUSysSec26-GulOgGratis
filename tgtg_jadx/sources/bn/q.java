package bn;

import com.app.tgtg.model.remote.item.response.CategoryCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CategoryCard f6505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym.y f6506c;

    public /* synthetic */ q(CategoryCard categoryCard, ym.y yVar, int i11, int i12) {
        this.f6504a = i12;
        this.f6505b = categoryCard;
        this.f6506c = yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6504a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                jf.e.k(this.f6505b, this.f6506c, nVar, m3.i.F(1));
                break;
            default:
                na0.a.Q(this.f6505b, this.f6506c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
