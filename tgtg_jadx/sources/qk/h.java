package qk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import nk.q0;
import rk.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f37181b;

    public /* synthetic */ h(q0 q0Var, int i11) {
        this.f37180a = i11;
        this.f37181b = q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f37180a) {
            case 0:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v.b(this.f37181b, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rk.e.B(this.f37181b, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                s sVar3 = (s) nVar;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    rk.e.q(this.f37181b, sVar3, 0);
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                num.getClass();
                rk.e.q(this.f37181b, nVar, m3.i.F(1));
                break;
            case 4:
                num.getClass();
                rk.e.o(this.f37181b, nVar, m3.i.F(1));
                break;
            case 5:
                num.getClass();
                v.b(this.f37181b, nVar, m3.i.F(1));
                break;
            default:
                num.getClass();
                rk.e.B(this.f37181b, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h(q0 q0Var, int i11, int i12) {
        this.f37180a = i12;
        this.f37181b = q0Var;
    }
}
