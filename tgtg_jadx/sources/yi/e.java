package yi;

import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f45971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f45972c;

    public /* synthetic */ e(b1 b1Var, r rVar) {
        this.f45970a = 0;
        this.f45972c = b1Var;
        this.f45971b = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45970a) {
            case 0:
                this.f45972c.setValue(Boolean.TRUE);
                r rVar = this.f45971b;
                cj.q qVarV = rVar.v();
                cv.i iVar = cv.i.ACTION_SELECT_OTHER_PAYMENT_METHOD;
                dv.a aVar = dv.a.ITEM_TYPE;
                BasicItem basicItemF = rVar.v().f();
                String strName = basicItemF != null ? basicItemF.getItemType().name() : null;
                if (strName == null) {
                    strName = "";
                }
                qVarV.s(iVar, h0.g.E(new Pair(aVar, new dv.c(strName))));
                break;
            case 1:
                r rVar2 = this.f45971b;
                if (rVar2.u().l()) {
                    this.f45972c.setValue(Boolean.TRUE);
                } else {
                    g9.f0 f0Var = rVar2.f46018i;
                    if (f0Var != null) {
                        g9.p.f(f0Var, aj.e.PARCEL_ADDRESS_ENTRY.a());
                    }
                }
                break;
            default:
                r rVar3 = this.f45971b;
                if (rVar3.u().j()) {
                    this.f45972c.setValue(Boolean.TRUE);
                } else {
                    rVar3.u().U = true;
                    g9.f0 f0Var2 = rVar3.f46018i;
                    if (f0Var2 != null) {
                        g9.p.f(f0Var2, aj.e.PARCEL_ADDRESS_ENTRY.a());
                    }
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ e(r rVar, b1 b1Var, int i11) {
        this.f45970a = i11;
        this.f45971b = rVar;
        this.f45972c = b1Var;
    }
}
