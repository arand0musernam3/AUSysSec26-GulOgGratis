package nn;

import com.app.tgtg.R;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.w;
import d2.y;
import g3.r9;
import kotlin.Unit;
import lv.v;
import o00.x0;
import o30.f0;
import s1.z;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kn.d f31168b;

    public /* synthetic */ t(kn.d dVar, int i11) {
        this.f31167a = i11;
        this.f31168b = dVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b5.g gVar;
        b5.g gVar2;
        b5.d dVar;
        b5.g gVar3;
        kn.d dVar2;
        b4.q qVar;
        b4.k kVar;
        b5.h hVar;
        m3.s sVar;
        b4.q qVar2;
        int i11 = this.f31167a;
        kn.d dVar3 = this.f31168b;
        switch (i11) {
            case 0:
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                android.support.v4.media.session.a.j(dVar3, (m3.n) obj2, 0);
                break;
            default:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                b4.j jVar = b4.d.f5693k;
                ((d2.z) obj).getClass();
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b4.q qVar3 = b4.q.f5711a;
                    b4.t tVarZ = d2.c.z(m2.v(qVar3, 3), lv.t.f28252f);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    b5.g gVar4 = b5.i.f5843f;
                    m3.i.C(i2VarA, gVar4, sVar2);
                    b5.g gVar5 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar5, sVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar6 = b5.i.f5844g;
                    m3.i.v(sVar2, numValueOf, gVar6);
                    b5.d dVar4 = b5.i.f5845h;
                    m3.i.z(sVar2, dVar4);
                    b5.g gVar7 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar7, sVar2);
                    if (dVar3.f26475c == null) {
                        sVar2.a0(-700564856);
                        sVar2.q(false);
                        sVar = sVar2;
                        hVar = hVar2;
                        dVar2 = dVar3;
                        qVar = qVar3;
                        dVar = dVar4;
                        gVar3 = gVar6;
                        gVar = gVar4;
                        gVar2 = gVar7;
                        kVar = null;
                    } else {
                        sVar2.a0(-700564855);
                        gVar = gVar4;
                        gVar2 = gVar7;
                        dVar = dVar4;
                        gVar3 = gVar6;
                        b4.t tVarG = b3.i.g(jVar, m2.u(d2.c.D(qVar3, 0.0f, 0.0f, lv.t.f28249c, 0.0f, 11), null, 3));
                        n4.b bVarZ = x0.z(R.drawable.system_icon_new_voucher_neutral_10, sVar2, 0);
                        dVar2 = dVar3;
                        qVar = qVar3;
                        kVar = null;
                        hVar = hVar2;
                        v1.n.d(bVarZ, null, tVarG, null, null, 0.0f, null, sVar2, 56, 120);
                        sVar = sVar2;
                        sVar.q(false);
                    }
                    b4.t tVarG2 = b3.i.g(jVar, m2.u(qVar, kVar, 3));
                    y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    b4.t tVarC2 = b4.a.c(tVarG2, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA, gVar, sVar);
                    m3.i.C(iVarL2, gVar5, sVar);
                    a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
                    m3.i.C(tVarC2, gVar2, sVar);
                    kn.d dVar5 = dVar2;
                    Integer num = dVar5.f26476d;
                    if (num == null) {
                        sVar.a0(1938477711);
                        sVar.q(false);
                        qVar2 = qVar;
                    } else {
                        sVar.a0(1938477712);
                        b4.q qVar4 = qVar;
                        qVar2 = qVar4;
                        m3.s sVar3 = sVar;
                        r9.d(f0.U(sVar, num.intValue()), m2.u(d2.c.D(qVar4, 0.0f, 0.0f, 0.0f, lv.t.f28251e, 7), kVar, 3), dVar5.f26478f, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.l, sVar3, 48, 12582912, 131064);
                        sVar = sVar3;
                        sVar.q(false);
                    }
                    m3.s sVar4 = sVar;
                    r9.d(f0.U(sVar, dVar5.f26477e), m2.u(qVar2, kVar, 3), dVar5.f26478f, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar4, 48, 12582912, 131064);
                    sVar4.q(true);
                    sVar4.q(true);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
