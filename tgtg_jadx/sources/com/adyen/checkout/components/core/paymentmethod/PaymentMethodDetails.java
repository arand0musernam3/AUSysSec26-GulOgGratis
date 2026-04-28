package com.adyen.checkout.components.core.paymentmethod;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00048&@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "()V", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "", "getCheckoutAttemptId$annotations", "getCheckoutAttemptId", "()Ljava/lang/String;", "setCheckoutAttemptId", "(Ljava/lang/String;)V", PaymentMethodDetails.SDK_DATA, "getSdkData", "setSdkData", "type", "getType", "setType", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class PaymentMethodDetails extends ModelObject {

    @NotNull
    public static final String CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";

    @NotNull
    public static final String SDK_DATA = "sdkData";

    @NotNull
    public static final String TYPE = "type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ModelObject.Serializer<PaymentMethodDetails> SERIALIZER = new ModelObject.Serializer<PaymentMethodDetails>() { // from class: com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public PaymentMethodDetails deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "type");
            if (stringOrNull == null || stringOrNull.length() == 0) {
                throw new CheckoutException("PaymentMethod type not found", null, 2, null);
            }
            return (PaymentMethodDetails) PaymentMethodDetails.INSTANCE.getChildSerializer(stringOrNull).deserialize(jsonObject);
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull PaymentMethodDetails modelObject) {
            modelObject.getClass();
            String type = modelObject.getType();
            if (type == null || type.length() == 0) {
                throw new CheckoutException("PaymentMethod type not found", null, 2, null);
            }
            return PaymentMethodDetails.INSTANCE.getChildSerializer(type).serialize(modelObject);
        }
    };

    @Nullable
    public abstract String getCheckoutAttemptId();

    @Nullable
    public abstract String getSdkData();

    @Nullable
    public abstract String getType();

    public abstract void setCheckoutAttemptId(@Nullable String str);

    public abstract void setSdkData(@Nullable String str);

    public abstract void setType(@Nullable String str);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails$Companion;", "", "()V", "CHECKOUT_ATTEMPT_ID", "", "SDK_DATA", ModelUtils.SERIALIZER_FIELD_NAME, "Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", CredentialProviderBaseController.TYPE_TAG, "getChildSerializer", Action.PAYMENT_METHOD_TYPE, "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x014a  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.adyen.checkout.core.internal.data.model.ModelObject.Serializer<com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails> getChildSerializer(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            /*
                Method dump skipped, instruction units count: 634
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails.Companion.getChildSerializer(java.lang.String):com.adyen.checkout.core.internal.data.model.ModelObject$Serializer");
        }

        private Companion() {
        }
    }

    @d
    public static /* synthetic */ void getCheckoutAttemptId$annotations() {
    }
}
