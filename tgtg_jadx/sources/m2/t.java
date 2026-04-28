package m2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.c3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f29082a;

    static {
        float f11 = 40;
        f29082a = zz.f.e(f11, f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r32, final kotlin.jvm.functions.Function1 r33, final b4.t r34, boolean r35, boolean r36, final m5.u0 r37, final m2.d1 r38, m2.c1 r39, boolean r40, int r41, int r42, r5.g0 r43, kotlin.jvm.functions.Function1 r44, b2.l r45, i4.r r46, i80.n r47, m3.n r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.t.a(java.lang.String, kotlin.jvm.functions.Function1, b4.t, boolean, boolean, m5.u0, m2.d1, m2.c1, boolean, int, int, r5.g0, kotlin.jvm.functions.Function1, b2.l, i4.r, i80.n, m3.n, int, int, int):void");
    }

    public static final void b(final r5.y yVar, final Function1 function1, final b4.t tVar, boolean z11, final m5.u0 u0Var, final d1 d1Var, c1 c1Var, final boolean z12, int i11, int i12, r5.g0 g0Var, Function1 function12, i4.r rVar, final u3.d dVar, m3.n nVar, final int i13) {
        m3.s sVar;
        final boolean z13;
        final c1 c1Var2;
        final int i14;
        final int i15;
        final r5.g0 g0Var2;
        final Function1 function13;
        final i4.r rVar2;
        int i16;
        r5.g0 g0Var3;
        int i17;
        int i18;
        Function1 function14;
        c1 c1Var3;
        i4.r rVar3;
        boolean z14;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-971111025);
        int i19 = i13 | (sVar2.f(yVar) ? 4 : 2) | (sVar2.h(function1) ? 32 : 16) | 27648 | (sVar2.f(u0Var) ? 131072 : 65536) | 281018368;
        if (sVar2.R(i19 & 1, (306783379 & i19) != 306783378)) {
            sVar2.W();
            int i21 = i13 & 1;
            m3.f fVar = m3.m.f29332a;
            if (i21 == 0 || sVar2.z()) {
                int i22 = z12 ? 1 : Integer.MAX_VALUE;
                int i23 = i19 & (-1879048193);
                Object objM = sVar2.M();
                if (objM == fVar) {
                    objM = new k9.f(20);
                    sVar2.k0(objM);
                }
                i4.x0 x0Var = new i4.x0(i4.v.f23309b);
                c1 c1Var4 = c1.f28788g;
                i16 = i23;
                g0Var3 = r5.f0.f37673a;
                i17 = i22;
                i18 = 1;
                function14 = (Function1) objM;
                c1Var3 = c1Var4;
                rVar3 = x0Var;
                z14 = true;
            } else {
                sVar2.U();
                z14 = z11;
                c1Var3 = c1Var;
                i17 = i11;
                i18 = i12;
                function14 = function12;
                rVar3 = rVar;
                i16 = i19 & (-1879048193);
                g0Var3 = g0Var;
            }
            sVar2.r();
            boolean z15 = true;
            r5.m mVarB = d1Var.b(z12);
            Function1 function15 = function14;
            boolean z16 = !z12;
            int i24 = z12 ? 1 : i18;
            int i25 = z12 ? 1 : i17;
            boolean z17 = (i16 & 14) == 4;
            if ((i16 & 112) != 32) {
                z15 = false;
            }
            boolean z18 = z17 | z15;
            Object objM2 = sVar2.M();
            if (z18 || objM2 == fVar) {
                objM2 = new hb0.o(26, (Object) yVar, function1);
                sVar2.k0(objM2);
            }
            i4.r rVar4 = rVar3;
            sVar = sVar2;
            g0.j(yVar, (Function1) objM2, tVar, u0Var, g0Var3, function15, null, rVar4, z16, i25, i24, mVarB, c1Var3, z14, false, dVar, sVar, (i16 & 910) | ((i16 >> 6) & 7168) | 14376960, 224640);
            g0Var2 = g0Var3;
            z13 = z14;
            i14 = i17;
            i15 = i18;
            rVar2 = rVar4;
            c1Var2 = c1Var3;
            function13 = function15;
        } else {
            sVar = sVar2;
            sVar.U();
            z13 = z11;
            c1Var2 = c1Var;
            i14 = i11;
            i15 = i12;
            g0Var2 = g0Var;
            function13 = function12;
            rVar2 = rVar;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(function1, tVar, z13, u0Var, d1Var, c1Var2, z12, i14, i15, g0Var2, function13, rVar2, dVar, i13) { // from class: m2.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Function1 f28864b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b4.t f28865c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f28866d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ m5.u0 f28867e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d1 f28868f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ c1 f28869g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f28870h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ int f28871i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ int f28872j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ r5.g0 f28873k;
                public final /* synthetic */ Function1 l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ i4.r f28874m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ u3.d f28875n;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(102236545);
                    t.b(this.f28863a, this.f28864b, this.f28865c, this.f28866d, this.f28867e, this.f28868f, this.f28869g, this.f28870h, this.f28871i, this.f28872j, this.f28873k, this.l, this.f28874m, this.f28875n, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void c(v2.h hVar, b4.t tVar, boolean z11, m5.u0 u0Var, d1 d1Var, v2.f fVar, b2.l lVar, i4.r rVar, v2.c cVar, v1.y1 y1Var, m3.n nVar, int i11, int i12) {
        boolean z12;
        int i13;
        int i14;
        int i15;
        v2.f fVar2;
        b2.l lVar2;
        int i16;
        i4.r rVar2;
        int i17;
        int i18;
        m3.s sVar;
        v1.y1 y1Var2;
        boolean z13;
        i4.r rVar3;
        b2.l lVar3;
        v1.y1 y1VarQ;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(469439921);
        int i19 = i11 | (sVar2.f(hVar) ? 4 : 2) | (sVar2.f(tVar) ? 32 : 16);
        int i21 = i12 & 4;
        if (i21 != 0) {
            i13 = i19 | MLKEMEngine.KyberPolyBytes;
            z12 = z11;
        } else {
            z12 = z11;
            i13 = i19 | (sVar2.g(z12) ? 256 : 128);
        }
        if ((i12 & 8) != 0) {
            i14 = i13 | 3072;
        } else {
            i14 = i13 | (sVar2.g(false) ? 2048 : 1024);
        }
        int i22 = 8192;
        if ((i12 & 16) != 0) {
            i15 = i14 | 24576;
        } else {
            i15 = i14 | (sVar2.f(null) ? 16384 : 8192);
        }
        int i23 = i15 | (sVar2.f(u0Var) ? 131072 : 65536) | (sVar2.f(d1Var) ? 1048576 : 524288) | ((i12 & 128) != 0 ? 12582912 : sVar2.f(null) ? 8388608 : 4194304);
        if ((i11 & 100663296) == 0) {
            fVar2 = fVar;
            i23 |= sVar2.f(fVar2) ? 67108864 : 33554432;
        } else {
            fVar2 = fVar;
        }
        int i24 = i23 | ((i12 & 512) != 0 ? 805306368 : sVar2.h(null) ? 536870912 : 268435456);
        int i25 = i12 & 1024;
        if (i25 != 0) {
            i16 = 6;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            i16 = sVar2.f(lVar2) ? 4 : 2;
        }
        int i26 = i12 & NewHope.SENDB_BYTES;
        if (i26 != 0) {
            i17 = i16 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i17 = i16 | (sVar2.f(rVar2) ? 32 : 16);
        }
        int i27 = i17;
        if ((i12 & 4096) != 0) {
            i18 = i27 | MLKEMEngine.KyberPolyBytes;
        } else {
            i18 = i27 | (sVar2.f(null) ? 256 : 128);
        }
        int i28 = i18 | (sVar2.f(cVar) ? 2048 : 1024);
        if ((i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0 && sVar2.f(y1Var)) {
            i22 = 16384;
        }
        int i29 = i28 | i22;
        if (sVar2.R(i24 & 1, ((i24 & 306783379) == 306783378 && (i29 & 9363) == 9362) ? false : true)) {
            sVar2.W();
            if ((i11 & 1) == 0 || sVar2.z()) {
                if (i21 != 0) {
                    z12 = true;
                }
                lVar3 = i25 != 0 ? null : lVar2;
                if (i26 != 0) {
                    rVar2 = f.f28846a;
                }
                if ((i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0) {
                    i29 &= -57345;
                    y1VarQ = v1.n.q(sVar2);
                } else {
                    y1VarQ = y1Var;
                }
            } else {
                sVar2.U();
                if ((i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0) {
                    i29 &= -57345;
                }
                y1VarQ = y1Var;
                lVar3 = lVar2;
            }
            i4.r rVar4 = rVar2;
            int i31 = i29;
            boolean z14 = z12;
            sVar2.r();
            int i32 = i24 & 2147483646;
            int i33 = (i31 & 14) | MLKEMEngine.KyberPolyBytes | (i31 & 112);
            int i34 = i31 << 3;
            sVar = sVar2;
            d(hVar, tVar, z14, u0Var, d1Var, fVar2, lVar3, rVar4, cVar, y1VarQ, sVar, i32, i33 | (i34 & 7168) | (57344 & i34) | (i34 & 458752));
            z13 = z14;
            lVar2 = lVar3;
            rVar3 = rVar4;
            y1Var2 = y1VarQ;
        } else {
            sVar = sVar2;
            sVar.U();
            y1Var2 = y1Var;
            z13 = z12;
            rVar3 = rVar2;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new l(hVar, tVar, z13, u0Var, d1Var, fVar, lVar2, rVar3, cVar, y1Var2, i11, i12, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x048e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(v2.h r33, b4.t r34, final boolean r35, final m5.u0 r36, final m2.d1 r37, final v2.f r38, b2.l r39, final i4.r r40, final v2.c r41, final v1.y1 r42, m3.n r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 1295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.t.d(v2.h, b4.t, boolean, m5.u0, m2.d1, v2.f, b2.l, i4.r, v2.c, v1.y1, m3.n, int, int):void");
    }

    public static final void e(x2.w wVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1991581797);
        int i12 = (sVar.h(wVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            boolean zF = sVar.f(wVar);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = m3.i.q(new g(wVar, 2));
                sVar.k0(objM);
            }
            if (((x2.d) ((c3) objM).getValue()).f43727a) {
                sVar.a0(535433166);
                boolean zH = sVar.h(wVar);
                Object objM2 = sVar.M();
                if (zH || objM2 == fVar) {
                    objM2 = new r(wVar, 0);
                    sVar.k0(objM2);
                }
                a3.t tVar = (a3.t) objM2;
                boolean zH2 = sVar.h(wVar);
                Object objM3 = sVar.M();
                if (zH2 || objM3 == fVar) {
                    objM3 = new s(wVar, 0);
                    sVar.k0(objM3);
                }
                a.a(tVar, w4.h0.a(b4.q.f5711a, wVar, (PointerInputEventHandler) objM3), f29082a, sVar, MLKEMEngine.KyberPolyBytes, 0);
            } else {
                sVar.a0(507182525);
            }
            sVar.q(false);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new n(wVar, i11, 1);
        }
    }

    public static final void f(x2.w wVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(2025287684);
        int i13 = i11 | (sVar.h(wVar) ? 4 : 2);
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            boolean zF = sVar.f(wVar);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = m3.i.q(new g(wVar, 0));
                sVar.k0(objM);
            }
            c3 c3Var = (c3) objM;
            boolean z11 = ((x2.d) c3Var.getValue()).f43727a;
            b4.q qVar = b4.q.f5711a;
            if (z11) {
                sVar.a0(-354703320);
                boolean zH = sVar.h(wVar);
                Object objM2 = sVar.M();
                if (zH || objM2 == fVar) {
                    objM2 = new r(wVar, 1);
                    sVar.k0(objM2);
                }
                a3.t tVar = (a3.t) objM2;
                x5.j jVar = ((x2.d) c3Var.getValue()).f43730d;
                boolean z12 = ((x2.d) c3Var.getValue()).f43731e;
                boolean zH2 = sVar.h(wVar);
                Object objM3 = sVar.M();
                if (zH2 || objM3 == fVar) {
                    objM3 = new s(wVar, 1);
                    sVar.k0(objM3);
                }
                i12 = -383839042;
                bx.k.i(tVar, true, jVar, z12, f29082a, ((x2.d) c3Var.getValue()).f43729c, w4.h0.a(qVar, wVar, (PointerInputEventHandler) objM3), sVar, 24624, 0);
            } else {
                i12 = -383839042;
                sVar.a0(-383839042);
            }
            sVar.q(false);
            boolean zF2 = sVar.f(wVar);
            Object objM4 = sVar.M();
            if (zF2 || objM4 == fVar) {
                objM4 = m3.i.q(new g(wVar, 1));
                sVar.k0(objM4);
            }
            c3 c3Var2 = (c3) objM4;
            if (((x2.d) c3Var2.getValue()).f43727a) {
                sVar.a0(-353657845);
                boolean zH3 = sVar.h(wVar);
                Object objM5 = sVar.M();
                if (zH3 || objM5 == fVar) {
                    objM5 = new r(wVar, 2);
                    sVar.k0(objM5);
                }
                a3.t tVar2 = (a3.t) objM5;
                x5.j jVar2 = ((x2.d) c3Var2.getValue()).f43730d;
                boolean z13 = ((x2.d) c3Var2.getValue()).f43731e;
                boolean zH4 = sVar.h(wVar);
                Object objM6 = sVar.M();
                if (zH4 || objM6 == fVar) {
                    objM6 = new s(wVar, 2);
                    sVar.k0(objM6);
                }
                bx.k.i(tVar2, false, jVar2, z13, f29082a, ((x2.d) c3Var2.getValue()).f43729c, w4.h0.a(qVar, wVar, (PointerInputEventHandler) objM6), sVar, 24624, 0);
            } else {
                sVar.a0(i12);
            }
            sVar.q(false);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new n(wVar, i11, 0);
        }
    }
}
