package yn;

import android.widget.PopupWindow;
import com.app.tgtg.model.remote.brief.BriefOrder;
import pg.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BriefOrder f46284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hm.g f46285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f46286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PopupWindow f46288e;

    public h(BriefOrder briefOrder, hm.g gVar) {
        briefOrder.getClass();
        this.f46284a = briefOrder;
        this.f46285b = gVar;
        this.f46286c = p.CollectionSentBack;
        this.f46287d = true;
    }

    @Override // yn.o
    public final void a(u1 u1Var) {
        PopupWindow popupWindow;
        u1Var.getClass();
        PopupWindow popupWindow2 = this.f46288e;
        if (popupWindow2 != null) {
            popupWindow2.getClass();
            if (!popupWindow2.isShowing() || (popupWindow = this.f46288e) == null) {
                return;
            }
            popupWindow.dismiss();
        }
    }

    @Override // yn.o
    public final p b() {
        return this.f46286c;
    }

    @Override // yn.o
    public final boolean c() {
        return this.f46287d;
    }
}
