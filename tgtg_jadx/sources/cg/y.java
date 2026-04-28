package cg;

import com.app.tgtg.R;
import d2.m2;
import g3.r9;
import kotlin.Unit;
import zendesk.ui.android.conversation.aidisclaimer.AiDisclaimerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f8158b;

    public /* synthetic */ y(float f11, int i11) {
        this.f8157a = i11;
        this.f8158b = f11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f8157a;
        float f11 = this.f8158b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarI = v1.n.i(m2.d(m2.e(qVar, f11), 1.0f), new i4.k0(kotlin.collections.d0.h(new i4.v(lv.s.Y), new i4.v(lv.s.Z)), 0L, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L)), 0.0f, 6);
                    float f12 = lv.t.f28254h;
                    b4.t tVarC = d2.c.C(tVarI, f12, f12, f12, f12);
                    z4.u0 u0VarD = d2.p.d(b4.d.f5687e, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC2 = b4.a.c(tVarC, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(u0VarD, gVar, sVar);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC2, gVar4, sVar);
                    b4.t tVarD = m2.d(qVar, 1.0f);
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    b4.t tVarC3 = b4.a.c(tVarD, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA, gVar, sVar);
                    m3.i.C(iVarL2, gVar2, sVar);
                    w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
                    m3.i.C(tVarC3, gVar4, sVar);
                    j.n(qVar, o30.f0.U(sVar, R.string.fridge_recipe_promo_card_tag), o30.f0.U(sVar, R.string.fridge_recipe_promo_card_tag), lv.s.J, lv.s.f28223e, sVar, 27654, 0);
                    float f13 = lv.t.f28251e;
                    d2.c.f(d2.c.D(qVar, 0.0f, f13, 0.0f, 0.0f, 13), sVar);
                    r9.d(o30.f0.U(sVar, R.string.local_hero_discover_card_title), m2.d(qVar, 1.0f), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28265d, sVar, 432, 12582912, 131064);
                    d2.c.f(d2.c.D(qVar, 0.0f, f13, 0.0f, 0.0f, 13), sVar);
                    r9.d(o30.f0.U(sVar, R.string.local_hero_discover_card_description), m2.d(qVar, 1.0f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 48, 12582912, 131068);
                    sVar.q(true);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            default:
                return AiDisclaimerKt.AiDisclaimer_vc5YOHI$lambda$7$lambda$6$lambda$5(f11, (z4.w0) obj, (z4.t0) obj2, (z5.a) obj3);
        }
    }
}
