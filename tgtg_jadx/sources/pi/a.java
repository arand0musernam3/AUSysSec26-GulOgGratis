package pi;

import b4.t;
import c5.d2;
import com.app.tgtg.model.remote.user.response.charity.CharityDaySchedule;
import com.app.tgtg.model.remote.user.response.charity.CharityDayScheduleStore;
import d2.m2;
import d2.w;
import d2.y;
import i4.g0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lp.v;
import m3.s;
import m3.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(t tVar, CharityDaySchedule charityDaySchedule, Function0 function0, Function1 function1, m3.n nVar, int i11) {
        charityDaySchedule.getClass();
        function0.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(345717190);
        int i12 = (sVar.f(charityDaySchedule) ? 32 : 16) | i11 | (sVar.h(function0) ? 256 : 128) | (sVar.h(function1) ? 2048 : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            t tVarJ = v1.n.j(tVar, lv.s.I, g0.f23254b);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
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
            boolean z11 = charityDaySchedule instanceof CharityDaySchedule.Unavailable;
            b4.q qVar = b4.q.f5711a;
            if (z11) {
                sVar.a0(1855300698);
                wd.a.b(((i12 >> 3) & 112) | 6, d2.j(m2.c(m2.d(qVar, 1.0f), 1.0f), "CharityPlanDayUnavailable"), function0, sVar);
                sVar.q(false);
            } else if (charityDaySchedule instanceof CharityDaySchedule.NoPickups) {
                sVar.a0(1855685439);
                xz.b.a(((i12 >> 3) & 112) | 6, d2.j(m2.t(m2.d(qVar, 1.0f), 3), "CharityPlanInfo"), function0, sVar);
                v0.n.b(d2.j(m2.c(m2.d(qVar, 1.0f), 1.0f), "CharityPlanDayNoPlanned"), sVar, 6);
                sVar.q(false);
            } else {
                if (!(charityDaySchedule instanceof CharityDaySchedule.Available)) {
                    throw e0.f.v(sVar, -1602720376, false);
                }
                sVar.a0(1856282716);
                xz.b.a(((i12 >> 3) & 112) | 6, d2.j(m2.t(m2.d(qVar, 1.0f), 3), "CharityPlanInfo"), function0, sVar);
                t tVarJ2 = d2.j(m2.d(qVar, 1.0f), "CharityPlanDayCollections");
                List<CharityDayScheduleStore> stores = ((CharityDaySchedule.Available) charityDaySchedule).getStores();
                boolean z12 = (i12 & 7168) == 2048;
                Object objM = sVar.M();
                if (z12 || objM == m3.m.f29332a) {
                    objM = new defpackage.d(function1, 26);
                    sVar.k0(objM);
                }
                pd.g.c(6, tVarJ2, stores, (Function1) objM, sVar);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(tVar, charityDaySchedule, function0, function1, i11, 8);
        }
    }
}
