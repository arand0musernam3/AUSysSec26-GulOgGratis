package y1;

import b4.q;
import b4.t;
import b5.h;
import b5.j;
import d2.h2;
import d2.i;
import d2.i1;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.w;
import d2.y;
import d2.z;
import d6.k0;
import d6.r;
import i4.g0;
import i4.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.e0;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f45370a;

    static {
        k0 k0Var = k0.Inherit;
        e0 e0Var = r.f14523a;
        k0 k0Var2 = k0.Inherit;
        k0 k0Var3 = k0.Inherit;
        long j9 = v.f23310c;
        long j11 = v.f23309b;
        f45370a = new c(j9, j11, j11, v.b(0.38f, j11), v.b(0.38f, j11));
    }

    public static final void a(c cVar, t tVar, u3.d dVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-527864079);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(tVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            t tVarR = v1.n.r(d2.c.B(d2.c.J(v1.n.j(f4.g.k(tVar, f.f45358d, l2.g.b(f.f45359e), false, 0L, 0L, 28), cVar.f45344a, g0.f23254b), i1.Max), 0.0f, f.f45363i, 1), v1.n.q(sVar), true);
            int i13 = (i12 << 3) & 7168;
            y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarR, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            dVar.invoke(z.f13980a, sVar, Integer.valueOf(((i13 >> 6) & 112) | 6));
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(cVar, tVar, dVar, i11, 24);
        }
    }

    public static final void b(t tVar, c cVar, Function1 function1, n nVar, int i11, int i12) {
        int i13;
        int i14;
        s sVar = (s) nVar;
        sVar.c0(-625529233);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else {
            i13 = (sVar.f(tVar) ? 4 : 2) | i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i14 = i13 | 48;
        } else {
            i14 = i13 | (sVar.f(cVar) ? 32 : 16);
        }
        int i17 = i14 | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i17 & 1, (i17 & 147) != 146)) {
            if (i15 != 0) {
                tVar = q.f5711a;
            }
            if (i16 != 0) {
                cVar = f45370a;
            }
            a(cVar, tVar, u3.e.e(-250345048, sVar, new oo.s(16, (Object) cVar, function1)), sVar, ((i17 << 3) & 112) | ((i17 >> 3) & 14) | MLKEMEngine.KyberPolyBytes);
        } else {
            sVar.U();
        }
        t tVar2 = tVar;
        c cVar2 = cVar;
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(tVar2, cVar2, function1, i11, i12, 23);
        }
    }

    public static final void c(String str, boolean z11, c cVar, t tVar, i80.n nVar, Function0 function0, n nVar2, int i11) {
        int i12;
        s sVar;
        s sVar2 = (s) nVar2;
        sVar2.c0(-2001167027);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.f(cVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.f(tVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(nVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(function0) ? 131072 : 65536;
        }
        int i13 = i12;
        if (sVar2.R(i13 & 1, (74899 & i13) != 74898)) {
            b4.j jVar = f.f45360f;
            d2.b bVar = i.f13801a;
            float f11 = f.f45362h;
            d2.g gVarG = i.g(f11);
            boolean z12 = ((i13 & 112) == 32) | ((458752 & i13) == 131072);
            Object objM = sVar2.M();
            if (z12 || objM == m.f29332a) {
                objM = new aa.d(z11, function0, 6);
                sVar2.k0(objM);
            }
            t tVarD = m2.d(androidx.compose.foundation.b.c(tVar, z11, str, null, (Function0) objM, 12), 1.0f);
            float f12 = f.f45355a;
            float f13 = f.f45356b;
            float f14 = f.f45357c;
            t tVarB = d2.c.B(m2.o(tVarD, f12, f14, f13, f14), f11, 0.0f, 2);
            i2 i2VarA = h2.a(gVarG, jVar, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarB, sVar2);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            if (nVar == null) {
                sVar2.a0(-1597947094);
                sVar2.q(false);
            } else {
                sVar2.a0(-1597947093);
                float f15 = f.f45364j;
                t tVarK = m2.k(q.f5711a, f15, 0.0f, f15, f15, 2);
                u0 u0VarD = p.d(b4.d.f5683a, false);
                int iHashCode2 = Long.hashCode(sVar2.T);
                u3.i iVarL2 = sVar2.l();
                t tVarC2 = b4.a.c(tVarK, sVar2);
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(hVar);
                } else {
                    sVar2.n0();
                }
                m3.i.C(u0VarD, gVar, sVar2);
                m3.i.C(iVarL2, gVar2, sVar2);
                a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
                m3.i.C(tVarC2, gVar4, sVar2);
                nVar.invoke(new v(z11 ? cVar.f45346c : cVar.f45348e), sVar2, 0);
                sVar2.q(true);
                sVar2.q(false);
            }
            m5.u0 u0Var = new m5.u0(z11 ? cVar.f45345b : cVar.f45347d, f.f45366m, f.f45367n, null, f.f45369p, f.f45361g, 0, f.f45368o, 16613240);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            m2.g0.b(str, new n1(1.0f, true), u0Var, null, 0, false, 1, 0, null, sVar2, (i13 & 14) | 1572864, 952);
            sVar = sVar2;
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g3.e0(str, z11, cVar, tVar, nVar, function0, i11);
        }
    }
}
