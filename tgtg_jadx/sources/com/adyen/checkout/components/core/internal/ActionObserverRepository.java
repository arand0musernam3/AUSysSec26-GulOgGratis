package com.adyen.checkout.components.core.internal;

import androidx.lifecycle.LifecycleOwner;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.ComponentError;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.core.exception.CheckoutException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Ja\u0010\u0015\u001a\u00020\u00132\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "", "Lcom/adyen/checkout/components/core/internal/ObserverContainer;", "observerContainer", "<init>", "(Lcom/adyen/checkout/components/core/internal/ObserverContainer;)V", "Ly80/i;", "Lcom/adyen/checkout/components/core/ActionComponentData;", "detailsFlow", "Lcom/adyen/checkout/core/exception/CheckoutException;", "exceptionFlow", "Lcom/adyen/checkout/components/core/internal/PermissionRequestData;", "permissionFlow", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lv80/b0;", "coroutineScope", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "", "callback", "addObservers", "(Ly80/i;Ly80/i;Ly80/i;Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObservers", "()V", "Lcom/adyen/checkout/components/core/internal/ObserverContainer;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ActionObserverRepository {

    @NotNull
    private final ObserverContainer observerContainer;

    public /* synthetic */ ActionObserverRepository(ObserverContainer observerContainer, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ObserverContainer() : observerContainer);
    }

    public final void addObservers(@Nullable i detailsFlow, @Nullable i exceptionFlow, @Nullable i permissionFlow, @NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull final Function1<? super ActionComponentEvent, Unit> callback) {
        lifecycleOwner.getClass();
        coroutineScope.getClass();
        callback.getClass();
        ObserverContainer observerContainer = this.observerContainer;
        observerContainer.removeObservers$components_core_release();
        if (detailsFlow != null) {
            observerContainer.observe$components_core_release(detailsFlow, lifecycleOwner, coroutineScope, new Function1<ActionComponentData, Unit>() { // from class: com.adyen.checkout.components.core.internal.ActionObserverRepository$addObservers$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void invoke(@NotNull ActionComponentData actionComponentData) {
                    actionComponentData.getClass();
                    callback.invoke(new ActionComponentEvent.ActionDetails(actionComponentData));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ActionComponentData) obj);
                    return Unit.f26487a;
                }
            });
        }
        if (exceptionFlow != null) {
            observerContainer.observe$components_core_release(exceptionFlow, lifecycleOwner, coroutineScope, new Function1<CheckoutException, Unit>() { // from class: com.adyen.checkout.components.core.internal.ActionObserverRepository$addObservers$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void invoke(@NotNull CheckoutException checkoutException) {
                    checkoutException.getClass();
                    callback.invoke(new ActionComponentEvent.Error(new ComponentError(checkoutException)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((CheckoutException) obj);
                    return Unit.f26487a;
                }
            });
        }
        if (permissionFlow != null) {
            observerContainer.observe$components_core_release(permissionFlow, lifecycleOwner, coroutineScope, new Function1<PermissionRequestData, Unit>() { // from class: com.adyen.checkout.components.core.internal.ActionObserverRepository$addObservers$1$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void invoke(@NotNull PermissionRequestData permissionRequestData) {
                    permissionRequestData.getClass();
                    callback.invoke(new ActionComponentEvent.PermissionRequest(permissionRequestData.getRequiredPermission(), permissionRequestData.getPermissionCallback()));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PermissionRequestData) obj);
                    return Unit.f26487a;
                }
            });
        }
    }

    public final void removeObservers() {
        this.observerContainer.removeObservers$components_core_release();
    }

    public ActionObserverRepository(@NotNull ObserverContainer observerContainer) {
        observerContainer.getClass();
        this.observerContainer = observerContainer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionObserverRepository() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
