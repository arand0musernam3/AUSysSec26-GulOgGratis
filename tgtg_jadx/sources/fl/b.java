package fl;

import com.app.tgtg.feature.login.email.EmailAccessActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmailAccessActivity f17777b;

    public /* synthetic */ b(EmailAccessActivity emailAccessActivity, int i11) {
        this.f17776a = i11;
        this.f17777b = emailAccessActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17776a) {
            case 0:
                return this.f17777b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f17777b.getViewModelStore();
            default:
                return this.f17777b.getDefaultViewModelCreationExtras();
        }
    }
}
