package c6;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends b4.s implements g4.u {
    @Override // g4.u
    public final void x(g4.r rVar) {
        View viewC = l.c(this);
        rVar.e(getNode().isAttached() && l.c(this).hasFocusable());
        View viewFindFocus = viewC.findFocus();
        if (viewFindFocus != null) {
            rVar.b(g4.h.a(viewFindFocus, viewC));
        }
    }
}
