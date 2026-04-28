package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 implements v1.e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19527c;

    public t5(boolean z11, float f11, long j9) {
        this.f19525a = z11;
        this.f19526b = f11;
        this.f19527c = j9;
    }

    @Override // v1.e1
    public final b5.l a(b2.k kVar) {
        return new h1(kVar, this.f19525a, this.f19526b, new g1(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        if (this.f19525a == t5Var.f19525a && z5.f.c(this.f19526b, t5Var.f19526b) && Intrinsics.areEqual((Object) null, (Object) null)) {
            return i4.v.c(this.f19527c, t5Var.f19527c);
        }
        return false;
    }

    @Override // v1.e1
    public final int hashCode() {
        int iA = r8.k.a(Boolean.hashCode(this.f19525a) * 31, this.f19526b, 961);
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Long.hashCode(this.f19527c) + iA;
    }
}
