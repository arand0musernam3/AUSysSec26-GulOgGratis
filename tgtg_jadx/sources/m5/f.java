package m5;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29532d;

    public f(Object obj, int i11, int i12, String str) {
        this.f29529a = obj;
        this.f29530b = i11;
        this.f29531c = i12;
        this.f29532d = str;
        if (i11 <= i12) {
            return;
        }
        s5.a.a("Reversed range is not supported");
    }

    public static f a(f fVar, c cVar, int i11, int i12, int i13) {
        Object obj = cVar;
        if ((i13 & 1) != 0) {
            obj = fVar.f29529a;
        }
        if ((i13 & 2) != 0) {
            i11 = fVar.f29530b;
        }
        if ((i13 & 4) != 0) {
            i12 = fVar.f29531c;
        }
        String str = fVar.f29532d;
        fVar.getClass();
        return new f(obj, i11, i12, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f29529a, fVar.f29529a) && this.f29530b == fVar.f29530b && this.f29531c == fVar.f29531c && Intrinsics.areEqual(this.f29532d, fVar.f29532d);
    }

    public final int hashCode() {
        Object obj = this.f29529a;
        return this.f29532d.hashCode() + r8.k.b(this.f29531c, r8.k.b(this.f29530b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f29529a);
        sb2.append(", start=");
        sb2.append(this.f29530b);
        sb2.append(", end=");
        sb2.append(this.f29531c);
        sb2.append(", tag=");
        return l1.f(sb2, this.f29532d, ')');
    }

    public f(Object obj, int i11, int i12) {
        this(obj, i11, i12, "");
    }
}
