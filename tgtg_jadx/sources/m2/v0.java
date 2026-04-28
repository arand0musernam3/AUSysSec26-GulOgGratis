package m2;

import d2.m2;
import m3.c3;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5.u0 f29099c;

    public /* synthetic */ v0(int i11, int i12, m5.u0 u0Var) {
        this.f29097a = i11;
        this.f29098b = i12;
        this.f29099c = u0Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Integer) obj3).getClass();
        m3.s sVar = (m3.s) ((m3.n) obj2);
        sVar.a0(408240218);
        int i11 = this.f29097a;
        int i12 = this.f29098b;
        g0.F(i11, i12);
        b4.q qVar = b4.q.f5711a;
        if (i11 == 1 && i12 == Integer.MAX_VALUE) {
            sVar.q(false);
            return qVar;
        }
        z5.c cVar = (z5.c) sVar.j(c5.x1.f7416h);
        q5.h hVar = (q5.h) sVar.j(c5.x1.f7419k);
        z5.m mVar = (z5.m) sVar.j(c5.x1.f7421n);
        m5.u0 u0Var = this.f29099c;
        boolean zF = sVar.f(u0Var) | sVar.d(mVar.ordinal());
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (zF || objM == fVar) {
            objM = m5.k0.k(u0Var, mVar);
            sVar.k0(objM);
        }
        m5.u0 u0Var2 = (m5.u0) objM;
        boolean zF2 = sVar.f(hVar) | sVar.f(u0Var2);
        Object objM2 = sVar.M();
        if (zF2 || objM2 == fVar) {
            m5.l0 l0Var = u0Var2.f29655a;
            q5.i iVar = l0Var.f29580f;
            q5.r rVar = l0Var.f29577c;
            if (rVar == null) {
                rVar = q5.r.f36043h;
            }
            q5.n nVar = l0Var.f29578d;
            int i13 = nVar != null ? nVar.f36034a : 0;
            q5.o oVar = l0Var.f29579e;
            objM2 = ((q5.j) hVar).b(iVar, rVar, i13, oVar != null ? oVar.f36035a : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            sVar.k0(objM2);
        }
        c3 c3Var = (c3) objM2;
        boolean zF3 = sVar.f(c3Var.getValue()) | sVar.f(cVar) | sVar.f(hVar) | sVar.f(u0Var) | sVar.d(mVar.ordinal());
        Object objM3 = sVar.M();
        if (zF3 || objM3 == fVar) {
            objM3 = Integer.valueOf((int) (o1.a(u0Var2, cVar, hVar, o1.f29050a, 1) & 4294967295L));
            sVar.k0(objM3);
        }
        int iIntValue = ((Number) objM3).intValue();
        boolean zF4 = sVar.f(c3Var.getValue()) | sVar.f(cVar) | sVar.f(hVar) | sVar.f(u0Var) | sVar.d(mVar.ordinal());
        Object objM4 = sVar.M();
        if (zF4 || objM4 == fVar) {
            StringBuilder sb2 = new StringBuilder();
            String str = o1.f29050a;
            sb2.append(str);
            sb2.append('\n');
            sb2.append(str);
            objM4 = Integer.valueOf((int) (o1.a(u0Var2, cVar, hVar, sb2.toString(), 2) & 4294967295L));
            sVar.k0(objM4);
        }
        int iIntValue2 = ((Number) objM4).intValue() - iIntValue;
        Integer numValueOf = i11 == 1 ? null : Integer.valueOf(((i11 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i12 != Integer.MAX_VALUE ? Integer.valueOf(((i12 - 1) * iIntValue2) + iIntValue) : null;
        b4.t tVarF = m2.f(qVar, numValueOf != null ? cVar.O(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? cVar.O(numValueOf2.intValue()) : Float.NaN);
        sVar.q(false);
        return tVarF;
    }
}
