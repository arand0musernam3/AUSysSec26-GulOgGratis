package yi;

import androidx.lifecycle.m1;
import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f46013b;

    public /* synthetic */ p(r rVar, int i11) {
        this.f46012a = i11;
        this.f46013b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f46012a) {
            case 0:
                ParcelDeliveryOptionId parcelDeliveryOptionId = (ParcelDeliveryOptionId) obj;
                x70.c cVar = null;
                String strM229unboximpl = parcelDeliveryOptionId != null ? parcelDeliveryOptionId.m229unboximpl() : null;
                if (strM229unboximpl != null) {
                    r rVar = this.f46013b;
                    cj.e0 e0VarU = rVar.u();
                    v80.f0.B(m1.d(e0VarU), null, null, new cj.b0(e0VarU, strM229unboximpl, cVar, 1), 3);
                    rVar.u().n();
                }
                break;
            default:
                ParcelDeliveryOptionId parcelDeliveryOptionId2 = (ParcelDeliveryOptionId) obj;
                String strM229unboximpl2 = parcelDeliveryOptionId2 != null ? parcelDeliveryOptionId2.m229unboximpl() : null;
                if (strM229unboximpl2 != null) {
                    r rVar2 = this.f46013b;
                    DeliveryOptionMethod deliveryOptionMethod = rVar2.u().O;
                    if (deliveryOptionMethod != null) {
                        cj.q qVarV = rVar2.v();
                        qVarV.f8338d0 = deliveryOptionMethod;
                        if (qVarV.f8334b0) {
                            qVarV.t();
                        }
                    } else {
                        DeliveryOptionMethod deliveryOptionMethod2 = rVar2.u().P;
                        if (deliveryOptionMethod2 != null) {
                            cj.q qVarV2 = rVar2.v();
                            qVarV2.f8338d0 = deliveryOptionMethod2;
                            if (qVarV2.f8334b0) {
                                qVarV2.t();
                            }
                        }
                    }
                    rVar2.v().f8332a0 = strM229unboximpl2;
                    rVar2.v().j();
                }
                break;
        }
        return Unit.f26487a;
    }
}
