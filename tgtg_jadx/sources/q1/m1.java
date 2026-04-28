package q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends kotlin.collections.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f35793b;

    public m1(l1 l1Var) {
        this.f35793b = l1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35792a < this.f35793b.f();
    }

    @Override // kotlin.collections.s0
    public final int nextInt() {
        int i11 = this.f35792a;
        this.f35792a = i11 + 1;
        return this.f35793b.c(i11);
    }
}
