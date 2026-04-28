package hi;

import com.app.tgtg.feature.charity.ui.help.CharityContactUsActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharityContactUsActivity f22064b;

    public /* synthetic */ a(CharityContactUsActivity charityContactUsActivity, int i11) {
        this.f22063a = i11;
        this.f22064b = charityContactUsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22063a) {
            case 0:
                return this.f22064b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f22064b.getViewModelStore();
            default:
                return this.f22064b.getDefaultViewModelCreationExtras();
        }
    }
}
