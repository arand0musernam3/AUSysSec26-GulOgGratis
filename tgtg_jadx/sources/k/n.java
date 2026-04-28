package k;

import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f25577a;

    public n(androidx.appcompat.app.a aVar) {
        this.f25577a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        androidx.appcompat.app.a aVar = this.f25577a;
        aVar.f1801w.showAtLocation(aVar.f1800v, 55, 0, 0);
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = aVar.f1803y;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.b();
        }
        if (!aVar.f1804z || (viewGroup = aVar.A) == null || !viewGroup.isLaidOut()) {
            aVar.f1800v.setAlpha(1.0f);
            aVar.f1800v.setVisibility(0);
        } else {
            aVar.f1800v.setAlpha(0.0f);
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA = ViewCompat.c(aVar.f1800v).a(1.0f);
            aVar.f1803y = viewPropertyAnimatorCompatA;
            viewPropertyAnimatorCompatA.f(new m(this, 0));
        }
    }
}
