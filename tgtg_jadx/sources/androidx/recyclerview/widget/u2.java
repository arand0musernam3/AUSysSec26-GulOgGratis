package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3935a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v2 f3936b;

    public u2(v2 v2Var) {
        this.f3936b = v2Var;
    }

    @Override // androidx.recyclerview.widget.c2
    public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        super.onScrollStateChanged(recyclerView, i11);
        if (i11 == 0 && this.f3935a) {
            this.f3935a = false;
            this.f3936b.snapToTargetExistingView();
        }
    }

    @Override // androidx.recyclerview.widget.c2
    public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return;
        }
        this.f3935a = true;
    }
}
