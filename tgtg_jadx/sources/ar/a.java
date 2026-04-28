package ar;

import a3.r2;
import android.content.res.Configuration;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import c5.v0;
import com.app.tgtg.model.remote.user.response.MonthlyMoneySaved;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.r9;
import g3.s0;
import kotlin.jvm.functions.Function0;
import l2.g;
import lv.v;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import x5.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f4732a = new u3.d(new r2(12), false, -1184810750);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f4733b = new u3.d(new r2(13), false, 1379289515);

    public static final void a(int i11, int i12, String str, boolean z11, n nVar, int i13) {
        str.getClass();
        s sVar = (s) nVar;
        sVar.c0(1370324009);
        int i14 = i13 | (sVar.d(i11) ? 4 : 2) | (sVar.d(i12) ? 32 : 16) | (sVar.f(str) ? 256 : 128) | (sVar.g(z11) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i14 & 1, (i14 & 1171) != 1170)) {
            q qVar = q.f5711a;
            t tVarA = d2.c.A(m2.t(m2.d(qVar, 1.0f), 3), lv.t.f28253g, lv.t.f28251e);
            i2 i2VarA = h2.a(i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            v1.n.d(x0.z(i11, sVar, i14 & 14), null, null, null, null, 0.0f, null, sVar, 56, 124);
            t tVarV = m2.v(qVar, 3);
            float f11 = lv.t.f28252f;
            t tVarD = d2.c.D(tVarV, f11, 0.0f, 0.0f, 0.0f, 14);
            b4.j jVar = b4.d.f5693k;
            r9.d(f0.U(sVar, i12), b3.i.g(jVar, tVarD), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            t tVarD2 = m2.d(qVar, 1.0f);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(str, b3.i.g(jVar, d2.c.D(tVarD2.then(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), f11, 0.0f, 0.0f, 0.0f, 14)), z11 ? lv.s.E : lv.s.f28217b, 0L, null, 0L, null, new k(6), 0L, 0, false, 0, 0, null, v.f28275o, sVar, (i14 >> 6) & 14, 12582912, 130040);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e(z11, str, i11, i12, i13);
        }
    }

    public static final void b(MonthlyMoneySaved monthlyMoneySaved, Function0 function0, Function0 function02, boolean z11, boolean z12, n nVar, int i11) {
        monthlyMoneySaved.getClass();
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1685125047);
        int i12 = i11 | (sVar.h(monthlyMoneySaved) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function02) ? 256 : 128) | (sVar.g(z11) ? NewHope.SENDB_BYTES : 1024) | (sVar.g(z12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            t tVarQ = m2.q(q.f5711a, ((Configuration) sVar.j(v0.f7389a)).screenWidthDp);
            float f11 = lv.t.f28253g;
            s0.b(d2.c.z(tVarQ, f11), g.b(f11), s0.p(lv.s.J, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(1975692695, sVar, new b(monthlyMoneySaved, z12, function0, z11, function02)), sVar, 196608, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(monthlyMoneySaved, function0, function02, z11, z12, i11);
        }
    }
}
