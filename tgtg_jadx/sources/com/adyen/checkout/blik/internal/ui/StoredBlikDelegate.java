package com.adyen.checkout.blik.internal.ui;

import androidx.lifecycle.LifecycleOwner;
import ba0.g;
import com.adyen.checkout.blik.BlikComponentState;
import com.adyen.checkout.blik.internal.ui.model.BlikInputData;
import com.adyen.checkout.blik.internal.ui.model.BlikOutputData;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.provider.SdkDataProvider;
import com.adyen.checkout.components.core.internal.ui.model.ButtonComponentParams;
import com.adyen.checkout.components.core.paymentmethod.BlikPaymentMethod;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.SubmitHandler;
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
import y70.a;
import y80.a2;
import y80.f1;
import y80.i;
import y80.r;
import y80.w;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010\u0017J9\u0010&\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00132\u0018\u0010%\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0$\u0012\u0004\u0012\u00020\u00150#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\u00152\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00150#H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u0010)J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u000202H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00107\u001a\u00020\u00152\u0006\u00106\u001a\u000202H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0015H\u0016¢\u0006\u0004\b9\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010AR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001b0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010F\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\u001aR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\r0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010ER \u0010J\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010\u001aR\u001c\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010ER\"\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010\u001aR \u0010P\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010\u001aR \u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010G\u001a\u0004\bT\u0010\u001aR \u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010G\u001a\u0004\bW\u0010\u001aR\u0014\u0010Y\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u001d¨\u0006Z"}, d2 = {"Lcom/adyen/checkout/blik/internal/ui/StoredBlikDelegate;", "Lcom/adyen/checkout/blik/internal/ui/BlikDelegate;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "observerRepository", "Lcom/adyen/checkout/components/core/internal/ui/model/ButtonComponentParams;", "componentParams", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "storedPaymentMethod", "Lcom/adyen/checkout/components/core/OrderRequest;", "order", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/blik/BlikComponentState;", "submitHandler", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "sdkDataProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;Lcom/adyen/checkout/components/core/internal/ui/model/ButtonComponentParams;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;)V", "Lv80/b0;", "coroutineScope", "", "initializeAnalytics", "(Lv80/b0;)V", "Ly80/i;", "getTrackedSubmitFlow", "()Ly80/i;", "Lcom/adyen/checkout/blik/internal/ui/model/BlikOutputData;", "createOutputData", "()Lcom/adyen/checkout/blik/internal/ui/model/BlikOutputData;", "createComponentState", "()Lcom/adyen/checkout/blik/BlikComponentState;", "initialize", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "", "getPaymentMethodType", "()Ljava/lang/String;", "Lcom/adyen/checkout/blik/internal/ui/model/BlikInputData;", "update", "updateInputData", "(Lkotlin/jvm/functions/Function1;)V", "onSubmit", "", "isConfirmationRequired", "()Z", "shouldShowSubmitButton", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "onCleared", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "Lcom/adyen/checkout/components/core/internal/ui/model/ButtonComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/ButtonComponentParams;", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "Ly80/f1;", "_outputDataFlow", "Ly80/f1;", "outputDataFlow", "Ly80/i;", "getOutputDataFlow", "_componentStateFlow", "componentStateFlow", "getComponentStateFlow", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "viewFlow", "getViewFlow", "submitFlow", "getSubmitFlow", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState;", "uiStateFlow", "getUiStateFlow", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent;", "uiEventFlow", "getUiEventFlow", "getOutputData", "outputData", "blik_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStoredBlikDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoredBlikDelegate.kt\ncom/adyen/checkout/blik/internal/ui/StoredBlikDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,159:1\n16#2,17:160\n16#2,17:177\n*S KotlinDebug\n*F\n+ 1 StoredBlikDelegate.kt\ncom/adyen/checkout/blik/internal/ui/StoredBlikDelegate\n*L\n73#1:160,17\n107#1:177,17\n*E\n"})
public final class StoredBlikDelegate implements BlikDelegate {

    @NotNull
    private final f1 _componentStateFlow;

    @NotNull
    private final f1 _outputDataFlow;

    @NotNull
    private final f1 _viewFlow;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final ButtonComponentParams componentParams;

    @NotNull
    private final i componentStateFlow;

    @NotNull
    private final PaymentObserverRepository observerRepository;

    @Nullable
    private final OrderRequest order;

    @NotNull
    private final i outputDataFlow;

    @NotNull
    private final SdkDataProvider sdkDataProvider;

    @NotNull
    private final StoredPaymentMethod storedPaymentMethod;

    @NotNull
    private final i submitFlow;

    @NotNull
    private final SubmitHandler<BlikComponentState> submitHandler;

    @NotNull
    private final i uiEventFlow;

    @NotNull
    private final i uiStateFlow;

    @NotNull
    private final i viewFlow;

