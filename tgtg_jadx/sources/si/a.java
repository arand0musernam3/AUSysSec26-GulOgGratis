package si;

import android.app.Activity;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import c5.a1;
import d2.c;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import e.k;
import g3.ga;
import g3.n1;
import g3.r9;
import g3.s0;
import g3.x5;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import lv.v;
import m3.b1;
import m3.n;
import m3.s;
import m3.w1;
import mn.g;
import mv.p0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import pm.m;
import rk.a0;
import u3.d;
import u3.e;
import v4.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f39027a = new d(new o9.a(26), false, 621514929);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39028b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f39029c = 0;

    public static final void a(int i11, List list, n nVar, int i12) {
        s sVar = (s) nVar;
        sVar.c0(-1182045492);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(list) ? 32 : 16);
        if (!sVar.R(i13 & 1, (i13 & 19) != 18)) {
            sVar.U();
        } else if (i11 != list.size() - 1) {
            sVar.a0(119695402);
            s0.g(c.B(q.f5711a, 16, 0.0f, 2), 1, lv.s.H, sVar, 438, 0);
            sVar.q(false);
        } else {
            sVar.a0(119860694);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(list, i11, i12, 20);
        }
    }

    public static final void b(Pair pair, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1267274442);
        int i12 = i11 | (sVar.h(pair) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            String str = (String) pair.f26485a;
            a1 a1Var = p0.f30209a;
            str.getClass();
            String str2 = YearMonth.parse(str).format(DateTimeFormatter.ofPattern("MMM yyyy", Locale.getDefault()));
            if (str2 != null) {
                sVar.a0(610501658);
                i2 i2VarA = h2.a(i.f13801a, b4.d.f5692j, sVar, 0);
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                q qVar = q.f5711a;
                t tVarC = b4.a.c(qVar, sVar);
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
                float f11 = 16;
                r9.d(str2, c.D(qVar, f11, f11, 0.0f, 8, 4), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28277q, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                sVar = sVar;
                sVar.q(true);
                sVar.q(false);
            } else {
                sVar.a0(610868760);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m(pair, i11, 7);
        }
    }

    public static final void c(t tVar, Activity activity, b bVar, Function0 function0, n nVar, int i11) {
        s sVar;
        t tVar2;
        Activity activity2;
        Activity activity3;
        t tVar3;
        bVar.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(2127666736);
        int i12 = i11 | 22 | (sVar2.h(bVar) ? 256 : 128) | (sVar2.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            sVar2.W();
            if ((i11 & 1) == 0 || sVar2.z()) {
                activity3 = (Activity) sVar2.j(k.f15295a);
                tVar3 = q.f5711a;
            } else {
                sVar2.U();
                tVar3 = tVar;
                activity3 = activity;
            }
            sVar2.r();
            b1 b1VarN = m3.i.n(bVar.f39032c, sVar2, 0);
            n1 n1VarA = ga.a(sVar2);
            Boolean bool = Boolean.TRUE;
            boolean zH = sVar2.h(bVar) | sVar2.h(activity3);
            Object objM = sVar2.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new g(bVar, activity3, null, 24);
                sVar2.k0(objM);
            }
            m3.i.h(bool, (Function2) objM, sVar2);
            sVar = sVar2;
            x5.a(f.a(tVar3.then(m2.f13850c), n1VarA.f19136e, null), e.e(-170756628, sVar2, new a0(4, function0, n1VarA)), null, null, null, 0, lv.s.I, 0L, null, e.e(-1243973759, sVar2, new ap.e(bVar, b1VarN, activity3, 19)), sVar, 806879280, 444);
            t tVar4 = tVar3;
            activity2 = activity3;
            tVar2 = tVar4;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
            activity2 = activity;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(tVar2, activity2, i11, bVar, function0, 12);
        }
    }
}
