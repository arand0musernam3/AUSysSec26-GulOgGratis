package rb;

import androidx.work.impl.WorkDatabase;
import ib.g0;
import ib.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jb.d0;
import jb.s;
import kotlin.collections.i0;
import o00.x0;
import qb.r;
import qb.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f37842a = {13, 15, 14};

    public static final void a(s sVar, String str) {
        d0 d0VarB;
        WorkDatabase workDatabase = sVar.f24926c;
        workDatabase.getClass();
        w wVarX = workDatabase.x();
        qb.b bVarS = workDatabase.s();
        ArrayList arrayListJ = kotlin.collections.d0.j(str);
        while (!arrayListJ.isEmpty()) {
            String str2 = (String) i0.x(arrayListJ);
            g0 g0VarD = wVarX.d(str2);
            if (g0VarD != g0.SUCCEEDED && g0VarD != g0.FAILED) {
                ((Number) x0.A(wVarX.f36870a, false, true, new qb.s(str2, 1))).intValue();
            }
            arrayListJ.addAll(bVarS.a(str2));
        }
        jb.f fVar = sVar.f24929f;
        fVar.getClass();
        synchronized (fVar.f24893k) {
            ib.w.d().a(jb.f.l, "Processor cancelling " + str);
            fVar.f24891i.add(str);
            d0VarB = fVar.b(str);
        }
        jb.f.d(str, d0VarB, 1);
        Iterator it = sVar.f24928e.iterator();
        while (it.hasNext()) {
            ((jb.h) it.next()).d(str);
        }
    }

    public static final void b(WorkDatabase workDatabase, ib.b bVar, jb.o oVar) {
        int i11;
        workDatabase.getClass();
        bVar.getClass();
        ArrayList arrayListJ = kotlin.collections.d0.j(oVar);
        int i12 = 0;
        while (!arrayListJ.isEmpty()) {
            List list = ((jb.o) i0.x(arrayListJ)).f24911d;
            list.getClass();
            if (list.isEmpty()) {
                i11 = 0;
            } else {
                Iterator it = list.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (!((k0) it.next()).f23745b.f36837j.f23719i.isEmpty() && (i11 = i11 + 1) < 0) {
                        kotlin.collections.d0.m();
                        throw null;
                    }
                }
            }
            i12 += i11;
        }
        if (i12 == 0) {
            return;
        }
        int iIntValue = ((Number) x0.A(workDatabase.x().f36870a, true, false, new r(2))).intValue();
        int i13 = bVar.f23701j;
        if (iIntValue + i12 <= i13) {
            return;
        }
        i4.a.f(r8.k.i(i12, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", r8.k.r(i13, iIntValue, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
    }

    public static final qb.o c(List list, qb.o oVar) {
        list.getClass();
        oVar.getClass();
        boolean zB = oVar.f36832e.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zB2 = oVar.f36832e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zB3 = oVar.f36832e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (zB || !zB2 || !zB3) {
            return oVar;
        }
        String str = oVar.f36830c;
        lz.i iVar = new lz.i(22);
        LinkedHashMap linkedHashMap = (LinkedHashMap) iVar.f28446b;
        ib.h hVar = oVar.f36832e;
        hVar.getClass();
        iVar.F(hVar.f23727a);
        linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        ib.h hVar2 = new ib.h(linkedHashMap);
        ex.i.L(hVar2);
        return qb.o.b(oVar, null, null, hVar2, 0, 0L, 0, 0, 0L, 0, 33554411);
    }
}
