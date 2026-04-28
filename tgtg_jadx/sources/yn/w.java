package yn;

import android.widget.PopupWindow;
import pg.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f46321a = p.ReservationsChanged;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46322b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PopupWindow f46323c;

    @Override // yn.o
    public final void a(u1 u1Var) {
        PopupWindow popupWindow;
        u1Var.getClass();
        PopupWindow popupWindow2 = this.f46323c;
        if (popupWindow2 != null) {
            popupWindow2.getClass();
            if (!popupWindow2.isShowing() || (popupWindow = this.f46323c) == null) {
                return;
            }
            popupWindow.dismiss();
        }
    }

    @Override // yn.o
    public final p b() {
        return this.f46321a;
    }

    @Override // yn.o
    public final boolean c() {
        return this.f46322b;
    }
}
