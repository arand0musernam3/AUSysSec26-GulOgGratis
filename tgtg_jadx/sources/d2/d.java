package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13771a;

    public /* synthetic */ d(int i11) {
        this.f13771a = i11;
    }

    @Override // d2.h
    public final void b(z5.c cVar, int i11, int[] iArr, int[] iArr2) {
        switch (this.f13771a) {
            case 0:
                i.c(i11, iArr, iArr2, false);
                break;
            default:
                i.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f13771a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
