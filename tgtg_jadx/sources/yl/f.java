package yl;

import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46148b;

    public f(int i11, List list, boolean z11) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) != 0 ? false : z11);
    }

    public static f a(f fVar, boolean z11) {
        List list = fVar.f46147a;
        fVar.getClass();
        list.getClass();
        return new f(list, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f46147a, fVar.f46147a) && this.f46148b == fVar.f46148b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46148b) + (this.f46147a.hashCode() * 31);
    }

    public final String toString() {
        return "LoginCharityCountryState(countries=" + this.f46147a + ", isLoading=" + this.f46148b + ")";
    }

    public f(List list, boolean z11) {
        list.getClass();
        this.f46147a = list;
        this.f46148b = z11;
    }
}
