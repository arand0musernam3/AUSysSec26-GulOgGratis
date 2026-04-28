package com.adyen.checkout.await.internal.ui;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import at.o;
import ba0.g;
import com.adyen.checkout.await.internal.ui.AwaitDelegate;
import com.adyen.checkout.await.internal.ui.model.AwaitOutputData;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.AwaitAction;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionObserverRepository;
import com.adyen.checkout.components.core.internal.PaymentDataRepository;
import com.adyen.checkout.components.core.internal.SavedStateHandleContainer;
import com.adyen.checkout.components.core.internal.SavedStateHandleProperty;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.data.api.StatusRepository;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.components.core.internal.ui.model.GenericComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.TimerData;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.components.core.internal.util.LifecycleExtensionsKt;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.ui.core.internal.RedirectHandler;
import com.braze.h2;
import e0.f;
import i4.a;
import j4.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import u70.q;
import v80.b0;
import v80.i1;
import x70.c;
import x80.m;
import y80.a2;
import y80.f1;
import y80.i;
import y80.r;
import y80.w;
import z70.e;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u0086\u00012\u00020\u00012\u00020\u0002:\u0002\u0086\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0015H\u0016¢\u0006\u0004\b+\u0010 J\u000f\u0010,\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010 J\u000f\u0010-\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010 J\u001f\u0010/\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020.2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u0002012\u0006\u0010\"\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020.2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b4\u00100J\u0017\u00105\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020.H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u00152\u0006\u00108\u001a\u0002072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b9\u0010:J%\u0010>\u001a\u00020\u00152\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b>\u0010?J!\u0010A\u001a\u00020\u00152\b\u0010@\u001a\u0004\u0018\u00010<2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010A\u001a\u00020CH\u0002¢\u0006\u0004\bA\u0010DJ\u0017\u0010E\u001a\u00020\u00152\u0006\u0010@\u001a\u00020<H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010J\u001a\u00020I2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020G2\u0006\u0010L\u001a\u000207H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00152\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00152\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0015H\u0002¢\u0006\u0004\bU\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010VR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010Z\u001a\u0004\b[\u0010\\R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010]R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010^R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010_R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010`R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020C0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR \u0010e\u001a\b\u0012\u0004\u0012\u00020C0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020I0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR \u0010l\u001a\b\u0012\u0004\u0012\u00020I0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010f\u001a\u0004\bm\u0010hR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020O0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010kR \u0010o\u001a\b\u0012\u0004\u0012\u00020O0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010f\u001a\u0004\bp\u0010hR\"\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010q0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010f\u001a\u0004\bs\u0010hR \u0010u\u001a\b\u0012\u0004\u0012\u00020t0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010f\u001a\u0004\bv\u0010hR\u0018\u0010w\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010z\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R1\u0010\"\u001a\u0004\u0018\u00010.2\b\u0010|\u001a\u0004\u0018\u00010.8B@BX\u0082\u008e\u0002¢\u0006\u0014\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0005\b\u0081\u0001\u00106R\u0016\u0010\u0083\u0001\u001a\u00020C8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010DR\u0016\u0010\u0014\u001a\u00020\u00138BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/adyen/checkout/await/internal/ui/DefaultAwaitDelegate;", "Lcom/adyen/checkout/await/internal/ui/AwaitDelegate;", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleContainer;", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "observerRepository", "Landroidx/lifecycle/c1;", "savedStateHandle", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "componentParams", "Lcom/adyen/checkout/ui/core/internal/RedirectHandler;", "redirectHandler", "Lcom/adyen/checkout/components/core/internal/data/api/StatusRepository;", "statusRepository", "Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;", "paymentDataRepository", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "<init>", "(Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;Landroidx/lifecycle/c1;Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;Lcom/adyen/checkout/ui/core/internal/RedirectHandler;Lcom/adyen/checkout/components/core/internal/data/api/StatusRepository;Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;)V", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "Landroid/app/Activity;", "activity", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "refreshStatus", "onCleared", "restoreState", "Lcom/adyen/checkout/components/core/action/AwaitAction;", "launchAction", "(Lcom/adyen/checkout/components/core/action/AwaitAction;Landroid/app/Activity;)V", "", "shouldLaunchRedirect", "(Lcom/adyen/checkout/components/core/action/AwaitAction;)Z", "makeRedirect", "initState", "(Lcom/adyen/checkout/components/core/action/AwaitAction;)V", "", "paymentData", "startStatusPolling", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/action/Action;)V", "Lu70/q;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "result", "onStatus", "(Ljava/lang/Object;Lcom/adyen/checkout/components/core/action/Action;)V", "statusResponse", "createOutputData", "(Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;Lcom/adyen/checkout/components/core/action/Action;)V", "Lcom/adyen/checkout/await/internal/ui/model/AwaitOutputData;", "()Lcom/adyen/checkout/await/internal/ui/model/AwaitOutputData;", "onPollingSuccessful", "(Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;)V", "Lorg/json/JSONObject;", ErrorBundle.DETAIL_ENTRY, "Lcom/adyen/checkout/components/core/ActionComponentData;", "createActionComponentData", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/ActionComponentData;", "payload", "createDetails", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "e", "emitError", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "emitDetails", "(Lorg/json/JSONObject;)V", "clearState", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "Landroidx/lifecycle/c1;", "getSavedStateHandle", "()Landroidx/lifecycle/c1;", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "Lcom/adyen/checkout/ui/core/internal/RedirectHandler;", "Lcom/adyen/checkout/components/core/internal/data/api/StatusRepository;", "Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Ly80/f1;", "_outputDataFlow", "Ly80/f1;", "Ly80/i;", "outputDataFlow", "Ly80/i;", "getOutputDataFlow", "()Ly80/i;", "Lx80/m;", "detailsChannel", "Lx80/m;", "detailsFlow", "getDetailsFlow", "exceptionChannel", "exceptionFlow", "getExceptionFlow", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "viewFlow", "getViewFlow", "Lcom/adyen/checkout/components/core/internal/ui/model/TimerData;", "timerFlow", "getTimerFlow", "_coroutineScope", "Lv80/b0;", "Lv80/i1;", "statusPollingJob", "Lv80/i1;", "<set-?>", "action$delegate", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleProperty;", "getAction", "()Lcom/adyen/checkout/components/core/action/AwaitAction;", "setAction", "getOutputData", "outputData", "getCoroutineScope", "()Lv80/b0;", "Companion", "await_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultAwaitDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAwaitDelegate.kt\ncom/adyen/checkout/await/internal/ui/DefaultAwaitDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n16#2,17:276\n16#2,17:294\n16#2,17:311\n16#2,17:328\n21#2,12:345\n1#3:293\n*S KotlinDebug\n*F\n+ 1 DefaultAwaitDelegate.kt\ncom/adyen/checkout/await/internal/ui/DefaultAwaitDelegate\n*L\n92#1:276,17\n148#1:294,17\n161#1:311,17\n183#1:328,17\n190#1:345,12\n*E\n"})
public final class DefaultAwaitDelegate implements AwaitDelegate, SavedStateHandleContainer {

