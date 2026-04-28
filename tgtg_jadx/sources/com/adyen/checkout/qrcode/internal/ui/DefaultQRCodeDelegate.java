package com.adyen.checkout.qrcode.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import ba0.g;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.QrCodeAction;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionObserverRepository;
import com.adyen.checkout.components.core.internal.PaymentDataRepository;
import com.adyen.checkout.components.core.internal.PermissionRequestData;
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
import com.adyen.checkout.components.core.internal.util.DateUtils;
import com.adyen.checkout.components.core.internal.util.LifecycleExtensionsKt;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.PermissionHandlerCallback;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.qrcode.internal.QRCodeCountDownTimer;
import com.adyen.checkout.qrcode.internal.ui.model.QRCodeOutputData;
import com.adyen.checkout.qrcode.internal.ui.model.QRCodePaymentMethodConfig;
import com.adyen.checkout.qrcode.internal.ui.model.QrCodeUIEvent;
import com.adyen.checkout.ui.core.internal.RedirectHandler;
import com.adyen.checkout.ui.core.internal.exception.PermissionRequestException;
import com.adyen.checkout.ui.core.internal.util.ImageSaver;
import com.braze.h2;
import e0.f;
import j4.s;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p80.d;
import p80.h;
import u70.q;
import v80.b0;
import v80.f0;
import v80.i1;
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
@Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 ¬\u00012\u00020\u00012\u00020\u0002:\u0002¬\u0001BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J3\u0010&\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00190#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u0010)J\u0017\u00103\u001a\u00020\u00192\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00192\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J'\u0010@\u001a\u00020\u00192\u0006\u0010:\u001a\u0002092\u0006\u0010>\u001a\u00020=2\u0006\u0010%\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u001d\u0010D\u001a\u00020\u00192\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00190BH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0019H\u0016¢\u0006\u0004\bF\u0010)J\u000f\u0010G\u001a\u00020\u0019H\u0002¢\u0006\u0004\bG\u0010)J\u000f\u0010H\u001a\u00020\u0019H\u0002¢\u0006\u0004\bH\u0010)J\u001f\u0010J\u001a\u00020\u00192\u0006\u0010+\u001a\u00020I2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00192\u0006\u0010+\u001a\u00020IH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020IH\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020\u00192\u0006\u0010P\u001a\u00020=2\u0006\u0010+\u001a\u00020IH\u0002¢\u0006\u0004\bQ\u0010RJ%\u0010V\u001a\u00020\u00192\f\u0010U\u001a\b\u0012\u0004\u0012\u00020T0S2\u0006\u0010+\u001a\u00020IH\u0002¢\u0006\u0004\bV\u0010WJ!\u0010Y\u001a\u00020\u00192\b\u0010X\u001a\u0004\u0018\u00010T2\u0006\u0010+\u001a\u00020IH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u00192\u0006\u0010X\u001a\u00020TH\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020]2\u0006\u0010+\u001a\u00020IH\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010c\u001a\u00020b2\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020`2\u0006\u0010e\u001a\u00020=H\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010Y\u001a\u00020hH\u0002¢\u0006\u0004\bY\u0010iJ\u0017\u0010j\u001a\u00020\u00192\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bj\u00108J\u0017\u0010k\u001a\u00020\u00192\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0019H\u0002¢\u0006\u0004\bm\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010r\u001a\u0004\bs\u0010tR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010uR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010vR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010wR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010xR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010yR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010zR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020h0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R#\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020h0~8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u0002050\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R%\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u0002050~8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0080\u0001\u001a\u0006\b\u0087\u0001\u0010\u0082\u0001R\u001f\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0085\u0001R&\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010~8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0080\u0001\u001a\u0006\b\u008b\u0001\u0010\u0082\u0001R\u001e\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020b0\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0085\u0001R%\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020b0~8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0080\u0001\u001a\u0006\b\u008e\u0001\u0010\u0082\u0001R\u001d\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010{8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010}R&\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010~8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0080\u0001\u001a\u0006\b\u0092\u0001\u0010\u0082\u0001R\u001f\u0010\u0094\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u00010{8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010}R(\u0010\u0095\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u00010~8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0080\u0001\u001a\u0006\b\u0096\u0001\u0010\u0082\u0001R\u001f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0085\u0001R&\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010~8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u0080\u0001\u001a\u0006\b\u009a\u0001\u0010\u0082\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0019\u0010 \u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R5\u0010+\u001a\u0004\u0018\u00010I2\t\u0010¢\u0001\u001a\u0004\u0018\u00010I8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0005\b§\u0001\u0010MR\u0016\u0010©\u0001\u001a\u00020h8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010iR\u0016\u0010\u001e\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lcom/adyen/checkout/qrcode/internal/ui/DefaultQRCodeDelegate;", "Lcom/adyen/checkout/qrcode/internal/ui/QRCodeDelegate;", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleContainer;", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "observerRepository", "Landroidx/lifecycle/c1;", "savedStateHandle", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "componentParams", "Lcom/adyen/checkout/components/core/internal/data/api/StatusRepository;", "statusRepository", "Lcom/adyen/checkout/qrcode/internal/QRCodeCountDownTimer;", "statusCountDownTimer", "Lcom/adyen/checkout/ui/core/internal/RedirectHandler;", "redirectHandler", "Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;", "paymentDataRepository", "Lcom/adyen/checkout/ui/core/internal/util/ImageSaver;", "imageSaver", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "<init>", "(Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;Landroidx/lifecycle/c1;Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;Lcom/adyen/checkout/components/core/internal/data/api/StatusRepository;Lcom/adyen/checkout/qrcode/internal/QRCodeCountDownTimer;Lcom/adyen/checkout/ui/core/internal/RedirectHandler;Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;Lcom/adyen/checkout/ui/core/internal/util/ImageSaver;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;)V", "", "millisUntilFinished", "", "onTimerTick$qr_code_release", "(J)V", "onTimerTick", "Lv80/b0;", "coroutineScope", "initialize", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "Landroid/app/Activity;", "activity", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "refreshStatus", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", "Lcom/adyen/checkout/core/exception/CheckoutException;", "e", "onError", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "Landroid/content/Context;", "context", "downloadQRImage", "(Landroid/content/Context;)V", "", "requiredPermission", "Lcom/adyen/checkout/core/PermissionHandlerCallback;", "requestPermission", "(Landroid/content/Context;Ljava/lang/String;Lcom/adyen/checkout/core/PermissionHandlerCallback;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "onCleared", "attachStatusTimer", "restoreState", "Lcom/adyen/checkout/components/core/action/QrCodeAction;", "launchAction", "(Lcom/adyen/checkout/components/core/action/QrCodeAction;Landroid/app/Activity;)V", "initState", "(Lcom/adyen/checkout/components/core/action/QrCodeAction;)V", "makeRedirect", "(Landroid/app/Activity;Lcom/adyen/checkout/components/core/action/QrCodeAction;)V", "paymentData", "startStatusPolling", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/action/QrCodeAction;)V", "Lu70/q;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "result", "onStatus", "(Ljava/lang/Object;Lcom/adyen/checkout/components/core/action/QrCodeAction;)V", "statusResponse", "createOutputData", "(Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;Lcom/adyen/checkout/components/core/action/QrCodeAction;)V", "onPollingSuccessful", "(Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;)V", "", "shouldLaunchRedirect", "(Lcom/adyen/checkout/components/core/action/QrCodeAction;)Z", "Lorg/json/JSONObject;", ErrorBundle.DETAIL_ENTRY, "Lcom/adyen/checkout/components/core/ActionComponentData;", "createActionComponentData", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/ActionComponentData;", "payload", "createDetails", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lcom/adyen/checkout/qrcode/internal/ui/model/QRCodeOutputData;", "()Lcom/adyen/checkout/qrcode/internal/ui/model/QRCodeOutputData;", "emitError", "emitDetails", "(Lorg/json/JSONObject;)V", "clearState", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "Landroidx/lifecycle/c1;", "getSavedStateHandle", "()Landroidx/lifecycle/c1;", "Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "Lcom/adyen/checkout/components/core/internal/data/api/StatusRepository;", "Lcom/adyen/checkout/qrcode/internal/QRCodeCountDownTimer;", "Lcom/adyen/checkout/ui/core/internal/RedirectHandler;", "Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;", "Lcom/adyen/checkout/ui/core/internal/util/ImageSaver;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Ly80/f1;", "_outputDataFlow", "Ly80/f1;", "Ly80/i;", "outputDataFlow", "Ly80/i;", "getOutputDataFlow", "()Ly80/i;", "Lx80/m;", "exceptionChannel", "Lx80/m;", "exceptionFlow", "getExceptionFlow", "Lcom/adyen/checkout/components/core/internal/PermissionRequestData;", "permissionChannel", "permissionFlow", "getPermissionFlow", "detailsChannel", "detailsFlow", "getDetailsFlow", "Lcom/adyen/checkout/components/core/internal/ui/model/TimerData;", "_timerFlow", "timerFlow", "getTimerFlow", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "viewFlow", "getViewFlow", "Lcom/adyen/checkout/qrcode/internal/ui/model/QrCodeUIEvent;", "eventChannel", "eventFlow", "getEventFlow", "_coroutineScope", "Lv80/b0;", "Lv80/i1;", "statusPollingJob", "Lv80/i1;", "maxPollingDurationMillis", "J", "<set-?>", "action$delegate", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleProperty;", "getAction", "()Lcom/adyen/checkout/components/core/action/QrCodeAction;", "setAction", "getOutputData", "outputData", "getCoroutineScope", "()Lv80/b0;", "Companion", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultQRCodeDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultQRCodeDelegate.kt\ncom/adyen/checkout/qrcode/internal/ui/DefaultQRCodeDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,423:1\n16#2,17:424\n16#2,17:441\n16#2,17:458\n16#2,17:475\n16#2,17:492\n21#2,12:509\n*S KotlinDebug\n*F\n+ 1 DefaultQRCodeDelegate.kt\ncom/adyen/checkout/qrcode/internal/ui/DefaultQRCodeDelegate\n*L\n131#1:424,17\n187#1:441,17\n192#1:458,17\n218#1:475,17\n235#1:492,17\n242#1:509,12\n*E\n"})
public final class DefaultQRCodeDelegate implements QRCodeDelegate, SavedStateHandleContainer {

