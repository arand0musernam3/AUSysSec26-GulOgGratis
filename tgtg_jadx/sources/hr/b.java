package hr;

import android.widget.Toast;
import com.app.tgtg.R;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.ManageAccountActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageAccountActivity f22422b;

    public /* synthetic */ b(ManageAccountActivity manageAccountActivity, int i11) {
        this.f22421a = i11;
        this.f22422b = manageAccountActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f22421a;
        ManageAccountActivity manageAccountActivity = this.f22422b;
        switch (i11) {
            case 0:
                int i12 = ManageAccountActivity.f9348i;
                manageAccountActivity.getOnBackPressedDispatcher().d();
                break;
            case 1:
                int i13 = ManageAccountActivity.f9348i;
                manageAccountActivity.a0().f22437i.f46334a.a(LoginActivity.f9032j);
                break;
            default:
                int i14 = ManageAccountActivity.f9348i;
                Toast.makeText(manageAccountActivity.getApplicationContext(), R.string.generic_err_undefined_error, 0).show();
                break;
        }
        return Unit.f26487a;
    }
}
