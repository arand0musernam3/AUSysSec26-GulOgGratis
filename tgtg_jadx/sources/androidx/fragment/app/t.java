package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3333b;

    public /* synthetic */ t(Object obj, int i11) {
        this.f3332a = i11;
        this.f3333b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3332a) {
            case 0:
                y yVar = (y) this.f3333b;
                yVar.mOnDismissListener.onDismiss(yVar.mDialog);
                break;
            case 1:
                t2 t2Var = (t2) this.f3333b;
                if (!t2Var.f3350b.isEmpty()) {
                    t2Var.e();
                }
                break;
            default:
                ((FragmentManager) this.f3333b).A(true);
                break;
        }
    }
}
