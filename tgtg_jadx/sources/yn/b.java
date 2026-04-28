package yn;

import com.app.tgtg.model.remote.order.OrderType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderType f46276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f46277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46278d;

    public /* synthetic */ b(OrderType orderType, boolean z11, boolean z12, int i11, int i12) {
        this.f46275a = i12;
        this.f46276b = orderType;
        this.f46277c = z11;
        this.f46278d = z12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f46275a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                f0.f(this.f46276b, this.f46277c, this.f46278d, nVar, m3.i.F(1));
                break;
            default:
                f0.m(this.f46276b, this.f46277c, this.f46278d, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
