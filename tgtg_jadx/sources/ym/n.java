package ym;

import android.view.View;
import com.app.tgtg.model.remote.item.response.SeparatorItem;
import pg.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f46200a;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(c0 c0Var) {
        c0Var.getClass();
        View view = c0Var.f986f;
        view.getClass();
        super(view);
        this.f46200a = c0Var;
    }

    public final void a(p pVar) {
        if ((pVar != null ? pVar.f46226a : null) instanceof SeparatorItem) {
            a50.c.o(new a50.c(this.f46200a), pVar.f46226a, false, null, null, 0, null, null, null, 254);
        }
    }
}
