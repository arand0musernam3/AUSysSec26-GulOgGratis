package a60;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f841d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f843b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f844c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f841d = arrayList;
        arrayList.add(h0.f874a);
        arrayList.add(h.f871c);
        arrayList.add(b.f837e);
        arrayList.add(b.f836d);
        arrayList.add(c0.f847a);
        arrayList.add(g.f861d);
    }

    public b0(y yVar) {
        ArrayList arrayList = yVar.f940a;
        int size = arrayList.size();
        ArrayList arrayList2 = f841d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f842a = Collections.unmodifiableList(arrayList3);
    }

    public final k a(Type type, Set set, String str) {
        k kVar;
        if (type == null) {
            c50.w.l("type == null");
            return null;
        }
        if (set == null) {
            c50.w.l("annotations == null");
            return null;
        }
        Type typeA = b60.f.a(type);
        if (typeA instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) typeA;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    i4.a.h();
                    return null;
                }
                typeA = upperBounds[0];
            }
        }
        Object objAsList = set.isEmpty() ? typeA : Arrays.asList(typeA, set);
        synchronized (this.f844c) {
            try {
                k kVar2 = (k) this.f844c.get(objAsList);
                if (kVar2 != null) {
                    return kVar2;
                }
                a0 a0Var = (a0) this.f843b.get();
                if (a0Var == null) {
                    a0Var = new a0(this);
                    this.f843b.set(a0Var);
                }
                ArrayDeque arrayDeque = a0Var.f833b;
                ArrayList arrayList = a0Var.f832a;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z zVar = new z(typeA, str, objAsList);
                        arrayList.add(zVar);
                        arrayDeque.add(zVar);
                        kVar = null;
                        break;
                    }
                    z zVar2 = (z) arrayList.get(i11);
                    if (zVar2.f944c.equals(objAsList)) {
                        arrayDeque.add(zVar2);
                        k kVar3 = zVar2.f945d;
                        kVar = zVar2;
                        if (kVar3 != null) {
                            kVar = kVar3;
                        }
                    } else {
                        i11++;
                    }
                }
                try {
                    if (kVar != null) {
                        return kVar;
                    }
                    try {
                        int size2 = this.f842a.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            k kVarA = ((j) this.f842a.get(i12)).a(typeA, set, this);
                            if (kVarA != null) {
                                ((z) a0Var.f833b.getLast()).f945d = kVarA;
                                a0Var.b(true);
                                return kVarA;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + b60.f.h(typeA, set));
                    } catch (IllegalArgumentException e5) {
                        throw a0Var.a(e5);
                    }
                } finally {
                    a0Var.b(false);
                }
            } finally {
            }
        }
    }
}
