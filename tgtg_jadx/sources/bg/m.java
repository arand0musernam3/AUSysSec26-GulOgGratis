package bg;

import a3.r2;
import c5.x1;
import com.app.tgtg.R;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.r9;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.d3;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f6202a = new u3.d(new r2(14), false, 308364486);

    public static final void a(Function0 function0, Function0 function02, Function0 function03, Function0 function04, f fVar, m3.n nVar, int i11) {
        m3.s sVar;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1727358632);
        int i12 = i11 | (sVar2.h(function0) ? 4 : 2) | (sVar2.h(function02) ? 32 : 16) | (sVar2.h(function03) ? 256 : 128) | (sVar2.h(function04) ? NewHope.SENDB_BYTES : 1024) | (sVar2.f(fVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                objM = e0.f.w(fVar.f6148e, sVar2);
            }
            m3.b1 b1Var = (m3.b1) objM;
            float f11 = lv.t.f28253g;
            float f12 = lv.t.f28254h;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = d2.c.A(qVar, f11, f12);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarA, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            b(function0, function02, function04, fVar.f6144a, fVar.f6145b, fVar.f6147d, sVar2, (i12 & 126) | ((i12 >> 3) & 896));
            d2.c.f(m2.m(qVar, lv.t.f28249c), sVar2);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            c(vi.c.z(new n1(1.0f, true), b1Var), fVar.f6146c, function03, fVar.f6149f, fVar.f6150g, sVar2, i12 & 896);
            sVar = sVar2;
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(function0, function02, function03, function04, fVar, i11, 1);
        }
    }

    public static final void b(Function0 function0, Function0 function02, Function0 function03, int i11, int i12, boolean z11, m3.n nVar, int i13) {
        function0.getClass();
        function02.getClass();
        function03.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(197967152);
        int i14 = (sVar.h(function0) ? 4 : 2) | i13 | (sVar.h(function02) ? 32 : 16);
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar.h(function03) ? 256 : 128;
        }
        int i15 = i14 | (sVar.d(i11) ? NewHope.SENDB_BYTES : 1024) | (sVar.d(i12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.g(z11) ? 131072 : 65536);
        if (sVar.R(i15 & 1, (74899 & i15) != 74898)) {
            long j9 = lv.s.I;
            l2.f fVarB = l2.g.b(44);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarE = m2.e(v1.n.j(qVar, j9, fVarB), 48);
            float f11 = lv.t.f28251e;
            b4.t tVarD = d2.c.D(tVarE, f11, 0.0f, f11, 0.0f, 10);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
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
            boolean z12 = i11 > 1;
            j5.j jVar = new j5.j(0);
            boolean z13 = (i15 & 112) == 32;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z13 || objM == fVar) {
                objM = new ar.d(2, function02);
                sVar.k0(objM);
            }
            v1.n.d(o00.x0.z(R.drawable.quantity_remove, sVar, 0), o30.f0.U(sVar, R.string.voice_over_quantity_selector_minus), androidx.compose.foundation.b.c(qVar, z12, null, jVar, (Function0) objM, 10), null, null, 0.0f, new i4.o(z12 ? lv.s.C : lv.s.G, 5), sVar, 8, 56);
            String strValueOf = String.valueOf(i11);
            m5.u0 u0VarA = m5.u0.a(lv.v.f28281u, 0L, 0L, null, null, 0L, null, 1, 0L, null, null, 16744447);
            long j11 = lv.s.C;
            r9.d(strValueOf, d2.c.B(qVar, lv.t.f28252f, 0.0f, 2), j11, 0L, null, 0L, null, new x5.k(1), 0L, 0, false, 0, 0, null, u0VarA, sVar, 432, 0, 130040);
            sVar = sVar;
            boolean z14 = i11 < i12;
            boolean z15 = z11 ? true : z14;
            int i16 = 0;
            j5.j jVar2 = new j5.j(0);
            boolean z16 = ((i15 & 14) == 4) | ((458752 & i15) == 131072) | ((i15 & 896) == 256);
            Object objM2 = sVar.M();
            if (z16 || objM2 == fVar) {
                objM2 = new b(z11, function03, function0, i16);
                sVar.k0(objM2);
            }
            b4.t tVarC2 = androidx.compose.foundation.b.c(qVar, z15, null, jVar2, (Function0) objM2, 10);
            n4.b bVarZ = o00.x0.z(R.drawable.quantity_add, sVar, 0);
            if (!z14) {
                j11 = lv.s.G;
            }
            v1.n.d(bVarZ, o30.f0.U(sVar, R.string.voice_over_quantity_selector_plus), tVarC2, null, null, 0.0f, new i4.o(j11, 5), sVar, 8, 56);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(function0, function02, function03, i11, i12, z11, i13);
        }
    }

    public static final void c(b4.t tVar, String str, Function0 function0, g gVar, boolean z11, m3.n nVar, int i11) {
        g gVar2;
        tVar.getClass();
        function0.getClass();
        gVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(877104968);
        int i12 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | (sVar.d(gVar.ordinal()) ? NewHope.SENDB_BYTES : 1024) | (sVar.g(z11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (!sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            gVar2 = gVar;
            sVar.U();
        } else if (str == null) {
            sVar.a0(-746733208);
            sVar.q(false);
            gVar2 = gVar;
        } else {
            sVar.a0(-746733207);
            int i13 = e.$EnumSwitchMapping$0[gVar.ordinal()];
            if (i13 == 1 || i13 == 2) {
                sVar.a0(1712838685);
                gVar2 = gVar;
                v0.n.l(tVar, str, null, gVar2 == g.REGULAR ? lv.q.REGULAR : lv.q.DANGER, lv.e.LARGE, false, z11, null, null, function0, sVar, (i12 & 14) | 24576 | ((i12 << 6) & 3670016) | ((i12 << 21) & 1879048192), 420);
                sVar.q(false);
            } else {
                if (i13 != 3) {
                    throw e0.f.v(sVar, 332345625, false);
                }
                sVar.a0(1713296059);
                v0.n.n(tVar, str, null, lv.q.REGULAR, lv.e.LARGE, false, z11, null, null, function0, sVar, (i12 & 14) | 27648 | (3670016 & (i12 << 6)) | ((i12 << 21) & 1879048192), 420);
                sVar.q(false);
                gVar2 = gVar;
            }
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d(tVar, str, function0, gVar2, z11, i11, 0);
        }
    }

    public static final void d(b4.t tVar, List list, Function1 function1, m3.n nVar, int i11, int i12) {
        int i13;
        int i14;
        list.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(432232602);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i13 | (sVar.h(list) ? 32 : 16);
        int i17 = i12 & 4;
        if (i17 != 0) {
            i14 = i16 | MLKEMEngine.KyberPolyBytes;
        } else {
            i14 = i16 | (sVar.h(function1) ? 256 : 128);
        }
        if (sVar.R(i14 & 1, (i14 & 147) != 146)) {
            if (i15 != 0) {
                tVar = b4.q.f5711a;
            }
            if (i17 != 0) {
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    objM = new defpackage.g(13);
                    sVar.k0(objM);
                }
                function1 = (Function1) objM;
            }
            d3 d3Var = x1.f7416h;
            m3.i.a(b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), u3.e.e(1066032090, sVar, new x0(tVar, list, function1)), sVar, 56);
        } else {
            sVar.U();
        }
        b4.t tVar2 = tVar;
        Function1 function12 = function1;
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(tVar2, list, function12, i11, i12, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(com.app.tgtg.model.remote.item.ItemTagInfo r28, b4.t r29, kotlin.jvm.functions.Function1 r30, m3.n r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.m.e(com.app.tgtg.model.remote.item.ItemTagInfo, b4.t, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }
}
