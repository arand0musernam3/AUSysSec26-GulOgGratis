package l1;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f26760f;

    public c(int i11, boolean z11, float f11, float f12, float f13, float f14) {
        this.f26755a = i11;
        this.f26756b = z11;
        this.f26757c = f11;
        this.f26758d = f12;
        this.f26759e = f13;
        this.f26760f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f26755a == cVar.f26755a && this.f26756b == cVar.f26756b && this.f26757c == cVar.f26757c && this.f26758d == cVar.f26758d && this.f26759e == cVar.f26759e && this.f26760f == cVar.f26760f;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26760f) + k.a(k.a(k.a(k.e(k.e(this.f26755a * 31, 31, this.f26756b), 31, false), this.f26757c, 31), this.f26758d, 31), this.f26759e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformationInfo(sourceRotation=");
        sb2.append(this.f26755a);
        sb2.append(", isSourceMirroredHorizontally=");
        sb2.append(this.f26756b);
        sb2.append(", isSourceMirroredVertically=false, cropRectLeft=");
        sb2.append(this.f26757c);
        sb2.append(", cropRectTop=");
        sb2.append(this.f26758d);
        sb2.append(", cropRectRight=");
        sb2.append(this.f26759e);
        sb2.append(", cropRectBottom=");
        return k.n(sb2, this.f26760f, ')');
    }
}
