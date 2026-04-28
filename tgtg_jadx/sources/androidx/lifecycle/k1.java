package androidx.lifecycle;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3479a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3482d;

    public k1(f0 f0Var, w wVar) {
        f0Var.getClass();
        wVar.getClass();
        this.f3481c = f0Var;
        this.f3482d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ky.o oVar;
        switch (this.f3479a) {
            case 0:
                if (!this.f3480b) {
                    ((f0) this.f3481c).g((w) this.f3482d);
                    this.f3480b = true;
                }
                break;
            default:
                View view = (View) this.f3481c;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3482d;
                z7.e eVar = swipeDismissBehavior.f12275a;
                if (eVar != null && eVar.g()) {
                    view.postOnAnimation(this);
                    break;
                } else if (this.f3480b && (oVar = swipeDismissBehavior.f12276b) != null) {
                    oVar.x(view);
                    break;
                }
                break;
        }
    }

    public k1(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z11) {
        this.f3482d = swipeDismissBehavior;
        this.f3481c = view;
        this.f3480b = z11;
    }
}
