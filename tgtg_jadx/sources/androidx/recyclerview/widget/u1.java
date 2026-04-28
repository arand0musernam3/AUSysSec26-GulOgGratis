package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1 f3934a;

    public u1(y1 y1Var) {
        this.f3934a = y1Var;
    }

    @Override // androidx.recyclerview.widget.c3
    public final int a(View view) {
        return this.f3934a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.a) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.c3
    public final int b() {
        return this.f3934a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.c3
    public final int c() {
        y1 y1Var = this.f3934a;
        return y1Var.getWidth() - y1Var.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.c3
    public final View d(int i11) {
        return this.f3934a.getChildAt(i11);
    }

    @Override // androidx.recyclerview.widget.c3
    public final int e(View view) {
        return this.f3934a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.a) view.getLayoutParams())).rightMargin;
    }
}
