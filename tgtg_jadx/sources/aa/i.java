package aa;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements ha.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha.c f1119a;

    public i(ha.c cVar) {
        cVar.getClass();
        this.f1119a = cVar;
    }

    @Override // ha.c
    public final void C(int i11, String str) {
        str.getClass();
        this.f1119a.C(i11, str);
    }

    @Override // ha.c
    public final boolean E() {
        return this.f1119a.E();
    }

    @Override // ha.c
    public final String W(int i11) {
        return this.f1119a.W(i11);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ha.c cVar = this.f1119a;
        cVar.reset();
        cVar.n();
    }

    @Override // ha.c
    public final void f(int i11, double d3) {
        this.f1119a.f(i11, d3);
    }

    @Override // ha.c
    public final byte[] getBlob(int i11) {
        return this.f1119a.getBlob(i11);
    }

    @Override // ha.c
    public final int getColumnCount() {
        return this.f1119a.getColumnCount();
    }

    @Override // ha.c
    public final String getColumnName(int i11) {
        return this.f1119a.getColumnName(i11);
    }

    @Override // ha.c
    public final double getDouble(int i11) {
        return this.f1119a.getDouble(i11);
    }

    @Override // ha.c
    public final long getLong(int i11) {
        return this.f1119a.getLong(i11);
    }

    @Override // ha.c
    public final boolean isNull(int i11) {
        return this.f1119a.isNull(i11);
    }

    @Override // ha.c
    public final void j(int i11, long j9) {
        this.f1119a.j(i11, j9);
    }

    @Override // ha.c
    public final void k(int i11, byte[] bArr) {
        bArr.getClass();
        this.f1119a.k(i11, bArr);
    }

    @Override // ha.c
    public final void m(int i11) {
        this.f1119a.m(i11);
    }

    @Override // ha.c
    public final void n() {
        this.f1119a.n();
    }

    @Override // ha.c
    public final boolean q0() {
        return this.f1119a.q0();
    }

    @Override // ha.c
    public final void reset() {
        this.f1119a.reset();
    }
}
