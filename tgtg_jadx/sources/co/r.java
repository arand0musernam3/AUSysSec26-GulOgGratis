package co;

import com.app.tgtg.R;
import d2.h2;
import d2.i2;
import d2.j2;
import d2.m2;
import g3.r9;
import kotlin.Unit;
import m5.u0;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import s1.d1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8783a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8785c;

    public /* synthetic */ r(String str, boolean z11) {
        this.f8784b = str;
        this.f8785c = z11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f8783a;
        boolean z11 = this.f8785c;
        switch (i11) {
            case 0:
                d2.v vVar = (d2.v) obj;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                vVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((m3.s) nVar).f(vVar) ? 4 : 2;
                }
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    z5.c cVar = vVar.f13945a;
                    long j9 = vVar.f13946b;
                    float fO = z5.a.e(j9) ? cVar.O(z5.a.i(j9)) : Float.POSITIVE_INFINITY;
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarJ = v1.n.j(m2.s(qVar, 0.0f, fO * 0.9f, 1), lv.s.C, l2.g.b(8));
                    float f11 = lv.t.f28251e;
                    float f12 = lv.t.f28249c;
                    b4.t tVarC = d2.c.C(tVarJ, f11, f12, f11, f12);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
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
                    m3.i.C(i2VarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar);
                    if (z11) {
                        sVar.a0(252679315);
                        v1.n.d(x0.z(R.drawable.blob_flash, sVar, 0), null, d2.c.D(qVar, 0.0f, 0.0f, f12, 0.0f, 11), null, null, 0.0f, null, sVar, 440, 120);
                        sVar.q(false);
                    } else {
                        sVar.a0(252902701);
                        sVar.q(false);
                    }
                    r9.d(this.f8784b, null, z11 ? lv.s.f28234o : lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 131066);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    r9.d(this.f8784b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.f28281u, ((i4.v) d1.a(z11 ? lv.s.J : lv.s.f28217b, null, "", sVar2, MLKEMEngine.KyberPolyBytes, 10).getValue()).f23317a, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar2, 0, 0, 131070);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ r(boolean z11, String str) {
        this.f8785c = z11;
        this.f8784b = str;
    }
}
