package pz;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class g extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dialog f35663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f35664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AlertDialog f35665c;

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f35664b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.y
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f35663a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f35665c == null) {
            Context context = getContext();
            i0.h(context);
            this.f35665c = new AlertDialog.Builder(context).create();
        }
        return this.f35665c;
    }
}
