package g3;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f19605f;

    public v(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f19600a = f11;
        this.f19601b = f12;
        this.f19602c = f13;
        this.f19603d = f14;
        this.f19604e = f15;
        this.f19605f = f16;
    }

    public final m3.c3 a(boolean z11, b2.l lVar, m3.n nVar, int i11) {
        t1.b bVar;
        m3.s sVar = (m3.s) nVar;
        sVar.a0(-1763481333);
        float f11 = this.f19600a;
        m3.f fVar = m3.m.f29332a;
        if (lVar == null) {
            sVar.a0(167726411);
            Object objM = sVar.M();
            if (objM == fVar) {
                objM = m3.i.w(new z5.f(f11));
                sVar.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            sVar.q(false);
            sVar.q(false);
            return b1Var;
        }
        sVar.a0(138113847);
        sVar.q(false);
        Object objM2 = sVar.M();
        if (objM2 == fVar) {
            objM2 = new z3.r();
            sVar.k0(objM2);
        }
        z3.r rVar = (z3.r) objM2;
        boolean z12 = true;
        boolean z13 = (((i11 & 112) ^ 48) > 32 && sVar.f(lVar)) || (i11 & 48) == 32;
        Object objM3 = sVar.M();
        x70.c cVar = null;
        if (z13 || objM3 == fVar) {
            objM3 = new r(lVar, rVar, cVar, 1);
            sVar.k0(objM3);
        }
        m3.i.h(lVar, (Function2) objM3, sVar);
        b2.j jVar = (b2.j) CollectionsKt.X(rVar);
        if (!z11) {
            f11 = this.f19605f;
        } else if (jVar instanceof b2.n) {
            f11 = this.f19601b;
        } else if (jVar instanceof b2.h) {
            f11 = this.f19603d;
        } else if (jVar instanceof b2.d) {
            f11 = this.f19602c;
        } else if (jVar instanceof b2.b) {
            f11 = this.f19604e;
        }
        Object objM4 = sVar.M();
        if (objM4 == fVar) {
            objM4 = new t1.b(new z5.f(f11), t1.c.l, null, 12);
            sVar.k0(objM4);
        }
        t1.b bVar2 = (t1.b) objM4;
        z5.f fVar2 = new z5.f(f11);
        boolean zH = sVar.h(bVar2) | sVar.c(f11) | ((((i11 & 14) ^ 6) > 4 && sVar.g(z11)) || (i11 & 6) == 4);
        if ((((i11 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !sVar.f(this)) && (i11 & MLKEMEngine.KyberPolyBytes) != 256) {
            z12 = false;
        }
        boolean zH2 = zH | z12 | sVar.h(jVar);
        Object objM5 = sVar.M();
        if (zH2 || objM5 == fVar) {
            bVar = bVar2;
            s sVar2 = new s(bVar, f11, z11, this, jVar, null, 1);
            sVar.k0(sVar2);
            objM5 = sVar2;
        } else {
            bVar = bVar2;
        }
        m3.i.h(fVar2, (Function2) objM5, sVar);
        t1.j jVar2 = bVar.f39359c;
        sVar.q(false);
        return jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return z5.f.c(this.f19600a, vVar.f19600a) && z5.f.c(this.f19601b, vVar.f19601b) && z5.f.c(this.f19602c, vVar.f19602c) && z5.f.c(this.f19603d, vVar.f19603d) && z5.f.c(this.f19605f, vVar.f19605f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f19605f) + r8.k.a(r8.k.a(r8.k.a(Float.hashCode(this.f19600a) * 31, this.f19601b, 31), this.f19602c, 31), this.f19603d, 31);
    }
}
