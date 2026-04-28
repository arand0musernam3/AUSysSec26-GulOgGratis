package com.google.android.material.timepicker;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import bg.t;
import com.app.tgtg.R;
import e20.i0;
import j10.a;
import java.util.ArrayList;
import ox.h;
import u00.d;
import w20.b;
import w20.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class ClockHandView extends View {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f12708q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeInterpolator f12710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ValueAnimator f12711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f12714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f12716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f12717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f12718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12719k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12720m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f12721n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12723p;

    public ClockHandView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f12711c = valueAnimator;
        this.f12714f = new ArrayList();
        Paint paint = new Paint();
        this.f12717i = paint;
        this.f12718j = new RectF();
        this.f12723p = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f24419m, i11, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f12709a = h.P(context, R.attr.motionDurationLong2, 200);
        this.f12710b = h.Q(context, R.attr.motionEasingEmphasizedInterpolator, k10.a.f25731b);
        this.f12722o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f12715g = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f12719k = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f12716h = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new t(this, 16));
        valueAnimator.addListener(new b());
    }

    public final void a(float f11) {
        float f12 = f11 % 360.0f;
        this.l = f12;
        this.f12721n = Math.toRadians(f12 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i11 = this.f12723p;
        int iRound = this.f12722o;
        if (i11 == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f13 = width;
        float f14 = iRound;
        float fCos = (((float) Math.cos(this.f12721n)) * f14) + f13;
        float fSin = (f14 * ((float) Math.sin(this.f12721n))) + height;
        float f15 = this.f12715g;
        this.f12718j.set(fCos - f15, fSin - f15, fCos + f15, fSin + f15);
        for (ClockFaceView clockFaceView : this.f12714f) {
            if (Math.abs(clockFaceView.f12706q - f12) > 0.001f) {
                clockFaceView.f12706q = f12;
                clockFaceView.k();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i11 = this.f12723p;
        int iRound = this.f12722o;
        if (i11 == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f11 = width;
        float f12 = iRound;
        float fCos = (((float) Math.cos(this.f12721n)) * f12) + f11;
        float f13 = height;
        float fSin = (f12 * ((float) Math.sin(this.f12721n))) + f13;
        Paint paint = this.f12717i;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f12715g, paint);
        double dSin = Math.sin(this.f12721n);
        paint.setStrokeWidth(this.f12719k);
        canvas.drawLine(f11, f13, width + ((int) (Math.cos(this.f12721n) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f11, f13, this.f12716h, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.f12711c.isRunning()) {
            return;
        }
        setHandRotation(this.l);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float y5 = motionEvent.getY();
        boolean z14 = false;
        if (actionMasked == 0) {
            this.f12720m = false;
            z11 = true;
            z12 = false;
            z13 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z13 = this.f12720m;
            z12 = actionMasked == 1;
            if (this.f12713e) {
                this.f12723p = d.r((float) (getWidth() / 2), (float) (getHeight() / 2), x11, y5) <= ((float) Math.round(((float) this.f12722o) * 0.66f)) + i0.g(getContext(), 12) ? 2 : 1;
            }
            z11 = false;
        } else {
            z12 = false;
            z13 = false;
            z11 = false;
        }
        boolean z15 = this.f12720m;
        int degrees = (int) Math.toDegrees(Math.atan2(y5 - (getHeight() / 2), x11 - (getWidth() / 2)));
        int i11 = degrees + 90;
        if (i11 < 0) {
            i11 = degrees + 450;
        }
        float f11 = i11;
        boolean z16 = this.l != f11;
        if (z11 && z16) {
            z14 = true;
        } else if (z16 || z13) {
            if (z12 && this.f12712d) {
                z14 = true;
            }
            setHandRotation(f11, z14);
            z14 = true;
        }
        this.f12720m = z15 | z14;
        return true;
    }

    public void setAnimateOnTouchUp(boolean z11) {
        this.f12712d = z11;
    }

    public void setCircleRadius(int i11) {
        this.f12722o = i11;
        invalidate();
    }

    public void setHandRotation(float f11, boolean z11) {
        ValueAnimator valueAnimator = this.f12711c;
        valueAnimator.cancel();
        if (!z11) {
            a(f11);
            return;
        }
        float f12 = this.l;
        if (Math.abs(f12 - f11) > 180.0f) {
            if (f12 > 180.0f && f11 < 180.0f) {
                f11 += 360.0f;
            }
            if (f12 < 180.0f && f11 > 180.0f) {
                f12 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f12), Float.valueOf(f11));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.f12709a);
        valueAnimator.setInterpolator(this.f12710b);
        valueAnimator.start();
    }

    public void setOnActionUpListener(c cVar) {
    }

    public void setHandRotation(float f11) {
        setHandRotation(f11, false);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }
}
