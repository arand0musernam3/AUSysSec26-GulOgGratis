package yi;

import androidx.lifecycle.m1;
import com.app.tgtg.feature.locationpicker.newlocationpicker.NewLocationPicker;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import g3.w6;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f45981e;

    public /* synthetic */ f(b1 b1Var, r rVar, b1 b1Var2, b1 b1Var3) {
        this.f45977a = 0;
        this.f45978b = b1Var;
        this.f45980d = rVar;
        this.f45981e = b1Var2;
        this.f45979c = b1Var3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f45977a;
        Object obj = this.f45981e;
        Object obj2 = this.f45980d;
        Object obj3 = this.f45979c;
        Object obj4 = this.f45978b;
        switch (i11) {
            case 0:
                b1 b1Var = (b1) obj4;
                r rVar = (r) obj2;
                b1 b1Var2 = (b1) obj3;
                if (((PaymentMethods) ((c3) obj).getValue()) != null || ((Boolean) b1Var2.getValue()).booleanValue()) {
                    if (rVar.v().f8334b0) {
                        cj.q qVarV = rVar.v();
                        aj.c cVarD = qVarV.d();
                        if ((cVarD != null ? cVarD.f1494a : null) != null) {
                            aj.c cVarD2 = qVarV.d();
                            if ((cVarD2 != null ? cVarD2.f1495b : null) != null) {
                                v80.f0.B(m1.d(qVarV), null, null, new cj.h(qVarV, rVar, null), 3);
                            }
                        }
                    } else {
                        cj.q qVarV2 = rVar.v();
                        v80.f0.B(m1.d(qVarV2), null, null, new cj.j(qVarV2, rVar, null), 3);
                    }
                    rVar.v().r();
                } else {
                    b1Var.setValue(Boolean.TRUE);
                    cj.q qVarV3 = rVar.v();
                    cv.i iVar = cv.i.ACTION_SELECT_OTHER_PAYMENT_METHOD;
                    dv.a aVar = dv.a.ITEM_TYPE;
                    BasicItem basicItemF = rVar.v().f();
                    String strName = basicItemF != null ? basicItemF.getItemType().name() : null;
                    if (strName == null) {
                        strName = "";
                    }
                    qVarV3.s(iVar, h0.g.E(new Pair(aVar, new dv.c(strName))));
                }
                return Unit.f26487a;
            case 1:
                int i12 = NewLocationPicker.l;
                v80.f0.B((v80.b0) obj4, null, null, new tg.g((tg.i) obj3, (w6) obj2, (NewLocationPicker) obj, null, 17), 3);
                return Unit.f26487a;
            default:
                return com.braze.managers.g0.a((String) obj4, (String) obj3, (String) obj2, (com.braze.managers.g0) obj);
        }
    }

    public /* synthetic */ f(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f45977a = i11;
        this.f45978b = obj;
        this.f45979c = obj2;
        this.f45980d = obj3;
        this.f45981e = obj4;
    }
}
