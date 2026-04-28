package oo;

import com.app.tgtg.model.remote.order.Order;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Order f32891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f32892c;

    public /* synthetic */ y(Order order, Function0 function0, int i11, int i12) {
        this.f32890a = i12;
        this.f32891b = order;
        this.f32892c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f32890a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.T(this.f32891b, this.f32892c, nVar, m3.i.F(1));
                break;
            case 1:
                a.F(this.f32891b, this.f32892c, nVar, m3.i.F(1));
                break;
            default:
                a.F(this.f32891b, this.f32892c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
