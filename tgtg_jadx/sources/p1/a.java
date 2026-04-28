package p1;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f34108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f34109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f34110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f34111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f34112e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f34115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f34116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f34117j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34113f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34114g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f34118k = PorterDuff.Mode.SRC_IN;

    public a(ColorStateList colorStateList, float f11) {
        this.f34108a = f11;
        Paint paint = new Paint(5);
        this.f34109b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f34115h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f34115h.getDefaultColor()));
        this.f34110c = new RectF();
        this.f34111d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        float f11;
        if (rect == null) {
            rect = getBounds();
        }
        float f12 = rect.left;
        float f13 = rect.top;
        float f14 = rect.right;
        float f15 = rect.bottom;
        RectF rectF = this.f34110c;
        rectF.set(f12, f13, f14, f15);
        Rect rect2 = this.f34111d;
        rect2.set(rect);
        if (this.f34113f) {
            float f16 = this.f34112e;
            float f17 = this.f34108a;
            boolean z11 = this.f34114g;
            if (z11) {
                f11 = (float) (((1.0d - b.f34119a) * ((double) f17)) + ((double) (1.5f * f16)));
            } else {
                int i11 = b.f34120b;
                f11 = 1.5f * f16;
            }
            if (z11) {
                f16 = (float) (((1.0d - b.f34119a) * ((double) f17)) + ((double) f16));
            }
            rect2.inset((int) Math.ceil(f16), (int) Math.ceil(f11));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z11;
        PorterDuffColorFilter porterDuffColorFilter = this.f34116i;
        Paint paint = this.f34109b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z11 = false;
        } else {
            paint.setColorFilter(this.f34116i);
            z11 = true;
        }
        RectF rectF = this.f34110c;
        float f11 = this.f34108a;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (z11) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f34111d, this.f34108a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f34117j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f34115h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f34115h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f34109b;
        boolean z11 = colorForState != paint.getColor();
        if (z11) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f34117j;
        if (colorStateList2 == null || (mode = this.f34118k) == null) {
            return z11;
        }
        this.f34116i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f34109b.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34109b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f34117j = colorStateList;
        this.f34116i = a(colorStateList, this.f34118k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f34118k = mode;
        this.f34116i = a(this.f34117j, mode);
        invalidateSelf();
    }
}
