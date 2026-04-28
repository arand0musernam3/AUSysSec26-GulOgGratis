package i0;

import e0.e1;
import e0.o1;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22637a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f22637a) {
            case 0:
                Iterator it = ((e0.e0) obj).f15330b.iterator();
                if (it.hasNext()) {
                    e0 e0Var = (e0) it.next();
                    List list = g0.f22648n;
                    e1 e1Var = e0Var.f22632h;
                    list.getClass();
                    Integer numValueOf = Integer.valueOf(list.indexOf(e1Var));
                    while (it.hasNext()) {
                        e0 e0Var2 = (e0) it.next();
                        List list2 = g0.f22648n;
                        e1 e1Var2 = e0Var2.f22632h;
                        list2.getClass();
                        Integer numValueOf2 = Integer.valueOf(list2.indexOf(e1Var2));
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    Iterator it2 = ((e0.e0) obj2).f15330b.iterator();
                    if (it2.hasNext()) {
                        e0 e0Var3 = (e0) it2.next();
                        List list3 = g0.f22648n;
                        e1 e1Var3 = e0Var3.f22632h;
                        list3.getClass();
                        Integer numValueOf3 = Integer.valueOf(list3.indexOf(e1Var3));
                        while (it2.hasNext()) {
                            e0 e0Var4 = (e0) it2.next();
                            List list4 = g0.f22648n;
                            e1 e1Var4 = e0Var4.f22632h;
                            list4.getClass();
                            Integer numValueOf4 = Integer.valueOf(list4.indexOf(e1Var4));
                            if (numValueOf3.compareTo(numValueOf4) < 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                    }
                }
                i1.c();
                break;
            default:
                Iterator it3 = ((e0.e0) obj).f15330b.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf5 = Integer.valueOf(g0.f22650p.indexOf(new o1(((e0) it3.next()).f22627c)));
                    while (it3.hasNext()) {
                        Integer numValueOf6 = Integer.valueOf(g0.f22650p.indexOf(new o1(((e0) it3.next()).f22627c)));
                        if (numValueOf5.compareTo(numValueOf6) < 0) {
                            numValueOf5 = numValueOf6;
                        }
                    }
                    Iterator it4 = ((e0.e0) obj2).f15330b.iterator();
                    if (it4.hasNext()) {
                        Integer numValueOf7 = Integer.valueOf(g0.f22650p.indexOf(new o1(((e0) it4.next()).f22627c)));
                        while (it4.hasNext()) {
                            Integer numValueOf8 = Integer.valueOf(g0.f22650p.indexOf(new o1(((e0) it4.next()).f22627c)));
                            if (numValueOf7.compareTo(numValueOf8) < 0) {
                                numValueOf7 = numValueOf8;
                            }
                        }
                    }
                }
                i1.c();
                break;
        }
        return 0;
    }
}
