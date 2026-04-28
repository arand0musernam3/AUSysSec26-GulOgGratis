package bn;

import g3.r9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6470b;

    public /* synthetic */ h0(String str, int i11) {
        this.f6469a = i11;
        this.f6470b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6469a) {
            case 0:
                ((Integer) obj2).getClass();
                na0.a.J(this.f6470b, (m3.n) obj, m3.i.F(1));
                break;
            case 1:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r9.d(this.f6470b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, 0, 0, 262142);
                } else {
                    sVar.U();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ii.l.g(this.f6470b, (m3.n) obj, m3.i.F(1));
                break;
            case 3:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r9.d(this.f6470b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28282v, sVar2, 0, 12582912, 131070);
                } else {
                    sVar2.U();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                lp.r.a(this.f6470b, (m3.n) obj, m3.i.F(1));
                break;
            case 5:
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    r9.d(this.f6470b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.f28274n, lv.s.E, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar3, 0, 0, 131070);
                } else {
                    sVar3.U();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                po.c.f(this.f6470b, (m3.n) obj, m3.i.F(1));
                break;
            default:
                ((Integer) obj2).getClass();
                xi.d.e(this.f6470b, (m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h0(String str, int i11, int i12) {
        this.f6469a = i12;
        this.f6470b = str;
    }
}
