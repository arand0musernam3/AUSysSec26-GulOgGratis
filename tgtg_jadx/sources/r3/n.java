package r3;

import q1.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37608d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f37608d) {
            case 0:
                int i11 = this.f37607c;
                this.f37607c = i11 + 2;
                Object[] objArr = this.f37605a;
                return new c0(1, objArr[i11], objArr[i11 + 1]);
            case 1:
                int i12 = this.f37607c;
                this.f37607c = i12 + 2;
                return this.f37605a[i12];
            default:
                int i13 = this.f37607c;
                this.f37607c = i13 + 2;
                return this.f37605a[i13 + 1];
        }
    }
}
