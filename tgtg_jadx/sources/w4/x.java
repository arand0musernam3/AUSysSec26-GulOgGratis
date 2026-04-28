package w4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f43200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f43202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f43203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f43204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f43205k;

    public x(long j9, long j11, long j12, long j13, boolean z11, float f11, int i11, boolean z12, ArrayList arrayList, long j14, long j15) {
        this.f43195a = j9;
        this.f43196b = j11;
        this.f43197c = j12;
        this.f43198d = j13;
        this.f43199e = z11;
        this.f43200f = f11;
        this.f43201g = i11;
        this.f43202h = z12;
        this.f43203i = arrayList;
        this.f43204j = j14;
        this.f43205k = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return u.e(this.f43195a, xVar.f43195a) && this.f43196b == xVar.f43196b && h4.b.b(this.f43197c, xVar.f43197c) && h4.b.b(this.f43198d, xVar.f43198d) && this.f43199e == xVar.f43199e && Float.compare(this.f43200f, xVar.f43200f) == 0 && this.f43201g == xVar.f43201g && this.f43202h == xVar.f43202h && Intrinsics.areEqual(this.f43203i, xVar.f43203i) && h4.b.b(this.f43204j, xVar.f43204j) && h4.b.b(this.f43205k, xVar.f43205k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f43205k) + e0.f.b((this.f43203i.hashCode() + r8.k.e(r8.k.b(this.f43201g, r8.k.a(r8.k.e(e0.f.b(e0.f.b(e0.f.b(Long.hashCode(this.f43195a) * 31, 31, this.f43196b), 31, this.f43197c), 31, this.f43198d), 31, this.f43199e), this.f43200f, 31), 31), 31, this.f43202h)) * 31, 31, this.f43204j);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) u.j(this.f43195a)) + ", uptime=" + this.f43196b + ", positionOnScreen=" + ((Object) h4.b.h(this.f43197c)) + ", position=" + ((Object) h4.b.h(this.f43198d)) + ", down=" + this.f43199e + ", pressure=" + this.f43200f + ", type=" + ((Object) d0.a(this.f43201g)) + ", activeHover=" + this.f43202h + ", historical=" + this.f43203i + ", scrollDelta=" + ((Object) h4.b.h(this.f43204j)) + ", originalEventPosition=" + ((Object) h4.b.h(this.f43205k)) + ')';
    }
}
