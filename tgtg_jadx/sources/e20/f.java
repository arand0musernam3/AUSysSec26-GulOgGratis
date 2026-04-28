package e20;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f15643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f15644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f15645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15646d;

    public f(Drawable drawable, Drawable drawable2) {
        Drawable drawableMutate = drawable != null ? drawable.getConstantState().newDrawable().mutate() : new e();
        this.f15643a = drawableMutate;
        Drawable drawableMutate2 = drawable2.getConstantState().newDrawable().mutate();
        this.f15644b = drawableMutate2;
        int layoutDirection = drawable != null ? drawable.getLayoutDirection() : 3;
        int layoutDirection2 = drawable2.getLayoutDirection();
        drawableMutate.setLayoutDirection(layoutDirection);
        drawableMutate2.setLayoutDirection(layoutDirection2);
        drawableMutate2.setAlpha(0);
        this.f15645c = new float[2];
    }

    public final void a(float f11) {
        if (this.f15646d != f11) {
            this.f15646d = f11;
            float[] fArr = this.f15645c;
            i0.a(f11, fArr);
            this.f15643a.setAlpha((int) (fArr[0] * 255.0f));
            this.f15644b.setAlpha((int) (fArr[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f15643a.draw(canvas);
        this.f15644b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f15643a.getIntrinsicHeight(), this.f15644b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f15643a.getIntrinsicWidth(), this.f15644b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return Math.max(this.f15643a.getMinimumHeight(), this.f15644b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return Math.max(this.f15643a.getMinimumWidth(), this.f15644b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f15643a.isStateful() || this.f15644b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        float f11 = this.f15646d;
        Drawable drawable = this.f15644b;
        Drawable drawable2 = this.f15643a;
        if (f11 <= 0.5f) {
            drawable2.setAlpha(i11);
            drawable.setAlpha(0);
        } else {
            drawable2.setAlpha(0);
            drawable.setAlpha(i11);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i11, int i12, int i13, int i14) {
        super.setBounds(i11, i12, i13, i14);
        this.f15643a.setBounds(i11, i12, i13, i14);
        this.f15644b.setBounds(i11, i12, i13, i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15643a.setColorFilter(colorFilter);
        this.f15644b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return this.f15643a.setState(iArr) || this.f15644b.setState(iArr);
    }
}
