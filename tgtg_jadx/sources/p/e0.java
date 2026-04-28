package p;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33880b;

    public /* synthetic */ e0(Object obj, int i11) {
        this.f33879a = i11;
        this.f33880b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j9) {
        switch (this.f33879a) {
            case 0:
                g0 g0Var = (g0) this.f33880b;
                AppCompatSpinner appCompatSpinner = g0Var.G;
                appCompatSpinner.setSelection(i11);
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i11, g0Var.D.getItemId(i11));
                }
                g0Var.dismiss();
                break;
            case 1:
                ((SearchView) this.f33880b).n(i11);
                break;
            default:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) this.f33880b;
                v1 v1Var = materialAutoCompleteTextView.f12635e;
                materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(i11 < 0 ? !v1Var.f34064z.isShowing() ? null : v1Var.f34042c.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i11)), false);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i11 < 0) {
                        view = !v1Var.f34064z.isShowing() ? null : v1Var.f34042c.getSelectedView();
                        i11 = !v1Var.f34064z.isShowing() ? -1 : v1Var.f34042c.getSelectedItemPosition();
                        j9 = !v1Var.f34064z.isShowing() ? Long.MIN_VALUE : v1Var.f34042c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(v1Var.f34042c, view, i11, j9);
                }
                v1Var.dismiss();
                break;
        }
    }
}
