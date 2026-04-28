package bj;

import androidx.fragment.app.o0;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.googlepay.GooglePayConfiguration;
import com.app.tgtg.model.local.AppConstants;
import yi.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f6314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zi.f f6315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u6.f f6316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Environment f6317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f6318e;

    public j(o0 o0Var, PaymentMethod paymentMethod, x xVar, zi.f fVar, u6.f fVar2, Environment environment) {
        o0Var.getClass();
        paymentMethod.getClass();
        environment.getClass();
        this.f6314a = xVar;
        this.f6315b = fVar;
        this.f6316c = fVar2;
        this.f6317d = environment;
        this.f6318e = new i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GooglePayConfiguration a(Amount amount, boolean z11) {
        AppConstants appConstants = AppConstants.INSTANCE;
        return (GooglePayConfiguration) new GooglePayConfiguration.Builder(this.f6317d, appConstants.getAdyenClientKey()).setGooglePayEnvironment(appConstants.getGooglePayEnvironment()).setExistingPaymentMethodRequired(z11).setAmount(amount).build();
    }
}
