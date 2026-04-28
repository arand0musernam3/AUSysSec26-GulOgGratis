package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.e;
import com.app.tgtg.R;
import h0.g;
import n20.j;
import n20.o;
import n20.p;
import n20.q;
import n20.z;
import v20.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f12478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f12479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f12480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f12481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f12482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f12483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f12484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f12485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f12486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f12487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f12488k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12494r;

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i11) {
        super(a.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i11);
        this.f12478a = p.f30399a;
        this.f12483f = new Path();
        this.f12494r = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f12482e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f12479b = new RectF();
        this.f12480c = new RectF();
        this.f12488k = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j10.a.U, i11, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f12484g = g.p(context2, typedArrayObtainStyledAttributes, 9);
        this.f12487j = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.l = dimensionPixelSize;
        this.f12489m = dimensionPixelSize;
        this.f12490n = dimensionPixelSize;
        this.f12491o = dimensionPixelSize;
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f12489m = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f12490n = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f12491o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f12492p = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f12493q = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f12481d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f12486i = o.c(context2, attributeSet, i11, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new d20.a(this));
    }

    public final boolean a() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i11, int i12) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i11 - getPaddingRight();
        float paddingBottom = i12 - getPaddingBottom();
        RectF rectF = this.f12479b;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        o oVar = this.f12486i;
        q qVar = this.f12478a;
        Path path = this.f12483f;
        qVar.a(oVar, null, 1.0f, rectF, null, path);
        Path path2 = this.f12488k;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f12480c;
        rectF2.set(0.0f, 0.0f, i11, i12);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f12491o;
    }

    public final int getContentPaddingEnd() {
        int i11 = this.f12493q;
        return i11 != Integer.MIN_VALUE ? i11 : a() ? this.l : this.f12490n;
    }

    public int getContentPaddingLeft() {
        int i11;
        int i12;
        if (this.f12492p != Integer.MIN_VALUE || this.f12493q != Integer.MIN_VALUE) {
            if (a() && (i12 = this.f12493q) != Integer.MIN_VALUE) {
                return i12;
            }
            if (!a() && (i11 = this.f12492p) != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.l;
    }

    public int getContentPaddingRight() {
        int i11;
        int i12;
        if (this.f12492p != Integer.MIN_VALUE || this.f12493q != Integer.MIN_VALUE) {
            if (a() && (i12 = this.f12492p) != Integer.MIN_VALUE) {
                return i12;
            }
            if (!a() && (i11 = this.f12493q) != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.f12490n;
    }

    public final int getContentPaddingStart() {
        int i11 = this.f12492p;
        return i11 != Integer.MIN_VALUE ? i11 : a() ? this.f12490n : this.l;
    }

    public int getContentPaddingTop() {
        return this.f12489m;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public o getShapeAppearanceModel() {
        return this.f12486i;
    }

    public ColorStateList getStrokeColor() {
        return this.f12484g;
    }

    public float getStrokeWidth() {
        return this.f12487j;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f12488k, this.f12482e);
        if (this.f12484g == null) {
            return;
        }
        float f11 = this.f12487j;
        Paint paint = this.f12481d;
        paint.setStrokeWidth(f11);
        int colorForState = this.f12484g.getColorForState(getDrawableState(), this.f12484g.getDefaultColor());
        if (this.f12487j <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f12483f, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (!this.f12494r && isLayoutDirectionResolved()) {
            this.f12494r = true;
            if (!isPaddingRelative() && this.f12492p == Integer.MIN_VALUE && this.f12493q == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        d(i11, i12);
    }

    public void setContentPadding(int i11, int i12, int i13, int i14) {
        this.f12492p = Integer.MIN_VALUE;
        this.f12493q = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.l) + i11, (super.getPaddingTop() - this.f12489m) + i12, (super.getPaddingRight() - this.f12490n) + i13, (super.getPaddingBottom() - this.f12491o) + i14);
        this.l = i11;
        this.f12489m = i12;
        this.f12490n = i13;
        this.f12491o = i14;
    }

    public void setContentPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i11, (super.getPaddingTop() - this.f12489m) + i12, (super.getPaddingEnd() - getContentPaddingEnd()) + i13, (super.getPaddingBottom() - this.f12491o) + i14);
        this.l = a() ? i13 : i11;
        this.f12489m = i12;
        if (!a()) {
            i11 = i13;
        }
        this.f12490n = i11;
        this.f12491o = i14;
    }

    @Override // android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(getContentPaddingLeft() + i11, getContentPaddingTop() + i12, getContentPaddingRight() + i13, getContentPaddingBottom() + i14);
    }

    @Override // android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative(getContentPaddingStart() + i11, getContentPaddingTop() + i12, getContentPaddingEnd() + i13, getContentPaddingBottom() + i14);
    }

    @Override // n20.z
    public void setShapeAppearanceModel(@NonNull o oVar) {
        this.f12486i = oVar;
        j jVar = this.f12485h;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f12484g = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i11) {
        setStrokeColor(e.b(getContext(), i11));
    }

    public void setStrokeWidth(float f11) {
        if (this.f12487j != f11) {
            this.f12487j = f11;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i11) {
        setStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}