    @NotNull
    public static final String ACTION_KEY = "ACTION_KEY";

    @NotNull
    public static final String PAYLOAD_DETAILS_KEY = "payload";

    @Nullable
    private b0 _coroutineScope;

    @NotNull
    private final f1 _outputDataFlow;

    /* JADX INFO: renamed from: action$delegate, reason: from kotlin metadata */
    @NotNull
    private final SavedStateHandleProperty action;

    @Nullable
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final GenericComponentParams componentParams;

    @NotNull
    private final m detailsChannel;

    @NotNull
    private final i detailsFlow;

    @NotNull
    private final m exceptionChannel;

    @NotNull
    private final i exceptionFlow;

    @NotNull
    private final ActionObserverRepository observerRepository;

    @NotNull
    private final i outputDataFlow;

    @NotNull
    private final PaymentDataRepository paymentDataRepository;

    @NotNull
    private final RedirectHandler redirectHandler;

    @NotNull
    private final c1 savedStateHandle;

    @Nullable
    private i1 statusPollingJob;

    @NotNull
    private final StatusRepository statusRepository;

    @NotNull
    private final i timerFlow;

    @NotNull
    private final i viewFlow;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {s.t(DefaultAwaitDelegate.class, "action", "getAction()Lcom/adyen/checkout/components/core/action/AwaitAction;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long DEFAULT_MAX_POLLING_DURATION = TimeConstants.FIFTEEN_MINUTES_DIFFERENCE;

    public DefaultAwaitDelegate(@NotNull ActionObserverRepository actionObserverRepository, @NotNull c1 c1Var, @NotNull GenericComponentParams genericComponentParams, @NotNull RedirectHandler redirectHandler, @NotNull StatusRepository statusRepository, @NotNull PaymentDataRepository paymentDataRepository, @Nullable AnalyticsManager analyticsManager) {
        actionObserverRepository.getClass();
        c1Var.getClass();
        genericComponentParams.getClass();
        redirectHandler.getClass();
        statusRepository.getClass();
        paymentDataRepository.getClass();
        this.observerRepository = actionObserverRepository;
        this.savedStateHandle = c1Var;
        this.componentParams = genericComponentParams;
        this.redirectHandler = redirectHandler;
        this.statusRepository = statusRepository;
        this.paymentDataRepository = paymentDataRepository;
        this.analyticsManager = analyticsManager;
        a2 a2VarC = r.c(createOutputData());
        this._outputDataFlow = a2VarC;
        this.outputDataFlow = a2VarC;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.detailsChannel = mVarBufferedChannel;
        this.detailsFlow = r.w(mVarBufferedChannel);
        m mVarBufferedChannel2 = ChannelExtensionsKt.bufferedChannel();
        this.exceptionChannel = mVarBufferedChannel2;
        this.exceptionFlow = r.w(mVarBufferedChannel2);
        this.viewFlow = r.c(AwaitComponentViewType.INSTANCE);
        this.timerFlow = new o(new TimerData[0], 6);
        this.action = new SavedStateHandleProperty("ACTION_KEY");
    }

    private final void clearState() {
        setAction(null);
    }

    private final ActionComponentData createActionComponentData(JSONObject details) {
        return new ActionComponentData(this.paymentDataRepository.getPaymentData(), details);
    }

    private final JSONObject createDetails(String payload) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("payload", payload);
            return jSONObject;
        } catch (JSONException e5) {
            emitError(new ComponentException("Failed to create details.", e5));
            return jSONObject;
        }
    }

