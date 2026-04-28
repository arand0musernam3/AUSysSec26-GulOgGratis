package com.google.android.gms.internal.measurement;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a60.s f12023c;

    public static x0 h(InputStream inputStream, int i11) {
        if (i11 <= 0) {
            i4.a.f("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new w0(inputStream, i11);
        }
        v0 v0Var = new v0(r1.f11808a);
        try {
            v0Var.a(0);
            return v0Var;
        } catch (zzaeh e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static int j(int i11) {
        return (i11 >>> 1) ^ (-(i11 & 1));
    }

    public static long k(long j9) {
        return (j9 >>> 1) ^ (-(1 & j9));
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract int a(int i11);

    public abstract void b(int i11);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract int f(int i11, int i12, byte[] bArr);

    public abstract void g(int i11);

    public final void i() throws zzaeh {
        int iL;
        do {
            iL = l();
            if (iL == 0) {
                return;
            }
            int i11 = this.f12021a;
            int i12 = this.f12022b;
            if (i11 + i12 >= 100) {
                c50.w.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.f12022b = i12 + 1;
                this.f12022b--;
            }
        } while (n(iL));
    }

    public abstract int l();

    public abstract void m(int i11);

    public abstract boolean n(int i11);

    public abstract double o();

    public abstract float p();

    public abstract long q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract boolean v();

    public abstract String w();

    public abstract String x();

    public abstract t0 y();

    public abstract byte[] z();
}
