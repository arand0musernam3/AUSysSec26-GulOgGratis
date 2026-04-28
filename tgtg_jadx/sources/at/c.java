package at;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends p30.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f4764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4765k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f4766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f4767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f4768o;

    public c(int i11, String str, String str2, boolean z11, boolean z12, boolean z13) {
        super(2);
        this.f4764j = str;
        this.f4765k = i11;
        this.l = str2;
        this.f4766m = z11;
        this.f4767n = z12;
        this.f4768o = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f4764j, cVar.f4764j) && this.f4765k == cVar.f4765k && Intrinsics.areEqual(this.l, cVar.l) && this.f4766m == cVar.f4766m && this.f4767n == cVar.f4767n && this.f4768o == cVar.f4768o;
    }

    @Override // p30.b
    public final int hashCode() {
        return Boolean.hashCode(this.f4768o) + r8.k.e(r8.k.e(l1.b(r8.k.b(this.f4765k, this.f4764j.hashCode() * 31, 31), 31, this.l), 31, this.f4766m), 31, this.f4767n);
    }

    @Override // p30.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Load(title=");
        sb2.append(this.f4764j);
        sb2.append(", titleRes=");
        sb2.append(this.f4765k);
        sb2.append(", loadUrl=");
        r8.k.z(sb2, this.l, ", allowZoom=", this.f4766m, ", clearCookies=");
        sb2.append(this.f4767n);
        sb2.append(", isStoreReferral=");
        sb2.append(this.f4768o);
        sb2.append(")");
        return sb2.toString();
    }
}
