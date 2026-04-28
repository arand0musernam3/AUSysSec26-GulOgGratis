package com.adyen.checkout.googlepay.internal.ui;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleOwner;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.ErrorEvent;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.components.core.internal.provider.SdkDataProvider;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import com.adyen.checkout.googlepay.GooglePayButtonParameters;
import com.adyen.checkout.googlepay.GooglePayCancellationException;
import com.adyen.checkout.googlepay.GooglePayComponentState;
import com.adyen.checkout.googlepay.GooglePayUnavailableException;
import com.adyen.checkout.googlepay.internal.data.model.GooglePayPaymentMethodModel;
import com.adyen.checkout.googlepay.internal.ui.model.GooglePayComponentParams;
import com.adyen.checkout.googlepay.internal.ui.model.GooglePayOutputData;
import com.adyen.checkout.googlepay.internal.util.GooglePayAvailabilityCheck;
import com.adyen.checkout.googlepay.internal.util.GooglePayUtils;
import com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.SubmitHandler;
import com.app.tgtg.model.local.AppConstants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.tasks.Task;
import e0.f;
import e10.a0;
import e10.l;
import e10.p;
import e10.v;
import i4.a;
import j4.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import u70.d;
import v80.b0;
import v80.f0;
import w.z;
import x70.c;
import x80.m;
import y80.a2;
import y80.f1;
import y80.i;
import y80.r;
import z70.e;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010!\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001f\u0012\u0004\u0012\u00020\u00190\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010)\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b'\u0010(J\u001f\u0010.\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u0010$J\u001d\u00104\u001a\u00020\u00192\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b4\u00105J!\u00109\u001a\u00020\u00192\u0006\u00106\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020>H\u0016¢\u0006\u0004\bA\u0010@J\u0017\u0010E\u001a\u00020\u00192\u0006\u0010B\u001a\u00020>H\u0000¢\u0006\u0004\bC\u0010DJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0019H\u0016¢\u0006\u0004\bI\u0010$J\u0017\u0010J\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bJ\u0010\u001bJ\u000f\u0010K\u001a\u00020\u0019H\u0002¢\u0006\u0004\bK\u0010$J/\u0010O\u001a\u00020\u00192\b\b\u0002\u0010L\u001a\u00020>2\b\b\u0002\u0010M\u001a\u00020>2\n\b\u0002\u0010N\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bO\u0010PJ/\u0010Q\u001a\u00020%2\b\b\u0002\u0010L\u001a\u00020>2\b\b\u0002\u0010M\u001a\u00020>2\n\b\u0002\u0010N\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bQ\u0010RJ\u0019\u0010S\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010U\u001a\u00020\u00192\b\u0010N\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00192\u0006\u0010W\u001a\u00020FH\u0002¢\u0006\u0004\bX\u0010YR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010ZR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010[R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\\R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010]R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010aR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010bR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010cR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010dR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020%0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR \u0010i\u001a\b\u0012\u0004\u0012\u00020%0h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020m0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010gR\"\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010m0h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010j\u001a\u0004\bp\u0010lR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00030e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010gR \u0010r\u001a\b\u0012\u0004\u0012\u00020\u00030h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010j\u001a\u0004\bs\u0010lR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020u0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR \u0010x\u001a\b\u0012\u0004\u0012\u00020u0h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010j\u001a\u0004\by\u0010lR \u0010z\u001a\b\u0012\u0004\u0012\u00020\u00030h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010j\u001a\u0004\b{\u0010lR\u0018\u0010|\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R \u0010\u007f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020~0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010wR)\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020~0h8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010j\u001a\u0005\b\u0081\u0001\u0010lR\u0019\u0010\u0082\u0001\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010&\u001a\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0018\u001a\u00020\u00178BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/ui/DefaultGooglePayDelegate;", "Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/googlepay/GooglePayComponentState;", "submitHandler", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "observerRepository", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/OrderRequest;", "order", "Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;", "componentParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Le10/p;", "paymentsClient", "Lcom/adyen/checkout/googlepay/internal/util/GooglePayAvailabilityCheck;", "googlePayAvailabilityCheck", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "sdkDataProvider", "<init>", "(Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Le10/p;Lcom/adyen/checkout/googlepay/internal/util/GooglePayAvailabilityCheck;Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;)V", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;", "outputData", "updateComponentState$googlepay_release", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;)V", "updateComponentState", "Landroid/app/Activity;", "activity", "", "requestCode", "startGooglePayScreen", "(Landroid/app/Activity;I)V", "onSubmit", "Lg10/a;", "Le10/l;", "paymentDataTaskResult", "handlePaymentResult", "(Lg10/a;)V", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", Bayeux.KEY_DATA, "handleActivityResult", "(ILandroid/content/Intent;)V", "Lcom/adyen/checkout/googlepay/GooglePayButtonParameters;", "getGooglePayButtonParameters", "()Lcom/adyen/checkout/googlepay/GooglePayButtonParameters;", "", "isConfirmationRequired", "()Z", "shouldShowSubmitButton", "isInteractionBlocked", "setInteractionBlocked$googlepay_release", "(Z)V", "setInteractionBlocked", "", "getPaymentMethodType", "()Ljava/lang/String;", "onCleared", "initializeAnalytics", "checkAvailability", "isButtonVisible", "isLoading", "paymentData", "updateOutputData", "(ZZLe10/l;)V", "createOutputData", "(ZZLe10/l;)Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;", "createComponentState", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;)Lcom/adyen/checkout/googlepay/GooglePayComponentState;", "initiatePayment", "(Le10/l;)V", InAppMessageBase.MESSAGE, "trackThirdPartyErrorEvent", "(Ljava/lang/String;)V", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "Lcom/adyen/checkout/components/core/PaymentMethod;", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Le10/p;", "Lcom/adyen/checkout/googlepay/internal/util/GooglePayAvailabilityCheck;", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "Ly80/f1;", "_outputDataFlow", "Ly80/f1;", "Ly80/i;", "outputDataFlow", "Ly80/i;", "getOutputDataFlow", "()Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "viewFlow", "getViewFlow", "_componentStateFlow", "componentStateFlow", "getComponentStateFlow", "Lx80/m;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "exceptionChannel", "Lx80/m;", "exceptionFlow", "getExceptionFlow", "submitFlow", "getSubmitFlow", "_coroutineScope", "Lv80/b0;", "Lcom/google/android/gms/tasks/Task;", "payEventChannel", "payEventFlow", "getPayEventFlow", "isAvailable", "Z", "getOutputData", "()Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;", "getCoroutineScope", "()Lv80/b0;", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultGooglePayDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultGooglePayDelegate.kt\ncom/adyen/checkout/googlepay/internal/ui/DefaultGooglePayDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 RunCompileOnly.kt\ncom/adyen/checkout/core/internal/util/RunCompileOnlyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n16#2,17:338\n16#2,17:355\n44#2,4:376\n16#2,17:385\n16#2,17:402\n16#2,17:419\n16#2,17:436\n16#2,17:454\n16#2,17:471\n16#2,17:488\n16#2,17:505\n16#2,17:522\n16#2,17:539\n16#3,4:372\n20#3,5:380\n1#4:453\n*S KotlinDebug\n*F\n+ 1 DefaultGooglePayDelegate.kt\ncom/adyen/checkout/googlepay/internal/ui/DefaultGooglePayDelegate\n*L\n105#1:338,17\n169#1:355,17\n187#1:376,4\n208#1:385,17\n216#1:402,17\n230#1:419,17\n235#1:436,17\n241#1:454,17\n247#1:471,17\n253#1:488,17\n261#1:505,17\n288#1:522,17\n293#1:539,17\n187#1:372,4\n187#1:380,5\n*E\n"})
public final class DefaultGooglePayDelegate implements GooglePayDelegate {

