package bg;

import android.view.View;
import android.widget.PopupWindow;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PopupWindow f6161b;

    public /* synthetic */ i(PopupWindow popupWindow, int i11) {
        this.f6160a = i11;
        this.f6161b = popupWindow;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f6160a;
        PopupWindow popupWindow = this.f6161b;
        View view = (View) obj;
        switch (i11) {
            case 0:
                view.getClass();
                popupWindow.dismiss();
                break;
            default:
                int i12 = EmailCodeAccessActivity.f9048k;
                view.getClass();
                popupWindow.dismiss();
                break;
        }
        return Unit.f26487a;
    }
}
