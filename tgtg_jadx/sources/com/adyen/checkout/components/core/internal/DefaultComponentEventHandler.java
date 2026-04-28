package com.adyen.checkout.components.core.internal;

import com.adyen.checkout.components.core.ComponentCallback;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.CheckoutException;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J%\u0010\u0010\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/components/core/internal/DefaultComponentEventHandler;", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "T", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "<init>", "()V", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "onCleared", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "event", "Lcom/adyen/checkout/components/core/internal/BaseComponentCallback;", "componentCallback", "onPaymentComponentEvent", "(Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;Lcom/adyen/checkout/components/core/internal/BaseComponentCallback;)V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultComponentEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultComponentEventHandler.kt\ncom/adyen/checkout/components/core/internal/DefaultComponentEventHandler\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,45:1\n16#2,17:46\n*S KotlinDebug\n*F\n+ 1 DefaultComponentEventHandler.kt\ncom/adyen/checkout/components/core/internal/DefaultComponentEventHandler\n*L\n32#1:46,17\n*E\n"})
public final class DefaultComponentEventHandler<T extends PaymentComponentState<?>> implements ComponentEventHandler<T> {
    @Override // com.adyen.checkout.components.core.internal.ComponentEventHandler
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.adyen.checkout.components.core.internal.ComponentEventHandler
    public void onPaymentComponentEvent(@NotNull PaymentComponentEvent<T> event, @NotNull BaseComponentCallback componentCallback) {
        event.getClass();
        componentCallback.getClass();
        ComponentCallback componentCallback2 = componentCallback instanceof ComponentCallback ? (ComponentCallback) componentCallback : 0;
        if (componentCallback2 == 0) {
            throw new CheckoutException(f.k("Callback must be type of ", ComponentCallback.class.getCanonicalName()), null, 2, null);
        }
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultComponentEventHandler.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            String strConcat = "CO.".concat(name);
            companion.getLogger().log(adyenLogLevel, strConcat, "Event received " + event, null);
        }
        if (event instanceof PaymentComponentEvent.ActionDetails) {
            componentCallback2.onAdditionalDetails(((PaymentComponentEvent.ActionDetails) event).getData());
            return;
        }
        if (event instanceof PaymentComponentEvent.Error) {
            componentCallback2.onError(((PaymentComponentEvent.Error) event).getError());
            return;
        }
        if (event instanceof PaymentComponentEvent.StateChanged) {
            componentCallback2.onStateChanged(((PaymentComponentEvent.StateChanged) event).getState());
            return;
        }
        if (event instanceof PaymentComponentEvent.Submit) {
            componentCallback2.onSubmit(((PaymentComponentEvent.Submit) event).getState());
        } else if (event instanceof PaymentComponentEvent.PermissionRequest) {
            PaymentComponentEvent.PermissionRequest permissionRequest = (PaymentComponentEvent.PermissionRequest) event;
            componentCallback2.onPermissionRequest(permissionRequest.getRequiredPermission(), permissionRequest.getPermissionCallback());
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ComponentEventHandler
    public void onCleared() {
    }
}
