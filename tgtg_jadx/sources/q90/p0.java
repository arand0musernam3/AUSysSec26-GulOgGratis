package q90;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f36582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f36583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f36586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f36587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f36588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ia0.i0 f36589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p0 f36590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p0 f36591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p0 f36592k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f36593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e20.a f36594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v0 f36595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g f36596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f36597q;

    public p0(g0 g0Var, f0 f0Var, String str, int i11, s sVar, t tVar, r0 r0Var, ia0.i0 i0Var, p0 p0Var, p0 p0Var2, p0 p0Var3, long j9, long j11, e20.a aVar, v0 v0Var) {
        g0Var.getClass();
        f0Var.getClass();
        str.getClass();
        r0Var.getClass();
        v0Var.getClass();
        this.f36582a = g0Var;
        this.f36583b = f0Var;
        this.f36584c = str;
        this.f36585d = i11;
        this.f36586e = sVar;
        this.f36587f = tVar;
        this.f36588g = r0Var;
        this.f36589h = i0Var;
        this.f36590i = p0Var;
        this.f36591j = p0Var2;
        this.f36592k = p0Var3;
        this.l = j9;
        this.f36593m = j11;
        this.f36594n = aVar;
        this.f36595o = v0Var;
        boolean z11 = false;
        if (200 <= i11 && i11 < 300) {
            z11 = true;
        }
        this.f36597q = z11;
    }

    public static String e(String str, p0 p0Var) {
        p0Var.getClass();
        String strB = p0Var.f36587f.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    public final g a() {
        g gVar = this.f36596p;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = g.f36491n;
        g gVarB = p30.b.B(this.f36587f);
        this.f36596p = gVarB;
        return gVarB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f36588g.close();
    }

    public final o0 g() {
        o0 o0Var = new o0();
        o0Var.f36569c = -1;
        o0Var.f36573g = r0.f36605a;
        o0Var.f36580o = v0.f36632p0;
        o0Var.f36567a = this.f36582a;
        o0Var.f36568b = this.f36583b;
        o0Var.f36569c = this.f36585d;
        o0Var.f36570d = this.f36584c;
        o0Var.f36571e = this.f36586e;
        o0Var.f36572f = this.f36587f.e();
        o0Var.f36573g = this.f36588g;
        o0Var.f36574h = this.f36589h;
        o0Var.f36575i = this.f36590i;
        o0Var.f36576j = this.f36591j;
        o0Var.f36577k = this.f36592k;
        o0Var.l = this.l;
        o0Var.f36578m = this.f36593m;
        o0Var.f36579n = this.f36594n;
        o0Var.f36580o = this.f36595o;
        return o0Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.f36583b + ", code=" + this.f36585d + ", message=" + this.f36584c + ", url=" + this.f36582a.f36505a + '}';
    }
}
