package qk;

import b4.q;
import d2.m2;
import i4.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import nk.q0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f37171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1.a f37172c;

    public /* synthetic */ e(q0 q0Var, m1.a aVar, int i11) {
        this.f37170a = i11;
        this.f37171b = q0Var;
        this.f37172c = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f37170a) {
            case 0:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rk.e.p(this.f37171b, this.f37172c, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rk.e.D(this.f37171b, this.f37172c, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                s sVar3 = (s) nVar;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    rk.e.E(this.f37171b, this.f37172c, sVar3, 0);
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                int iIntValue4 = num.intValue();
                s sVar4 = (s) nVar;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    rk.e.G(this.f37171b, this.f37172c, sVar4, 0);
                } else {
                    sVar4.U();
                }
                break;
            case 4:
                int iIntValue5 = num.intValue();
                s sVar5 = (s) nVar;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    rk.e.G(this.f37171b, this.f37172c, sVar5, 0);
                } else {
                    sVar5.U();
                }
                break;
            case 5:
                int iIntValue6 = num.intValue();
                s sVar6 = (s) nVar;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    rk.e.v(this.f37171b, this.f37172c, sVar6, 0);
                } else {
                    sVar6.U();
                }
                break;
            case 6:
                int iIntValue7 = num.intValue();
                s sVar7 = (s) nVar;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    rk.e.s(this.f37171b, this.f37172c, sVar7, 0);
                } else {
                    sVar7.U();
                }
                break;
            case 7:
                int iIntValue8 = num.intValue();
                s sVar8 = (s) nVar;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    rk.e.r(this.f37171b, this.f37172c, sVar8, 0);
                } else {
                    sVar8.U();
                }
                break;
            case 8:
                int iIntValue9 = num.intValue();
                s sVar9 = (s) nVar;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    rk.e.F(this.f37171b, this.f37172c, d2.c.t(v1.n.j(m2.d(q.f5711a, 1.0f), lv.s.J, g0.f23254b)), sVar9, 0);
                } else {
                    sVar9.U();
                }
                break;
            case 9:
                int iIntValue10 = num.intValue();
                s sVar10 = (s) nVar;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    rk.e.x(this.f37171b, this.f37172c, sVar10, 0);
                } else {
                    sVar10.U();
                }
                break;
            case 10:
                int iIntValue11 = num.intValue();
                s sVar11 = (s) nVar;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    rk.e.w(this.f37171b, this.f37172c, sVar11, 0);
                } else {
                    sVar11.U();
                }
                break;
            case 11:
                num.getClass();
                rk.e.p(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 12:
                num.getClass();
                rk.e.r(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 13:
                num.getClass();
                rk.e.s(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 14:
                num.getClass();
                rk.e.y(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                num.getClass();
                rk.e.j(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 16:
                num.getClass();
                rk.e.v(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 17:
                num.getClass();
                rk.e.w(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 18:
                num.getClass();
                rk.e.x(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 19:
                num.getClass();
                rk.e.D(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 20:
                num.getClass();
                rk.e.D(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 21:
                num.getClass();
                rk.e.E(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 22:
                num.getClass();
                rk.e.g(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 23:
                num.getClass();
                rk.e.a(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 24:
                num.getClass();
                rk.e.n(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 25:
                num.getClass();
                rk.e.G(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            case 26:
                num.getClass();
                rk.e.G(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
            default:
                num.getClass();
                rk.e.G(this.f37171b, this.f37172c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ e(q0 q0Var, m1.a aVar, int i11, int i12) {
        this.f37170a = i12;
        this.f37171b = q0Var;
        this.f37172c = aVar;
    }
}
