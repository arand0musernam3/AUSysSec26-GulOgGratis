package mr;

import android.widget.EditText;
import bg.k0;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditDataActivity f30080b;

    public /* synthetic */ c(EditDataActivity editDataActivity, int i11) {
        this.f30079a = i11;
        this.f30080b = editDataActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f30079a;
        pg.p pVar = null;
        EditDataActivity editDataActivity = this.f30080b;
        switch (i11) {
            case 0:
                int i12 = EditDataActivity.f9359n;
                r rVarB0 = editDataActivity.b0();
                pg.p pVar2 = editDataActivity.f9361g;
                if (pVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pVar = pVar2;
                }
                rVarB0.f(((EditText) pVar.f35047m).getText().toString(), or.b.SAVE_NEW_CHANGE);
                break;
            case 1:
                int i13 = EditDataActivity.f9359n;
                k0 k0Var = new k0(editDataActivity);
                k0Var.e(R.string.profile_verify_email_popup_title);
                k0Var.a(R.string.profile_verify_email_popup_description);
                k0Var.c(R.string.profile_verify_email_popup_btn_text);
                k0Var.f();
                break;
            default:
                int i14 = EditDataActivity.f9359n;
                r rVarB02 = editDataActivity.b0();
                pg.p pVar3 = editDataActivity.f9361g;
                if (pVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pVar = pVar3;
                }
                rVarB02.f(((EditText) pVar.f35047m).getText().toString(), or.b.SAVE_NEW_CHANGE);
                break;
        }
        return Unit.f26487a;
    }
}
