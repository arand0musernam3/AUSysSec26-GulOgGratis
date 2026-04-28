package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends z80.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f45541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v80.l f45542b;

    @Override // z80.c
    public final boolean a(z80.a aVar) {
        m1 m1Var = (m1) aVar;
        if (this.f45541a >= 0) {
            return false;
        }
        long j9 = m1Var.f45533i;
        if (j9 < m1Var.f45534j) {
            m1Var.f45534j = j9;
        }
        this.f45541a = j9;
        return true;
    }

    @Override // z80.c
    public final x70.c[] b(z80.a aVar) {
        long j9 = this.f45541a;
        this.f45541a = -1L;
        this.f45542b = null;
        return ((m1) aVar).u(j9);
    }
}
