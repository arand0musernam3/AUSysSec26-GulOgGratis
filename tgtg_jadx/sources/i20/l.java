package i20;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends n {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final com.google.android.material.button.a f23010y = new com.google.android.material.button.a(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f23011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k8.j f23012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k8.i f23013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f23014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f23015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f23016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ValueAnimator f23017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ValueAnimator f23018u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TimeInterpolator f23019v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TimeInterpolator f23020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TimeInterpolator f23021x;

    public l(Context context, e eVar, q qVar) {
        super(context, eVar);
        this.f23016s = false;
        this.f23011n = qVar;
        o oVar = new o();
        this.f23014q = oVar;
        oVar.f23043h = true;
        k8.j jVar = new k8.j();
        this.f23012o = jVar;
        jVar.a(1.0f);
        jVar.b(50.0f);
        k8.i iVar = new k8.i(this, f23010y);
        this.f23013p = iVar;
        iVar.f26164m = jVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f23017t = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new com.braze.ui.inappmessage.listeners.b(1, this, eVar));
        if (eVar.b(true) && eVar.f22964m != 0) {
            valueAnimator.start();
        }
        if (this.f23033i != 1.0f) {
            this.f23033i = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.l)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f23028d;
            boolean z11 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f23029e;
            boolean z12 = objectAnimator2 != null && objectAnimator2.isRunning();
            q qVar = this.f23011n;
            qVar.f23047a.d();
            qVar.a(canvas, bounds, fB, z11, z12);
            float fC = c();
            o oVar = this.f23014q;
            oVar.f23041f = fC;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f23034j;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            e eVar = this.f23026b;
            oVar.f23038c = eVar.f22957e[0];
            int iN = eVar.f22961i;
            q qVar2 = this.f23011n;
            if (iN > 0) {
                if (!(qVar2 instanceof s)) {
                    iN = (int) ((xz.b.n(oVar.f23037b, 0.0f, 0.01f) * iN) / 0.01f);
                }
                this.f23011n.d(canvas, paint, oVar.f23037b, 1.0f, eVar.f22958f, this.f23035k, iN);
            } else {
                qVar2.d(canvas, paint, 0.0f, 1.0f, eVar.f22958f, this.f23035k, 0);
            }
            this.f23011n.c(canvas, paint, oVar, this.f23035k);
            this.f23011n.b(eVar.f22957e[0], this.f23035k, canvas, paint);
            canvas.restore();
        }
    }

    @Override // i20.n
    public final boolean e(boolean z11, boolean z12, boolean z13) {
        boolean zE = super.e(z11, z12, z13);
        a aVar = this.f23027c;
        ContentResolver contentResolver = this.f23025a.getContentResolver();
        aVar.getClass();
        float f11 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f11 == 0.0f) {
            this.f23016s = true;
            return zE;
        }
        this.f23016s = false;
        this.f23012o.b(50.0f / f11);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f23011n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f23011n.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f23013p.d();
        this.f23014q.f23037b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i11) {
        float f11 = i11;
        float f12 = (f11 < 1000.0f || f11 > 9000.0f) ? 0.0f : 1.0f;
        boolean z11 = this.f23016s;
        o oVar = this.f23014q;
        k8.i iVar = this.f23013p;
        if (z11) {
            iVar.d();
            oVar.f23037b = f11 / 10000.0f;
            invalidateSelf();
            oVar.f23040e = f12;
            invalidateSelf();
        } else {
            iVar.f26154b = oVar.f23037b * 10000.0f;
            iVar.f26155c = true;
            iVar.a(f11);
        }
        return true;
    }
}
