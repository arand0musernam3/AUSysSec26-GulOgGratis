package lp;

import com.app.tgtg.R;
import d2.v0;
import g3.r9;
import hp.o0;
import i4.g0;
import kotlin.Unit;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hp.g f28045b;

    public /* synthetic */ h(int i11, hp.g gVar) {
        this.f28044a = i11;
        this.f28045b = gVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f28044a;
        hp.g gVar = this.f28045b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((v0) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (o0 o0Var : gVar.f22281g) {
                        b4.t tVarA = d2.c.A(v1.n.j(f4.g.b(b4.q.f5711a, l2.g.b(46)), lv.s.I, g0.f23254b), lv.t.f28251e, lv.t.f28249c);
                        u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                        int iHashCode = Long.hashCode(sVar.T);
                        u3.i iVarL = sVar.l();
                        b4.t tVarC = b4.a.c(tVarA, sVar);
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
                        r9.d(o0Var.f22311a, null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                        sVar.q(true);
                    }
                } else {
                    sVar.U();
                }
                break;
            case 1:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    d.q(gVar, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            default:
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((v0) obj).getClass();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    n4.b bVarZ = x0.z(R.drawable.recipe_generator_clock, sVar3, 0);
                    String str = gVar.f22278d;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = gVar.f22279e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    d.b(bVarZ, str, str2, sVar3, 8);
                    n4.b bVarZ2 = x0.z(R.drawable.recipe_generator_person, sVar3, 0);
                    String str3 = gVar.f22280f;
                    d.d(bVarZ2, "", str3 == null ? "" : str3, false, sVar3, 56, 8);
                } else {
                    sVar3.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
