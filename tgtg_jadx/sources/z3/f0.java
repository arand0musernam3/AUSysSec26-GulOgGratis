package z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f46999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f0 f47000b;

    public f0(long j9) {
        this.f46999a = j9;
    }

    public abstract void a(f0 f0Var);

    public abstract f0 b();

    public f0 c(long j9) {
        f0 f0VarB = b();
        f0VarB.f46999a = j9;
        return f0VarB;
    }
}