    @NotNull
    public static final String ACTION_KEY = "ACTION_KEY";

    @NotNull
    public static final String ANALYTICS_TARGET_QR_BUTTON = "qr_download_button";
    private static final long DEFAULT_MAX_POLLING_DURATION;
    private static final int HUNDRED = 100;

    @NotNull
    private static final String IMAGE_NAME_FORMAT = "%s-%s.png";

    @NotNull
    public static final String PAYLOAD_DETAILS_KEY = "payload";

    @NotNull
    private static final String QR_IMAGE_BASE_PATH = "%sbarcode.shtml?barcodeType=qrCode&fileType=png&data=%s";
    private static final long STATUS_POLLING_INTERVAL_MILLIS;

    @Nullable
    private b0 _coroutineScope;

    @NotNull
    private final f1 _outputDataFlow;

    @NotNull
    private final f1 _timerFlow;

    @NotNull
    private final f1 _viewFlow;

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
    private final m eventChannel;

    @NotNull
    private final i eventFlow;

    @NotNull
    private final m exceptionChannel;

    @NotNull
    private final i exceptionFlow;

    @NotNull
    private final ImageSaver imageSaver;
    private long maxPollingDurationMillis;

    @NotNull
    private final ActionObserverRepository observerRepository;

    @NotNull
    private final i outputDataFlow;

