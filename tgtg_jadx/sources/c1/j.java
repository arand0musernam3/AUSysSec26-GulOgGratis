package c1;

import s0.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f6882b;

    public /* synthetic */ j(x0 x0Var, int i11) {
        this.f6881a = i11;
        this.f6882b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6881a) {
            case 0:
                this.f6882b.a();
                break;
            default:
                this.f6882b.b();
                break;
        }
    }
}
