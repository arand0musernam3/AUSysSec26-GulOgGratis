package k30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f25897d;

    public f0(Object obj) {
        obj.getClass();
        this.f25897d = obj;
    }

    @Override // k30.m, k30.b
    public final h b() {
        d dVar = h.f25901b;
        Object[] objArr = {this.f25897d};
        m0.c.T(1, objArr);
        return h.j(1, objArr);
    }

    @Override // k30.b
    public final int c(Object[] objArr) {
        objArr[0] = this.f25897d;
        return 1;
    }

    @Override // k30.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25897d.equals(obj);
    }

    @Override // k30.b
    public final boolean h() {
        return false;
    }

    @Override // k30.m, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25897d.hashCode();
    }

    @Override // k30.b
    /* JADX INFO: renamed from: i */
    public final j00.g iterator() {
        return new q(this.f25897d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f25897d.toString() + ']';
    }

    @Override // k30.m, k30.b
    public Object writeReplace() {
        return super.writeReplace();
    }
}
