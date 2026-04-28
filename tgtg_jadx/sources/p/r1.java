package p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f33993b;

    public /* synthetic */ r1(v1 v1Var, int i11) {
        this.f33992a = i11;
        this.f33993b = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33992a) {
            case 0:
                k1 k1Var = this.f33993b.f34042c;
                if (k1Var != null) {
                    k1Var.setListSelectionHidden(true);
                    k1Var.requestLayout();
                }
                break;
            default:
                v1 v1Var = this.f33993b;
                k1 k1Var2 = v1Var.f34042c;
                if (k1Var2 != null && k1Var2.isAttachedToWindow() && v1Var.f34042c.getCount() > v1Var.f34042c.getChildCount() && v1Var.f34042c.getChildCount() <= v1Var.f34051m) {
                    v1Var.f34064z.setInputMethodMode(2);
                    v1Var.show();
                    break;
                }
                break;
        }
    }
}
