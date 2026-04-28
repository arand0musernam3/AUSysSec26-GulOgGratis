package d2;

import android.os.Build;
import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends WindowInsetsAnimationCompat$Callback implements Runnable, h7.w, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z2 f13731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WindowInsetsCompat f13734f;

    public a1(z2 z2Var) {
        super(!z2Var.f14002t ? 1 : 0);
        this.f13731c = z2Var;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void b(h7.o1 o1Var) {
        this.f13732d = false;
        this.f13733e = false;
        WindowInsetsCompat windowInsetsCompat = this.f13734f;
        if (o1Var.f21602a.b() > 0 && windowInsetsCompat != null) {
            z2 z2Var = this.f13731c;
            z2Var.f14001s.f(c.H(windowInsetsCompat.e(h7.h2.c())));
            z2Var.f14000r.f(c.H(windowInsetsCompat.e(h7.h2.c())));
            z2.b(z2Var, windowInsetsCompat);
        }
        this.f13734f = null;
        super.b(o1Var);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void c(h7.o1 o1Var) {
        this.f13732d = true;
        this.f13733e = true;
        super.c(o1Var);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List list) {
        z2 z2Var = this.f13731c;
        z2.b(z2Var, windowInsetsCompat);
        return z2Var.f14002t ? WindowInsetsCompat.f2740b : windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final h7.f1 e(h7.o1 o1Var, h7.f1 f1Var) {
        this.f13732d = false;
        return super.e(o1Var, f1Var);
    }

    @Override // h7.w
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.f13734f = windowInsetsCompat;
        z2 z2Var = this.f13731c;
        z2Var.f14000r.f(c.H(windowInsetsCompat.e(h7.h2.c())));
        if (this.f13732d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f13733e) {
            z2Var.f14001s.f(c.H(windowInsetsCompat.e(h7.h2.c())));
            z2.b(z2Var, windowInsetsCompat);
        }
        return z2Var.f14002t ? WindowInsetsCompat.f2740b : windowInsetsCompat;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13732d) {
            this.f13732d = false;
            this.f13733e = false;
            WindowInsetsCompat windowInsetsCompat = this.f13734f;
            if (windowInsetsCompat != null) {
                z2 z2Var = this.f13731c;
                z2Var.f14001s.f(c.H(windowInsetsCompat.e(h7.h2.c())));
                z2.b(z2Var, windowInsetsCompat);
                this.f13734f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
