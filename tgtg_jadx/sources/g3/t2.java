package g3;

import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.d3 f19507a;

    static {
        u70.l.b(new fw.b(19));
        f19507a = new m3.d3(new fw.b(20));
    }

    public static final void a(p0 p0Var, z3 z3Var, k6 k6Var, la laVar, Function2 function2, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(904511636);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(p0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(z3Var) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(k6Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(laVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            sVar.W();
            if ((i11 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            t5 t5VarA = s5.a(0.0f, 7, 0L, false);
            long j9 = p0Var.f19258a;
            boolean zE = sVar.e(j9);
            Object objM = sVar.M();
            if (zE || objM == m3.m.f29332a) {
                objM = new a3.t3(j9, i4.v.b(0.4f, j9));
                sVar.k0(objM);
            }
            m3.i.b(new m3.v1[]{r0.f19375a.a(p0Var), f19507a.a(z3Var), v1.b1.f41690a.a(t5VarA), m6.f19099a.a(k6Var), a3.u3.f588a.a((a3.t3) objM), na.f19192a.a(laVar)}, u3.e.e(-1750539308, sVar, new s2(laVar, function2, 0)), sVar, 56);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cm.a(p0Var, z3Var, k6Var, laVar, function2, i11, 5);
        }
    }

    public static final void b(p0 p0Var, k6 k6Var, la laVar, Function2 function2, m3.n nVar, int i11, int i12) {
        int i13;
        Function2 function22;
        la laVar2;
        k6 k6Var2;
        p0 p0Var2;
        int i14;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-449719819);
        if ((i11 & 6) == 0) {
            i13 = (((i12 & 1) == 0 && sVar.f(p0Var)) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= ((i12 & 4) == 0 && sVar.f(laVar)) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar.h(function2) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                if ((i12 & 1) != 0) {
                    p0Var = (p0) sVar.j(r0.f19375a);
                    i13 &= -15;
                }
                k6Var = (k6) sVar.j(m6.f19099a);
                i14 = i13 & (-113);
                if ((i12 & 4) != 0) {
                    laVar = (la) sVar.j(na.f19192a);
                    i14 = i13 & (-1009);
                }
                int i15 = i14;
                p0 p0Var3 = p0Var;
                k6 k6Var3 = k6Var;
                la laVar3 = laVar;
                sVar.r();
                int i16 = i15 << 3;
                a(p0Var3, (z3) sVar.j(f19507a), k6Var3, laVar3, function2, sVar, (i15 & 14) | (i16 & 7168) | (i16 & 57344));
                function22 = function2;
                p0Var2 = p0Var3;
                k6Var2 = k6Var3;
                laVar2 = laVar3;
            } else {
                sVar.U();
                if ((i12 & 1) != 0) {
                    i13 &= -15;
                }
                i14 = i13 & (-113);
                if ((i12 & 4) != 0) {
                    i14 = i13 & (-1009);
                }
                int i152 = i14;
                p0 p0Var32 = p0Var;
                k6 k6Var32 = k6Var;
                la laVar32 = laVar;
                sVar.r();
                int i162 = i152 << 3;
                a(p0Var32, (z3) sVar.j(f19507a), k6Var32, laVar32, function2, sVar, (i152 & 14) | (i162 & 7168) | (i162 & 57344));
                function22 = function2;
                p0Var2 = p0Var32;
                k6Var2 = k6Var32;
                laVar2 = laVar32;
            }
        } else {
            function22 = function2;
            sVar.U();
            laVar2 = laVar;
            k6Var2 = k6Var;
            p0Var2 = p0Var;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d60.b(p0Var2, k6Var2, laVar2, function22, i11, i12);
        }
    }
}
