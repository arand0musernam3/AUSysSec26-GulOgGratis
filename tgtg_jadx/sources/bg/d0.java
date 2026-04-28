package bg;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f6142b;

    @Override // androidx.recyclerview.widget.t1
    public final void onDraw(Canvas canvas, RecyclerView recyclerView) {
        canvas.getClass();
        recyclerView.getClass();
        int paddingLeft = recyclerView.getPaddingLeft();
        int i11 = this.f6141a;
        int i12 = paddingLeft + i11;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - i11;
        Drawable drawable = this.f6142b;
        drawable.setBounds(i12, 0, width, drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        int childCount = recyclerView.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = recyclerView.getChildAt(i13);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.getClass();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.a) layoutParams)).bottomMargin;
            drawable.setBounds(i12, bottom, width, drawable.getIntrinsicHeight() + bottom);
            drawable.draw(canvas);
        }
    }
}
