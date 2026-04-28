package g3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f19355b = 12;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f19356c;

    static {
        float f11 = 2;
        f19354a = f11;
        f19356c = f11;
    }

    public static final void a(boolean z11, Function0 function0, b4.t tVar, boolean z12, n5 n5Var, m3.n nVar, int i11) {
        int i12;
        boolean z13;
        boolean z14;
        m3.c3 c3VarB;
        int i13;
        int i14;
        m3.c3 c3Var;
        b4.t tVarA;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(408580840);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(tVar) ? 256 : 128;
        }
        int i15 = i12 | 3072;
        if ((i11 & 24576) == 0) {
            i15 |= sVar.f(n5Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        int i16 = i15 | 196608;
        if (sVar.R(i16 & 1, (74899 & i16) != 74898)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                z14 = true;
            } else {
                sVar.U();
                z14 = z12;
            }
            sVar.r();
            m3.c3 c3VarA = t1.d.a(z11 ? f19355b / 2 : 0, s0.D(l3.f0.FastSpatial, sVar), null, sVar, 0, 12);
            long j9 = (z14 && z11) ? n5Var.f19169a : (!z14 || z11) ? (z14 || !z11) ? n5Var.f19172d : n5Var.f19171c : n5Var.f19170b;
            if (z14) {
                sVar.a0(1194671677);
                c3VarB = s1.d1.a(j9, s0.D(l3.f0.DefaultEffects, sVar), null, sVar, 0, 12);
                sVar = sVar;
                sVar.q(false);
            } else {
                sVar.a0(1194849338);
                c3VarB = m3.i.B(new i4.v(j9), sVar);
                sVar.q(false);
            }
            boolean z15 = z14;
            b4.t tVar2 = b4.q.f5711a;
            if (function0 != null) {
                i14 = 0;
                i13 = 2;
                z13 = z15;
                c3Var = c3VarA;
                tVarA = k2.c.a(tVar2, z11, null, s5.a(l3.p0.f27097e / 2, 4, 0L, false), z13, new j5.j(3), function0);
            } else {
                i13 = 2;
                i14 = 0;
                z13 = z15;
                c3Var = c3VarA;
                tVarA = tVar2;
            }
            if (function0 != null) {
                z4.o oVar = o2.f19198a;
                tVar2 = z2.f19875b;
            }
            b4.t tVarI = d2.m2.i(d2.c.z(d2.m2.u(tVar.then(tVar2).then(tVarA), b4.d.f5687e, i13), f19354a), l3.p0.f27095c);
            boolean zF = sVar.f(c3VarB) | sVar.f(c3Var);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                objM = new o5(c3VarB, c3Var, i14);
                sVar.k0(objM);
            }
            v1.n.c(tVarI, (Function1) objM, sVar, i14);
        } else {
            sVar.U();
            z13 = z12;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p5(z11, function0, tVar, z13, n5Var, i11);
        }
    }
}
