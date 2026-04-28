package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.y f3491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rb.d f3492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3493c = -1;

    public m0(y9.y yVar, rb.d dVar) {
        this.f3491a = yVar;
        this.f3492b = dVar;
    }

    @Override // androidx.lifecycle.p0
    public final void a(Object obj) {
        int i11 = this.f3493c;
        int i12 = this.f3491a.f3475g;
        if (i11 != i12) {
            this.f3493c = i12;
            this.f3492b.a(obj);
        }
    }
}
