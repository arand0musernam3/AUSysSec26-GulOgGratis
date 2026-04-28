package yn;

import android.widget.PopupWindow;
import pg.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f46299b = p.ConfirmEmail;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46300c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PopupWindow f46301d;

    public l(boolean z11) {
        this.f46298a = z11;
    }

    @Override // yn.o
    public final void a(u1 u1Var) {
        PopupWindow popupWindow;
        u1Var.getClass();
        PopupWindow popupWindow2 = this.f46301d;
        if (popupWindow2 != null) {
            popupWindow2.getClass();
            if (!popupWindow2.isShowing() || (popupWindow = this.f46301d) == null) {
                return;
            }
            popupWindow.dismiss();
        }
    }

    @Override // yn.o
    public final p b() {
        return this.f46299b;
    }

    @Override // yn.o
    public final boolean c() {
        return this.f46300c;
    }
}
