package s1;

import java.util.ListIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import t1.m1;
import t1.q1;
import t1.t1;
import t1.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final void a(q1 q1Var, Function1 function1, b4.t tVar, x0 x0Var, y0 y0Var, Function2 function2, i80.n nVar, m3.n nVar2, int i11) {
        int i12;
        i80.n nVar3;
        int i13;
        l1 l1Var;
        v1 v1Var;
        m3.f fVar;
        q1 q1Var2;
        boolean z11;
        m1 m1Var;
        m1 m1Var2;
        m1 m1Var3;
        boolean z12;
        m1 m1Var4;
        boolean z13;
        m1 m1Var5;
        m1 m1Var6;
        m1 m1Var7;
        m1 m1VarB;
        y0 y0Var2;
        x0 x0Var2;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(1912839215);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(q1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(tVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(x0Var) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(y0Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(function2) ? 131072 : 65536;
        }
        int i14 = i12 | 1572864;
        if ((12582912 & i11) == 0) {
            i14 |= sVar.h(nVar) ? 8388608 : 4194304;
        }
        if (sVar.R(i14 & 1, (4793491 & i14) != 4793490)) {
            m3.k1 k1Var = q1Var.f39540d;
            h2.s0 s0Var = q1Var.f39537a;
            if (((Boolean) function1.invoke(k1Var.getValue())).booleanValue() || ((Boolean) function1.invoke(s0Var.j())).booleanValue() || q1Var.h() || q1Var.d()) {
                sVar.a0(-232413539);
                int i15 = i14 & 14;
                int i16 = i15 | 48;
                int i17 = i16 & 14;
                int i18 = 6;
                boolean z14 = ((i17 ^ 6) > 4 && sVar.f(q1Var)) || (i16 & 6) == 4;
                Object objM = sVar.M();
                boolean z15 = z14;
                m3.f fVar2 = m3.m.f29332a;
                if (z15 || objM == fVar2) {
                    objM = s0Var.j();
                    sVar.k0(objM);
                }
                if (q1Var.h()) {
                    objM = s0Var.j();
                }
                sVar.a0(1844425648);
                h0 h0VarI = i(q1Var, function1, objM, sVar);
                sVar.q(false);
                Object value = q1Var.f39540d.getValue();
                sVar.a0(1844425648);
                h0 h0VarI2 = i(q1Var, function1, value, sVar);
                sVar.q(false);
                int i19 = i17 | 3072;
                rk.z zVar = t1.f39573a;
                int i21 = (i19 & 14) ^ 6;
                int i22 = i14;
                boolean z16 = (i21 > 4 && sVar.f(q1Var)) || (i19 & 6) == 4;
                Object objM2 = sVar.M();
                if (z16 || objM2 == fVar2) {
                    i13 = i19;
                    objM2 = new q1(new t1.k0(h0VarI), q1Var, r8.k.p(new StringBuilder(), q1Var.f39539c, " > EnterExitTransition"));
                    sVar.k0(objM2);
                } else {
                    i13 = i19;
                }
                q1 q1Var3 = (q1) objM2;
                boolean zF = ((i21 > 4 && sVar.f(q1Var)) || (i13 & 6) == 4) | sVar.f(q1Var3);
                Object objM3 = sVar.M();
                if (zF || objM3 == fVar2) {
                    objM3 = new ry.b(i18, q1Var, q1Var3);
                    sVar.k0(objM3);
                }
                m3.i.d(q1Var3, (Function1) objM3, sVar);
                if (q1Var.h()) {
                    q1Var3.l(h0VarI, h0VarI2);
                } else {
                    q1Var3.q(h0VarI2);
                    q1Var3.f39547k.setValue(Boolean.FALSE);
                }
                m3.b1 b1VarB = m3.i.B(function2, sVar);
                h2.s0 s0Var2 = q1Var3.f39537a;
                h2.s0 s0Var3 = q1Var3.f39537a;
                m3.k1 k1Var2 = q1Var3.f39540d;
                Object objInvoke = function2.invoke(s0Var2.j(), k1Var2.getValue());
                boolean zF2 = sVar.f(q1Var3) | sVar.f(b1VarB);
                Object objM4 = sVar.M();
                x70.c cVar = null;
                if (zF2 || objM4 == fVar2) {
                    objM4 = new nk.j(q1Var3, b1VarB, cVar, 17);
                    sVar.k0(objM4);
                }
                m3.b1 b1VarX = m3.i.x(objInvoke, (Function2) objM4, sVar);
                Object objJ = s0Var3.j();
                h0 h0Var = h0.PostExit;
                if (objJ == h0Var && k1Var2.getValue() == h0Var && ((Boolean) b1VarX.getValue()).booleanValue()) {
                    sVar.a0(-272333293);
                    sVar.q(false);
                    nVar3 = nVar;
                    z11 = false;
                } else {
                    sVar.a0(-231383533);
                    boolean z17 = i15 == 4;
                    Object objM5 = sVar.M();
                    if (z17 || objM5 == fVar2) {
                        objM5 = new a0();
                        sVar.k0(objM5);
                    }
                    a0 a0Var = (a0) objM5;
                    v1 v1Var2 = r0.f38669a;
                    v1 v1Var3 = t1.c.f39394p;
                    Object objM6 = sVar.M();
                    if (objM6 == fVar2) {
                        objM6 = o0.f38654a;
                        sVar.k0(objM6);
                    }
                    Function0 function0 = (Function0) objM6;
                    boolean zF3 = sVar.f(q1Var3);
                    Object objM7 = sVar.M();
                    if (zF3 || objM7 == fVar2) {
                        objM7 = m3.i.w(x0Var);
                        sVar.k0(objM7);
                    }
                    m3.b1 b1Var = (m3.b1) objM7;
                    if (s0Var3.j() == k1Var2.getValue() && s0Var3.j() == h0.Visible) {
                        if (q1Var3.h()) {
                            b1Var.setValue(x0Var);
                        } else {
                            b1Var.setValue(x0.f38729b);
                        }
                    } else if (k1Var2.getValue() == h0.Visible) {
                        b1Var.setValue(((x0) b1Var.getValue()).a(x0Var));
                    }
                    x0 x0Var3 = (x0) b1Var.getValue();
                    boolean zF4 = sVar.f(q1Var3);
                    Object objM8 = sVar.M();
                    if (zF4 || objM8 == fVar2) {
                        objM8 = m3.i.w(y0Var);
                        sVar.k0(objM8);
                    }
                    m3.b1 b1Var2 = (m3.b1) objM8;
                    if (s0Var3.j() == k1Var2.getValue() && s0Var3.j() == h0.Visible) {
                        if (q1Var3.h()) {
                            b1Var2.setValue(y0Var);
                        } else {
                            b1Var2.setValue(y0.f38731b);
                        }
                    } else if (k1Var2.getValue() != h0.Visible) {
                        b1Var2.setValue(((y0) b1Var2.getValue()).a(y0Var));
                    }
                    y0 y0Var3 = (y0) b1Var2.getValue();
                    l1 l1Var2 = x0Var3.f38730a;
                    l1 l1Var3 = y0Var3.f38733a;
                    j1 j1Var = l1Var2.f38642b;
                    c0 c0Var = l1Var2.f38643c;
                    boolean z18 = (j1Var == null && l1Var3.f38642b == null) ? false : true;
                    boolean z19 = (c0Var == null && l1Var3.f38643c == null) ? false : true;
                    if (z18) {
                        sVar.a0(133792645);
                        Object objM9 = sVar.M();
                        if (objM9 == fVar2) {
                            objM9 = "Built-in slide";
                            sVar.k0("Built-in slide");
                        }
                        l1Var = l1Var3;
                        fVar = fVar2;
                        q1Var2 = q1Var3;
                        z11 = false;
                        m1 m1VarB2 = t1.b(q1Var2, v1Var3, (String) objM9, sVar, MLKEMEngine.KyberPolyBytes, 0);
                        v1Var = v1Var3;
                        sVar.q(false);
                        m1Var = m1VarB2;
                    } else {
                        l1Var = l1Var3;
                        v1Var = v1Var3;
                        fVar = fVar2;
                        q1Var2 = q1Var3;
                        z11 = false;
                        sVar.a0(133898448);
                        sVar.q(false);
                        m1Var = null;
                    }
                    if (z19) {
                        sVar.a0(133990239);
                        v1 v1Var4 = t1.c.f39395q;
                        Object objM10 = sVar.M();
                        if (objM10 == fVar) {
                            objM10 = "Built-in shrink/expand";
                            sVar.k0("Built-in shrink/expand");
                        }
                        m1 m1VarB3 = t1.b(q1Var2, v1Var4, (String) objM10, sVar, MLKEMEngine.KyberPolyBytes, 0);
                        sVar.q(z11);
                        m1Var2 = m1VarB3;
                    } else {
                        sVar.a0(134101063);
                        sVar.q(z11);
                        m1Var2 = null;
                    }
                    if (z19) {
                        sVar.a0(134174689);
                        Object objM11 = sVar.M();
                        if (objM11 == fVar) {
                            objM11 = "Built-in InterruptionHandlingOffset";
                            sVar.k0("Built-in InterruptionHandlingOffset");
                        }
                        m1 m1VarB4 = t1.b(q1Var2, v1Var, (String) objM11, sVar, MLKEMEngine.KyberPolyBytes, 0);
                        sVar.q(z11);
                        m1Var3 = m1VarB4;
                    } else {
                        sVar.a0(134345095);
                        sVar.q(z11);
                        m1Var3 = null;
                    }
                    boolean z21 = !z19;
                    float[] fArr = j4.e.f24536a;
                    sVar.a0(135150476);
                    sVar.q(z11);
                    v1 v1Var5 = t1.c.f39389j;
                    boolean z22 = (l1Var2.f38641a == null && l1Var.f38641a == null) ? z11 : true;
                    boolean z23 = (l1Var2.f38644d == null && l1Var.f38644d == null) ? z11 : true;
                    if (z22) {
                        sVar.a0(-703879421);
                        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                        Object objM12 = sVar.M();
                        if (objM12 == fVar) {
                            objM12 = "Built-in alpha";
                            sVar.k0("Built-in alpha");
                        }
                        String str = (String) objM12;
                        z12 = z21;
                        m1 m1VarB5 = t1.b(q1Var2, v1Var5, str, sVar, MLKEMEngine.KyberPolyBytes, 0);
                        sVar.q(z11);
                        m1Var4 = m1VarB5;
                    } else {
                        z12 = z21;
                        sVar.a0(-703709976);
                        sVar.q(z11);
                        m1Var4 = null;
                    }
                    if (z23) {
                        sVar.a0(-703642333);
                        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
                        Object objM13 = sVar.M();
                        if (objM13 == fVar) {
                            objM13 = "Built-in scale";
                            sVar.k0("Built-in scale");
                        }
                        z13 = z23;
                        m1Var5 = m1Var4;
                        m1 m1VarB6 = t1.b(q1Var2, v1Var5, (String) objM13, sVar, MLKEMEngine.KyberPolyBytes, 0);
                        sVar.q(z11);
                        m1Var6 = m1VarB6;
                    } else {
                        z13 = z23;
                        m1Var5 = m1Var4;
                        sVar.a0(-703472888);
                        sVar.q(z11);
                        m1Var6 = null;
                    }
                    if (z13) {
                        sVar.a0(-703395232);
                        m1Var7 = m1Var6;
                        m1VarB = t1.b(q1Var2, r0.f38669a, "TransformOriginInterruptionHandling", sVar, MLKEMEngine.KyberPolyBytes, 0);
                        sVar.q(z11);
                    } else {
                        m1Var7 = m1Var6;
                        sVar.a0(-703222904);
                        sVar.q(z11);
                        m1VarB = null;
                    }
                    boolean zH = sVar.h(m1Var5) | sVar.f(x0Var3) | sVar.f(y0Var3) | sVar.h(m1Var7) | sVar.f(q1Var2) | sVar.h(m1VarB);
                    Object objM14 = sVar.M();
                    if (zH || objM14 == fVar) {
                        y0Var2 = y0Var3;
                        x0Var2 = x0Var3;
                        objM14 = new j0(m1Var5, m1Var7, q1Var2, x0Var2, y0Var2, m1VarB);
                        sVar.k0(objM14);
                    } else {
                        y0Var2 = y0Var3;
                        x0Var2 = x0Var3;
                    }
                    j0 j0Var = (j0) objM14;
                    boolean zG = sVar.g(z12) | sVar.f(function0);
                    Object objM15 = sVar.M();
                    if (zG || objM15 == fVar) {
                        objM15 = new p0(z12, function0);
                        sVar.k0(objM15);
                    }
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarThen = i4.g0.p(qVar, (Function1) objM15).then(new i0(q1Var2, m1Var2, m1Var3, m1Var, x0Var2, y0Var2, function0, j0Var)).then(qVar);
                    sVar.a0(-7432681);
                    sVar.q(z11);
                    b4.t tVarThen2 = tVar.then(tVarThen.then(qVar));
                    Object objM16 = sVar.M();
                    if (objM16 == fVar) {
                        objM16 = new t(a0Var);
                        sVar.k0(objM16);
                    }
                    t tVar2 = (t) objM16;
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarThen2, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(tVar2, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    nVar3 = nVar;
                    nVar3.invoke(a0Var, sVar, Integer.valueOf((i22 >> 18) & 112));
                    sVar.q(true);
                    sVar.q(z11);
                }
                sVar.q(z11);
            } else {
                sVar.a0(-272333293);
                sVar.q(false);
                nVar3 = nVar;
            }
        } else {
            nVar3 = nVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u(q1Var, function1, tVar, x0Var, y0Var, function2, nVar3, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(d2.z r13, boolean r14, b4.t r15, s1.x0 r16, s1.y0 r17, java.lang.String r18, u3.d r19, m3.n r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.y.b(d2.z, boolean, b4.t, s1.x0, s1.y0, java.lang.String, u3.d, m3.n, int, int):void");
    }

    public static final void c(t1.k0 k0Var, b4.t tVar, x0 x0Var, y0 y0Var, String str, u3.d dVar, m3.n nVar, int i11) {
        y0 y0Var2;
        String str2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1238803325);
        int i12 = i11 | (sVar.f(k0Var) ? 32 : 16) | (sVar.f(tVar) ? 256 : 128) | 221184;
        if (sVar.R(i12 & 1, (599185 & i12) != 599184)) {
            y0 y0VarA = r0.j(null, 15).a(r0.e(null, 3));
            q1 q1VarD = t1.d(k0Var, "AnimatedVisibility", sVar, ((i12 >> 3) & 14) | 48);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = c.f38535g;
                sVar.k0(objM);
            }
            f(q1VarD, (Function1) objM, tVar, x0Var, y0VarA, dVar, sVar, (i12 & 896) | 224304);
            y0Var2 = y0VarA;
            str2 = "AnimatedVisibility";
        } else {
            sVar.U();
            y0Var2 = y0Var;
            str2 = str;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dp.p(k0Var, tVar, x0Var, y0Var2, str2, dVar, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(boolean r20, b4.t r21, s1.x0 r22, s1.y0 r23, java.lang.String r24, i80.n r25, m3.n r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.y.d(boolean, b4.t, s1.x0, s1.y0, java.lang.String, i80.n, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(boolean r16, b4.t r17, s1.x0 r18, s1.y0 r19, java.lang.String r20, u3.d r21, m3.n r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.y.e(boolean, b4.t, s1.x0, s1.y0, java.lang.String, u3.d, m3.n, int, int):void");
    }

    public static final void f(q1 q1Var, Function1 function1, b4.t tVar, x0 x0Var, y0 y0Var, i80.n nVar, m3.n nVar2, int i11) {
        int i12;
        x0 x0Var2;
        y0 y0Var2;
        i80.n nVar3;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(1706321816);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(q1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(tVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            x0Var2 = x0Var;
            i12 |= sVar.f(x0Var2) ? NewHope.SENDB_BYTES : 1024;
        } else {
            x0Var2 = x0Var;
        }
        if ((i11 & 24576) == 0) {
            y0Var2 = y0Var;
            i12 |= sVar.f(y0Var2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        } else {
            y0Var2 = y0Var;
        }
        if ((i11 & 196608) == 0) {
            nVar3 = nVar;
            i12 |= sVar.h(nVar3) ? 131072 : 65536;
        } else {
            nVar3 = nVar;
        }
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            int i13 = i12 & 112;
            int i14 = i12 & 14;
            boolean z11 = (i13 == 32) | (i14 == 4);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new x(function1, q1Var);
                sVar.k0(objM);
            }
            b4.t tVarL = z4.c0.l(tVar, (i80.n) objM);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = h.f38606c;
                sVar.k0(objM2);
            }
            a(q1Var, function1, tVarL, x0Var2, y0Var2, (Function2) objM2, nVar3, sVar, 196608 | i14 | i13 | (i12 & 7168) | (57344 & i12) | ((i12 << 6) & 29360128));
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g(q1Var, function1, tVar, x0Var, y0Var, nVar, i11);
        }
    }

    public static final void g(Boolean bool, b4.t tVar, t1.x xVar, String str, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        b4.t tVar2;
        String str2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-513216493);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(bool) : sVar.h(bool) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 48;
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.h(xVar) ? 256 : 128;
        }
        int i14 = i13 | 3072;
        if ((i11 & 24576) == 0) {
            i14 |= sVar.h(dVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i14 & 1, (i14 & 9363) != 9362)) {
            b4.q qVar = b4.q.f5711a;
            h(t1.e(bool, "Crossfade", sVar, (i14 & 14) | ((i14 >> 6) & 112), 0), qVar, xVar, null, dVar, sVar, i14 & 58352);
            str2 = "Crossfade";
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
            str2 = str;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f0(bool, tVar2, xVar, str2, dVar, i11, 0);
        }
    }

    public static final void h(q1 q1Var, b4.t tVar, t1.x xVar, Function1 function1, u3.d dVar, m3.n nVar, int i11) {
        u3.d dVar2;
        Function1 function12;
        h2.s0 s0Var = q1Var.f39537a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1877370462);
        int i12 = (i11 & 6) == 0 ? (sVar.f(q1Var) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(tVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(xVar) ? 256 : 128;
        }
        int i13 = i12 | 3072;
        if ((i11 & 24576) == 0) {
            dVar2 = dVar;
            i13 |= sVar.h(dVar2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        } else {
            dVar2 = dVar;
        }
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = c.l;
                sVar.k0(objM);
            }
            Function1 function13 = (Function1) objM;
            Object objM2 = sVar.M();
            Object obj = objM2;
            if (objM2 == fVar) {
                z3.r rVar = new z3.r();
                rVar.add(s0Var.j());
                sVar.k0(rVar);
                obj = rVar;
            }
            z3.r rVar2 = (z3.r) obj;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                long[] jArr = q1.g1.f35760a;
                objM3 = new q1.t0();
                sVar.k0(objM3);
            }
            q1.t0 t0Var = (q1.t0) objM3;
            m3.k1 k1Var = q1Var.f39540d;
            if (Intrinsics.areEqual(s0Var.j(), k1Var.getValue())) {
                sVar.a0(321145192);
                if (rVar2.size() == 1 && Intrinsics.areEqual(rVar2.get(0), k1Var.getValue())) {
                    sVar.a0(316295552);
                } else {
                    sVar.a0(321279546);
                    boolean z11 = (i13 & 14) == 4;
                    Object objM4 = sVar.M();
                    if (z11 || objM4 == fVar) {
                        objM4 = new q1.h1(q1Var, 4);
                        sVar.k0(objM4);
                    }
                    kotlin.collections.i0.v(rVar2, (Function1) objM4);
                    t0Var.g();
                }
                sVar.q(false);
            } else {
                sVar.a0(316295552);
            }
            sVar.q(false);
            if (t0Var.a(k1Var.getValue())) {
                sVar.a0(316295552);
            } else {
                sVar.a0(321536443);
                ListIterator listIterator = rVar2.listIterator();
                int i14 = 0;
                while (true) {
                    v70.b bVar = (v70.b) listIterator;
                    if (!bVar.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (Intrinsics.areEqual(function13.invoke(bVar.next()), function13.invoke(k1Var.getValue()))) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 == -1) {
                    rVar2.add(k1Var.getValue());
                } else {
                    rVar2.set(i14, k1Var.getValue());
                }
                t0Var.g();
                int size = rVar2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj2 = rVar2.get(i15);
                    t0Var.m(obj2, u3.e.e(-934471669, sVar, new dp.n(1, q1Var, xVar, obj2, dVar2)));
                    i15++;
                    dVar2 = dVar;
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
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            sVar.a0(-1312707512);
            int size2 = rVar2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                Object obj3 = rVar2.get(i16);
                sVar.Y(1171574969, function13.invoke(obj3));
                Function2 function2 = (Function2) t0Var.d(obj3);
                if (function2 == null) {
                    sVar.a0(1959122128);
                } else {
                    sVar.a0(1171576145);
                    function2.invoke(sVar, 0);
                }
                sVar.q(false);
                sVar.q(false);
            }
            sVar.q(false);
            sVar.q(true);
            function12 = function13;
        } else {
            sVar.U();
            function12 = function1;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f0(q1Var, tVar, xVar, function12, dVar, i11, 1);
        }
    }

    public static final h0 i(q1 q1Var, Function1 function1, Object obj, m3.n nVar) {
        h0 h0Var;
        m3.s sVar = (m3.s) nVar;
        sVar.Y(-422486745, q1Var);
        boolean zH = q1Var.h();
        h2.s0 s0Var = q1Var.f39537a;
        if (zH) {
            sVar.a0(-212166497);
            sVar.q(false);
            h0Var = ((Boolean) function1.invoke(obj)).booleanValue() ? h0.Visible : ((Boolean) function1.invoke(s0Var.j())).booleanValue() ? h0.PostExit : h0.PreEnter;
        } else {
            sVar.a0(-211892364);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            if (((Boolean) function1.invoke(s0Var.j())).booleanValue()) {
                b1Var.setValue(Boolean.TRUE);
            }
            h0Var = ((Boolean) function1.invoke(obj)).booleanValue() ? h0.Visible : ((Boolean) b1Var.getValue()).booleanValue() ? h0.PostExit : h0.PreEnter;
            sVar.q(false);
        }
        sVar.q(false);
        return h0Var;
    }
}
