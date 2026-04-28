package w2;

import android.view.KeyEvent;
import android.view.autofill.AutofillValue;
import b5.i2;
import b5.l2;
import b5.y1;
import c5.f3;
import c5.q2;
import c5.x1;
import c5.x3;
import c5.y2;
import c5.z1;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends b5.n implements b5.r, y2, l2, b5.s, i2, u4.e, b5.k, a5.c, y1, b5.b0, g4.u {
    public b2.h A;
    public final e4.l B;
    public x3 C;
    public b2 D;
    public final t5.a E;
    public final z0 F;
    public b2 G;
    public final y0 H;
    public final m3.k1 I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s1 f42878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o1 f42879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public x2.w f42880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f42881t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m2.d1 f42882u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f42883v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b2.l f42884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y80.e1 f42885x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v1.p0 f42886y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final w4.m0 f42887z;

    public e1(s1 s1Var, o1 o1Var, x2.w wVar, boolean z11, m2.d1 d1Var, boolean z12, b2.l lVar, y80.e1 e1Var) {
        this.f42878q = s1Var;
        this.f42879r = o1Var;
        this.f42880s = wVar;
        this.f42881t = z11;
        this.f42882u = d1Var;
        this.f42883v = z12;
        this.f42884w = lVar;
        this.f42885x = e1Var;
        wVar.l = new y0(this, 5);
        this.f42886y = new v1.p0(lVar, new z0(this, 0), 2);
        a3.i1 i1Var = new a3.i1(this, 8);
        w4.n nVar = w4.h0.f43125a;
        w4.m0 m0Var = new w4.m0(null, null, i1Var);
        L0(m0Var);
        this.f42887z = m0Var;
        y0 y0Var = new y0(this, 7);
        pm.m mVar = new pm.m(this, 23);
        int i11 = 11;
        e4.i iVar = new e4.i(new b4.x(i11, new sg.c(y0Var, 22), new f1(new z0(this, 1), mVar, new z0(this, 2), new z0(this, 3), new z0(this, 4), new z0(this, 5))), 1);
        L0(iVar);
        this.B = iVar;
        this.E = new t5.a(13);
        this.F = new z0(this, 6);
        this.H = new y0(this, 6);
        this.I = m3.i.w(Boolean.FALSE);
    }

    @Override // b5.i2
    public final void F() {
        this.f42887z.F();
    }

    @Override // b5.l2
    public final boolean F0() {
        return true;
    }

    public final boolean O0(int i11) {
        if (i11 == 6) {
            ((g4.p) ((g4.l) b5.o.e(this, x1.f7417i))).i(1, true);
            return true;
        }
        if (i11 == 5) {
            ((g4.p) ((g4.l) b5.o.e(this, x1.f7417i))).i(2, true);
            return true;
        }
        if (i11 != 7) {
            return false;
        }
        ((z1) S0()).a();
        return true;
    }

    public final void P0() {
        b2 b2Var = this.G;
        if (b2Var != null) {
            b2Var.a(null);
        }
        this.G = null;
        y80.e1 e1Var = this.f42885x;
        if (e1Var != null) {
            e1Var.h();
        }
    }

    public final void Q0() {
        b2.h hVar = this.A;
        if (hVar != null) {
            this.f42884w.c(new b2.i(hVar));
            this.A = null;
        }
    }

    public final boolean R0() {
        x3 x3Var;
        return ((g4.g0) this.f42886y.f41820v).Q0().c() && (x3Var = this.C) != null && ((q2) x3Var).b();
    }

    public final f3 S0() {
        f3 f3Var = (f3) b5.o.e(this, x1.f7423p);
        if (f3Var != null) {
            return f3Var;
        }
        h2.b("No software keyboard controller");
        return null;
    }

    public final void T0(boolean z11) {
        if (!z11) {
            Boolean bool = this.f42882u.f28809e;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        x1.a.a(this);
        this.G = v80.f0.B(getCoroutineScope(), null, null, new b1(this, null, 5), 3);
    }

    @Override // u4.e
    public final boolean e(KeyEvent keyEvent) {
        s1 s1Var = this.f42878q;
        x2.w wVar = this.f42880s;
        S0();
        this.E.getClass();
        if (m5.t0.d(s1Var.d().f41929d) || keyEvent.getKeyCode() != 4 || u4.c.c(keyEvent) != 1) {
            return false;
        }
        s1 s1Var2 = wVar.f43781a;
        if (!m5.t0.d(s1Var2.d().f41929d)) {
            v2.h hVar = s1Var2.f43043a;
            y2.c cVar = y2.c.MergeIfPossible;
            hVar.f41936b.a().m();
            v2.a aVar = hVar.f41936b;
            int i11 = (int) (aVar.f41922d & 4294967295L);
            v2.k.g(aVar, i11, i11);
            v2.h.a(hVar, true, cVar);
        }
        wVar.v(false);
        wVar.w(x2.b0.None);
        return true;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        v2.b bVarB = this.f42878q.f43043a.b();
        long j9 = bVarB.f41929d;
        m5.h hVar = new m5.h(this.f42878q.f43043a.b().f41928c.toString());
        KProperty[] kPropertyArr = j5.z.f24734a;
        j5.a0 a0Var = j5.x.E;
        KProperty[] kPropertyArr2 = j5.z.f24734a;
        KProperty kProperty = kPropertyArr2[18];
        b0Var.b(a0Var, hVar);
        m5.h hVar2 = new m5.h(bVarB.f41928c.toString());
        j5.a0 a0Var2 = j5.x.F;
        KProperty kProperty2 = kPropertyArr2[19];
        b0Var.b(a0Var2, hVar2);
        j5.a0 a0Var3 = j5.x.G;
        KProperty kProperty3 = kPropertyArr2[20];
        b0Var.b(a0Var3, new m5.t0(j9));
        if (!this.f42881t) {
            b0Var.b(j5.x.f24715i, Unit.f26487a);
        }
        final boolean z11 = this.f42881t;
        j5.a0 a0Var4 = j5.x.N;
        KProperty kProperty4 = kPropertyArr2[26];
        b0Var.b(a0Var4, Boolean.valueOf(z11));
        j5.z.g(b0Var, c4.m.f7039a);
        j5.z.j(b0Var, new c4.g(AutofillValue.forText(bVarB)));
        final int i11 = 0;
        j5.z.d(b0Var, new Function1() { // from class: w2.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z12;
                boolean z13;
                switch (i11) {
                    case 0:
                        c4.g gVar = (c4.g) obj;
                        if (z11) {
                            AutofillValue autofillValue = gVar.f7036a;
                            x70.c cVar = null;
                            CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                            e1 e1Var = this;
                            if (textValue != null) {
                                e1Var.f42878q.g(textValue);
                            }
                            e1Var.I.setValue(Boolean.TRUE);
                            v80.f0.B(e1Var.getCoroutineScope(), null, null, new b1(e1Var, cVar, 3), 3);
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        return Boolean.valueOf(z12);
                    case 1:
                        m5.h hVar3 = (m5.h) obj;
                        if (z11) {
                            this.f42878q.g(hVar3);
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        return Boolean.valueOf(z13);
                    default:
                        m5.h hVar4 = (m5.h) obj;
                        boolean z14 = false;
                        if (z11) {
                            s1.h(this.f42878q, hVar4, null, false, 12);
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                }
            }
        });
        int i12 = this.f42882u.f28807c;
        int i13 = 8;
        int i14 = 6;
        int i15 = 7;
        if (i12 == 6) {
            c4.o.f7045a.getClass();
            j5.z.i(b0Var, c4.n.f7043c);
        } else if (i12 == 7 || i12 == 8) {
            c4.o.f7045a.getClass();
            j5.z.i(b0Var, c4.n.f7042b);
        } else if (i12 == 4) {
            c4.o.f7045a.getClass();
            j5.z.i(b0Var, c4.n.f7044d);
        }
        j5.z.a(b0Var, new z0(this, 7));
        final int i16 = 2;
        final int i17 = 1;
        if (z11) {
            b0Var.b(j5.m.f24667k, new j5.a(null, new Function1() { // from class: w2.a1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean z12;
                    boolean z13;
                    switch (i17) {
                        case 0:
                            c4.g gVar = (c4.g) obj;
                            if (z11) {
                                AutofillValue autofillValue = gVar.f7036a;
                                x70.c cVar = null;
                                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                                e1 e1Var = this;
                                if (textValue != null) {
                                    e1Var.f42878q.g(textValue);
                                }
                                e1Var.I.setValue(Boolean.TRUE);
                                v80.f0.B(e1Var.getCoroutineScope(), null, null, new b1(e1Var, cVar, 3), 3);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            return Boolean.valueOf(z12);
                        case 1:
                            m5.h hVar3 = (m5.h) obj;
                            if (z11) {
                                this.f42878q.g(hVar3);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            return Boolean.valueOf(z13);
                        default:
                            m5.h hVar4 = (m5.h) obj;
                            boolean z14 = false;
                            if (z11) {
                                s1.h(this.f42878q, hVar4, null, false, 12);
                                z14 = true;
                            }
                            return Boolean.valueOf(z14);
                    }
                }
            }));
            b0Var.b(j5.m.f24670o, new j5.a(null, new Function1() { // from class: w2.a1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean z12;
                    boolean z13;
                    switch (i16) {
                        case 0:
                            c4.g gVar = (c4.g) obj;
                            if (z11) {
                                AutofillValue autofillValue = gVar.f7036a;
                                x70.c cVar = null;
                                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                                e1 e1Var = this;
                                if (textValue != null) {
                                    e1Var.f42878q.g(textValue);
                                }
                                e1Var.I.setValue(Boolean.TRUE);
                                v80.f0.B(e1Var.getCoroutineScope(), null, null, new b1(e1Var, cVar, 3), 3);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            return Boolean.valueOf(z12);
                        case 1:
                            m5.h hVar3 = (m5.h) obj;
                            if (z11) {
                                this.f42878q.g(hVar3);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            return Boolean.valueOf(z13);
                        default:
                            m5.h hVar4 = (m5.h) obj;
                            boolean z14 = false;
                            if (z11) {
                                s1.h(this.f42878q, hVar4, null, false, 12);
                                z14 = true;
                            }
                            return Boolean.valueOf(z14);
                    }
                }
            }));
        }
        b0Var.b(j5.m.f24666j, new j5.a(null, new tq.c(this, i14)));
        int iA = this.f42882u.a();
        j5.z.e(b0Var, iA, new a3.l0(this, iA, i15));
        j5.z.c(b0Var, new y0(this, 9));
        j5.z.f(b0Var, null, new y0(this, 10));
        if (!m5.t0.d(j9)) {
            b0Var.b(j5.m.f24672q, new j5.a(null, new y0(this, i17)));
            if (this.f42881t) {
                b0Var.b(j5.m.f24673r, new j5.a(null, new y0(this, i16)));
            }
        }
        if (z11) {
            b0Var.b(j5.m.f24674s, new j5.a(null, new y0(this, i13)));
        }
        if (this.f42881t) {
            this.f42886y.h0(b0Var);
        }
    }

    @Override // b5.b0
    public final void k(long j9) {
        ((e4.i) this.B).f15745r = j9;
    }

    @Override // b5.y1
    public final void l0() {
        b5.o.m(this, new y0(this, 3));
    }

    @Override // b5.r
    public final void n(b5.o0 o0Var) {
        o0Var.b();
        if (((Boolean) this.I.getValue()).booleanValue()) {
            i4.r x0Var = (i4.r) b5.o.e(this, m2.e.f28812a);
            long j9 = ((i4.v) b5.o.e(this, m2.e.f28813b)).f23317a;
            if (!i4.v.c(j9, i4.g0.c(1308617531))) {
                x0Var = new i4.x0(j9);
            }
            k4.d.A0(o0Var, x0Var, 0L, 0L, 0.0f, null, 0, 126);
        }
    }

    @Override // b4.s
    public final void onAttach() {
        b5.o.m(this, new y0(this, 3));
        this.f42880s.f43792m = this.H;
        if (this.f42881t) {
            L0(this.f42886y);
        }
    }

    @Override // b4.s
    public final void onDetach() {
        P0();
        this.f42880s.f43792m = null;
    }

    @Override // b5.i2
    public final void p0(w4.n nVar, w4.o oVar, long j9) {
        this.f42887z.p0(nVar, oVar, j9);
    }

    @Override // b5.b0
    public final void u(z4.z zVar) {
        this.B.getClass();
    }

    @Override // b5.s
    public final void v(z4.z zVar) {
        this.f42879r.f43011e.setValue(zVar);
        if (this.f42881t) {
            this.f42886y.v(zVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026d  */
    @Override // u4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(android.view.KeyEvent r23) {
        /*
            Method dump skipped, instruction units count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.e1.w(android.view.KeyEvent):boolean");
    }

    @Override // g4.u
    public final void x(g4.r rVar) {
        z4.z zVarB;
        x2.w wVar = this.f42880s;
        o1 o1Var = wVar.f43782b;
        m5.q0 q0VarG = o1Var.f43008b.g();
        h4.c cVarD = h4.c.f21379e;
        if (q0VarG != null) {
            if (wVar.f43784d) {
                v2.b bVarD = wVar.f43781a.d();
                if (m5.t0.d(bVarD.f41929d)) {
                    cVarD = wVar.c(q0VarG, bVarD);
                } else {
                    long j9 = bVarD.f41929d;
                    if (!m5.t0.d(j9)) {
                        int i11 = (int) (j9 >> 32);
                        m5.r rVar2 = q0VarG.f29618b;
                        int iD = rVar2.d(i11);
                        int i12 = (int) (4294967295L & j9);
                        int iD2 = rVar2.d(i12);
                        if (iD == iD2) {
                            float fE = q0VarG.e(i11, true);
                            float fE2 = q0VarG.e(i12, true);
                            cVarD = new h4.c(Math.min(fE, fE2), rVar2.f(iD), Math.max(fE, fE2), rVar2.b(iD2));
                        } else {
                            cVarD = q0VarG.k(m5.t0.g(j9), m5.t0.f(j9)).d();
                        }
                    }
                }
                z4.z zVarD = o1Var.d();
                if (zVarD != null) {
                    if (!zVarD.n()) {
                        zVarD = null;
                    }
                    if (zVarD != null && (zVarB = o1Var.b()) != null) {
                        z4.z zVar = zVarB.n() ? zVarB : null;
                        if (zVar != null) {
                            cVarD = cVarD.k(zVar.v(zVarD, false).f());
                        }
                    }
                }
            } else {
                cVarD = g4.q.f19970a;
            }
        }
        rVar.b(cVarD);
    }
}
