package zc;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f47508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f47509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qc.f f47510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xc.b f47511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f47514g;

    public r(Drawable drawable, k kVar, qc.f fVar, xc.b bVar, String str, boolean z11, boolean z12) {
        this.f47508a = drawable;
        this.f47509b = kVar;
        this.f47510c = fVar;
        this.f47511d = bVar;
        this.f47512e = str;
        this.f47513f = z11;
        this.f47514g = z12;
    }

    @Override // zc.l
    public final Drawable a() {
        return this.f47508a;
    }

    @Override // zc.l
    public final k b() {
        return this.f47509b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.f47508a, rVar.f47508a) && Intrinsics.areEqual(this.f47509b, rVar.f47509b) && this.f47510c == rVar.f47510c && Intrinsics.areEqual(this.f47511d, rVar.f47511d) && Intrinsics.areEqual(this.f47512e, rVar.f47512e) && this.f47513f == rVar.f47513f && this.f47514g == rVar.f47514g;
    }

    public final int hashCode() {
        int iHashCode = (this.f47510c.hashCode() + ((this.f47509b.hashCode() + (this.f47508a.hashCode() * 31)) * 31)) * 31;
        xc.b bVar = this.f47511d;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f47512e;
        return Boolean.hashCode(this.f47514g) + r8.k.e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f47513f);
    }
}
