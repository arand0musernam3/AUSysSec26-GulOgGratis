package com.adyen.checkout.cashapppay.internal.ui;

import androidx.lifecycle.LifecycleOwner;
import ba0.g;
import com.adyen.checkout.cashapppay.CashAppPayComponentState;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayComponentParams;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayInputData;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.provider.SdkDataProvider;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.components.core.paymentmethod.CashAppPayPaymentMethod;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import x70.c;
import x80.m;
import y70.a;
import y80.a2;
import y80.f1;
import y80.i;
import y80.r;
import y80.w;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0014J9\u0010!\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001f\u0012\u0004\u0012\u00020\u00120\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u00122\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120\u001eH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0015058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0015088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00107R\"\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00150A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010D\u001a\b\u0012\u0004\u0012\u00020\u0015088\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010<¨\u0006F"}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/ui/StoredCashAppPayDelegate;", "Lcom/adyen/checkout/cashapppay/internal/ui/CashAppPayDelegate;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "observerRepository", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/OrderRequest;", "order", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;", "componentParams", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "sdkDataProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;)V", "Lv80/b0;", "coroutineScope", "", "initializeAnalytics", "(Lv80/b0;)V", "Lcom/adyen/checkout/cashapppay/CashAppPayComponentState;", "componentState", "onState", "(Lcom/adyen/checkout/cashapppay/CashAppPayComponentState;)V", "createComponentState", "()Lcom/adyen/checkout/cashapppay/CashAppPayComponentState;", "initialize", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayInputData;", "update", "updateInputData", "(Lkotlin/jvm/functions/Function1;)V", "", "getPaymentMethodType", "()Ljava/lang/String;", "onCleared", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "Ly80/f1;", "_componentStateFlow", "Ly80/f1;", "Ly80/i;", "componentStateFlow", "Ly80/i;", "getComponentStateFlow", "()Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "viewFlow", "getViewFlow", "Lx80/m;", "submitChannel", "Lx80/m;", "submitFlow", "getSubmitFlow", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStoredCashAppPayDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoredCashAppPayDelegate.kt\ncom/adyen/checkout/cashapppay/internal/ui/StoredCashAppPayDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,139:1\n16#2,17:140\n16#2,17:157\n*S KotlinDebug\n*F\n+ 1 StoredCashAppPayDelegate.kt\ncom/adyen/checkout/cashapppay/internal/ui/StoredCashAppPayDelegate\n*L\n64#1:140,17\n103#1:157,17\n*E\n"})
public final class StoredCashAppPayDelegate implements CashAppPayDelegate {

    @NotNull
    private final f1 _componentStateFlow;

    @NotNull
    private final f1 _viewFlow;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final CashAppPayComponentParams componentParams;

    @NotNull
    private final i componentStateFlow;

    @NotNull
    private final PaymentObserverRepository observerRepository;

    @Nullable
    private final OrderRequest order;

    @NotNull
    private final StoredPaymentMethod paymentMethod;

    @NotNull
    private final SdkDataProvider sdkDataProvider;

    @NotNull
    private final m submitChannel;

    @NotNull
    private final i submitFlow;

    @NotNull
    private final i viewFlow;

    /* JADX INFO: renamed from: com.adyen.checkout.cashapppay.internal.ui.StoredCashAppPayDelegate$initialize$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.cashapppay.internal.ui.StoredCashAppPayDelegate$initialize$1", f = "StoredCashAppPayDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/cashapppay/CashAppPayComponentState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.i implements Function2<CashAppPayComponentState, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = StoredCashAppPayDelegate.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CashAppPayComponentState cashAppPayComponentState, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(cashAppPayComponentState, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            StoredCashAppPayDelegate.this.onState((CashAppPayComponentState) this.L$0);
            return Unit.f26487a;
        }
    }

    public StoredCashAppPayDelegate(@NotNull AnalyticsManager analyticsManager, @NotNull PaymentObserverRepository paymentObserverRepository, @NotNull StoredPaymentMethod storedPaymentMethod, @Nullable OrderRequest orderRequest, @NotNull CashAppPayComponentParams cashAppPayComponentParams, @NotNull SdkDataProvider sdkDataProvider) {
        analyticsManager.getClass();
        paymentObserverRepository.getClass();
        storedPaymentMethod.getClass();
        cashAppPayComponentParams.getClass();
        sdkDataProvider.getClass();
        this.analyticsManager = analyticsManager;
        this.observerRepository = paymentObserverRepository;
        this.paymentMethod = storedPaymentMethod;
        this.order = orderRequest;
        this.componentParams = cashAppPayComponentParams;
        this.sdkDataProvider = sdkDataProvider;
        a2 a2VarC = r.c(createComponentState());
        this._componentStateFlow = a2VarC;
        this.componentStateFlow = a2VarC;
        a2 a2VarC2 = r.c(null);
        this._viewFlow = a2VarC2;
        this.viewFlow = a2VarC2;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.submitChannel = mVarBufferedChannel;
        this.submitFlow = r.w(mVarBufferedChannel);
    }

    private final CashAppPayComponentState createComponentState() {
        return new CashAppPayComponentState(new PaymentComponentData(new CashAppPayPaymentMethod(this.paymentMethod.getType(), this.analyticsManager.getCheckoutAttemptId(), SdkDataProvider.DefaultImpls.createEncodedSdkData$default(this.sdkDataProvider, null, 1, null), null, null, null, null, this.paymentMethod.getId(), 120, null), this.order, getComponentParams().getAmount(), null, null, null, null, null, null, null, null, null, null, null, 16376, null), true, true);
    }

    private final void initializeAnalytics(b0 coroutineScope) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = StoredCashAppPayDelegate.class.getName();
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
        if (type == null) {
            type = "";
        }
        this.analyticsManager.trackEvent(GenericEvents.rendered$default(genericEvents, type, Boolean.TRUE, null, null, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onState(CashAppPayComponentState componentState) {
        if (componentState.isValid()) {
            GenericEvents genericEvents = GenericEvents.INSTANCE;
            String type = this.paymentMethod.getType();
            if (type == null) {
                type = "";
            }
            this.analyticsManager.trackEvent(genericEvents.submit(type));
            this.submitChannel.h(componentState);
        }
    }

    @Override // com.adyen.checkout.cashapppay.internal.ui.CashAppPayDelegate
    @NotNull
    public i getComponentStateFlow() {
        return this.componentStateFlow;
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
        r.u(coroutineScope, new w(getComponentStateFlow(), new AnonymousClass1(null), 5));
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super PaymentComponentEvent<CashAppPayComponentState>, Unit> callback) {
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

    @Override // com.adyen.checkout.cashapppay.internal.ui.CashAppPayDelegate
    public void updateInputData(@NotNull Function1<? super CashAppPayInputData, Unit> update) {
        update.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.WARN;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = StoredCashAppPayDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "updateInputData should not be called for stored Cash App Pay", null);
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public CashAppPayComponentParams getComponentParams() {
        return this.componentParams;
    }
}
