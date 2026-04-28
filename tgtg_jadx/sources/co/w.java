package co;

import com.app.tgtg.model.remote.order.Order;
import d40.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Order f8798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8801e;

    public /* synthetic */ w(Order order, boolean z11, int i11, int i12, int i13) {
        this.f8797a = i13;
        this.f8798b = order;
        this.f8799c = z11;
        this.f8800d = i11;
        this.f8801e = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f8797a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                w.b.g(this.f8798b, this.f8799c, nVar, m3.i.F(this.f8800d | 1), this.f8801e);
                break;
            case 1:
                t1.j(this.f8798b, this.f8799c, nVar, m3.i.F(this.f8800d | 1), this.f8801e);
                break;
            default:
                t1.j(this.f8798b, this.f8799c, nVar, m3.i.F(this.f8800d | 1), this.f8801e);
                break;
        }
        return Unit.f26487a;
    }
}
