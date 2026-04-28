package t10;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import e20.e0;
import e20.f0;
import e20.i0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import n20.h;
import n20.j;
import n20.n;
import n20.o;
import n20.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends j implements Drawable.Callback, e0 {
    public static final int[] V1 = {R.attr.state_enabled};
    public static final ShapeDrawable W1 = new ShapeDrawable(new OvalShape());
    public final f0 A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public ColorStateList H;
    public boolean H1;
    public ColorStateList I;
    public int I1;
    public float J;
    public int J1;
    public float K;
    public ColorFilter K1;
    public ColorStateList L;
    public PorterDuffColorFilter L1;
    public float M;
    public ColorStateList M1;
    public ColorStateList N;
    public PorterDuff.Mode N1;
    public CharSequence O;
    public int[] O1;
    public boolean P;
    public ColorStateList P1;
    public Drawable Q;
    public WeakReference Q1;
    public TextUtils.TruncateAt R1;
    public boolean S1;
    public ColorStateList T;
    public int T1;
    public boolean U1;
    public float V;
    public boolean W;
    public boolean X;
    public Drawable Y;
    public RippleDrawable Z;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public SpannableStringBuilder f39626f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f39627g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ColorStateList f39628h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f39629h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Drawable f39630i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public ColorStateList f39631j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public k10.e f39632k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public k10.e f39633l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public float f39634m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public float f39635n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public float f39636o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public float f39637p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public float f39638q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public float f39639r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public float f39640s1;
    public float t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public float f39641t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final Context f39642u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final Paint f39643v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final Paint.FontMetrics f39644w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final RectF f39645x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final PointF f39646y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final Path f39647z1;

    public b(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, com.app.tgtg.R.style.Widget_MaterialComponents_Chip_Action);
        this.K = -1.0f;
        this.f39643v1 = new Paint(1);
        this.f39644w1 = new Paint.FontMetrics();
        this.f39645x1 = new RectF();
        this.f39646y1 = new PointF();
        this.f39647z1 = new Path();
        this.J1 = 255;
        this.N1 = PorterDuff.Mode.SRC_IN;
        this.Q1 = new WeakReference(null);
        p(context);
        this.f39642u1 = context;
        f0 f0Var = new f0(this);
        this.A1 = f0Var;
        this.O = "";
        f0Var.f15647a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = V1;
        setState(iArr);
        d0(iArr);
        this.S1 = true;
        W1.setTint(-1);
    }

    public static boolean K(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean L(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void m0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void F(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Y) {
            if (drawable.isStateful()) {
                drawable.setState(this.O1);
            }
            drawable.setTintList(this.f39628h0);
            return;
        }
        Drawable drawable2 = this.Q;
        if (drawable == drawable2 && this.W) {
            drawable2.setTintList(this.T);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void G(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (k0() || j0()) {
            float f11 = this.f39634m1 + this.f39635n1;
            Drawable drawable = this.H1 ? this.f39630i1 : this.Q;
            float intrinsicWidth = this.V;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f12 = rect.left + f11;
                rectF.left = f12;
                rectF.right = f12 + intrinsicWidth;
            } else {
                float f13 = rect.right - f11;
                rectF.right = f13;
                rectF.left = f13 - intrinsicWidth;
            }
            Drawable drawable2 = this.H1 ? this.f39630i1 : this.Q;
            float fCeil = this.V;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(i0.g(this.f39642u1, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float H() {
        if (!k0() && !j0()) {
            return 0.0f;
        }
        float f11 = this.f39635n1;
        Drawable drawable = this.H1 ? this.f39630i1 : this.Q;
        float intrinsicWidth = this.V;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f11 + this.f39636o1;
    }

    public final float I() {
        if (l0()) {
            return this.f39639r1 + this.t0 + this.f39640s1;
        }
        return 0.0f;
    }

    public final float J() {
        return this.U1 ? m() : this.K;
    }

    public final void M() {
        Chip chip = (Chip) this.Q1.get();
        if (chip != null) {
            chip.c(chip.f12427q);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(int[] r10, int[] r11) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t10.b.N(int[], int[]):boolean");
    }

    public final void O(boolean z11) {
        if (this.f39627g1 != z11) {
            this.f39627g1 = z11;
            float fH = H();
            if (!z11 && this.H1) {
                this.H1 = false;
            }
            float fH2 = H();
            invalidateSelf();
            if (fH != fH2) {
                M();
            }
        }
    }

    public final void P(Drawable drawable) {
        if (this.f39630i1 != drawable) {
            float fH = H();
            this.f39630i1 = drawable;
            float fH2 = H();
            m0(this.f39630i1);
            F(this.f39630i1);
            invalidateSelf();
            if (fH != fH2) {
                M();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f39631j1 != colorStateList) {
            this.f39631j1 = colorStateList;
            if (this.f39629h1 && (drawable = this.f39630i1) != null && this.f39627g1) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void R(boolean z11) {
        if (this.f39629h1 != z11) {
            boolean zJ0 = j0();
            this.f39629h1 = z11;
            boolean zJ02 = j0();
            if (zJ0 != zJ02) {
                Drawable drawable = this.f39630i1;
                if (zJ02) {
                    F(drawable);
                } else {
                    m0(drawable);
                }
                invalidateSelf();
                M();
            }
        }
    }

    public final void S(float f11) {
        if (this.K != f11) {
            this.K = f11;
            n nVarH = this.f30345b.f30318a.h();
            nVarH.b(f11);
            setShapeAppearanceModel(nVarH.a());
        }
    }

    public final void T(Drawable drawable) {
        Drawable drawable2 = this.Q;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fH = H();
            this.Q = drawable != null ? drawable.mutate() : null;
            float fH2 = H();
            m0(drawable2);
            if (k0()) {
                F(this.Q);
            }
            invalidateSelf();
            if (fH != fH2) {
                M();
            }
        }
    }

    public final void U(float f11) {
        if (this.V != f11) {
            float fH = H();
            this.V = f11;
            float fH2 = H();
            invalidateSelf();
            if (fH != fH2) {
                M();
            }
        }
    }

    public final void V(ColorStateList colorStateList) {
        this.W = true;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (k0()) {
                this.Q.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void W(boolean z11) {
        if (this.P != z11) {
            boolean zK0 = k0();
            this.P = z11;
            boolean zK02 = k0();
            if (zK0 != zK02) {
                Drawable drawable = this.Q;
                if (zK02) {
                    F(drawable);
                } else {
                    m0(drawable);
                }
                invalidateSelf();
                M();
            }
        }
    }

    public final void X(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (this.U1) {
                z(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(float f11) {
        if (this.M != f11) {
            this.M = f11;
            this.f39643v1.setStrokeWidth(f11);
            if (this.U1) {
                A(f11);
            }
            invalidateSelf();
        }
    }

    public final void Z(Drawable drawable) {
        Drawable drawable2 = this.Y;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fI = I();
            this.Y = drawable != null ? drawable.mutate() : null;
            this.Z = new RippleDrawable(k20.a.c(this.N), this.Y, W1);
            float fI2 = I();
            m0(drawable2);
            if (l0()) {
                F(this.Y);
            }
            invalidateSelf();
            if (fI != fI2) {
                M();
            }
        }
    }

    @Override // n20.j, e20.e0
    public final void a() {
        M();
        invalidateSelf();
    }

    public final void a0(float f11) {
        if (this.f39640s1 != f11) {
            this.f39640s1 = f11;
            invalidateSelf();
            if (l0()) {
                M();
            }
        }
    }

    public final void b0(float f11) {
        if (this.t0 != f11) {
            this.t0 = f11;
            invalidateSelf();
            if (l0()) {
                M();
            }
        }
    }

    public final void c0(float f11) {
        if (this.f39639r1 != f11) {
            this.f39639r1 = f11;
            invalidateSelf();
            if (l0()) {
                M();
            }
        }
    }

    public final boolean d0(int[] iArr) {
        if (Arrays.equals(this.O1, iArr)) {
            return false;
        }
        this.O1 = iArr;
        if (l0()) {
            return N(getState(), iArr);
        }
        return false;
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i11;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f11;
        int i12;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i11 = this.J1) == 0) {
            return;
        }
        if (i11 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i11);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z11 = this.U1;
        Paint paint = this.f39643v1;
        RectF rectF = this.f39645x1;
        if (!z11) {
            paint.setColor(this.B1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, J(), J(), paint);
        }
        if (!this.U1) {
            paint.setColor(this.C1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.K1;
            if (colorFilter == null) {
                colorFilter = this.L1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, J(), J(), paint);
        }
        if (this.U1) {
            super.draw(canvas);
        }
        if (this.M > 0.0f && !this.U1) {
            paint.setColor(this.E1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.U1) {
                ColorFilter colorFilter2 = this.K1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.L1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f12 = bounds.left;
            float f13 = this.M / 2.0f;
            rectF.set(f12 + f13, bounds.top + f13, bounds.right - f13, bounds.bottom - f13);
            float f14 = this.K - (this.M / 2.0f);
            canvas2.drawRoundRect(rectF, f14, f14, paint);
        }
        paint.setColor(this.F1);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.U1) {
            RectF rectF2 = new RectF(bounds);
            h hVar = this.f30345b;
            o oVar = hVar.f30318a;
            float[] fArr = this.C;
            float f15 = hVar.f30327j;
            m1.a aVar = this.f30360r;
            q qVar = this.f30361s;
            f11 = 2.0f;
            Path path = this.f39647z1;
            qVar.a(oVar, fArr, f15, rectF2, aVar, path);
            g(canvas2, paint, path, this.f30345b.f30318a, this.C, i());
        } else {
            canvas2.drawRoundRect(rectF, J(), J(), paint);
            f11 = 2.0f;
        }
        if (k0()) {
            G(bounds, rectF);
            float f16 = rectF.left;
            float f17 = rectF.top;
            canvas2.translate(f16, f17);
            this.Q.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Q.draw(canvas2);
            canvas2.translate(-f16, -f17);
        }
        if (j0()) {
            G(bounds, rectF);
            float f18 = rectF.left;
            float f19 = rectF.top;
            canvas2.translate(f18, f19);
            this.f39630i1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f39630i1.draw(canvas2);
            canvas2.translate(-f18, -f19);
        }
        if (this.S1 && this.O != null) {
            PointF pointF = this.f39646y1;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.O;
            f0 f0Var = this.A1;
            if (charSequence != null) {
                float fH = H() + this.f39634m1 + this.f39637p1;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fH;
                } else {
                    pointF.x = bounds.right - fH;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = f0Var.f15647a;
                Paint.FontMetrics fontMetrics = this.f39644w1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f11);
            }
            rectF.setEmpty();
            if (this.O != null) {
                float fH2 = H() + this.f39634m1 + this.f39637p1;
                float fI = I() + this.f39641t1 + this.f39638q1;
                int layoutDirection = getLayoutDirection();
                int i13 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i13 + fH2;
                    rectF.right = bounds.right - fI;
                } else {
                    rectF.left = i13 + fI;
                    rectF.right = bounds.right - fH2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            j20.d dVar = f0Var.f15653g;
            TextPaint textPaint2 = f0Var.f15647a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                f0Var.f15653g.d(this.f39642u1, textPaint2, f0Var.f15648b);
            }
            textPaint2.setTextAlign(align);
            boolean z12 = Math.round(f0Var.a(this.O.toString())) > Math.round(rectF.width());
            if (z12) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i12 = iSave;
            } else {
                i12 = 0;
            }
            CharSequence charSequenceEllipsize = this.O;
            if (z12 && this.R1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.R1);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z12) {
                canvas2.restoreToCount(i12);
            }
        }
        if (l0()) {
            rectF.setEmpty();
            if (l0()) {
                float f20 = this.f39641t1 + this.f39640s1;
                if (getLayoutDirection() == 0) {
                    float f21 = bounds.right - f20;
                    rectF.right = f21;
                    rectF.left = f21 - this.t0;
                } else {
                    float f22 = bounds.left + f20;
                    rectF.left = f22;
                    rectF.right = f22 + this.t0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f23 = this.t0;
                float f24 = fExactCenterY - (f23 / f11);
                rectF.top = f24;
                rectF.bottom = f24 + f23;
            }
            float f25 = rectF.left;
            float f26 = rectF.top;
            canvas2.translate(f25, f26);
            this.Y.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Z.setBounds(this.Y.getBounds());
            this.Z.jumpToCurrentState();
            this.Z.draw(canvas2);
            canvas2.translate(-f25, -f26);
        }
        if (this.J1 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    public final void e0(ColorStateList colorStateList) {
        if (this.f39628h0 != colorStateList) {
            this.f39628h0 = colorStateList;
            if (l0()) {
                this.Y.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void f0(boolean z11) {
        if (this.X != z11) {
            boolean zL0 = l0();
            this.X = z11;
            boolean zL02 = l0();
            if (zL0 != zL02) {
                Drawable drawable = this.Y;
                if (zL02) {
                    F(drawable);
                } else {
                    m0(drawable);
                }
                invalidateSelf();
                M();
            }
        }
    }

    public final void g0(float f11) {
        if (this.f39636o1 != f11) {
            float fH = H();
            this.f39636o1 = f11;
            float fH2 = H();
            invalidateSelf();
            if (fH != fH2) {
                M();
            }
        }
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.J1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.K1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(I() + this.A1.a(this.O.toString()) + H() + this.f39634m1 + this.f39637p1 + this.f39638q1 + this.f39641t1), this.T1);
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.U1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.J, this.K);
        } else {
            outline.setRoundRect(bounds, this.K);
            outline2 = outline;
        }
        outline2.setAlpha(this.J1 / 255.0f);
    }

    public final void h0(float f11) {
        if (this.f39635n1 != f11) {
            float fH = H();
            this.f39635n1 = f11;
            float fH2 = H();
            invalidateSelf();
            if (fH != fH2) {
                M();
            }
        }
    }

    public final void i0(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            this.P1 = null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (K(this.H) || K(this.I) || K(this.L)) {
            return true;
        }
        j20.d dVar = this.A1.f15653g;
        if (dVar == null || (colorStateList = dVar.f24466k) == null || !colorStateList.isStateful()) {
            return (this.f39629h1 && this.f39630i1 != null && this.f39627g1) || L(this.Q) || L(this.f39630i1) || K(this.M1);
        }
        return true;
    }

    public final boolean j0() {
        return this.f39629h1 && this.f39630i1 != null && this.H1;
    }

    public final boolean k0() {
        return this.P && this.Q != null;
    }

    public final boolean l0() {
        return this.X && this.Y != null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i11) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i11);
        if (k0()) {
            zOnLayoutDirectionChanged |= this.Q.setLayoutDirection(i11);
        }
        if (j0()) {
            zOnLayoutDirectionChanged |= this.f39630i1.setLayoutDirection(i11);
        }
        if (l0()) {
            zOnLayoutDirectionChanged |= this.Y.setLayoutDirection(i11);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i11) {
        boolean zOnLevelChange = super.onLevelChange(i11);
        if (k0()) {
            zOnLevelChange |= this.Q.setLevel(i11);
        }
        if (j0()) {
            zOnLevelChange |= this.f39630i1.setLevel(i11);
        }
        if (l0()) {
            zOnLevelChange |= this.Y.setLevel(i11);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.U1) {
            super.onStateChange(iArr);
        }
        return N(iArr, this.O1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j9);
        }
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        if (this.J1 != i11) {
            this.J1 = i11;
            invalidateSelf();
        }
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.K1 != colorFilter) {
            this.K1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.M1 != colorStateList) {
            this.M1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // n20.j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.N1 != mode) {
            this.N1 = mode;
            ColorStateList colorStateList = this.M1;
            this.L1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        if (k0()) {
            visible |= this.Q.setVisible(z11, z12);
        }
        if (j0()) {
            visible |= this.f39630i1.setVisible(z11, z12);
        }
        if (l0()) {
            visible |= this.Y.setVisible(z11, z12);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
