package fg;

import b4.t;
import d2.m2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.s;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17737a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f17739c;

    public /* synthetic */ q(long j9, t tVar) {
        this.f17738b = j9;
        this.f17739c = tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f17737a) {
            case 0:
                num.getClass();
                ex.i.h(this.f17739c, this.f17738b, nVar, m3.i.F(55));
                break;
            default:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j9 = this.f17738b;
                    t tVar = this.f17739c;
                    if (j9 != 9205357640488583168L) {
                        sVar.a0(-1244013944);
                        t tVarK = m2.k(tVar, z5.h.b(j9), z5.h.a(j9), 0.0f, 0.0f, 12);
                        u0 u0VarD = d2.p.d(b4.d.f5684b, false);
                        int iHashCode = Long.hashCode(sVar.T);
                        u3.i iVarL = sVar.l();
                        t tVarC = b4.a.c(tVarK, sVar);
                        b5.j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(hVar);
                        } else {
                            sVar.n0();
                        }
                        m3.i.C(u0VarD, b5.i.f5843f, sVar);
                        m3.i.C(iVarL, b5.i.f5842e, sVar);
                        m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                        m3.i.z(sVar, b5.i.f5845h);
                        m3.i.C(tVarC, b5.i.f5841d, sVar);
                        m2.a.b(0, 1, null, sVar);
                        sVar.q(true);
                        sVar.q(false);
                    } else {
                        sVar.a0(-1243644858);
                        m2.a.b(0, 0, tVar, sVar);
                        sVar.q(false);
                    }
                } else {
                    sVar.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ q(t tVar, long j9, int i11) {
        this.f17739c = tVar;
        this.f17738b = j9;
    }
}
