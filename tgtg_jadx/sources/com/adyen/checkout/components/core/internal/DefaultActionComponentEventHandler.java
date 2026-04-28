package com.adyen.checkout.components.core.internal;

import com.adyen.checkout.components.core.ActionComponentCallback;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/components/core/internal/DefaultActionComponentEventHandler;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "()V", "onActionComponentEvent", "", "event", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "actionComponentCallback", "Lcom/adyen/checkout/components/core/ActionComponentCallback;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultActionComponentEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultActionComponentEventHandler.kt\ncom/adyen/checkout/components/core/internal/DefaultActionComponentEventHandler\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,31:1\n16#2,17:32\n*S KotlinDebug\n*F\n+ 1 DefaultActionComponentEventHandler.kt\ncom/adyen/checkout/components/core/internal/DefaultActionComponentEventHandler\n*L\n20#1:32,17\n*E\n"})
public final class DefaultActionComponentEventHandler implements ActionComponentEventHandler {
    @Override // com.adyen.checkout.components.core.internal.ActionComponentEventHandler
    public void onActionComponentEvent(@NotNull ActionComponentEvent event, @NotNull ActionComponentCallback actionComponentCallback) {
        event.getClass();
        actionComponentCallback.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultActionComponentEventHandler.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            String strConcat = "CO.".concat(name);
            companion.getLogger().log(adyenLogLevel, strConcat, "Event received " + event, null);
        }
        if (event instanceof ActionComponentEvent.ActionDetails) {
            actionComponentCallback.onAdditionalDetails(((ActionComponentEvent.ActionDetails) event).getData());
            return;
        }
        if (event instanceof ActionComponentEvent.Error) {
            actionComponentCallback.onError(((ActionComponentEvent.Error) event).getError());
        } else if (event instanceof ActionComponentEvent.PermissionRequest) {
            ActionComponentEvent.PermissionRequest permissionRequest = (ActionComponentEvent.PermissionRequest) event;
            actionComponentCallback.onPermissionRequest(permissionRequest.getRequiredPermission(), permissionRequest.getPermissionCallback());
        }
    }
}
