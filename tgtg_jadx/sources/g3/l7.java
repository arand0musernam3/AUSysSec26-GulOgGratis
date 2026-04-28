package g3;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f19035d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f19037f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19032a = 600;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f19033b = 30;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f19034c = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f19036e = 6;

    static {
        float f11 = 8;
        f19035d = f11;
        f19037f = f11;
    }

    public static final void a(u3.d dVar, Function2 function2, Function2 function22, m5.u0 u0Var, long j9, long j11, m3.n nVar, int i11) {
        Function2 function23;
        Function2 function24;
        b4.k kVar;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        long j12 = j11;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-931325388);
        int i13 = i11 | (sVar.h(dVar) ? 4 : 2) | (sVar.h(function2) ? 32 : 16) | (sVar.h(function22) ? 256 : 128) | (sVar.f(u0Var) ? NewHope.SENDB_BYTES : 1024) | (sVar.e(j9) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.e(j12) ? 131072 : 65536);
        if (sVar.R(i13 & 1, (74899 & i13) != 74898)) {
            float f11 = function22 == null ? f19035d : 0;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.c.D(qVar, f19034c, 0.0f, f11, 0.0f, 10);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new j(1);
                sVar.k0(objM);
            }
            z4.u0 u0Var2 = (z4.u0) objM;
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
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0Var2, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            b5.g gVar3 = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar3);
            }
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.t tVarB = d2.c.B(z4.c0.m(qVar, TextBundle.TEXT_ENTRY), 0.0f, f19036e, 1);
            b4.k kVar2 = b4.d.f5683a;
            z4.u0 u0VarD = d2.p.d(kVar2, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode2))) {
                e0.f.y(iHashCode2, sVar, iHashCode2, gVar3);
            }
            m3.i.C(tVarC2, gVar4, sVar);
            r8.k.w(i13 & 14, dVar, sVar, true);
            if (function2 != null) {
                sVar.a0(-1014168049);
                b4.t tVarM = z4.c0.m(qVar, "action");
                i12 = 8;
                z4.u0 u0VarD2 = d2.p.d(kVar2, false);
                kVar = kVar2;
                int iHashCode3 = Long.hashCode(sVar.T);
                u3.i iVarL3 = sVar.l();
                b4.t tVarC3 = b4.a.c(tVarM, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD2, gVar, sVar);
                m3.i.C(iVarL3, gVar2, sVar);
                if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode3))) {
                    e0.f.y(iHashCode3, sVar, iHashCode3, gVar3);
                }
                m3.i.C(tVarC3, gVar4, sVar);
                function23 = function2;
                m3.i.b(new m3.v1[]{b3.i.u(j9, v0.f19606a), r9.f19436a.a(u0Var)}, function23, sVar, 8 | (i13 & 112));
                sVar.q(true);
                z11 = false;
            } else {
                function23 = function2;
                kVar = kVar2;
                z11 = false;
                i12 = 8;
                sVar.a0(-1027731913);
            }
            sVar.q(z11);
            if (function22 != null) {
                sVar.a0(-1013804481);
                b4.t tVarM2 = z4.c0.m(qVar, "dismissAction");
                z4.u0 u0VarD3 = d2.p.d(kVar, z11);
                int iHashCode4 = Long.hashCode(sVar.T);
                u3.i iVarL4 = sVar.l();
                b4.t tVarC4 = b4.a.c(tVarM2, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD3, gVar, sVar);
                m3.i.C(iVarL4, gVar2, sVar);
                if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode4))) {
                    e0.f.y(iHashCode4, sVar, iHashCode4, gVar3);
                }
                m3.i.C(tVarC4, gVar4, sVar);
                j12 = j11;
                int i14 = i12 | ((i13 >> 3) & 112);
                function24 = function22;
                m3.i.a(b3.i.u(j12, v0.f19606a), function24, sVar, i14);
                z13 = true;
                sVar.q(true);
                z12 = false;
            } else {
                function24 = function22;
                j12 = j11;
                z12 = z11;
                z13 = true;
                sVar.a0(-1027731913);
            }
            sVar.q(z12);
            sVar.q(z13);
        } else {
            function23 = function2;
            function24 = function22;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j7(dVar, function23, function24, u0Var, j9, j12, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final b4.t r25, kotlin.jvm.functions.Function2 r26, kotlin.jvm.functions.Function2 r27, i4.v0 r28, long r29, long r31, long r33, long r35, final u3.d r37, m3.n r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.l7.b(b4.t, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, i4.v0, long, long, long, long, u3.d, m3.n, int, int):void");
    }
}
