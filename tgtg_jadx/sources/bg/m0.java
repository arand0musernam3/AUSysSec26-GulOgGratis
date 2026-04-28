package bg;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.app.tgtg.customview.SearchAndFilterView;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import zendesk.ui.android.conversation.form.FormView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6204b;

    public /* synthetic */ m0(Object obj, int i11) {
        this.f6203a = i11;
        this.f6204b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
        int i12 = this.f6203a;
        Object obj = this.f6204b;
        switch (i12) {
            case 0:
                SearchAndFilterView.j((SearchAndFilterView) obj, i11, keyEvent);
                return false;
            case 1:
                pg.x0 x0Var = (pg.x0) obj;
                int i13 = HiddenStoresActivity.f9412k;
                if ((keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) || i11 == 6) {
                    ((Button) x0Var.f35265f).performClick();
                }
                return true;
            case 2:
                EditDataActivity editDataActivity = (EditDataActivity) obj;
                int i14 = EditDataActivity.f9359n;
                if ((keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) || i11 == 6) {
                    editDataActivity.d0();
                }
                return true;
            default:
                return FormView.setDoneActionListener$lambda$28$lambda$27((FormView) obj, textView, i11, keyEvent);
        }
    }
}
