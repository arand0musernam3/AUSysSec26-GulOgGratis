package dy;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15226b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f15225a = i11;
        this.f15226b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        PopupWindow popupWindow;
        switch (this.f15225a) {
            case 0:
                j jVar = (j) this.f15226b;
                if (!yx.a.f46339a.contains(j.class)) {
                    try {
                        if (((WeakReference) jVar.f15233c).get() != null && (popupWindow = (PopupWindow) jVar.f15236f) != null && popupWindow.isShowing()) {
                            boolean zIsAboveAnchor = popupWindow.isAboveAnchor();
                            h hVar = (h) jVar.f15235e;
                            if (zIsAboveAnchor) {
                                if (hVar != null) {
                                    hVar.f15227a.setVisibility(4);
                                    hVar.f15228b.setVisibility(0);
                                }
                            } else if (hVar != null) {
                                hVar.f15227a.setVisibility(0);
                                hVar.f15228b.setVisibility(4);
                            }
                        }
                    } catch (Throwable th2) {
                        yx.a.a(j.class, th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                ((p20.e) this.f15226b).D();
                break;
        }
    }
}
