package tp;

import ao.e1;
import b4.q;
import b4.t;
import b5.j;
import bm.l;
import com.app.tgtg.R;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.w;
import d2.y;
import f2.c0;
import f2.e0;
import g3.r9;
import g3.v1;
import g3.w2;
import i4.g0;
import i4.r0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lv.v;
import m2.d1;
import m3.c3;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import t1.h1;
import w.a0;
import x5.k;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f40374a = new u3.d(new a(0), false, 703109170);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f40375b = new u3.d(new a(1), false, -192485139);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f40376c = new u3.d(new a(2), false, 98666198);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.d f40377d = new u3.d(new s60.c(25, (byte) 0), false, -1383615684);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3.d f40378e = new u3.d(new s60.c(26, (byte) 0), false, -660325251);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3.d f40379f = new u3.d(new a(3), false, -942360539);

    public static final void a(final List list, final Function1 function1, final List list2, final String str, final List list3, final List list4, final op.c cVar, final boolean z11, final Function1 function12, final Function1 function13, final Function0 function0, n nVar, final int i11) {
        boolean z12;
        boolean z13;
        boolean z14;
        function1.getClass();
        list2.getClass();
        str.getClass();
        list3.getClass();
        list4.getClass();
        function12.getClass();
        function13.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(1515927740);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.h(list2) ? 256 : 128) | (sVar.f(str) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(list3) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(list4) ? 131072 : 65536) | (sVar.f(cVar) ? 1048576 : 524288) | (sVar.g(z11) ? 8388608 : 4194304) | (sVar.h(function12) ? 67108864 : 33554432) | (sVar.h(function13) ? 536870912 : 268435456);
        char c3 = sVar.h(function0) ? (char) 4 : (char) 2;
        if (sVar.R(i12 & 1, ((i12 & 306783379) == 306783378 && (c3 & 3) == 2) ? false : true)) {
            c0 c0VarA = e0.a(0, 0, 0, 3, sVar);
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            boolean z15 = (i12 & 234881024) == 67108864;
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (z15 || objM == fVar) {
                objM = new h1(function12, 1);
                sVar.k0(objM);
            }
            int i13 = i12 >> 9;
            e(i13 & 14, null, str, (Function1) objM, sVar);
            if (str.length() > 0) {
                sVar.a0(-1243766794);
                boolean z16 = (i12 & 112) == 32;
                Object objM2 = sVar.M();
                if (z16 || objM2 == fVar) {
                    objM2 = new h1(function1, 2);
                    sVar.k0(objM2);
                }
                Function1 function14 = (Function1) objM2;
                boolean z17 = (i12 & 1879048192) == 536870912;
                Object objM3 = sVar.M();
                if (z17 || objM3 == fVar) {
                    objM3 = new h1(function13, 3);
                    sVar.k0(objM3);
                }
                Function1 function15 = (Function1) objM3;
                boolean z18 = (c3 & 14) == 4;
                Object objM4 = sVar.M();
                if (z18 || objM4 == fVar) {
                    objM4 = new rr.a(18, function0);
                    sVar.k0(objM4);
                }
                int i14 = ((i12 >> 6) & 14) | (i13 & 112);
                int i15 = i12 >> 12;
                int i16 = i14 | (i15 & 896) | (i15 & 7168);
                z14 = true;
                f(list2, list3, cVar, z11, function14, function15, (Function0) objM4, sVar, i16);
                sVar.q(false);
            } else {
                sVar.a0(-1243167502);
                t tVarD2 = m2.d(qVar, 1.0f);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                t tVarJ = v1.n.j(b3.i.e(1.0f, tVarD2, true), lv.s.J, g0.f23254b);
                boolean zH = sVar.h(list4) | sVar.h(list3) | ((i12 & 29360128) == 8388608) | ((i12 & 1879048192) == 536870912) | sVar.h(list) | ((i12 & 112) == 32);
                Object objM5 = sVar.M();
                if (zH || objM5 == fVar) {
                    z12 = true;
                    z13 = false;
                    v1 v1Var = new v1(list4, list, list3, z11, function13, function1);
                    sVar.k0(v1Var);
                    objM5 = v1Var;
                } else {
                    z12 = true;
                    z13 = false;
                }
                z14 = z12;
                ox.h.c(tVarJ, c0VarA, null, null, null, null, false, null, (Function1) objM5, sVar, 0, 508);
                sVar = sVar;
                sVar.q(z13);
            }
            sVar.q(z14);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(list, function1, list2, str, list3, list4, cVar, z11, function12, function13, function0, i11) { // from class: tp.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f40380a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Function1 f40381b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f40382c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f40383d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f40384e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ List f40385f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ op.c f40386g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f40387h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function1 f40388i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Function1 f40389j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ Function0 f40390k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    b.a(this.f40380a, this.f40381b, this.f40382c, this.f40383d, this.f40384e, this.f40385f, this.f40386g, this.f40387h, this.f40388i, this.f40389j, this.f40390k, (n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r13v4, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final op.l r38, java.lang.String r39, final boolean r40, boolean r41, final boolean r42, final kotlin.jvm.functions.Function0 r43, m3.n r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tp.b.b(op.l, java.lang.String, boolean, boolean, boolean, kotlin.jvm.functions.Function0, m3.n, int, int):void");
    }

    public static final void c(op.c cVar, boolean z11, Function1 function1, n nVar, int i11) {
        cVar.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(1067755625);
        int i12 = i11 | (sVar.f(cVar) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            long j9 = lv.s.J;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarT = m2.t(m2.d(v1.n.j(qVar, j9, r0Var), 1.0f), 3);
            float f11 = lv.t.f28252f;
            t tVarB = d2.c.B(tVarT, 0.0f, f11, 1);
            boolean z12 = ((i12 & 14) == 4) | ((i12 & 896) == 256);
            Object objM = sVar.M();
            int i13 = 24;
            if (z12 || objM == m.f29332a) {
                objM = new qw.b(i13, function1, cVar);
                sVar.k0(objM);
            }
            t tVarC = androidx.compose.foundation.b.c(tVarB, false, null, null, (Function0) objM, 15);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC2 = b4.a.c(tVarC, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC2, gVar4, sVar);
            t tVarK = v1.n.k(m2.m(qVar, 24), 2, mv.r0.g(cVar.f32900e), l2.g.b(lv.t.f28249c));
            u0 u0VarD = p.d(b4.d.f5687e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC3 = b4.a.c(tVarK, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            String str = cVar.f32899d;
            m5.u0 u0Var = v.f28277q;
            long j11 = lv.s.C;
            r9.d(str, null, j11, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            sVar.q(true);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(z11 ? cVar.f32898c : cVar.f32897b, d2.c.B(new n1(1.0f, true), f11, 0.0f, 2), j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            g3.i2.a(x0.z(R.drawable.system_icon_chevron_right_neutral_60, sVar, 0), null, null, 0L, sVar, 56, 12);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(cVar, z11, function1, i11, 15);
        }
    }

    public static final void d(List list, op.c cVar, List list2, boolean z11, Function1 function1, n nVar, int i11) {
        list2.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1085933255);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.f(cVar) ? 32 : 16) | (sVar.h(list2) ? 256 : 128) | (sVar.g(z11) ? 2048 : 1024) | (sVar.h(function1) ? 16384 : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            c0 c0VarA = e0.a(0, 0, 0, 3, sVar);
            t tVarJ = v1.n.j(m2.d(q.f5711a, 1.0f), lv.s.J, g0.f23254b);
            boolean zH = ((i12 & 112) == 32) | sVar.h(list) | sVar.h(list2) | ((i12 & 7168) == 2048) | ((i12 & 57344) == 16384);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                w2 w2Var = new w2(list, cVar, list2, z11, function1, 5);
                sVar.k0(w2Var);
                objM = w2Var;
            }
            ox.h.c(tVarJ, c0VarA, null, null, null, null, false, null, (Function1) objM, sVar, 6, 508);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.d(list, cVar, list2, z11, function1, i11, 12);
        }
    }

    public static final void e(int i11, t tVar, String str, Function1 function1, n nVar) {
        int i12;
        t tVar2;
        u3.d dVarE;
        str.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-87211003);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        int i13 = i12 | MLKEMEngine.KyberPolyBytes;
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            long j9 = lv.s.J;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarJ = v1.n.j(qVar, j9, r0Var);
            m5.u0 u0VarA = m5.u0.a(v.f28274n, lv.s.C, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            d1 d1Var = new d1(0, 7, 117);
            if (str.length() > 0) {
                sVar.a0(353008474);
                dVarE = u3.e.e(599215658, sVar, new g2.h(function1, 3));
                sVar.q(false);
            } else {
                sVar.a0(353540961);
                sVar.q(false);
                dVarE = null;
            }
            boolean z11 = (i13 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m.f29332a) {
                objM = new h1(function1, 4);
                sVar.k0(objM);
            }
            cg.j.m(tVarJ, str, true, false, 0, f40377d, f40378e, dVarE, null, d1Var, u0VarA, (Function1) objM, sVar, ((i13 << 3) & 112) | 807076224, 280);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new l(str, function1, tVar2, i11);
        }
    }

    public static final void f(List list, List list2, op.c cVar, boolean z11, Function1 function1, Function1 function12, Function0 function0, n nVar, int i11) {
        int i12;
        s sVar;
        Object e1Var;
        int i13;
        list.getClass();
        list2.getClass();
        function1.getClass();
        function12.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-644929574);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(list2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.f(cVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(function1) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(function12) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(function0) ? 1048576 : 524288;
        }
        if (sVar2.R(i12 & 1, (599187 & i12) != 599186)) {
            c0 c0VarA = e0.a(0, 0, 0, 3, sVar2);
            Object objM = sVar2.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.q(new f2.f(c0VarA, 7));
                sVar2.k0(objM);
            }
            c3 c3Var = (c3) objM;
            Boolean bool = (Boolean) c3Var.getValue();
            bool.getClass();
            boolean zH = sVar2.h(list) | ((i12 & 3670016) == 1048576);
            Object objM2 = sVar2.M();
            if (zH || objM2 == fVar) {
                i13 = i12;
                e1Var = new e1(list, function0, c3Var, null, 18);
                sVar2.k0(e1Var);
            } else {
                i13 = i12;
                e1Var = objM2;
            }
            m3.i.h(bool, (Function2) e1Var, sVar2);
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarD, sVar2);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            t tVarD2 = m2.d(qVar, 1.0f);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            t tVarJ = v1.n.j(b3.i.e(1.0f, tVarD2, true), lv.s.J, g0.f23254b);
            boolean zH2 = sVar2.h(list) | ((i13 & 7168) == 2048) | ((57344 & i13) == 16384) | ((i13 & 896) == 256) | sVar2.h(list2) | ((458752 & i13) == 131072);
            Object objM3 = sVar2.M();
            if (zH2 || objM3 == fVar) {
                v1 v1Var = new v1(list, z11, function1, cVar, list2, function12, 3);
                sVar2.k0(v1Var);
                objM3 = v1Var;
            }
            ox.h.c(tVarJ, c0VarA, null, null, null, null, false, null, (Function1) objM3, sVar2, 0, 508);
            sVar = sVar2;
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g3.c0(list, list2, cVar, z11, function1, function12, function0, i11);
        }
    }
}
