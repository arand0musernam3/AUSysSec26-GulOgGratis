package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends androidx.activity.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v80.b0 f18444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.b f18445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw.b f18446c;

    public d3(boolean z11, v80.b0 b0Var, t1.b bVar, cw.b bVar2) {
        super(z11);
        this.f18444a = b0Var;
        this.f18445b = bVar;
        this.f18446c = bVar2;
    }

    @Override // androidx.activity.y
    public final void handleOnBackCancelled() {
        v80.f0.B(this.f18444a, null, null, new a3.b2(this, null, 23), 3);
    }

    @Override // androidx.activity.y
    public final void handleOnBackPressed() {
        this.f18446c.invoke();
    }

    @Override // androidx.activity.y
    public final void handleOnBackProgressed(androidx.activity.b bVar) {
        v80.f0.B(this.f18444a, null, null, new c3(this, bVar, null, 0), 3);
    }

    @Override // androidx.activity.y
    public final void handleOnBackStarted(androidx.activity.b bVar) {
        v80.f0.B(this.f18444a, null, null, new c3(this, bVar, null, 1), 3);
    }
}
