package qy;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import h4.e;
import i4.w;
import k4.d;
import m2.b2;
import m3.e2;
import m3.i;
import m3.k1;
import n80.p;
import o00.h0;
import u70.l;
import u70.t;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends n4.b implements e2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f37303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f37304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k1 f37305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f37306i;

    public b(Drawable drawable) {
        drawable.getClass();
        this.f37303f = drawable;
        this.f37304g = i.w(0);
        Object obj = c.f37307a;
        this.f37305h = i.w(new e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : h0.i(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f37306i = l.b(new b2(this, 24));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // n4.b
    public final boolean a(float f11) {
        this.f37303f.setAlpha(p.c(j80.c.b(f11 * 255), 0, 255));
        return true;
    }

    @Override // m3.e2
    public final void b() {
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m3.e2
    public final void c() {
        Drawable drawable = this.f37303f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m3.e2
    public final void d() {
        Drawable.Callback callback = (Drawable.Callback) this.f37306i.getValue();
        Drawable drawable = this.f37303f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // n4.b
    public final boolean e(w wVar) {
        this.f37303f.setColorFilter(wVar != null ? wVar.f23318a : null);
        return true;
    }

    @Override // n4.b
    public final void f(m mVar) {
        mVar.getClass();
        int i11 = a.$EnumSwitchMapping$0[mVar.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            e40.a.f();
            return;
        }
        this.f37303f.setLayoutDirection(i12);
    }

    @Override // n4.b
    public final long h() {
        return ((e) this.f37305h.getValue()).f21392a;
    }

    @Override // n4.b
    public final void i(d dVar) {
        dVar.getClass();
        i4.t tVarI = dVar.g0().i();
        ((Number) this.f37304g.getValue()).intValue();
        try {
            tVarI.e();
            int i11 = Build.VERSION.SDK_INT;
            Drawable drawable = this.f37303f;
            if (i11 < 28 || i11 >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, j80.c.b(e.d(dVar.d())), j80.c.b(e.b(dVar.d())));
            } else {
                tVarI.b(e.d(dVar.d()) / e.d(h()), e.b(dVar.d()) / e.b(h()));
            }
            Canvas canvas = i4.d.f23233a;
            drawable.draw(((i4.c) tVarI).f23230a);
            tVarI.o();
        } catch (Throwable th2) {
            tVarI.o();
            throw th2;
        }
    }
}
