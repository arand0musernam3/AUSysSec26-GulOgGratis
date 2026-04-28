package q3;

import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f35971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f35972e;

    public g(int i11, int i12, int i13, Object[] objArr, Object[] objArr2) {
        super(i11, i12, 0);
        this.f35971d = objArr2;
        int i14 = (i12 - 1) & (-32);
        this.f35972e = new j(objArr, i11 > i14 ? i14 : i11, i14, i13);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        j jVar = this.f35972e;
        if (jVar.hasNext()) {
            this.f35953b++;
            return jVar.next();
        }
        int i11 = this.f35953b;
        this.f35953b = i11 + 1;
        return this.f35971d[i11 - jVar.f35954c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i1.c();
            return null;
        }
        int i11 = this.f35953b;
        j jVar = this.f35972e;
        int i12 = jVar.f35954c;
        if (i11 <= i12) {
            this.f35953b = i11 - 1;
            return jVar.previous();
        }
        int i13 = i11 - 1;
        this.f35953b = i13;
        return this.f35971d[i13 - i12];
    }
}
