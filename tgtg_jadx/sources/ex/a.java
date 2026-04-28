package ex;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fx.c f16500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f16501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f16502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnClickListener f16503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16504e;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            view.getClass();
            View.OnClickListener onClickListener = this.f16503d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            View view2 = (View) this.f16502c.get();
            View view3 = (View) this.f16501b.get();
            if (view2 == null || view3 == null) {
                return;
            }
            fx.c cVar = this.f16500a;
            cVar.getClass();
            c.c(cVar, view2, view3);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
