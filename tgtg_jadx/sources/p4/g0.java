package p4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f34321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f34325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f34326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f34327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f34328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f34329j;

    public g0(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, ArrayList arrayList) {
        this.f34320a = str;
        this.f34321b = f11;
        this.f34322c = f12;
        this.f34323d = f13;
        this.f34324e = f14;
        this.f34325f = f15;
        this.f34326g = f16;
        this.f34327h = f17;
        this.f34328i = list;
        this.f34329j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            return Intrinsics.areEqual(this.f34320a, g0Var.f34320a) && this.f34321b == g0Var.f34321b && this.f34322c == g0Var.f34322c && this.f34323d == g0Var.f34323d && this.f34324e == g0Var.f34324e && this.f34325f == g0Var.f34325f && this.f34326g == g0Var.f34326g && this.f34327h == g0Var.f34327h && Intrinsics.areEqual(this.f34328i, g0Var.f34328i) && Intrinsics.areEqual(this.f34329j, g0Var.f34329j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34329j.hashCode() + e0.f.c(this.f34328i, r8.k.a(r8.k.a(r8.k.a(r8.k.a(r8.k.a(r8.k.a(r8.k.a(this.f34320a.hashCode() * 31, this.f34321b, 31), this.f34322c, 31), this.f34323d, 31), this.f34324e, 31), this.f34325f, 31), this.f34326g, 31), this.f34327h, 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kotlin.collections.h(this);
    }
}