    @NotNull
    private final f1 _componentStateFlow;

    @Nullable
    private b0 _coroutineScope;

    @NotNull
    private final f1 _outputDataFlow;

    @NotNull
    private final f1 _viewFlow;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final GooglePayComponentParams componentParams;

    @NotNull
    private final i componentStateFlow;

    @NotNull
    private final m exceptionChannel;

    @NotNull
    private final i exceptionFlow;

    @NotNull
    private final GooglePayAvailabilityCheck googlePayAvailabilityCheck;
    private boolean isAvailable;

    @NotNull
    private final PaymentObserverRepository observerRepository;

    @Nullable
    private final OrderRequest order;

    @NotNull
    private final i outputDataFlow;

    @NotNull
    private final m payEventChannel;

    @NotNull
    private final i payEventFlow;

    @NotNull
    private final PaymentMethod paymentMethod;

    @NotNull
    private final p paymentsClient;

    @NotNull
    private final SdkDataProvider sdkDataProvider;

    @NotNull
    private final i submitFlow;

    @NotNull
    private final SubmitHandler<GooglePayComponentState> submitHandler;

    @NotNull
    private final i viewFlow;

    /* JADX INFO: renamed from: com.adyen.checkout.googlepay.internal.ui.DefaultGooglePayDelegate$onSubmit$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.googlepay.internal.ui.DefaultGooglePayDelegate$onSubmit$2", f = "DefaultGooglePayDelegate.kt", l = {AppConstants.GO_TO_GPS_SETTINGS, AppConstants.GO_TO_GPS_SETTINGS}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ Task<l> $paymentDataTask;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Task<l> task, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$paymentDataTask = task;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return DefaultGooglePayDelegate.this.new AnonymousClass2(this.$paymentDataTask, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r1.f(r6, r5) == r0) goto L15;
         */
        @Override // z70.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r5.label
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L18
                if (r1 != r2) goto L11
                ba0.g.M(r6)
                goto L41
            L11:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r6)
                r6 = 0
                return r6
            L18:
                java.lang.Object r1 = r5.L$0
                x80.m r1 = (x80.m) r1
                ba0.g.M(r6)
                goto L36
            L20:
                ba0.g.M(r6)
                com.adyen.checkout.googlepay.internal.ui.DefaultGooglePayDelegate r6 = com.adyen.checkout.googlepay.internal.ui.DefaultGooglePayDelegate.this
                x80.m r1 = com.adyen.checkout.googlepay.internal.ui.DefaultGooglePayDelegate.access$getPayEventChannel$p(r6)
                com.google.android.gms.tasks.Task<e10.l> r6 = r5.$paymentDataTask
                r5.L$0 = r1
                r5.label = r4
                java.lang.Object r6 = com.adyen.checkout.googlepay.internal.util.TaskExtensionsKt.awaitTask$default(r6, r3, r5, r4, r3)
                if (r6 != r0) goto L36
                goto L40
            L36:
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = r1.f(r6, r5)
                if (r6 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r6 = kotlin.Unit.f26487a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.googlepay.internal.ui.DefaultGooglePayDelegate.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public DefaultGooglePayDelegate(@NotNull SubmitHandler<GooglePayComponentState> submitHandler, @NotNull PaymentObserverRepository paymentObserverRepository, @NotNull PaymentMethod paymentMethod, @Nullable OrderRequest orderRequest, @NotNull GooglePayComponentParams googlePayComponentParams, @NotNull AnalyticsManager analyticsManager, @NotNull p pVar, @NotNull GooglePayAvailabilityCheck googlePayAvailabilityCheck, @NotNull SdkDataProvider sdkDataProvider) {
        submitHandler.getClass();
        paymentObserverRepository.getClass();
        paymentMethod.getClass();
        googlePayComponentParams.getClass();
        analyticsManager.getClass();
        pVar.getClass();
        googlePayAvailabilityCheck.getClass();
        sdkDataProvider.getClass();
        this.submitHandler = submitHandler;
        this.observerRepository = paymentObserverRepository;
        this.paymentMethod = paymentMethod;
        this.order = orderRequest;
        this.componentParams = googlePayComponentParams;
        this.analyticsManager = analyticsManager;
        this.paymentsClient = pVar;
        this.googlePayAvailabilityCheck = googlePayAvailabilityCheck;
        this.sdkDataProvider = sdkDataProvider;
        a2 a2VarC = r.c(createOutputData$default(this, false, false, null, 7, null));
        this._outputDataFlow = a2VarC;
        this.outputDataFlow = a2VarC;
        a2 a2VarC2 = r.c(GooglePayComponentViewType.INSTANCE);
        this._viewFlow = a2VarC2;
        this.viewFlow = a2VarC2;
        a2 a2VarC3 = r.c(createComponentState$default(this, null, 1, null));
        this._componentStateFlow = a2VarC3;
        this.componentStateFlow = a2VarC3;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.exceptionChannel = mVarBufferedChannel;
        this.exceptionFlow = r.w(mVarBufferedChannel);
        this.submitFlow = submitHandler.getSubmitFlow();
        m mVarBufferedChannel2 = ChannelExtensionsKt.bufferedChannel();
        this.payEventChannel = mVarBufferedChannel2;
        this.payEventFlow = r.w(mVarBufferedChannel2);
    }

    private final void checkAvailability() {
        this.googlePayAvailabilityCheck.isAvailable(this.paymentMethod, getComponentParams(), new z(this, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkAvailability$lambda$1(DefaultGooglePayDelegate defaultGooglePayDelegate, boolean z11, PaymentMethod paymentMethod) {
        defaultGooglePayDelegate.getClass();
        paymentMethod.getClass();
        defaultGooglePayDelegate.isAvailable = z11;
        updateOutputData$default(defaultGooglePayDelegate, z11, false, null, 6, null);
        if (z11) {
            return;
        }
        defaultGooglePayDelegate.exceptionChannel.h(new GooglePayUnavailableException(null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[PHI: r0 r10 r11
      0x0044: PHI (r0v5 'e' java.lang.Throwable) = (r0v4 'e' java.lang.Throwable), (r0v7 'e' java.lang.Throwable) binds: [B:15:0x0042, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r10v1 com.adyen.checkout.core.AdyenLogLevel) = (r10v0 com.adyen.checkout.core.AdyenLogLevel), (r10v2 com.adyen.checkout.core.AdyenLogLevel) binds: [B:15:0x0042, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r11v1 com.adyen.checkout.core.AdyenLogger$Companion) = (r11v0 com.adyen.checkout.core.AdyenLogger$Companion), (r11v3 com.adyen.checkout.core.AdyenLogger$Companion) binds: [B:15:0x0042, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.adyen.checkout.googlepay.GooglePayComponentState createComponentState(com.adyen.checkout.googlepay.internal.ui.model.GooglePayOutputData r27) {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r2 = "Class not found. Are you missing a dependency?"
            java.lang.String r3 = "CO.runCompileOnly"
            e10.l r4 = r27.getPaymentData()
            r0 = 0
            if (r4 == 0) goto L1a
            com.adyen.checkout.googlepay.internal.util.GooglePayUtils r5 = com.adyen.checkout.googlepay.internal.util.GooglePayUtils.INSTANCE
            java.lang.String r5 = r5.findToken(r4)
            int r5 = r5.length()
            if (r5 <= 0) goto L1a
            r0 = 1
        L1a:
            r5 = r0
            com.adyen.checkout.googlepay.internal.util.GooglePayUtils r6 = com.adyen.checkout.googlepay.internal.util.GooglePayUtils.INSTANCE
            com.adyen.checkout.components.core.PaymentMethod r0 = r1.paymentMethod
            java.lang.String r7 = r0.getType()
            com.adyen.checkout.components.core.internal.analytics.AnalyticsManager r0 = r1.analyticsManager
            java.lang.String r8 = r0.getCheckoutAttemptId()
            com.adyen.checkout.components.core.internal.provider.SdkDataProvider r9 = r1.sdkDataProvider
            com.adyen.threeds2.ThreeDS2Service r0 = com.adyen.threeds2.ThreeDS2Service.INSTANCE     // Catch: java.lang.NoClassDefFoundError -> L32 java.lang.ClassNotFoundException -> L34
            java.lang.String r0 = r0.getSDKVersion()     // Catch: java.lang.NoClassDefFoundError -> L32 java.lang.ClassNotFoundException -> L34
            goto L5c
        L32:
            r0 = move-exception
            goto L36
        L34:
            r0 = move-exception
            goto L4c
        L36:
            com.adyen.checkout.core.AdyenLogLevel r10 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r11 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r12 = r11.getLogger()
            boolean r12 = r12.shouldLog(r10)
            if (r12 == 0) goto L5b
        L44:
            com.adyen.checkout.core.AdyenLogger r11 = r11.getLogger()
            r11.log(r10, r3, r2, r0)
            goto L5b
        L4c:
            com.adyen.checkout.core.AdyenLogLevel r10 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r11 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r12 = r11.getLogger()
            boolean r12 = r12.shouldLog(r10)
            if (r12 == 0) goto L5b
            goto L44
        L5b:
            r0 = 0
        L5c:
            java.lang.String r0 = r9.createEncodedSdkData(r0)
            com.adyen.checkout.components.core.paymentmethod.GooglePayPaymentMethod r10 = r6.createGooglePayPaymentMethod(r4, r7, r8, r0)
            com.adyen.checkout.components.core.PaymentComponentData r9 = new com.adyen.checkout.components.core.PaymentComponentData
            com.adyen.checkout.components.core.OrderRequest r11 = r1.order
            com.adyen.checkout.googlepay.internal.ui.model.GooglePayComponentParams r0 = r1.getComponentParams()
            com.adyen.checkout.components.core.Amount r12 = r0.getAmount()
            r24 = 16376(0x3ff8, float:2.2948E-41)
            r25 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = r1.isAvailable
            com.adyen.checkout.googlepay.GooglePayComponentState r2 = new com.adyen.checkout.googlepay.GooglePayComponentState
            r2.<init>(r9, r5, r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.googlepay.internal.ui.DefaultGooglePayDelegate.createComponentState(com.adyen.checkout.googlepay.internal.ui.model.GooglePayOutputData):com.adyen.checkout.googlepay.GooglePayComponentState");
    }

    public static /* synthetic */ GooglePayComponentState createComponentState$default(DefaultGooglePayDelegate defaultGooglePayDelegate, GooglePayOutputData googlePayOutputData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            googlePayOutputData = defaultGooglePayDelegate.getOutputData();
        }
        return defaultGooglePayDelegate.createComponentState(googlePayOutputData);
    }

    private final GooglePayOutputData createOutputData(boolean isButtonVisible, boolean isLoading, l paymentData) {
        return new GooglePayOutputData(isButtonVisible, isLoading, paymentData);
    }

    public static /* synthetic */ GooglePayOutputData createOutputData$default(DefaultGooglePayDelegate defaultGooglePayDelegate, boolean z11, boolean z12, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = defaultGooglePayDelegate.getComponentParams().isSubmitButtonVisible();
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return defaultGooglePayDelegate.createOutputData(z11, z12, lVar);
    }

    private final b0 getCoroutineScope() {
        b0 b0Var = this._coroutineScope;
        if (b0Var != null) {
            return b0Var;
        }
        a.f("Required value was null.");
        return null;
    }

    private final GooglePayOutputData getOutputData() {
        return (GooglePayOutputData) ((a2) this._outputDataFlow).getValue();
    }

    private final void initializeAnalytics(b0 coroutineScope) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultGooglePayDelegate.class.getName();
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

    private final void initiatePayment(l paymentData) {
        if (paymentData == null) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultGooglePayDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Payment data is null", null);
            }
            trackThirdPartyErrorEvent("Result is success, but data is missing");
            this.exceptionChannel.h(new ComponentException("GooglePay encountered an unexpected error", null, 2, null));
            return;
        }
        AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.INFO;
        AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
        if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
            String name2 = DefaultGooglePayDelegate.class.getName();
            String strY2 = StringsKt.Y(name2, '$');
            String strW2 = StringsKt.W('.', strY2, strY2);
            if (strW2.length() != 0) {
                name2 = StringsKt.O(strW2, "Kt");
            }
            companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "GooglePay payment result successful", null);
        }
        GenericEvents genericEvents = GenericEvents.INSTANCE;
        String type = this.paymentMethod.getType();
        if (type == null) {
            type = "";
        }
        this.analyticsManager.trackEvent(genericEvents.submit(type));
        updateOutputData$default(this, false, false, paymentData, 3, null);
        this.submitHandler.onSubmit((PaymentComponentState) ((a2) this._componentStateFlow).getValue());
    }

    private final void trackThirdPartyErrorEvent(String message) {
        this.analyticsManager.trackEvent(GenericEvents.error$default(GenericEvents.INSTANCE, getPaymentMethodType(), ErrorEvent.THIRD_PARTY, null, message, 4, null));
    }

    private final void updateOutputData(boolean isButtonVisible, boolean isLoading, l paymentData) {
        GooglePayOutputData googlePayOutputDataCreateOutputData = createOutputData(isButtonVisible, isLoading, paymentData);
        ((a2) this._outputDataFlow).j(googlePayOutputDataCreateOutputData);
        updateComponentState$googlepay_release(googlePayOutputDataCreateOutputData);
    }

    public static /* synthetic */ void updateOutputData$default(DefaultGooglePayDelegate defaultGooglePayDelegate, boolean z11, boolean z12, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = defaultGooglePayDelegate.getOutputData().isButtonVisible();
        }
        if ((i11 & 2) != 0) {
            z12 = defaultGooglePayDelegate.getOutputData().isLoading();
        }
        if ((i11 & 4) != 0) {
            lVar = defaultGooglePayDelegate.getOutputData().getPaymentData();
        }
        defaultGooglePayDelegate.updateOutputData(z11, z12, lVar);
    }

    @Override // com.adyen.checkout.googlepay.internal.ui.GooglePayDelegate
    @NotNull
    public i getComponentStateFlow() {
        return this.componentStateFlow;
    }

    @Override // com.adyen.checkout.googlepay.internal.ui.GooglePayDelegate
    @NotNull
    public i getExceptionFlow() {
        return this.exceptionFlow;
    }

    @Override // com.adyen.checkout.googlepay.internal.ui.GooglePayDelegate
    @NotNull
    public GooglePayButtonParameters getGooglePayButtonParameters() {
        JSONArray jSONArraySerializeOptList = ModelUtils.serializeOptList(GooglePayUtils.INSTANCE.getAllowedPaymentMethods$googlepay_release(getComponentParams()), GooglePayPaymentMethodModel.SERIALIZER);
        String string = jSONArraySerializeOptList != null ? jSONArraySerializeOptList.toString() : null;
        if (string == null) {
            string = "";
        }
        return new GooglePayButtonParameters(string);
    }

    @Override // com.adyen.checkout.googlepay.internal.ui.GooglePayDelegate
    @NotNull
    public i getOutputDataFlow() {
        return this.outputDataFlow;
    }

    @Override // com.adyen.checkout.googlepay.internal.ui.GooglePayDelegate
    @NotNull
    public i getPayEventFlow() {
        return this.payEventFlow;
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

    @Override // com.adyen.checkout.googlepay.internal.ui.GooglePayDelegate
    public void handleActivityResult(int resultCode, @Nullable Intent data) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultGooglePayDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "handleActivityResult", null);
        }
        if (resultCode == -1) {
            if (data == null) {
                trackThirdPartyErrorEvent("Activity result is ok, but data is missing");
                this.exceptionChannel.h(new ComponentException("Result data is null", null, 2, null));
                return;
            } else {
                Parcelable.Creator<l> creator = l.CREATOR;
                byte[] byteArrayExtra = data.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                initiatePayment((l) (byteArrayExtra != null ? m0.c.a0(byteArrayExtra, creator) : null));
                return;
            }
        }
        if (resultCode == 0) {
            this.exceptionChannel.h(new GooglePayCancellationException("Payment canceled."));
            return;
        }
        if (resultCode != 1) {
            return;
        }
        trackThirdPartyErrorEvent("Activity result is error");
        int i11 = e10.a.f15466b;
        Status status = data == null ? null : (Status) data.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        String strK = status != null ? f.k(": ", status.f11060b) : null;
        if (strK == null) {
            strK = "";
        }
        this.exceptionChannel.h(new ComponentException("GooglePay returned an error".concat(strK), null, 2, null));
    }

    @Override // com.adyen.checkout.googlepay.internal.ui.GooglePayDelegate
    public void handlePaymentResult(@NotNull g10.a paymentDataTaskResult) {
        paymentDataTaskResult.getClass();
        Status status = paymentDataTaskResult.f18116b;
        int i11 = status.f11059a;
        if (i11 == 0) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.INFO;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultGooglePayDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "GooglePay payment result successful", null);
            }
            initiatePayment((l) paymentDataTaskResult.f18115a);
            return;
        }
        if (i11 == 1) {
            String str = status.f11060b;
            String strConcat = str != null ? ": ".concat(str) : null;
            if (strConcat == null) {
                strConcat = "";
            }
            AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
            if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
                String name2 = DefaultGooglePayDelegate.class.getName();
                String strY2 = StringsKt.Y(name2, '$');
                String strW2 = StringsKt.W('.', strY2, strY2);
                if (strW2.length() != 0) {
                    name2 = StringsKt.O(strW2, "Kt");
                }
                companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "GooglePay encountered an error".concat(strConcat), null);
            }
            trackThirdPartyErrorEvent("Result is error");
            this.exceptionChannel.h(new ComponentException("GooglePay encountered an error".concat(strConcat), null, 2, null));
            return;
        }
        if (i11 == 8) {
            AdyenLogLevel adyenLogLevel3 = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion3 = AdyenLogger.INSTANCE;
            if (companion3.getLogger().shouldLog(adyenLogLevel3)) {
                String name3 = DefaultGooglePayDelegate.class.getName();
                String strY3 = StringsKt.Y(name3, '$');
                String strW3 = StringsKt.W('.', strY3, strY3);
                if (strW3.length() != 0) {
                    name3 = StringsKt.O(strW3, "Kt");
                }
                companion3.getLogger().log(adyenLogLevel3, "CO.".concat(name3), "GooglePay encountered an internal error", null);
            }
            trackThirdPartyErrorEvent("Result is internal error");
            this.exceptionChannel.h(new ComponentException("GooglePay encountered an internal error", null, 2, null));
            return;
        }
        if (i11 == 16) {
            AdyenLogLevel adyenLogLevel4 = AdyenLogLevel.INFO;
            AdyenLogger.Companion companion4 = AdyenLogger.INSTANCE;
            if (companion4.getLogger().shouldLog(adyenLogLevel4)) {
                String name4 = DefaultGooglePayDelegate.class.getName();
                String strY4 = StringsKt.Y(name4, '$');
                String strW4 = StringsKt.W('.', strY4, strY4);
                if (strW4.length() != 0) {
                    name4 = StringsKt.O(strW4, "Kt");
                }
                companion4.getLogger().log(adyenLogLevel4, "CO.".concat(name4), "GooglePay payment canceled", null);
            }
            this.exceptionChannel.h(new GooglePayCancellationException("GooglePay payment canceled"));
            return;
        }
        AdyenLogLevel adyenLogLevel5 = AdyenLogLevel.ERROR;
        AdyenLogger.Companion companion5 = AdyenLogger.INSTANCE;
        if (companion5.getLogger().shouldLog(adyenLogLevel5)) {
            String name5 = DefaultGooglePayDelegate.class.getName();
            String strY5 = StringsKt.Y(name5, '$');
            String strW5 = StringsKt.W('.', strY5, strY5);
            if (strW5.length() != 0) {
                name5 = StringsKt.O(strW5, "Kt");
            }
            companion5.getLogger().log(adyenLogLevel5, "CO.".concat(name5), s.f(i11, "GooglePay encountered an unexpected error, statusCode: "), null);
        }
        trackThirdPartyErrorEvent("Unexpected error");
        this.exceptionChannel.h(new ComponentException("GooglePay encountered an unexpected error", null, 2, null));
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
        this._coroutineScope = coroutineScope;
        this.submitHandler.initialize(coroutineScope, getComponentStateFlow());
        initializeAnalytics(coroutineScope);
        checkAvailability();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean isConfirmationRequired() {
        return ((a2) this._viewFlow).getValue() instanceof ButtonComponentViewType;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super PaymentComponentEvent<GooglePayComponentState>, Unit> callback) {
        lifecycleOwner.getClass();
        coroutineScope.getClass();
        callback.getClass();
        this.observerRepository.addObservers(getComponentStateFlow(), getExceptionFlow(), getSubmitFlow(), lifecycleOwner, coroutineScope, callback);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void onCleared() {
        removeObserver();
        this.analyticsManager.clear(this);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public void onSubmit() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultGooglePayDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onSubmit", null);
        }
        updateOutputData$default(this, false, true, null, 4, null);
        Task taskC = this.paymentsClient.c(GooglePayUtils.INSTANCE.createPaymentDataRequest(getComponentParams()));
        taskC.getClass();
        f0.B(getCoroutineScope(), null, null, new AnonymousClass2(taskC, null), 3);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void removeObserver() {
        this.observerRepository.removeObservers();
    }

    public final void setInteractionBlocked$googlepay_release(boolean isInteractionBlocked) {
        this.submitHandler.setInteractionBlocked(isInteractionBlocked);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean shouldShowSubmitButton() {
        return isConfirmationRequired() && getComponentParams().isSubmitButtonVisible();
    }

    @Override // com.adyen.checkout.googlepay.internal.ui.GooglePayDelegate
    @d
    public void startGooglePayScreen(@NotNull Activity activity, int requestCode) {
        activity.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultGooglePayDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "startGooglePayScreen", null);
        }
        GooglePayUtils googlePayUtils = GooglePayUtils.INSTANCE;
        Task taskC = new p(activity, activity, v.f15550a, googlePayUtils.createWalletOptions(getComponentParams()), k.f11084c).c(googlePayUtils.createPaymentDataRequest(getComponentParams()));
        int i11 = e10.a.f15466b;
        e10.z zVar = new e10.z();
        int iIncrementAndGet = e10.z.f15573f.incrementAndGet();
        zVar.f15574a = iIncrementAndGet;
        e10.z.f15572e.put(iIncrementAndGet, zVar);
        e10.z.f15571d.postDelayed(zVar, 600000L);
        taskC.addOnCompleteListener(zVar);
        FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
        int i12 = zVar.f15574a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i12);
        bundle.putInt("requestCode", requestCode);
        bundle.putLong("initializationElapsedRealtime", e10.a.f15465a);
        a0 a0Var = new a0();
        a0Var.setArguments(bundle);
        fragmentTransactionBeginTransaction.add(a0Var, "com.google.android.gms.wallet.AutoResolveHelper" + zVar.f15574a).commit();
    }

    public final void updateComponentState$googlepay_release(@NotNull GooglePayOutputData outputData) {
        outputData.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultGooglePayDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "updateComponentState", null);
        }
        ((a2) this._componentStateFlow).j(createComponentState(outputData));
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public GooglePayComponentParams getComponentParams() {
        return this.componentParams;
    }
}
