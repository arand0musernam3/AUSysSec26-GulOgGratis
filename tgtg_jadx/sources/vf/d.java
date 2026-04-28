package vf;

import j4.s;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.o0;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f42305f = x0.e(new Pair("Content-Type", "application/json; charset=utf-8"), new Pair("Accept", "application/json"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f42307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f42308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42310e;

    public d(String str, c cVar, Map map, String str2, boolean z11, int i11) {
        if ((i11 & 4) != 0) {
            map = o0.f26530a;
            map.getClass();
        }
        str2 = (i11 & 8) != 0 ? null : str2;
        z11 = (i11 & 16) != 0 ? false : z11;
        cVar.getClass();
        this.f42306a = str;
        this.f42307b = cVar;
        this.f42308c = map;
        this.f42309d = str2;
        this.f42310e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f42306a, dVar.f42306a) && this.f42307b == dVar.f42307b && Intrinsics.areEqual(this.f42308c, dVar.f42308c) && Intrinsics.areEqual(this.f42309d, dVar.f42309d) && this.f42310e == dVar.f42310e;
    }

    public final int hashCode() {
        int iF = a0.f(this.f42308c, (this.f42307b.hashCode() + (this.f42306a.hashCode() * 31)) * 31, 31);
        String str = this.f42309d;
        return Integer.hashCode(20000) + k.b(15000, k.e((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.f42310e), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request(url=");
        sb2.append(this.f42306a);
        sb2.append(", method=");
        sb2.append(this.f42307b);
        sb2.append(", headers=");
        sb2.append(this.f42308c);
        sb2.append(", body=");
        sb2.append(this.f42309d);
        sb2.append(", compressBody=");
        return s.o(sb2, this.f42310e, ", connectTimeoutMs=15000, readTimeoutMs=20000)");
    }
}
