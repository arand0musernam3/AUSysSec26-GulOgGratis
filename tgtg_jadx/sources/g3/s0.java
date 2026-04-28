package g3;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import com.app.tgtg.R;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f19443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f19444b = new u3.d(new c60.a(21), false, -1342205566);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f19445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.d f19446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3.d f19447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3.d f19448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u3.d f19449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u3.d f19450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u3.d f19451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u3.d f19452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f3.b f19453k;

    static {
        byte b8 = 0;
        f19443a = new u3.d(new cn.u(27, b8), false, 2094288676);
        new u3.d(new cn.u(28, (byte) 0), false, -684072357);
        new u3.d(new c60.a(22), false, 2136598717);
        f19445c = new u3.d(new cn.u(29, b8), false, 1121996006);
        new u3.d(new t0(0), false, 2132285819);
        f19446d = new u3.d(new t0(1), false, -91331245);
        f19447e = new u3.d(new t0(2), false, -39202156);
        f19448f = new u3.d(new t0(3), false, 1582488484);
        f19449g = new u3.d(new t0(4), false, 414328099);
        f19450h = new u3.d(new t0(5), false, -1514016380);
        f19451i = new u3.d(new t0(6), false, -1429684928);
        f19452j = new u3.d(new t0(7), false, -463596174);
        new u3.d(new t0(8), false, -773954579);
        new u3.d(new t0(9), false, -1132537920);
        f19453k = new f3.b(0.16f, 0.1f, 0.08f, 0.1f);
    }

    public static c4 A(p0 p0Var) {
        c4 c4Var = p0Var.f19267e0;
        if (c4Var != null) {
            return c4Var;
        }
        long jD = r0.d(p0Var, l3.h0.f26966a);
        long jD2 = r0.d(p0Var, l3.h0.f26969d);
        long jD3 = r0.d(p0Var, l3.h0.f26967b);
        l3.r rVar = l3.h0.f26970e;
        long jD4 = r0.d(p0Var, rVar);
        l3.r rVar2 = l3.h0.f26971f;
        c4 c4Var2 = new c4(jD, jD2, jD3, jD4, r0.d(p0Var, rVar2), i4.v.b(0.38f, r0.d(p0Var, rVar)), i4.v.b(0.38f, r0.d(p0Var, rVar2)));
        p0Var.f19267e0 = c4Var2;
        return c4Var2;
    }

    public static final boolean B(KeyEvent keyEvent) {
        long jB = u4.c.b(keyEvent);
        int i11 = u4.a.F;
        return u4.a.a(jB, u4.a.f40716h) || u4.a.a(jB, u4.a.f40725r) || u4.a.a(jB, u4.a.E);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0210, code lost:
    
        if (r38 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0214, code lost:
    
        if (r40 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0218, code lost:
    
        if (r0 <= 100.01d) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021b, code lost:
    
        r0 = (j3.b.d(r0) & 255) | ((((j3.b.d(r38) & 255) << 16) | com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView.DEFAULT_STROKE_COLOR) | ((j3.b.d(r40) & 255) << 8));
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long C(float r46, long r47) {
        /*
            Method dump skipped, instruction units count: 1433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.s0.C(float, long):long");
    }

    public static final t1.b1 D(l3.f0 f0Var, m3.n nVar) {
        return w((z3) ((m3.s) nVar).j(t2.f19507a), f0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.jvm.functions.Function0 r30, b4.t r31, boolean r32, i4.v0 r33, g3.o r34, g3.t r35, v1.a0 r36, d2.z1 r37, b2.l r38, i80.n r39, m3.n r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.s0.a(kotlin.jvm.functions.Function0, b4.t, boolean, i4.v0, g3.o, g3.t, v1.a0, d2.z1, b2.l, i80.n, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(b4.t r21, i4.v0 r22, g3.u r23, g3.v r24, v1.a0 r25, i80.n r26, m3.n r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.s0.b(b4.t, i4.v0, g3.u, g3.v, v1.a0, i80.n, m3.n, int, int):void");
    }

    public static final void c(Function0 function0, b4.t tVar, boolean z11, i4.v0 v0Var, u uVar, v vVar, u3.d dVar, m3.n nVar, int i11, int i12) {
        int i13;
        i4.v0 v0VarB;
        v vVar2;
        i4.v0 v0Var2;
        v vVar3;
        boolean z12;
        m3.s sVar;
        v vVarQ;
        v vVar4;
        int i14;
        v vVar5;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(2136075085);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.h(function0) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.f(tVar) ? 32 : 16;
        }
        int i15 = i13 | MLKEMEngine.KyberPolyBytes;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                v0VarB = v0Var;
                int i16 = sVar2.f(v0VarB) ? NewHope.SENDB_BYTES : 1024;
                i15 |= i16;
            } else {
                v0VarB = v0Var;
            }
            i15 |= i16;
        } else {
            v0VarB = v0Var;
        }
        if ((i11 & 24576) == 0) {
            i15 |= sVar2.f(uVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                v vVar6 = vVar;
                boolean zF = sVar2.f(vVar6);
                vVar4 = vVar6;
                if (zF) {
                    i14 = 131072;
                    vVar5 = vVar6;
                }
                i15 |= i14;
                vVar2 = vVar5;
            } else {
                vVar4 = vVar;
            }
            i14 = 65536;
            vVar5 = vVar4;
            i15 |= i14;
            vVar2 = vVar5;
        } else {
            vVar2 = vVar;
        }
        int i17 = i15 | 14155776;
        if ((100663296 & i11) == 0) {
            i17 |= sVar2.h(dVar) ? 67108864 : 33554432;
        }
        boolean z13 = true;
        if (sVar2.R(i17 & 1, (38347923 & i17) != 38347922)) {
            sVar2.W();
            if ((i11 & 1) == 0 || sVar2.z()) {
                if ((i12 & 8) != 0) {
                    v0VarB = m6.b(l3.w.f27170c, sVar2);
                    i17 &= -7169;
                }
                vVarQ = vVar2;
                if ((i12 & 32) != 0) {
                    i17 &= -458753;
                    vVarQ = q(0.0f, 0.0f, 0.0f, 0.0f, 63);
                }
            } else {
                sVar2.U();
                if ((i12 & 8) != 0) {
                    i17 &= -7169;
                }
                if ((i12 & 32) != 0) {
                    i17 &= -458753;
                }
                z13 = z11;
                vVarQ = vVar2;
            }
            sVar2.r();
            sVar2.a0(1577873102);
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                objM = w.a0.g(sVar2);
            }
            b2.l lVar = (b2.l) objM;
            sVar2.q(false);
            long j9 = z13 ? uVar.f19540a : uVar.f19542c;
            long j11 = z13 ? uVar.f19541b : uVar.f19543d;
            m3.s sVar3 = sVar2;
            boolean z14 = z13;
            i4.v0 v0Var3 = v0VarB;
            q7.c(function0, tVar, z14, v0Var3, j9, j11, ((z5.f) vVarQ.a(z13, lVar, sVar2, ((i17 >> 6) & 14) | ((i17 >> 9) & 896)).getValue()).f47277a, null, lVar, u3.e.e(-1347531112, sVar2, new d2.m0(dVar, 1)), sVar3, (i17 & 8190) | ((i17 << 6) & 234881024), 64);
            vVar3 = vVarQ;
            z12 = z14;
            v0Var2 = v0Var3;
            sVar = sVar3;
        } else {
            m3.s sVar4 = sVar2;
            sVar4.U();
            v0Var2 = v0VarB;
            vVar3 = vVar2;
            z12 = z11;
            sVar = sVar4;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new w(function0, tVar, z12, v0Var2, uVar, vVar3, dVar, i11, i12);
        }
    }

    public static final void d(b4.t tVar, float f11, long j9, m3.n nVar, int i11) {
        float fA;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1562471785);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            if (z5.f.c(f11, 0.0f)) {
                sVar.a0(-1258401829);
                fA = 1.0f / ((z5.c) sVar.j(c5.x1.f7416h)).a();
                sVar.q(false);
            } else {
                sVar.a0(-1258335272);
                sVar.q(false);
                fA = f11;
            }
            d2.p.a(v1.n.j(d2.m2.e(d2.m2.d(tVar, 1.0f), fA), j9, i4.g0.f23254b), sVar, 0);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.d(tVar, f11, j9, i11);
        }
    }

    public static final void e(boolean z11, Function1 function1, b4.t tVar, u3.d dVar, m3.n nVar, int i11) {
        Function1 function12;
        u3.d dVar2;
        b4.t tVar2;
        Object w1Var;
        m3.f fVar;
        final oa oaVar;
        int i12;
        final int i13;
        final m3.b1 b1Var;
        boolean z12;
        boolean z13 = z11;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1597265892);
        int i14 = i11 | (sVar.g(z13) ? 4 : 2) | MLKEMEngine.KyberPolyBytes;
        if (sVar.R(i14 & 1, (i14 & 1171) != 1170)) {
            Configuration configuration = (Configuration) sVar.j(c5.v0.f7389a);
            View view = (View) sVar.j(c5.v0.f7394f);
            boolean zF = sVar.f(configuration) | sVar.f(view);
            Object objM = sVar.M();
            m3.f fVar2 = m3.m.f29332a;
            if (zF || objM == fVar2) {
                objM = new oa(view);
                sVar.k0(objM);
            }
            oa oaVar2 = (oa) objM;
            z5.c cVar = (z5.c) sVar.j(c5.x1.f7416h);
            int iQ0 = cVar.q0(y2.f19813a);
            Object objM2 = sVar.M();
            if (objM2 == fVar2) {
                objM2 = m3.i.w(null);
                sVar.k0(objM2);
            }
            m3.b1 b1Var2 = (m3.b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar2) {
                objM3 = w.a0.s(0, sVar);
            }
            m3.h1 h1Var = (m3.h1) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar2) {
                objM4 = w.a0.s(0, sVar);
            }
            final m3.h1 h1Var2 = (m3.h1) objM4;
            Object objM5 = sVar.M();
            if (objM5 == fVar2) {
                objM5 = new g4.v();
                sVar.k0(objM5);
            }
            g4.v vVar = (g4.v) objM5;
            c5.f3 f3Var = (c5.f3) sVar.j(c5.x1.f7423p);
            String strJ = i3.r.j(sVar, R.string.m3c_dropdown_menu_expanded);
            String strJ2 = i3.r.j(sVar, R.string.m3c_dropdown_menu_collapsed);
            String strJ3 = i3.r.j(sVar, R.string.m3c_dropdown_menu_toggle);
            Object objM6 = sVar.M();
            if (objM6 == fVar2) {
                objM6 = m3.i.w(new q1());
                sVar.k0(objM6);
            }
            m3.b1 b1Var3 = (m3.b1) objM6;
            Object objM7 = sVar.M();
            if (objM7 == fVar2) {
                objM7 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM7);
            }
            m3.b1 b1Var4 = (m3.b1) objM7;
            int i15 = i14 & 14;
            boolean zF2 = (i15 == 4) | sVar.f(oaVar2) | sVar.f(cVar);
            Object objM8 = sVar.M();
            if (zF2 || objM8 == fVar2) {
                fVar = fVar2;
                oaVar = oaVar2;
                i12 = i15;
                i13 = iQ0;
                w1Var = new w1(vVar, z13, b1Var4, strJ, strJ2, strJ3, f3Var, b1Var3, function1, h1Var, h1Var2);
                vVar = vVar;
                z13 = z13;
                sVar.k0(w1Var);
            } else {
                i12 = i15;
                fVar = fVar2;
                w1Var = objM8;
                i13 = iQ0;
                oaVar = oaVar2;
            }
            w1 w1Var2 = (w1) w1Var;
            boolean zH = sVar.h(oaVar) | sVar.d(i13);
            Object objM9 = sVar.M();
            if (zH || objM9 == fVar) {
                objM9 = new d2.x(oaVar, i13, b1Var2, h1Var, h1Var2);
                b1Var = b1Var2;
                sVar.k0(objM9);
            } else {
                b1Var = b1Var2;
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarO = z4.c0.o(qVar, (Function1) objM9);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarO, sVar);
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
            dVar2 = dVar;
            dVar2.invoke(w1Var2, sVar, 48);
            sVar.q(true);
            if (z13) {
                sVar.a0(209857027);
                boolean zH2 = sVar.h(oaVar) | sVar.d(i13);
                Object objM10 = sVar.M();
                if (zH2 || objM10 == fVar) {
                    objM10 = new Function0() { // from class: g3.u1
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() {
                            /*
                                r7 = this;
                                g3.oa r0 = r1
                                android.view.View r0 = r0.f19252a
                                android.graphics.Rect r1 = new android.graphics.Rect
                                r1.<init>()
                                r0.getWindowVisibleDisplayFrame(r1)
                                int r0 = r1.top
                                int r1 = r1.bottom
                                m3.b1 r2 = r3
                                java.lang.Object r2 = r2.getValue()
                                z4.z r2 = (z4.z) r2
                                if (r2 == 0) goto L34
                                boolean r3 = r2.n()
                                if (r3 != 0) goto L21
                                goto L34
                            L21:
                                r3 = 0
                                long r3 = r2.e(r3)
                                long r5 = r2.u()
                                long r5 = b0.z.z(r5)
                                h4.c r2 = na0.a.S(r3, r5)
                                goto L36
                            L34:
                                h4.c r2 = h4.c.f21379e
                            L36:
                                int r3 = r2
                                int r4 = r0 + r3
                                int r3 = r1 - r3
                                float r5 = r2.f21381b
                                float r1 = (float) r1
                                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                                if (r1 > 0) goto L58
                                float r1 = r2.f21383d
                                float r0 = (float) r0
                                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                                if (r0 >= 0) goto L4b
                                goto L58
                            L4b:
                                float r0 = (float) r4
                                float r5 = r5 - r0
                                float r0 = (float) r3
                                float r0 = r0 - r1
                                float r0 = java.lang.Math.max(r5, r0)
                                int r0 = j80.c.b(r0)
                                goto L5a
                            L58:
                                int r0 = r3 - r4
                            L5a:
                                r1 = 0
                                int r0 = java.lang.Math.max(r0, r1)
                                m3.h1 r1 = r4
                                r1.i(r0)
                                kotlin.Unit r0 = kotlin.Unit.f26487a
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: g3.u1.invoke():java.lang.Object");
                        }
                    };
                    sVar.k0(objM10);
                }
                z12 = false;
                k((Function0) objM10, sVar, 0);
            } else {
                z12 = false;
                sVar.a0(199160446);
            }
            sVar.q(z12);
            int i16 = i12;
            if (i16 == 4) {
                z12 = true;
            }
            Object objM11 = sVar.M();
            if (z12 || objM11 == fVar) {
                objM11 = new aa.d(z13, vVar, 1);
                sVar.k0(objM11);
            }
            m3.i.j((Function0) objM11, sVar);
            Object objM12 = sVar.M();
            if (objM12 == fVar) {
                function12 = function1;
                objM12 = new defpackage.c(function12, 2);
                sVar.k0(objM12);
            } else {
                function12 = function1;
            }
            i3.r.a(z13, (Function0) objM12, sVar, i16);
            tVar2 = qVar;
        } else {
            function12 = function1;
            dVar2 = dVar;
            sVar.U();
            tVar2 = tVar;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.c(z13, function12, tVar2, dVar2, i11);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void f(d7 d7Var, b4.t tVar, u3.d dVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-977568115);
        int i12 = (i11 & 6) == 0 ? (sVar.f(d7Var) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(tVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            String strJ = i3.r.j(sVar, R.string.m3c_snackbar_pane_title);
            Object objM = sVar.M();
            Object obj = objM;
            if (objM == m3.m.f29332a) {
                d2 d2Var = new d2();
                d2Var.f18441a = new Object();
                d2Var.f18442b = new ArrayList();
                sVar.k0(d2Var);
                obj = d2Var;
            }
            d2 d2Var2 = (d2) obj;
            Object obj2 = d2Var2.f18441a;
            ArrayList arrayList = d2Var2.f18442b;
            if (Intrinsics.areEqual(d7Var, obj2)) {
                sVar.a0(1428992245);
            } else {
                sVar.a0(1441886385);
                d2Var2.f18441a = d7Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList2.add((d7) ((c2) arrayList.get(i13)).f18403a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(d7Var)) {
                    arrayList3.add(d7Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    Object obj3 = arrayList3.get(i14);
                    if (obj3 != null) {
                        arrayList4.add(obj3);
                    }
                }
                int size3 = arrayList4.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    d7 d7Var2 = (d7) arrayList4.get(i15);
                    arrayList.add(new c2(d7Var2, u3.e.e(-1952400805, sVar, new cn.x(d7Var2, d7Var, d2Var2, strJ))));
                }
            }
            sVar.q(false);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVar, sVar);
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
            d2Var2.f18443c = m3.i.t(sVar);
            sVar.a0(-1888182177);
            int size4 = arrayList.size();
            for (int i16 = 0; i16 < size4; i16++) {
                c2 c2Var = (c2) arrayList.get(i16);
                d7 d7Var3 = (d7) c2Var.f18403a;
                u3.d dVar2 = c2Var.f18404b;
                sVar.Y(1325010085, d7Var3);
                dVar2.invoke(u3.e.e(-1893791890, sVar, new a3.u2(25, (i80.n) dVar, (Object) d7Var3)), sVar, 6);
                sVar.q(false);
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(d7Var, tVar, dVar, i11, 5);
        }
    }

    public static final void g(b4.t tVar, float f11, long j9, m3.n nVar, int i11, int i12) {
        int i13;
        long jE;
        float f12;
        b4.t tVar2;
        long j11;
        float f13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(75144485);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.c(f11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            jE = j9;
            i13 |= ((i12 & 4) == 0 && sVar.e(jE)) ? 256 : 128;
        } else {
            jE = j9;
        }
        int i16 = 0;
        boolean z11 = true;
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                if (i14 != 0) {
                    tVar = b4.q.f5711a;
                }
                f13 = i15 != 0 ? i1.f18800a : f11;
                if ((i12 & 4) != 0) {
                    float f14 = i1.f18800a;
                    i13 &= -897;
                    jE = r0.e(l3.s.f27126a, sVar);
                }
            } else {
                sVar.U();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                f13 = f11;
            }
            sVar.r();
            b4.t tVarE = d2.m2.e(d2.m2.d(tVar, 1.0f), f13);
            boolean z12 = (i13 & 112) == 32;
            if ((((i13 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !sVar.e(jE)) && (i13 & MLKEMEngine.KyberPolyBytes) != 256) {
                z11 = false;
            }
            boolean z13 = z12 | z11;
            Object objM = sVar.M();
            if (z13 || objM == m3.m.f29332a) {
                objM = new j1(f13, i16, jE);
                sVar.k0(objM);
            }
            v1.n.c(tVarE, (Function1) objM, sVar, 0);
            f12 = f13;
            j11 = jE;
            tVar2 = tVar;
        } else {
            sVar.U();
            f12 = f11;
            tVar2 = tVar;
            j11 = jE;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new k1(tVar2, f12, j11, i11, i12, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(kotlin.jvm.functions.Function0 r25, b4.t r26, boolean r27, g3.f2 r28, b2.l r29, i4.v0 r30, kotlin.jvm.functions.Function2 r31, m3.n r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.s0.h(kotlin.jvm.functions.Function0, b4.t, boolean, g3.f2, b2.l, i4.v0, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    public static final void i(b4.t tVar, Function0 function0, boolean z11, i4.v0 v0Var, f2 f2Var, b2.l lVar, Function2 function2, m3.n nVar, int i11) {
        int i12;
        b2.l lVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1134296466);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(v0Var) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(f2Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.f(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(function2) ? 1048576 : 524288;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (599187 & i13) != 599186)) {
            if (lVar == null) {
                sVar.a0(976976045);
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    objM = w.a0.g(sVar);
                }
                lVar2 = (b2.l) objM;
                sVar.q(false);
            } else {
                sVar.a0(862798698);
                sVar.q(false);
                lVar2 = lVar;
            }
            z4.o oVar = o2.f19198a;
            b4.t tVarThen = tVar.then(z2.f19875b);
            int i14 = g2.f18650a;
            float f11 = l3.v0.f27166c;
            long jE = zz.f.e(l3.v0.f27167d + f11 + f11, l3.v0.f27164a);
            d2.g0 g0Var = d2.m2.f13848a;
            b4.t tVarG = i3.r.g(androidx.compose.foundation.b.b(v1.n.j(f4.g.b(d2.m2.n(tVarThen, z5.h.b(jE), z5.h.a(jE)), v0Var), z11 ? f2Var.f18587a : f2Var.f18589c, v0Var), lVar2, s5.a(0.0f, 7, 0L, false), z11, null, new j5.j(0), function0, 8));
            z4.u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarG, sVar);
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
            m3.i.a(b3.i.u(z11 ? f2Var.f18588b : f2Var.f18590d, v0.f19606a), function2, sVar, ((i13 >> 15) & 112) | 8);
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c0(tVar, function0, z11, v0Var, f2Var, lVar, function2, i11);
        }
    }

    public static final void j(final Function0 function0, final long j9, final w3 w3Var, final t1.b bVar, final u3.d dVar, m3.n nVar, final int i11) {
        int i12;
        long j11;
        w3 w3Var2;
        int i13;
        z5.m mVar;
        int i14;
        boolean z11;
        boolean z12;
        Object obj;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(766784632);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            j11 = j9;
            i12 |= sVar.e(j11) ? 32 : 16;
        } else {
            j11 = j9;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            w3Var2 = w3Var;
            i12 |= sVar.f(w3Var2) ? 256 : 128;
        } else {
            w3Var2 = w3Var;
        }
        if ((i11 & 3072) == 0) {
            i12 |= (i11 & 4096) == 0 ? sVar.f(bVar) : sVar.h(bVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(dVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            View view = (View) sVar.j(c5.v0.f7394f);
            z5.c cVar = (z5.c) sVar.j(c5.x1.f7416h);
            z5.m mVar2 = (z5.m) sVar.j(c5.x1.f7421n);
            m3.q qVarA = m3.i.A(sVar);
            m3.b1 b1VarB = m3.i.B(dVar, sVar);
            Object[] objArr = new Object[0];
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                i13 = i12;
                objM = new fw.b(21);
                sVar.k0(objM);
            } else {
                i13 = i12;
            }
            UUID uuid = (UUID) y3.j.c(objArr, (Function0) objM, sVar);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM2);
            }
            v80.b0 b0Var = (v80.b0) objM2;
            boolean zF = sVar.f(view) | sVar.f(cVar);
            Object objM3 = sVar.M();
            if (zF || objM3 == fVar) {
                mVar = mVar2;
                i14 = i13;
                z11 = true;
                z12 = false;
                f3 f3Var = new f3(function0, w3Var2, j11, view, mVar, cVar, uuid, bVar, b0Var);
                f3Var.f18595e.setContent(qVarA, new u3.d(new r1(b1VarB, 1), true, -1051373467));
                sVar.k0(f3Var);
                obj = f3Var;
            } else {
                mVar = mVar2;
                i14 = i13;
                z11 = true;
                z12 = false;
                obj = objM3;
            }
            final f3 f3Var2 = (f3) obj;
            boolean zH = sVar.h(f3Var2);
            Object objM4 = sVar.M();
            if (zH || objM4 == fVar) {
                objM4 = new c50.p(f3Var2, 28);
                sVar.k0(objM4);
            }
            m3.i.d(f3Var2, (Function1) objM4, sVar);
            int i15 = i14;
            boolean zH2 = sVar.h(f3Var2) | ((i15 & 14) == 4 ? z11 : z12) | ((i15 & 896) == 256 ? z11 : z12) | ((i15 & 112) == 32 ? z11 : z12) | sVar.d(mVar.ordinal());
            Object objM5 = sVar.M();
            if (zH2 || objM5 == fVar) {
                final z5.m mVar3 = mVar;
                objM5 = new Function0() { // from class: g3.x3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        f3Var2.c(function0, w3Var, j9, mVar3);
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM5);
            }
            m3.i.j((Function0) objM5, sVar);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.y3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    s0.j(function0, j9, w3Var, bVar, dVar, (m3.n) obj2, m3.i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void k(Function0 function0, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1646555525);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            m((View) sVar.j(c5.v0.f7394f), (z5.c) sVar.j(c5.x1.f7416h), function0, sVar, (i12 << 6) & 896);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a2(i11, 0, function0);
        }
    }

    public static final void l(g7 g7Var, b4.t tVar, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        b4.t tVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1077081618);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(g7Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 48;
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            d7 d7VarA = g7Var.a();
            c5.g gVar = (c5.g) sVar.j(c5.x1.f7409a);
            boolean zF = sVar.f(d7VarA) | sVar.h(gVar);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                objM = new d8.c(d7VarA, gVar, null, 28);
                sVar.k0(objM);
            }
            m3.i.h(d7VarA, (Function2) objM, sVar);
            d7 d7VarA2 = g7Var.a();
            b4.q qVar = b4.q.f5711a;
            f(d7VarA2, qVar, dVar, sVar, 432);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(g7Var, tVar2, dVar, i11, 4);
        }
    }

    public static final void m(View view, z5.c cVar, Function0 function0, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1319522472);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(view) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(cVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            boolean zH = sVar.h(view) | ((i12 & 896) == 256);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new ek.a(10, view, function0);
                sVar.k0(objM);
            }
            m3.i.c(view, cVar, (Function1) objM, sVar);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(view, cVar, function0, i11, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(kotlin.jvm.functions.Function0 r23, b4.t r24, boolean r25, i4.v0 r26, g3.o r27, v1.a0 r28, d2.z1 r29, u3.d r30, m3.n r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.s0.n(kotlin.jvm.functions.Function0, b4.t, boolean, i4.v0, g3.o, v1.a0, d2.z1, u3.d, m3.n, int, int):void");
    }

    public static final void o(b4.t tVar, float f11, long j9, m3.n nVar, int i11, int i12) {
        int i13;
        long jE;
        float f12;
        b4.t tVar2;
        long j11;
        float f13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1534852205);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.c(f11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            jE = j9;
            i13 |= ((i12 & 4) == 0 && sVar.e(jE)) ? 256 : 128;
        } else {
            jE = j9;
        }
        int i16 = 1;
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                if (i14 != 0) {
                    tVar = b4.q.f5711a;
                }
                f13 = i15 != 0 ? i1.f18800a : f11;
                if ((i12 & 4) != 0) {
                    float f14 = i1.f18800a;
                    i13 &= -897;
                    jE = r0.e(l3.s.f27126a, sVar);
                }
            } else {
                sVar.U();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                f13 = f11;
            }
            sVar.r();
            b4.t tVarQ = d2.m2.q(d2.m2.c(tVar, 1.0f), f13);
            boolean z11 = ((((i13 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && sVar.e(jE)) || (i13 & MLKEMEngine.KyberPolyBytes) == 256) | ((i13 & 112) == 32);
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new j1(f13, i16, jE);
                sVar.k0(objM);
            }
            v1.n.c(tVarQ, (Function1) objM, sVar, 0);
            f12 = f13;
            j11 = jE;
            tVar2 = tVar;
        } else {
            sVar.U();
            f12 = f11;
            tVar2 = tVar;
            j11 = jE;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new k1(tVar2, f12, j11, i11, i12, 1);
        }
    }

    public static u p(long j9, m3.n nVar, int i11) {
        long jB = r0.b(j9, nVar);
        long j11 = i4.v.f23315h;
        long jB2 = i4.v.b(0.38f, jB);
        u uVarZ = z((p0) ((m3.s) nVar).j(r0.f19375a));
        long j12 = j9 != 16 ? j9 : uVarZ.f19540a;
        if (jB == 16) {
            jB = uVarZ.f19541b;
        }
        long j13 = jB;
        if (j11 == 16) {
            j11 = uVarZ.f19542c;
        }
        long j14 = j11;
        if (jB2 == 16) {
            jB2 = uVarZ.f19543d;
        }
        return new u(j12, j13, j14, jB2);
    }

    public static v q(float f11, float f12, float f13, float f14, int i11) {
        if ((i11 & 1) != 0) {
            f11 = l3.w.f27169b;
        }
        float f15 = f11;
        if ((i11 & 2) != 0) {
            f12 = l3.w.f27177j;
        }
        float f16 = f12;
        if ((i11 & 4) != 0) {
            f13 = l3.w.f27175h;
        }
        float f17 = f13;
        if ((i11 & 8) != 0) {
            f14 = l3.w.f27176i;
        }
        return new v(f15, f16, f17, f14, l3.w.f27174g, l3.w.f27172e);
    }

    public static n5 r(long j9, long j11, m3.n nVar) {
        long j12 = i4.v.f23315h;
        p0 p0Var = (p0) ((m3.s) nVar).j(r0.f19375a);
        n5 n5Var = p0Var.f19269f0;
        if (n5Var == null) {
            n5 n5Var2 = new n5(r0.d(p0Var, l3.p0.f27096d), r0.d(p0Var, l3.p0.f27098f), i4.v.b(0.38f, r0.d(p0Var, l3.p0.f27093a)), i4.v.b(0.38f, r0.d(p0Var, l3.p0.f27094b)));
            p0Var.f19269f0 = n5Var2;
            n5Var = n5Var2;
        }
        long j13 = j9 != 16 ? j9 : n5Var.f19169a;
        long j14 = j11 != 16 ? j11 : n5Var.f19170b;
        long j15 = j12 != 16 ? j12 : n5Var.f19171c;
        if (j12 == 16) {
            j12 = n5Var.f19172d;
        }
        return new n5(j13, j14, j15, j12);
    }

    public static final p0 s(Context context) {
        if (Build.VERSION.SDK_INT < 34) {
            x9 x9VarU = u(context);
            long j9 = x9VarU.f19805x;
            long j11 = x9VarU.A;
            long j12 = x9VarU.f19807z;
            long j13 = x9VarU.f19804w;
            long j14 = x9VarU.f19806y;
            long j15 = x9VarU.E;
            long j16 = x9VarU.H;
            long j17 = x9VarU.G;
            long j18 = x9VarU.D;
            long j19 = x9VarU.L;
            long j21 = x9VarU.O;
            long j22 = x9VarU.N;
            long j23 = x9VarU.K;
            long j24 = x9VarU.f19800s;
            long j25 = x9VarU.f19789g;
            long j26 = x9VarU.l;
            return r0.c(j9, j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, j24, j25, j24, j25, j26, x9VarU.f19791i, j9, j25, x9VarU.f19796o, 0L, 0L, 0L, 0L, x9VarU.f19792j, j26, x9VarU.f19802u, x9VarU.f19794m, x9VarU.f19798q, x9VarU.f19797p, x9VarU.f19795n, x9VarU.f19799r, x9VarU.f19801t, j24, j13, j9, x9VarU.B, j12, j18, j15, x9VarU.I, j17, j23, j19, x9VarU.P, j22, 62914560, 0);
        }
        long jX = x(context, android.R.color.system_primary_dark);
        long jX2 = x(context, android.R.color.system_on_primary_dark);
        long jX3 = x(context, android.R.color.system_primary_container_dark);
        long jX4 = x(context, android.R.color.system_on_primary_container_dark);
        long jX5 = x(context, android.R.color.system_primary_light);
        long jX6 = x(context, android.R.color.system_secondary_dark);
        long jX7 = x(context, android.R.color.system_on_secondary_dark);
        long jX8 = x(context, android.R.color.system_secondary_container_dark);
        long jX9 = x(context, android.R.color.system_on_secondary_container_dark);
        long jX10 = x(context, android.R.color.system_tertiary_dark);
        long jX11 = x(context, android.R.color.system_on_tertiary_dark);
        long jX12 = x(context, android.R.color.system_tertiary_container_dark);
        long jX13 = x(context, android.R.color.system_on_tertiary_container_dark);
        long jX14 = x(context, android.R.color.system_background_dark);
        long jX15 = x(context, android.R.color.system_on_background_dark);
        long jX16 = x(context, android.R.color.system_surface_dark);
        long jX17 = x(context, android.R.color.system_on_surface_dark);
        long jX18 = x(context, android.R.color.system_surface_variant_dark);
        long jX19 = x(context, android.R.color.system_on_surface_variant_dark);
        long jX20 = x(context, android.R.color.system_surface_light);
        long jX21 = x(context, android.R.color.system_on_surface_light);
        long jX22 = x(context, android.R.color.system_outline_dark);
        long jX23 = x(context, android.R.color.system_outline_variant_dark);
        long jX24 = x(context, android.R.color.system_surface_bright_dark);
        long jX25 = x(context, android.R.color.system_surface_dim_dark);
        return r0.c(jX, jX2, jX3, jX4, jX5, jX6, jX7, jX8, jX9, jX10, jX11, jX12, jX13, jX14, jX15, jX16, jX17, jX18, jX19, x(context, android.R.color.system_primary_dark), jX20, jX21, 0L, 0L, 0L, 0L, jX22, jX23, 0L, jX24, x(context, android.R.color.system_surface_container_dark), x(context, android.R.color.system_surface_container_high_dark), x(context, android.R.color.system_surface_container_highest_dark), x(context, android.R.color.system_surface_container_low_dark), x(context, android.R.color.system_surface_container_lowest_dark), jX25, x(context, android.R.color.system_primary_fixed), x(context, android.R.color.system_primary_fixed_dim), x(context, android.R.color.system_on_primary_fixed), x(context, android.R.color.system_on_primary_fixed_variant), x(context, android.R.color.system_secondary_fixed), x(context, android.R.color.system_secondary_fixed_dim), x(context, android.R.color.system_on_secondary_fixed), x(context, android.R.color.system_on_secondary_fixed_variant), x(context, android.R.color.system_tertiary_fixed), x(context, android.R.color.system_tertiary_fixed_dim), x(context, android.R.color.system_on_tertiary_fixed), x(context, android.R.color.system_on_tertiary_fixed_variant), 331350016, 0);
    }

    public static final p0 t(Context context) {
        if (Build.VERSION.SDK_INT < 34) {
            x9 x9VarU = u(context);
            long j9 = x9VarU.f19806y;
            long j11 = x9VarU.f19803v;
            long j12 = x9VarU.f19804w;
            long j13 = x9VarU.B;
            long j14 = x9VarU.f19805x;
            long j15 = x9VarU.F;
            long j16 = x9VarU.C;
            long j17 = x9VarU.D;
            long j18 = x9VarU.I;
            long j19 = x9VarU.M;
            long j21 = x9VarU.J;
            long j22 = x9VarU.K;
            long j23 = x9VarU.P;
            long j24 = x9VarU.f19784b;
            long j25 = x9VarU.f19799r;
            long j26 = x9VarU.f19789g;
            return r0.f(j9, j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, j24, j25, j24, j25, j26, x9VarU.l, j9, x9VarU.f19796o, x9VarU.f19786d, 0L, 0L, 0L, 0L, x9VarU.f19793k, x9VarU.f19791i, x9VarU.f19802u, j24, x9VarU.f19787e, x9VarU.f19788f, j26, x9VarU.f19785c, x9VarU.f19783a, x9VarU.f19790h, j12, j14, j13, x9VarU.f19807z, j17, x9VarU.E, j18, x9VarU.G, j22, x9VarU.L, j23, x9VarU.N, 62914560, 0);
        }
        long jX = x(context, android.R.color.system_primary_light);
        long jX2 = x(context, android.R.color.system_on_primary_light);
        long jX3 = x(context, android.R.color.system_primary_container_light);
        long jX4 = x(context, android.R.color.system_on_primary_container_light);
        long jX5 = x(context, android.R.color.system_primary_dark);
        long jX6 = x(context, android.R.color.system_secondary_light);
        long jX7 = x(context, android.R.color.system_on_secondary_light);
        long jX8 = x(context, android.R.color.system_secondary_container_light);
        long jX9 = x(context, android.R.color.system_on_secondary_container_light);
        long jX10 = x(context, android.R.color.system_tertiary_light);
        long jX11 = x(context, android.R.color.system_on_tertiary_light);
        long jX12 = x(context, android.R.color.system_tertiary_container_light);
        long jX13 = x(context, android.R.color.system_on_tertiary_container_light);
        long jX14 = x(context, android.R.color.system_background_light);
        long jX15 = x(context, android.R.color.system_on_background_light);
        long jX16 = x(context, android.R.color.system_surface_light);
        long jX17 = x(context, android.R.color.system_on_surface_light);
        long jX18 = x(context, android.R.color.system_surface_variant_light);
        long jX19 = x(context, android.R.color.system_on_surface_variant_light);
        long jX20 = x(context, android.R.color.system_surface_dark);
        long jX21 = x(context, android.R.color.system_on_surface_dark);
        long jX22 = x(context, android.R.color.system_outline_light);
        long jX23 = x(context, android.R.color.system_outline_variant_light);
        long jX24 = x(context, android.R.color.system_surface_bright_light);
        long jX25 = x(context, android.R.color.system_surface_dim_light);
        return r0.f(jX, jX2, jX3, jX4, jX5, jX6, jX7, jX8, jX9, jX10, jX11, jX12, jX13, jX14, jX15, jX16, jX17, jX18, jX19, x(context, android.R.color.system_primary_light), jX20, jX21, 0L, 0L, 0L, 0L, jX22, jX23, 0L, jX24, x(context, android.R.color.system_surface_container_light), x(context, android.R.color.system_surface_container_high_light), x(context, android.R.color.system_surface_container_highest_light), x(context, android.R.color.system_surface_container_low_light), x(context, android.R.color.system_surface_container_lowest_light), jX25, x(context, android.R.color.system_primary_fixed), x(context, android.R.color.system_primary_fixed_dim), x(context, android.R.color.system_on_primary_fixed), x(context, android.R.color.system_on_primary_fixed_variant), x(context, android.R.color.system_secondary_fixed), x(context, android.R.color.system_secondary_fixed_dim), x(context, android.R.color.system_on_secondary_fixed), x(context, android.R.color.system_on_secondary_fixed_variant), x(context, android.R.color.system_tertiary_fixed), x(context, android.R.color.system_tertiary_fixed_dim), x(context, android.R.color.system_on_tertiary_fixed), x(context, android.R.color.system_on_tertiary_fixed_variant), 331350016, 0);
    }

    public static final x9 u(Context context) {
        x(context, android.R.color.system_neutral1_0);
        x(context, android.R.color.system_neutral1_10);
        C(98.0f, x(context, android.R.color.system_neutral1_600));
        C(96.0f, x(context, android.R.color.system_neutral1_600));
        x(context, android.R.color.system_neutral1_50);
        C(94.0f, x(context, android.R.color.system_neutral1_600));
        C(92.0f, x(context, android.R.color.system_neutral1_600));
        x(context, android.R.color.system_neutral1_100);
        C(87.0f, x(context, android.R.color.system_neutral1_600));
        x(context, android.R.color.system_neutral1_200);
        x(context, android.R.color.system_neutral1_300);
        x(context, android.R.color.system_neutral1_400);
        x(context, android.R.color.system_neutral1_500);
        x(context, android.R.color.system_neutral1_600);
        x(context, android.R.color.system_neutral1_700);
        C(24.0f, x(context, android.R.color.system_neutral1_600));
        C(22.0f, x(context, android.R.color.system_neutral1_600));
        x(context, android.R.color.system_neutral1_800);
        C(17.0f, x(context, android.R.color.system_neutral1_600));
        C(12.0f, x(context, android.R.color.system_neutral1_600));
        x(context, android.R.color.system_neutral1_900);
        C(6.0f, x(context, android.R.color.system_neutral1_600));
        C(4.0f, x(context, android.R.color.system_neutral1_600));
        x(context, android.R.color.system_neutral1_1000);
        long jX = x(context, android.R.color.system_neutral2_0);
        x(context, android.R.color.system_neutral2_10);
        long jC = C(98.0f, x(context, android.R.color.system_neutral2_600));
        long jC2 = C(96.0f, x(context, android.R.color.system_neutral2_600));
        long jX2 = x(context, android.R.color.system_neutral2_50);
        long jC3 = C(94.0f, x(context, android.R.color.system_neutral2_600));
        long jC4 = C(92.0f, x(context, android.R.color.system_neutral2_600));
        long jX3 = x(context, android.R.color.system_neutral2_100);
        long jC5 = C(87.0f, x(context, android.R.color.system_neutral2_600));
        long jX4 = x(context, android.R.color.system_neutral2_200);
        x(context, android.R.color.system_neutral2_300);
        long jX5 = x(context, android.R.color.system_neutral2_400);
        long jX6 = x(context, android.R.color.system_neutral2_500);
        x(context, android.R.color.system_neutral2_600);
        long jX7 = x(context, android.R.color.system_neutral2_700);
        long jC6 = C(24.0f, x(context, android.R.color.system_neutral2_600));
        long jC7 = C(22.0f, x(context, android.R.color.system_neutral2_600));
        long jX8 = x(context, android.R.color.system_neutral2_800);
        long jC8 = C(17.0f, x(context, android.R.color.system_neutral2_600));
        long jC9 = C(12.0f, x(context, android.R.color.system_neutral2_600));
        long jX9 = x(context, android.R.color.system_neutral2_900);
        long jC10 = C(6.0f, x(context, android.R.color.system_neutral2_600));
        long jC11 = C(4.0f, x(context, android.R.color.system_neutral2_600));
        long jX10 = x(context, android.R.color.system_neutral2_1000);
        long jX11 = x(context, android.R.color.system_accent1_0);
        x(context, android.R.color.system_accent1_10);
        x(context, android.R.color.system_accent1_50);
        long jX12 = x(context, android.R.color.system_accent1_100);
        long jX13 = x(context, android.R.color.system_accent1_200);
        x(context, android.R.color.system_accent1_300);
        x(context, android.R.color.system_accent1_400);
        x(context, android.R.color.system_accent1_500);
        long jX14 = x(context, android.R.color.system_accent1_600);
        long jX15 = x(context, android.R.color.system_accent1_700);
        long jX16 = x(context, android.R.color.system_accent1_800);
        long jX17 = x(context, android.R.color.system_accent1_900);
        x(context, android.R.color.system_accent1_1000);
        long jX18 = x(context, android.R.color.system_accent2_0);
        x(context, android.R.color.system_accent2_10);
        x(context, android.R.color.system_accent2_50);
        long jX19 = x(context, android.R.color.system_accent2_100);
        long jX20 = x(context, android.R.color.system_accent2_200);
        x(context, android.R.color.system_accent2_300);
        x(context, android.R.color.system_accent2_400);
        x(context, android.R.color.system_accent2_500);
        long jX21 = x(context, android.R.color.system_accent2_600);
        long jX22 = x(context, android.R.color.system_accent2_700);
        long jX23 = x(context, android.R.color.system_accent2_800);
        long jX24 = x(context, android.R.color.system_accent2_900);
        x(context, android.R.color.system_accent2_1000);
        long jX25 = x(context, android.R.color.system_accent3_0);
        x(context, android.R.color.system_accent3_10);
        x(context, android.R.color.system_accent3_50);
        long jX26 = x(context, android.R.color.system_accent3_100);
        long jX27 = x(context, android.R.color.system_accent3_200);
        x(context, android.R.color.system_accent3_300);
        x(context, android.R.color.system_accent3_400);
        x(context, android.R.color.system_accent3_500);
        long jX28 = x(context, android.R.color.system_accent3_600);
        long jX29 = x(context, android.R.color.system_accent3_700);
        long jX30 = x(context, android.R.color.system_accent3_800);
        long jX31 = x(context, android.R.color.system_accent3_900);
        x(context, android.R.color.system_accent3_1000);
        return new x9(jX, jC, jC2, jX2, jC3, jC4, jX3, jC5, jX4, jX5, jX6, jX7, jC6, jC7, jX8, jC8, jC9, jX9, jC10, jC11, jX10, jX11, jX12, jX13, jX14, jX15, jX16, jX17, jX18, jX19, jX20, jX21, jX22, jX23, jX24, jX25, jX26, jX27, jX28, jX29, jX30, jX31);
    }

    public static v v(float f11) {
        return new v(f11, l3.t.f27132e, l3.t.f27130c, l3.t.f27131d, l3.t.f27129b, l3.t.f27128a);
    }

    public static final t1.b1 w(z3 z3Var, l3.f0 f0Var) {
        switch (a4.$EnumSwitchMapping$0[f0Var.ordinal()]) {
            case 1:
                z3Var.getClass();
                t1.b1 b1Var = z3.f19877b;
                b1Var.getClass();
                return b1Var;
            case 2:
                z3Var.getClass();
                t1.b1 b1Var2 = z3.f19878c;
                b1Var2.getClass();
                return b1Var2;
            case 3:
                z3Var.getClass();
                t1.b1 b1Var3 = z3.f19879d;
                b1Var3.getClass();
                return b1Var3;
            case 4:
                z3Var.getClass();
                t1.b1 b1Var4 = z3.f19880e;
                b1Var4.getClass();
                return b1Var4;
            case 5:
                z3Var.getClass();
                t1.b1 b1Var5 = z3.f19881f;
                b1Var5.getClass();
                return b1Var5;
            case 6:
                z3Var.getClass();
                t1.b1 b1Var6 = z3.f19882g;
                b1Var6.getClass();
                return b1Var6;
            default:
                e40.a.f();
                return null;
        }
    }

    public static long x(Context context, int i11) {
        return i4.g0.c(context.getResources().getColor(i11, context.getTheme()));
    }

    public static p0 y(m3.n nVar) {
        return (p0) ((m3.s) nVar).j(r0.f19375a);
    }

    public static u z(p0 p0Var) {
        u uVar = p0Var.Y;
        if (uVar != null) {
            return uVar;
        }
        l3.r rVar = l3.w.f27168a;
        u uVar2 = new u(r0.d(p0Var, rVar), r0.a(p0Var, r0.d(p0Var, rVar)), i4.g0.k(i4.v.b(l3.w.f27173f, r0.d(p0Var, l3.w.f27171d)), r0.d(p0Var, rVar)), i4.v.b(0.38f, r0.a(p0Var, r0.d(p0Var, rVar))));
        p0Var.Y = uVar2;
        return uVar2;
    }
}
