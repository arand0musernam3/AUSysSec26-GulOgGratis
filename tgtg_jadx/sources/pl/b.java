package pl;

import com.app.tgtg.feature.login.terms.TermsAccessActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TermsAccessActivity f35474b;

    public /* synthetic */ b(TermsAccessActivity termsAccessActivity, int i11) {
        this.f35473a = i11;
        this.f35474b = termsAccessActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35473a) {
            case 0:
                return this.f35474b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f35474b.getViewModelStore();
            default:
                return this.f35474b.getDefaultViewModelCreationExtras();
        }
    }
}
