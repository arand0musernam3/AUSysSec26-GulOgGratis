package t80;

import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends q3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f39852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f39853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i11, int i12, int i13, Object[] objArr, Object[] objArr2) {
        super(i11, i12, 1);
        objArr.getClass();
        objArr2.getClass();
        this.f39852d = objArr2;
        int i14 = (i12 - 1) & (-32);
        this.f39853e = new h(objArr, i11 > i14 ? i14 : i11, i14, i13);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        h hVar = this.f39853e;
        if (hVar.hasNext()) {
            this.f35953b++;
            return hVar.next();
        }
        int i11 = this.f35953b;
        this.f35953b = i11 + 1;
        return this.f39852d[i11 - hVar.f35954c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i1.c();
            return null;
        }
        int i11 = this.f35953b;
        h hVar = this.f39853e;
        int i12 = hVar.f35954c;
        if (i11 <= i12) {
            this.f35953b = i11 - 1;
            return hVar.previous();
        }
        int i13 = i11 - 1;
        this.f35953b = i13;
        return this.f39852d[i13 - i12];
    }
}
