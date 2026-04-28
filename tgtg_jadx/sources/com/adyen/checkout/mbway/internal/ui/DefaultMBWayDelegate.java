package com.adyen.checkout.mbway.internal.ui;

import androidx.lifecycle.LifecycleOwner;
import ba0.g;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.provider.SdkDataProvider;
import com.adyen.checkout.components.core.internal.ui.model.ButtonComponentParams;
import com.adyen.checkout.components.core.paymentmethod.MBWayPaymentMethod;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.mbway.MBWayComponentState;
import com.adyen.checkout.mbway.internal.ui.model.MBWayInputData;
import com.adyen.checkout.mbway.internal.ui.model.MBWayOutputData;
import com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.SubmitHandler;
import com.adyen.checkout.ui.core.internal.ui.model.CountryModel;
import com.adyen.checkout.ui.core.internal.util.CountryUtils;
import com.braze.h2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
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
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 j2\u00020\u0001:\u0001jBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001b\u0012\u0004\u0012\u00020\u00150\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020\u00152\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00150\u001aH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010,\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016¢\u0006\u0004\b/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0015H\u0016¢\u0006\u0004\b3\u0010 J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000204H\u0016¢\u0006\u0004\b7\u00106J\u0017\u00109\u001a\u00020\u00152\u0006\u00108\u001a\u000204H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0015H\u0016¢\u0006\u0004\b;\u0010 J\u0017\u0010<\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b<\u0010\u0017J\u000f\u0010=\u001a\u00020\u0015H\u0002¢\u0006\u0004\b=\u0010 J\u000f\u0010>\u001a\u00020(H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b@\u0010+J\u0019\u0010A\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\rH\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0FH\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010OR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010PR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010QR\u0014\u0010R\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020(0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR \u0010W\u001a\b\u0012\u0004\u0012\u00020(0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010HR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010VR \u0010[\u001a\b\u0012\u0004\u0012\u00020\r0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\b\\\u0010HR\u001c\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010VR\"\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010X\u001a\u0004\b`\u0010HR \u0010a\u001a\b\u0012\u0004\u0012\u00020\r0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010X\u001a\u0004\bb\u0010HR \u0010d\u001a\b\u0012\u0004\u0012\u00020c0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010X\u001a\u0004\be\u0010HR \u0010g\u001a\b\u0012\u0004\u0012\u00020f0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010X\u001a\u0004\bh\u0010HR\u0014\u0010)\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010?¨\u0006k"}, d2 = {"Lcom/adyen/checkout/mbway/internal/ui/DefaultMBWayDelegate;", "Lcom/adyen/checkout/mbway/internal/ui/MBWayDelegate;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "observerRepository", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/OrderRequest;", "order", "Lcom/adyen/checkout/components/core/internal/ui/model/ButtonComponentParams;", "componentParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/mbway/MBWayComponentState;", "submitHandler", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "sdkDataProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/components/core/internal/ui/model/ButtonComponentParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;)V", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "", "getPaymentMethodType", "()Ljava/lang/String;", "Lcom/adyen/checkout/mbway/internal/ui/model/MBWayInputData;", "update", "updateInputData", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/adyen/checkout/mbway/internal/ui/model/MBWayOutputData;", "outputData", "updateComponentState$mbway_release", "(Lcom/adyen/checkout/mbway/internal/ui/model/MBWayOutputData;)V", "updateComponentState", "", "Lcom/adyen/checkout/ui/core/internal/ui/model/CountryModel;", "getSupportedCountries", "()Ljava/util/List;", "getInitiallySelectedCountry", "()Lcom/adyen/checkout/ui/core/internal/ui/model/CountryModel;", "onSubmit", "", "isConfirmationRequired", "()Z", "shouldShowSubmitButton", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "onCleared", "initializeAnalytics", "onInputDataChanged", "createOutputData", "()Lcom/adyen/checkout/mbway/internal/ui/model/MBWayOutputData;", "outputDataChanged", "createComponentState", "(Lcom/adyen/checkout/mbway/internal/ui/model/MBWayOutputData;)Lcom/adyen/checkout/mbway/MBWayComponentState;", "componentState", "componentStateChanged", "(Lcom/adyen/checkout/mbway/MBWayComponentState;)V", "Ly80/i;", "getTrackedSubmitFlow", "()Ly80/i;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "Lcom/adyen/checkout/components/core/PaymentMethod;", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/internal/ui/model/ButtonComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/ButtonComponentParams;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "inputData", "Lcom/adyen/checkout/mbway/internal/ui/model/MBWayInputData;", "Ly80/f1;", "_outputDataFlow", "Ly80/f1;", "outputDataFlow", "Ly80/i;", "getOutputDataFlow", "_componentStateFlow", "componentStateFlow", "getComponentStateFlow", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "viewFlow", "getViewFlow", "submitFlow", "getSubmitFlow", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState;", "uiStateFlow", "getUiStateFlow", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent;", "uiEventFlow", "getUiEventFlow", "getOutputData", "Companion", "mbway_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultMBWayDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultMBWayDelegate.kt\ncom/adyen/checkout/mbway/internal/ui/DefaultMBWayDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,203:1\n16#2,17:204\n16#2,17:221\n295#3,2:238\n*S KotlinDebug\n*F\n+ 1 DefaultMBWayDelegate.kt\ncom/adyen/checkout/mbway/internal/ui/DefaultMBWayDelegate\n*L\n81#1:204,17\n117#1:221,17\n170#1:238,2\n*E\n"})
public final class DefaultMBWayDelegate implements MBWayDelegate {

    @NotNull
    private static final String ISO_CODE_PORTUGAL = "PT";

    @NotNull
    private static final String ISO_CODE_SPAIN = "ES";

    @NotNull
    private static final List<String> SUPPORTED_COUNTRIES = d0.h(ISO_CODE_PORTUGAL, ISO_CODE_SPAIN);

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
    private final MBWayInputData inputData;

    @NotNull
    private final PaymentObserverRepository observerRepository;

    @Nullable
    private final OrderRequest order;

    @NotNull
    private final i outputDataFlow;

    @NotNull
    private final PaymentMethod paymentMethod;

    @NotNull
    private final SdkDataProvider sdkDataProvider;

    @NotNull
    private final i submitFlow;

    @NotNull
    private final SubmitHandler<MBWayComponentState> submitHandler;

    @NotNull
    private final i uiEventFlow;

    @NotNull
    private final i uiStateFlow;

    @NotNull
    private final i viewFlow;

    /* JADX INFO: renamed from: com.adyen.checkout.mbway.internal.ui.DefaultMBWayDelegate$getTrackedSubmitFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.mbway.internal.ui.DefaultMBWayDelegate$getTrackedSubmitFlow$1", f = "DefaultMBWayDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/mbway/MBWayComponentState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.i implements Function2<MBWayComponentState, c<? super Unit>, Object> {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return DefaultMBWayDelegate.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull MBWayComponentState mBWayComponentState, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(mBWayComponentState, cVar)).invokeSuspend(Unit.f26487a);
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
            String type = DefaultMBWayDelegate.this.paymentMethod.getType();
            if (type == null) {
                type = "";
            }
            DefaultMBWayDelegate.this.analyticsManager.trackEvent(genericEvents.submit(type));
            return Unit.f26487a;
        }
    }

    public DefaultMBWayDelegate(@NotNull PaymentObserverRepository paymentObserverRepository, @NotNull PaymentMethod paymentMethod, @Nullable OrderRequest orderRequest, @NotNull ButtonComponentParams buttonComponentParams, @NotNull AnalyticsManager analyticsManager, @NotNull SubmitHandler<MBWayComponentState> submitHandler, @NotNull SdkDataProvider sdkDataProvider) {
        paymentObserverRepository.getClass();
        paymentMethod.getClass();
        buttonComponentParams.getClass();
        analyticsManager.getClass();
        submitHandler.getClass();
        sdkDataProvider.getClass();
        this.observerRepository = paymentObserverRepository;
        this.paymentMethod = paymentMethod;
        this.order = orderRequest;
        this.componentParams = buttonComponentParams;
        this.analyticsManager = analyticsManager;
        this.submitHandler = submitHandler;
        this.sdkDataProvider = sdkDataProvider;
        this.inputData = new MBWayInputData(null, null, 3, null);
        a2 a2VarC = r.c(createOutputData());
        this._outputDataFlow = a2VarC;
        this.outputDataFlow = a2VarC;
        a2 a2VarC2 = r.c(createComponentState$default(this, null, 1, null));
        this._componentStateFlow = a2VarC2;
        this.componentStateFlow = a2VarC2;
        a2 a2VarC3 = r.c(MbWayComponentViewType.INSTANCE);
        this._viewFlow = a2VarC3;
        this.viewFlow = a2VarC3;
        this.submitFlow = getTrackedSubmitFlow();
        this.uiStateFlow = submitHandler.getUiStateFlow();
        this.uiEventFlow = submitHandler.getUiEventFlow();
        updateComponentState$mbway_release(getOutputData());
    }

    private final void componentStateChanged(MBWayComponentState componentState) {
        ((a2) this._componentStateFlow).j(componentState);
    }

    private final MBWayComponentState createComponentState(MBWayOutputData outputData) {
        return new MBWayComponentState(new PaymentComponentData(new MBWayPaymentMethod("mbway", this.analyticsManager.getCheckoutAttemptId(), SdkDataProvider.DefaultImpls.createEncodedSdkData$default(this.sdkDataProvider, null, 1, null), outputData.getMobilePhoneNumberFieldState().getValue()), this.order, getComponentParams().getAmount(), null, null, null, null, null, null, null, null, null, null, null, 16376, null), outputData.getIsValid(), true);
    }

    public static /* synthetic */ MBWayComponentState createComponentState$default(DefaultMBWayDelegate defaultMBWayDelegate, MBWayOutputData mBWayOutputData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mBWayOutputData = defaultMBWayDelegate.getOutputData();
        }
        return defaultMBWayDelegate.createComponentState(mBWayOutputData);
    }

    private final MBWayOutputData createOutputData() {
        return new MBWayOutputData(k.l(this.inputData.getCountryCode(), StringsKt.h0(this.inputData.getLocalPhoneNumber(), '0')));
    }

    private final i getTrackedSubmitFlow() {
        return new w(this.submitHandler.getSubmitFlow(), new AnonymousClass1(null), 5);
    }

    private final void initializeAnalytics(b0 coroutineScope) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultMBWayDelegate.class.getName();
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
        this.analyticsManager.trackEvent(GenericEvents.rendered$default(genericEvents, type, null, null, null, 14, null));
    }

    private final void onInputDataChanged() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultMBWayDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onInputDataChanged", null);
        }
        MBWayOutputData mBWayOutputDataCreateOutputData = createOutputData();
        outputDataChanged(mBWayOutputDataCreateOutputData);
        updateComponentState$mbway_release(mBWayOutputDataCreateOutputData);
    }

    private final void outputDataChanged(MBWayOutputData outputData) {
        ((a2) this._outputDataFlow).j(outputData);
    }

    @Override // com.adyen.checkout.mbway.internal.ui.MBWayDelegate
    @NotNull
    public i getComponentStateFlow() {
        return this.componentStateFlow;
    }

    @Override // com.adyen.checkout.mbway.internal.ui.MBWayDelegate
    @Nullable
    public CountryModel getInitiallySelectedCountry() {
        Object next;
        List<CountryModel> supportedCountries = getSupportedCountries();
        Iterator<T> it = supportedCountries.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((CountryModel) next).getIsoCode(), ISO_CODE_PORTUGAL)) {
                break;
            }
        }
        CountryModel countryModel = (CountryModel) next;
        return countryModel == null ? (CountryModel) CollectionsKt.firstOrNull(supportedCountries) : countryModel;
    }

    @Override // com.adyen.checkout.mbway.internal.ui.MBWayDelegate
    @NotNull
    public MBWayOutputData getOutputData() {
        return (MBWayOutputData) ((a2) this._outputDataFlow).getValue();
    }

    @Override // com.adyen.checkout.mbway.internal.ui.MBWayDelegate
    @NotNull
    public i getOutputDataFlow() {
        return this.outputDataFlow;
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

    @Override // com.adyen.checkout.mbway.internal.ui.MBWayDelegate
    @NotNull
    public List<CountryModel> getSupportedCountries() {
        return CountryUtils.getLocalizedCountries$default(CountryUtils.INSTANCE, getComponentParams().getShopperLocale(), SUPPORTED_COUNTRIES, null, 4, null);
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
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super PaymentComponentEvent<MBWayComponentState>, Unit> callback) {
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
        this.submitHandler.onSubmit((MBWayComponentState) ((a2) this._componentStateFlow).getValue());
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void removeObserver() {
        this.observerRepository.removeObservers();
    }

    @Override // com.adyen.checkout.mbway.internal.ui.MBWayDelegate
    public void setInteractionBlocked(boolean isInteractionBlocked) {
        this.submitHandler.setInteractionBlocked(isInteractionBlocked);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean shouldShowSubmitButton() {
        return isConfirmationRequired() && getComponentParams().isSubmitButtonVisible();
    }

    public final void updateComponentState$mbway_release(@NotNull MBWayOutputData outputData) {
        outputData.getClass();
        componentStateChanged(createComponentState(outputData));
    }

    @Override // com.adyen.checkout.mbway.internal.ui.MBWayDelegate
    public void updateInputData(@NotNull Function1<? super MBWayInputData, Unit> update) {
        update.getClass();
        update.invoke(this.inputData);
        onInputDataChanged();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public ButtonComponentParams getComponentParams() {
        return this.componentParams;
    }
}
