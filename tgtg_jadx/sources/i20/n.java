package i20;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends Drawable implements Animatable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c20.d f23024m = new c20.d(8, "growFraction", Float.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f23026b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f23028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObjectAnimator f23029e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f23031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f23033i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23035k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23030f = -1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f23034j = new Paint();
    public final Rect l = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f23027c = new a();

    public n(Context context, e eVar) {
        this.f23025a = context;
        this.f23026b = eVar;
        setAlpha(255);
    }

    public final float b() {
        e eVar = this.f23026b;
        if (eVar.f22959g == 0 && eVar.f22960h == 0) {
            return 1.0f;
        }
        return this.f23033i;
    }

    public final float c() {
        float f11 = this.f23030f;
        if (f11 > 0.0f) {
            return f11;
        }
        boolean z11 = this instanceof l;
        e eVar = this.f23026b;
        if (eVar.b(z11) && eVar.f22964m != 0) {
            a aVar = this.f23027c;
            ContentResolver contentResolver = this.f23025a.getContentResolver();
            aVar.getClass();
            float f12 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f12 > 0.0f) {
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) r0)) / ((int) ((((z11 ? eVar.f22962j : eVar.f22963k) * 1000.0f) / eVar.f22964m) * f12));
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean d(boolean z11, boolean z12, boolean z13) {
        a aVar = this.f23027c;
        ContentResolver contentResolver = this.f23025a.getContentResolver();
        aVar.getClass();
        return e(z11, z12, z13 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean e(boolean z11, boolean z12, boolean z13) {
        ObjectAnimator objectAnimator = this.f23028d;
        int i11 = 0;
        c20.d dVar = f23024m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, dVar, 0.0f, 1.0f);
            this.f23028d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f23028d.setInterpolator(k10.a.f25731b);
            ObjectAnimator objectAnimator2 = this.f23028d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                i4.a.f("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.f23028d = objectAnimator2;
            objectAnimator2.addListener(new m(this, i11));
        }
        int i12 = 1;
        if (this.f23029e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, dVar, 1.0f, 0.0f);
            this.f23029e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f23029e.setInterpolator(k10.a.f25731b);
            ObjectAnimator objectAnimator3 = this.f23029e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                i4.a.f("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.f23029e = objectAnimator3;
            objectAnimator3.addListener(new m(this, i12));
        }
        if (isVisible() || z11) {
            ObjectAnimator objectAnimator4 = z11 ? this.f23028d : this.f23029e;
            ObjectAnimator objectAnimator5 = z11 ? this.f23029e : this.f23028d;
            if (!z13) {
                if (objectAnimator5.isRunning()) {
                    boolean z14 = this.f23032h;
                    this.f23032h = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.f23032h = z14;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z15 = this.f23032h;
                    this.f23032h = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f23032h = z15;
                }
                return super.setVisible(z11, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z16 = !z11 || super.setVisible(z11, false);
                e eVar = this.f23026b;
                if (!z11 ? eVar.f22960h != 0 : eVar.f22959g != 0) {
                    boolean z17 = this.f23032h;
                    this.f23032h = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f23032h = z17;
                    return z16;
                }
                if (z12 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z16;
                }
                objectAnimator4.resume();
                return z16;
            }
        }
        return false;
    }

    public final void f(c cVar) {
        ArrayList arrayList = this.f23031g;
        if (arrayList == null || !arrayList.contains(cVar)) {
            return;
        }
        this.f23031g.remove(cVar);
        if (this.f23031g.isEmpty()) {
            this.f23031g = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f23035k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f23028d;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.f23029e;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f23035k = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23034j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        return d(z11, z12, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
