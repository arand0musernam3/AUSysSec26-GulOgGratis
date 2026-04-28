package x90;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ia0.j f44089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ia0.j f44090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ia0.j f44091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ia0.j f44092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ia0.j f44093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ia0.j f44094i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.j f44095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia0.j f44096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44097c;

    static {
        ia0.j jVar = ia0.j.f23646d;
        f44089d = r40.d.p(":");
        f44090e = r40.d.p(":status");
        f44091f = r40.d.p(":method");
        f44092g = r40.d.p(":path");
        f44093h = r40.d.p(":scheme");
        f44094i = r40.d.p(":authority");
    }

    public d(ia0.j jVar, ia0.j jVar2) {
        jVar.getClass();
        jVar2.getClass();
        this.f44095a = jVar;
        this.f44096b = jVar2;
        this.f44097c = jVar2.e() + jVar.e() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f44095a, dVar.f44095a) && Intrinsics.areEqual(this.f44096b, dVar.f44096b);
    }

    public final int hashCode() {
        return this.f44096b.hashCode() + (this.f44095a.hashCode() * 31);
    }

    public final String toString() {
        return this.f44095a.s() + ": " + this.f44096b.s();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        this(r40.d.p(str), r40.d.p(str2));
        str.getClass();
        ia0.j jVar = ia0.j.f23646d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(ia0.j jVar, String str) {
        this(jVar, r40.d.p(str));
        jVar.getClass();
        str.getClass();
        ia0.j jVar2 = ia0.j.f23646d;
    }
}
