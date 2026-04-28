package q90;

import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f36567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f0 f36568b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f36571e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ia0.i0 f36574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p0 f36575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p0 f36576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p0 f36577k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f36578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e20.a f36579n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36569c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r0 f36573g = r0.f36605a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v0 f36580o = v0.f36632p0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ax.g0 f36572f = new ax.g0(3);

    public static void b(String str, p0 p0Var) {
        if (p0Var != null) {
            if (p0Var.f36590i != null) {
                i4.a.i(str.concat(".networkResponse != null"));
            } else if (p0Var.f36591j != null) {
                i4.a.i(str.concat(".cacheResponse != null"));
            } else {
                if (p0Var.f36592k == null) {
                    return;
                }
                i4.a.i(str.concat(".priorResponse != null"));
            }
        }
    }

    public final p0 a() {
        int i11 = this.f36569c;
        if (i11 < 0) {
            org.bouncycastle.jce.provider.a.d(this.f36569c, "code < 0: ");
            return null;
        }
        g0 g0Var = this.f36567a;
        if (g0Var == null) {
            h2.b("request == null");
            return null;
        }
        f0 f0Var = this.f36568b;
        if (f0Var == null) {
            h2.b("protocol == null");
            return null;
        }
        String str = this.f36570d;
        if (str != null) {
            return new p0(g0Var, f0Var, str, i11, this.f36571e, this.f36572f.g(), this.f36573g, this.f36574h, this.f36575i, this.f36576j, this.f36577k, this.l, this.f36578m, this.f36579n, this.f36580o);
        }
        h2.b("message == null");
        return null;
    }
}
