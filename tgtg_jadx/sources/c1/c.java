package c1;

import m0.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f6847b;

    public /* synthetic */ c(h1 h1Var, int i11) {
        this.f6846a = i11;
        this.f6847b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6846a) {
            case 0:
                this.f6847b.c();
                break;
            default:
                this.f6847b.f28519f.cancel(true);
                break;
        }
    }
}
