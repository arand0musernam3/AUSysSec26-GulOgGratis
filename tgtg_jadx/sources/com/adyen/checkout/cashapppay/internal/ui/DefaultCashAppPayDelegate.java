package com.adyen.checkout.cashapppay.internal.ui;

import a60.h0;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import app.cash.paykit.core.exceptions.CashAppPayIntegrationException;
import app.cash.paykit.core.models.analytics.EventStream2Event;
import app.cash.paykit.core.models.analytics.payloads.AnalyticsEventListenerPayload;
import app.cash.paykit.core.models.response.AuthFlowTriggers;
import app.cash.paykit.core.models.response.CustomerProfile;
import app.cash.paykit.core.models.response.CustomerResponseData;
import app.cash.paykit.core.models.response.Grant;
import app.cash.paykit.core.models.response.GrantType;
import app.cash.paykit.core.models.sdk.CashAppPayCurrency;
import app.cash.paykit.core.utils.ThreadPurpose;
import ba0.g;
import com.adyen.checkout.cashapppay.CashAppPayComponentState;
import com.adyen.checkout.cashapppay.CashAppPayEnvironment;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayAuthorizationData;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayComponentParams;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayInputData;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayOnFileData;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayOneTimeData;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayOutputData;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.adyen.checkout.components.core.internal.analytics.ErrorEvent;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.provider.SdkDataProvider;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.components.core.paymentmethod.CashAppPayPaymentMethod;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.DispatcherProvider;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.SubmitHandler;
import com.braze.h2;
import cz.j;
import e0.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import x70.c;
import x80.m;
import y80.a2;
import y80.f1;
import y80.i;
import y80.r;
import y80.w;
import yb.a;
import yb.b;
import yb.d;
import yb.h;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BY\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010#\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050!\u0012\u0004\u0012\u00020\u001b0 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u00020\u001b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001b0 H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010/\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010&J\u0017\u00103\u001a\u00020\u001b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u000205H\u0016¢\u0006\u0004\b8\u00107J\u0017\u0010<\u001a\u00020\u001b2\u0006\u00109\u001a\u000205H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u0010&J\u000f\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bD\u0010\u001dJ\u000f\u0010E\u001a\u00020\u001bH\u0002¢\u0006\u0004\bE\u0010&J\u000f\u0010F\u001a\u00020+H\u0002¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00050JH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u001bH\u0002¢\u0006\u0004\bM\u0010&J\u0011\u0010O\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0004\bO\u0010PJ\u0019\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010W\u001a\u00020V2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u001bH\u0002¢\u0006\u0004\bY\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010ZR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010[R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\\R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010]R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010^R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010bR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010cR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010dR\u0014\u0010e\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010gR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00050h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR \u0010k\u001a\b\u0012\u0004\u0012\u00020\u00050J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010LR\u001c\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010n0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010jR\"\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010n0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010l\u001a\u0004\bq\u0010LR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001d\u0010v\u001a\b\u0012\u0004\u0012\u00020s0J8\u0006¢\u0006\f\n\u0004\bv\u0010l\u001a\u0004\bw\u0010LR \u0010x\u001a\b\u0012\u0004\u0012\u00020\u00050J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010l\u001a\u0004\by\u0010LR\u0018\u0010z\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010\u001a\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007f¨\u0006\u0080\u0001"}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/ui/DefaultCashAppPayDelegate;", "Lcom/adyen/checkout/cashapppay/internal/ui/CashAppPayDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/ButtonDelegate;", "Lyb/d;", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/cashapppay/CashAppPayComponentState;", "submitHandler", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "observerRepository", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/OrderRequest;", "order", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;", "componentParams", "Lyb/b;", "cashAppPayFactory", "Lv80/x;", "coroutineDispatcher", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "sdkDataProvider", "<init>", "(Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;Lyb/b;Lv80/x;Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;)V", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayInputData;", "update", "updateInputData", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOutputData;", "outputData", "updateComponentState$cashapppay_release", "(Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOutputData;)V", "updateComponentState", "onSubmit", "Lyb/j;", "newState", "cashAppPayStateDidChange", "(Lyb/j;)V", "", "isConfirmationRequired", "()Z", "shouldShowSubmitButton", "isInteractionBlocked", "setInteractionBlocked$cashapppay_release", "(Z)V", "setInteractionBlocked", "", "getPaymentMethodType", "()Ljava/lang/String;", "onCleared", "Lyb/a;", "initCashAppPay", "()Lyb/a;", "initializeAnalytics", "onInputDataChanged", "createOutputData", "()Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOutputData;", "createComponentState", "(Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOutputData;)Lcom/adyen/checkout/cashapppay/CashAppPayComponentState;", "Ly80/i;", "getTrackedSubmitFlow", "()Ly80/i;", "initiatePayment", "Lhc/b;", "getOneTimeAction", "()Lhc/b;", "Lhc/a;", "getOnFileAction", "(Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOutputData;)Lhc/a;", "Lapp/cash/paykit/core/models/response/CustomerResponseData;", "customerResponseData", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayAuthorizationData;", "createAuthorizationData", "(Lapp/cash/paykit/core/models/response/CustomerResponseData;)Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayAuthorizationData;", "trackThirdPartyErrorEvent", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "Lcom/adyen/checkout/components/core/PaymentMethod;", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;", "Lyb/b;", "Lv80/x;", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "inputData", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayInputData;", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOutputData;", "Ly80/f1;", "_componentStateFlow", "Ly80/f1;", "componentStateFlow", "Ly80/i;", "getComponentStateFlow", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "viewFlow", "getViewFlow", "Lx80/m;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "exceptionChannel", "Lx80/m;", "exceptionFlow", "getExceptionFlow", "submitFlow", "getSubmitFlow", "_coroutineScope", "Lv80/b0;", "cashAppPay", "Lyb/a;", "getCoroutineScope", "()Lv80/b0;", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultCashAppPayDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCashAppPayDelegate.kt\ncom/adyen/checkout/cashapppay/internal/ui/DefaultCashAppPayDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n16#2,17:353\n16#2,17:370\n16#2,17:387\n16#2,17:404\n16#2,17:421\n1#3:438\n*S KotlinDebug\n*F\n+ 1 DefaultCashAppPayDelegate.kt\ncom/adyen/checkout/cashapppay/internal/ui/DefaultCashAppPayDelegate\n*L\n119#1:353,17\n164#1:370,17\n274#1:387,17\n281#1:404,17\n290#1:421,17\n*E\n"})
public final class DefaultCashAppPayDelegate implements CashAppPayDelegate, ButtonDelegate, d {

