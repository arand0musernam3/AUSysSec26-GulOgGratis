package oa;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import e20.k;
import j4.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinearInterpolator f32244g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u8.a f32245h = new u8.a(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f32246i = {RoundCornerImageView.DEFAULT_STROKE_COLOR};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f32247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f32248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f32249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ValueAnimator f32250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f32251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32252f;

    public c(Context context) {
        context.getClass();
        this.f32249c = context.getResources();
        b bVar = new b();
        this.f32247a = bVar;
        bVar.f32232i = f32246i;
        bVar.a(0);
        bVar.f32231h = 2.5f;
        bVar.f32225b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new k(this, bVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f32244g);
        valueAnimatorOfFloat.addListener(new c70.b(this, bVar));
        this.f32250d = valueAnimatorOfFloat;
    }

    public static void d(float f11, b bVar) {
        if (f11 <= 0.75f) {
            bVar.f32243u = bVar.f32232i[bVar.f32233j];
            return;
        }
        float f12 = (f11 - 0.75f) / 0.25f;
        int[] iArr = bVar.f32232i;
        int i11 = bVar.f32233j;
        int i12 = iArr[i11];
        int i13 = iArr[(i11 + 1) % iArr.length];
        bVar.f32243u = ((((i12 >> 24) & 255) + ((int) ((((i13 >> 24) & 255) - r1) * f12))) << 24) | ((((i12 >> 16) & 255) + ((int) ((((i13 >> 16) & 255) - r3) * f12))) << 16) | ((((i12 >> 8) & 255) + ((int) ((((i13 >> 8) & 255) - r4) * f12))) << 8) | ((i12 & 255) + ((int) (f12 * ((i13 & 255) - r2))));
    }

    public final void a(float f11, b bVar, boolean z11) {
        float interpolation;
        if (this.f32252f) {
            d(f11, bVar);
            float fFloor = (float) (Math.floor(bVar.f32235m / 0.8f) + 1.0d);
            float f12 = bVar.f32234k;
            float f13 = bVar.l;
            bVar.f32228e = (((f13 - 0.01f) - f12) * f11) + f12;
            bVar.f32229f = f13;
            float f14 = bVar.f32235m;
            bVar.f32230g = s.a(fFloor, f14, f11, f14);
            return;
        }
        if (f11 != 1.0f || z11) {
            float f15 = bVar.f32235m;
            float interpolation2 = bVar.f32234k;
            u8.a aVar = f32245h;
            if (f11 < 0.5f) {
                interpolation = (aVar.getInterpolation(f11 / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f16 = interpolation2 + 0.79f;
                interpolation2 = f16 - (((1.0f - aVar.getInterpolation((f11 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f16;
            }
            float f17 = (0.20999998f * f11) + f15;
            float f18 = (f11 + this.f32251e) * 216.0f;
            bVar.f32228e = interpolation2;
            bVar.f32229f = interpolation;
            bVar.f32230g = f17;
            this.f32248b = f18;
        }
    }

    public final void b(float f11, float f12, float f13, float f14) {
        float f15 = this.f32249c.getDisplayMetrics().density;
        float f16 = f12 * f15;
        b bVar = this.f32247a;
        bVar.f32231h = f16;
        bVar.f32225b.setStrokeWidth(f16);
        bVar.f32239q = f11 * f15;
        bVar.a(0);
        bVar.f32240r = (int) (f13 * f15);
        bVar.f32241s = (int) (f14 * f15);
    }

    public final void c(int i11) {
        if (i11 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f32248b, bounds.exactCenterX(), bounds.exactCenterY());
        b bVar = this.f32247a;
        Paint paint = bVar.f32225b;
        RectF rectF = bVar.f32224a;
        float f11 = bVar.f32239q;
        float fMin = (bVar.f32231h / 2.0f) + f11;
        if (f11 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((bVar.f32240r * bVar.f32238p) / 2.0f, bVar.f32231h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f12 = bVar.f32228e;
        float f13 = bVar.f32230g;
        float f14 = (f12 + f13) * 360.0f;
        float f15 = ((bVar.f32229f + f13) * 360.0f) - f14;
        paint.setColor(bVar.f32243u);
        paint.setAlpha(bVar.f32242t);
        float f16 = bVar.f32231h / 2.0f;
        rectF.inset(f16, f16);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, bVar.f32227d);
        float f17 = -f16;
        rectF.inset(f17, f17);
        canvas.drawArc(rectF, f14, f15, false, paint);
        Paint paint2 = bVar.f32226c;
        if (bVar.f32236n) {
            Path path = bVar.f32237o;
            if (path == null) {
                Path path2 = new Path();
                bVar.f32237o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f18 = (bVar.f32240r * bVar.f32238p) / 2.0f;
            bVar.f32237o.moveTo(0.0f, 0.0f);
            bVar.f32237o.lineTo(bVar.f32240r * bVar.f32238p, 0.0f);
            Path path3 = bVar.f32237o;
            float f19 = bVar.f32240r;
            float f20 = bVar.f32238p;
            path3.lineTo((f19 * f20) / 2.0f, bVar.f32241s * f20);
            bVar.f32237o.offset((rectF.centerX() + fMin2) - f18, (bVar.f32231h / 2.0f) + rectF.centerY());
            bVar.f32237o.close();
            paint2.setColor(bVar.f32243u);
            paint2.setAlpha(bVar.f32242t);
            canvas.save();
            canvas.rotate(f14 + f15, rectF.centerX(), rectF.centerY());
            canvas.drawPath(bVar.f32237o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f32247a.f32242t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f32250d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f32247a.f32242t = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32247a.f32225b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f32250d.cancel();
        b bVar = this.f32247a;
        float f11 = bVar.f32228e;
        bVar.f32234k = f11;
        float f12 = bVar.f32229f;
        bVar.l = f12;
        bVar.f32235m = bVar.f32230g;
        if (f12 != f11) {
            this.f32252f = true;
            this.f32250d.setDuration(666L);
            this.f32250d.start();
            return;
        }
        bVar.a(0);
        bVar.f32234k = 0.0f;
        bVar.l = 0.0f;
        bVar.f32235m = 0.0f;
        bVar.f32228e = 0.0f;
        bVar.f32229f = 0.0f;
        bVar.f32230g = 0.0f;
        this.f32250d.setDuration(1332L);
        this.f32250d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f32250d.cancel();
        this.f32248b = 0.0f;
        b bVar = this.f32247a;
        if (bVar.f32236n) {
            bVar.f32236n = false;
        }
        bVar.a(0);
        bVar.f32234k = 0.0f;
        bVar.l = 0.0f;
        bVar.f32235m = 0.0f;
        bVar.f32228e = 0.0f;
        bVar.f32229f = 0.0f;
        bVar.f32230g = 0.0f;
        invalidateSelf();
    }
}
