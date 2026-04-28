package com.adyen.checkout.sessions.core.internal;

import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.sessions.core.SessionComponentCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class SessionComponentEventHandler$onDetailsCallRequested$1$result$1 extends FunctionReferenceImpl implements Function1<ActionComponentData, Boolean> {
    public SessionComponentEventHandler$onDetailsCallRequested$1$result$1(Object obj) {
        super(1, obj, SessionComponentCallback.class, "onAdditionalDetails", "onAdditionalDetails(Lcom/adyen/checkout/components/core/ActionComponentData;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull ActionComponentData actionComponentData) {
        actionComponentData.getClass();
        return Boolean.valueOf(((SessionComponentCallback) this.receiver).onAdditionalDetails(actionComponentData));
    }
}
