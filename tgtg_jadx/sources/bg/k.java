package bg;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PopupWindow f6168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f6169c;

    public /* synthetic */ k(PopupWindow popupWindow, View view, int i11) {
        this.f6167a = i11;
        this.f6168b = popupWindow;
        this.f6169c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6167a) {
            case 0:
                PopupWindow popupWindow = this.f6168b;
                popupWindow.showAtLocation(this.f6169c, 17, 0, 0);
                na0.a.l0(popupWindow);
                break;
            default:
                PopupWindow popupWindow2 = this.f6168b;
                popupWindow2.showAtLocation(this.f6169c, 17, 0, 0);
                na0.a.l0(popupWindow2);
                break;
        }
    }
}