    private final void createOutputData(StatusResponse statusResponse, Action action) {
        ((a2) this._outputDataFlow).j(new AwaitOutputData(statusResponse != null && StatusResponseUtils.INSTANCE.isFinalResult(statusResponse), action.getPaymentMethodType()));
    }

    private final void emitDetails(JSONObject details) {
        this.detailsChannel.h(createActionComponentData(details));
        clearState();
    }

    private final void emitError(CheckoutException e5) {
        this.exceptionChannel.h(e5);
        clearState();
    }

    private final AwaitAction getAction() {
        return (AwaitAction) this.action.getValue((SavedStateHandleContainer) this, $$delegatedProperties[0]);
    }

    private final b0 getCoroutineScope() {
        b0 b0Var = this._coroutineScope;
        if (b0Var != null) {
            return b0Var;
        }
        a.f("Required value was null.");
        return null;
    }

    private final void initState(AwaitAction action) {
        String paymentData = action.getPaymentData();
        if (paymentData != null) {
            createOutputData(null, action);
            if (shouldLaunchRedirect(action)) {
                return;
            }
            startStatusPolling(paymentData, action);
            return;
        }
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAwaitDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Payment data is null", null);
        }
        emitError(new ComponentException("Payment data is null", null, 2, null));
    }

    private final void launchAction(AwaitAction action, Activity activity) {
        if (shouldLaunchRedirect(action)) {
            makeRedirect(action, activity);
        }
    }

    private final void makeRedirect(AwaitAction action, Activity activity) {
        String url = action.getUrl();
        try {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultAwaitDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                String strConcat = "CO.".concat(name);
                companion.getLogger().log(adyenLogLevel, strConcat, "makeRedirect - " + url, null);
            }
            this.redirectHandler.launchUriRedirect(activity, url);
            String paymentData = this.paymentDataRepository.getPaymentData();
            if (paymentData == null) {
                throw new CheckoutException("Payment data should not be null", null, 2, null);
            }
            startStatusPolling(paymentData, action);
        } catch (CheckoutException e5) {
            emitError(e5);
        }
    }

    private final void onPollingSuccessful(StatusResponse statusResponse) {
        String payload = statusResponse.getPayload();
        if (!StatusResponseUtils.INSTANCE.isFinalResult(statusResponse) || payload == null || payload.length() == 0) {
            emitError(new ComponentException(f.k("Payment was not completed. - ", statusResponse.getResultCode()), null, 2, null));
        } else {
            emitDetails(createDetails(payload));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStatus(Object result, Action action) {
        Throwable thA = q.a(result);
        if (thA != null) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultAwaitDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Error while polling status", thA);
            }
            emitError(new ComponentException("Error while polling status", thA));
            return;
        }
        StatusResponse statusResponse = (StatusResponse) result;
        AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
        if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
            String name2 = DefaultAwaitDelegate.class.getName();
            String strY2 = StringsKt.Y(name2, '$');
            String strW2 = StringsKt.W('.', strY2, strY2);
            if (strW2.length() != 0) {
                name2 = StringsKt.O(strW2, "Kt");
            }
            companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), f.k("Status changed - ", statusResponse.getResultCode()), null);
        }
        createOutputData(statusResponse, action);
        if (StatusResponseUtils.INSTANCE.isFinalResult(statusResponse)) {
            onPollingSuccessful(statusResponse);
        }
    }

    private final void restoreState() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAwaitDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Restoring state", null);
        }
        AwaitAction action = getAction();
        if (action != null) {
            initState(action);
        }
    }

    private final void setAction(AwaitAction awaitAction) {
        this.action.setValue((SavedStateHandleContainer) this, $$delegatedProperties[0], awaitAction);
    }

    private final boolean shouldLaunchRedirect(AwaitAction action) {
        String url = action.getUrl();
        return !(url == null || url.length() == 0);
    }

    private final void startStatusPolling(String paymentData, Action action) {
        i1 i1Var = this.statusPollingJob;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.statusPollingJob = r.u(getCoroutineScope(), new w(this.statusRepository.poll(paymentData, DEFAULT_MAX_POLLING_DURATION), new C00661(action, null), 5));
    }

    @Override // com.adyen.checkout.components.core.internal.ui.DetailsEmittingDelegate
    @NotNull
    public i getDetailsFlow() {
        return this.detailsFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    @NotNull
    public i getExceptionFlow() {
        return this.exceptionFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ViewableDelegate
    @NotNull
    public AwaitOutputData getOutputData() {
        return (AwaitOutputData) ((a2) this._outputDataFlow).getValue();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ViewableDelegate
    @NotNull
    public i getOutputDataFlow() {
        return this.outputDataFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.SavedStateHandleContainer
    @NotNull
    public c1 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.StatusPollingDelegate
    @NotNull
    public i getTimerFlow() {
        return this.timerFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate
    @NotNull
    public i getViewFlow() {
        return this.viewFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void handleAction(@NotNull Action action, @NotNull Activity activity) {
        action.getClass();
        activity.getClass();
        if (!(action instanceof AwaitAction)) {
            emitError(new ComponentException("Unsupported action", null, 2, null));
            return;
        }
        AwaitAction awaitAction = (AwaitAction) action;
        setAction(awaitAction);
        this.paymentDataRepository.setPaymentData(action.getPaymentData());
        GenericEvents genericEvents = GenericEvents.INSTANCE;
        String paymentMethodType = action.getPaymentMethodType();
        String str = paymentMethodType == null ? "" : paymentMethodType;
        String type = action.getType();
        AnalyticsEvent.Log logAction$default = GenericEvents.action$default(genericEvents, str, type == null ? "" : type, null, 4, null);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.trackEvent(logAction$default);
        }
        launchAction(awaitAction, activity);
        initState(awaitAction);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
        this._coroutineScope = coroutineScope;
        restoreState();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super ActionComponentEvent, Unit> callback) {
        lifecycleOwner.getClass();
        coroutineScope.getClass();
        callback.getClass();
        this.observerRepository.addObservers(getDetailsFlow(), getExceptionFlow(), null, lifecycleOwner, coroutineScope, callback);
        LifecycleExtensionsKt.repeatOnResume(lifecycleOwner, new Function0<Unit>() { // from class: com.adyen.checkout.await.internal.ui.DefaultAwaitDelegate.observe.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m74invoke();
                return Unit.f26487a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m74invoke() {
                DefaultAwaitDelegate.this.refreshStatus();
            }
        });
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void onCleared() {
        removeObserver();
        i1 i1Var = this.statusPollingJob;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.statusPollingJob = null;
        this._coroutineScope = null;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void onError(@NotNull CheckoutException checkoutException) {
        AwaitDelegate.DefaultImpls.onError(this, checkoutException);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.StatusPollingDelegate
    public void refreshStatus() {
        String paymentData = this.paymentDataRepository.getPaymentData();
        if (paymentData == null) {
            return;
        }
        this.statusRepository.refreshStatus(paymentData);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void removeObserver() {
        this.observerRepository.removeObservers();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.RedirectableDelegate
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        this.redirectHandler.setOnRedirectListener(listener);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/await/internal/ui/DefaultAwaitDelegate$Companion;", "", "()V", "ACTION_KEY", "", "getACTION_KEY$await_release$annotations", "DEFAULT_MAX_POLLING_DURATION", "", "PAYLOAD_DETAILS_KEY", "getPAYLOAD_DETAILS_KEY$await_release$annotations", "await_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getACTION_KEY$await_release$annotations() {
        }

        public static /* synthetic */ void getPAYLOAD_DETAILS_KEY$await_release$annotations() {
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public GenericComponentParams getComponentParams() {
        return this.componentParams;
    }

    /* JADX INFO: renamed from: com.adyen.checkout.await.internal.ui.DefaultAwaitDelegate$startStatusPolling$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.await.internal.ui.DefaultAwaitDelegate$startStatusPolling$1", f = "DefaultAwaitDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu70/q;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "it", "", "<anonymous>", "(Lu70/q;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C00661 extends z70.i implements Function2<q<? extends StatusResponse>, c<? super Unit>, Object> {
        final /* synthetic */ Action $action;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00661(Action action, c<? super C00661> cVar) {
            super(2, cVar);
            this.$action = action;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00661 c00661 = DefaultAwaitDelegate.this.new C00661(this.$action, cVar);
            c00661.L$0 = obj;
            return c00661;
        }

        @Nullable
        public final Object invoke(@NotNull Object obj, @Nullable c<? super Unit> cVar) {
            return ((C00661) create(new q(obj), cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            DefaultAwaitDelegate.this.onStatus(((q) this.L$0).f40851a, this.$action);
            return Unit.f26487a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((q) obj).f40851a, (c<? super Unit>) obj2);
        }
    }

    private final AwaitOutputData createOutputData() {
        return new AwaitOutputData(false, null);
    }
}
