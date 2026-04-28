package d2;

import g3.e5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u3.d f13847b;

    public /* synthetic */ m0(u3.d dVar, int i11) {
        this.f13846a = i11;
        this.f13847b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f13846a;
        u3.d dVar = this.f13847b;
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (i11) {
            case 0:
                int iIntValue = num.intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dVar.invoke(v0.f13947a, sVar, 6);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    b4.t tVarC = b4.a.c(b4.q.f5711a, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL, b5.i.f5842e, sVar2);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar2.S || !Intrinsics.areEqual(sVar2.M(), Integer.valueOf(iHashCode))) {
                        e0.f.y(iHashCode, sVar2, iHashCode, gVar);
                    }
                    m3.i.C(tVarC, b5.i.f5841d, sVar2);
                    dVar.invoke(z.f13980a, sVar2, 6);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                float f11 = g3.y2.f19813a;
                m3.s sVar3 = (m3.s) nVar;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    b4.t tVarD = c.D(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0, 0.0f, 0, 0.0f, 10);
                    z4.u0 u0VarD = p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    u3.i iVarL2 = sVar3.l();
                    b4.t tVarC2 = b4.a.c(tVarD, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar2);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar3);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar3);
                    b5.g gVar2 = b5.i.f5844g;
                    if (sVar3.S || !Intrinsics.areEqual(sVar3.M(), Integer.valueOf(iHashCode2))) {
                        e0.f.y(iHashCode2, sVar3, iHashCode2, gVar2);
                    }
                    m3.i.C(tVarC2, b5.i.f5841d, sVar3);
                    r8.k.w(0, dVar, sVar3, true);
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                num.getClass();
                e5.a(dVar, nVar, m3.i.F(7));
                break;
            case 4:
                num.getClass();
                h2.q.c(dVar, nVar, m3.i.F(7));
                break;
            default:
                int iIntValue4 = num.intValue();
                m3.s sVar4 = (m3.s) nVar;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dVar.invoke(sVar4, 0);
                } else {
                    sVar4.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ m0(u3.d dVar, int i11, int i12) {
        this.f13846a = i12;
        this.f13847b = dVar;
    }
}
