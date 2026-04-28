package i4;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements z5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f23283b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23284c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f23285d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f23288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f23291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f23292k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f23293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f23294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v0 f23295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f23297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z5.c f23298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z5.m f23299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g0 f23301u;

    public s0() {
        long j9 = h0.f23262a;
        this.f23289h = j9;
        this.f23290i = j9;
        this.f23293m = 8.0f;
        this.f23294n = z0.f23335b;
        this.f23295o = g0.f23254b;
        this.f23297q = 9205357640488583168L;
        this.f23298r = z20.b.d();
        this.f23299s = z5.m.Ltr;
        this.f23300t = 3;
    }

    @Override // z5.c
    public final float X() {
        return this.f23298r.X();
    }

    @Override // z5.c
    public final float a() {
        return this.f23298r.a();
    }

    public final void b() {
        o(1.0f);
        p(1.0f);
        c(1.0f);
        x(0.0f);
        y(0.0f);
        q(0.0f);
        long j9 = h0.f23262a;
        e(j9);
        v(j9);
        j(0.0f);
        k(0.0f);
        n(0.0f);
        if (this.f23293m != 8.0f) {
            this.f23282a |= NewHope.SENDB_BYTES;
            this.f23293m = 8.0f;
        }
        w(z0.f23335b);
        u(g0.f23254b);
        g(false);
        if (!Intrinsics.areEqual((Object) null, (Object) null)) {
            this.f23282a |= 131072;
        }
        if (!Intrinsics.areEqual((Object) null, (Object) null)) {
            this.f23282a |= 262144;
        }
        if (this.f23300t != 3) {
            this.f23282a |= 524288;
            this.f23300t = 3;
        }
        this.f23297q = 9205357640488583168L;
        this.f23301u = null;
        this.f23282a = 0;
    }

    public final void c(float f11) {
        if (this.f23285d == f11) {
            return;
        }
        this.f23282a |= 4;
        this.f23285d = f11;
    }

    public final void e(long j9) {
        if (v.c(this.f23289h, j9)) {
            return;
        }
        this.f23282a |= 64;
        this.f23289h = j9;
    }

    public final void g(boolean z11) {
        if (this.f23296p != z11) {
            this.f23282a |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
            this.f23296p = z11;
        }
    }

    public final void j(float f11) {
        if (this.f23291j == f11) {
            return;
        }
        this.f23282a |= 256;
        this.f23291j = f11;
    }

    public final void k(float f11) {
        if (this.f23292k == f11) {
            return;
        }
        this.f23282a |= 512;
        this.f23292k = f11;
    }

    public final void n(float f11) {
        if (this.l == f11) {
            return;
        }
        this.f23282a |= 1024;
        this.l = f11;
    }

    public final void o(float f11) {
        if (this.f23283b == f11) {
            return;
        }
        this.f23282a |= 1;
        this.f23283b = f11;
    }

    public final void p(float f11) {
        if (this.f23284c == f11) {
            return;
        }
        this.f23282a |= 2;
        this.f23284c = f11;
    }

    public final void q(float f11) {
        if (this.f23288g == f11) {
            return;
        }
        this.f23282a |= 32;
        this.f23288g = f11;
    }

    public final void u(v0 v0Var) {
        if (Intrinsics.areEqual(this.f23295o, v0Var)) {
            return;
        }
        this.f23282a |= 8192;
        this.f23295o = v0Var;
    }

    public final void v(long j9) {
        if (v.c(this.f23290i, j9)) {
            return;
        }
        this.f23282a |= 128;
        this.f23290i = j9;
    }

    public final void w(long j9) {
        if (z0.a(this.f23294n, j9)) {
            return;
        }
        this.f23282a |= 4096;
        this.f23294n = j9;
    }

    public final void x(float f11) {
        if (this.f23286e == f11) {
            return;
        }
        this.f23282a |= 8;
        this.f23286e = f11;
    }

    public final void y(float f11) {
        if (this.f23287f == f11) {
            return;
        }
        this.f23282a |= 16;
        this.f23287f = f11;
    }
}
