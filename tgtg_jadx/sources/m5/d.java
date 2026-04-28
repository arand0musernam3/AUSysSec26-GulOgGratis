package m5;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29523d;

    public /* synthetic */ d(c cVar, int i11, int i12, int i13) {
        this(cVar, i11, (i13 & 4) != 0 ? Integer.MIN_VALUE : i12, (i13 & 8) != 0 ? "" : "androidx.compose.foundation.text.inlineContent");
    }

    public final f a(int i11) {
        int i12 = this.f29522c;
        if (i12 != Integer.MIN_VALUE) {
            i11 = i12;
        }
        if (!(i11 != Integer.MIN_VALUE)) {
            s5.a.c("Item.end should be set first");
        }
        return new f(this.f29520a, this.f29521b, i11, this.f29523d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f29520a, dVar.f29520a) && this.f29521b == dVar.f29521b && this.f29522c == dVar.f29522c && Intrinsics.areEqual(this.f29523d, dVar.f29523d);
    }

    public final int hashCode() {
        Object obj = this.f29520a;
        return this.f29523d.hashCode() + r8.k.b(this.f29522c, r8.k.b(this.f29521b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f29520a);
        sb2.append(", start=");
        sb2.append(this.f29521b);
        sb2.append(", end=");
        sb2.append(this.f29522c);
        sb2.append(", tag=");
        return l1.f(sb2, this.f29523d, ')');
    }

    public d(Object obj, int i11, int i12, String str) {
        this.f29520a = obj;
        this.f29521b = i11;
        this.f29522c = i12;
        this.f29523d = str;
    }
}
