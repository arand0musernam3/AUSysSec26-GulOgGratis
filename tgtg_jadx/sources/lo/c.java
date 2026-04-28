package lo;

import b4.q;
import b4.t;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.model.remote.order.Order;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManufacturerOrderActivity f27957b;

    public /* synthetic */ c(ManufacturerOrderActivity manufacturerOrderActivity, int i11) {
        this.f27956a = i11;
        this.f27957b = manufacturerOrderActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f27956a;
        ManufacturerOrderActivity manufacturerOrderActivity = this.f27957b;
        int i12 = 0;
        m3.n nVar = (m3.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                int i13 = ManufacturerOrderActivity.f9167q;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t tVarE = d2.c.E(q.f5711a);
                    boolean zH = sVar.h(manufacturerOrderActivity);
                    Object objM = sVar.M();
                    if (zH || objM == m3.m.f29332a) {
                        objM = new e(manufacturerOrderActivity, i12);
                        sVar.k0(objM);
                    }
                    oo.a.q(tVarE, false, R.string.order_toolbar_title, (Function0) objM, sVar, 48, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                int i14 = ManufacturerOrderActivity.f9167q;
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    manufacturerOrderActivity.e0((Order) m3.i.n(manufacturerOrderActivity.f0().l, sVar2, 0).getValue(), sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
