package s0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38443a;

    public r1(ArrayList arrayList) {
        this.f38443a = new ArrayList(arrayList);
    }

    public static String d(r1 r1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = r1Var.f38443a.iterator();
        while (it.hasNext()) {
            arrayList.add(((n1) it.next()).getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public final boolean a(Class cls) {
        Iterator it = this.f38443a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((n1) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final n1 b(Class cls) {
        for (n1 n1Var : this.f38443a) {
            if (n1Var.getClass() == cls) {
                return n1Var;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (n1 n1Var : this.f38443a) {
            if (cls.isAssignableFrom(n1Var.getClass())) {
                arrayList.add(n1Var);
            }
        }
        return arrayList;
    }
}
