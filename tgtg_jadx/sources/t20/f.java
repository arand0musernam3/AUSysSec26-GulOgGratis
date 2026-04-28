package t20;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends n20.j {
    public static final /* synthetic */ int I = 0;
    public e H;

    public final void F(float f11, float f12, float f13, float f14) {
        RectF rectF = this.H.f39680s;
        if (f11 == rectF.left && f12 == rectF.top && f13 == rectF.right && f14 == rectF.bottom) {
            return;
        }
        rectF.set(f11, f12, f13, f14);
        invalidateSelf();
    }

    @Override // n20.j
    public final void h(Canvas canvas) {
        if (this.H.f39680s.isEmpty()) {
            super.h(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.H.f39680s);
        super.h(canvas);
        canvas.restore();
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.H = new e(this.H);
        return this;
    }
}
