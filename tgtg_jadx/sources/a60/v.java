package a60;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f928i;

    public v(v vVar, Object obj, int i11, v vVar2, v vVar3) {
        this.f920a = vVar;
        this.f925f = obj;
        this.f926g = i11;
        this.f928i = 1;
        this.f923d = vVar2;
        this.f924e = vVar3;
        vVar3.f923d = this;
        vVar2.f924e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f925f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f927h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f925f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f927h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f925f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f927h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f927h;
        this.f927h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f925f + "=" + this.f927h;
    }

    public v() {
        this.f925f = null;
        this.f926g = -1;
        this.f924e = this;
        this.f923d = this;
    }
}
