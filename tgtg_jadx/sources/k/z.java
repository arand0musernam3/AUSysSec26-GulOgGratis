package k;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class z extends androidx.fragment.app.y {
    @Override // androidx.fragment.app.y
    public Dialog onCreateDialog(Bundle bundle) {
        return new y(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.y
    public void setupDialog(@NonNull Dialog dialog, int i11) {
        if (!(dialog instanceof y)) {
            super.setupDialog(dialog, i11);
            return;
        }
        y yVar = (y) dialog;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        yVar.supportRequestWindowFeature(1);
    }
}
