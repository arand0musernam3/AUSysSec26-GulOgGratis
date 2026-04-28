package bg;

import android.widget.PopupWindow;
import com.app.tgtg.feature.tabprofile.legal.privacy.privacyaction.PrivacyActionActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6163b;

    public /* synthetic */ i0(Object obj, int i11) {
        this.f6162a = i11;
        this.f6163b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i11 = this.f6162a;
        Object obj = this.f6163b;
        switch (i11) {
            case 0:
                Function0 function0 = ((k0) obj).f6183o;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                int i12 = PrivacyActionActivity.f9330k;
                mv.r0.p((PrivacyActionActivity) obj);
                break;
        }
    }
}
