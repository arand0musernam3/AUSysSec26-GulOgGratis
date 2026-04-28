package k;

import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends u00.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25576d;

    public /* synthetic */ m(Object obj, int i11) {
        this.f25575c = i11;
        this.f25576d = obj;
    }

    @Override // u00.d, h7.d1
    public void b() {
        switch (this.f25575c) {
            case 0:
                ((n) this.f25576d).f25577a.f1800v.setVisibility(0);
                break;
        }
    }

    @Override // h7.d1
    public final void c() {
        switch (this.f25575c) {
            case 0:
                androidx.appcompat.app.a aVar = ((n) this.f25576d).f25577a;
                aVar.f1800v.setAlpha(1.0f);
                aVar.f1803y.f(null);
                aVar.f1803y = null;
                break;
            default:
                androidx.appcompat.app.a aVar2 = ((p) this.f25576d).f25580b;
                aVar2.f1800v.setVisibility(8);
                PopupWindow popupWindow = aVar2.f1801w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (aVar2.f1800v.getParent() instanceof View) {
                    ViewCompat.Z((View) aVar2.f1800v.getParent());
                }
                aVar2.f1800v.e();
                aVar2.f1803y.f(null);
                aVar2.f1803y = null;
                ViewCompat.Z(aVar2.A);
                break;
        }
    }
}
