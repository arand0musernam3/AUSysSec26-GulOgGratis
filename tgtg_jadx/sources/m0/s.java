package m0;

import com.braze.h2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f28587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f28588c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f28589a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new s0.h1(0));
        f28587b = new s(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new s0.h1(1));
        f28588c = new s(linkedHashSet2);
    }

    public s(LinkedHashSet linkedHashSet) {
        this.f28589a = linkedHashSet;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (o oVar : this.f28589a) {
            List<q> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            s0.h1 h1Var = (s0.h1) oVar;
            h1Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (q qVar : listUnmodifiableList) {
                pd.g.i("The camera info doesn't contain internal implementation.", qVar instanceof s0.g0);
                if (qVar.k() == h1Var.f38338b) {
                    arrayList3.add(qVar);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Integer num = null;
        for (o oVar : this.f28589a) {
            if (oVar instanceof s0.h1) {
                Integer numValueOf = Integer.valueOf(((s0.h1) oVar).f38338b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    h2.b("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final s0.i0 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((s0.i0) it.next()).b());
        }
        ArrayList arrayListA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            s0.i0 i0Var = (s0.i0) it2.next();
            if (arrayListA.contains(i0Var.b())) {
                linkedHashSet2.add(i0Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (s0.i0) it3.next();
        }
        StringBuilder sb2 = new StringBuilder("Cams:");
        sb2.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            s0.g0 g0VarQ = ((s0.i0) it4.next()).q();
            sb2.append(" Id:" + g0VarQ.d() + "  Lens:" + g0VarQ.k());
        }
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        LinkedHashSet<o> linkedHashSet3 = this.f28589a;
        sb3.append("PhyId:null  Filters:" + linkedHashSet3.size());
        for (o oVar : linkedHashSet3) {
            sb3.append(" Id:");
            oVar.getClass();
            sb3.append(o.f28571a);
            if (oVar instanceof s0.h1) {
                sb3.append(" LensFilter:");
                sb3.append(((s0.h1) oVar).f38338b);
            }
        }
        i4.a.f(j4.s.k("No available camera can be found. ", string, " ", sb3.toString()));
        return null;
    }
}
