package je;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25065a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f25066b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f25067c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f25068d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qe.l f25069e;

    public m(qe.l lVar) {
        this.f25069e = lVar;
    }

    public final void a(Path.Op op2) {
        Path path = this.f25066b;
        path.reset();
        Path path2 = this.f25065a;
        path2.reset();
        ArrayList arrayList = this.f25068d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                ArrayList arrayList2 = (ArrayList) dVar.f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathG = ((n) arrayList2.get(size2)).g();
                    Matrix matrixE = dVar.f25008d;
                    ke.r rVar = dVar.l;
                    if (rVar != null) {
                        matrixE = rVar.e();
                    } else {
                        matrixE.reset();
                    }
                    pathG.transform(matrixE);
                    path.addPath(pathG);
                }
            } else {
                path.addPath(nVar.g());
            }
        }
        int i11 = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List listF = dVar2.f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listF;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                Path pathG2 = ((n) arrayList3.get(i11)).g();
                Matrix matrixE2 = dVar2.f25008d;
                ke.r rVar2 = dVar2.l;
                if (rVar2 != null) {
                    matrixE2 = rVar2.e();
                } else {
                    matrixE2.reset();
                }
                pathG2.transform(matrixE2);
                path2.addPath(pathG2);
                i11++;
            }
        } else {
            path2.set(nVar2.g());
        }
        this.f25067c.op(path2, path, op2);
    }

    @Override // je.c
    public final void c(List list, List list2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f25068d;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i11)).c(list, list2);
            i11++;
        }
    }

    @Override // je.j
    public final void f(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof n) {
                this.f25068d.add((n) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // je.n
    public final Path g() {
        Path path = this.f25067c;
        path.reset();
        qe.l lVar = this.f25069e;
        if (!lVar.f36983b) {
            int i11 = l.f25064a[lVar.f36982a.ordinal()];
            if (i11 == 1) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList = this.f25068d;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((n) arrayList.get(i12)).g());
                    i12++;
                }
            } else {
                if (i11 == 2) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (i11 == 3) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i11 == 4) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (i11 == 5) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
