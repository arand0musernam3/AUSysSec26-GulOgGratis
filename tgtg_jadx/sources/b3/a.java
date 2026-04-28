package b3;

import m3.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f5570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f5571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f5572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f5573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f5574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f5575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f5576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k1 f5577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f5578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f5579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k1 f5580k;
    public final k1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k1 f5581m;

    public a(long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, boolean z11) {
        i4.v vVar = new i4.v(j9);
        m3.f fVar = m3.f.f29275g;
        this.f5570a = new k1(vVar, fVar);
        this.f5571b = new k1(new i4.v(j11), fVar);
        this.f5572c = new k1(new i4.v(j12), fVar);
        this.f5573d = new k1(new i4.v(j13), fVar);
        this.f5574e = new k1(new i4.v(j14), fVar);
        this.f5575f = new k1(new i4.v(j15), fVar);
        this.f5576g = new k1(new i4.v(j16), fVar);
        this.f5577h = new k1(new i4.v(j17), fVar);
        this.f5578i = new k1(new i4.v(j18), fVar);
        this.f5579j = new k1(new i4.v(j19), fVar);
        this.f5580k = new k1(new i4.v(j21), fVar);
        this.l = new k1(new i4.v(j22), fVar);
        this.f5581m = new k1(Boolean.valueOf(z11), fVar);
    }

    public final long a() {
        return ((i4.v) this.f5574e.getValue()).f23317a;
    }

    public final long b() {
        return ((i4.v) this.f5576g.getValue()).f23317a;
    }

    public final long c() {
        return ((i4.v) this.f5580k.getValue()).f23317a;
    }

    public final long d() {
        return ((i4.v) this.f5570a.getValue()).f23317a;
    }

    public final long e() {
        return ((i4.v) this.f5572c.getValue()).f23317a;
    }

    public final long f() {
        return ((i4.v) this.f5575f.getValue()).f23317a;
    }

    public final boolean g() {
        return ((Boolean) this.f5581m.getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Colors(primary=");
        sb2.append((Object) i4.v.i(d()));
        sb2.append(", primaryVariant=");
        sb2.append((Object) i4.v.i(((i4.v) this.f5571b.getValue()).f23317a));
        sb2.append(", secondary=");
        sb2.append((Object) i4.v.i(e()));
        sb2.append(", secondaryVariant=");
        sb2.append((Object) i4.v.i(((i4.v) this.f5573d.getValue()).f23317a));
        sb2.append(", background=");
        sb2.append((Object) i4.v.i(a()));
        sb2.append(", surface=");
        sb2.append((Object) i4.v.i(f()));
        sb2.append(", error=");
        sb2.append((Object) i4.v.i(b()));
        sb2.append(", onPrimary=");
        r8.k.x(((i4.v) this.f5577h.getValue()).f23317a, ", onSecondary=", sb2);
        r8.k.x(((i4.v) this.f5578i.getValue()).f23317a, ", onBackground=", sb2);
        sb2.append((Object) i4.v.i(((i4.v) this.f5579j.getValue()).f23317a));
        sb2.append(", onSurface=");
        sb2.append((Object) i4.v.i(c()));
        sb2.append(", onError=");
        sb2.append((Object) i4.v.i(((i4.v) this.l.getValue()).f23317a));
        sb2.append(", isLight=");
        sb2.append(g());
        sb2.append(')');
        return sb2.toString();
    }
}
