package ub;

import android.util.Log;
import e0.f;
import kotlin.jvm.internal.Intrinsics;
import p80.d;
import p80.g;
import p80.h;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f40990h;

    public b(int i11, long j9, String str) {
        p80.c cVar = d.f34559b;
        long jG = g.g(30, h.SECONDS);
        str.getClass();
        this.f40983a = j9;
        this.f40984b = jG;
        this.f40985c = 30;
        this.f40986d = 10;
        this.f40987e = str;
        this.f40988f = 5;
        this.f40989g = true;
        this.f40990h = i11;
        if (jG <= 0) {
            Log.e("PayKit", "Options interval must be > 0");
        }
        if (j9 < 0) {
            Log.e("PayKit", "Options delay must be >= 0");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return d.e(this.f40983a, bVar.f40983a) && d.e(this.f40984b, bVar.f40984b) && this.f40985c == bVar.f40985c && this.f40986d == bVar.f40986d && Intrinsics.areEqual(this.f40987e, bVar.f40987e) && this.f40988f == bVar.f40988f && this.f40989g == bVar.f40989g && this.f40990h == bVar.f40990h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        p80.c cVar = d.f34559b;
        int iB = k.b(this.f40988f, l1.b(k.b(this.f40986d, k.b(this.f40985c, f.b(Long.hashCode(this.f40983a) * 31, 31, this.f40984b), 31), 31), 31, this.f40987e), 31);
        boolean z11 = this.f40989g;
        ?? r22 = z11;
        if (z11) {
            r22 = 1;
        }
        return Integer.hashCode(this.f40990h) + ((iB + r22) * 31);
    }

    public final String toString() {
        StringBuilder sbT = f.t("AnalyticsOptions(delay=", d.k(this.f40983a), ", interval=", d.k(this.f40984b), ", maxEntryCountPerProcess=");
        f.C(sbT, this.f40985c, ", batchSize=", this.f40986d, ", databaseName=");
        sbT.append(this.f40987e);
        sbT.append(", logLevel=");
        sbT.append(this.f40988f);
        sbT.append(", isLoggerDisabled=");
        sbT.append(this.f40989g);
        sbT.append(", applicationVersionCode=");
        sbT.append(this.f40990h);
        sbT.append(")");
        return sbT.toString();
    }
}
