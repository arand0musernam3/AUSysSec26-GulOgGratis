package com.adyen.checkout.ui.core.internal.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.adyen.checkout.ui.core.R;
import com.braze.models.BrazeGeofence;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0015J\u0018\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0014R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015¨\u0006+"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/RoundCornerImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "borderEnabled", "getBorderEnabled", "()Z", "setBorderEnabled", "(Z)V", "", BrazeGeofence.RADIUS_METERS, "getRadius", "()F", "setRadius", "(F)V", "strokeColor", "getStrokeColor", "()I", "setStrokeColor", "(I)V", "strokePaint", "Landroid/graphics/Paint;", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "applyAttrs", "", "typedArrayAttrs", "Landroid/content/res/TypedArray;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "Companion", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoundCornerImageView extends AppCompatImageView {
    public static final float DEFAULT_RADIUS = 9.0f;
    public static final int DEFAULT_STROKE_COLOR = -16777216;
    public static final float DEFAULT_STROKE_WIDTH = 4.0f;
    private boolean borderEnabled;
    private float radius;
    private int strokeColor;

    @NotNull
    private final Paint strokePaint;
    private float strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.strokePaint = new Paint();
        this.borderEnabled = true;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.RoundCornerImageView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        applyAttrs(typedArrayObtainStyledAttributes);
    }

    private final void applyAttrs(TypedArray typedArrayAttrs) {
        try {
            setStrokeColor(typedArrayAttrs.getColor(R.styleable.RoundCornerImageView_adyenStrokeColor, DEFAULT_STROKE_COLOR));
            setStrokeWidth(typedArrayAttrs.getDimension(R.styleable.RoundCornerImageView_adyenStrokeWidth, 4.0f));
            setRadius(typedArrayAttrs.getDimension(R.styleable.RoundCornerImageView_adyenRadius, 9.0f));
        } finally {
            typedArrayAttrs.recycle();
        }
    }

    public final boolean getBorderEnabled() {
        return this.borderEnabled;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        if (!this.borderEnabled) {
            super.onDraw(canvas);
            return;
        }
        float f11 = this.strokeWidth;
        float f12 = 2;
        RectF rectF = new RectF(f11 / f12, f11 / f12, getWidth() - (this.strokeWidth / f12), getHeight() - (this.strokeWidth / f12));
        this.strokePaint.reset();
        if (this.strokeWidth > 0.0f) {
            this.strokePaint.setStyle(Paint.Style.STROKE);
            this.strokePaint.setAntiAlias(true);
            this.strokePaint.setColor(this.strokeColor);
            this.strokePaint.setStrokeWidth(this.strokeWidth);
            float f13 = this.radius;
            canvas.drawRoundRect(rectF, f13, f13, this.strokePaint);
        }
        Path path = new Path();
        float f14 = this.radius;
        path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float f11 = this.strokeWidth;
        super.onMeasure((((int) f11) * 2) + widthMeasureSpec, (((int) f11) * 2) + heightMeasureSpec);
    }

    public final void setBorderEnabled(boolean z11) {
        this.borderEnabled = z11;
        invalidate();
    }

    public final void setRadius(float f11) {
        this.radius = f11;
        invalidate();
    }

    public final void setStrokeColor(int i11) {
        this.strokeColor = i11;
        invalidate();
    }

    public final void setStrokeWidth(float f11) {
        this.strokeWidth = f11;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundCornerImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ RoundCornerImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundCornerImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
