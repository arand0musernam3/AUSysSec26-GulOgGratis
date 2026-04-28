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
import android.os.SystemClock;
import j4.s;
import java.util.ArrayList;
import n80.p;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f38967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f38970d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f38973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f38976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f38977k;

    public a(Drawable drawable, Drawable drawable2, g gVar, int i11, boolean z11) {
        this.f38967a = gVar;
        this.f38968b = i11;
        this.f38969c = z11;
        this.f38971e = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f38972f = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f38974h = 255;
        this.f38976j = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f38977k = drawableMutate;
        if (i11 <= 0) {
            i4.a.f("durationMillis must be > 0.");
            throw null;
        }
        Drawable drawable3 = this.f38976j;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
    }

    public final int a(Integer num, Integer num2) {
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    public final void b() {
        this.f38975i = 2;
        this.f38976j = null;
        ArrayList arrayList = this.f38970d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i11)).onAnimationEnd(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dL = w.l(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f38967a);
        double d3 = 2;
        int iA = j80.c.a((((double) iWidth) - (((double) intrinsicWidth) * dL)) / d3);
        int iA2 = j80.c.a((((double) iHeight) - (dL * ((double) intrinsicHeight))) / d3);
        drawable.setBounds(rect.left + iA, rect.top + iA2, rect.right - iA, rect.bottom - iA2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i11 = this.f38975i;
        if (i11 == 0) {
            Drawable drawable2 = this.f38976j;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f38974h);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f38977k;
        if (i11 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f38974h);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f38973g) / ((double) this.f38968b);
        double dA = p.a(dUptimeMillis, 0.0d, 1.0d);
        int i12 = this.f38974h;
        int i13 = (int) (dA * ((double) i12));
        if (this.f38969c) {
            i12 -= i13;
        }
        boolean z11 = dUptimeMillis >= 1.0d;
        if (!z11 && (drawable = this.f38976j) != null) {
            drawable.setAlpha(i12);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i13);
            iSave = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z11) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f38974h;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i11 = this.f38975i;
        if (i11 == 0) {
            Drawable drawable = this.f38976j;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f38977k;
        if (i11 != 1) {
            if (i11 == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f38976j;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f38972f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f38971e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f38976j;
        int i11 = this.f38975i;
        if (i11 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f38977k;
        if (i11 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f38975i == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f38976j;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f38977k;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i11) {
        Drawable drawable = this.f38976j;
        boolean level = drawable != null ? drawable.setLevel(i11) : false;
        Drawable drawable2 = this.f38977k;
        return level || (drawable2 != null ? drawable2.setLevel(i11) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f38976j;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f38977k;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        scheduleSelf(runnable, j9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        if (i11 < 0 || i11 >= 256) {
            i4.a.i(s.f(i11, "Invalid alpha: "));
        } else {
            this.f38974h = i11;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f38976j;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f38977k;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        Drawable drawable = this.f38976j;
        if (drawable != null) {
            drawable.setTint(i11);
        }
        Drawable drawable2 = this.f38977k;
        if (drawable2 != null) {
            drawable2.setTint(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f38976j;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f38977k;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f38976j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f38977k;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f38976j;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f38977k;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f38976j;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f38977k;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f38975i != 0) {
            return;
        }
        this.f38975i = 1;
        this.f38973g = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f38970d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i11)).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f38976j;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f38977k;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f38975i != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
