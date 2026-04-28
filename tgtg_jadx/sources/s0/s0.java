package s0;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f38445a;

    public s0() {
        HashSet hashSet = new HashSet();
        i1 i1VarH = i1.h();
        ArrayList arrayList = new ArrayList();
        j1 j1VarA = j1.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        l1 l1VarE = l1.e(i1VarH);
        ArrayList arrayList3 = new ArrayList(arrayList);
        k2 k2Var = k2.f38372b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = j1VarA.f38373a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.f38445a = new r0(arrayList2, l1VarE, -1, arrayList3, new k2(arrayMap));
    }
}
