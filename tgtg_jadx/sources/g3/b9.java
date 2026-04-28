package g3;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b9 {
    public static final void a(final float f11, float f12, final int i11, final int i12, final long j9, long j11, b4.t tVar, m3.n nVar, final u3.d dVar, final u3.d dVar2, final u3.d dVar3, v1.y1 y1Var) {
        final float f13;
        final long j12;
        final b4.t tVar2;
        final v1.y1 y1Var2;
        long jE;
        int i13;
        b4.t tVar3;
        v1.y1 y1Var3;
        float f14;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(450849184);
        int i14 = i12 | (sVar.d(i11) ? 4 : 2) | 176 | (sVar.e(j9) ? NewHope.SENDB_BYTES : 1024) | 100671488;
        if (sVar.R(i14 & 1, (306783379 & i14) != 306783378)) {
            sVar.W();
            if ((i12 & 1) == 0 || sVar.z()) {
                v1.y1 y1VarQ = v1.n.q(sVar);
                p8 p8Var = p8.f19327a;
                jE = r0.e(l3.n0.f27062f, sVar);
                i13 = i14 & (-58241);
                float f15 = p8.f19328b;
                tVar3 = b4.q.f5711a;
                y1Var3 = y1VarQ;
                f14 = f15;
            } else {
                sVar.U();
                i13 = i14 & (-58241);
                f14 = f12;
                jE = j11;
                tVar3 = tVar;
                y1Var3 = y1Var;
            }
            sVar.r();
            c(f11, f14, i11, 918773760 | ((i13 >> 3) & 896) | (i13 & 126), j9, jE, tVar3, sVar, dVar, dVar2, dVar3, y1Var3);
            f13 = f14;
            j12 = jE;
            tVar2 = tVar3;
            y1Var2 = y1Var3;
        } else {
            sVar.U();
            f13 = f12;
            j12 = j11;
            tVar2 = tVar;
            y1Var2 = y1Var;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(f11, f13, i11, i12, j9, j12, tVar2, dVar, dVar2, dVar3, y1Var2) { // from class: g3.u8

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f19588a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b4.t f19589b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ v1.y1 f19590c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f19591d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f19592e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f19593f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ u3.d f19594g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ u3.d f19595h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ float f19596i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ u3.d f19597j;

                {
                    this.f19589b = tVar2;
                    this.f19590c = y1Var2;
                    this.f19591d = j9;
                    this.f19592e = j12;
                    this.f19594g = dVar;
                    this.f19595h = dVar2;
                    this.f19597j = dVar3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(819658753);
                    b9.a(this.f19593f, this.f19596i, this.f19588a, iF, this.f19591d, this.f19592e, this.f19589b, (m3.n) obj, this.f19594g, this.f19595h, this.f19597j, this.f19590c);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void b(b4.t tVar, long j9, long j11, i80.n nVar, Function2 function2, Function2 function22, m3.n nVar2, int i11) {
        b4.t tVar2;
        long j12;
        long j13;
        i80.n nVar3;
        Function2 function23;
        i80.n nVar4;
        long j14;
        long j15;
        b4.t tVar3;
        Function2 function24;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(-1012974221);
        int i12 = i11 | 222384;
        if (sVar.R(i12 & 1, (599187 & i12) != 599186)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                p8 p8Var = p8.f19327a;
                long jE = r0.e(l3.n0.f27060d, sVar);
                long jE2 = r0.e(l3.n0.f27062f, sVar);
                u3.d dVarE = u3.e.e(1338273762, sVar, new c60.a(23));
                u3.d dVar = s0.f19451i;
                nVar4 = dVarE;
                j14 = jE2;
                j15 = jE;
                tVar3 = b4.q.f5711a;
                function24 = dVar;
            } else {
                sVar.U();
                tVar3 = tVar;
                j15 = j9;
                j14 = j11;
                nVar4 = nVar;
                function24 = function2;
            }
            sVar.r();
            f(tVar3, j15, j14, nVar4, function24, function22, sVar, 224262);
            tVar2 = tVar3;
            j12 = j15;
            j13 = j14;
            nVar3 = nVar4;
            function23 = function24;
        } else {
            sVar.U();
            tVar2 = tVar;
            j12 = j9;
            j13 = j11;
            nVar3 = nVar;
            function23 = function2;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j7(tVar2, j12, j13, nVar3, function23, function22, i11);
        }
    }

    public static final void c(final float f11, final float f12, final int i11, final int i12, final long j9, final long j11, final b4.t tVar, m3.n nVar, final u3.d dVar, final u3.d dVar2, final u3.d dVar3, final v1.y1 y1Var) {
        int i13;
        float f13;
        v1.y1 y1Var2;
        final u3.d dVar4;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(414860860);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.f(tVar) ? 32 : 16;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.e(j9) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.e(j11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.c(f11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i12) == 0) {
            f13 = f12;
            i13 |= sVar.c(f13) ? 131072 : 65536;
        } else {
            f13 = f12;
        }
        if ((1572864 & i12) == 0) {
            y1Var2 = y1Var;
            i13 |= sVar.f(y1Var2) ? 1048576 : 524288;
        } else {
            y1Var2 = y1Var;
        }
        if ((i12 & 12582912) == 0) {
            i13 |= sVar.h(dVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i13 |= sVar.h(dVar2) ? 67108864 : 33554432;
        }
        if ((805306368 & i12) == 0) {
            dVar4 = dVar3;
            i13 |= sVar.h(dVar4) ? 536870912 : 268435456;
        } else {
            dVar4 = dVar3;
        }
        if (sVar.R(i13 & 1, (306783379 & i13) != 306783378)) {
            final v1.y1 y1Var3 = y1Var2;
            final float f14 = f13;
            q7.a(tVar, null, j9, j11, 0.0f, 0.0f, null, u3.e.e(1878374785, sVar, new Function2() { // from class: g3.v8
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
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b5.h hVar;
                    Object x8Var;
                    m3.n nVar2 = (m3.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    m3.s sVar2 = (m3.s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objM = sVar2.M();
                        m3.f fVar = m3.m.f29332a;
                        if (objM == fVar) {
                            objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                            sVar2.k0(objM);
                        }
                        v80.b0 b0Var = (v80.b0) objM;
                        l3.f0 f0Var = l3.f0.DefaultSpatial;
                        t1.b1 b1VarD = s0.D(f0Var, sVar2);
                        t1.b1 b1VarD2 = s0.D(f0Var, sVar2);
                        v1.y1 y1Var4 = y1Var3;
                        boolean zF = sVar2.f(y1Var4) | sVar2.f(b0Var);
                        Object objM2 = sVar2.M();
                        if (zF || objM2 == fVar) {
                            objM2 = new z5(y1Var4, b0Var, b1VarD);
                            sVar2.k0(objM2);
                        }
                        z5 z5Var = (z5) objM2;
                        Object objM3 = sVar2.M();
                        if (objM3 == fVar) {
                            objM3 = new y8(b1VarD2);
                            sVar2.k0(objM3);
                        }
                        y8 y8Var = (y8) objM3;
                        z4.u0 u0VarD = d2.p.d(b4.d.f5689g, false);
                        int iHashCode = Long.hashCode(sVar2.T);
                        u3.i iVarL = sVar2.l();
                        b4.q qVar = b4.q.f5711a;
                        b4.t tVarC = b4.a.c(qVar, sVar2);
                        b5.j.R.getClass();
                        b5.h hVar2 = b5.i.f5839b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar2);
                        } else {
                            sVar2.n0();
                        }
                        b5.g gVar = b5.i.f5843f;
                        m3.i.C(u0VarD, gVar, sVar2);
                        b5.g gVar2 = b5.i.f5842e;
                        m3.i.C(iVarL, gVar2, sVar2);
                        b5.g gVar3 = b5.i.f5844g;
                        if (sVar2.S || !Intrinsics.areEqual(sVar2.M(), Integer.valueOf(iHashCode))) {
                            e0.f.y(iHashCode, sVar2, iHashCode, gVar3);
                        }
                        b5.g gVar4 = b5.i.f5841d;
                        m3.i.C(tVarC, gVar4, sVar2);
                        dVar2.invoke(sVar2, 0);
                        List listH = kotlin.collections.d0.h(dVar4, u3.e.e(509386037, sVar2, new a3.u2(26, (i80.n) dVar, (Object) y8Var)));
                        b4.t tVarC2 = f4.g.c(k2.c.b(v1.n.r(d2.m2.u(d2.m2.d(qVar, 1.0f), b4.d.f5686d, 2), y1Var4, false)));
                        float f15 = f11;
                        boolean zC = sVar2.c(f15);
                        float f16 = f14;
                        boolean zC2 = zC | sVar2.c(f16);
                        int i14 = i11;
                        boolean zD = zC2 | sVar2.d(i14) | sVar2.h(z5Var);
                        Object objM4 = sVar2.M();
                        if (zD || objM4 == fVar) {
                            hVar = hVar2;
                            x8Var = new x8(f15, f16, y8Var, i14, z5Var);
                            sVar2.k0(x8Var);
                        } else {
                            x8Var = objM4;
                            hVar = hVar2;
                        }
                        z4.a1 a1Var = (z4.a1) x8Var;
                        u3.d dVarG = z4.c0.g(listH);
                        boolean zF2 = sVar2.f(a1Var);
                        Object objM5 = sVar2.M();
                        if (zF2 || objM5 == fVar) {
                            objM5 = new z4.b1(a1Var);
                            sVar2.k0(objM5);
                        }
                        z4.u0 u0Var = (z4.u0) objM5;
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        u3.i iVarL2 = sVar2.l();
                        b4.t tVarC3 = b4.a.c(tVarC2, sVar2);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar);
                        } else {
                            sVar2.n0();
                        }
                        m3.i.C(u0Var, gVar, sVar2);
                        m3.i.C(iVarL2, gVar2, sVar2);
                        if (sVar2.S || !Intrinsics.areEqual(sVar2.M(), Integer.valueOf(iHashCode2))) {
                            e0.f.y(iHashCode2, sVar2, iHashCode2, gVar3);
                        }
                        m3.i.C(tVarC3, gVar4, sVar2);
                        dVarG.invoke(sVar2, 0);
                        sVar2.q(true);
                        sVar2.q(true);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, ((i13 >> 3) & 14) | 12582912 | (i13 & 896) | (i13 & 7168), 114);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.r8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(i12 | 1);
                    b9.c(f11, f12, i11, iF, j9, j11, tVar, (m3.n) obj, dVar, dVar2, dVar3, y1Var);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void d(int i11, b4.t tVar, long j9, long j11, u3.d dVar, Function2 function2, u3.d dVar2, m3.n nVar, int i12) {
        b4.t tVar2;
        Function2 function22;
        Function2 function23;
        b4.t tVar3;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(563434725);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | 196656;
        if (sVar.R(i13 & 1, (599187 & i13) != 599186)) {
            sVar.W();
            if ((i12 & 1) == 0 || sVar.z()) {
                function23 = s0.f19452j;
                tVar3 = b4.q.f5711a;
            } else {
                sVar.U();
                tVar3 = tVar;
                function23 = function2;
            }
            sVar.r();
            f(tVar3, j9, j11, dVar, function23, dVar2, sVar, 224694);
            tVar2 = tVar3;
            function22 = function23;
        } else {
            sVar.U();
            tVar2 = tVar;
            function22 = function2;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.f0(i11, tVar2, j9, j11, dVar, function22, dVar2, i12);
        }
    }

    public static final void e(int i11, b4.t tVar, long j9, long j11, u3.d dVar, u3.d dVar2, u3.d dVar3, m3.n nVar, int i12) {
        long j12;
        int i13;
        long jE;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1445190381);
        int i14 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.f(tVar) ? 32 : 16) | 1024;
        if (sVar.R(i14 & 1, (599187 & i14) != 599186)) {
            sVar.W();
            if ((i12 & 1) == 0 || sVar.z()) {
                p8 p8Var = p8.f19327a;
                i13 = i14 & (-7169);
                jE = r0.e(l3.n0.f27062f, sVar);
            } else {
                sVar.U();
                i13 = i14 & (-7169);
                jE = j11;
            }
            sVar.r();
            g(tVar, j9, jE, dVar, dVar2, dVar3, sVar, (i13 >> 3) & 524286);
            j12 = jE;
        } else {
            sVar.U();
            j12 = j11;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new s8(i11, tVar, j9, j12, dVar, dVar2, dVar3, i12);
        }
    }

    public static final void f(b4.t tVar, long j9, long j11, i80.n nVar, Function2 function2, Function2 function22, m3.n nVar2, int i11) {
        b4.t tVar2;
        int i12;
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar2;
        sVar2.c0(1955286154);
        if ((i11 & 6) == 0) {
            tVar2 = tVar;
            i12 = (sVar2.f(tVar2) ? 4 : 2) | i11;
        } else {
            tVar2 = tVar;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.e(j9) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.e(j11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(nVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(function2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(function22) ? 131072 : 65536;
        }
        if (sVar2.R(i12 & 1, (74899 & i12) != 74898)) {
            int i13 = i12 << 3;
            sVar = sVar2;
            q7.a(k2.c.b(tVar2), null, j9, j11, 0.0f, 0.0f, null, u3.e.e(830280655, sVar2, new an.d(function22, function2, nVar, 15)), sVar, (i13 & 896) | 12582912 | (i13 & 7168), 114);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.f0(tVar2, j9, j11, nVar, function2, function22, i11);
        }
    }

    public static final void g(b4.t tVar, long j9, long j11, u3.d dVar, u3.d dVar2, u3.d dVar3, m3.n nVar, int i11) {
        b4.t tVar2;
        int i12;
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(148841506);
        if ((i11 & 6) == 0) {
            tVar2 = tVar;
            i12 = (sVar2.f(tVar2) ? 4 : 2) | i11;
        } else {
            tVar2 = tVar;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.e(j9) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.e(j11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(dVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(dVar2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(dVar3) ? 131072 : 65536;
        }
        if (sVar2.R(i12 & 1, (74899 & i12) != 74898)) {
            int i13 = i12 << 3;
            sVar = sVar2;
            q7.a(k2.c.b(tVar2), null, j9, j11, 0.0f, 0.0f, null, u3.e.e(-1815327065, sVar2, new t8(dVar3, dVar2, dVar, 0)), sVar, (i13 & 896) | 12582912 | (i13 & 7168), 114);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new s8(tVar2, j9, j11, dVar, dVar2, dVar3, i11);
        }
    }
}
