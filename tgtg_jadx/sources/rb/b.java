package rb;

import a40.d0;
import androidx.work.impl.WorkDatabase;
import ib.w;
import java.util.HashSet;
import java.util.Iterator;
import jb.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37828a = w.f("EnqueueRunnable");

    public static void a(jb.o oVar) {
        boolean z11;
        s sVar = oVar.f24908a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(oVar.f24912e);
        HashSet hashSetB = jb.o.b(oVar);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(oVar.f24912e);
                z11 = false;
                break;
            } else if (hashSetB.contains((String) it.next())) {
                z11 = true;
                break;
            }
        }
        if (z11) {
            d0.q("WorkContinuation has cycles (", oVar, ")");
            return;
        }
        WorkDatabase workDatabase = sVar.f24926c;
        ib.b bVar = sVar.f24925b;
        workDatabase.b();
        try {
            g.b(workDatabase, bVar, oVar);
            boolean zB = b(oVar);
            workDatabase.q();
            if (zB) {
                jb.j.b(bVar, sVar.f24926c, sVar.f24928e);
            }
        } finally {
            workDatabase.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(jb.o r23) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.b.b(jb.o):boolean");
    }
}
