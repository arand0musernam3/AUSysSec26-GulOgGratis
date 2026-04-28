package qc;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.a0 f36911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia0.m f36912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Closeable f36914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ia0.d0 f36916f;

    public p(ia0.a0 a0Var, ia0.m mVar, String str, Closeable closeable) {
        this.f36911a = a0Var;
        this.f36912b = mVar;
        this.f36913c = str;
        this.f36914d = closeable;
    }

    @Override // qc.b0
    public final synchronized ia0.a0 a() {
        if (this.f36915e) {
            throw new IllegalStateException("closed");
        }
        return this.f36911a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f36915e = true;
            ia0.d0 d0Var = this.f36916f;
            if (d0Var != null) {
                ed.k.a(d0Var);
            }
            Closeable closeable = this.f36914d;
            if (closeable != null) {
                ed.k.a(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // qc.b0
    public final z20.b e() {
        return null;
    }

    @Override // qc.b0
    public final ia0.a0 h0() {
        return a();
    }

    @Override // qc.b0
    public final synchronized ia0.i p0() {
        if (this.f36915e) {
            throw new IllegalStateException("closed");
        }
        ia0.d0 d0Var = this.f36916f;
        if (d0Var != null) {
            return d0Var;
        }
        ia0.d0 d0VarC = ia0.b.c(this.f36912b.J(this.f36911a));
        this.f36916f = d0VarC;
        return d0VarC;
    }
}
