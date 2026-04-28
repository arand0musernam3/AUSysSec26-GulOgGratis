package q3;

import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f35957d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f35958e;

    public d(Object obj, int i11) {
        super(i11, 1, 0);
        this.f35958e = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f35957d) {
            case 0:
                if (!hasNext()) {
                    i1.c();
                } else {
                    Object[] objArr = (Object[]) this.f35958e;
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
        switch (this.f35957d) {
            case 0:
                if (!hasPrevious()) {
                    i1.c();
                } else {
                    Object[] objArr = (Object[]) this.f35958e;
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

    public d(Object[] objArr, int i11, int i12) {
        super(i11, i12, 0);
        this.f35958e = objArr;
    }
}
