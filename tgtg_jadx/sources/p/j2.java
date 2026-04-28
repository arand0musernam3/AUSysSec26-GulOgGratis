package p;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33916b;

    public /* synthetic */ j2(Object obj, int i11) {
        this.f33915a = i11;
        this.f33916b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = this.f33915a;
        Object obj = this.f33916b;
        switch (i19) {
            case 0:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f2058p;
                View view2 = searchView.f2066x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f2060r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z11 = g3.f33904a;
                    boolean z12 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.M ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i21 = rect.left;
                    searchAutoComplete.setDropDownHorizontalOffset(z12 ? -i21 : paddingLeft - (i21 + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                }
                break;
            default:
                x20.a aVar = (x20.a) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                aVar.W = iArr[0];
                view.getWindowVisibleDisplayFrame(aVar.M);
                break;
        }
    }
}
