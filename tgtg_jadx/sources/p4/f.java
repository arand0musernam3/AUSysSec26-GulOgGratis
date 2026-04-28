package p4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f34295k;
    public static final l20.c l = new l20.c(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f34297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f34301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f34302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f34303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f34304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f34305j;

    public f(String str, float f11, float f12, float f13, float f14, g0 g0Var, long j9, int i11, boolean z11) {
        int i12;
        synchronized (l) {
            i12 = f34295k;
            f34295k = i12 + 1;
        }
        this.f34296a = str;
        this.f34297b = f11;
        this.f34298c = f12;
        this.f34299d = f13;
        this.f34300e = f14;
        this.f34301f = g0Var;
        this.f34302g = j9;
        this.f34303h = i11;
        this.f34304i = z11;
        this.f34305j = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f34296a, fVar.f34296a) && z5.f.c(this.f34297b, fVar.f34297b) && z5.f.c(this.f34298c, fVar.f34298c) && this.f34299d == fVar.f34299d && this.f34300e == fVar.f34300e && Intrinsics.areEqual(this.f34301f, fVar.f34301f) && i4.v.c(this.f34302g, fVar.f34302g) && this.f34303h == fVar.f34303h && this.f34304i == fVar.f34304i;
    }

    public final int hashCode() {
        int iHashCode = (this.f34301f.hashCode() + r8.k.a(r8.k.a(r8.k.a(r8.k.a(this.f34296a.hashCode() * 31, this.f34297b, 31), this.f34298c, 31), this.f34299d, 31), this.f34300e, 31)) * 31;
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Boolean.hashCode(this.f34304i) + r8.k.b(this.f34303h, e0.f.b(iHashCode, 31, this.f34302g), 31);
    }
}
