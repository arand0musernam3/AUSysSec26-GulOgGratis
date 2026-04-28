package fl;

import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmailCodeAccessActivity f17786b;

    public /* synthetic */ g(EmailCodeAccessActivity emailCodeAccessActivity, int i11) {
        this.f17785a = i11;
        this.f17786b = emailCodeAccessActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17785a) {
            case 0:
                return this.f17786b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f17786b.getViewModelStore();
            default:
                return this.f17786b.getDefaultViewModelCreationExtras();
        }
    }
}
