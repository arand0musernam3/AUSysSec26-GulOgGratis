package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o2 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f11683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f11685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.f1 f11687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f11688f;

    public o2() {
        Map map = Collections.EMPTY_MAP;
        this.f11685c = map;
        this.f11688f = map;
    }

    public final p2 a(int i11) {
        if (i11 < this.f11684b) {
            return (p2) this.f11683a[i11];
        }
        throw new ArrayIndexOutOfBoundsException(i11);
    }

    public final Set b() {
        return this.f11685c.isEmpty() ? Collections.EMPTY_SET : this.f11685c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.f11684b != 0) {
            this.f11683a = null;
            this.f11684b = 0;
        }
        if (this.f11685c.isEmpty()) {
            return;
        }
        this.f11685c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f11685c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((p2) this.f11683a[iF]).setValue(obj);
        }
        g();
        if (this.f11683a == null) {
            this.f11683a = new Object[16];
        }
        int i11 = -(iF + 1);
        if (i11 >= 16) {
            return h().put(comparable, obj);
        }
        if (this.f11684b == 16) {
            p2 p2Var = (p2) this.f11683a[15];
            this.f11684b = 15;
            h().put(p2Var.f11741a, p2Var.f11742b);
        }
        Object[] objArr = this.f11683a;
        int length = objArr.length;
        System.arraycopy(objArr, i11, objArr, i11 + 1, 15 - i11);
        this.f11683a[i11] = new p2(this, comparable, obj);
        this.f11684b++;
        return null;
    }

    public final Object e(int i11) {
        g();
        Object[] objArr = this.f11683a;
        Object obj = ((p2) objArr[i11]).f11742b;
        System.arraycopy(objArr, i11 + 1, objArr, i11, (this.f11684b - i11) - 1);
        this.f11684b--;
        if (!this.f11685c.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            Object[] objArr2 = this.f11683a;
            int i12 = this.f11684b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i12] = new p2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f11684b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f11687e == null) {
            this.f11687e = new androidx.datastore.preferences.protobuf.f1(this, 1);
        }
        return this.f11687e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return super.equals(obj);
        }
        o2 o2Var = (o2) obj;
        int size = size();
        if (size == o2Var.size()) {
            int i11 = this.f11684b;
            if (i11 != o2Var.f11684b) {
                return entrySet().equals(o2Var.entrySet());
            }
            for (int i12 = 0; i12 < i11; i12++) {
                if (a(i12).equals(o2Var.a(i12))) {
                }
            }
            if (i11 != size) {
                return this.f11685c.equals(o2Var.f11685c);
            }
            return true;
        }
        return false;
    }

    public final int f(Comparable comparable) {
        int i11 = this.f11684b;
        int i12 = i11 - 1;
        int i13 = 0;
        if (i12 >= 0) {
            int iCompareTo = comparable.compareTo(((p2) this.f11683a[i12]).f11741a);
            if (iCompareTo > 0) {
                return -(i11 + 1);
            }
            if (iCompareTo == 0) {
                return i12;
            }
        }
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int iCompareTo2 = comparable.compareTo(((p2) this.f11683a[i14]).f11741a);
            if (iCompareTo2 < 0) {
                i12 = i14 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i14;
                }
                i13 = i14 + 1;
            }
        }
        return -(i13 + 1);
    }

    public final void g() {
        if (this.f11686d) {
            c50.w.d();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((p2) this.f11683a[iF]).f11742b : this.f11685c.get(comparable);
    }

    public final SortedMap h() {
        g();
        if (this.f11685c.isEmpty() && !(this.f11685c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11685c = treeMap;
            this.f11688f = treeMap.descendingMap();
        }
        return (SortedMap) this.f11685c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i11 = this.f11684b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += this.f11683a[i12].hashCode();
        }
        return this.f11685c.size() > 0 ? this.f11685c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return e(iF);
        }
        if (this.f11685c.isEmpty()) {
            return null;
        }
        return this.f11685c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11685c.size() + this.f11684b;
    }
}
