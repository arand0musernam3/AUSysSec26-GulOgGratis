package z2;

import android.os.Trace;
import b5.c0;
import b5.l2;
import i4.v;
import i4.y;
import j5.a0;
import j5.b0;
import j5.x;
import j5.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import m2.g0;
import m5.p0;
import m5.q0;
import m5.u0;
import y9.w;
import z4.m1;
import z4.t0;
import z4.u;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b4.s implements c0, b5.r, l2 {
    public Function1 A;
    public Map B;
    public d C;
    public n D;
    public o E;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m5.h f46890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u0 f46891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q5.h f46892q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function1 f46893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f46894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f46895t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f46896u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f46897v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f46898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Function1 f46899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f46900y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public y f46901z;

    public p(m5.h hVar, u0 u0Var, q5.h hVar2, Function1 function1, int i11, boolean z11, int i12, int i13, List list, Function1 function12, i iVar, y yVar, Function1 function13) {
        this.f46890o = hVar;
        this.f46891p = u0Var;
        this.f46892q = hVar2;
        this.f46893r = function1;
        this.f46894s = i11;
        this.f46895t = z11;
        this.f46896u = i12;
        this.f46897v = i13;
        this.f46898w = list;
        this.f46899x = function12;
        this.f46900y = iVar;
        this.f46901z = yVar;
        this.A = function13;
    }

    public final void L0(boolean z11, boolean z12, boolean z13, boolean z14) {
        if (z12 || z13 || z14) {
            M0().g(this.f46890o, this.f46891p, this.f46892q, this.f46894s, this.f46895t, this.f46896u, this.f46897v, this.f46898w);
        }
        if (isAttached()) {
            if (z12 || (z11 && this.D != null)) {
                b5.m.g(this).G();
            }
            if (z12 || z13 || z14) {
                b5.m.g(this).F();
                b5.o.h(this);
            }
            if (z11) {
                b5.o.h(this);
            }
        }
    }

    public final d M0() {
        if (this.C == null) {
            this.C = new d(this.f46890o, this.f46891p, this.f46892q, this.f46894s, this.f46895t, this.f46896u, this.f46897v, this.f46898w);
        }
        d dVar = this.C;
        dVar.getClass();
        return dVar;
    }

    public final d N0(z5.c cVar) {
        d dVar;
        o oVar = this.E;
        if (oVar != null && oVar.f46888c && (dVar = oVar.f46889d) != null) {
            dVar.d(cVar);
            return dVar;
        }
        d dVarM0 = M0();
        dVarM0.d(cVar);
        return dVarM0;
    }

    public final boolean O0(Function1 function1, Function1 function12, i iVar, Function1 function13) {
        boolean z11;
        if (this.f46893r != function1) {
            this.f46893r = function1;
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f46899x != function12) {
            this.f46899x = function12;
            z11 = true;
        }
        if (!Intrinsics.areEqual(this.f46900y, iVar)) {
            this.f46900y = iVar;
            z11 = true;
        }
        if (this.A == function13) {
            return z11;
        }
        this.A = function13;
        return true;
    }

    public final boolean P0(u0 u0Var, List list, int i11, int i12, boolean z11, q5.h hVar, int i13) {
        boolean z12 = !this.f46891p.c(u0Var);
        this.f46891p = u0Var;
        if (!Intrinsics.areEqual(this.f46898w, list)) {
            this.f46898w = list;
            z12 = true;
        }
        if (this.f46897v != i11) {
            this.f46897v = i11;
            z12 = true;
        }
        if (this.f46896u != i12) {
            this.f46896u = i12;
            z12 = true;
        }
        if (this.f46895t != z11) {
            this.f46895t = z11;
            z12 = true;
        }
        if (!Intrinsics.areEqual(this.f46892q, hVar)) {
            this.f46892q = hVar;
            z12 = true;
        }
        if (this.f46894s != i13) {
            this.f46894s = i13;
            z12 = true;
        }
        if (Intrinsics.areEqual((Object) null, (Object) null)) {
            return z12;
        }
        return true;
    }

    public final boolean Q0(m5.h hVar) {
        boolean zAreEqual = Intrinsics.areEqual(this.f46890o.f29538b, hVar.f29538b);
        boolean z11 = (zAreEqual && Intrinsics.areEqual(this.f46890o.f29537a, hVar.f29537a)) ? false : true;
        if (z11) {
            this.f46890o = hVar;
        }
        if (!zAreEqual) {
            this.E = null;
        }
        return z11;
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [z2.n] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // b5.l2
    public final void h0(b0 b0Var) {
        n nVar = this.D;
        ?? r02 = nVar;
        if (nVar == null) {
            final int i11 = 0;
            ?? r03 = new Function1(this) { // from class: z2.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f46885b;

                {
                    this.f46885b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    q0 q0Var;
                    boolean z11;
                    switch (i11) {
                        case 0:
                            List list = (List) obj;
                            p pVar = this.f46885b;
                            q0 q0Var2 = pVar.M0().f46819n;
                            if (q0Var2 != null) {
                                p0 p0Var = q0Var2.f29617a;
                                m5.h hVar = p0Var.f29603a;
                                u0 u0Var = pVar.f46891p;
                                y yVar = pVar.f46901z;
                                q0Var = new q0(new p0(hVar, u0.e(u0Var, yVar != null ? yVar.a() : v.f23315h, 0L, null, 0L, null, 0, 0L, 16777214), p0Var.f29605c, p0Var.f29606d, p0Var.f29607e, p0Var.f29608f, p0Var.f29609g, p0Var.f29610h, p0Var.f29611i, p0Var.f29612j), q0Var2.f29618b, q0Var2.f29619c);
                                list.add(q0Var);
                            } else {
                                q0Var = null;
                            }
                            return Boolean.valueOf(q0Var != null);
                        case 1:
                            m5.h hVar2 = (m5.h) obj;
                            p pVar2 = this.f46885b;
                            o oVar = pVar2.E;
                            if (oVar == null) {
                                o oVar2 = new o(pVar2.f46890o, hVar2);
                                d dVar = new d(hVar2, pVar2.f46891p, pVar2.f46892q, pVar2.f46894s, pVar2.f46895t, pVar2.f46896u, pVar2.f46897v, n0.f26529a);
                                dVar.d(pVar2.M0().f46816j);
                                oVar2.f46889d = dVar;
                                pVar2.E = oVar2;
                            } else if (!Intrinsics.areEqual(hVar2, oVar.f46887b)) {
                                oVar.f46887b = hVar2;
                                d dVar2 = oVar.f46889d;
                                if (dVar2 != null) {
                                    dVar2.g(hVar2, pVar2.f46891p, pVar2.f46892q, pVar2.f46894s, pVar2.f46895t, pVar2.f46896u, pVar2.f46897v, n0.f26529a);
                                }
                            }
                            b5.m.g(pVar2).G();
                            b5.m.g(pVar2).F();
                            b5.o.h(pVar2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            p pVar3 = this.f46885b;
                            o oVar3 = pVar3.E;
                            if (oVar3 == null) {
                                z11 = false;
                            } else {
                                Function1 function1 = pVar3.A;
                                if (function1 != null) {
                                    function1.invoke(oVar3);
                                }
                                o oVar4 = pVar3.E;
                                if (oVar4 != null) {
                                    oVar4.f46888c = zBooleanValue;
                                }
                                b5.m.g(pVar3).G();
                                b5.m.g(pVar3).F();
                                b5.o.h(pVar3);
                                z11 = true;
                            }
                            return Boolean.valueOf(z11);
                    }
                }
            };
            this.D = r03;
            r02 = r03;
        }
        m5.h hVar = this.f46890o;
        KProperty[] kPropertyArr = z.f24734a;
        b0Var.b(x.B, kotlin.collections.c0.c(hVar));
        o oVar = this.E;
        if (oVar != null) {
            m5.h hVar2 = oVar.f46887b;
            a0 a0Var = x.C;
            KProperty[] kPropertyArr2 = z.f24734a;
            KProperty kProperty = kPropertyArr2[16];
            b0Var.b(a0Var, hVar2);
            boolean z11 = oVar.f46888c;
            a0 a0Var2 = x.D;
            KProperty kProperty2 = kPropertyArr2[17];
            b0Var.b(a0Var2, Boolean.valueOf(z11));
        }
        final int i12 = 1;
        b0Var.b(j5.m.l, new j5.a(null, new Function1(this) { // from class: z2.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f46885b;

            {
                this.f46885b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                q0 q0Var;
                boolean z112;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        p pVar = this.f46885b;
                        q0 q0Var2 = pVar.M0().f46819n;
                        if (q0Var2 != null) {
                            p0 p0Var = q0Var2.f29617a;
                            m5.h hVar3 = p0Var.f29603a;
                            u0 u0Var = pVar.f46891p;
                            y yVar = pVar.f46901z;
                            q0Var = new q0(new p0(hVar3, u0.e(u0Var, yVar != null ? yVar.a() : v.f23315h, 0L, null, 0L, null, 0, 0L, 16777214), p0Var.f29605c, p0Var.f29606d, p0Var.f29607e, p0Var.f29608f, p0Var.f29609g, p0Var.f29610h, p0Var.f29611i, p0Var.f29612j), q0Var2.f29618b, q0Var2.f29619c);
                            list.add(q0Var);
                        } else {
                            q0Var = null;
                        }
                        return Boolean.valueOf(q0Var != null);
                    case 1:
                        m5.h hVar22 = (m5.h) obj;
                        p pVar2 = this.f46885b;
                        o oVar2 = pVar2.E;
                        if (oVar2 == null) {
                            o oVar22 = new o(pVar2.f46890o, hVar22);
                            d dVar = new d(hVar22, pVar2.f46891p, pVar2.f46892q, pVar2.f46894s, pVar2.f46895t, pVar2.f46896u, pVar2.f46897v, n0.f26529a);
                            dVar.d(pVar2.M0().f46816j);
                            oVar22.f46889d = dVar;
                            pVar2.E = oVar22;
                        } else if (!Intrinsics.areEqual(hVar22, oVar2.f46887b)) {
                            oVar2.f46887b = hVar22;
                            d dVar2 = oVar2.f46889d;
                            if (dVar2 != null) {
                                dVar2.g(hVar22, pVar2.f46891p, pVar2.f46892q, pVar2.f46894s, pVar2.f46895t, pVar2.f46896u, pVar2.f46897v, n0.f26529a);
                            }
                        }
                        b5.m.g(pVar2).G();
                        b5.m.g(pVar2).F();
                        b5.o.h(pVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        p pVar3 = this.f46885b;
                        o oVar3 = pVar3.E;
                        if (oVar3 == null) {
                            z112 = false;
                        } else {
                            Function1 function1 = pVar3.A;
                            if (function1 != null) {
                                function1.invoke(oVar3);
                            }
                            o oVar4 = pVar3.E;
                            if (oVar4 != null) {
                                oVar4.f46888c = zBooleanValue;
                            }
                            b5.m.g(pVar3).G();
                            b5.m.g(pVar3).F();
                            b5.o.h(pVar3);
                            z112 = true;
                        }
                        return Boolean.valueOf(z112);
                }
            }
        }));
        final int i13 = 2;
        b0Var.b(j5.m.f24668m, new j5.a(null, new Function1(this) { // from class: z2.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f46885b;

            {
                this.f46885b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                q0 q0Var;
                boolean z112;
                switch (i13) {
                    case 0:
                        List list = (List) obj;
                        p pVar = this.f46885b;
                        q0 q0Var2 = pVar.M0().f46819n;
                        if (q0Var2 != null) {
                            p0 p0Var = q0Var2.f29617a;
                            m5.h hVar3 = p0Var.f29603a;
                            u0 u0Var = pVar.f46891p;
                            y yVar = pVar.f46901z;
                            q0Var = new q0(new p0(hVar3, u0.e(u0Var, yVar != null ? yVar.a() : v.f23315h, 0L, null, 0L, null, 0, 0L, 16777214), p0Var.f29605c, p0Var.f29606d, p0Var.f29607e, p0Var.f29608f, p0Var.f29609g, p0Var.f29610h, p0Var.f29611i, p0Var.f29612j), q0Var2.f29618b, q0Var2.f29619c);
                            list.add(q0Var);
                        } else {
                            q0Var = null;
                        }
                        return Boolean.valueOf(q0Var != null);
                    case 1:
                        m5.h hVar22 = (m5.h) obj;
                        p pVar2 = this.f46885b;
                        o oVar2 = pVar2.E;
                        if (oVar2 == null) {
                            o oVar22 = new o(pVar2.f46890o, hVar22);
                            d dVar = new d(hVar22, pVar2.f46891p, pVar2.f46892q, pVar2.f46894s, pVar2.f46895t, pVar2.f46896u, pVar2.f46897v, n0.f26529a);
                            dVar.d(pVar2.M0().f46816j);
                            oVar22.f46889d = dVar;
                            pVar2.E = oVar22;
                        } else if (!Intrinsics.areEqual(hVar22, oVar2.f46887b)) {
                            oVar2.f46887b = hVar22;
                            d dVar2 = oVar2.f46889d;
                            if (dVar2 != null) {
                                dVar2.g(hVar22, pVar2.f46891p, pVar2.f46892q, pVar2.f46894s, pVar2.f46895t, pVar2.f46896u, pVar2.f46897v, n0.f26529a);
                            }
                        }
                        b5.m.g(pVar2).G();
                        b5.m.g(pVar2).F();
                        b5.o.h(pVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        p pVar3 = this.f46885b;
                        o oVar3 = pVar3.E;
                        if (oVar3 == null) {
                            z112 = false;
                        } else {
                            Function1 function1 = pVar3.A;
                            if (function1 != null) {
                                function1.invoke(oVar3);
                            }
                            o oVar4 = pVar3.E;
                            if (oVar4 != null) {
                                oVar4.f46888c = zBooleanValue;
                            }
                            b5.m.g(pVar3).G();
                            b5.m.g(pVar3).F();
                            b5.o.h(pVar3);
                            z112 = true;
                        }
                        return Boolean.valueOf(z112);
                }
            }
        }));
        b0Var.b(j5.m.f24669n, new j5.a(null, new y.a(this, 15)));
        z.a(b0Var, r02);
    }

    @Override // b5.c0
    public final int maxIntrinsicHeight(u uVar, z4.t tVar, int i11) {
        return N0(uVar).a(i11, uVar.getLayoutDirection());
    }

    @Override // b5.c0
    public final int maxIntrinsicWidth(u uVar, z4.t tVar, int i11) {
        return g0.r(N0(uVar).e(uVar.getLayoutDirection()).c());
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final v0 mo58measure3p2s80s(w0 w0Var, t0 t0Var, long j9) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            d dVarN0 = N0(w0Var);
            boolean zC = dVarN0.c(j9, w0Var.getLayoutDirection());
            q0 q0Var = dVarN0.f46819n;
            if (q0Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + dVarN0);
            }
            long j11 = q0Var.f29619c;
            q0Var.f29618b.f29623a.a();
            if (zC) {
                b5.m.e(this, 2).k1();
                Function1 function1 = this.f46893r;
                if (function1 != null) {
                    function1.invoke(q0Var);
                }
                i iVar = this.f46900y;
                if (iVar != null) {
                    iVar.a(q0Var);
                }
                Map linkedHashMap = this.B;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(z4.d.f47100a, Integer.valueOf(Math.round(q0Var.f29620d)));
                linkedHashMap.put(z4.d.f47101b, Integer.valueOf(Math.round(q0Var.f29621e)));
                this.B = linkedHashMap;
            }
            Function1 function12 = this.f46899x;
            if (function12 != null) {
                function12.invoke(q0Var.f29622f);
            }
            int i11 = (int) (j11 >> 32);
            int i12 = (int) (j11 & 4294967295L);
            m1 m1VarD = t0Var.D(w.r(i11, i11, i12, i12));
            Map map = this.B;
            map.getClass();
            v0 v0VarR = w0Var.r(i11, i12, map, new d2.k(m1VarD, 14));
            Trace.endSection();
            return v0VarR;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // b5.c0
    public final int minIntrinsicHeight(u uVar, z4.t tVar, int i11) {
        return N0(uVar).a(i11, uVar.getLayoutDirection());
    }

    @Override // b5.c0
    public final int minIntrinsicWidth(u uVar, z4.t tVar, int i11) {
        return g0.r(N0(uVar).e(uVar.getLayoutDirection()).b());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    @Override // b5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(b5.o0 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.p.n(b5.o0):void");
    }
}
