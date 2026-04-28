package mo;

import com.app.tgtg.model.remote.order.Order;
import d40.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Order f30053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30054c;

    public /* synthetic */ c(Order order, boolean z11, int i11, int i12) {
        this.f30052a = i12;
        this.f30053b = order;
        this.f30054c = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f30052a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                t1.l(this.f30053b, this.f30054c, nVar, i.F(1));
                break;
            case 1:
                t1.k(this.f30053b, this.f30054c, nVar, i.F(1));
                break;
            default:
                t1.l(this.f30053b, this.f30054c, nVar, i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
