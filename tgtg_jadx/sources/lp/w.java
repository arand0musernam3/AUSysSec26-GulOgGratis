package lp;

import d2.m2;
import d2.v0;
import d2.z1;
import hp.f1;
import i4.g0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f28100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f28101c;

    public /* synthetic */ w(List list, Function1 function1, int i11) {
        this.f28099a = i11;
        this.f28100b = list;
        this.f28101c = function1;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f28099a) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((v0) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (f1 f1Var : this.f28100b) {
                        Function1 function1 = this.f28101c;
                        boolean zF = sVar.f(function1) | sVar.f(f1Var);
                        Object objM = sVar.M();
                        if (zF || objM == m3.m.f29332a) {
                            objM = new i2.e(26, function1, f1Var);
                            sVar.k0(objM);
                        }
                        r.e(f1Var, (Function0) objM, sVar, 0);
                    }
                } else {
                    sVar.U();
                }
                break;
            default:
                z1 z1Var = (z1) obj;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                z1Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((m3.s) nVar2).f(z1Var) ? 4 : 2;
                }
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    b4.t tVarR = d2.c.r(d2.c.y(v1.n.j(b4.q.f5711a, lv.s.J, g0.f23254b), z1Var).then(m2.f13850c));
                    b4.i iVar = b4.d.f5695n;
                    List list = this.f28100b;
                    boolean zH = sVar2.h(list);
                    Function1 function12 = this.f28101c;
                    boolean zF2 = zH | sVar2.f(function12);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == m3.m.f29332a) {
                        objM2 = new kq.b(list, function12, 2);
                        sVar2.k0(objM2);
                    }
                    ox.h.c(tVarR, null, null, null, iVar, null, false, null, (Function1) objM2, sVar2, 196608, 478);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
