package m50;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f29676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f29677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29678c = -1;

    public a(Context context) {
        this.f29677b = context.getDrawable(2131230873);
        this.f29676a = context.getDrawable(2131230874);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f29677b.draw(canvas);
        canvas.drawColor(this.f29678c, PorterDuff.Mode.SRC_IN);
        this.f29676a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f29677b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i11, int i12, int i13, int i14) {
        this.f29677b.setBounds(i11, i12, i13, i14);
        this.f29676a.setBounds(i11, i12, i13, i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        this.f29677b.setBounds(rect);
        this.f29676a.setBounds(rect);
    }
}
