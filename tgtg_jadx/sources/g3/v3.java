package g3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.app.tgtg.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19625a = 48;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f19626b = 24;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f19627c = i4.g0.h(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final kotlin.jvm.functions.Function0 r35, b4.t r36, final g3.w6 r37, float r38, boolean r39, i4.v0 r40, long r41, long r43, float r45, long r46, kotlin.jvm.functions.Function2 r48, kotlin.jvm.functions.Function2 r49, g3.w3 r50, final u3.d r51, m3.n r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.v3.a(kotlin.jvm.functions.Function0, b4.t, g3.w6, float, boolean, i4.v0, long, long, float, long, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, g3.w3, u3.d, m3.n, int, int, int):void");
    }

    public static final void b(final t1.b bVar, final v80.b0 b0Var, final Function0 function0, final Function0 function02, final b4.t tVar, final w6 w6Var, final float f11, final boolean z11, final i4.v0 v0Var, final long j9, final long j11, final float f12, final Function2 function2, final Function2 function22, final u3.d dVar, m3.n nVar, final int i11) {
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(377926385);
        int i12 = i11 | (sVar2.h(bVar) ? 32 : 16) | (sVar2.h(b0Var) ? 256 : 128) | (sVar2.h(function0) ? NewHope.SENDB_BYTES : 1024);
        boolean zH = sVar2.h(function02);
        int i13 = BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
        int i14 = i12 | (zH ? 16384 : 8192) | (sVar2.f(tVar) ? 131072 : 65536) | (sVar2.f(w6Var) ? 1048576 : 524288) | (sVar2.c(f11) ? 8388608 : 4194304) | (sVar2.g(z11) ? 67108864 : 33554432) | (sVar2.f(v0Var) ? 536870912 : 268435456);
        int i15 = (sVar2.e(j9) ? 4 : 2) | (sVar2.e(j11) ? 32 : 16) | (sVar2.c(f12) ? 256 : 128) | (sVar2.h(function2) ? NewHope.SENDB_BYTES : 1024);
        if (!sVar2.h(function22)) {
            i13 = 8192;
        }
        int i16 = i15 | i13 | (sVar2.h(dVar) ? 131072 : 65536);
        if (sVar2.R(i14 & 1, ((i14 & 306783379) == 306783378 && (i16 & 74899) == 74898) ? false : true)) {
            sVar2.W();
            if ((i11 & 1) != 0 && !sVar2.z()) {
                sVar2.U();
            }
            sVar2.r();
            String strJ = i3.r.j(sVar2, R.string.m3c_bottom_sheet_pane_title);
            t1.u1 u1Var = z1.a.f46388a;
            z1.r rVar = w6Var.f19706e;
            z1.r rVar2 = w6Var.f19706e;
            int i17 = (i14 & 3670016) ^ 1572864;
            boolean z12 = (i17 > 1048576 && sVar2.f(w6Var)) || (i14 & 1572864) == 1048576;
            Object objM = sVar2.M();
            boolean z13 = z12;
            m3.f fVar = m3.m.f29332a;
            if (z13 || objM == fVar) {
                objM = new n(w6Var, 2);
                sVar2.k0(objM);
            }
            Function1 function1 = (Function1) objM;
            t1.u1 u1Var2 = s6.f19477b;
            t1.u1 u1Var3 = z1.a.f46388a;
            z5.c cVar = (z5.c) sVar2.j(c5.x1.f7416h);
            boolean zF = sVar2.f(cVar) | sVar2.f(rVar) | sVar2.f(function1) | sVar2.f(u1Var2);
            Object objM2 = sVar2.M();
            if (zF || objM2 == fVar) {
                z1.c cVar2 = new z1.c(rVar, function1, new t7(cVar, 1));
                float f13 = a2.n.f232a;
                objM2 = new a2.j(cVar2, z1.k.f46569b, u1Var2);
                sVar2.k0(objM2);
            }
            a2.j jVar = (a2.j) objM2;
            boolean zF2 = sVar2.f(jVar);
            Object objM3 = sVar2.M();
            if (zF2 || objM3 == fVar) {
                objM3 = new s3(jVar, w6Var, function0);
                sVar2.k0(objM3);
            }
            s3 s3Var = (s3) objM3;
            boolean z14 = true;
            b4.t tVarD = d2.m2.d(d2.m2.s(d2.u.f13938a.a(tVar, b4.d.f5684b), 0.0f, f11, 1), 1.0f);
            b4.t tVarA = b4.q.f5711a;
            if (z11) {
                sVar2.a0(-1884894530);
                boolean z15 = (i17 > 1048576 && sVar2.f(w6Var)) || (i14 & 1572864) == 1048576;
                Object objM4 = sVar2.M();
                if (z15 || objM4 == fVar) {
                    objM4 = new r6(w6Var, s3Var, z1.h2.Vertical);
                    sVar2.k0(objM4);
                }
                tVarA = v4.f.a(tVarA, (v4.a) objM4, null);
                sVar2.q(false);
            } else {
                sVar2.a0(-1884879399);
                sVar2.q(false);
            }
            b4.t tVarThen = tVarD.then(tVarA);
            z1.h2 h2Var = z1.h2.Vertical;
            boolean z16 = (i17 > 1048576 && sVar2.f(w6Var)) || (i14 & 1572864) == 1048576;
            Object objM5 = sVar2.M();
            if (z16 || objM5 == fVar) {
                objM5 = new y0(w6Var, 2);
                sVar2.k0(objM5);
            }
            b4.t tVarE = z1.k.e(i3.r.h(tVarThen, rVar2, h2Var, (Function2) objM5), w6Var.f19706e, h2Var, z11 && w6Var.d() != x6.Hidden, s3Var, 24);
            boolean zF3 = sVar2.f(strJ);
            Object objM6 = sVar2.M();
            if (zF3 || objM6 == fVar) {
                objM6 = new c60.e(strJ, 26);
                sVar2.k0(objM6);
            }
            b4.t tVarC = j5.r.c(tVarE, false, (Function1) objM6);
            int iH = (int) rVar2.f46655j.h();
            if (iH < 0) {
                iH = 0;
            }
            b4.t tVarO = d2.c.o(tVarC, new d2.j0(iH));
            boolean z17 = (i17 > 1048576 && sVar2.f(w6Var)) || (i14 & 1572864) == 1048576;
            if ((i14 & 112) != 32 && !sVar2.h(bVar)) {
                z14 = false;
            }
            boolean z18 = z17 | z14;
            Object objM7 = sVar2.M();
            if (z18 || objM7 == fVar) {
                objM7 = new ek.a(12, w6Var, bVar);
                sVar2.k0(objM7);
            }
            int i18 = i16 << 6;
            sVar = sVar2;
            q7.a(i4.g0.p(i4.g0.p(tVarO, (Function1) objM7), new n(w6Var, 0)), v0Var, j9, j11, f12, 0.0f, null, u3.e.e(1144070092, sVar2, new h0(function22, bVar, w6Var, function2, function02, b0Var, z11, dVar)), sVar, ((i14 >> 24) & 112) | 12582912 | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 96);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(b0Var, function0, function02, tVar, w6Var, f11, z11, v0Var, j9, j11, f12, function2, function22, dVar, i11) { // from class: g3.g3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v80.b0 f18652b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Function0 f18653c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Function0 f18654d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ b4.t f18655e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ w6 f18656f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f18657g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f18658h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ i4.v0 f18659i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ long f18660j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ long f18661k;
                public final /* synthetic */ float l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ Function2 f18662m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ Function2 f18663n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ u3.d f18664o;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(71);
                    v3.b(this.f18651a, this.f18652b, this.f18653c, this.f18654d, this.f18655e, this.f18656f, this.f18657g, this.f18658h, this.f18659i, this.f18660j, this.f18661k, this.l, this.f18662m, this.f18663n, this.f18664o, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void c(final long j9, final Function0 function0, final boolean z11, final boolean z12, m3.n nVar, final int i11) {
        boolean z13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-391613911);
        int i12 = i11 | (sVar.e(j9) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.g(z12) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            if (j9 != 16) {
                sVar.a0(-1438602166);
                z13 = false;
                m3.c3 c3VarB = t1.d.b(z11 ? 1.0f : 0.0f, s0.D(l3.f0.DefaultEffects, sVar), null, null, sVar, 0, 28);
                String strJ = i3.r.j(sVar, R.string.close_sheet);
                b4.t tVarC = b4.q.f5711a;
                m3.f fVar = m3.m.f29332a;
                if (z12) {
                    sVar.a0(-1438303419);
                    int i13 = i12 & 112;
                    boolean z14 = i13 == 32;
                    Object objM = sVar.M();
                    if (z14 || objM == fVar) {
                        objM = new t3(0, function0);
                        sVar.k0(objM);
                    }
                    b4.t tVarA = w4.h0.a(tVarC, function0, (PointerInputEventHandler) objM);
                    boolean zF = (i13 == 32) | sVar.f(strJ);
                    Object objM2 = sVar.M();
                    if (zF || objM2 == fVar) {
                        objM2 = new ek.a(13, strJ, function0);
                        sVar.k0(objM2);
                    }
                    tVarC = j5.r.c(tVarA, true, (Function1) objM2);
                    sVar.q(false);
                } else {
                    sVar.a0(-1437877231);
                    sVar.q(false);
                }
                b4.t tVarThen = d2.m2.f13850c.then(tVarC);
                boolean zF2 = sVar.f(c3VarB) | ((i12 & 14) == 4);
                Object objM3 = sVar.M();
                if (zF2 || objM3 == fVar) {
                    objM3 = new fg.p(1, j9, c3VarB);
                    sVar.k0(objM3);
                }
                v1.n.c(tVarThen, (Function1) objM3, sVar, 0);
            } else {
                z13 = false;
                sVar.a0(-1461041671);
            }
            sVar.q(z13);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(j9, function0, z11, z12, i11) { // from class: g3.h3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f18723a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Function0 f18724b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f18725c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f18726d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    v3.c(this.f18723a, this.f18724b, this.f18725c, this.f18726d, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final float d(i4.s0 s0Var, float f11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (s0Var.f23297q >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (ba0.g.C(0.0f, Math.min(s0Var.f23298r.a() * f19625a, fIntBitsToFloat), f11) / fIntBitsToFloat);
    }

    public static final float e(i4.s0 s0Var, float f11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (s0Var.f23297q & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (ba0.g.C(0.0f, Math.min(s0Var.f23298r.a() * f19626b, fIntBitsToFloat), f11) / fIntBitsToFloat);
    }

    public static final w6 f(int i11, int i12, Function1 function1, m3.n nVar) {
        boolean z11 = true;
        boolean z12 = (i12 & 1) == 0;
        int i13 = i12 & 2;
        m3.f fVar = m3.m.f29332a;
        if (i13 != 0) {
            m3.s sVar = (m3.s) nVar;
            Object objM = sVar.M();
            if (objM == fVar) {
                objM = new g2.q(8);
                sVar.k0(objM);
            }
            function1 = (Function1) objM;
        }
        Function1 function12 = function1;
        x6 x6Var = x6.Hidden;
        int i14 = (i11 & 112) | (i11 & 14) | MLKEMEngine.KyberPolyBytes;
        float f11 = s6.f19476a;
        float f12 = m.f19070c;
        float f13 = m.f19071d;
        m3.s sVar2 = (m3.s) nVar;
        z5.c cVar = (z5.c) sVar2.j(c5.x1.f7416h);
        boolean zF = sVar2.f(cVar) | sVar2.c(f12);
        Object objM2 = sVar2.M();
        if (zF || objM2 == fVar) {
            objM2 = new n6(cVar, f12, 0);
            sVar2.k0(objM2);
        }
        Function0 function0 = (Function0) objM2;
        boolean zF2 = sVar2.f(cVar) | sVar2.c(f13);
        Object objM3 = sVar2.M();
        if (zF2 || objM3 == fVar) {
            objM3 = new n6(cVar, f13, 1);
            sVar2.k0(objM3);
        }
        Function0 function02 = (Function0) objM3;
        Object[] objArr = {Boolean.valueOf(z12), function12, Boolean.FALSE};
        ub.a aVar = new ub.a(28, new t0(15), new a3.b(z12, function0, function02, function12));
        boolean zF3 = ((((i14 & 14) ^ 6) > 4 && sVar2.g(z12)) || (i14 & 6) == 4) | sVar2.f(function0) | sVar2.f(function02);
        if ((((i14 & 112) ^ 48) <= 32 || !sVar2.f(function12)) && (i14 & 48) != 32) {
            z11 = false;
        }
        boolean zG = zF3 | z11 | sVar2.g(false);
        Object objM4 = sVar2.M();
        if (zG || objM4 == fVar) {
            dp.w wVar = new dp.w(z12, function0, function02, x6Var, function12);
            sVar2.k0(wVar);
            objM4 = wVar;
        }
        return (w6) y3.j.d(objArr, aVar, (Function0) objM4, sVar2, 0);
    }
}
