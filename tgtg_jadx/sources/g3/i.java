package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.e0 f18791a = new m3.e0(new fw.b(11));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f18792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f18793c;

    static {
        new m3.w0(new fw.b(12));
        new t1.r(0.8f, 0.0f, 0.8f, 0.15f);
        float f11 = 4;
        f18792b = f11;
        f18793c = 16 - f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final u3.d r26, b4.t r27, final u3.d r28, final u3.d r29, float r30, d2.y2 r31, final g3.fa r32, g3.ja r33, d2.z1 r34, m3.n r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.i.a(u3.d, b4.t, u3.d, u3.d, float, d2.y2, g3.fa, g3.ja, d2.z1, m3.n, int, int):void");
    }

    public static final void b(final b4.t tVar, final u3.d dVar, final m5.u0 u0Var, final m5.u0 u0Var2, final b4.i iVar, final Function2 function2, final i80.n nVar, final float f11, final d2.z1 z1Var, final d2.y2 y2Var, final fa faVar, final ja jaVar, m3.n nVar2, final int i11, final int i12) {
        int i13;
        u3.d dVar2;
        m5.u0 u0Var3;
        m5.u0 u0Var4;
        b4.i iVar2;
        int i14;
        ja jaVar2;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(703932376);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            dVar2 = dVar;
            i13 |= sVar.h(dVar2) ? 32 : 16;
        } else {
            dVar2 = dVar;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            u0Var3 = u0Var;
            i13 |= sVar.f(u0Var3) ? 256 : 128;
        } else {
            u0Var3 = u0Var;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar.h(null) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            u0Var4 = u0Var2;
            i13 |= sVar.f(u0Var4) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        } else {
            u0Var4 = u0Var2;
        }
        if ((196608 & i11) == 0) {
            iVar2 = iVar;
            i13 |= sVar.f(iVar2) ? 131072 : 65536;
        } else {
            iVar2 = iVar;
        }
        if ((1572864 & i11) == 0) {
            i13 |= sVar.h(function2) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= sVar.h(nVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= sVar.c(f11) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= sVar.f(z1Var) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (sVar.f(y2Var) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.f(faVar) ? 32 : 16;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            jaVar2 = jaVar;
            i14 |= sVar.f(jaVar2) ? 256 : 128;
        } else {
            jaVar2 = jaVar;
        }
        if (sVar.R(i13 & 1, ((i13 & 306783379) == 306783378 && (i14 & 147) == 146) ? false : true)) {
            ((d1) sVar.j(f18791a)).a(new z6(tVar, dVar2, u0Var3, u0Var4, iVar2, function2, nVar, f11, z1Var, y2Var, faVar, jaVar2), sVar, 0);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(i11 | 1);
                    int iF2 = m3.i.F(i12);
                    i.b(tVar, dVar, u0Var, u0Var2, iVar, function2, nVar, f11, z1Var, y2Var, faVar, jaVar, (m3.n) obj, iF, iF2);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final u3.d r25, b4.t r26, kotlin.jvm.functions.Function2 r27, i80.n r28, float r29, d2.y2 r30, g3.fa r31, d2.z1 r32, m3.n r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.i.c(u3.d, b4.t, kotlin.jvm.functions.Function2, i80.n, float, d2.y2, g3.fa, d2.z1, m3.n, int, int):void");
    }

    public static final void d(final b4.t tVar, final i3.u uVar, final long j9, final long j11, final long j12, long j13, final u3.d dVar, final m5.u0 u0Var, final m5.u0 u0Var2, final Function0 function0, final d2.h hVar, final b4.i iVar, final Function2 function2, u3.d dVar2, final float f11, final d2.z1 z1Var, m3.n nVar, final int i11) {
        u3.d dVar3;
        final long j14 = j13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(239553141);
        int i12 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.f(uVar) ? 32 : 16) | (sVar.e(j9) ? 256 : 128) | (sVar.e(j11) ? NewHope.SENDB_BYTES : 1024) | (sVar.e(j12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.e(j14) ? 131072 : 65536) | (sVar.h(dVar) ? 1048576 : 524288) | (sVar.f(u0Var) ? 8388608 : 4194304) | (sVar.h(null) ? 67108864 : 33554432) | (sVar.f(u0Var2) ? 536870912 : 268435456);
        int i13 = 1600566 | (sVar.f(iVar) ? 256 : 128) | (sVar.h(function2) ? 131072 : 65536) | (sVar.c(f11) ? 8388608 : 4194304) | (sVar.f(z1Var) ? 67108864 : 33554432);
        if (sVar.R(i12 & 1, ((i12 & 306783379) == 306783378 && (38347923 & i13) == 38347922) ? false : true)) {
            boolean z11 = ((i12 & 112) == 32) | ((i13 & 896) == 256) | ((29360128 & i13) == 8388608);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new ia(uVar, hVar, iVar, f11, z1Var);
                sVar.k0(objM);
            }
            ia iaVar = (ia) objM;
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(iaVar, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            b5.g gVar3 = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar3);
            }
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarM = z4.c0.m(qVar, "navigationIcon");
            float f12 = f18792b;
            b4.t tVarD = d2.c.D(tVarM, f12, 0.0f, 0.0f, 0.0f, 14);
            b4.k kVar = b4.d.f5683a;
            z4.u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode2))) {
                e0.f.y(iHashCode2, sVar, iHashCode2, gVar3);
            }
            m3.i.C(tVarC2, gVar4, sVar);
            m3.e0 e0Var = v0.f19606a;
            m3.i.a(b3.i.u(j9, e0Var), function2, sVar, ((i13 >> 12) & 112) | 8);
            sVar.q(true);
            sVar.a0(408520308);
            b4.t tVarB = d2.c.B(z4.c0.m(qVar, MessageBundle.TITLE_ENTRY), f12, 0.0f, 2);
            sVar.a0(-402451802);
            sVar.q(false);
            b4.t tVarThen = tVarB.then(qVar);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new a3.p2(4, function0);
                sVar.k0(objM2);
            }
            b4.t tVarP = i4.g0.p(tVarThen, (Function1) objM2);
            z4.u0 u0VarD2 = d2.p.d(kVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarP, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode3))) {
                e0.f.y(iHashCode3, sVar, iHashCode3, gVar3);
            }
            m3.i.C(tVarC3, gVar4, sVar);
            i3.r.d(j11, u0Var, dVar, sVar, ((i12 >> 9) & 14) | ((i12 >> 18) & 112) | ((i12 >> 12) & 896));
            sVar.q(true);
            sVar.q(false);
            b4.t tVarD2 = d2.c.D(z4.c0.m(qVar, "actionIcons"), 0.0f, 0.0f, f12, 0.0f, 11);
            z4.u0 u0VarD3 = d2.p.d(kVar, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            b4.t tVarC4 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD3, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode4))) {
                e0.f.y(iHashCode4, sVar, iHashCode4, gVar3);
            }
            m3.i.C(tVarC4, gVar4, sVar);
            j14 = j13;
            dVar3 = dVar2;
            m3.i.a(e0Var.a(new i4.v(j14)), dVar3, sVar, 56);
            sVar.q(true);
            sVar.q(true);
        } else {
            dVar3 = dVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final u3.d dVar4 = dVar3;
            w1VarS.f29476d = new Function2(uVar, j9, j11, j12, j14, dVar, u0Var, u0Var2, function0, hVar, iVar, function2, dVar4, f11, z1Var, i11) { // from class: g3.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i3.u f18571b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f18572c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f18573d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f18574e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f18575f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ u3.d f18576g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ m5.u0 f18577h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ m5.u0 f18578i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Function0 f18579j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ d2.h f18580k;
                public final /* synthetic */ b4.i l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ Function2 f18581m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ u3.d f18582n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ float f18583o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ d2.z1 f18584p;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    i.d(this.f18570a, this.f18571b, this.f18572c, this.f18573d, this.f18574e, this.f18575f, this.f18576g, this.f18577h, this.f18578i, this.f18579j, this.f18580k, this.l, this.f18581m, this.f18582n, this.f18583o, this.f18584p, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(g3.ka r9, float r10, t1.s r11, t1.i r12, z70.c r13) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.i.e(g3.ka, float, t1.s, t1.i, z70.c):java.lang.Object");
    }

    public static final ka f(m3.n nVar) {
        Object[] objArr = new Object[0];
        ub.a aVar = ka.f18982d;
        boolean zC = ((m3.s) nVar).c(-3.4028235E38f) | ((m3.s) nVar).c(0.0f) | ((m3.s) nVar).c(0.0f);
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        if (zC || objM == m3.m.f29332a) {
            objM = new fw.b(13);
            sVar.k0(objM);
        }
        return (ka) y3.j.d(objArr, aVar, (Function0) objM, sVar, 0);
    }
}
