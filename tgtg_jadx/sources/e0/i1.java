package e0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f15356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f15357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f15358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1 f15359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f15360f;

    /* JADX WARN: Illegal instructions before constructor call */
    public i1(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, m1 m1Var, int i11) {
        Map map = linkedHashMap;
        if ((i11 & 2) != 0) {
            kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
            o0Var.getClass();
            map = o0Var;
        }
        Map map2 = map;
        Map map3 = linkedHashMap2;
        if ((i11 & 4) != 0) {
            kotlin.collections.o0 o0Var2 = kotlin.collections.o0.f26530a;
            o0Var2.getClass();
            map3 = o0Var2;
        }
        this(list, map2, map3, (i11 & 8) != 0 ? kotlin.collections.n0.f26529a : arrayList, (i11 & 16) != 0 ? null : m1Var, (r0) null);
    }

    public final String toString() {
        String str;
        m1 m1Var = this.f15359e;
        if (m1Var == null) {
            str = "";
        } else {
            str = ", template=" + ((Object) m1.b(m1Var.f15368a));
        }
        return "Request(streams=" + this.f15355a + str + ")@" + Integer.toHexString(hashCode());
    }

    public i1(List list, Map map, Map map2, List list2, m1 m1Var, r0 r0Var) {
        list.getClass();
        map.getClass();
        map2.getClass();
        list2.getClass();
        this.f15355a = list;
        this.f15356b = map;
        this.f15357c = map2;
        this.f15358d = list2;
        this.f15359e = m1Var;
        this.f15360f = r0Var;
    }
}
