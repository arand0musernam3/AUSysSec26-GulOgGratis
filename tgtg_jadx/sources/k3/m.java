package k3;

import d2.m2;
import g3.p2;
import g3.s0;
import i3.u;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l3.f0;
import m3.c3;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f25843a = (float) 2.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f25844b = (float) 5.5d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f25845c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f25846d = 40;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f25847e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f25848f = 5;

    static {
        List list = p2.f19293a;
    }

    public static final void a(u uVar, long j9, m3.n nVar, int i11) {
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1353562852);
        int i12 = i11 | (sVar2.f(uVar) ? 4 : 2) | (sVar2.e(j9) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            Object obj = objM;
            if (objM == fVar) {
                i4.h hVarA = i4.l.a();
                hVarA.i(1);
                sVar2.k0(hVarA);
                obj = hVarA;
            }
            i4.h hVar = (i4.h) obj;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.q(new jt.g(uVar, 3));
                sVar2.k0(objM2);
            }
            c3 c3VarB = t1.d.b(((Number) ((c3) objM2).getValue()).floatValue(), s0.D(f0.DefaultEffects, sVar2), null, null, sVar2, 0, 28);
            m3.s sVar3 = sVar2;
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objM3 = sVar3.M();
            if (z11 || objM3 == fVar) {
                objM3 = new jd.a(uVar, 7);
                sVar3.k0(objM3);
            }
            b4.t tVarM = m2.m(j5.r.b(b4.q.f5711a, (Function1) objM3), f25845c);
            boolean zF = ((i12 & 112) == 32) | (i13 == 4) | sVar3.f(c3VarB) | sVar3.h(hVar);
            Object objM4 = sVar3.M();
            if (zF || objM4 == fVar) {
                l lVar = new l(uVar, c3VarB, j9, hVar, 0);
                sVar3.k0(lVar);
                objM4 = lVar;
            }
            v1.n.c(tVarM, (Function1) objM4, sVar3, 0);
            sVar = sVar3;
        } else {
            m3.s sVar4 = sVar2;
            sVar4.U();
            sVar = sVar4;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.l(uVar, j9, i11, 1);
        }
    }

    public static final void b(boolean z11, Function0 function0, b4.t tVar, t tVar2, b4.f fVar, i80.n nVar, u3.d dVar, m3.n nVar2, int i11) {
        i80.n nVar3;
        u3.d dVar2;
        b4.f fVar2;
        b4.f fVar3;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(-532332839);
        int i12 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.f(tVar) ? 256 : 128) | (sVar.f(tVar2) ? NewHope.SENDB_BYTES : 1024) | 24576;
        if (sVar.R(i12 & 1, (599187 & i12) != 599186)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                fVar3 = b4.d.f5683a;
            } else {
                sVar.U();
                fVar3 = fVar;
            }
            sVar.r();
            b4.t tVarD = d(tVar, z11, tVar2, function0);
            u0 u0VarD = d2.p.d(fVar3, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
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
            b5.g gVar = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar);
            }
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            d2.u uVar = d2.u.f13938a;
            dVar2 = dVar;
            dVar2.invoke(uVar, sVar, 54);
            nVar3 = nVar;
            nVar3.invoke(uVar, sVar, 54);
            sVar.q(true);
            fVar2 = fVar3;
        } else {
            nVar3 = nVar;
            dVar2 = dVar;
            sVar.U();
            fVar2 = fVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new k(z11, function0, tVar, tVar2, fVar2, nVar3, dVar2, i11);
        }
    }

    public static final void c(k4.d dVar, i4.h hVar, h4.c cVar, long j9, float f11, a aVar) {
        hVar.h();
        hVar.f(0.0f, 0.0f);
        float f12 = f25847e;
        float fC0 = dVar.c0(f12);
        float f13 = aVar.f25780b;
        hVar.e((fC0 * f13) / 2, dVar.c0(f25848f) * f13);
        hVar.e(dVar.c0(f12) * f13, 0.0f);
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (cVar.d() >> 32)) + (Math.min(cVar.f21382c - cVar.f21380a, cVar.f21383d - cVar.f21381b) / 2.0f)) - ((dVar.c0(f12) * f13) / 2.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.d() & 4294967295L));
        float f14 = f25843a;
        hVar.j((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - dVar.c0(f14))) & 4294967295L));
        float fC02 = aVar.f25779a - dVar.c0(f14);
        long jT0 = dVar.t0();
        j30.g gVarG0 = dVar.g0();
        long jO = gVarG0.o();
        gVarG0.i().e();
        try {
            ((jd.f) gVarG0.f24502b).n(fC02, jT0);
            k4.d.r0(dVar, hVar, j9, f11, new k4.h(dVar.c0(f14), 0.0f, 0, 0, null, 30), 48);
        } finally {
            r8.k.y(gVarG0, jO);
        }
    }

    public static b4.t d(b4.t tVar, boolean z11, t tVar2, Function0 function0) {
        return tVar.then(new j(z11, function0, tVar2, i.f25823c));
    }

    public static final t e(m3.n nVar) {
        Object[] objArr = new Object[0];
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        if (objM == m3.m.f29332a) {
            objM = new jq.a(4);
            sVar.k0(objM);
        }
        return (t) y3.j.d(objArr, t.f25868b, (Function0) objM, sVar, MLKEMEngine.KyberPolyBytes);
    }
}
