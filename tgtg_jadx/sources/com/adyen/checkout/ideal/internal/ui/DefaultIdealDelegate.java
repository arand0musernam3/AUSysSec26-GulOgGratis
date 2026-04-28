package com.adyen.checkout.ideal.internal.ui;

import androidx.lifecycle.LifecycleOwner;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.provider.SdkDataProvider;
import com.adyen.checkout.components.core.internal.ui.model.GenericComponentParams;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.components.core.paymentmethod.IdealPaymentMethod;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ideal.IdealComponentState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import x80.m;
import y80.a2;
import y80.f1;
import y80.i;
import y80.r;
import y80.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J9\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001d\u0012\u0004\u0012\u00020\u00130\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u001c\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010.R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00160/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0016048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u00108\u001a\b\u0012\u0004\u0012\u00020\u0016078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;¨\u0006B"}, d2 = {"Lcom/adyen/checkout/ideal/internal/ui/DefaultIdealDelegate;", "Lcom/adyen/checkout/ideal/internal/ui/IdealDelegate;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "observerRepository", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "componentParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "sdkDataProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;)V", "Lv80/b0;", "coroutineScope", "", "initializeAnalytics", "(Lv80/b0;)V", "Lcom/adyen/checkout/ideal/IdealComponentState;", "createComponentState", "()Lcom/adyen/checkout/ideal/IdealComponentState;", "initialize", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "", "getPaymentMethodType", "()Ljava/lang/String;", "onCleared", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "Lcom/adyen/checkout/components/core/PaymentMethod;", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "Ly80/y1;", "componentStateFlow", "Ly80/y1;", "getComponentStateFlow", "()Ly80/y1;", "Lx80/m;", "submitChannel", "Lx80/m;", "Ly80/i;", "submitFlow", "Ly80/i;", "getSubmitFlow", "()Ly80/i;", "Ly80/f1;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "Ly80/f1;", "viewFlow", "getViewFlow", "ideal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultIdealDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultIdealDelegate.kt\ncom/adyen/checkout/ideal/internal/ui/DefaultIdealDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,113:1\n16#2,17:114\n*S KotlinDebug\n*F\n+ 1 DefaultIdealDelegate.kt\ncom/adyen/checkout/ideal/internal/ui/DefaultIdealDelegate\n*L\n62#1:114,17\n*E\n"})
public final class DefaultIdealDelegate implements IdealDelegate {

    @NotNull
    private final f1 _viewFlow;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final GenericComponentParams componentParams;

    @NotNull
    private final y1 componentStateFlow;

    @NotNull
    private final PaymentObserverRepository observerRepository;

    @Nullable
    private final OrderRequest order;

    @NotNull
    private final PaymentMethod paymentMethod;

    @NotNull
    private final SdkDataProvider sdkDataProvider;

    @NotNull
    private final m submitChannel;

    @NotNull
    private final i submitFlow;

    @NotNull
    private final i viewFlow;

    public DefaultIdealDelegate(@NotNull PaymentObserverRepository paymentObserverRepository, @NotNull PaymentMethod paymentMethod, @Nullable OrderRequest orderRequest, @NotNull GenericComponentParams genericComponentParams, @NotNull AnalyticsManager analyticsManager, @NotNull SdkDataProvider sdkDataProvider) {
        paymentObserverRepository.getClass();
        paymentMethod.getClass();
        genericComponentParams.getClass();
        analyticsManager.getClass();
        sdkDataProvider.getClass();
        this.observerRepository = paymentObserverRepository;
        this.paymentMethod = paymentMethod;
        this.order = orderRequest;
        this.componentParams = genericComponentParams;
        this.analyticsManager = analyticsManager;
        this.sdkDataProvider = sdkDataProvider;
        this.componentStateFlow = r.c(createComponentState());
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.submitChannel = mVarBufferedChannel;
        this.submitFlow = r.w(mVarBufferedChannel);
        a2 a2VarC = r.c(PaymentInProgressViewType.INSTANCE);
        this._viewFlow = a2VarC;
        this.viewFlow = a2VarC;
        mVarBufferedChannel.h(getComponentStateFlow().getValue());
    }

    private final IdealComponentState createComponentState() {
        return new IdealComponentState(new PaymentComponentData(new IdealPaymentMethod(this.paymentMethod.getType(), this.analyticsManager.getCheckoutAttemptId(), SdkDataProvider.DefaultImpls.createEncodedSdkData$default(this.sdkDataProvider, null, 1, null), null), this.order, getComponentParams().getAmount(), null, null, null, null, null, null, null, null, null, null, null, 16376, null), true, true);
    }

    private final void initializeAnalytics(b0 coroutineScope) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultIdealDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "initializeAnalytics", null);
        }
        this.analyticsManager.initialize(this, coroutineScope);
        GenericEvents genericEvents = GenericEvents.INSTANCE;
        String type = this.paymentMethod.getType();
        this.analyticsManager.trackEvent(GenericEvents.rendered$default(genericEvents, type == null ? "" : type, null, null, null, 14, null));
        String type2 = this.paymentMethod.getType();
        this.analyticsManager.trackEvent(genericEvents.submit(type2 != null ? type2 : ""));
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    @NotNull
    public String getPaymentMethodType() {
        String type = this.paymentMethod.getType();
        return type == null ? PaymentMethodTypes.UNKNOWN : type;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    @NotNull
    public i getSubmitFlow() {
        return this.submitFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate
    @NotNull
    public i getViewFlow() {
        return this.viewFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
        initializeAnalytics(coroutineScope);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super PaymentComponentEvent<IdealComponentState>, Unit> callback) {
        lifecycleOwner.getClass();
        coroutineScope.getClass();
        callback.getClass();
        this.observerRepository.addObservers(getComponentStateFlow(), null, getSubmitFlow(), lifecycleOwner, coroutineScope, callback);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void onCleared() {
        removeObserver();
        this.analyticsManager.clear(this);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void removeObserver() {
        this.observerRepository.removeObservers();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public GenericComponentParams getComponentParams() {
        return this.componentParams;
    }

    @Override // com.adyen.checkout.ideal.internal.ui.IdealDelegate
    @NotNull
    public y1 getComponentStateFlow() {
        return this.componentStateFlow;
    }
}
