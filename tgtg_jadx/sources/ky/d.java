package ky;

import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f26688c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f26690b;

    static {
        n0 n0Var = n0.f26529a;
        f26688c = new d(n0Var, n0Var);
    }

    public d(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f26689a = list;
        this.f26690b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f26689a, dVar.f26689a) && Intrinsics.areEqual(this.f26690b, dVar.f26690b);
    }

    public final int hashCode() {
        return this.f26690b.hashCode() + (this.f26689a.hashCode() * 31);
    }

    public final String toString() {
        return "CpuInfo(commonInfo=" + this.f26689a + ", perProcessorInfo=" + this.f26690b + ')';
    }
}
