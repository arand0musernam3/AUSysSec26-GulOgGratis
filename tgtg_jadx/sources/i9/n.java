package i9;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f0;
import ao.e1;
import c5.n2;
import g3.f6;
import g3.y0;
import g9.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final void a(p pVar, m3.n nVar, int i11) {
        z3.r rVar;
        p pVar2 = pVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(294589392);
        if ((((sVar.h(pVar2) ? 4 : 2) | i11) & 3) == 2 && sVar.B()) {
            sVar.U();
        } else {
            y3.c cVarF = y3.j.f(sVar);
            b1 b1VarN = m3.i.n(pVar2.b().f20180e, sVar, 0);
            List list = (List) b1VarN.getValue();
            boolean zBooleanValue = ((Boolean) sVar.j(n2.f7299a)).booleanValue();
            boolean zF = sVar.f(list);
            Object objM = sVar.M();
            Object obj = m3.m.f29332a;
            Object obj2 = objM;
            if (zF || objM == obj) {
                z3.r rVar2 = new z3.r();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (zBooleanValue ? true : ((g9.l) obj3).f20169h.f27523j.f3435d.a(Lifecycle.State.STARTED)) {
                        arrayList.add(obj3);
                    }
                }
                rVar2.addAll(arrayList);
                sVar.k0(rVar2);
                obj2 = rVar2;
            }
            z3.r rVar3 = (z3.r) obj2;
            b(rVar3, (List) b1VarN.getValue(), sVar, 0);
            b1 b1VarN2 = m3.i.n(pVar2.b().f20181f, sVar, 0);
            Object objM2 = sVar.M();
            if (objM2 == obj) {
                objM2 = new z3.r();
                sVar.k0(objM2);
            }
            z3.r rVar4 = (z3.r) objM2;
            sVar.a0(-367418626);
            ListIterator listIterator = rVar3.listIterator();
            while (true) {
                v70.b bVar = (v70.b) listIterator;
                if (!bVar.hasNext()) {
                    break;
                }
                g9.l lVar = (g9.l) bVar.next();
                z zVar = lVar.f20163b;
                zVar.getClass();
                o oVar = (o) zVar;
                boolean zH = sVar.h(pVar2) | sVar.h(lVar);
                Object objM3 = sVar.M();
                if (zH || objM3 == obj) {
                    objM3 = new i2.e(3, pVar2, lVar);
                    sVar.k0(objM3);
                }
                ex.i.b((Function0) objM3, oVar.f23532g, u3.e.e(1129586364, sVar, new m(lVar, pVar2, cVarF, rVar4, oVar)), sVar, MLKEMEngine.KyberPolyBytes, 0);
                pVar2 = pVar2;
                cVarF = cVarF;
                rVar4 = rVar4;
            }
            p pVar3 = pVar2;
            z3.r rVar5 = rVar4;
            sVar.q(false);
            Set set = (Set) b1VarN2.getValue();
            boolean zF2 = sVar.f(b1VarN2) | sVar.h(pVar3);
            Object objM4 = sVar.M();
            if (zF2 || objM4 == obj) {
                pVar2 = pVar3;
                rVar = rVar5;
                Object e1Var = new e1(b1VarN2, pVar2, rVar, null, 7);
                sVar.k0(e1Var);
                objM4 = e1Var;
            } else {
                pVar2 = pVar3;
                rVar = rVar5;
            }
            m3.i.g(set, rVar, (Function2) objM4, sVar);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(pVar2, i11, 17);
        }
    }

    public static final void b(List list, Collection collection, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1537894851);
        if ((((sVar.h(list) ? 4 : 2) | i11 | (sVar.h(collection) ? 32 : 16)) & 19) == 18 && sVar.B()) {
            sVar.U();
        } else {
            boolean zBooleanValue = ((Boolean) sVar.j(n2.f7299a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                g9.l lVar = (g9.l) it.next();
                f0 f0Var = lVar.f20169h.f27523j;
                boolean zG = sVar.g(zBooleanValue) | sVar.h(list) | sVar.h(lVar);
                Object objM = sVar.M();
                if (zG || objM == m3.m.f29332a) {
                    objM = new f6(lVar, zBooleanValue, list, 4);
                    sVar.k0(objM);
                }
                m3.i.d(f0Var, (Function1) objM, sVar);
            }
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(list, collection, i11, 10);
        }
    }
}
