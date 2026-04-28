package s0;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f38487j = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f38489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f38492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w1 f38493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f38494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f38495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InputConfiguration f38496i;

    public z1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, r0 r0Var, w1 w1Var, InputConfiguration inputConfiguration, int i11, l lVar) {
        this.f38488a = arrayList;
        this.f38490c = Collections.unmodifiableList(arrayList2);
        this.f38491d = Collections.unmodifiableList(arrayList3);
        this.f38492e = Collections.unmodifiableList(arrayList4);
        this.f38493f = w1Var;
        this.f38494g = r0Var;
        this.f38496i = inputConfiguration;
        this.f38495h = i11;
        this.f38489b = lVar;
    }

    public static z1 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        i1 i1VarH = i1.h();
        ArrayList arrayList5 = new ArrayList();
        j1 j1VarA = j1.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        l1 l1VarE = l1.e(i1VarH);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        k2 k2Var = k2.f38372b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = j1VarA.f38373a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new z1(arrayList, arrayList2, arrayList3, arrayList4, new r0(arrayList6, l1VarE, -1, arrayList7, new k2(arrayMap)), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (l lVar : this.f38488a) {
            arrayList.add(lVar.f38374a);
            Iterator it = lVar.f38375b.iterator();
            while (it.hasNext()) {
                arrayList.add((x0) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
