package zj;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.app.tgtg.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        View viewFindViewById = ((l) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(viewFindViewById);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = -1;
            viewFindViewById.setLayoutParams(layoutParams);
            bottomSheetBehaviorB.J(3);
            bottomSheetBehaviorB.K = false;
        }
    }
}
