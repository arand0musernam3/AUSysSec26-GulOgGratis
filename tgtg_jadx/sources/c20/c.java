package c20;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import n20.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f6948b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6957k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6958m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n20.o f6960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f6961p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f6947a = n20.p.f30399a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f6949c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f6950d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f6951e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f6952f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.vectordrawable.graphics.drawable.g f6953g = new androidx.vectordrawable.graphics.drawable.g(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6959n = true;

    public c(n20.o oVar) {
        this.f6960o = oVar;
        Paint paint = new Paint(1);
        this.f6948b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z11 = this.f6959n;
        Rect rect = this.f6950d;
        Paint paint = this.f6948b;
        if (z11) {
            copyBounds(rect);
            float fHeight = this.f6954h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{x6.c.c(this.f6955i, this.f6958m), x6.c.c(this.f6956j, this.f6958m), x6.c.c(x6.c.e(this.f6956j, 0), this.f6958m), x6.c.c(x6.c.e(this.l, 0), this.f6958m), x6.c.c(this.l, this.f6958m), x6.c.c(this.f6957k, this.f6958m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f6959n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f6951e;
        rectF.set(rect);
        n20.d dVar = this.f6960o.f30392e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f6952f;
        rectF2.set(bounds);
        float fMin = Math.min(dVar.a(rectF2), rectF.width() / 2.0f);
        n20.o oVar = this.f6960o;
        rectF2.set(getBounds());
        if (oVar.g(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6953g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f6954h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        n20.o oVar = this.f6960o;
        Rect bounds = getBounds();
        RectF rectF = this.f6952f;
        rectF.set(bounds);
        if (oVar.g(rectF)) {
            n20.d dVar = this.f6960o.f30392e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), dVar.a(rectF));
            return;
        }
        Rect rect = this.f6950d;
        copyBounds(rect);
        RectF rectF2 = this.f6951e;
        rectF2.set(rect);
        n20.o oVar2 = this.f6960o;
        q qVar = this.f6947a;
        Path path = this.f6949c;
        qVar.a(oVar2, null, 1.0f, rectF2, null, path);
        b6.a.w(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        n20.o oVar = this.f6960o;
        Rect bounds = getBounds();
        RectF rectF = this.f6952f;
        rectF.set(bounds);
        if (!oVar.g(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f6954h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f6961p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f6959n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f6961p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f6958m)) != this.f6958m) {
            this.f6959n = true;
            this.f6958m = colorForState;
        }
        if (this.f6959n) {
            invalidateSelf();
        }
        return this.f6959n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f6948b.setAlpha(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6948b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
