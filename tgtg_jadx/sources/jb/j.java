package jb;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24900a = ib.w.f("Schedulers");

    public static void a(qb.w wVar, ib.y yVar, List list) {
        if (list.size() > 0) {
            yVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wVar.g(jCurrentTimeMillis, ((qb.o) it.next()).f36828a);
            }
        }
    }

    public static void b(ib.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        qb.w wVarX = workDatabase.x();
        workDatabase.b();
        try {
            y9.v vVar = wVarX.f36870a;
            y9.v vVar2 = wVarX.f36870a;
            List list2 = (List) x0.A(vVar, true, false, new qb.r(1));
            a(wVarX, bVar.f23695d, list2);
            List list3 = (List) x0.A(vVar2, true, false, new f2.y(bVar.f23702k, 4));
            a(wVarX, bVar.f23695d, list3);
            list3.addAll(list2);
            List list4 = (List) x0.A(vVar2, true, false, new qb.r(4));
            workDatabase.q();
            workDatabase.f();
            if (list3.size() > 0) {
                qb.o[] oVarArr = (qb.o[]) list3.toArray(new qb.o[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.b()) {
                        hVar.a(oVarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                qb.o[] oVarArr2 = (qb.o[]) list4.toArray(new qb.o[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h hVar2 = (h) it2.next();
                    if (!hVar2.b()) {
                        hVar2.a(oVarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
