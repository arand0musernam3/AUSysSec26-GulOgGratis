package td;

import a3.y;
import android.view.View;
import v80.b2;
import v80.c1;
import v80.f0;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f40053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b2 f40054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f40055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40056d;

    public final synchronized void a() {
        try {
            b2 b2Var = this.f40054b;
            x70.c cVar = null;
            if (b2Var != null) {
                b2Var.a(null);
            }
            c1 c1Var = c1.f42075a;
            c90.f fVar = p0.f42144a;
            this.f40054b = f0.B(c1Var, a90.p.f1044a.f43295e, null, new y(this, cVar, 25), 2);
            this.f40053a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        s sVar = this.f40055c;
        if (sVar == null) {
            return;
        }
        this.f40056d = true;
        sVar.f40048a.a(sVar.f40049b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        s sVar = this.f40055c;
        if (sVar != null) {
            sVar.a();
        }
    }
}
