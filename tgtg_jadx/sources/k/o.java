package k;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends u00.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f25578c;

    public o(androidx.appcompat.app.a aVar) {
        this.f25578c = aVar;
    }

    @Override // u00.d, h7.d1
    public final void b() {
        androidx.appcompat.app.a aVar = this.f25578c;
        aVar.f1800v.setVisibility(0);
        if (aVar.f1800v.getParent() instanceof View) {
            ViewCompat.Z((View) aVar.f1800v.getParent());
        }
    }

    @Override // h7.d1
    public final void c() {
        androidx.appcompat.app.a aVar = this.f25578c;
        aVar.f1800v.setAlpha(1.0f);
        aVar.f1803y.f(null);
        aVar.f1803y = null;
    }
}
