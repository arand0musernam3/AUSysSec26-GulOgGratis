package cp;

import a3.p0;
import a3.p2;
import a3.t0;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.g1;
import b4.q;
import b4.t;
import bn.x;
import c5.v0;
import c5.x1;
import cn.u;
import com.app.tgtg.R;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.w;
import d2.y;
import d6.j0;
import g3.a0;
import g3.d9;
import g3.g9;
import g3.ga;
import g3.k9;
import g3.r9;
import g3.s0;
import i4.g0;
import i4.r0;
import i4.v;
import j5.r;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import m3.s;
import m3.w1;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.b0;
import s1.d1;
import z4.c0;
import z4.u0;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f13366a = new u3.d(new u(7, (byte) 0), false, -899176855);

    public static final void a(c cVar, Function0 function0, m3.n nVar, int i11) {
        Function0 function02;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(127877651);
        int i12 = (sVar.d(cVar.ordinal()) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            function02 = function0;
            ex.i.b(function02, null, u3.e.e(-995630116, sVar, new b(cVar, function0)), sVar, ((i12 >> 3) & 14) | MLKEMEngine.KyberPolyBytes, 2);
        } else {
            function02 = function0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b(cVar, function02, i11);
        }
    }

    public static final void b(Uri uri, Function0 function0, m3.n nVar, int i11) {
        int i12;
        uri.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1309267059);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(uri) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            q qVar = q.f5711a;
            t tVarC = b4.a.c(qVar, sVar);
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
            td.e eVar = new td.e((Context) sVar.j(v0.f7390b));
            eVar.f39959c = uri;
            float f11 = 16;
            gd.o.a(eVar.a(), "", v1.n.j(f4.g.b(d2.c.B(m2.u(d2.c.z(qVar, 4), null, 3), f11, 0.0f, 2), l2.g.b(12)), v.f23313f, g0.f23254b), z4.l.f47167b, sVar, 1572912, 6, 952);
            t tVarD = d2.c.D(d2.u.f13938a.a(qVar, b4.d.f5685c), 0.0f, f11, 32, 0.0f, 9);
            boolean z11 = (i13 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new ar.d(16, function0);
                sVar.k0(objM);
            }
            s0.h((Function0) objM, tVarD, false, null, null, null, f13366a, sVar, 1572864, 60);
            sVar = sVar;
            sVar.q(true);
            d2.c.f(m2.m(qVar, lv.t.f28254h), sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new x(uri, function0, i11, 3);
        }
    }

    public static final void c(Function0 function0, Function0 function02, m3.n nVar, int i11) {
        int i12;
        float f11;
        boolean z11;
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(1640067811);
        int i13 = i11 | (sVar.h(function0) ? 4 : 2) | (sVar.h(function02) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(null);
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            long j9 = lv.s.f28242w;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarB = d2.c.B(m2.d(v1.n.j(qVar, j9, r0Var), 1.0f), 16, 0.0f, 2);
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new defpackage.g(29);
                sVar.k0(objM3);
            }
            t tVarD = f4.g.d(tVarB, (Function1) objM3);
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new p0(b1Var2, 4);
                sVar.k0(objM4);
            }
            t tVarO = c0.o(tVarD, (Function1) objM4);
            y yVarA = w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarO, sVar);
            b5.j.R.getClass();
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
            float f12 = lv.t.f28254h;
            d2.c.f(m2.m(qVar, f12), sVar);
            v1.n.d(x0.z(R.drawable.icon_add_picture, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            String strF = r8.k.f(f12, R.string.rating_category_title_picture_upload_cta, qVar, sVar, sVar);
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new bm.j(b1Var, 5);
                sVar.k0(objM5);
            }
            v0.n.l(qVar, strF, null, null, null, false, false, null, null, (Function0) objM5, sVar, 805306374, 508);
            sVar = sVar;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(-1586577063);
                z zVar = (z) b1Var2.getValue();
                if (zVar == null) {
                    sVar.a0(-1939248696);
                    z11 = false;
                    sVar.q(false);
                    f11 = f12;
                    i12 = 4;
                } else {
                    sVar.a0(-1939248695);
                    Object objM6 = sVar.M();
                    if (objM6 == fVar) {
                        objM6 = new bm.j(b1Var, 6);
                        sVar.k0(objM6);
                    }
                    int i14 = i13 << 3;
                    f11 = f12;
                    i12 = 4;
                    n(zVar, function0, function02, (Function0) objM6, sVar, (i14 & 896) | (i14 & 112) | 3072);
                    z11 = false;
                    sVar.q(false);
                }
                sVar.q(z11);
            } else {
                f11 = f12;
                i12 = 4;
                sVar.a0(-1938950475);
                sVar.q(false);
            }
            b3.i.y(qVar, f11, sVar, true);
        } else {
            i12 = 4;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.g0(function0, function02, i11, i12);
        }
    }

    public static final void d(t tVar, String str, m3.n nVar, int i11) {
        s sVar;
        tVar.getClass();
        str.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(721249582);
        int i12 = (sVar2.f(tVar) ? 4 : 2) | i11 | (sVar2.f(str) ? 32 : 16);
        if (!sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            sVar.U();
        } else {
            if (str.length() == 0) {
                w1 w1VarS = sVar2.s();
                if (w1VarS != null) {
                    w1VarS.f29476d = new g(str, tVar, i11, 0);
                    return;
                }
                return;
            }
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVar, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            t tVarJ = v1.n.j(f4.g.b(q.f5711a, new f()), lv.s.f28223e, g0.f23254b);
            float f11 = lv.t.f28253g;
            float f12 = lv.t.f28251e;
            r9.d(str, b0.a(d2.u.f13938a.a(d2.c.C(tVarJ, f12, f11, f12, f12), b4.d.f5687e), null, 3), lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28275o, sVar2, ((i12 >> 3) & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar2;
            sVar.q(true);
        }
        w1 w1VarS2 = sVar.s();
        if (w1VarS2 != null) {
            w1VarS2.f29476d = new g(str, tVar, i11, 1);
        }
    }

    public static final void e(String str, List list, List list2, boolean z11, Function1 function1, String str2, g4.v vVar, Function1 function12, m3.n nVar, int i11, int i12) {
        boolean z12;
        int i13;
        g4.v vVar2;
        String strU;
        str.getClass();
        list.getClass();
        list2.getClass();
        function1.getClass();
        str2.getClass();
        vVar.getClass();
        function12.getClass();
        s sVar = (s) nVar;
        sVar.c0(-566467892);
        int i14 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.h(list) ? 32 : 16) | (sVar.h(list2) ? 256 : 128);
        int i15 = i12 & 8;
        if (i15 != 0) {
            i13 = i14 | 3072;
            z12 = z11;
        } else {
            z12 = z11;
            i13 = i14 | (sVar.g(z12) ? NewHope.SENDB_BYTES : 1024);
        }
        int i16 = i13 | (sVar.f(str2) ? 131072 : 65536);
        if (sVar.R(i16 & 1, (4793491 & i16) != 4793490)) {
            if (i15 != 0) {
                z12 = false;
            }
            long j9 = lv.s.I;
            l2.f fVarB = l2.g.b(12);
            q qVar = q.f5711a;
            t tVarD = m2.d(v1.n.j(qVar, j9, fVarB), 1.0f);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
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
            m5.u0 u0Var = lv.v.f28272k;
            long j11 = lv.s.C;
            float f11 = lv.t.f28253g;
            t tVarD2 = d2.c.D(qVar, f11, f11, f11, 0.0f, 8);
            q qVar2 = qVar;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new i(2);
                sVar.k0(objM);
            }
            r9.d(str, r.c(tVarD2, false, (Function1) objM), j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, (i16 & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            if (z12) {
                sVar.a0(-411346464);
                sVar.q(false);
            } else {
                sVar.a0(-411953816);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bp.s sVar2 = (bp.s) it.next();
                    float f12 = lv.t.f28253g;
                    q qVar3 = qVar2;
                    t tVarD3 = d2.c.D(qVar3, f12, f12, f12, 0.0f, 8);
                    boolean zContains = list2.contains(sVar2);
                    Integer numC = sVar2.c();
                    if (numC == null) {
                        sVar.a0(1642585685);
                        sVar.q(false);
                        strU = null;
                    } else {
                        sVar.a0(1642585686);
                        strU = f0.U(sVar, numC.intValue());
                        sVar.q(false);
                    }
                    if (strU == null) {
                        strU = "";
                    }
                    String str3 = strU;
                    boolean zD = sVar.d(sVar2.ordinal());
                    Object objM2 = sVar.M();
                    if (zD || objM2 == fVar) {
                        objM2 = new bs.b(17, function1, sVar2);
                        sVar.k0(objM2);
                    }
                    f(0, tVarD3, str3, (Function0) objM2, sVar, zContains);
                    qVar2 = qVar3;
                }
                sVar.q(false);
            }
            vVar2 = vVar;
            s1.i.a(Boolean.valueOf(list2.contains(CollectionsKt.W(list)) || z12), null, null, null, "User feedback", null, u3.e.e(2140213317, sVar, new cn.v(str2, vVar2, function12, 1)), sVar, 1597440, 46);
            sVar = sVar;
            sVar.q(true);
        } else {
            vVar2 = vVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.f(str, list, list2, z12, function1, str2, vVar2, function12, i11, i12);
        }
    }

    public static final void f(int i11, t tVar, String str, Function0 function0, m3.n nVar, boolean z11) {
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1456686993);
        int i12 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.f(str) ? 256 : 128) | (sVar.h(function0) ? 2048 : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            j5.j jVar = new j5.j(1);
            boolean z12 = (i12 & 7168) == 2048;
            Object objM = sVar.M();
            if (z12 || objM == m3.m.f29332a) {
                objM = new p2(2, function0);
                sVar.k0(objM);
            }
            t tVarA = b4.a.a(k2.c.d(tVar, z11, jVar, (Function1) objM), c5.m2.f7291a, new bm.f(5, function0));
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            q qVar = q.f5711a;
            t tVarM = m2.m(qVar, 24);
            float f11 = a0.f18302a;
            long j9 = lv.s.f28217b;
            g3.g0.a(z11, null, tVarM, false, a0.a(j9, j9, sVar), sVar, ((i12 >> 3) & 14) | 432, 40);
            r9.d(str, d2.c.D(qVar, 4, 3, 0.0f, 0.0f, 12), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, ((i12 >> 6) & 14) | 432, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h(tVar, z11, str, function0, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final float r20, long r21, float r23, float r24, int r25, m3.n r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.a.g(float, long, float, float, int, m3.n, int, int):void");
    }

    public static final void h(t tVar, boolean z11, i4.o oVar, Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-175201730);
        int i12 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.f(oVar) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            v1.n.d(x0.z(z11 ? R.drawable.ic_rating_star_selected : R.drawable.ic_rating_star, sVar, 0), null, b4.a.a(tVar, c5.m2.f7291a, new bm.f(6, function0)), null, null, 0.0f, oVar, sVar, 56 | ((i12 << 12) & 3670016), 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.c(tVar, z11, oVar, function0, i11, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final int r30, boolean r31, b4.t r32, long r33, long r35, kotlin.jvm.functions.Function1 r37, m3.n r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.a.i(int, boolean, b4.t, long, long, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    public static final void j(float f11, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        Function0 function03;
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(1185034285);
        int i12 = (sVar.c(f11) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16) | (sVar.h(function02) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(q.f5711a, sVar);
            b5.j.R.getClass();
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
            String strU = f0.U(sVar, R.string.rating_topbar_title);
            boolean z11 = false;
            long j9 = lv.s.I;
            long j11 = lv.s.C;
            Integer numValueOf = Integer.valueOf(R.string.rating_accessibility_close_btn);
            if ((i12 & 896) == 256) {
                z11 = true;
            }
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new ar.d(17, function02);
                sVar.k0(objM);
            }
            cg.j.s(strU, null, j11, j9, function0, Integer.valueOf(R.string.rating_accessibility_back_btn), kotlin.collections.c0.c(new cg.a(R.drawable.system_icon_close_neutral_80, numValueOf, (Function0) objM)), ga.c(sVar), sVar, ((i12 << 9) & 57344) | 3456, 2);
            function03 = function0;
            g(f11, 0L, 0.0f, 0.0f, 0, sVar, i12 & 14, 30);
            sVar.q(true);
        } else {
            function03 = function0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.h(f11, i11, function03, function02);
        }
    }

    public static final void k(int i11, t tVar, String str, Function0 function0, m3.n nVar, boolean z11) {
        t tVar2;
        int i12;
        str.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(767813106);
        if ((i11 & 6) == 0) {
            tVar2 = tVar;
            i12 = (sVar.f(tVar2) ? 4 : 2) | i11;
        } else {
            tVar2 = tVar;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function0) ? 2048 : 1024;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            boolean z12 = (i13 & 7168) == 2048;
            Object objM = sVar.M();
            if (z12 || objM == m3.m.f29332a) {
                objM = new ar.d(18, function0);
                sVar.k0(objM);
            }
            Function0 function02 = (Function0) objM;
            l2.f fVarB = l2.g.b(24);
            b2 b2Var = g3.p.f19253a;
            s0.n(function02, tVar2, false, fVarB, g3.p.c(((v) d1.a(z11 ? lv.s.f28217b : lv.s.J, null, "", sVar, MLKEMEngine.KyberPolyBytes, 10).getValue()).f23317a, 0L, sVar, 14), v1.n.b(2, lv.s.f28217b), null, u3.e.e(1709139247, sVar, new co.r(str, z11)), sVar, ((i13 << 3) & 112) | 806879232, 420);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.m(tVar, str, z11, function0, i11, 2);
        }
    }

    public static final void l(t tVar, Boolean bool, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(268932524);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(bool) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function02) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            float f11 = 40;
            q qVar = q.f5711a;
            t tVarH = m2.h(qVar, f11);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            float f12 = 4;
            k(i12 & 7168, d2.c.D(tVarH.then(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 0.0f, 0.0f, f12, 0.0f, 11), f0.U(sVar, R.string.order_rating_no), function02, sVar, Intrinsics.areEqual(bool, Boolean.FALSE));
            t tVarH2 = m2.h(qVar, f11);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            k((i12 << 3) & 7168, d2.c.D(tVarH2.then(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), f12, 0.0f, 0.0f, 0.0f, 14), f0.U(sVar, R.string.order_rating_yes), function0, sVar, Intrinsics.areEqual(bool, Boolean.TRUE));
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(tVar, bool, i11, function0, function02, 7);
        }
    }

    public static final void m(String str, Boolean bool, boolean z11, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        str.getClass();
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1022888796);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(bool) ? 32 : 16) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function02) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            d2.g0 g0Var = m2.f13850c;
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(g0Var, sVar);
            b5.j.R.getClass();
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
            m5.u0 u0VarA = m5.u0.a(lv.v.f28272k, lv.s.C, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446);
            float f11 = z11 ? lv.t.f28247a : 92;
            float f12 = lv.t.f28255i;
            q qVar = q.f5711a;
            t tVarF = b3.i.f(b4.d.f5695n, d2.c.D(qVar, f12, f11, f12, 0.0f, 8));
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new i(3);
                sVar.k0(objM);
            }
            r9.d(str, r.c(tVarF, false, (Function1) objM), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0VarA, sVar, i12 & 14, 0, 131068);
            sVar = sVar;
            int i13 = i12 >> 3;
            l(d2.c.D(qVar, f12, lv.t.f28256j, f12, 0.0f, 8), bool, function0, function02, sVar, (i12 & 112) | (i13 & 896) | (i13 & 7168));
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.d(str, bool, z11, function0, function02, i11);
        }
    }

    public static final void n(z zVar, Function0 function0, Function0 function02, Function0 function03, m3.n nVar, int i11) {
        int i12;
        Function0 function04;
        s sVar;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-405410258);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(zVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.h(function02) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            function04 = function03;
            i12 |= sVar2.h(function04) ? NewHope.SENDB_BYTES : 1024;
        } else {
            function04 = function03;
        }
        int i13 = i12;
        if (sVar2.R(i13 & 1, (i13 & 1171) != 1170)) {
            g1 g1Var = new g1(3);
            boolean z11 = (i13 & 112) == 32;
            Object objM = sVar2.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new p2(3, function0);
                sVar2.k0(objM);
            }
            Function0 function05 = function04;
            sVar = sVar2;
            d6.r.a(new cg.u0(zVar, 1), function03, new j0(40), u3.e.e(327866448, sVar2, new ap.b(function02, function05, jb.u.N(g1Var, (Function1) objM, sVar2, 0), (Context) sVar2.j(v0.f7390b), function0, 4)), sVar, ((i13 >> 6) & 112) | 3456, 0);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(zVar, function0, i11, function02, function03, 8);
        }
    }

    public static final void o(String str, g4.v vVar, Function1 function1, m3.n nVar, int i11) {
        s sVar;
        str.getClass();
        vVar.getClass();
        function1.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1946153096);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.f(vVar) ? 32 : 16) | (sVar2.h(function1) ? 256 : 128);
        int i13 = 0;
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.g(sVar2);
            }
            b2.l lVar = (b2.l) objM;
            b1 b1VarV = a.a.v(lVar, sVar2, 6);
            v1.a0 a0VarB = v1.n.b(1, lv.s.C);
            float f11 = 12;
            t tVarL = v1.n.l(q.f5711a, a0VarB.f41677a, a0VarB.f41678b, l2.g.b(f11));
            long j9 = lv.s.I;
            t tVarD = m2.d(g4.d.d(v1.n.j(tVarL, j9, g0.f23254b), vVar), 1.0f);
            g9 g9Var = g9.f18691a;
            long j11 = v.f23314g;
            d9 d9VarC = g9.c(0L, 0L, 0L, j9, j9, 0L, lv.s.f28217b, j11, j11, j11, sVar2, 2147469007);
            m2.d1 d1Var = new m2.d1(0, 0, 126);
            l2.f fVarB = l2.g.b(f11);
            boolean z11 = (i12 & 896) == 256;
            Object objM2 = sVar2.M();
            if (z11 || objM2 == fVar) {
                objM2 = new defpackage.d(function1, 8);
                sVar2.k0(objM2);
            }
            k9.a(str, (Function1) objM2, tVarD, false, null, null, null, d1Var, null, false, 0, 4, lVar, fVarB, d9VarC, sVar2, i12 & 14, 805502976, 6, 491512);
            sVar = sVar2;
            Boolean boolValueOf = Boolean.valueOf(!((Boolean) b1VarV.getValue()).booleanValue());
            boolean z12 = (i12 & 112) == 32;
            Object objM3 = sVar.M();
            if (z12 || objM3 == fVar) {
                objM3 = new o(vVar, null, i13);
                sVar.k0(objM3);
            }
            m3.i.h(boolValueOf, (Function2) objM3, sVar);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(str, vVar, function1, i11, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(b4.t r34, long r35, final java.lang.String r37, final g4.v r38, final kotlin.jvm.functions.Function1 r39, m3.n r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.a.p(b4.t, long, java.lang.String, g4.v, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (t1.b.c(r1, r2, r3, null, r5, 12) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(t1.b r9, float r10, int r11, z70.c r12) {
        /*
            boolean r0 = r12 instanceof cp.l
            if (r0 == 0) goto L14
            r0 = r12
            cp.l r0 = (cp.l) r0
            int r1 = r0.f13403n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f13403n = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            cp.l r0 = new cp.l
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r5.f13402m
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r5.f13403n
            r7 = 0
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L34
            if (r1 != r8) goto L2d
            ba0.g.M(r12)
            goto L85
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L34:
            int r11 = r5.l
            float r10 = r5.f13401k
            t1.b r9 = r5.f13400j
            ba0.g.M(r12)
            r1 = r9
            goto L63
        L3f:
            ba0.g.M(r12)
            r12 = r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r10)
            t1.u1 r3 = new t1.u1
            r1 = 250(0xfa, float:3.5E-43)
            r4 = 4
            r3.<init>(r1, r11, r7, r4)
            r5.f13400j = r9
            r5.f13401k = r10
            r5.l = r11
            r5.f13403n = r12
            r4 = 0
            r6 = 12
            r1 = r9
            java.lang.Object r9 = t1.b.c(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L63
            goto L84
        L63:
            java.lang.Float r2 = new java.lang.Float
            r9 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r9)
            t1.u1 r3 = new t1.u1
            r9 = 0
            r12 = 6
            r4 = 100
            r3.<init>(r4, r9, r7, r12)
            r5.f13400j = r7
            r5.f13401k = r10
            r5.l = r11
            r5.f13403n = r8
            r4 = 0
            r6 = 12
            java.lang.Object r9 = t1.b.c(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L85
        L84:
            return r0
        L85:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.a.q(t1.b, float, int, z70.c):java.lang.Object");
    }

    public static final int r(m3.n nVar, int i11) {
        float f11 = 57;
        if (i11 == 1) {
            f11 = 2 * (-f11);
        } else if (i11 == 2) {
            f11 = -f11;
        } else if (i11 != 4) {
            f11 = i11 != 5 ? 0 : f11 * 2;
        }
        return (int) ((z5.c) ((s) nVar).j(x1.f7416h)).c0(f11);
    }
}
