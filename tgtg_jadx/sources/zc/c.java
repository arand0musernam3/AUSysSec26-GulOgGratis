package zc;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import v80.p0;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f47422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f47423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f47424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f47425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dd.b f47426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ad.d f47427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f47428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f47429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f47430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f47431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f47432k;

    public c() {
        c90.f fVar = p0.f42144a;
        w80.c cVar = a90.p.f1044a.f43295e;
        c90.e eVar = c90.e.f7834b;
        ad.d dVar = ad.d.AUTOMATIC;
        Bitmap.Config config = ed.k.f15928b;
        b bVar = b.ENABLED;
        this.f47422a = cVar;
        this.f47423b = eVar;
        this.f47424c = eVar;
        this.f47425d = eVar;
        this.f47426e = dd.d.f14872a;
        this.f47427f = dVar;
        this.f47428g = config;
        this.f47429h = true;
        this.f47430i = bVar;
        this.f47431j = bVar;
        this.f47432k = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f47422a, cVar.f47422a) && Intrinsics.areEqual(this.f47423b, cVar.f47423b) && Intrinsics.areEqual(this.f47424c, cVar.f47424c) && Intrinsics.areEqual(this.f47425d, cVar.f47425d) && Intrinsics.areEqual(this.f47426e, cVar.f47426e) && this.f47427f == cVar.f47427f && this.f47428g == cVar.f47428g && this.f47429h == cVar.f47429h && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && this.f47430i == cVar.f47430i && this.f47431j == cVar.f47431j && this.f47432k == cVar.f47432k;
    }

    public final int hashCode() {
        int iHashCode = (this.f47425d.hashCode() + ((this.f47424c.hashCode() + ((this.f47423b.hashCode() + (this.f47422a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f47426e.getClass();
        return this.f47432k.hashCode() + ((this.f47431j.hashCode() + ((this.f47430i.hashCode() + r8.k.e(r8.k.e((this.f47428g.hashCode() + ((this.f47427f.hashCode() + ((dd.b.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.f47429h), 923521, false)) * 31)) * 31);
    }
}
