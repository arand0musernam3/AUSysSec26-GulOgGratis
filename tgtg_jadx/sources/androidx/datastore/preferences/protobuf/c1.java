package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2939f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f2940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f2941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile f1 f2943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f2944e;

    public static c1 g() {
        c1 c1Var = new c1();
        c1Var.f2940a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        c1Var.f2941b = map;
        c1Var.f2944e = map;
        return c1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f2940a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f2940a
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.d1 r2 = (androidx.datastore.preferences.protobuf.d1) r2
            java.lang.Comparable r2 = r2.f2946a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f2940a
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.d1 r3 = (androidx.datastore.preferences.protobuf.d1) r3
            java.lang.Comparable r3 = r3.f2946a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c1.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f2942c) {
            c50.w.d();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f2940a.isEmpty()) {
            this.f2940a.clear();
        }
        if (this.f2941b.isEmpty()) {
            return;
        }
        this.f2941b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f2941b.containsKey(comparable);
    }

    public final Map.Entry d(int i11) {
        return (Map.Entry) this.f2940a.get(i11);
    }

    public final Set e() {
        return this.f2941b.isEmpty() ? Collections.EMPTY_SET : this.f2941b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2943d == null) {
            this.f2943d = new f1(this, 0);
        }
        return this.f2943d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return super.equals(obj);
        }
        c1 c1Var = (c1) obj;
        int size = size();
        if (size == c1Var.size()) {
            int size2 = this.f2940a.size();
            if (size2 != c1Var.f2940a.size()) {
                return ((AbstractSet) entrySet()).equals(c1Var.entrySet());
            }
            for (int i11 = 0; i11 < size2; i11++) {
                if (d(i11).equals(c1Var.d(i11))) {
                }
            }
            if (size2 != size) {
                return this.f2941b.equals(c1Var.f2941b);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        b();
        if (this.f2941b.isEmpty() && !(this.f2941b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2941b = treeMap;
            this.f2944e = treeMap.descendingMap();
        }
        return (SortedMap) this.f2941b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((d1) this.f2940a.get(iA)).f2947b : this.f2941b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((d1) this.f2940a.get(iA)).setValue(obj);
        }
        b();
        if (this.f2940a.isEmpty() && !(this.f2940a instanceof ArrayList)) {
            this.f2940a = new ArrayList(16);
        }
        int i11 = -(iA + 1);
        if (i11 >= 16) {
            return f().put(comparable, obj);
        }
        if (this.f2940a.size() == 16) {
            d1 d1Var = (d1) this.f2940a.remove(15);
            f().put(d1Var.f2946a, d1Var.f2947b);
        }
        this.f2940a.add(i11, new d1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2940a.size();
        int iHashCode = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iHashCode += ((d1) this.f2940a.get(i11)).hashCode();
        }
        return this.f2941b.size() > 0 ? this.f2941b.hashCode() + iHashCode : iHashCode;
    }

    public final Object i(int i11) {
        b();
        Object obj = ((d1) this.f2940a.remove(i11)).f2947b;
        if (!this.f2941b.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f2940a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new d1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.f2941b.isEmpty()) {
            return null;
        }
        return this.f2941b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2941b.size() + this.f2940a.size();
    }
}
