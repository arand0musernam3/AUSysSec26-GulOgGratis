package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements v80.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f45494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v80.l f45497d;

    public j1(m1 m1Var, long j9, Object obj, v80.l lVar) {
        this.f45494a = m1Var;
        this.f45495b = j9;
        this.f45496c = obj;
        this.f45497d = lVar;
    }

    @Override // v80.r0
    public final void a() {
        m1 m1Var = this.f45494a;
        synchronized (m1Var) {
            if (this.f45495b < m1Var.o()) {
                return;
            }
            Object[] objArr = m1Var.f45532h;
            objArr.getClass();
            long j9 = this.f45495b;
            if (objArr[((int) j9) & (objArr.length - 1)] != this) {
                return;
            }
            r.d(objArr, j9, r.f45562c);
            m1Var.j();
        }
    }
}
