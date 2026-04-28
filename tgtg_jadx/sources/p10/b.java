package p10;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import h20.l;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class b extends l {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final int f34121h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final int f34122i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final int f34123j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final int f34124k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f34125l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final ArrayList f34126m1;

    public b(@NonNull Context context) {
        super(context);
        this.f34126m1 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f34121h1 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f34122i1 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f34123j1 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f34124k1 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int measuredWidth = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i18 = i15 - measuredWidth;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i16);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i16);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p10.b.onMeasure(int, int):void");
    }

    public void setItemHorizontalTranslationEnabled(boolean z11) {
        this.f34125l1 = z11;
    }
}