    @NotNull
    private final PaymentDataRepository paymentDataRepository;

    @NotNull
    private final m permissionChannel;

    @NotNull
    private final i permissionFlow;

    @NotNull
    private final RedirectHandler redirectHandler;

    @NotNull
    private final c1 savedStateHandle;

    @NotNull
    private final QRCodeCountDownTimer statusCountDownTimer;

    @Nullable
    private i1 statusPollingJob;

    @NotNull
    private final StatusRepository statusRepository;

    @NotNull
    private final i timerFlow;

    @NotNull
    private final i viewFlow;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {s.t(DefaultQRCodeDelegate.class, "action", "getAction()Lcom/adyen/checkout/components/core/action/QrCodeAction;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<String> VIEWABLE_PAYMENT_METHODS = d0.h(PaymentMethodTypes.DUIT_NOW, PaymentMethodTypes.PIX, PaymentMethodTypes.PAY_NOW, PaymentMethodTypes.PROMPT_PAY, PaymentMethodTypes.UPI_QR);

    /* JADX INFO: renamed from: com.adyen.checkout.qrcode.internal.ui.DefaultQRCodeDelegate$downloadQRImage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.qrcode.internal.ui.DefaultQRCodeDelegate$downloadQRImage$1", f = "DefaultQRCodeDelegate.kt", l = {344}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C01051 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $imageName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01051(Context context, String str, c<? super C01051> cVar) {
            super(2, cVar);
            this.$context = context;
            this.$imageName = str;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return DefaultQRCodeDelegate.this.new C01051(this.$context, this.$imageName, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((C01051) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C01051 c01051;
            Object objM125saveImageFromUrlhUnOzRk$default;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ImageSaver imageSaver = DefaultQRCodeDelegate.this.imageSaver;
                Context context = this.$context;
                DefaultQRCodeDelegate defaultQRCodeDelegate = DefaultQRCodeDelegate.this;
                String qrImageUrl = defaultQRCodeDelegate.getOutputData().getQrImageUrl();
                if (qrImageUrl == null) {
                    qrImageUrl = "";
                }
                String str = this.$imageName;
                this.label = 1;
                c01051 = this;
                objM125saveImageFromUrlhUnOzRk$default = ImageSaver.m125saveImageFromUrlhUnOzRk$default(imageSaver, context, defaultQRCodeDelegate, qrImageUrl, str, null, c01051, 16, null);
                if (objM125saveImageFromUrlhUnOzRk$default == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                objM125saveImageFromUrlhUnOzRk$default = ((q) obj).f40851a;
                c01051 = this;
            }
            DefaultQRCodeDelegate defaultQRCodeDelegate2 = DefaultQRCodeDelegate.this;
            Throwable thA = q.a(objM125saveImageFromUrlhUnOzRk$default);
            if (thA == null) {
                defaultQRCodeDelegate2.eventChannel.h(QrCodeUIEvent.QrImageDownloadResult.Success.INSTANCE);
            } else if (thA instanceof PermissionRequestException) {
                defaultQRCodeDelegate2.eventChannel.h(QrCodeUIEvent.QrImageDownloadResult.PermissionDenied.INSTANCE);
            } else {
                defaultQRCodeDelegate2.eventChannel.h(new QrCodeUIEvent.QrImageDownloadResult.Failure(thA));
            }
            return Unit.f26487a;
        }
    }

    static {
        p80.c cVar = d.f34559b;
        STATUS_POLLING_INTERVAL_MILLIS = d.f(p80.g.g(1, h.SECONDS));
        DEFAULT_MAX_POLLING_DURATION = d.f(p80.g.g(15, h.MINUTES));
    }

    public DefaultQRCodeDelegate(@NotNull ActionObserverRepository actionObserverRepository, @NotNull c1 c1Var, @NotNull GenericComponentParams genericComponentParams, @NotNull StatusRepository statusRepository, @NotNull QRCodeCountDownTimer qRCodeCountDownTimer, @NotNull RedirectHandler redirectHandler, @NotNull PaymentDataRepository paymentDataRepository, @NotNull ImageSaver imageSaver, @Nullable AnalyticsManager analyticsManager) {
        actionObserverRepository.getClass();
        c1Var.getClass();
        genericComponentParams.getClass();
        statusRepository.getClass();
        qRCodeCountDownTimer.getClass();
        redirectHandler.getClass();
        paymentDataRepository.getClass();
        imageSaver.getClass();
        this.observerRepository = actionObserverRepository;
        this.savedStateHandle = c1Var;
        this.componentParams = genericComponentParams;
        this.statusRepository = statusRepository;
        this.statusCountDownTimer = qRCodeCountDownTimer;
        this.redirectHandler = redirectHandler;
        this.paymentDataRepository = paymentDataRepository;
        this.imageSaver = imageSaver;
        this.analyticsManager = analyticsManager;
        a2 a2VarC = r.c(createOutputData());
        this._outputDataFlow = a2VarC;
        this.outputDataFlow = a2VarC;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.exceptionChannel = mVarBufferedChannel;
        this.exceptionFlow = r.w(mVarBufferedChannel);
        m mVarBufferedChannel2 = ChannelExtensionsKt.bufferedChannel();
        this.permissionChannel = mVarBufferedChannel2;
        this.permissionFlow = r.w(mVarBufferedChannel2);
        m mVarBufferedChannel3 = ChannelExtensionsKt.bufferedChannel();
        this.detailsChannel = mVarBufferedChannel3;
        this.detailsFlow = r.w(mVarBufferedChannel3);
        a2 a2VarC2 = r.c(new TimerData(0L, 0));
        this._timerFlow = a2VarC2;
        this.timerFlow = a2VarC2;
        a2 a2VarC3 = r.c(null);
        this._viewFlow = a2VarC3;
        this.viewFlow = a2VarC3;
        m mVarBufferedChannel4 = ChannelExtensionsKt.bufferedChannel();
        this.eventChannel = mVarBufferedChannel4;
        this.eventFlow = r.w(mVarBufferedChannel4);
        this.maxPollingDurationMillis = DEFAULT_MAX_POLLING_DURATION;
        this.action = new SavedStateHandleProperty("ACTION_KEY");
    }

    private final void attachStatusTimer() {
        this.statusCountDownTimer.attach(this.maxPollingDurationMillis, STATUS_POLLING_INTERVAL_MILLIS, new Function1<Long, Unit>() { // from class: com.adyen.checkout.qrcode.internal.ui.DefaultQRCodeDelegate.attachStatusTimer.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.f26487a;
            }

            public final void invoke(long j9) {
                DefaultQRCodeDelegate.this.onTimerTick$qr_code_release(j9);
            }
        });
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

    private final void createOutputData(StatusResponse statusResponse, QrCodeAction action) {
        String str;
        boolean z11 = statusResponse != null && StatusResponseUtils.INSTANCE.isFinalResult(statusResponse);
        if (action.getQrCodeData() != null) {
            String strEncode = Uri.encode(action.getQrCodeData());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(QR_IMAGE_BASE_PATH, Arrays.copyOf(new Object[]{getComponentParams().getEnvironment().getCheckoutShopperBaseUrl().toString(), strEncode}, 2));
        } else {
            str = null;
        }
        String paymentMethodType = action.getPaymentMethodType();
        ((a2) this._outputDataFlow).j(new QRCodeOutputData(z11, action.getPaymentMethodType(), action.getQrCodeData(), str, paymentMethodType != null ? QRCodePaymentMethodConfig.INSTANCE.getByPaymentMethodType(paymentMethodType).getMessageTextResource() : null));
    }

    private final void emitDetails(JSONObject details) {
        this.detailsChannel.h(createActionComponentData(details));
        clearState();
    }

    private final void emitError(CheckoutException e5) {
        this.exceptionChannel.h(e5);
        clearState();
    }

    private final QrCodeAction getAction() {
        return (QrCodeAction) this.action.getValue((SavedStateHandleContainer) this, $$delegatedProperties[0]);
    }

    private final b0 getCoroutineScope() {
        b0 b0Var = this._coroutineScope;
        if (b0Var != null) {
            return b0Var;
        }
        i4.a.f("Required value was null.");
        return null;
    }

    private final void initState(QrCodeAction action) {
        if (shouldLaunchRedirect(action)) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultQRCodeDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Action does not require a view, redirecting.", null);
            }
            ((a2) this._viewFlow).j(QrCodeComponentViewType.REDIRECT);
            return;
        }
        String paymentData = action.getPaymentData();
        if (paymentData == null) {
            AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
            if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
                String name2 = DefaultQRCodeDelegate.class.getName();
                String strY2 = StringsKt.Y(name2, '$');
                String strW2 = StringsKt.W('.', strY2, strY2);
                if (strW2.length() != 0) {
                    name2 = StringsKt.O(strW2, "Kt");
                }
                companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Payment data is null", null);
            }
            emitError(new ComponentException("Payment data is null", null, 2, null));
            return;
        }
        QrCodeComponentViewType qrCodeComponentViewType = QrCodeComponentViewType.SIMPLE_QR_CODE;
        String paymentMethodType = action.getPaymentMethodType();
        if (paymentMethodType != null) {
            QRCodePaymentMethodConfig byPaymentMethodType = QRCodePaymentMethodConfig.INSTANCE.getByPaymentMethodType(paymentMethodType);
            QrCodeComponentViewType viewType = byPaymentMethodType.getViewType();
            this.maxPollingDurationMillis = byPaymentMethodType.getMaxPollingDurationMillis();
            qrCodeComponentViewType = viewType;
        }
        ((a2) this._viewFlow).j(qrCodeComponentViewType);
        createOutputData(null, action);
        attachStatusTimer();
        startStatusPolling(paymentData, action);
        this.statusCountDownTimer.start();
    }

    private final void launchAction(QrCodeAction action, Activity activity) {
        if (shouldLaunchRedirect(action)) {
            makeRedirect(activity, action);
        }
    }

    private final void makeRedirect(Activity activity, QrCodeAction action) {
        String url = action.getUrl();
        try {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultQRCodeDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                String strConcat = "CO.".concat(name);
                companion.getLogger().log(adyenLogLevel, strConcat, "makeRedirect - " + url, null);
            }
            this.redirectHandler.launchUriRedirect(activity, url);
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
    public final void onStatus(Object result, QrCodeAction action) {
        Throwable thA = q.a(result);
        if (thA != null) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultQRCodeDelegate.class.getName();
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
            String name2 = DefaultQRCodeDelegate.class.getName();
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
            String name = DefaultQRCodeDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Restoring state", null);
        }
        QrCodeAction action = getAction();
        if (action != null) {
            initState(action);
        }
    }

    private final void setAction(QrCodeAction qrCodeAction) {
        this.action.setValue((SavedStateHandleContainer) this, $$delegatedProperties[0], qrCodeAction);
    }

    private final boolean shouldLaunchRedirect(QrCodeAction action) {
        return !CollectionsKt.I(VIEWABLE_PAYMENT_METHODS, action.getPaymentMethodType());
    }

    private final void startStatusPolling(String paymentData, QrCodeAction action) {
        i1 i1Var = this.statusPollingJob;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.statusPollingJob = r.u(getCoroutineScope(), new w(this.statusRepository.poll(paymentData, this.maxPollingDurationMillis), new C01071(action, null), 5));
    }

    @Override // com.adyen.checkout.qrcode.internal.ui.QRCodeDelegate
    public void downloadQRImage(@NotNull Context context) {
        context.getClass();
        String paymentMethodType = getOutputData().getPaymentMethodType();
        if (paymentMethodType == null) {
            paymentMethodType = "";
        }
        DateUtils dateUtils = DateUtils.INSTANCE;
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        String dateToString$default = DateUtils.formatDateToString$default(dateUtils, calendar, null, 2, null);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(IMAGE_NAME_FORMAT, Arrays.copyOf(new Object[]{paymentMethodType, dateToString$default}, 2));
        AnalyticsEvent.Info infoDownload = GenericEvents.INSTANCE.download(paymentMethodType, ANALYTICS_TARGET_QR_BUTTON);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.trackEvent(infoDownload);
        }
        f0.B(getCoroutineScope(), null, null, new C01051(context, str, null), 3);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.DetailsEmittingDelegate
    @NotNull
    public i getDetailsFlow() {
        return this.detailsFlow;
    }

    @Override // com.adyen.checkout.qrcode.internal.ui.QRCodeDelegate
    @NotNull
    public i getEventFlow() {
        return this.eventFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    @NotNull
    public i getExceptionFlow() {
        return this.exceptionFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ViewableDelegate
    @NotNull
    public QRCodeOutputData getOutputData() {
        return (QRCodeOutputData) ((a2) this._outputDataFlow).getValue();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ViewableDelegate
    @NotNull
    public i getOutputDataFlow() {
        return this.outputDataFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PermissionRequestingDelegate
    @NotNull
    public i getPermissionFlow() {
        return this.permissionFlow;
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
        if (!(action instanceof QrCodeAction)) {
            emitError(new ComponentException("Unsupported action", null, 2, null));
            return;
        }
        QrCodeAction qrCodeAction = (QrCodeAction) action;
        setAction(qrCodeAction);
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
        launchAction(qrCodeAction, activity);
        initState(qrCodeAction);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.IntentHandlingDelegate
    public void handleIntent(@NotNull Intent intent) {
        intent.getClass();
        try {
            emitDetails(this.redirectHandler.parseRedirectResult(intent.getData()));
        } catch (CheckoutException e5) {
            emitError(e5);
        }
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
        this.observerRepository.addObservers(getDetailsFlow(), getExceptionFlow(), getPermissionFlow(), lifecycleOwner, coroutineScope, callback);
        LifecycleExtensionsKt.repeatOnResume(lifecycleOwner, new Function0<Unit>() { // from class: com.adyen.checkout.qrcode.internal.ui.DefaultQRCodeDelegate.observe.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m104invoke();
                return Unit.f26487a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m104invoke() {
                DefaultQRCodeDelegate.this.refreshStatus();
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
        this.statusCountDownTimer.cancel();
        this._coroutineScope = null;
        this.redirectHandler.removeOnRedirectListener();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void onError(@NotNull CheckoutException e5) {
        e5.getClass();
        emitError(e5);
    }

    public final void onTimerTick$qr_code_release(long millisUntilFinished) {
        int i11 = (int) ((((long) 100) * millisUntilFinished) / this.maxPollingDurationMillis);
        ((a2) this._timerFlow).j(new TimerData(millisUntilFinished, i11));
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

    @Override // com.adyen.checkout.core.internal.ui.PermissionHandler
    public void requestPermission(@NotNull Context context, @NotNull String requiredPermission, @NotNull PermissionHandlerCallback callback) {
        context.getClass();
        requiredPermission.getClass();
        callback.getClass();
        this.permissionChannel.h(new PermissionRequestData(requiredPermission, callback));
    }

    @Override // com.adyen.checkout.components.core.internal.ui.RedirectableDelegate
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        this.redirectHandler.setOnRedirectListener(listener);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/adyen/checkout/qrcode/internal/ui/DefaultQRCodeDelegate$Companion;", "", "()V", "ACTION_KEY", "", "getACTION_KEY$qr_code_release$annotations", "ANALYTICS_TARGET_QR_BUTTON", "getANALYTICS_TARGET_QR_BUTTON$qr_code_release$annotations", "DEFAULT_MAX_POLLING_DURATION", "", "HUNDRED", "", "IMAGE_NAME_FORMAT", "PAYLOAD_DETAILS_KEY", "getPAYLOAD_DETAILS_KEY$qr_code_release$annotations", "QR_IMAGE_BASE_PATH", "STATUS_POLLING_INTERVAL_MILLIS", "VIEWABLE_PAYMENT_METHODS", "", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getACTION_KEY$qr_code_release$annotations() {
        }

        public static /* synthetic */ void getANALYTICS_TARGET_QR_BUTTON$qr_code_release$annotations() {
        }

        public static /* synthetic */ void getPAYLOAD_DETAILS_KEY$qr_code_release$annotations() {
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public GenericComponentParams getComponentParams() {
        return this.componentParams;
    }

    /* JADX INFO: renamed from: com.adyen.checkout.qrcode.internal.ui.DefaultQRCodeDelegate$startStatusPolling$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.qrcode.internal.ui.DefaultQRCodeDelegate$startStatusPolling$1", f = "DefaultQRCodeDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu70/q;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "it", "", "<anonymous>", "(Lu70/q;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C01071 extends z70.i implements Function2<q<? extends StatusResponse>, c<? super Unit>, Object> {
        final /* synthetic */ QrCodeAction $action;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01071(QrCodeAction qrCodeAction, c<? super C01071> cVar) {
            super(2, cVar);
            this.$action = qrCodeAction;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C01071 c01071 = DefaultQRCodeDelegate.this.new C01071(this.$action, cVar);
            c01071.L$0 = obj;
            return c01071;
        }

        @Nullable
        public final Object invoke(@NotNull Object obj, @Nullable c<? super Unit> cVar) {
            return ((C01071) create(new q(obj), cVar)).invokeSuspend(Unit.f26487a);
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
            DefaultQRCodeDelegate.this.onStatus(((q) this.L$0).f40851a, this.$action);
            return Unit.f26487a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((q) obj).f40851a, (c<? super Unit>) obj2);
        }
    }

    private final QRCodeOutputData createOutputData() {
        return new QRCodeOutputData(false, null, null, null, null, 24, null);
    }
}
