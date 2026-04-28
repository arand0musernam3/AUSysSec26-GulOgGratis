package p5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i16)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = n5.j.f30542a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float F = jf.e.F(layout, lineForOffset, paint) + jf.e.E(layout, lineForOffset, paint);
            if (F == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(F, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return 0;
    }
}
