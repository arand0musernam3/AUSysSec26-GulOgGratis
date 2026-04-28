package wl;

import com.app.tgtg.feature.logincharity.ui.LoginCharityActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginCharityActivity f43513b;

    public /* synthetic */ a(LoginCharityActivity loginCharityActivity, int i11) {
        this.f43512a = i11;
        this.f43513b = loginCharityActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f43512a) {
            case 0:
                return this.f43513b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f43513b.getViewModelStore();
            default:
                return this.f43513b.getDefaultViewModelCreationExtras();
        }
    }
}
