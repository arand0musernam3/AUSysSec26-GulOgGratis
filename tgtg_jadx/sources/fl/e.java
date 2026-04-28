package fl;

import al.j;
import al.p;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.lifecycle.m1;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.jvm.functions.Function0;
import v80.f0;
import zendesk.ui.android.conversation.form.FormView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f17781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17782c;

    public /* synthetic */ e(KeyEvent.Callback callback, Object obj, int i11) {
        this.f17780a = i11;
        this.f17781b = callback;
        this.f17782c = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
        String str;
        int i12 = this.f17780a;
        Object obj = this.f17782c;
        KeyEvent.Callback callback = this.f17781b;
        switch (i12) {
            case 0:
                EmailCodeAccessActivity emailCodeAccessActivity = (EmailCodeAccessActivity) callback;
                TextInputEditText textInputEditText = (TextInputEditText) obj;
                if (i11 != 6) {
                    int i13 = EmailCodeAccessActivity.f9048k;
                    return false;
                }
                pg.b bVar = emailCodeAccessActivity.f9050g;
                bVar.getClass();
                ((TGTGLoadingView) bVar.f34790k).setVisibility(0);
                p pVarA0 = emailCodeAccessActivity.a0();
                String strValueOf = String.valueOf(textInputEditText.getText());
                String str2 = pVarA0.f1583v;
                if (str2 != null && (str = pVarA0.f1584w) != null) {
                    f0.B(m1.d(pVarA0), null, null, new j(pVarA0, str2, strValueOf, str, null, 0), 3);
                }
                return true;
            default:
                return FormView.nextActionButtonClicked$lambda$17$lambda$16((FormView) callback, (Function0) obj, textView, i11, keyEvent);
        }
    }
}
