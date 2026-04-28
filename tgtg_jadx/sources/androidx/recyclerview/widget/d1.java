package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends f1 {
    @Override // androidx.recyclerview.widget.f1
    public final int b(View view) {
        return this.f3728a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.a) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int c(View view) {
        RecyclerView.a aVar = (RecyclerView.a) view.getLayoutParams();
        return this.f3728a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int d(View view) {
        RecyclerView.a aVar = (RecyclerView.a) view.getLayoutParams();
        return this.f3728a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int e(View view) {
        return this.f3728a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.a) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int f() {
        return this.f3728a.getWidth();
    }

    @Override // androidx.recyclerview.widget.f1
    public final int g() {
        y1 y1Var = this.f3728a;
        return y1Var.getWidth() - y1Var.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.f1
    public final int h() {
        return this.f3728a.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.f1
    public final int i() {
        return this.f3728a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.f1
    public final int j() {
        return this.f3728a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.f1
    public final int k() {
        return this.f3728a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.f1
    public final int l() {
        y1 y1Var = this.f3728a;
        return (y1Var.getWidth() - y1Var.getPaddingLeft()) - y1Var.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.f1
    public final int m(View view) {
        y1 y1Var = this.f3728a;
        Rect rect = this.f3730c;
        y1Var.getTransformedBoundingBox(view, true, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int n(View view) {
        y1 y1Var = this.f3728a;
        Rect rect = this.f3730c;
        y1Var.getTransformedBoundingBox(view, true, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.f1
    public final void o(int i11) {
        this.f3728a.offsetChildrenHorizontal(i11);
    }
}
