package ii;

import com.app.tgtg.model.remote.order.Order;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f23956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Order f23957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f23958d;

    public /* synthetic */ n(b4.t tVar, Order order, Function0 function0, int i11, int i12) {
        this.f23955a = i12;
        this.f23956b = tVar;
        this.f23957c = order;
        this.f23958d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f23955a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                q.a(m3.i.F(1), this.f23956b, this.f23957c, this.f23958d, nVar);
                break;
            default:
                o30.f0.n(m3.i.F(7), this.f23956b, this.f23957c, this.f23958d, nVar);
                break;
        }
        return Unit.f26487a;
    }
}
