package e20;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class i extends LinearLayoutCompat {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f15664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f15665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f15666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f15668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15669u;

    public i(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15665q = new Rect();
        this.f15666r = new Rect();
        this.f15667s = 119;
        this.f15668t = true;
        this.f15669u = false;
        TypedArray typedArrayM = i0.m(context, attributeSet, j10.a.f24425s, i11, 0, new int[0]);
        this.f15667s = typedArrayM.getInt(1, this.f15667s);
        Drawable drawable = typedArrayM.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f15668t = typedArrayM.getBoolean(2, true);
        typedArrayM.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f15664p;
        if (drawable != null) {
            if (this.f15669u) {
                this.f15669u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z11 = this.f15668t;
                Rect rect = this.f15665q;
                if (z11) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i11 = this.f15667s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f15666r;
                Gravity.apply(i11, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f11, float f12) {
        super.drawableHotspotChanged(f11, f12);
        Drawable drawable = this.f15664p;
        if (drawable != null) {
            drawable.setHotspot(f11, f12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f15664p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f15664p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f15664p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f15667s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15664p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f15669u = z11 | this.f15669u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f15669u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f15664p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f15664p);
            }
            this.f15664p = drawable;
            this.f15669u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f15667s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i11) {
        if (this.f15667s != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.f15667s = i11;
            if (i11 == 119 && this.f15664p != null) {
                this.f15664p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15664p;
    }

    public i(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i(@NonNull Context context) {
        this(context, null);
    }
}
