package ui;

import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.QrCodeAction;
import com.adyen.checkout.core.Environment;
import com.app.tgtg.model.remote.user.requests.OnboardingSurveyRequest;
import com.app.tgtg.model.remote.user.requests.SurveyResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41255a;

    public /* synthetic */ o(int i11) {
        this.f41255a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41255a) {
            case 0:
                return new i90.a(Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KSerializer[0]);
            case 1:
                return new i90.a(Reflection.getOrCreateKotlinClass(Environment.class), new KSerializer[0]);
            case 2:
                return new i90.a(Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KSerializer[0]);
            case 3:
                return new i90.a(Reflection.getOrCreateKotlinClass(Environment.class), new KSerializer[0]);
            case 4:
                return new i90.a(Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KSerializer[0]);
            case 5:
                return new i90.a(Reflection.getOrCreateKotlinClass(Environment.class), new KSerializer[0]);
            case 6:
                return new i90.a(Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KSerializer[0]);
            case 7:
                return new i90.a(Reflection.getOrCreateKotlinClass(Environment.class), new KSerializer[0]);
            case 8:
                return new i90.a(Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KSerializer[0]);
            case 9:
                return new i90.a(Reflection.getOrCreateKotlinClass(Environment.class), new KSerializer[0]);
            case 10:
                return new i90.a(Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KSerializer[0]);
            case 11:
                return new i90.a(Reflection.getOrCreateKotlinClass(Environment.class), new KSerializer[0]);
            case 12:
                return new i90.a(Reflection.getOrCreateKotlinClass(QrCodeAction.class), new KSerializer[0]);
            case 13:
                return new i90.a(Reflection.getOrCreateKotlinClass(Environment.class), new KSerializer[0]);
            case 14:
                return new i90.a(Reflection.getOrCreateKotlinClass(Action.class), new KSerializer[0]);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new i90.a(Reflection.getOrCreateKotlinClass(Environment.class), new KSerializer[0]);
            case 16:
                return new i90.a("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Adyen.Retry", z0.INSTANCE, new Annotation[0]);
            case 17:
                return new i90.a(Reflection.getOrCreateKotlinClass(StoredPaymentMethod.class), new KSerializer[0]);
            case 18:
                return new i90.a(Reflection.getOrCreateKotlinClass(Environment.class), new KSerializer[0]);
            case 19:
                return new i90.a(Reflection.getOrCreateKotlinClass(Action.class), new KSerializer[0]);
            case 20:
                return new i90.a(Reflection.getOrCreateKotlinClass(Environment.class), new KSerializer[0]);
            case 21:
                return new i90.a(Reflection.getOrCreateKotlinClass(Throwable.class), new KSerializer[0]);
            case 22:
                return new i90.a("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Fail.TimeOut", h2.INSTANCE, new Annotation[0]);
            case 23:
                return new i90.a("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Fail.UserAbort", i2.INSTANCE, new Annotation[0]);
            case 24:
                return Unit.f26487a;
            case 25:
                return Unit.f26487a;
            case 26:
                return 2;
            case 27:
                return OnboardingSurveyRequest._childSerializers$_anonymous_();
            case 28:
                return OnboardingSurveyRequest._childSerializers$_anonymous_$0();
            default:
                return SurveyResult._childSerializers$_anonymous_();
        }
    }
}
