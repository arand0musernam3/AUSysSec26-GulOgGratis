package kotlin.collections;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f26504c;

    public e1(f1 f1Var) {
        this.f26504c = f1Var;
        this.f26502a = f1Var.f26509e;
        this.f26503b = f1Var.f26508d;
    }

    @Override // kotlin.collections.b
    public final void computeNext() {
        if (this.f26502a == 0) {
            done();
            return;
        }
        f1 f1Var = this.f26504c;
        setNext(f1Var.f26506b[this.f26503b]);
        this.f26503b = (this.f26503b + 1) % f1Var.f26507c;
        this.f26502a--;
    }
}
