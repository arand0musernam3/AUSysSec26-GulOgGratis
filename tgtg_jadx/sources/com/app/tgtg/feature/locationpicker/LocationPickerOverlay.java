package com.app.tgtg.feature.locationpicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.location.Location;
import android.util.AttributeSet;
import android.view.View;
import com.app.tgtg.R;
import d70.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rt.d;
import st.a;
import uk.e;
import uk.f;
import xk.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class LocationPickerOverlay extends View {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f9016n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f9017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Canvas f9018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f9019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f9023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f9024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9027k;
    public final Paint l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f9028m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPickerOverlay(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f9019c = new Paint();
        this.f9023g = c.DEFAULT.a() * ((double) 1000);
        this.f9026j = b.a(36);
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.opacity_black_50));
        this.l = paint;
        Paint paint2 = new Paint();
        context.getColor(android.R.color.transparent);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f9028m = paint2;
    }

    private final double getNewRadius() {
        a aVar = this.f9024h;
        st.b bVarF = aVar != null ? ((d) aVar).f(new Point(getWidth() / 2, getHeight() / 2)) : null;
        a aVar2 = this.f9024h;
        st.b bVarF2 = aVar2 != null ? ((d) aVar2).f(new Point(getWidth() / 2, (getHeight() / 2) + 10)) : null;
        Location location = new Location("Middle point");
        Double dValueOf = bVarF != null ? Double.valueOf(bVarF.f39278a) : null;
        dValueOf.getClass();
        location.setLatitude(dValueOf.doubleValue());
        location.setLongitude(bVarF.f39279b);
        Location location2 = new Location("Offset point");
        Double dValueOf2 = bVarF2 != null ? Double.valueOf(bVarF2.f39278a) : null;
        dValueOf2.getClass();
        location2.setLatitude(dValueOf2.doubleValue());
        location2.setLongitude(bVarF2.f39279b);
        return this.f9023g / ((double) (location.distanceTo(location2) / 10));
    }

    public final void a(int i11) {
        if (this.f9025i) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getHeight() + 500.0f, i11);
        valueAnimatorOfFloat.addUpdateListener(new e(this, valueAnimatorOfFloat, 1));
        valueAnimatorOfFloat.addListener(new f(this, 0));
        valueAnimatorOfFloat.setDuration(450L);
        valueAnimatorOfFloat.start();
    }

    public final void b() {
        a aVar = this.f9024h;
        if (aVar == null || this.f9027k || Intrinsics.areEqual(this.f9021e, Float.valueOf(((d) aVar).j()))) {
            return;
        }
        a aVar2 = this.f9024h;
        if (aVar2 != null) {
            this.f9021e = ((d) aVar2).j();
        }
        double newRadius = getNewRadius();
        double d3 = this.f9026j;
        if (newRadius <= d3) {
            d();
            return;
        }
        if (newRadius >= d3 && !this.f9025i) {
            a((int) newRadius);
            return;
        }
        this.f9020d = (float) newRadius;
        this.f9025i = true;
        invalidate();
    }

    public final void c(double d3) {
        if (this.f9024h != null) {
            this.f9023g = d3;
            float newRadius = (float) getNewRadius();
            this.f9021e = 0.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f9020d, newRadius);
            valueAnimatorOfFloat.addUpdateListener(new e(this, valueAnimatorOfFloat, 2));
            valueAnimatorOfFloat.addListener(new f(this, 1));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.start();
        }
    }

    public final void d() {
        if (this.f9025i) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f9020d, getHeight() + 500.0f);
            valueAnimatorOfFloat.addUpdateListener(new e(this, valueAnimatorOfFloat, 0));
            valueAnimatorOfFloat.addListener(new f(this, 2));
            valueAnimatorOfFloat.setDuration(450L);
            valueAnimatorOfFloat.start();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f9017a == null) {
            this.f9017a = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.f9017a;
            bitmap.getClass();
            this.f9018b = new Canvas(bitmap);
        }
        Canvas canvas2 = this.f9018b;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        Canvas canvas3 = this.f9018b;
        if (canvas3 != null) {
            canvas3.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.l);
        }
        Canvas canvas4 = this.f9018b;
        if (canvas4 != null) {
            float f11 = 2;
            canvas4.drawCircle(getWidth() / f11, (getHeight() - this.f9022f) / f11, this.f9020d, this.f9028m);
        }
        Bitmap bitmap2 = this.f9017a;
        bitmap2.getClass();
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.f9019c);
    }

    public final void e() {
        a aVar = this.f9024h;
        if (aVar == null || Intrinsics.areEqual(this.f9021e, Float.valueOf(((d) aVar).j()))) {
            return;
        }
        a aVar2 = this.f9024h;
        if (aVar2 != null) {
            this.f9021e = ((d) aVar2).j();
        }
        double newRadius = getNewRadius();
        double d3 = this.f9026j;
        if (newRadius <= d3) {
            d();
            return;
        }
        if (newRadius >= d3 && !this.f9025i) {
            a((int) newRadius);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f9020d, (float) newRadius);
        valueAnimatorOfFloat.addUpdateListener(new e(this, valueAnimatorOfFloat, 3));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.start();
    }

    public final boolean getChangingDistance() {
        return this.f9027k;
    }

    public final void setChangingDistance(boolean z11) {
        this.f9027k = z11;
    }

    public final void setMap(@NotNull a aVar) {
        aVar.getClass();
        this.f9024h = aVar;
        b();
    }

    public final void setOffset(int i11) {
        this.f9022f = i11;
    }

    public final void setRadius(double d3) {
        if (mv.d.A()) {
            d3 *= 0.621371d;
        }
        this.f9023g = d3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPickerOverlay(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationPickerOverlay(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ LocationPickerOverlay(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
