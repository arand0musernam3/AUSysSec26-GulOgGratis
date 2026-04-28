package z4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f47250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f47251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f47252c = new x1(this, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x1 f47253d = new x1(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x1 f47254e = new x1(this, 1);

    public y1(a2 a2Var) {
        this.f47250a = a2Var;
    }

    public final q0 a() {
        q0 q0Var = this.f47251b;
        if (q0Var != null) {
            return q0Var;
        }
        i4.a.f("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
