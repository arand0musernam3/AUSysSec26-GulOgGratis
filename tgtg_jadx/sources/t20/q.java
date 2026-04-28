package t20;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f39755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f39756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialAutoCompleteTextView f39757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int i11, String[] strArr) {
        super(context, i11, strArr);
        this.f39757c = materialAutoCompleteTextView;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f39757c;
        ColorStateList colorStateList2 = materialAutoCompleteTextView.l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f39756b = colorStateList;
        if (materialAutoCompleteTextView.f12641k != 0 && materialAutoCompleteTextView.l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{x6.c.c(materialAutoCompleteTextView.l.getColorForState(iArr3, 0), materialAutoCompleteTextView.f12641k), x6.c.c(materialAutoCompleteTextView.l.getColorForState(iArr2, 0), materialAutoCompleteTextView.f12641k), materialAutoCompleteTextView.f12641k});
        }
        this.f39755a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i11, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f39757c;
            Drawable rippleDrawable = null;
            if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.f12641k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.f12641k);
                if (this.f39756b != null) {
                    colorDrawable.setTintList(this.f39755a);
                    rippleDrawable = new RippleDrawable(this.f39756b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
