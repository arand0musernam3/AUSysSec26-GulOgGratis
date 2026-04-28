package y00;

import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.f9;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.k8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.r8;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e9 f45217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f45218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f45219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q1.e f45220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q1.e f45221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f45222h;

    public u4(c cVar, String str, e9 e9Var, BitSet bitSet, BitSet bitSet2, q1.e eVar, q1.e eVar2) {
        this.f45222h = cVar;
        this.f45215a = str;
        this.f45218d = bitSet;
        this.f45219e = bitSet2;
        this.f45220f = eVar;
        this.f45221g = new q1.e(0);
        for (Integer num : (q1.b) eVar2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f45221g.put(num, arrayList);
        }
        this.f45216b = false;
        this.f45217c = e9Var;
    }

    public final void a(g9.a0 a0Var) {
        int iC = a0Var.c();
        if (((Boolean) a0Var.f20099c) != null) {
            this.f45219e.set(iC, true);
        }
        Boolean bool = (Boolean) a0Var.f20100d;
        if (bool != null) {
            this.f45218d.set(iC, bool.booleanValue());
        }
        if (((Long) a0Var.f20101e) != null) {
            Integer numValueOf = Integer.valueOf(iC);
            q1.e eVar = this.f45220f;
            Long l = (Long) eVar.get(numValueOf);
            long jLongValue = ((Long) a0Var.f20101e).longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                eVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (((Long) a0Var.f20102f) != null) {
            Integer numValueOf2 = Integer.valueOf(iC);
            q1.e eVar2 = this.f45221g;
            List arrayList = (List) eVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                eVar2.put(numValueOf2, arrayList);
            }
            if (a0Var.d()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.s3.a();
            n1 n1Var = (n1) this.f45222h.f21216b;
            g gVar = n1Var.f44985d;
            f0 f0Var = g0.F0;
            String str = this.f45215a;
            if (gVar.A(str, f0Var) && a0Var.e()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.s3.a();
            boolean zA = n1Var.f44985d.A(str, f0Var);
            Long l7 = (Long) a0Var.f20102f;
            if (!zA) {
                arrayList.add(Long.valueOf(l7.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l7.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final l8 b(int i11) {
        ArrayList arrayList;
        List list;
        k8 k8VarA = l8.A();
        k8VarA.b();
        ((l8) k8VarA.f11483b).B(i11);
        k8VarA.b();
        ((l8) k8VarA.f11483b).E(this.f45216b);
        e9 e9Var = this.f45217c;
        if (e9Var != null) {
            k8VarA.b();
            ((l8) k8VarA.f11483b).D(e9Var);
        }
        d9 d9VarB = e9.B();
        ArrayList arrayListV = n4.V(this.f45218d);
        d9VarB.b();
        ((e9) d9VarB.f11483b).F(arrayListV);
        ArrayList arrayListV2 = n4.V(this.f45219e);
        d9VarB.b();
        ((e9) d9VarB.f11483b).D(arrayListV2);
        q1.e eVar = this.f45220f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f35782c);
            for (Integer num : (q1.b) eVar.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) eVar.get(num);
                if (l != null) {
                    q8 q8VarX = r8.x();
                    q8VarX.b();
                    ((r8) q8VarX.f11483b).y(iIntValue);
                    long jLongValue = l.longValue();
                    q8VarX.b();
                    ((r8) q8VarX.f11483b).z(jLongValue);
                    arrayList2.add((r8) q8VarX.d());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            d9VarB.b();
            ((e9) d9VarB.f11483b).H(arrayList);
        }
        q1.e eVar2 = this.f45221g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f35782c);
            for (Integer num2 : (q1.b) eVar2.keySet()) {
                f9 f9VarY = g9.y();
                int iIntValue2 = num2.intValue();
                f9VarY.b();
                ((g9) f9VarY.f11483b).z(iIntValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    f9VarY.b();
                    ((g9) f9VarY.f11483b).A(list2);
                }
                arrayList3.add((g9) f9VarY.d());
            }
            list = arrayList3;
        }
        d9VarB.b();
        ((e9) d9VarB.f11483b).J(list);
        k8VarA.b();
        ((l8) k8VarA.f11483b).C((e9) d9VarB.d());
        return (l8) k8VarA.d();
    }

    public u4(c cVar, String str) {
        this.f45222h = cVar;
        this.f45215a = str;
        this.f45216b = true;
        this.f45218d = new BitSet();
        this.f45219e = new BitSet();
        this.f45220f = new q1.e(0);
        this.f45221g = new q1.e(0);
    }
}
