package com.adyen.checkout.voucher;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponent;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionComponentEventHandler;
import com.adyen.checkout.components.core.internal.provider.ActionComponentProvider;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ui.core.internal.ui.ViewableComponent;
import com.adyen.checkout.voucher.internal.provider.VoucherComponentProvider;
import com.adyen.checkout.voucher.internal.ui.VoucherDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001f\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\"\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/adyen/checkout/voucher/VoucherComponent;", "Landroidx/lifecycle/l1;", "Lcom/adyen/checkout/components/core/internal/ActionComponent;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;", "Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;", "delegate", "Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "actionComponentEventHandler", "<init>", "(Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "", "callback", "observe$voucher_release", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "observe", "removeObserver$voucher_release", "()V", "removeObserver", "Lcom/adyen/checkout/components/core/action/Action;", "action", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "Landroid/app/Activity;", "activity", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "onCleared", "Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;", "getDelegate", "()Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "getActionComponentEventHandler$voucher_release", "()Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "viewFlow", "Ly80/i;", "getViewFlow", "()Ly80/i;", "Companion", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVoucherComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoucherComponent.kt\ncom/adyen/checkout/voucher/VoucherComponent\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,73:1\n16#2,17:74\n*S KotlinDebug\n*F\n+ 1 VoucherComponent.kt\ncom/adyen/checkout/voucher/VoucherComponent\n*L\n62#1:74,17\n*E\n"})
public final class VoucherComponent extends l1 implements ActionComponent, ViewableComponent {

    @NotNull
    public static final ActionComponentProvider<VoucherComponent, VoucherConfiguration, VoucherDelegate> PROVIDER = new VoucherComponentProvider(null, null, null, 7, null);

    @NotNull
    private final ActionComponentEventHandler actionComponentEventHandler;

    @NotNull
    private final VoucherDelegate delegate;

    @NotNull
    private final i viewFlow;

    public VoucherComponent(@NotNull VoucherDelegate voucherDelegate, @NotNull ActionComponentEventHandler actionComponentEventHandler) {
        voucherDelegate.getClass();
        actionComponentEventHandler.getClass();
        this.delegate = voucherDelegate;
        this.actionComponentEventHandler = actionComponentEventHandler;
        this.viewFlow = getDelegate().getViewFlow();
        getDelegate().initialize(m1.d(this));
    }

    @Override // com.adyen.checkout.components.core.internal.ActionComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return PROVIDER.canHandleAction(action);
    }

    @NotNull
    /* JADX INFO: renamed from: getActionComponentEventHandler$voucher_release, reason: from getter */
    public final ActionComponentEventHandler getActionComponentEventHandler() {
        return this.actionComponentEventHandler;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewableComponent
    @NotNull
    public i getViewFlow() {
        return this.viewFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ActionComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleAction(@NotNull Action action, @NotNull Activity activity) {
        action.getClass();
        activity.getClass();
        getDelegate().handleAction(action, activity);
    }

    public final void observe$voucher_release(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super ActionComponentEvent, Unit> callback) {
        lifecycleOwner.getClass();
        callback.getClass();
        getDelegate().observe(lifecycleOwner, m1.d(this), callback);
    }

    @Override // androidx.lifecycle.l1
    public void onCleared() {
        super.onCleared();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = VoucherComponent.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onCleared", null);
        }
        getDelegate().onCleared();
    }

    public final void removeObserver$voucher_release() {
        getDelegate().removeObserver();
    }

    @Override // com.adyen.checkout.components.core.internal.Component
    @NotNull
    public VoucherDelegate getDelegate() {
        return this.delegate;
    }
}
