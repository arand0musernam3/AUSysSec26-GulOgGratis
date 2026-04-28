package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1 f3955a;

    public v1(y1 y1Var) {
        this.f3955a = y1Var;
    }

    @Override // androidx.recyclerview.widget.c3
    public final int a(View view) {
        return this.f3955a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.a) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.c3
    public final int b() {
        return this.f3955a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.c3
    public final int c() {
        y1 y1Var = this.f3955a;
        return y1Var.getHeight() - y1Var.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.c3
    public final View d(int i11) {
        return this.f3955a.getChildAt(i11);
    }

    @Override // androidx.recyclerview.widget.c3
    public final int e(View view) {
        return this.f3955a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.a) view.getLayoutParams())).bottomMargin;
    }
}
