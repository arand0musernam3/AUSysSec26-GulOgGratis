package g3;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f19900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f19901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f19902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f19903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.z0 f19904f;

    static {
        float f11 = l3.y0.f27248o;
        f19899a = f11;
        f19900b = l3.y0.f27255v;
        f19901c = l3.y0.f27254u;
        float f12 = l3.y0.f27251r;
        f19902d = f12;
        f19903e = (f12 - f11) / 2;
        f19904f = new t1.z0(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r17, kotlin.jvm.functions.Function1 r18, b4.t r19, kotlin.jvm.functions.Function2 r20, boolean r21, g3.w7 r22, m3.n r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.z7.a(boolean, kotlin.jvm.functions.Function1, b4.t, kotlin.jvm.functions.Function2, boolean, g3.w7, m3.n, int, int):void");
    }

    public static final void b(b4.t tVar, boolean z11, boolean z12, w7 w7Var, Function2 function2, b2.k kVar, i4.v0 v0Var, m3.n nVar, int i11) {
        int i12;
        int i13;
        long j9;
        boolean z13;
        long j11;
        w7 w7Var2 = w7Var;
        Function2 function22 = function2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-670917213);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(w7Var2) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function22) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.f(kVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.f(v0Var) ? 1048576 : 524288;
        }
        if (sVar.R(i12 & 1, (599187 & i12) != 599186)) {
            long j12 = z12 ? z11 ? w7Var2.f19710b : w7Var2.f19714f : z11 ? w7Var2.f19718j : w7Var2.f19721n;
            long j13 = z12 ? z11 ? w7Var2.f19709a : w7Var2.f19713e : z11 ? w7Var2.f19717i : w7Var2.f19720m;
            i4.v0 v0VarB = m6.b(l3.y0.f27253t, sVar);
            float f11 = l3.y0.f27252s;
            if (z12) {
                i13 = i12;
                j9 = z11 ? w7Var2.f19711c : w7Var2.f19715g;
            } else {
                i13 = i12;
                j9 = z11 ? w7Var2.f19719k : w7Var2.f19722o;
            }
            b4.t tVarJ = v1.n.j(v1.n.k(tVar, f11, j9, v0VarB), j12, v0VarB);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            b5.g gVar3 = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar3);
            }
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.t tVarJ2 = v1.n.j(v1.b1.a(d2.u.f13938a.a(b4.q.f5711a, b4.d.f5686d).then(new s9(kVar, z11, s0.D(l3.f0.FastSpatial, sVar))), kVar, s5.a(l3.y0.f27250q / 2, 4, 0L, false)), j13, v0Var);
            z4.u0 u0VarD2 = d2.p.d(b4.d.f5687e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarJ2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode2))) {
                e0.f.y(iHashCode2, sVar, iHashCode2, gVar3);
            }
            m3.i.C(tVarC2, gVar4, sVar);
            if (function2 != null) {
                sVar.a0(1235836927);
                if (z12) {
                    w7Var2 = w7Var;
                    j11 = z11 ? w7Var2.f19712d : w7Var2.f19716h;
                } else {
                    w7Var2 = w7Var;
                    j11 = z11 ? w7Var2.l : w7Var2.f19723p;
                }
                function22 = function2;
                m3.i.a(b3.i.u(j11, v0.f19606a), function22, sVar, ((i13 >> 9) & 112) | 8);
                z13 = false;
            } else {
                w7Var2 = w7Var;
                function22 = function2;
                z13 = false;
                sVar.a0(1228606611);
            }
            sVar.q(z13);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y7(tVar, z11, z12, w7Var2, function22, kVar, v0Var, i11);
        }
    }
}
