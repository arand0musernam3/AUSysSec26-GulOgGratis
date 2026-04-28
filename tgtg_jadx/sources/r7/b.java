package r7;

import n7.l;
import n7.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f37747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f37748c;

    public /* synthetic */ b(l lVar, t tVar, int i11) {
        this.f37746a = i11;
        this.f37747b = lVar;
        this.f37748c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37746a) {
            case 0:
                this.f37747b.onResult(this.f37748c);
                break;
            default:
                this.f37747b.onResult(this.f37748c);
                break;
        }
    }
}
