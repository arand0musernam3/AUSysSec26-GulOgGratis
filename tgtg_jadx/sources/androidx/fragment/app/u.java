package androidx.fragment.app;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f3355a;

    public u(y yVar) {
        this.f3355a = yVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        y yVar = this.f3355a;
        if (yVar.mDialog != null) {
            yVar.onCancel(yVar.mDialog);
        }
    }
}
