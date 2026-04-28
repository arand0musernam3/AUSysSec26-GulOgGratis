package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import k.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class m extends z {
    private boolean waitingForDismissAllowingStateLoss;

    public static void access$100(m mVar) {
        if (mVar.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.y
    public void dismiss() {
        if (p(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.y
    public void dismissAllowingStateLoss() {
        if (p(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // k.z, androidx.fragment.app.y
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return new l(getContext(), getTheme());
    }

    public final boolean p(boolean z11) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof l)) {
            return false;
        }
        l lVar = (l) dialog;
        BottomSheetBehavior<FrameLayout> behavior = lVar.getBehavior();
        if (!behavior.I || !lVar.getDismissWithAnimation()) {
            return false;
        }
        this.waitingForDismissAllowingStateLoss = z11;
        if (behavior.N == 5) {
            if (z11) {
                super.dismissAllowingStateLoss();
                return true;
            }
            super.dismiss();
            return true;
        }
        if (getDialog() instanceof l) {
            ((l) getDialog()).removeDefaultCallback();
        }
        j jVar = new j(this, 1);
        ArrayList arrayList = behavior.t0;
        if (!arrayList.contains(jVar)) {
            arrayList.add(jVar);
        }
        behavior.J(5);
        return true;
    }
}
