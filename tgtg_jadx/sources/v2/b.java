package v2;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import m5.k0;
import m5.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f41928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t0 f41930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Pair f41931f;

    public b(CharSequence charSequence, long j9, t0 t0Var, Pair pair, List list, List list2, int i11) {
        t0Var = (i11 & 4) != 0 ? null : t0Var;
        pair = (i11 & 8) != 0 ? null : pair;
        list = (i11 & 16) != 0 ? null : list;
        list2 = (i11 & 32) != 0 ? null : list2;
        this.f41926a = list;
        this.f41927b = list2;
        this.f41928c = charSequence instanceof b ? ((b) charSequence).f41928c : charSequence;
        this.f41929d = k0.d(charSequence.length(), j9);
        this.f41930e = t0Var != null ? new t0(k0.d(charSequence.length(), t0Var.f29650a)) : null;
        this.f41931f = pair != null ? new Pair(pair.f26485a, new t0(k0.d(charSequence.length(), ((t0) pair.f26486b).f29650a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f41928c.charAt(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (t0.c(this.f41929d, bVar.f41929d) && Intrinsics.areEqual(this.f41930e, bVar.f41930e) && Intrinsics.areEqual(this.f41931f, bVar.f41931f) && Intrinsics.areEqual(this.f41926a, bVar.f41926a)) {
            return y.i(this.f41928c, bVar.f41928c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f41928c.hashCode() * 31;
        int i11 = t0.f29649c;
        int iB = e0.f.b(iHashCode, 31, this.f41929d);
        t0 t0Var = this.f41930e;
        int iHashCode2 = (iB + (t0Var != null ? Long.hashCode(t0Var.f29650a) : 0)) * 31;
        Pair pair = this.f41931f;
        int iHashCode3 = (iHashCode2 + (pair != null ? pair.hashCode() : 0)) * 31;
        List list = this.f41926a;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f41928c.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i11, int i12) {
        return this.f41928c.subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f41928c.toString();
    }
}
