package k;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends u00.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.c f25565d;

    public /* synthetic */ f0(androidx.appcompat.app.c cVar, int i11) {
        this.f25564c = i11;
        this.f25565d = cVar;
    }

    @Override // h7.d1
    public final void c() {
        View view;
        switch (this.f25564c) {
            case 0:
                androidx.appcompat.app.c cVar = this.f25565d;
                if (cVar.f1827o && (view = cVar.f1820g) != null) {
                    view.setTranslationY(0.0f);
                    cVar.f1817d.setTranslationY(0.0f);
                }
                cVar.f1817d.setVisibility(8);
                cVar.f1817d.setTransitioning(false);
                cVar.f1832t = null;
                p pVar = cVar.f1824k;
                if (pVar != null) {
                    pVar.a(cVar.f1823j);
                    cVar.f1823j = null;
                    cVar.f1824k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = cVar.f1816c;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.Z(actionBarOverlayLayout);
                }
                break;
            default:
                androidx.appcompat.app.c cVar2 = this.f25565d;
                cVar2.f1832t = null;
                cVar2.f1817d.requestLayout();
                break;
        }
    }
}
