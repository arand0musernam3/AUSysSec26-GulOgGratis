package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.app.tgtg.R;
import com.app.tgtg.customview.MessageBarView;
import com.app.tgtg.feature.main.ui.BottomNavigation;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends u1 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.timedTooltip, 2);
        sparseIntArray.put(R.id.coordinator_layout, 3);
        sparseIntArray.put(R.id.content_frame, 4);
        sparseIntArray.put(R.id.topView, 5);
        sparseIntArray.put(R.id.backgroundView, 6);
        sparseIntArray.put(R.id.tooltipContainer, 7);
        sparseIntArray.put(R.id.view3, 8);
        sparseIntArray.put(R.id.bottomNavigationBar, 9);
        sparseIntArray.put(R.id.blobComposeView, 10);
        sparseIntArray.put(R.id.messageBar, 11);
        sparseIntArray.put(R.id.loaderContainer, 12);
        sparseIntArray.put(R.id.loaderAnimation, 13);
        sparseIntArray.put(R.id.guideline2, 14);
        sparseIntArray.put(R.id.navigationDrawer, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v1(View view) {
        k kVar;
        Object[] objArrB0 = a8.k.b0(view, 16, null, D);
        ComposeView composeView = (ComposeView) objArrB0[10];
        BottomNavigation bottomNavigation = (BottomNavigation) objArrB0[9];
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArrB0[3];
        DrawerLayout drawerLayout = (DrawerLayout) objArrB0[0];
        MessageBarView messageBarView = (MessageBarView) objArrB0[11];
        Object obj = objArrB0[2];
        if (obj != null) {
            View view2 = (View) obj;
            int i11 = R.id.dialogPointerView;
            View viewT = pd.g.t(R.id.dialogPointerView, view2);
            if (viewT != null) {
                i11 = R.id.mainBackground;
                ConstraintLayout constraintLayout = (ConstraintLayout) pd.g.t(R.id.mainBackground, view2);
                if (constraintLayout != null) {
                    i11 = R.id.timedTooltipTV;
                    TextView textView = (TextView) pd.g.t(R.id.timedTooltipTV, view2);
                    if (textView != null) {
                        i11 = R.id.tooltip;
                        if (((ConstraintLayout) pd.g.t(R.id.tooltip, view2)) != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view2;
                            i11 = R.id.tooltipGuideline;
                            Guideline guideline = (Guideline) pd.g.t(R.id.tooltipGuideline, view2);
                            kVar = guideline != null ? new k(constraintLayout2, viewT, constraintLayout, textView, guideline, 3) : kVar;
                        }
                    }
                }
            }
            c50.w.l("Missing required view with ID: ".concat(view2.getResources().getResourceName(i11)));
            throw null;
        }
        kVar = null;
        super(null, view, composeView, bottomNavigation, coordinatorLayout, drawerLayout, messageBarView, kVar, (FrameLayout) objArrB0[7], (View) objArrB0[5], (View) objArrB0[8]);
        this.C = -1L;
        this.f35187v.setTag(null);
        ((ConstraintLayout) objArrB0[1]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.C = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.C = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        return false;
    }
}