    /* JADX INFO: renamed from: com.adyen.checkout.blik.internal.ui.StoredBlikDelegate$getTrackedSubmitFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.blik.internal.ui.StoredBlikDelegate$getTrackedSubmitFlow$1", f = "StoredBlikDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/blik/BlikComponentState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.i implements Function2<BlikComponentState, c<? super Unit>, Object> {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return StoredBlikDelegate.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull BlikComponentState blikComponentState, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(blikComponentState, cVar)).invokeSuspend(Unit.f26487a);
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
            GenericEvents genericEvents = GenericEvents.INSTANCE;
            String type = StoredBlikDelegate.this.storedPaymentMethod.getType();
            if (type == null) {
                type = "";
            }
            StoredBlikDelegate.this.analyticsManager.trackEvent(genericEvents.submit(type));
            return Unit.f26487a;
        }
    }

    public StoredBlikDelegate(@NotNull PaymentObserverRepository paymentObserverRepository, @NotNull ButtonComponentParams buttonComponentParams, @NotNull StoredPaymentMethod storedPaymentMethod, @Nullable OrderRequest orderRequest, @NotNull AnalyticsManager analyticsManager, @NotNull SubmitHandler<BlikComponentState> submitHandler, @NotNull SdkDataProvider sdkDataProvider) {
        paymentObserverRepository.getClass();
        buttonComponentParams.getClass();
        storedPaymentMethod.getClass();
        analyticsManager.getClass();
        submitHandler.getClass();
        sdkDataProvider.getClass();
        this.observerRepository = paymentObserverRepository;
        this.componentParams = buttonComponentParams;
        this.storedPaymentMethod = storedPaymentMethod;
        this.order = orderRequest;
        this.analyticsManager = analyticsManager;
        this.submitHandler = submitHandler;
        this.sdkDataProvider = sdkDataProvider;
        a2 a2VarC = r.c(createOutputData());
        this._outputDataFlow = a2VarC;
        this.outputDataFlow = a2VarC;
        a2 a2VarC2 = r.c(createComponentState());
        this._componentStateFlow = a2VarC2;
        this.componentStateFlow = a2VarC2;
        a2 a2VarC3 = r.c(BlikComponentViewType.INSTANCE);
        this._viewFlow = a2VarC3;
        this.viewFlow = a2VarC3;
        this.submitFlow = getTrackedSubmitFlow();
        this.uiStateFlow = submitHandler.getUiStateFlow();
        this.uiEventFlow = submitHandler.getUiEventFlow();
    }

    private final BlikComponentState createComponentState() {
        return new BlikComponentState(new PaymentComponentData(new BlikPaymentMethod("blik", this.analyticsManager.getCheckoutAttemptId(), SdkDataProvider.DefaultImpls.createEncodedSdkData$default(this.sdkDataProvider, null, 1, null), null, this.storedPaymentMethod.getId(), 8, null), this.order, getComponentParams().getAmount(), null, null, null, null, null, null, null, null, null, null, null, 16376, null), true, true);
    }

    private final BlikOutputData createOutputData() {
        return new BlikOutputData("");
    }

    private final i getTrackedSubmitFlow() {
        return new w(this.submitHandler.getSubmitFlow(), new AnonymousClass1(null), 5);
    }

    private final void initializeAnalytics(b0 coroutineScope) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = StoredBlikDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "initializeAnalytics", null);
        }
        this.analyticsManager.initialize(this, coroutineScope);
        GenericEvents genericEvents = GenericEvents.INSTANCE;
        String type = this.storedPaymentMethod.getType();
        if (type == null) {
            type = "";
        }
        this.analyticsManager.trackEvent(GenericEvents.rendered$default(genericEvents, type, Boolean.TRUE, null, null, 12, null));
    }

    @Override // com.adyen.checkout.blik.internal.ui.BlikDelegate
    @NotNull
    public i getComponentStateFlow() {
        return this.componentStateFlow;
    }

    @Override // com.adyen.checkout.blik.internal.ui.BlikDelegate
    @NotNull
    public BlikOutputData getOutputData() {
        return (BlikOutputData) ((a2) this._outputDataFlow).getValue();
    }

    @Override // com.adyen.checkout.blik.internal.ui.BlikDelegate
    @NotNull
    public i getOutputDataFlow() {
        return this.outputDataFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    @NotNull
    public String getPaymentMethodType() {
        String type = this.storedPaymentMethod.getType();
        return type == null ? PaymentMethodTypes.UNKNOWN : type;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    @NotNull
    public i getSubmitFlow() {
        return this.submitFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.UIStateDelegate
    @NotNull
    public i getUiEventFlow() {
        return this.uiEventFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.UIStateDelegate
    @NotNull
    public i getUiStateFlow() {
        return this.uiStateFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate
    @NotNull
    public i getViewFlow() {
        return this.viewFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
        this.submitHandler.initialize(coroutineScope, getComponentStateFlow());
        initializeAnalytics(coroutineScope);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean isConfirmationRequired() {
        return ((a2) this._viewFlow).getValue() instanceof ButtonComponentViewType;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super PaymentComponentEvent<BlikComponentState>, Unit> callback) {
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

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public void onSubmit() {
        this.submitHandler.onSubmit((BlikComponentState) ((a2) this._componentStateFlow).getValue());
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void removeObserver() {
        this.observerRepository.removeObservers();
    }

    @Override // com.adyen.checkout.blik.internal.ui.BlikDelegate
    public void setInteractionBlocked(boolean isInteractionBlocked) {
        this.submitHandler.setInteractionBlocked(isInteractionBlocked);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean shouldShowSubmitButton() {
        return isConfirmationRequired() && getComponentParams().isSubmitButtonVisible();
    }

    @Override // com.adyen.checkout.blik.internal.ui.BlikDelegate
    public void updateInputData(@NotNull Function1<? super BlikInputData, Unit> update) {
        update.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = StoredBlikDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "updateInputData should not be called in StoredBlikDelegate", null);
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public ButtonComponentParams getComponentParams() {
        return this.componentParams;
    }
}
