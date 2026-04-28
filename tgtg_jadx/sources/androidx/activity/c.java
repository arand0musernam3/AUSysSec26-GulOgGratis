package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f1712b;

    public /* synthetic */ c(ComponentActivity componentActivity, int i11) {
        this.f1711a = i11;
        this.f1712b = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f1711a;
        ComponentActivity componentActivity = this.f1712b;
        switch (i11) {
            case 0:
                int i12 = ComponentActivity.f1695a;
                componentActivity.invalidateMenu();
                break;
            default:
                ComponentActivity.w(componentActivity);
                break;
        }
    }
}