    @NotNull
    private final f1 _componentStateFlow;

    @Nullable
    private b0 _coroutineScope;

    @NotNull
    private final f1 _viewFlow;

    @NotNull
    private final AnalyticsManager analyticsManager;
    private a cashAppPay;

    @NotNull
    private final b cashAppPayFactory;

    @NotNull
    private final CashAppPayComponentParams componentParams;

    @NotNull
    private final i componentStateFlow;

    @NotNull
    private final x coroutineDispatcher;

    @NotNull
    private final m exceptionChannel;

    @NotNull
    private final i exceptionFlow;

    @NotNull
    private final CashAppPayInputData inputData;

    @NotNull
    private final PaymentObserverRepository observerRepository;

    @Nullable
    private final OrderRequest order;

    @NotNull
    private CashAppPayOutputData outputData;

    @NotNull
    private final PaymentMethod paymentMethod;

    @NotNull
    private final SdkDataProvider sdkDataProvider;

    @NotNull
    private final i submitFlow;

    @NotNull
    private final SubmitHandler<CashAppPayComponentState> submitHandler;

    @NotNull
    private final i viewFlow;

    /* JADX INFO: renamed from: com.adyen.checkout.cashapppay.internal.ui.DefaultCashAppPayDelegate$getTrackedSubmitFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.cashapppay.internal.ui.DefaultCashAppPayDelegate$getTrackedSubmitFlow$1", f = "DefaultCashAppPayDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/cashapppay/CashAppPayComponentState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.i implements Function2<CashAppPayComponentState, c<? super Unit>, Object> {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return DefaultCashAppPayDelegate.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CashAppPayComponentState cashAppPayComponentState, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(cashAppPayComponentState, cVar)).invokeSuspend(Unit.f26487a);
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
            GenericEvents genericEvents = GenericEvents.INSTANCE;
            String type = DefaultCashAppPayDelegate.this.paymentMethod.getType();
            if (type == null) {
                type = "";
            }
            DefaultCashAppPayDelegate.this.analyticsManager.trackEvent(genericEvents.submit(type));
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.cashapppay.internal.ui.DefaultCashAppPayDelegate$initiatePayment$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.cashapppay.internal.ui.DefaultCashAppPayDelegate$initiatePayment$1", f = "DefaultCashAppPayDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C00831 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ List<hc.c> $actions;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C00831(List<? extends hc.c> list, c<? super C00831> cVar) {
            super(2, cVar);
            this.$actions = list;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return DefaultCashAppPayDelegate.this.new C00831(this.$actions, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((C00831) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0347, code lost:
        
            r4 = new ec.b(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x034d, code lost:
        
            r4 = new ec.a(new java.io.IOException("Failed to deserialize response data."));
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x035a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x035c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x035e, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0360, code lost:
        
            r4 = new ec.a(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x0366, code lost:
        
            r4 = new ec.a(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x036c, code lost:
        
            r4 = new ec.a(new app.cash.paykit.core.exceptions.CashAppPayConnectivityNetworkException(r0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x03bb, code lost:
        
            r4.getClass();
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x03c2, code lost:
        
            r0 = a60.h0.a(r10, kotlin.jvm.internal.Reflection.typeOf(app.cash.paykit.core.models.response.CustomerTopLevelResponse.class)).b(r4.p());
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x03d0, code lost:
        
            if (r0 == null) goto L127;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x03d2, code lost:
        
            r4 = new ec.b(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x03d8, code lost:
        
            r4 = new ec.a(new java.io.IOException("Failed to deserialize response data."));
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x03e5, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x03e7, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x03e9, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x03eb, code lost:
        
            r4 = new ec.a(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x03f1, code lost:
        
            r4 = new ec.a(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x0401, code lost:
        
            r4 = new ec.a(new app.cash.paykit.core.exceptions.CashAppPayConnectivityNetworkException(r0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0327, code lost:
        
            r0 = r3.f36597q;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0329, code lost:
        
            r4 = r3.f36588g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x032b, code lost:
        
            if (r0 != false) goto L123;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x032d, code lost:
        
            if (r4 == null) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x032f, code lost:
        
            r0 = r4.p();
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0333, code lost:
        
            if (r0 != null) goto L176;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0335, code lost:
        
            r0 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0337, code lost:
        
            r0 = a60.h0.a(r10, kotlin.jvm.internal.Reflection.typeOf(app.cash.paykit.core.models.response.ApiErrorResponse.class)).b(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0345, code lost:
        
            if (r0 == null) goto L101;
         */
        /* JADX WARN: Removed duplicated region for block: B:153:0x0439  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x0447  */
        @Override // z70.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r54) throws app.cash.paykit.core.exceptions.CashAppPayIntegrationException {
            /*
                Method dump skipped, instruction units count: 1234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.cashapppay.internal.ui.DefaultCashAppPayDelegate.C00831.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public DefaultCashAppPayDelegate(@NotNull SubmitHandler<CashAppPayComponentState> submitHandler, @NotNull AnalyticsManager analyticsManager, @NotNull PaymentObserverRepository paymentObserverRepository, @NotNull PaymentMethod paymentMethod, @Nullable OrderRequest orderRequest, @NotNull CashAppPayComponentParams cashAppPayComponentParams, @NotNull b bVar, @NotNull x xVar, @NotNull SdkDataProvider sdkDataProvider) {
        submitHandler.getClass();
        analyticsManager.getClass();
        paymentObserverRepository.getClass();
        paymentMethod.getClass();
        cashAppPayComponentParams.getClass();
        bVar.getClass();
        xVar.getClass();
        sdkDataProvider.getClass();
        this.submitHandler = submitHandler;
        this.analyticsManager = analyticsManager;
        this.observerRepository = paymentObserverRepository;
        this.paymentMethod = paymentMethod;
        this.order = orderRequest;
        this.componentParams = cashAppPayComponentParams;
        this.cashAppPayFactory = bVar;
        this.coroutineDispatcher = xVar;
        this.sdkDataProvider = sdkDataProvider;
        this.inputData = new CashAppPayInputData(false, null, 3, null);
        this.outputData = createOutputData();
        a2 a2VarC = r.c(createComponentState$default(this, null, 1, null));
        this._componentStateFlow = a2VarC;
        this.componentStateFlow = a2VarC;
        a2 a2VarC2 = r.c(CashAppPayComponentViewType.INSTANCE);
        this._viewFlow = a2VarC2;
        this.viewFlow = a2VarC2;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.exceptionChannel = mVarBufferedChannel;
        this.exceptionFlow = r.w(mVarBufferedChannel);
        this.submitFlow = getTrackedSubmitFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CashAppPayAuthorizationData createAuthorizationData(CustomerResponseData customerResponseData) {
        CashAppPayOnFileData cashAppPayOnFileData;
        Object next;
        Object next2;
        fc.a aVar;
        Iterable iterable = customerResponseData.l;
        if (iterable == null) {
            iterable = n0.f26529a;
        }
        Iterator it = iterable.iterator();
        while (true) {
            cashAppPayOnFileData = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Grant) next).f4711c == GrantType.ONE_TIME) {
                break;
            }
        }
        Grant grant = (Grant) next;
        CashAppPayOneTimeData cashAppPayOneTimeData = grant != null ? new CashAppPayOneTimeData(grant.f4709a, grant.f4714f) : null;
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((Grant) next2).f4711c == GrantType.EXTENDED) {
                break;
            }
        }
        Grant grant2 = (Grant) next2;
        if (grant2 != null) {
            String str = grant2.f4709a;
            CustomerProfile customerProfile = customerResponseData.f4694k;
            cashAppPayOnFileData = new CashAppPayOnFileData(str, (customerProfile == null || (aVar = customerProfile.f4680b) == null) ? null : aVar.f17545a, customerProfile != null ? customerProfile.f4679a : null);
        }
        return new CashAppPayAuthorizationData(cashAppPayOneTimeData, cashAppPayOnFileData);
    }

    private final CashAppPayComponentState createComponentState(CashAppPayOutputData outputData) {
        String str;
        CashAppPayAuthorizationData authorizationData = outputData.getAuthorizationData();
        CashAppPayOneTimeData oneTimeData = authorizationData != null ? authorizationData.getOneTimeData() : null;
        CashAppPayAuthorizationData authorizationData2 = outputData.getAuthorizationData();
        CashAppPayOnFileData onFileData = authorizationData2 != null ? authorizationData2.getOnFileData() : null;
        String type = this.paymentMethod.getType();
        String checkoutAttemptId = this.analyticsManager.getCheckoutAttemptId();
        String strCreateEncodedSdkData$default = SdkDataProvider.DefaultImpls.createEncodedSdkData$default(this.sdkDataProvider, null, 1, null);
        String grantId = oneTimeData != null ? oneTimeData.getGrantId() : null;
        if (onFileData != null && (customerId = onFileData.getCustomerId()) != null) {
            str = customerId;
        } else if (oneTimeData != null) {
            String customerId = oneTimeData.getCustomerId();
            str = customerId;
        } else {
            str = null;
        }
        return new CashAppPayComponentState(new PaymentComponentData(new CashAppPayPaymentMethod(type, checkoutAttemptId, strCreateEncodedSdkData$default, grantId, onFileData != null ? onFileData.getGrantId() : null, str, onFileData != null ? onFileData.getCashTag() : null, null, 128, null), this.order, getComponentParams().getAmount(), Boolean.valueOf(onFileData != null), null, null, null, null, null, null, null, null, null, null, 16368, null), outputData.getIsValid(), true);
    }

    public static /* synthetic */ CashAppPayComponentState createComponentState$default(DefaultCashAppPayDelegate defaultCashAppPayDelegate, CashAppPayOutputData cashAppPayOutputData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cashAppPayOutputData = defaultCashAppPayDelegate.outputData;
        }
        return defaultCashAppPayDelegate.createComponentState(cashAppPayOutputData);
    }

    private final CashAppPayOutputData createOutputData() {
        return new CashAppPayOutputData(this.inputData.isStorePaymentSelected(), this.inputData.getAuthorizationData());
    }

    private final b0 getCoroutineScope() {
        b0 b0Var = this._coroutineScope;
        if (b0Var != null) {
            return b0Var;
        }
        i4.a.f("Required value was null.");
        return null;
    }

    private final hc.a getOnFileAction(CashAppPayOutputData outputData) {
        if (!(getComponentParams().getShowStorePaymentField() && outputData.isStorePaymentSelected()) && (getComponentParams().getShowStorePaymentField() || !getComponentParams().getStorePaymentMethod())) {
            return null;
        }
        return new hc.a(getComponentParams().getScopeId());
    }

    private final hc.b getOneTimeAction() {
        Amount amount = getComponentParams().getAmount();
        if ((amount != null ? Long.valueOf(amount.getValue()) : null) != null && amount.getValue() != 0) {
            if (Intrinsics.areEqual(amount.getCurrency(), "USD")) {
                return new hc.b(CashAppPayCurrency.USD, Integer.valueOf((int) amount.getValue()), getComponentParams().getScopeId());
            }
            this.exceptionChannel.h(new ComponentException(f.k("Unsupported currency: ", amount.getCurrency()), null, 2, null));
        }
        return null;
    }

    private final i getTrackedSubmitFlow() {
        return new w(this.submitHandler.getSubmitFlow(), new AnonymousClass1(null), 5);
    }

    private final a initCashAppPay() {
        cc.c cVar;
        CashAppPayEnvironment cashAppPayEnvironment = getComponentParams().getCashAppPayEnvironment();
        CashAppPayEnvironment cashAppPayEnvironment2 = CashAppPayEnvironment.SANDBOX;
        b bVar = this.cashAppPayFactory;
        if (cashAppPayEnvironment == cashAppPayEnvironment2) {
            String strRequireClientId = getComponentParams().requireClientId();
            bVar.getClass();
            strRequireClientId.getClass();
            cc.g gVar = new cc.g(b.f45807e, b.f45809g, b.c(), b.f45805c);
            jb.b bVar2 = b.f45806d;
            j jVarB = b.b(strRequireClientId, gVar, b.a(true, bVar2), b.f45813k);
            gVar.f7910f = jVarB;
            cVar = new cc.c(strRequireClientId, gVar, jVarB, b.f45804b, true, bVar2);
        } else {
            String strRequireClientId2 = getComponentParams().requireClientId();
            bVar.getClass();
            strRequireClientId2.getClass();
            cc.g gVar2 = new cc.g(b.f45808f, b.f45809g, b.c(), b.f45805c);
            jb.b bVar3 = b.f45806d;
            j jVarB2 = b.b(strRequireClientId2, gVar2, b.a(false, bVar3), b.f45812j);
            gVar2.f7910f = jVarB2;
            cVar = new cc.c(strRequireClientId2, gVar2, jVarB2, b.f45804b, false, bVar3);
        }
        cVar.f7896h = this;
        j jVar = cVar.f7891c;
        String strD = h0.a((a60.b0) jVar.f13637g, Reflection.typeOf(AnalyticsEventListenerPayload.class)).d(new AnalyticsEventListenerPayload((String) jVar.f13631a, (String) jVar.f13633c, AnalyticsPlatformParams.channel, (String) jVar.f13632b, (String) jVar.f13634d, true));
        ((n20.f) jVar.f13638h).getClass();
        String strQ = n20.f.q();
        ((r40.d) jVar.f13639i).getClass();
        String strD2 = h0.a((a60.b0) jVar.f13637g, Reflection.typeOf(EventStream2Event.class)).d(new EventStream2Event("paykitsdk-android", "mobile_cap_pk_event_listener", strD, r40.d.l(), strQ));
        j jVar2 = (j) jVar.f13635e;
        synchronized (jVar2) {
            jVar2.m(strD2);
        }
        return cVar;
    }

    private final void initializeAnalytics(b0 coroutineScope) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultCashAppPayDelegate.class.getName();
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

    private final void initiatePayment() {
        ArrayList arrayListW = y.w(new hc.c[]{getOneTimeAction(), getOnFileAction(this.outputData)});
        if (arrayListW.isEmpty()) {
            this.exceptionChannel.h(new ComponentException("Cannot launch Cash App Pay, you need to either pass an amount with supported currency or store the shopper account.", null, 2, null));
        } else {
            ((a2) this._viewFlow).j(PaymentInProgressViewType.INSTANCE);
            f0.B(getCoroutineScope(), this.coroutineDispatcher, null, new C00831(arrayListW, null), 2);
        }
    }

    private final void onInputDataChanged() {
        CashAppPayOutputData cashAppPayOutputDataCreateOutputData = createOutputData();
        this.outputData = cashAppPayOutputDataCreateOutputData;
        updateComponentState$cashapppay_release(cashAppPayOutputDataCreateOutputData);
    }

    private final void trackThirdPartyErrorEvent() {
        this.analyticsManager.trackEvent(GenericEvents.error$default(GenericEvents.INSTANCE, getPaymentMethodType(), ErrorEvent.THIRD_PARTY, null, null, 12, null));
    }

    @Override // yb.d
    public void cashAppPayStateDidChange(@NotNull final yb.j newState) throws CashAppPayIntegrationException {
        g90.b bVar;
        newState.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        a aVar = null;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultCashAppPayDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), f.k("CashAppPayState state changed: ", Reflection.getOrCreateKotlinClass(newState.getClass()).getSimpleName()), null);
        }
        if (newState instanceof yb.i) {
            a aVar2 = this.cashAppPay;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cashAppPay");
            } else {
                aVar = aVar2;
            }
            cc.c cVar = (cc.c) aVar;
            CustomerResponseData customerResponseData = cVar.f7897i;
            jb.b bVar2 = cVar.f7894f;
            if (customerResponseData == null) {
                CashAppPayIntegrationException cashAppPayIntegrationException = new CashAppPayIntegrationException("Can't call authorizeCustomerRequest user before calling `createCustomerRequest`. Alternatively provide your own customerData");
                bVar2.r("CashAppPay", "No customer data found when attempting to authorize.", cashAppPayIntegrationException);
                if (cVar.f7893e) {
                    throw cashAppPayIntegrationException;
                }
                return;
            }
            g90.b bVarB = g90.b.Companion.b();
            AuthFlowTriggers authFlowTriggers = customerResponseData.f4685b;
            if (authFlowTriggers != null && (bVar = authFlowTriggers.f4675d) != null) {
                bVarB.getClass();
                if (bVarB.f20262a.compareTo(bVar.f20262a) > 0) {
                    bVar2.s("CashAppPay", "Auth token expired when attempting to authenticate, refreshing before proceeding.");
                    cVar.b();
                    return;
                }
            }
            cVar.a(customerResponseData);
            return;
        }
        if (newState instanceof yb.e) {
            AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.INFO;
            if (companion.getLogger().shouldLog(adyenLogLevel2)) {
                String name2 = DefaultCashAppPayDelegate.class.getName();
                String strY2 = StringsKt.Y(name2, '$');
                String strW2 = StringsKt.W('.', strY2, strY2);
                if (strW2.length() != 0) {
                    name2 = StringsKt.O(strW2, "Kt");
                }
                companion.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Cash App Pay authorization request approved", null);
            }
            updateInputData(new Function1<CashAppPayInputData, Unit>() { // from class: com.adyen.checkout.cashapppay.internal.ui.DefaultCashAppPayDelegate.cashAppPayStateDidChange.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(@NotNull CashAppPayInputData cashAppPayInputData) {
                    cashAppPayInputData.getClass();
                    cashAppPayInputData.setAuthorizationData(DefaultCashAppPayDelegate.this.createAuthorizationData(((yb.e) newState).f45814a));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((CashAppPayInputData) obj);
                    return Unit.f26487a;
                }
            });
            this.submitHandler.onSubmit((PaymentComponentState) ((a2) this._componentStateFlow).getValue());
            return;
        }
        if (!Intrinsics.areEqual(newState, h.f45818b)) {
            if (newState instanceof yb.g) {
                trackThirdPartyErrorEvent();
                this.exceptionChannel.h(new ComponentException("Cash App Pay has encountered an error", ((yb.g) newState).f45816a));
                return;
            }
            return;
        }
        AdyenLogLevel adyenLogLevel3 = AdyenLogLevel.INFO;
        if (companion.getLogger().shouldLog(adyenLogLevel3)) {
            String name3 = DefaultCashAppPayDelegate.class.getName();
            String strY3 = StringsKt.Y(name3, '$');
            String strW3 = StringsKt.W('.', strY3, strY3);
            if (strW3.length() != 0) {
                name3 = StringsKt.O(strW3, "Kt");
            }
            companion.getLogger().log(adyenLogLevel3, "CO.".concat(name3), "Cash App Pay authorization request declined", null);
        }
        this.exceptionChannel.h(new ComponentException("Cash App Pay authorization request declined", null, 2, null));
    }

    @Override // com.adyen.checkout.cashapppay.internal.ui.CashAppPayDelegate
    @NotNull
    public i getComponentStateFlow() {
        return this.componentStateFlow;
    }

    @NotNull
    public final i getExceptionFlow() {
        return this.exceptionFlow;
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
        this._coroutineScope = coroutineScope;
        this.submitHandler.initialize(coroutineScope, getComponentStateFlow());
        this.cashAppPay = initCashAppPay();
        initializeAnalytics(coroutineScope);
        if (isConfirmationRequired()) {
            return;
        }
        initiatePayment();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean isConfirmationRequired() {
        return (((a2) this._viewFlow).getValue() instanceof ButtonComponentViewType) && getComponentParams().getShowStorePaymentField();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super PaymentComponentEvent<CashAppPayComponentState>, Unit> callback) {
        lifecycleOwner.getClass();
        coroutineScope.getClass();
        callback.getClass();
        this.observerRepository.addObservers(getComponentStateFlow(), this.exceptionFlow, getSubmitFlow(), lifecycleOwner, coroutineScope, callback);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void onCleared() {
        Object obj = null;
        this._coroutineScope = null;
        removeObserver();
        a aVar = this.cashAppPay;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cashAppPay");
            aVar = null;
        }
        cc.c cVar = (cc.c) aVar;
        cVar.f7894f.s("CashAppPay", "Unregistering from state updates");
        cVar.f7896h = null;
        cc.e eVar = cVar.f7892d;
        eVar.getClass();
        ArrayList arrayList = eVar.f7902b;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((WeakReference) next).get(), cVar)) {
                obj = next;
                break;
            }
        }
        TypeIntrinsics.asMutableCollection(arrayList).remove((WeakReference) obj);
        if (arrayList.isEmpty()) {
            cc.d dVar = new cc.d(eVar, 0);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                dVar.run();
            } else {
                eVar.f7903c.post(dVar);
            }
        }
        j jVar = cVar.f7891c;
        String strD = h0.a((a60.b0) jVar.f13637g, Reflection.typeOf(AnalyticsEventListenerPayload.class)).d(new AnalyticsEventListenerPayload((String) jVar.f13631a, (String) jVar.f13633c, AnalyticsPlatformParams.channel, (String) jVar.f13632b, (String) jVar.f13634d, false));
        ((n20.f) jVar.f13638h).getClass();
        String strQ = n20.f.q();
        ((r40.d) jVar.f13639i).getClass();
        String strD2 = h0.a((a60.b0) jVar.f13637g, Reflection.typeOf(EventStream2Event.class)).d(new EventStream2Event("paykitsdk-android", "mobile_cap_pk_event_listener", strD, r40.d.l(), strQ));
        j jVar2 = (j) jVar.f13635e;
        synchronized (jVar2) {
            jVar2.m(strD2);
        }
        j jVar3 = (j) cVar.f7891c.f13635e;
        ((AtomicBoolean) jVar3.f13639i).set(true);
        ((ub.a) jVar3.f13634d).L("PayKitAnalytics", "Scheduled shutdown.");
        k8.d dVar2 = cVar.f7895g;
        Iterator it2 = ((LinkedHashMap) dVar2.f26135c).keySet().iterator();
        while (it2.hasNext()) {
            dVar2.v((ThreadPurpose) it2.next());
        }
        this.analyticsManager.clear(this);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public void onSubmit() {
        if (isConfirmationRequired()) {
            initiatePayment();
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void removeObserver() {
        this.observerRepository.removeObservers();
    }

    public final void setInteractionBlocked$cashapppay_release(boolean isInteractionBlocked) {
        this.submitHandler.setInteractionBlocked(isInteractionBlocked);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean shouldShowSubmitButton() {
        return isConfirmationRequired() && getComponentParams().isSubmitButtonVisible();
    }

    public final void updateComponentState$cashapppay_release(@NotNull CashAppPayOutputData outputData) {
        outputData.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultCashAppPayDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "updateComponentState", null);
        }
        ((a2) this._componentStateFlow).j(createComponentState(outputData));
    }

    @Override // com.adyen.checkout.cashapppay.internal.ui.CashAppPayDelegate
    public void updateInputData(@NotNull Function1<? super CashAppPayInputData, Unit> update) {
        update.getClass();
        update.invoke(this.inputData);
        onInputDataChanged();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public CashAppPayComponentParams getComponentParams() {
        return this.componentParams;
    }

    public /* synthetic */ DefaultCashAppPayDelegate(SubmitHandler submitHandler, AnalyticsManager analyticsManager, PaymentObserverRepository paymentObserverRepository, PaymentMethod paymentMethod, OrderRequest orderRequest, CashAppPayComponentParams cashAppPayComponentParams, b bVar, x xVar, SdkDataProvider sdkDataProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(submitHandler, analyticsManager, paymentObserverRepository, paymentMethod, orderRequest, cashAppPayComponentParams, bVar, (i11 & 128) != 0 ? DispatcherProvider.INSTANCE.getIO() : xVar, sdkDataProvider);
    }
}
