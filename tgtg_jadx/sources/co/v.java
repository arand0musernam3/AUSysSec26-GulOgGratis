package co;

import com.app.tgtg.model.remote.order.Order;
import d40.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Order f8796b;

    public /* synthetic */ v(Order order, int i11, int i12) {
        this.f8795a = i12;
        this.f8796b = order;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f8795a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                w.b.a(this.f8796b, nVar, m3.i.F(1));
                break;
            case 1:
                w.b.f(this.f8796b, nVar, m3.i.F(1));
                break;
            case 2:
                w.b.e(this.f8796b, nVar, m3.i.F(1));
                break;
            case 3:
                w.b.i(this.f8796b, nVar, m3.i.F(1));
                break;
            case 4:
                w.b.l(this.f8796b, nVar, m3.i.F(1));
                break;
            case 5:
                bx.o.w(this.f8796b, nVar, m3.i.F(1));
                break;
            default:
                t1.a(this.f8796b, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
