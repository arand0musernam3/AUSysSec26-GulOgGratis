package m00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f28689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f28690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f28691e;

    public p(q qVar, int i11, int i12) {
        this.f28691e = qVar;
        this.f28689c = i11;
        this.f28690d = i12;
    }

    @Override // m00.n
    public final Object[] b() {
        return this.f28691e.b();
    }

    @Override // m00.n
    public final int c() {
        return this.f28691e.c() + this.f28689c;
    }

    @Override // m00.n
    public final int d() {
        return this.f28691e.c() + this.f28689c + this.f28690d;
    }

    @Override // m00.n
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        xz.b.O(i11, this.f28690d);
        return this.f28691e.get(i11 + this.f28689c);
    }

    @Override // m00.q, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final q subList(int i11, int i12) {
        xz.b.P(i11, i12, this.f28690d);
        int i13 = this.f28689c;
        return this.f28691e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28690d;
    }
}
