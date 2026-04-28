package v80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s1 f42122i;

    public l1(x70.c cVar, s1 s1Var) {
        super(1, cVar);
        this.f42122i = s1Var;
    }

    @Override // v80.l
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // v80.l
    public final Throwable r(s1 s1Var) {
        Throwable thC;
        s1 s1Var2 = this.f42122i;
        s1Var2.getClass();
        Object obj = s1.f42157a.get(s1Var2);
        return (!(obj instanceof n1) || (thC = ((n1) obj).c()) == null) ? obj instanceof t ? ((t) obj).f42160a : s1Var.A() : thC;
    }
}
