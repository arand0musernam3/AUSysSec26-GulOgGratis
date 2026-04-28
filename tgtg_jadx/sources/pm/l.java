package pm;

import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.m2;
import g3.r9;
import g3.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35520a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f35521b;

    public /* synthetic */ l(k kVar) {
        this.f35521b = kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f35520a;
        k kVar = this.f35521b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
                    x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
                    x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
                    x60.k kVar2 = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarD = m2.d(qVar, 1.0f);
                    float f11 = mVar.f44015k;
                    float f12 = mVar.f44017n;
                    b4.t tVarB = d2.c.B(tVarD, 0.0f, f11, 1);
                    d2.g gVarG = d2.i.g(f12);
                    b4.i iVar = b4.d.f5694m;
                    d2.y yVarA = d2.w.a(gVarG, iVar, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarB, sVar);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar2);
                    } else {
                        sVar.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(yVarA, gVar, sVar);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar);
                    Function0 function0 = kVar.f35519e;
                    sVar.a0(-1721404374);
                    b4.t tVarB2 = d2.c.B(m2.d(qVar, 1.0f), mVar.l, 0.0f, 2);
                    i2 i2VarA = h2.a(d2.i.f13802b, b4.d.f5693k, sVar, 54);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    b4.t tVarC2 = b4.a.c(tVarB2, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar2);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(i2VarA, gVar, sVar);
                    m3.i.C(iVarL2, gVar2, sVar);
                    a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
                    m3.i.C(tVarC2, gVar4, sVar);
                    SubtlePantryIconButtonKt.SmallSubtlePantryIconButton(function0, null, null, false, false, a.f35489a, sVar, 196608, 30);
                    sVar.q(true);
                    sVar.q(false);
                    b4.t tVarB3 = d2.c.B(m2.d(qVar, 1.0f), mVar.f44010f, 0.0f, 2);
                    d2.y yVarA2 = d2.w.a(d2.i.g(f12), iVar, sVar, 0);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    u3.i iVarL3 = sVar.l();
                    b4.t tVarC3 = b4.a.c(tVarB3, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar2);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA2, gVar, sVar);
                    m3.i.C(iVarL3, gVar2, sVar);
                    a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
                    m3.i.C(tVarC3, gVar4, sVar);
                    r9.d(kVar.f35515a, m2.d(qVar, 1.0f), hVar.J, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 48, 0, 130040);
                    r9.d(kVar.f35516b, m2.d(qVar, 1.0f), hVar.J, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, jVar.f43958g, sVar, 48, 0, 130040);
                    d2.c.f(m2.e(qVar, mVar.f44015k), sVar);
                    Function0 function02 = kVar.f35518d;
                    b4.t tVarD2 = m2.d(qVar, 1.0f);
                    l2.f fVarB = l2.g.b(kVar2.f43979c);
                    b2 b2Var = g3.p.f19253a;
                    s0.a(function02, tVarD2, false, fVarB, g3.p.a(hVar.f43917g, hVar.J, 0L, 0L, sVar, 12), null, null, null, null, u3.e.e(-803772138, sVar, new oo.s(2, kVar, jVar)), sVar, 805306416, 484);
                    sVar.q(true);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                a.b(kVar, (m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ l(k kVar, int i11) {
        this.f35521b = kVar;
    }
}
