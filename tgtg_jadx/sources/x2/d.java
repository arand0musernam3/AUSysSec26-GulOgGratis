package x2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f43726f = new d(false, 9205357640488583168L, 0.0f, x5.j.Ltr, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f43729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x5.j f43730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43731e;

    public d(boolean z11, long j9, float f11, x5.j jVar, boolean z12) {
        this.f43727a = z11;
        this.f43728b = j9;
        this.f43729c = f11;
        this.f43730d = jVar;
        this.f43731e = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f43727a == dVar.f43727a && h4.b.b(this.f43728b, dVar.f43728b) && Float.compare(this.f43729c, dVar.f43729c) == 0 && this.f43730d == dVar.f43730d && this.f43731e == dVar.f43731e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43731e) + ((this.f43730d.hashCode() + r8.k.a(e0.f.b(Boolean.hashCode(this.f43727a) * 31, 31, this.f43728b), this.f43729c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextFieldHandleState(visible=");
        sb2.append(this.f43727a);
        sb2.append(", position=");
        sb2.append((Object) h4.b.h(this.f43728b));
        sb2.append(", lineHeight=");
        sb2.append(this.f43729c);
        sb2.append(", direction=");
        sb2.append(this.f43730d);
        sb2.append(", handlesCrossed=");
        return r8.k.q(sb2, this.f43731e, ')');
    }
}
