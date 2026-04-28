package com.adyen.checkout.components.core.action;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/components/core/action/Action;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "()V", "paymentData", "", "getPaymentData", "()Ljava/lang/String;", "setPaymentData", "(Ljava/lang/String;)V", Action.PAYMENT_METHOD_TYPE, "getPaymentMethodType", "setPaymentMethodType", "type", "getType", "setType", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Action extends ModelObject {

    @NotNull
    public static final String PAYMENT_DATA = "paymentData";

    @NotNull
    public static final String PAYMENT_METHOD_TYPE = "paymentMethodType";

    @NotNull
    public static final String TYPE = "type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ModelObject.Serializer<Action> SERIALIZER = new ModelObject.Serializer<Action>() { // from class: com.adyen.checkout.components.core.action.Action$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public Action deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "type");
            if (stringOrNull != null) {
                return (Action) Action.INSTANCE.getChildSerializer(stringOrNull).deserialize(jsonObject);
            }
            throw new CheckoutException("Action type not found", null, 2, null);
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull Action modelObject) {
            modelObject.getClass();
            String type = modelObject.getType();
            if (type == null || type.length() == 0) {
                throw new CheckoutException("Action type not found", null, 2, null);
            }
            return Action.INSTANCE.getChildSerializer(type).serialize(modelObject);
        }
    };

    @Nullable
    public abstract String getPaymentData();

    @Nullable
    public abstract String getPaymentMethodType();

    @Nullable
    public abstract String getType();

    public abstract void setPaymentData(@Nullable String str);

    public abstract void setPaymentMethodType(@Nullable String str);

    public abstract void setType(@Nullable String str);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/components/core/action/Action$Companion;", "", "()V", "PAYMENT_DATA", "", "PAYMENT_METHOD_TYPE", ModelUtils.SERIALIZER_FIELD_NAME, "Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;", "Lcom/adyen/checkout/components/core/action/Action;", CredentialProviderBaseController.TYPE_TAG, "getChildSerializer", "actionType", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            if (r4.equals(com.adyen.checkout.components.core.action.ActionTypes.NATIVE_REDIRECT) != false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        
            if (r4.equals("redirect") != false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        
            r4 = com.adyen.checkout.components.core.action.RedirectAction.SERIALIZER;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.adyen.checkout.core.internal.data.model.ModelObject.Serializer<com.adyen.checkout.components.core.action.Action> getChildSerializer(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            /*
                r3 = this;
                r4.getClass()
                int r0 = r4.hashCode()
                switch(r0) {
                    case -952485970: goto L62;
                    case -776144932: goto L57;
                    case -374364909: goto L4e;
                    case 113722: goto L43;
                    case 93223254: goto L38;
                    case 640192174: goto L2d;
                    case 1021099710: goto L22;
                    case 1337458815: goto L17;
                    case 1473713957: goto Lc;
                    default: goto La;
                }
            La:
                goto L70
            Lc:
                java.lang.String r0 = "threeDS2"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L70
                com.adyen.checkout.core.internal.data.model.ModelObject$Serializer<com.adyen.checkout.components.core.action.Threeds2Action> r4 = com.adyen.checkout.components.core.action.Threeds2Action.SERIALIZER
                goto L6c
            L17:
                java.lang.String r0 = "threeDS2Fingerprint"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L70
                com.adyen.checkout.core.internal.data.model.ModelObject$Serializer<com.adyen.checkout.components.core.action.Threeds2FingerprintAction> r4 = com.adyen.checkout.components.core.action.Threeds2FingerprintAction.SERIALIZER
                goto L6c
            L22:
                java.lang.String r0 = "threeDS2Challenge"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L70
                com.adyen.checkout.core.internal.data.model.ModelObject$Serializer<com.adyen.checkout.components.core.action.Threeds2ChallengeAction> r4 = com.adyen.checkout.components.core.action.Threeds2ChallengeAction.SERIALIZER
                goto L6c
            L2d:
                java.lang.String r0 = "voucher"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L70
                com.adyen.checkout.core.internal.data.model.ModelObject$Serializer<com.adyen.checkout.components.core.action.VoucherAction> r4 = com.adyen.checkout.components.core.action.VoucherAction.SERIALIZER
                goto L6c
            L38:
                java.lang.String r0 = "await"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L70
                com.adyen.checkout.core.internal.data.model.ModelObject$Serializer<com.adyen.checkout.components.core.action.AwaitAction> r4 = com.adyen.checkout.components.core.action.AwaitAction.SERIALIZER
                goto L6c
            L43:
                java.lang.String r0 = "sdk"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L70
                com.adyen.checkout.core.internal.data.model.ModelObject$Serializer<com.adyen.checkout.components.core.action.SdkAction<?>> r4 = com.adyen.checkout.components.core.action.SdkAction.SERIALIZER
                goto L6c
            L4e:
                java.lang.String r0 = "nativeRedirect"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L70
                goto L5f
            L57:
                java.lang.String r0 = "redirect"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L70
            L5f:
                com.adyen.checkout.core.internal.data.model.ModelObject$Serializer<com.adyen.checkout.components.core.action.RedirectAction> r4 = com.adyen.checkout.components.core.action.RedirectAction.SERIALIZER
                goto L6c
            L62:
                java.lang.String r0 = "qrCode"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L70
                com.adyen.checkout.core.internal.data.model.ModelObject$Serializer<com.adyen.checkout.components.core.action.QrCodeAction> r4 = com.adyen.checkout.components.core.action.QrCodeAction.SERIALIZER
            L6c:
                r4.getClass()
                return r4
            L70:
                com.adyen.checkout.core.exception.CheckoutException r0 = new com.adyen.checkout.core.exception.CheckoutException
                java.lang.String r1 = "Action type not found - "
                java.lang.String r4 = r1.concat(r4)
                r1 = 2
                r2 = 0
                r0.<init>(r4, r2, r1, r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.action.Action.Companion.getChildSerializer(java.lang.String):com.adyen.checkout.core.internal.data.model.ModelObject$Serializer");
        }

        private Companion() {
        }
    }
}
