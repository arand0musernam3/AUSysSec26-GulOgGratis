package jh;

import b0.x1;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import bn.p;
import bn.v;
import cg.c0;
import cg.z;
import cn.x;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.badge.Badge;
import d2.b2;
import d2.m2;
import d2.u;
import d2.w;
import d2.y;
import d6.a0;
import g3.ga;
import g3.j5;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import gd.o;
import gh.i;
import gh.l;
import i4.g0;
import i4.r0;
import ii.m;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l2.g;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import v80.b0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f25260a = new u3.d(new m(3), false, -240183513);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f25261b = new u3.d(new m(4), false, -199316895);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f25262c = new u3.d(new m(5), false, -1542404083);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.d f25263d = new u3.d(new j60.a(1), false, -672085203);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3.d f25264e = new u3.d(new j60.a(2), false, -1597271091);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3.d f25265f = new u3.d(new j60.a(3), false, 565189562);

    public static final void a(t tVar, i iVar, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function0 function02, n nVar, int i11) {
        s sVar;
        t tVar2;
        function0.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function02.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(616238153);
        int i12 = i11 | 6 | (sVar2.h(iVar) ? 32 : 16) | (sVar2.h(function1) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.h(function13) ? 131072 : 65536) | (sVar2.h(function02) ? 1048576 : 524288);
        if (sVar2.R(i12 & 1, (599187 & i12) != 599186)) {
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            float f11 = 12;
            l2.f fVarC = g.c(f11, f11, 0.0f, 0.0f, 12);
            long j9 = lv.s.J;
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                objM = new j5(16, function0);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            v3.a((Function0) objM, null, w6VarF, 0.0f, false, fVarC, j9, 0L, 0.0f, 0L, null, null, null, u3.e.e(251814183, sVar2, new x(iVar, function1, function12, function13)), sVar, 1572864, 3072, 8090);
            function02.invoke();
            tVar2 = q.f5711a;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a(tVar2, iVar, function0, function1, function12, function13, function02, i11);
        }
    }

    public static final void b(t tVar, c cVar, String str, Function0 function0, Function0 function02, n nVar, int i11) {
        s sVar;
        t tVar2;
        cVar.getClass();
        function0.getClass();
        function02.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(750151210);
        int i12 = i11 | 6 | (sVar2.f(str) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            b0 b0Var = (b0) objM;
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            float f11 = 12;
            l2.f fVarC = g.c(f11, f11, 0.0f, 0.0f, 12);
            long j9 = lv.s.f28240u;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = new j5(17, function0);
                sVar2.k0(objM2);
            }
            sVar = sVar2;
            v3.a((Function0) objM2, null, w6VarF, 0.0f, false, fVarC, j9, 0L, 0.0f, 0L, null, null, null, u3.e.e(586986888, sVar2, new v(cVar, b0Var, w6VarF, function02, str)), sVar, 1572864, 3072, 8090);
            tVar2 = q.f5711a;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(tVar2, cVar, str, function0, function02, i11, 10);
        }
    }

    public static final void c(t tVar, String str, String str2, Function0 function0, n nVar, int i11) {
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1620929295);
        int i12 = i11 | 6 | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new j5(18, function0);
                sVar.k0(objM);
            }
            ex.i.b((Function0) objM, new a0(1), u3.e.e(1986561210, sVar, new an.d(function0, str, str2)), sVar, 432, 0);
            tVar = q.f5711a;
        } else {
            sVar.U();
        }
        t tVar2 = tVar;
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p(tVar2, str, i11, str2, function0, 18);
        }
    }

    public static final void d(t tVar, l lVar, ih.i iVar, Function1 function1, Function0 function0, n nVar, int i11) {
        t tVar2;
        iVar.getClass();
        function1.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(1055448868);
        int i12 = i11 | 6 | (sVar.h(lVar) ? 32 : 16) | (sVar.h(iVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            q qVar = q.f5711a;
            t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarT, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            g2.a aVar = new g2.a(3);
            boolean zH = sVar.h(lVar) | sVar.h(iVar);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                x1 x1Var = new x1(12, lVar, iVar, function1, function0);
                sVar.k0(x1Var);
                objM = x1Var;
            }
            x0.e(aVar, null, null, null, null, null, null, false, null, (Function1) objM, sVar, 0);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(tVar2, lVar, iVar, function1, function0, i11, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    public static final void e(t tVar, Badge badge, ih.i iVar, Function1 function1, n nVar, int i11) {
        ih.i iVar2;
        Badge badge2;
        t tVar2;
        s sVar;
        boolean z11;
        q qVar;
        boolean z12;
        ?? r02;
        s sVar2;
        q qVar2;
        s sVar3;
        Function1 function12 = function1;
        badge.getClass();
        iVar.getClass();
        function12.getClass();
        s sVar4 = (s) nVar;
        sVar4.c0(-1379926415);
        int i12 = i11 | 6 | (sVar4.f(badge) ? 32 : 16) | (sVar4.h(iVar) ? 256 : 128) | (sVar4.h(function12) ? NewHope.SENDB_BYTES : 1024);
        if (sVar4.R(i12 & 1, (i12 & 1171) != 1170)) {
            String animationUrl = iVar.f23868q ? null : badge.getAnimationUrl();
            long j9 = lv.s.f28240u;
            r0 r0Var = g0.f23254b;
            q qVar3 = q.f5711a;
            t tVarT = m2.t(m2.d(v1.n.j(qVar3, j9, r0Var), 1.0f), 3);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar4.T);
            u3.i iVarL = sVar4.l();
            t tVarC = b4.a.c(tVarT, sVar4);
            j.R.getClass();
            Function0 function0 = b5.i.f5839b;
            sVar4.e0();
            if (sVar4.S) {
                sVar4.k(function0);
            } else {
                sVar4.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar4);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar4, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar4, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar4);
            t tVarZ = d2.c.z(m2.t(m2.d(qVar3, 1.0f), 3), e0.s(sVar4, R.dimen.spacing_3));
            d2.d dVar2 = d2.i.f13803c;
            y yVarA = w.a(dVar2, b4.d.f5694m, sVar4, 0);
            int iHashCode2 = Long.hashCode(sVar4.T);
            u3.i iVarL2 = sVar4.l();
            t tVarC2 = b4.a.c(tVarZ, sVar4);
            sVar4.e0();
            String str = animationUrl;
            if (sVar4.S) {
                sVar4.k(function0);
            } else {
                sVar4.n0();
            }
            m3.i.C(yVarA, gVar, sVar4);
            m3.i.C(iVarL2, gVar2, sVar4);
            w.a0.y(iHashCode2, sVar4, gVar3, sVar4, dVar);
            m3.i.C(tVarC2, gVar4, sVar4);
            r9.d(f0.U(sVar4, R.string.badges_page_recent_header), d2.c.D(qVar3, 0.0f, 0.0f, 0.0f, e0.s(sVar4, R.dimen.spacing_2), 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.l, lv.s.C, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar4, 0, 0, 131068);
            s sVar5 = sVar4;
            b4.i iVar3 = b4.d.f5695n;
            t tVarT2 = m2.t(m2.d(qVar3, 1.0f), 3);
            y yVarA2 = w.a(dVar2, iVar3, sVar5, 48);
            int iHashCode3 = Long.hashCode(sVar5.T);
            u3.i iVarL3 = sVar5.l();
            t tVarC3 = b4.a.c(tVarT2, sVar5);
            sVar5.e0();
            if (sVar5.S) {
                sVar5.k(function0);
            } else {
                sVar5.n0();
            }
            m3.i.C(yVarA2, gVar, sVar5);
            m3.i.C(iVarL3, gVar2, sVar5);
            w.a0.y(iHashCode3, sVar5, gVar3, sVar5, dVar);
            m3.i.C(tVarC3, gVar4, sVar5);
            String imageUrl = badge.getImageUrl();
            if (imageUrl == null) {
                sVar5.a0(396731228);
                z11 = false;
                sVar5.q(false);
                badge2 = badge;
                qVar = qVar3;
                z12 = true;
                function12 = function1;
            } else {
                z11 = false;
                sVar5.a0(396731229);
                float f11 = 176;
                badge2 = badge;
                qVar = qVar3;
                z12 = true;
                function12 = function1;
                t tVarA = b4.a.a(m2.q(m2.e(qVar3, f11), f11), c5.m2.f7291a, new e(function12, badge2, 1));
                if (str != null) {
                    imageUrl = "";
                }
                o.a(imageUrl, null, tVarA, z4.l.f47166a, sVar5, 1572912, 0, 1976);
                sVar5.q(false);
            }
            String name = badge2.getName();
            if (name == null) {
                sVar5.a0(397270783);
                sVar5.q(z11);
                r02 = z12;
                sVar2 = sVar5;
            } else {
                sVar5.a0(397270784);
                r02 = z12;
                r9.d(name, d2.c.D(qVar, 0.0f, 0.0f, 0.0f, e0.s(sVar5, R.dimen.spacing_0_5), 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28277q, lv.s.f28217b, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar5, 0, 0, 131068);
                s sVar6 = sVar5;
                sVar6.q(z11);
                sVar2 = sVar6;
            }
            String achievedAtUtc = badge2.getAchievedAtUtc();
            if (achievedAtUtc == null) {
                sVar2.a0(397723941);
                sVar2.q(z11);
                qVar2 = qVar;
                sVar3 = sVar2;
            } else {
                sVar2.a0(397723942);
                q qVar4 = qVar;
                qVar2 = qVar4;
                s sVar7 = sVar2;
                r9.d(achievedAtUtc, d2.c.D(qVar4, 0.0f, 0.0f, 0.0f, e0.s(sVar2, R.dimen.spacing_1), 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28276p, lv.s.D, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar7, 0, 0, 131068);
                s sVar8 = sVar7;
                sVar8.q(z11);
                sVar3 = sVar8;
            }
            sVar3.q(r02);
            sVar3.q(r02);
            if (str == null) {
                sVar3.a0(-708216311);
                sVar3.q(z11);
                iVar2 = iVar;
            } else {
                sVar3.a0(-708216310);
                iVar2 = iVar;
                iVar2.f23868q = r02;
                t tVarA2 = u.f13938a.a(qVar2, b4.d.f5687e);
                String strA = ih.e.WIGGLE.a();
                Object objM = sVar3.M();
                Object obj = m3.m.f29332a;
                if (objM == obj) {
                    objM = new iu.a(26);
                    sVar3.k0(objM);
                }
                cg.b0 b0Var = new cg.b0(strA, (Function0) objM, new c0(22, 16, 50));
                String strA2 = ih.e.SNAP.a();
                Object objM2 = sVar3.M();
                if (objM2 == obj) {
                    objM2 = new iu.a(27);
                    sVar3.k0(objM2);
                }
                cg.b0 b0Var2 = new cg.b0(strA2, (Function0) objM2, new c0(r02, 78, 80));
                String strA3 = ih.e.CLAP.a();
                Object objM3 = sVar3.M();
                if (objM3 == obj) {
                    objM3 = new iu.a(28);
                    sVar3.k0(objM3);
                }
                cg.i.a(tVarA2, str, d0.d(b0Var, b0Var2, new cg.b0(strA3, (Function0) objM3, new c0(2, 27, 50))), 0, sVar3, 0, 8);
                sVar3.q(false);
            }
            sVar3.q(r02);
            tVar2 = qVar2;
            sVar = sVar3;
        } else {
            iVar2 = iVar;
            badge2 = badge;
            sVar4.U();
            tVar2 = tVar;
            sVar = sVar4;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p(tVar2, badge2, i11, iVar2, function12, 19);
        }
    }

    public static final void f(int i11, t tVar, Function0 function0, n nVar) {
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(108611317);
        int i12 = i11 | 6 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            long j9 = lv.s.f28240u;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarZ = d2.c.z(m2.t(m2.d(v1.n.j(qVar, j9, r0Var), 1.0f), 3), e0.s(sVar, R.dimen.spacing_2));
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarZ, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            s0.b(b4.a.a(m2.t(m2.d(qVar, 1.0f), 3), c5.m2.f7291a, new bm.f(19, function0)), g.b(8), s0.p(lv.s.f28217b, sVar, 6), s0.q(4, 0.0f, 0.0f, 0.0f, 62), null, f25262c, sVar, 196608, 16);
            sVar.q(true);
            tVar = qVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dm.g(tVar, function0, i11, 1);
        }
    }

    public static final void g(t tVar, Badge badge, Function1 function1, n nVar, int i11) {
        t tVar2;
        boolean z11;
        q qVar;
        badge.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-195001559);
        int i12 = i11 | 6 | (sVar.f(badge) ? 32 : 16) | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.i iVar = b4.d.f5695n;
            d2.e eVar = d2.i.f13805e;
            sVar.a0(1582071328);
            q qVar2 = q.f5711a;
            t tVarZ = d2.c.z(m2.t(m2.v(qVar2, 3), 3), e0.s(sVar, R.dimen.spacing_2));
            sVar.q(false);
            y yVarA = w.a(eVar, iVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarZ, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            String imageUrl = badge.getImageUrl();
            if (imageUrl == null) {
                sVar.a0(1127260112);
                sVar.q(false);
            } else {
                sVar.a0(1127260113);
                float f11 = 84;
                o.a(imageUrl, null, b4.a.a(d2.c.D(m2.q(m2.e(qVar2, f11), f11), 0.0f, 0.0f, 0.0f, e0.s(sVar, R.dimen.spacing_1), 7), c5.m2.f7291a, new e(function1, badge, 0)), z4.l.f47166a, sVar, 1572912, 0, 1976);
                sVar.q(false);
            }
            String name = badge.getName();
            if (name == null) {
                sVar.a0(1127747990);
                sVar.q(false);
                z11 = true;
                qVar = qVar2;
            } else {
                sVar.a0(1127747991);
                z11 = true;
                qVar = qVar2;
                r9.d(name, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28277q, lv.s.f28217b, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar, 0, 0, 131070);
                sVar = sVar;
                sVar.q(false);
            }
            sVar.q(z11);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(tVar2, badge, function1, i11, 26);
        }
    }

    public static final void h(Function0 function0, Function0 function02, n nVar, int i11) {
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(-69206776);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b2 b2Var = ga.f18696a;
            g3.i.a(f25263d, null, u3.e.e(1835012271, sVar, new z(2, function0)), u3.e.e(2000485656, sVar, new bm.c(2, function02)), 0.0f, null, ga.d(lv.s.f28240u, 0L, 0L, 0L, sVar, 62), null, null, sVar, 3462, 434);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.g0(function0, function02, i11, 5);
        }
    }
}
