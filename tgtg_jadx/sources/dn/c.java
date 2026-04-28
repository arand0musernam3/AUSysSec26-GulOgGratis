package dn;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14987b;

    public /* synthetic */ c(f fVar, int i11) {
        this.f14986a = i11;
        this.f14987b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14986a) {
            case 0:
                f fVar = this.f14987b;
                if (fVar.f15005m == null) {
                    fVar.c(false, true);
                } else {
                    fVar.c(true, false);
                }
                break;
            case 1:
                this.f14987b.c(false, true);
                break;
            default:
                this.f14987b.c(false, true);
                break;
        }
    }
}
