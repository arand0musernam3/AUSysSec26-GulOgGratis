package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.app.tgtg.R;
import j4.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {
    public static final float l = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f28447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f28450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f28451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f28452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f28453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f28455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f28456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f28457k;

    public a(Context context) {
        Paint paint = new Paint();
        this.f28447a = paint;
        this.f28453g = new Path();
        this.f28457k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.a.f24265n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f28456j = (float) (Math.cos(l) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f28452f != z11) {
            this.f28452f = z11;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f28451e) {
            this.f28451e = fRound;
            invalidateSelf();
        }
        this.f28454h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f28449c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f28448b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f28450d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f11, float f12, float f13) {
        return s.a(f12, f11, f13, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z11 = false;
        int i11 = this.f28457k;
        if (i11 != 0 && (i11 == 1 || (i11 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z11 = true;
        }
        float f11 = this.f28448b;
        float fSqrt = (float) Math.sqrt(f11 * f11 * 2.0f);
        float f12 = this.f28455i;
        float f13 = this.f28449c;
        float fA = a(f13, fSqrt, f12);
        float fA2 = a(f13, this.f28450d, this.f28455i);
        float fRound = Math.round(a(0.0f, this.f28456j, this.f28455i));
        float fA3 = a(0.0f, l, this.f28455i);
        float fA4 = a(z11 ? 0.0f : -180.0f, z11 ? 180.0f : 0.0f, this.f28455i);
        double d3 = fA;
        double d11 = fA3;
        float fRound2 = Math.round(Math.cos(d11) * d3);
        float fRound3 = Math.round(Math.sin(d11) * d3);
        Path path = this.f28453g;
        path.rewind();
        float f14 = this.f28451e;
        Paint paint = this.f28447a;
        float fA5 = a(f14 + paint.getStrokeWidth(), -this.f28456j, this.f28455i);
        float f15 = (-fA2) / 2.0f;
        path.moveTo(f15 + fRound, 0.0f);
        path.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f15, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f15, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f28451e + ((((int) (fHeight - (r7 * 2.0f))) / 4) * 2));
        if (this.f28452f) {
            canvas.rotate(fA4 * (z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f28454h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f28454h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        Paint paint = this.f28447a;
        if (i11 != paint.getAlpha()) {
            paint.setAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28447a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f11) {
        if (this.f28455i != f11) {
            this.f28455i = f11;
            invalidateSelf();
        }
    }
}
