package aa;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ha.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha.c f1071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f1073c;

    public b0(i0 i0Var, ha.c cVar) {
        cVar.getClass();
        this.f1073c = i0Var;
        this.f1071a = cVar;
        this.f1072b = z9.b.a();
    }

    @Override // ha.c
    public final void C(int i11, String str) {
        str.getClass();
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            this.f1071a.C(i11, str);
        } else {
            z20.b.E(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // ha.c
    public final String W(int i11) {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            return this.f1071a.W(i11);
        }
        z20.b.E(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            this.f1071a.close();
        } else {
            z20.b.E(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // ha.c
    public final void f(int i11, double d3) {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            this.f1071a.f(i11, d3);
        } else {
            z20.b.E(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // ha.c
    public final byte[] getBlob(int i11) {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            return this.f1071a.getBlob(i11);
        }
        z20.b.E(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ha.c
    public final int getColumnCount() {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            return this.f1071a.getColumnCount();
        }
        z20.b.E(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ha.c
    public final String getColumnName(int i11) {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            return this.f1071a.getColumnName(i11);
        }
        z20.b.E(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ha.c
    public final double getDouble(int i11) {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            return this.f1071a.getDouble(i11);
        }
        z20.b.E(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ha.c
    public final long getLong(int i11) {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            return this.f1071a.getLong(i11);
        }
        z20.b.E(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ha.c
    public final boolean isNull(int i11) {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            return this.f1071a.isNull(i11);
        }
        z20.b.E(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ha.c
    public final void j(int i11, long j9) {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            this.f1071a.j(i11, j9);
        } else {
            z20.b.E(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // ha.c
    public final void k(int i11, byte[] bArr) {
        bArr.getClass();
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            this.f1071a.k(i11, bArr);
        } else {
            z20.b.E(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // ha.c
    public final void m(int i11) {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            this.f1071a.m(i11);
        } else {
            z20.b.E(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // ha.c
    public final void n() {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            this.f1071a.n();
        } else {
            z20.b.E(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // ha.c
    public final boolean q0() {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            return this.f1071a.q0();
        }
        z20.b.E(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // ha.c
    public final void reset() {
        if (this.f1073c.f1124e) {
            z20.b.E(21, "Statement is recycled");
            throw null;
        }
        if (this.f1072b == z9.b.a()) {
            this.f1071a.reset();
        } else {
            z20.b.E(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
