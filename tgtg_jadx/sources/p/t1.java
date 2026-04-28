package p;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v1 f34022a;

    public t1(v1 v1Var) {
        this.f34022a = v1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i11) {
        v1 v1Var = this.f34022a;
        r1 r1Var = v1Var.f34056r;
        t tVar = v1Var.f34064z;
        if (i11 != 1 || tVar.getInputMethodMode() == 2 || tVar.getContentView() == null) {
            return;
        }
        v1Var.f34060v.removeCallbacks(r1Var);
        r1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i11, int i12, int i13) {
    }
}
