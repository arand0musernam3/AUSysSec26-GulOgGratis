package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p2 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f11741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o2 f11743c;

    public p2(o2 o2Var, Comparable comparable, Object obj) {
        this.f11743c = o2Var;
        this.f11741a = comparable;
        this.f11742b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f11741a.compareTo(((p2) obj).f11741a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f11741a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f11742b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f11741a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11742b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f11741a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f11742b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f11743c.g();
        Object obj2 = this.f11742b;
        this.f11742b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11741a);
        String strValueOf2 = String.valueOf(this.f11742b);
        return e0.f.n(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
