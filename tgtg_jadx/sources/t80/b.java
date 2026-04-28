package t80;

import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends q3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39840d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f39841e;

    public b(Object[] objArr, int i11, int i12) {
        super(i11, i12, 1);
        this.f39841e = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f39840d) {
            case 0:
                if (!hasNext()) {
                    i1.c();
                } else {
                    Object[] objArr = (Object[]) this.f39841e;
                    int i11 = this.f35953b;
                    this.f35953b = i11 + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    i1.c();
                } else {
                    this.f35953b++;
                }
                break;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f39840d) {
            case 0:
                if (!hasPrevious()) {
                    i1.c();
                } else {
                    Object[] objArr = (Object[]) this.f39841e;
                    int i11 = this.f35953b - 1;
                    this.f35953b = i11;
                }
                break;
            default:
                if (!hasPrevious()) {
                    i1.c();
                } else {
                    this.f35953b--;
                }
                break;
        }
        return null;
    }

    public b(Object obj, int i11) {
        super(i11, 1, 1);
        this.f39841e = obj;
    }
}
