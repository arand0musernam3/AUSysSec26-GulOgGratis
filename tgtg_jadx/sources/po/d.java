package po;

import b4.i;
import b4.q;
import b4.t;
import b5.g;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import d2.b2;
import d2.m2;
import d2.u;
import d2.w;
import d2.y;
import d2.z;
import g3.p;
import g3.r9;
import g3.s0;
import i4.g0;
import i4.r0;
import i80.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lv.v;
import m3.f;
import m3.m;
import m3.s;
import m5.u0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f35584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f35585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f35586d;

    public /* synthetic */ d(float f11, int i11, Function0 function0, Function0 function02) {
        this.f35583a = i11;
        this.f35584b = function0;
        this.f35585c = f11;
        this.f35586d = function02;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f35583a;
        u uVar = u.f13938a;
        f fVar = m.f29332a;
        r0 r0Var = g0.f23254b;
        Function0 function0 = this.f35586d;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    i iVar = b4.d.f5695n;
                    y yVarA = w.a(d2.i.f13803c, iVar, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    q qVar = q.f5711a;
                    t tVarC = b4.a.c(qVar, sVar);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    g gVar = b5.i.f5843f;
                    m3.i.C(yVarA, gVar, sVar);
                    g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar, dVar);
                    g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar);
                    String strF = k.f(40, R.string.orderview_delegate_disable_invitation_title, qVar, sVar, sVar);
                    u0 u0Var = v.f28271j;
                    long j9 = lv.s.C;
                    r9.d(strF, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    r9.d(k.f(8, R.string.orderview_delegate_disable_invitation_body, qVar, sVar, sVar), null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    d2.c.f(m2.m(qVar, 24), sVar);
                    float f11 = 16;
                    float f12 = 44;
                    t tVarD = m2.d(m2.b(d2.c.B(qVar, f11, 0.0f, 2), 0.0f, f12, 1), 1.0f);
                    l2.f fVarB = l2.g.b(20);
                    b2 b2Var = p.f19253a;
                    s0.a(this.f35584b, tVarD, false, fVarB, p.a(lv.s.f28217b, 0L, 0L, 0L, sVar, 14), null, null, null, null, c.f35581c, sVar, 805306416, 484);
                    d2.c.f(m2.m(qVar, f11), sVar);
                    t tVarJ = v1.n.j(m2.d(m2.b(d2.c.D(qVar, 0.0f, 0.0f, 0.0f, this.f35585c, 7), 0.0f, f12, 1), 1.0f), i4.v.f23314g, r0Var);
                    boolean zF = sVar.f(function0);
                    Object objM = sVar.M();
                    if (zF || objM == fVar) {
                        objM = new oo.z(11, function0);
                        sVar.k0(objM);
                    }
                    t tVarF = b3.i.f(iVar, androidx.compose.foundation.b.c(tVarJ, false, null, null, (Function0) objM, 15));
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    t tVarC2 = b4.a.c(tVarF, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD, gVar, sVar);
                    m3.i.C(iVarL2, gVar2, sVar);
                    a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
                    m3.i.C(tVarC2, gVar4, sVar);
                    r9.d(f0.U(sVar, R.string.orderview_delegate_disable_invitation_dismiss), uVar.a(qVar, b4.d.f5687e), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, MLKEMEngine.KyberPolyBytes, 0, 262136);
                    sVar.q(true);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    i iVar2 = b4.d.f5695n;
                    y yVarA2 = w.a(d2.i.f13803c, iVar2, sVar2, 48);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    u3.i iVarL3 = sVar2.l();
                    q qVar2 = q.f5711a;
                    t tVarC3 = b4.a.c(qVar2, sVar2);
                    j.R.getClass();
                    h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    g gVar5 = b5.i.f5843f;
                    m3.i.C(yVarA2, gVar5, sVar2);
                    g gVar6 = b5.i.f5842e;
                    m3.i.C(iVarL3, gVar6, sVar2);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    g gVar7 = b5.i.f5844g;
                    m3.i.v(sVar2, numValueOf2, gVar7);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar2, dVar2);
                    g gVar8 = b5.i.f5841d;
                    m3.i.C(tVarC3, gVar8, sVar2);
                    float f13 = 40;
                    String strF2 = k.f(f13, R.string.orderview_delegate_send_invitation_bottomsheet_title, qVar2, sVar2, sVar2);
                    u0 u0Var2 = v.f28271j;
                    long j11 = lv.s.C;
                    r9.d(strF2, null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    r9.d(k.f(8, R.string.orderview_delegate_send_invitation_bottomsheet_body, qVar2, sVar2, sVar2), d2.c.B(qVar2, 56, 0.0f, 2), j11, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar2, 432, 12582912, 130040);
                    d2.c.f(m2.m(qVar2, f13), sVar2);
                    float f14 = 16;
                    float f15 = 44;
                    t tVarD2 = m2.d(m2.b(d2.c.B(qVar2, f14, 0.0f, 2), 0.0f, f15, 1), 1.0f);
                    l2.f fVarB2 = l2.g.b(20);
                    b2 b2Var2 = p.f19253a;
                    s0.a(this.f35584b, tVarD2, false, fVarB2, p.a(lv.s.f28217b, 0L, 0L, 0L, sVar2, 14), null, null, null, null, c.f35582d, sVar2, 805306416, 484);
                    d2.c.f(m2.m(qVar2, f14), sVar2);
                    t tVarJ2 = v1.n.j(m2.d(m2.b(d2.c.D(qVar2, 0.0f, 0.0f, 0.0f, this.f35585c, 7), 0.0f, f15, 1), 1.0f), i4.v.f23314g, r0Var);
                    boolean zF2 = sVar2.f(function0);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == fVar) {
                        objM2 = new oo.z(12, function0);
                        sVar2.k0(objM2);
                    }
                    t tVarF2 = b3.i.f(iVar2, androidx.compose.foundation.b.c(tVarJ2, false, null, null, (Function0) objM2, 15));
                    z4.u0 u0VarD2 = d2.p.d(b4.d.f5683a, false);
                    int iHashCode4 = Long.hashCode(sVar2.T);
                    u3.i iVarL4 = sVar2.l();
                    t tVarC4 = b4.a.c(tVarF2, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(u0VarD2, gVar5, sVar2);
                    m3.i.C(iVarL4, gVar6, sVar2);
                    a0.y(iHashCode4, sVar2, gVar7, sVar2, dVar2);
                    m3.i.C(tVarC4, gVar8, sVar2);
                    r9.d(f0.U(sVar2, R.string.orderview_delegate_send_invitation_bottomsheet_cancel_btn), uVar.a(qVar2, b4.d.f5687e), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar2, MLKEMEngine.KyberPolyBytes, 0, 262136);
                    sVar2.q(true);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
