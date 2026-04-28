package k00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient l f25658c;

    public j(l lVar) {
        this.f25658c = lVar;
    }

    @Override // k00.l, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f25658c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i11) {
        l lVar = this.f25658c;
        a.e(i11, lVar.size());
        return lVar.get((lVar.size() - 1) - i11);
    }

    @Override // k00.l
    public final l h() {
        return this.f25658c;
    }

    @Override // k00.l, java.util.List
    /* JADX INFO: renamed from: i */
    public final l subList(int i11, int i12) {
        l lVar = this.f25658c;
        a.m(i11, i12, lVar.size());
        return lVar.subList(lVar.size() - i12, lVar.size() - i11).h();
    }

    @Override // k00.l, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f25658c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // k00.l, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f25658c.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25658c.size();
    }
}
