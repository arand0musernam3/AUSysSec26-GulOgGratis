package zc;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import h7.e0;
import kotlin.jvm.internal.Intrinsics;
import v80.b2;
import v80.c1;
import v80.f0;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f47522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0 f47523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b2 f47524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f47525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47526e;

    public u(View view) {
        this.f47522a = view;
    }

    public final synchronized void a() {
        try {
            b2 b2Var = this.f47524c;
            x70.c cVar = null;
            if (b2Var != null) {
                b2Var.a(null);
            }
            c1 c1Var = c1.f42075a;
            c90.f fVar = p0.f42144a;
            this.f47524c = f0.B(c1Var, a90.p.f1044a.f43295e, null, new wi.s(this, cVar, 2), 2);
            this.f47523b = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized e0 b() {
        e0 e0Var = this.f47523b;
        if (e0Var != null && Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) && this.f47526e) {
            this.f47526e = false;
            return e0Var;
        }
        b2 b2Var = this.f47524c;
        if (b2Var != null) {
            b2Var.a(null);
        }
        this.f47524c = null;
        e0 e0Var2 = new e0(this.f47522a);
        this.f47523b = e0Var2;
        return e0Var2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        t tVar = this.f47525d;
        if (tVar == null) {
            return;
        }
        this.f47526e = true;
        tVar.f47517a.b(tVar.f47518b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        t tVar = this.f47525d;
        if (tVar != null) {
            Lifecycle lifecycle = tVar.f47520d;
            tVar.f47521e.a(null);
            bd.a aVar = tVar.f47519c;
            if (aVar != null) {
                lifecycle.d(aVar);
            }
            lifecycle.d(tVar);
        }
    }
}
