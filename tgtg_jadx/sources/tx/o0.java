package tx;

import android.app.Dialog;
import android.content.DialogInterface;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dialog f40546b;

    public /* synthetic */ o0(Dialog dialog, int i11) {
        this.f40545a = i11;
        this.f40546b = dialog;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40545a) {
            case 0:
                ((u0) this.f40546b).cancel();
                break;
            default:
                BottomSheetView.render$lambda$3$lambda$2((BottomSheetView) this.f40546b, dialogInterface);
                break;
        }
    }
}
