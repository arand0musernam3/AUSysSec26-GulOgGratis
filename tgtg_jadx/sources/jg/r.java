package jg;

import a3.i3;
import androidx.lifecycle.m1;
import com.app.tgtg.model.remote.manufacturer.response.AddressSearchElement;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3 f25217b;

    public /* synthetic */ r(i3 i3Var, int i11) {
        this.f25216a = i11;
        this.f25217b = i3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit unit;
        switch (this.f25216a) {
            case 0:
                i3 i3Var = this.f25217b;
                cj.e0 e0Var = (cj.e0) i3Var.f396c;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pg.r rVar = (pg.r) i3Var.f395b;
                    b1 b1VarN = m3.i.n(e0Var.H, sVar, 0);
                    rVar.f35092d.setVisibility(b1VarN.getValue() == null ? 0 : 8);
                    Boolean bool = (Boolean) m3.i.n(e0Var.F, sVar, 0).getValue();
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            rVar.f35092d.setVisibility(0);
                        }
                        unit = Unit.f26487a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        sVar.a0(-212575813);
                        List list = (List) b1VarN.getValue();
                        boolean zH = sVar.h(i3Var);
                        Object objM = sVar.M();
                        m3.f fVar = m3.m.f29332a;
                        if (zH || objM == fVar) {
                            objM = new hi.d(i3Var, 27);
                            sVar.k0(objM);
                        }
                        Function0 function0 = (Function0) objM;
                        boolean zH2 = sVar.h(i3Var);
                        Object objM2 = sVar.M();
                        if (zH2 || objM2 == fVar) {
                            objM2 = new r(i3Var, 1);
                            sVar.k0(objM2);
                        }
                        Function2 function2 = (Function2) objM2;
                        boolean zH3 = sVar.h(i3Var);
                        Object objM3 = sVar.M();
                        if (zH3 || objM3 == fVar) {
                            objM3 = new r(i3Var, 2);
                            sVar.k0(objM3);
                        }
                        kg.a.b(list, function0, function2, (Function2) objM3, sVar, 0);
                        sVar.q(false);
                    } else {
                        sVar.a0(-699598781);
                        sVar.q(false);
                    }
                } else {
                    sVar.U();
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                cj.e0 e0Var2 = (cj.e0) this.f25217b.f396c;
                String strD = e0Var2.d();
                strD.getClass();
                v80.f0.B(m1.d(e0Var2), null, null, new cj.a0(str, e0Var2, strD, (String) obj2, (x70.c) null), 3);
                break;
            default:
                String str2 = (String) obj;
                AddressSearchElement addressSearchElement = (AddressSearchElement) obj2;
                str2.getClass();
                addressSearchElement.getClass();
                boolean zIsFound = addressSearchElement.isFound();
                cj.e0 e0Var3 = (cj.e0) this.f25217b.f396c;
                x70.c cVar = null;
                if (zIsFound) {
                    e0Var3.m(cv.i.ACTION_SELECT_SUGGESTED_ADDRESS);
                    String searchId = addressSearchElement.getSearchId();
                    e0Var3.getClass();
                    searchId.getClass();
                    v80.f0.B(m1.d(e0Var3), null, null, new bn.e(e0Var3, searchId, cVar, 1), 3);
                } else {
                    e0Var3.m(cv.i.ACTION_CONTINUE_ADDRESS_SEARCH);
                    String strD2 = e0Var3.d();
                    String searchId2 = addressSearchElement.getSearchId();
                    strD2.getClass();
                    v80.f0.B(m1.d(e0Var3), null, null, new cj.a0(str2, e0Var3, strD2, searchId2, (x70.c) null), 3);
                }
                break;
        }
        return Unit.f26487a;
    }
}
