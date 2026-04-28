package s0;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends t1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a1.b f38476j = new a1.b(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38477k = true;
    public final StringBuilder l = new StringBuilder();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f38478m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f38479n = new ArrayList();

    public final void a(z1 z1Var) {
        r0 r0Var = z1Var.f38494g;
        int i11 = r0Var.f38440c;
        l1 l1Var = r0Var.f38439b;
        i0.w wVar = this.f38447b;
        if (i11 != -1) {
            this.f38478m = true;
            int i12 = wVar.f22745b;
            List list = z1.f38487j;
            if (list.indexOf(Integer.valueOf(i11)) < list.indexOf(Integer.valueOf(i12))) {
                i11 = i12;
            }
            wVar.f22745b = i11;
        }
        Range rangeA = r0Var.a();
        Range range = n.f38401h;
        boolean zEquals = rangeA.equals(range);
        StringBuilder sb2 = this.l;
        if (!zEquals) {
            i1 i1Var = (i1) wVar.f22747d;
            g gVar = r0.f38437h;
            boolean zEquals2 = ((Range) i1Var.i(gVar, range)).equals(range);
            i1 i1Var2 = (i1) wVar.f22747d;
            if (zEquals2) {
                i1Var2.v(gVar, rangeA);
            } else if (!((Range) i1Var2.i(gVar, range)).equals(rangeA)) {
                this.f38477k = false;
                String str = "Different ExpectedFrameRateRange values; current = " + ((Range) ((i1) wVar.f22747d).i(gVar, range)) + ", new = " + rangeA;
                wd.a.r("ValidatingBuilder", str);
                sb2.append(str);
            }
        }
        g gVar2 = o2.V0;
        Integer num = (Integer) l1Var.i(gVar2, 0);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            wVar.getClass();
            if (iIntValue != 0) {
                ((i1) wVar.f22747d).v(gVar2, num);
            }
        }
        g gVar3 = o2.W0;
        Integer num2 = (Integer) l1Var.i(gVar3, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        if (iIntValue2 != 0) {
            wVar.getClass();
            if (iIntValue2 != 0) {
                ((i1) wVar.f22747d).v(gVar3, num2);
            }
        }
        k2 k2Var = r0Var.f38442e;
        j1 j1Var = (j1) wVar.f22749f;
        HashSet hashSet = (HashSet) wVar.f22746c;
        j1Var.f38373a.putAll((Map) k2Var.f38373a);
        this.f38448c.addAll(z1Var.f38490c);
        this.f38449d.addAll(z1Var.f38491d);
        wVar.b(r0Var.f38441d);
        this.f38450e.addAll(z1Var.f38492e);
        w1 w1Var = z1Var.f38493f;
        if (w1Var != null) {
            this.f38479n.add(w1Var);
        }
        InputConfiguration inputConfiguration = z1Var.f38496i;
        if (inputConfiguration != null) {
            this.f38452g = inputConfiguration;
        }
        ArrayList arrayList = z1Var.f38488a;
        LinkedHashSet<l> linkedHashSet = this.f38446a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(r0Var.f38438a));
        ArrayList arrayList2 = new ArrayList();
        for (l lVar : linkedHashSet) {
            arrayList2.add(lVar.f38374a);
            Iterator it = lVar.f38375b.iterator();
            while (it.hasNext()) {
                arrayList2.add((x0) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            wd.a.p("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.f38477k = false;
            sb2.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i13 = z1Var.f38495h;
        int i14 = this.f38453h;
        if (i13 != i14 && i13 != 0 && i14 != 0) {
            wd.a.p("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.f38477k = false;
            sb2.append("Invalid configuration due to that two non-default session types are set");
        } else if (i13 != 0) {
            this.f38453h = i13;
        }
        l lVar2 = z1Var.f38489b;
        if (lVar2 != null) {
            l lVar3 = this.f38454i;
            if (lVar3 == lVar2 || lVar3 == null) {
                this.f38454i = lVar2;
            } else {
                wd.a.p("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.f38477k = false;
                sb2.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        wVar.e(l1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s0.z1 b() {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.y1.b():s0.z1");
    }

    public final boolean c() {
        return this.f38478m && this.f38477k;
    }
}
