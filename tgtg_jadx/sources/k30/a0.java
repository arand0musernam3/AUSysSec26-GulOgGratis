package k30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient k f25873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient b0 f25874e;

    public a0(k kVar, b0 b0Var) {
        this.f25873d = kVar;
        this.f25874e = b0Var;
    }

    @Override // k30.m, k30.b
    public final h b() {
        return this.f25874e;
    }

    @Override // k30.b
    public final int c(Object[] objArr) {
        return this.f25874e.c(objArr);
    }

    @Override // k30.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25873d.get(obj) != null;
    }

    @Override // k30.b
    public final boolean h() {
        return true;
    }

    @Override // k30.b
    /* JADX INFO: renamed from: i */
    public final j00.g iterator() {
        return this.f25874e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((c0) this.f25873d).f25882f;
    }

    @Override // k30.m, k30.b
    public Object writeReplace() {
        return super.writeReplace();
    }
}
