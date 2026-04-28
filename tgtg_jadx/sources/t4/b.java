package t4;

import r8.k;
import w4.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f39786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f39787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f39788i;

    public b(long j9, long j11, long j12, boolean z11, float f11, long j13, long j14, boolean z12) {
        this.f39780a = j9;
        this.f39781b = j11;
        this.f39782c = j12;
        this.f39783d = z11;
        this.f39784e = f11;
        this.f39785f = j13;
        this.f39786g = j14;
        this.f39787h = z12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IndirectPointerInputChange(id=");
        sb2.append((Object) u.j(this.f39780a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f39781b);
        sb2.append(", position=");
        sb2.append((Object) h4.b.h(this.f39782c));
        sb2.append(", pressed=");
        sb2.append(this.f39783d);
        sb2.append(", pressure=");
        sb2.append(this.f39784e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f39785f);
        sb2.append(", previousPosition=");
        sb2.append((Object) h4.b.h(this.f39786g));
        sb2.append(", previousPressed=");
        sb2.append(this.f39787h);
        sb2.append(", isConsumed=");
        return k.q(sb2, this.f39788i, ')');
    }
}
