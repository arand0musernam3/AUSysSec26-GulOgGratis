package com.adyen.checkout.qrcode;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.adyen.checkout.components.core.RedirectableActionComponent;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponent;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionComponentEventHandler;
import com.adyen.checkout.components.core.internal.IntentHandlingComponent;
import com.adyen.checkout.components.core.internal.provider.ActionComponentProvider;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.qrcode.internal.provider.QRCodeComponentProvider;
import com.adyen.checkout.qrcode.internal.ui.QRCodeDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewableComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00015B\u0019\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00102\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0014¢\u0006\u0004\b)\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/adyen/checkout/qrcode/QRCodeComponent;", "Landroidx/lifecycle/l1;", "Lcom/adyen/checkout/components/core/internal/ActionComponent;", "Lcom/adyen/checkout/components/core/internal/IntentHandlingComponent;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;", "Lcom/adyen/checkout/components/core/RedirectableActionComponent;", "Lcom/adyen/checkout/qrcode/internal/ui/QRCodeDelegate;", "delegate", "Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "actionComponentEventHandler", "<init>", "(Lcom/adyen/checkout/qrcode/internal/ui/QRCodeDelegate;Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "", "callback", "observe$qr_code_release", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "observe", "removeObserver$qr_code_release", "()V", "removeObserver", "Lcom/adyen/checkout/components/core/action/Action;", "action", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "Landroid/app/Activity;", "activity", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "onCleared", "Lcom/adyen/checkout/qrcode/internal/ui/QRCodeDelegate;", "getDelegate", "()Lcom/adyen/checkout/qrcode/internal/ui/QRCodeDelegate;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "getActionComponentEventHandler$qr_code_release", "()Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "getViewFlow", "()Ly80/i;", "viewFlow", "Companion", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nQRCodeComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRCodeComponent.kt\ncom/adyen/checkout/qrcode/QRCodeComponent\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,91:1\n16#2,17:92\n*S KotlinDebug\n*F\n+ 1 QRCodeComponent.kt\ncom/adyen/checkout/qrcode/QRCodeComponent\n*L\n80#1:92,17\n*E\n"})
public final class QRCodeComponent extends l1 implements ActionComponent, IntentHandlingComponent, ViewableComponent, RedirectableActionComponent {

    @NotNull
    public static final ActionComponentProvider<QRCodeComponent, QRCodeConfiguration, QRCodeDelegate> PROVIDER = new QRCodeComponentProvider(null, null, null, 7, null);

    @NotNull
    private final ActionComponentEventHandler actionComponentEventHandler;

    @NotNull
    private final QRCodeDelegate delegate;

    public QRCodeComponent(@NotNull QRCodeDelegate qRCodeDelegate, @NotNull ActionComponentEventHandler actionComponentEventHandler) {
        qRCodeDelegate.getClass();
        actionComponentEventHandler.getClass();
        this.delegate = qRCodeDelegate;
        this.actionComponentEventHandler = actionComponentEventHandler;
        getDelegate().initialize(m1.d(this));
    }

    @Override // com.adyen.checkout.components.core.internal.ActionComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return PROVIDER.canHandleAction(action);
    }

    @NotNull
    /* JADX INFO: renamed from: getActionComponentEventHandler$qr_code_release, reason: from getter */
    public final ActionComponentEventHandler getActionComponentEventHandler() {
        return this.actionComponentEventHandler;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewableComponent
    @NotNull
    public i getViewFlow() {
        return getDelegate().getViewFlow();
    }

    @Override // com.adyen.checkout.components.core.internal.ActionComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleAction(@NotNull Action action, @NotNull Activity activity) {
        action.getClass();
        activity.getClass();
        getDelegate().handleAction(action, activity);
    }

    @Override // com.adyen.checkout.components.core.internal.IntentHandlingComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleIntent(@NotNull Intent intent) {
        intent.getClass();
        getDelegate().handleIntent(intent);
    }

    public final void observe$qr_code_release(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super ActionComponentEvent, Unit> callback) {
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
            String name = QRCodeComponent.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onCleared", null);
        }
        getDelegate().onCleared();
    }

    public final void removeObserver$qr_code_release() {
        getDelegate().removeObserver();
    }

    @Override // com.adyen.checkout.components.core.RedirectableActionComponent
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        getDelegate().setOnRedirectListener(listener);
    }

    @Override // com.adyen.checkout.components.core.internal.Component
    @NotNull
    public QRCodeDelegate getDelegate() {
        return this.delegate;
    }
}
