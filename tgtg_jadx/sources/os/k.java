package os;

import b4.t;
import d2.w;
import d2.y;
import i4.u0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import lv.v;
import m2.g0;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m5.l0;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import q5.o;
import q5.r;
import x5.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final void a(t tVar, int i11, int i12, String str, Function1 function1, n nVar, int i13) {
        int i14;
        tVar.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(81672848);
        if ((i13 & 6) == 0) {
            i14 = i13 | (sVar.f(tVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        int i15 = i14 | (sVar.d(i11) ? 32 : 16) | (sVar.d(i12) ? 256 : 128) | (sVar.f(str) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function1) ? 16384 : 8192);
        if (sVar.R(i15 & 1, (i15 & 9363) != 9362)) {
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            sVar.a0(-1843720627);
            m5.e eVar = new m5.e();
            String strU = f0.U(sVar, i12);
            String strT = f0.T(i11, new Object[]{strU}, sVar);
            int iG = StringsKt.G(strT, strU, 0, false, 6);
            int length = strU.length() + iG;
            eVar.c(strT);
            long j9 = lv.s.f28217b;
            eVar.b(new l0(j9, 0L, (r) null, (q5.n) null, (o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (p) null, (t5.c) null, 0L, x5.l.f43854c, (u0) null, 61438), iG, length);
            if (str != null) {
                eVar.a("URL", iG, length, str);
            }
            m5.h hVarJ = eVar.j();
            sVar.q(false);
            m5.u0 u0VarA = m5.u0.a(v.f28274n, j9, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446);
            boolean zF = sVar.f(hVarJ) | ((i15 & 57344) == 16384);
            Object objM = sVar.M();
            if (zF || objM == m.f29332a) {
                objM = new j(hVarJ, function1, 0);
                sVar.k0(objM);
            }
            g0.c(hVarJ, null, u0VarA, false, 0, 0, null, (Function1) objM, sVar, 0, 122);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.g(tVar, i11, i12, str, function1, i13);
        }
    }
}
