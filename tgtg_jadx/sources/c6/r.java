package c6;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import b5.m0;
import c5.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7755a = b.f7676e;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.jvm.functions.Function1 r17, b4.t r18, kotlin.jvm.functions.Function1 r19, kotlin.jvm.functions.Function1 r20, kotlin.jvm.functions.Function1 r21, m3.n r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.r.a(kotlin.jvm.functions.Function1, b4.t, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    public static final void b(Function1 function1, b4.t tVar, Function1 function12, m3.n nVar, int i11, int i12) {
        int i13;
        b4.t tVar2;
        Function1 function13;
        int i14;
        b4.t tVar3;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1783766393);
        int i15 = i11 | (sVar.h(function1) ? 4 : 2);
        int i16 = i12 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i11 & 48) == 0) {
            i15 |= sVar.f(tVar) ? 32 : 16;
        }
        int i17 = i12 & 4;
        if (i17 != 0) {
            i13 = i15 | MLKEMEngine.KyberPolyBytes;
        } else {
            i13 = i15 | (sVar.h(function12) ? 256 : 128);
        }
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            if (i16 != 0) {
                i14 = i13;
                tVar3 = b4.q.f5711a;
            } else {
                i14 = i13;
                tVar3 = tVar;
            }
            b bVar = f7755a;
            Function1 function14 = i17 != 0 ? bVar : function12;
            a(function1, tVar3, null, bVar, function14, sVar, (i14 & 14) | 3072 | (i14 & 112) | ((i14 << 6) & 57344), 4);
            tVar2 = tVar3;
            function13 = function14;
        } else {
            sVar.U();
            tVar2 = tVar;
            function13 = function12;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m(function1, tVar2, function13, i11, i12);
        }
    }

    public static final d0 c(m0 m0Var) {
        d0 d0Var = m0Var.f5879p;
        if (d0Var != null) {
            return d0Var;
        }
        throw b3.i.D("Required value was null.");
    }

    public static final Function0 d(Function1 function1, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        int iHashCode = Long.hashCode(sVar.T);
        Context context = (Context) sVar.j(v0.f7390b);
        m3.q qVarA = m3.i.A(sVar);
        y3.e eVar = (y3.e) sVar.j(y3.g.f45406a);
        View view = (View) sVar.j(v0.f7394f);
        boolean zH = ((((i11 & 14) ^ 6) > 4 && sVar.f(function1)) || (i11 & 6) == 4) | sVar.h(context) | sVar.h(qVarA) | sVar.h(eVar) | sVar.d(iHashCode) | sVar.h(view);
        Object objM = sVar.M();
        if (zH || objM == m3.m.f29332a) {
            p pVar = new p(context, function1, qVarA, eVar, iHashCode, view);
            sVar.k0(pVar);
            objM = pVar;
        }
        return (Function0) objM;
    }

    public static final void e(m3.n nVar, b4.t tVar, int i11, z5.c cVar, LifecycleOwner lifecycleOwner, ea.f fVar, z5.m mVar, u3.i iVar) {
        b5.j.R.getClass();
        m3.i.C(iVar, b5.i.f5842e, nVar);
        m3.i.C(tVar, n.f7736g, nVar);
        m3.i.C(cVar, n.f7737h, nVar);
        m3.i.C(lifecycleOwner, n.f7738i, nVar);
        m3.i.C(fVar, n.f7739j, nVar);
        m3.i.C(mVar, n.f7740k, nVar);
        m3.i.v(nVar, Integer.valueOf(i11), b5.i.f5844g);
    }
}
