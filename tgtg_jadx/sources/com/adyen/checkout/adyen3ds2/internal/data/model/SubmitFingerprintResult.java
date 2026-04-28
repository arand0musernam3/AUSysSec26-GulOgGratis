package com.adyen.checkout.adyen3ds2.internal.data.model;

import com.adyen.checkout.components.core.action.RedirectAction;
import com.adyen.checkout.components.core.action.Threeds2Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult;", "", "()V", "Completed", "Redirect", "Threeds2", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult$Completed;", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult$Redirect;", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult$Threeds2;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SubmitFingerprintResult {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult$Completed;", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult;", ErrorBundle.DETAIL_ENTRY, "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getDetails", "()Lorg/json/JSONObject;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Completed extends SubmitFingerprintResult {

        @NotNull
        private final JSONObject details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(@NotNull JSONObject jSONObject) {
            super(null);
            jSONObject.getClass();
            this.details = jSONObject;
        }

        @NotNull
        public final JSONObject getDetails() {
            return this.details;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult$Redirect;", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult;", "action", "Lcom/adyen/checkout/components/core/action/RedirectAction;", "(Lcom/adyen/checkout/components/core/action/RedirectAction;)V", "getAction", "()Lcom/adyen/checkout/components/core/action/RedirectAction;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Redirect extends SubmitFingerprintResult {

        @NotNull
        private final RedirectAction action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Redirect(@NotNull RedirectAction redirectAction) {
            super(null);
            redirectAction.getClass();
            this.action = redirectAction;
        }

        @NotNull
        public final RedirectAction getAction() {
            return this.action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult$Threeds2;", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult;", "action", "Lcom/adyen/checkout/components/core/action/Threeds2Action;", "(Lcom/adyen/checkout/components/core/action/Threeds2Action;)V", "getAction", "()Lcom/adyen/checkout/components/core/action/Threeds2Action;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Threeds2 extends SubmitFingerprintResult {

        @NotNull
        private final Threeds2Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Threeds2(@NotNull Threeds2Action threeds2Action) {
            super(null);
            threeds2Action.getClass();
            this.action = threeds2Action;
        }

        @NotNull
        public final Threeds2Action getAction() {
            return this.action;
        }
    }

    public /* synthetic */ SubmitFingerprintResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SubmitFingerprintResult() {
    }
}
