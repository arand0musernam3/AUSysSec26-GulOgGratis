package bj;

import androidx.fragment.app.o0;
import com.adyen.checkout.card.CardComponent;
import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider;
import com.adyen.checkout.core.CardType;
import com.adyen.checkout.core.Environment;
import com.app.tgtg.model.local.AppConstants;
import yi.f0;
import yi.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f6324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoredPaymentMethod f6325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Environment f6327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f6328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f6329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f6330g;

    public n(o0 o0Var, StoredPaymentMethod storedPaymentMethod, boolean z11, Environment environment, x xVar, f0 f0Var) {
        o0Var.getClass();
        storedPaymentMethod.getClass();
        environment.getClass();
        this.f6324a = o0Var;
        this.f6325b = storedPaymentMethod;
        this.f6326c = z11;
        this.f6327d = environment;
        this.f6328e = xVar;
        this.f6329f = f0Var;
        this.f6330g = new m(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CardComponent a(Amount amount) {
        StoredPaymentMethod storedPaymentMethod = this.f6325b;
        String brand = storedPaymentMethod.getBrand();
        CardType byBrandName = brand != null ? CardType.INSTANCE.getByBrandName(brand) : null;
        CardConfiguration.Builder builder = (CardConfiguration.Builder) new CardConfiguration.Builder(this.f6327d, AppConstants.INSTANCE.getAdyenClientKey()).setAmount(amount);
        if (byBrandName != null) {
            builder.setSupportedCardTypes(byBrandName);
        }
        return (CardComponent) StoredPaymentComponentProvider.DefaultImpls.get$default(CardComponent.PROVIDER, this.f6324a, storedPaymentMethod, (CardConfiguration) builder.build(), this.f6330g, (OrderRequest) null, storedPaymentMethod.getId(), 16, (Object) null);
    }
}
