package bg;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;
import com.app.tgtg.customview.SearchAndFilterView;
import pg.r1;
import zendesk.ui.android.conversation.form.FieldRendering;
import zendesk.ui.android.conversation.form.FieldView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6201c;

    public /* synthetic */ l0(int i11, Object obj, Object obj2) {
        this.f6199a = i11;
        this.f6200b = obj;
        this.f6201c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        int i11 = this.f6199a;
        Object obj = this.f6201c;
        Object obj2 = this.f6200b;
        switch (i11) {
            case 0:
                SearchAndFilterView searchAndFilterView = (SearchAndFilterView) obj2;
                pg.a aVar = (pg.a) obj;
                int i12 = SearchAndFilterView.f8913k;
                if (z11) {
                    searchAndFilterView.k(true);
                }
                ((ConstraintLayout) aVar.f34761c).setVisibility(z11 ? 0 : 8);
                break;
            case 1:
                uk.q qVar = (uk.q) obj2;
                r1 r1Var = (r1) obj;
                TextView textView = r1Var.f35127m;
                EditText editText = r1Var.f35126k;
                int i13 = uk.q.f41347y;
                if (!z11) {
                    textView.setVisibility(8);
                    editText.setGravity(17);
                    editText.setCompoundDrawablesWithIntrinsicBounds(b0.a0.x(qVar.getContext(), R.drawable.system_icon_search_neutral_60), (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    qVar.l();
                    editText.setGravity(8388627);
                    r1Var.l.setPadding(editText.getTotalPaddingLeft(), 0, 0, 0);
                    textView.setVisibility(0);
                    editText.setCompoundDrawablesWithIntrinsicBounds(b0.a0.x(qVar.getContext(), R.drawable.system_icon_search_primary_30), (Drawable) null, (Drawable) null, (Drawable) null);
                }
                break;
            case 2:
                FieldView.renderFormField$lambda$15((FieldRendering.Text) obj2, (FieldView) obj, view, z11);
                break;
            default:
                FieldView.renderFormField$lambda$18((FieldRendering.Email) obj2, (FieldView) obj, view, z11);
                break;
        }
    }
}
