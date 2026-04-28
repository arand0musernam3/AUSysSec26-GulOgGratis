package sc;

import ad.g;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f38997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f38998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f38999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f39000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f39001e = 1.0f;

    public c(Drawable drawable, g gVar) {
        this.f38997a = drawable;
        this.f38998b = gVar;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f38999c, this.f39000d);
            float f11 = this.f39001e;
            canvas.scale(f11, f11);
            this.f38997a.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f38997a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f38997a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f38997a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f38997a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f38997a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f38997a;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f38997a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.f38999c = 0.0f;
            this.f39000d = 0.0f;
            this.f39001e = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dL = w.l(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f38998b);
        double d3 = 2;
        int iA = j80.c.a((((double) iWidth) - (((double) intrinsicWidth) * dL)) / d3);
        int iA2 = j80.c.a((((double) iHeight) - (((double) intrinsicHeight) * dL)) / d3);
        drawable.setBounds(iA, iA2, intrinsicWidth + iA, intrinsicHeight + iA2);
        this.f38999c = rect.left;
        this.f39000d = rect.top;
        this.f39001e = (float) dL;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i11) {
        return this.f38997a.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.f38997a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        scheduleSelf(runnable, j9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f38997a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38997a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        this.f38997a.setTint(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        this.f38997a.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f38997a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f38997a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f38997a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f38997a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
