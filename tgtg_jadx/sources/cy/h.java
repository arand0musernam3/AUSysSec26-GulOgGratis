package cy;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13510b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f13509a = i11;
        this.f13510b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        switch (this.f13509a) {
            case 0:
                k kVar = (k) this.f13510b;
                View viewQ = kVar.q(false);
                Dialog dialog = kVar.getDialog();
                if (dialog != null) {
                    dialog.setContentView(viewQ);
                }
                r rVar = kVar.f13527k;
                if (rVar != null) {
                    kVar.x(rVar);
                }
                break;
            case 1:
                b0 b0Var = (b0) this.f13510b;
                if (!yx.a.f46339a.contains(dy.b.class)) {
                    try {
                        b0Var.getClass();
                        b0Var.d();
                    } catch (Throwable th2) {
                        yx.a.a(dy.b.class, th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                ir.h hVar = (ir.h) this.f13510b;
                if (i11 == -3) {
                    v80.f0.B(m1.d(hVar), null, null, new al.n(hVar, "", Boolean.TRUE, (x70.c) null), 3);
                }
                break;
        }
    }
}
