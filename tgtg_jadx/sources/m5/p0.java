package m5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f29603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f29604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f29605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z5.c f29609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z5.m f29610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q5.h f29611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f29612j;

    public p0(h hVar, u0 u0Var, List list, int i11, boolean z11, int i12, z5.c cVar, z5.m mVar, q5.h hVar2, long j9) {
        this.f29603a = hVar;
        this.f29604b = u0Var;
        this.f29605c = list;
        this.f29606d = i11;
        this.f29607e = z11;
        this.f29608f = i12;
        this.f29609g = cVar;
        this.f29610h = mVar;
        this.f29611i = hVar2;
        this.f29612j = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.areEqual(this.f29603a, p0Var.f29603a) && Intrinsics.areEqual(this.f29604b, p0Var.f29604b) && Intrinsics.areEqual(this.f29605c, p0Var.f29605c) && this.f29606d == p0Var.f29606d && this.f29607e == p0Var.f29607e && this.f29608f == p0Var.f29608f && Intrinsics.areEqual(this.f29609g, p0Var.f29609g) && this.f29610h == p0Var.f29610h && Intrinsics.areEqual(this.f29611i, p0Var.f29611i) && z5.a.c(this.f29612j, p0Var.f29612j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f29612j) + ((this.f29611i.hashCode() + ((this.f29610h.hashCode() + ((this.f29609g.hashCode() + r8.k.b(this.f29608f, r8.k.e((e0.f.c(this.f29605c, l1.c(this.f29603a.hashCode() * 31, 31, this.f29604b), 31) + this.f29606d) * 31, 31, this.f29607e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f29603a);
        sb2.append(", style=");
        sb2.append(this.f29604b);
        sb2.append(", placeholders=");
        sb2.append(this.f29605c);
        sb2.append(", maxLines=");
        sb2.append(this.f29606d);
        sb2.append(", softWrap=");
        sb2.append(this.f29607e);
        sb2.append(", overflow=");
        int i11 = this.f29608f;
        sb2.append((Object) (i11 == 1 ? "Clip" : i11 == 2 ? "Ellipsis" : i11 == 5 ? "MiddleEllipsis" : i11 == 3 ? "Visible" : i11 == 4 ? "StartEllipsis" : "Invalid"));
        sb2.append(", density=");
        sb2.append(this.f29609g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f29610h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f29611i);
        sb2.append(", constraints=");
        sb2.append((Object) z5.a.m(this.f29612j));
        sb2.append(')');
        return sb2.toString();
    }
}
