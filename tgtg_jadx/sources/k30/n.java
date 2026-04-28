package k30;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparator f25913d;

    public n(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f25913d = comparator;
    }

    public final e0 e() {
        e0 e0Var;
        Object[] objArrCopyOf = this.f25870a;
        int i11 = this.f25871b;
        Comparator comparator = this.f25913d;
        if (i11 == 0) {
            e0Var = p.n(comparator);
        } else {
            int i12 = p.f25916f;
            m0.c.T(i11, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i11, comparator);
            int i13 = 1;
            for (int i14 = 1; i14 < i11; i14++) {
                Object obj = objArrCopyOf[i14];
                if (comparator.compare(obj, objArrCopyOf[i13 - 1]) != 0) {
                    objArrCopyOf[i13] = obj;
                    i13++;
                }
            }
            Arrays.fill(objArrCopyOf, i13, i11, (Object) null);
            if (i13 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i13);
            }
            e0Var = new e0(h.j(i13, objArrCopyOf), comparator);
        }
        this.f25871b = e0Var.f25895g.size();
        this.f25872c = true;
        return e0Var;
    }
}
