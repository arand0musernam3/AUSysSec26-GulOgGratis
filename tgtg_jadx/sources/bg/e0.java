package bg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6143a;

    public e0(@Nullable Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        if (this.f6143a > 0) {
            int size = View.MeasureSpec.getSize(i12);
            int mode = View.MeasureSpec.getMode(i12);
            if (mode == Integer.MIN_VALUE) {
                View.MeasureSpec.makeMeasureSpec(Math.min(size, this.f6143a), Integer.MIN_VALUE);
            } else if (mode == 0) {
                View.MeasureSpec.makeMeasureSpec(this.f6143a, Integer.MIN_VALUE);
            } else if (mode == 1073741824) {
                View.MeasureSpec.makeMeasureSpec(Math.min(size, this.f6143a), 1073741824);
            }
        }
        super.onMeasure(i11, i12);
    }

    public e0(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public e0(@Nullable Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
