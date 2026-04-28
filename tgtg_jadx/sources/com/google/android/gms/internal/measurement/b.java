package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k30.m f11262d = k30.m.l(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f11265c;

    public b(String str, long j9, HashMap map) {
        this.f11263a = str;
        this.f11264b = j9;
        HashMap map2 = new HashMap();
        this.f11265c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object b(String str, Object obj, Object obj2) {
        if (f11262d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f11263a, this.f11264b, new HashMap(this.f11265c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f11264b == bVar.f11264b && this.f11263a.equals(bVar.f11263a)) {
            return this.f11265c.equals(bVar.f11265c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f11263a.hashCode() * 31;
        long j9 = this.f11264b;
        return this.f11265c.hashCode() + ((iHashCode + ((int) (j9 ^ (j9 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f11263a;
        String string = this.f11265c.toString();
        int length = String.valueOf(str).length();
        long j9 = this.f11264b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j9).length() + 9 + string.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j9);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
