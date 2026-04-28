package f3;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import b2.n;
import i4.g0;
import i4.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f17257f = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f17258g = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f17259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f17260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f17261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d1.e f17262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public cw.b f17263e;

    public e(@NotNull Context context) {
        super(context);
    }

    private final void setRippleState(boolean z11) throws Throwable {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f17262d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f17261c;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z11 || jLongValue >= 5) {
            int[] iArr = z11 ? f17257f : f17258g;
            h hVar = this.f17259a;
            if (hVar != null) {
                hVar.setState(iArr);
            }
        } else {
            d1.e eVar = new d1.e(this, 12);
            this.f17262d = eVar;
            postDelayed(eVar, 50L);
        }
        this.f17261c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(e eVar) {
        h hVar = eVar.f17259a;
        if (hVar != null) {
            hVar.setState(f17258g);
        }
        eVar.f17262d = null;
    }

    public final void b(n nVar, boolean z11, long j9, int i11, long j11, float f11, cw.b bVar) throws Throwable {
        if (this.f17259a == null || !Intrinsics.areEqual(Boolean.valueOf(z11), this.f17260b)) {
            h hVar = new h(z11);
            setBackground(hVar);
            this.f17259a = hVar;
            this.f17260b = Boolean.valueOf(z11);
        }
        h hVar2 = this.f17259a;
        hVar2.getClass();
        this.f17263e = bVar;
        m963setRipplePropertiesbiQXAtU(j9, i11, j11, f11);
        if (z11) {
            hVar2.setHotspot(Float.intBitsToFloat((int) (nVar.f5565a >> 32)), Float.intBitsToFloat((int) (nVar.f5565a & 4294967295L)));
        } else {
            hVar2.setHotspot(hVar2.getBounds().centerX(), hVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() throws Throwable {
        this.f17263e = null;
        d1.e eVar = this.f17262d;
        if (eVar != null) {
            removeCallbacks(eVar);
            d1.e eVar2 = this.f17262d;
            eVar2.getClass();
            eVar2.run();
        } else {
            h hVar = this.f17259a;
            if (hVar != null) {
                hVar.setState(f17258g);
            }
        }
        h hVar2 = this.f17259a;
        if (hVar2 == null) {
            return;
        }
        hVar2.setVisible(false, false);
        unscheduleDrawable(hVar2);
    }

    public final void d() throws Throwable {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) throws Throwable {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        cw.b bVar = this.f17263e;
        if (bVar != null) {
            bVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m963setRipplePropertiesbiQXAtU(long j9, int i11, long j11, float f11) {
        h hVar = this.f17259a;
        if (hVar == null) {
            return;
        }
        Integer num = hVar.f17271c;
        if (num == null || num.intValue() != i11) {
            hVar.f17271c = Integer.valueOf(i11);
            hVar.setRadius(i11);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f11 *= 2;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        long jB = v.b(f11, j11);
        v vVar = hVar.f17270b;
        if (!(vVar == null ? false : v.c(vVar.f23317a, jB))) {
            hVar.f17270b = new v(jB);
            hVar.setColor(ColorStateList.valueOf(g0.C(jB)));
        }
        Rect rect = new Rect(0, 0, j80.c.b(h4.e.d(j9)), j80.c.b(h4.e.b(j9)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        hVar.setBounds(rect);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
