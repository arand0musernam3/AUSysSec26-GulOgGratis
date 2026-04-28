package hg;

import b4.q;
import b4.t;
import b5.j;
import d2.h2;
import d2.m2;
import d2.n1;
import d2.w2;
import d2.z;
import g3.i2;
import g3.r9;
import i80.n;
import kotlin.Unit;
import lv.v;
import m3.s;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import x5.k;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22041d;

    public /* synthetic */ c(int i11, Object obj, Object obj2, int i12) {
        this.f22038a = i12;
        this.f22039b = i11;
        this.f22040c = obj;
        this.f22041d = obj2;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f22038a) {
            case 0:
                m mVar = (m) this.f22040c;
                x60.h hVar = (x60.h) this.f22041d;
                t tVar = (t) obj;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((s) nVar).f(tVar) ? 4 : 2;
                }
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    i2.a(x0.z(this.f22039b, sVar, 0), null, d2.c.z(tVar, mVar.l), hVar.J, sVar, 56, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                String str = (String) this.f22040c;
                String str2 = (String) this.f22041d;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q qVar = q.f5711a;
                    t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
                    float f11 = lv.t.f28253g;
                    t tVarC = d2.c.C(tVarT, f11, f11, f11, lv.t.f28255i);
                    d2.i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    t tVarC2 = b4.a.c(tVarC, sVar2);
                    j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                    b4.j jVar = b4.d.f5693k;
                    v1.n.d(x0.z(this.f22039b, sVar2, 0), null, new w2(jVar), null, null, 0.0f, null, sVar2, 56, 120);
                    r9.d(str, d2.c.D(b3.i.g(jVar, m2.v(qVar, 3)), lv.t.f28252f, 0.0f, 0.0f, 0.0f, 14), lv.s.C, 0L, null, 0L, null, new k(5), 0L, 0, false, 0, 0, null, v.f28275o, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    t tVarD = m2.d(qVar, 1.0f);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    r9.d(str2, d2.c.D(b3.i.g(jVar, tVarD.then(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true))), lv.t.f28251e, 0.0f, 0.0f, 0.0f, 14), lv.s.f28217b, 0L, null, 0L, null, new k(6), 0L, 0, false, 0, 0, null, v.f28269h, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
