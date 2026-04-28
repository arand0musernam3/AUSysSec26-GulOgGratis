package lp;

import com.app.tgtg.R;
import com.braze.models.inappmessage.InAppMessageBase;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n0;
import d2.v0;
import i4.k0;
import kotlin.Unit;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f28047b;

    public /* synthetic */ i(k0 k0Var, int i11) {
        this.f28046a = i11;
        this.f28047b = k0Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f28046a;
        b4.q qVar = b4.q.f5711a;
        k0 k0Var = this.f28047b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((v0) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    int i12 = 0;
                    for (Object obj4 : kotlin.collections.d0.h(80, 60, 80, 50, 80, 70)) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            kotlin.collections.d0.n();
                            throw null;
                        }
                        d2.p.a(v1.n.i(f4.g.b(m2.q(m2.e(qVar, 26), ((Number) obj4).intValue()), l2.g.b(InAppMessageBase.INAPP_MESSAGE_DURATION_MIN_MILLIS)), k0Var, 0.0f, 6), sVar, 0);
                        i12 = i13;
                    }
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            default:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b4.t tVarZ = d2.c.z(m2.d(qVar, 1.0f), lv.t.f28252f);
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(yVarA, gVar, sVar2);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar2, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar2, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar2);
                    b4.t tVarD = m2.d(qVar, 1.0f);
                    i2 i2VarA = h2.a(d2.i.f13807g, b4.d.f5693k, sVar2, 54);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    b4.t tVarC2 = b4.a.c(tVarD, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(i2VarA, gVar, sVar2);
                    m3.i.C(iVarL2, gVar2, sVar2);
                    w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
                    m3.i.C(tVarC2, gVar4, sVar2);
                    float f11 = lv.t.f28251e;
                    i2 i2VarA2 = h2.a(d2.i.g(f11), b4.d.f5692j, sVar2, 6);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    u3.i iVarL3 = sVar2.l();
                    b4.t tVarC3 = b4.a.c(qVar, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(i2VarA2, gVar, sVar2);
                    m3.i.C(iVarL3, gVar2, sVar2);
                    w.a0.y(iHashCode3, sVar2, gVar3, sVar2, dVar);
                    m3.i.C(tVarC3, gVar4, sVar2);
                    d.h(R.drawable.recipe_generator_clock, null, k0Var, sVar2, 0);
                    d.h(R.drawable.recipe_generator_person, null, k0Var, sVar2, 0);
                    sVar2.q(true);
                    g3.i2.a(x0.z(R.drawable.recipe_generator_bookmark, sVar2, 0), null, null, lv.s.E, sVar2, 3128, 4);
                    sVar2.q(true);
                    d2.c.f(m2.e(qVar, f11), sVar2);
                    d2.p.a(v1.n.i(f4.g.b(m2.d(m2.e(qVar, 24), 1.0f), l2.g.b(InAppMessageBase.INAPP_MESSAGE_DURATION_MIN_MILLIS)), k0Var, 0.0f, 6), sVar2, 0);
                    d2.c.f(m2.e(qVar, f11), sVar2);
                    d.c(k0Var, sVar2, 0);
                    d2.c.f(m2.e(qVar, f11), sVar2);
                    n0.a(null, d2.i.g(f11), d2.i.g(f11), null, 0, 0, u3.e.e(-1722688687, sVar2, new i(k0Var, 0)), sVar2, 1573296, 57);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
        }
    }
}
