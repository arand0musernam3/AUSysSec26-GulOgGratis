package com.adyen.checkout.adyen3ds2.internal.ui;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import com.adyen.checkout.adyen3ds2.Authentication3DS2Exception;
import com.adyen.checkout.adyen3ds2.internal.analytics.ThreeDS2Events;
import com.adyen.checkout.adyen3ds2.internal.data.api.SubmitFingerprintRepository;
import com.adyen.checkout.adyen3ds2.internal.data.model.Adyen3DS2Serializer;
import com.adyen.checkout.adyen3ds2.internal.data.model.ChallengeToken;
import com.adyen.checkout.adyen3ds2.internal.data.model.FingerprintToken;
import com.adyen.checkout.adyen3ds2.internal.data.model.SubmitFingerprintResult;
import com.adyen.checkout.adyen3ds2.internal.ui.model.Adyen3DS2ComponentParams;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.BaseThreeds2Action;
import com.adyen.checkout.components.core.action.RedirectAction;
import com.adyen.checkout.components.core.action.Threeds2Action;
import com.adyen.checkout.components.core.action.Threeds2ChallengeAction;
import com.adyen.checkout.components.core.action.Threeds2FingerprintAction;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionObserverRepository;
import com.adyen.checkout.components.core.internal.PaymentDataRepository;
import com.adyen.checkout.components.core.internal.SavedStateHandleContainer;
import com.adyen.checkout.components.core.internal.SavedStateHandleProperty;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.ErrorEvent;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.ui.core.internal.RedirectHandler;
import com.adyen.threeds2.AuthenticationRequestParameters;
import com.adyen.threeds2.ChallengeResult;
import com.adyen.threeds2.ChallengeStatusHandler;
import com.adyen.threeds2.ThreeDS2Service;
import com.adyen.threeds2.Transaction;
import com.adyen.threeds2.TransactionResult;
import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.exception.SDKNotInitializedException;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.adyen.threeds2.parameters.ChallengeParameters;
import com.adyen.threeds2.parameters.ConfigParameters;
import com.adyen.threeds2.util.AdyenConfigParameters;
import com.braze.models.inappmessage.InAppMessageBase;
import f80.a;
import j4.s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import v80.b0;
import v80.f0;
import v80.x;
import v80.y;
import x80.m;
import y80.i;
import y80.r;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 Ç\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Ç\u0001Ba\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J3\u0010&\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001eH\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J'\u00106\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b4\u00105J\u001f\u0010:\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\u0006\u00107\u001a\u000200H\u0001¢\u0006\u0004\b8\u00109J\u0017\u0010=\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u001d\u0010I\u001a\u00020\u001e2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001e0GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u001eH\u0016¢\u0006\u0004\bK\u0010)J\u001f\u0010M\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020L2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020O2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\bP\u0010QJ\u001f\u0010S\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020R2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\bS\u0010TJ'\u0010W\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020R2\u0006\u0010-\u001a\u00020,2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020Z2\u0006\u0010Y\u001a\u000200H\u0002¢\u0006\u0004\b[\u0010\\J\u0019\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010]\u001a\u00020ZH\u0002¢\u0006\u0004\b_\u0010`J\u0019\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010]\u001a\u00020ZH\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\u0002002\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bf\u0010gJ \u00103\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\u0006\u0010h\u001a\u000200H\u0082@¢\u0006\u0004\b3\u0010iJ\u001f\u0010k\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020j2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020mH\u0002¢\u0006\u0004\bn\u0010oJ\u001f\u0010q\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020pH\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010v\u001a\u00020u2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020\u001e2\u0006\u0010x\u001a\u000200H\u0002¢\u0006\u0004\by\u0010zJ\u0017\u0010|\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020{H\u0002¢\u0006\u0004\b|\u0010}J\u0018\u0010\u007f\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020~H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010E\u001a\u00020\u001e2\u0007\u0010@\u001a\u00030\u0081\u0001H\u0002¢\u0006\u0005\bE\u0010\u0082\u0001J\u0019\u0010\u0083\u0001\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020mH\u0002¢\u0006\u0005\b\u0083\u0001\u0010oJ\u001a\u0010\u0084\u0001\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0085\u0001J#\u0010\u0088\u0001\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*2\u0007\u0010\u0087\u0001\u001a\u000200H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J)\u0010\u008c\u0001\u001a\u00020\u001e2\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u000b\b\u0002\u0010\u0087\u0001\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J)\u0010\u008e\u0001\u001a\u00020\u001e2\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u000b\b\u0002\u0010\u0087\u0001\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008d\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u008f\u0001\u0010)J\u0011\u0010\u0090\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u0090\u0001\u0010)J\u0019\u0010\u0091\u0001\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0005\b\u0091\u0001\u0010FJ'\u0010\u0095\u0001\u001a\u00020\u001e2\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\t\b\u0002\u0010\u0094\u0001\u001a\u000202H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J(\u0010\u0098\u0001\u001a\u00030\u0092\u00012\u0006\u0010x\u001a\u0002002\u000b\b\u0002\u0010\u0097\u0001\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u009a\u0001\u0010)R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u009b\u0001R\u001d\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0007\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001d\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\t\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010¢\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010£\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010¤\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010¥\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010¦\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010§\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010¨\u0001R\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010©\u0001R\u001f\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R'\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010®\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u001e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020C0ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010\u00ad\u0001R&\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020C0®\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010°\u0001\u001a\u0006\bµ\u0001\u0010²\u0001R)\u0010·\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00010®\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b·\u0001\u0010°\u0001\u001a\u0006\b¸\u0001\u0010²\u0001R\u001b\u0010¹\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001b\u0010»\u0001\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R8\u0010+\u001a\u0005\u0018\u00010½\u00012\n\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006È\u0001"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/ui/DefaultAdyen3DS2Delegate;", "Lcom/adyen/checkout/adyen3ds2/internal/ui/Adyen3DS2Delegate;", "Lcom/adyen/threeds2/ChallengeStatusHandler;", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleContainer;", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "observerRepository", "Landroidx/lifecycle/c1;", "savedStateHandle", "Lcom/adyen/checkout/adyen3ds2/internal/ui/model/Adyen3DS2ComponentParams;", "componentParams", "Lcom/adyen/checkout/adyen3ds2/internal/data/api/SubmitFingerprintRepository;", "submitFingerprintRepository", "Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;", "paymentDataRepository", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/Adyen3DS2Serializer;", "adyen3DS2Serializer", "Lcom/adyen/checkout/ui/core/internal/RedirectHandler;", "redirectHandler", "Lcom/adyen/threeds2/ThreeDS2Service;", "threeDS2Service", "Lv80/x;", "coroutineDispatcher", "Landroid/app/Application;", "application", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "<init>", "(Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;Landroidx/lifecycle/c1;Lcom/adyen/checkout/adyen3ds2/internal/ui/model/Adyen3DS2ComponentParams;Lcom/adyen/checkout/adyen3ds2/internal/data/api/SubmitFingerprintRepository;Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;Lcom/adyen/checkout/adyen3ds2/internal/data/model/Adyen3DS2Serializer;Lcom/adyen/checkout/ui/core/internal/RedirectHandler;Lcom/adyen/threeds2/ThreeDS2Service;Lv80/x;Landroid/app/Application;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;)V", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "Landroid/app/Activity;", "activity", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "", "encodedFingerprintToken", "", "submitFingerprintAutomatically", "identifyShopper$3ds2_release", "(Landroid/app/Activity;Ljava/lang/String;Z)V", "identifyShopper", "encodedChallengeToken", "challengeShopper$3ds2_release", "(Landroid/app/Activity;Ljava/lang/String;)V", "challengeShopper", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", "Lcom/adyen/threeds2/ChallengeResult;", "result", "onCompletion", "(Lcom/adyen/threeds2/ChallengeResult;)V", "Lcom/adyen/checkout/core/exception/CheckoutException;", "e", "onError", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "onCleared", "Lcom/adyen/checkout/components/core/action/Threeds2FingerprintAction;", "handleThreeds2FingerprintAction", "(Lcom/adyen/checkout/components/core/action/Threeds2FingerprintAction;Landroid/app/Activity;)V", "Lcom/adyen/checkout/components/core/action/Threeds2ChallengeAction;", "handleThreeds2ChallengeAction", "(Lcom/adyen/checkout/components/core/action/Threeds2ChallengeAction;Landroid/app/Activity;)V", "Lcom/adyen/checkout/components/core/action/Threeds2Action;", "handleThreeds2Action", "(Lcom/adyen/checkout/components/core/action/Threeds2Action;Landroid/app/Activity;)V", "Lcom/adyen/checkout/components/core/action/Threeds2Action$SubType;", "subtype", "handleThreeds2ActionSubtype", "(Lcom/adyen/checkout/components/core/action/Threeds2Action;Landroid/app/Activity;Lcom/adyen/checkout/components/core/action/Threeds2Action$SubType;)V", "encoded", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/FingerprintToken;", "decodeFingerprintToken", "(Ljava/lang/String;)Lcom/adyen/checkout/adyen3ds2/internal/data/model/FingerprintToken;", "fingerprintToken", "Lcom/adyen/threeds2/parameters/ConfigParameters;", "createAdyenConfigParameters", "(Lcom/adyen/checkout/adyen3ds2/internal/data/model/FingerprintToken;)Lcom/adyen/threeds2/parameters/ConfigParameters;", "Lcom/adyen/threeds2/Transaction;", "createTransaction", "(Lcom/adyen/checkout/adyen3ds2/internal/data/model/FingerprintToken;)Lcom/adyen/threeds2/Transaction;", "Lcom/adyen/threeds2/AuthenticationRequestParameters;", "authenticationRequestParameters", "createEncodedFingerprint", "(Lcom/adyen/threeds2/AuthenticationRequestParameters;)Ljava/lang/String;", "encodedFingerprint", "(Landroid/app/Activity;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult;", "onSubmitFingerprintResult", "(Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResult;Landroid/app/Activity;)V", "Lcom/adyen/checkout/adyen3ds2/internal/analytics/ThreeDS2Events$Result;", "trackFingerprintCompletedEvent", "(Lcom/adyen/checkout/adyen3ds2/internal/analytics/ThreeDS2Events$Result;)V", "Lcom/adyen/checkout/components/core/action/RedirectAction;", "makeRedirect", "(Landroid/app/Activity;Lcom/adyen/checkout/components/core/action/RedirectAction;)V", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/ChallengeToken;", "challenge", "Lcom/adyen/threeds2/parameters/ChallengeParameters;", "createChallengeParameters", "(Lcom/adyen/checkout/adyen3ds2/internal/data/model/ChallengeToken;)Lcom/adyen/threeds2/parameters/ChallengeParameters;", "transactionStatus", "onCompleted", "(Ljava/lang/String;)V", "Lcom/adyen/threeds2/ChallengeResult$Cancelled;", "onCancelled", "(Lcom/adyen/threeds2/ChallengeResult$Cancelled;)V", "Lcom/adyen/threeds2/ChallengeResult$Timeout;", "onTimeout", "(Lcom/adyen/threeds2/ChallengeResult$Timeout;)V", "Lcom/adyen/threeds2/ChallengeResult$Error;", "(Lcom/adyen/threeds2/ChallengeResult$Error;)V", "trackChallengeCompletedEvent", "trackFingerprintActionEvent", "(Lcom/adyen/checkout/components/core/action/Action;)V", "trackChallengeActionEvent", InAppMessageBase.MESSAGE, "trackActionEvent", "(Lcom/adyen/checkout/components/core/action/Action;Ljava/lang/String;)V", "Lcom/adyen/checkout/components/core/internal/analytics/ErrorEvent;", "errorEvent", "trackFingerprintErrorEvent", "(Lcom/adyen/checkout/components/core/internal/analytics/ErrorEvent;Ljava/lang/String;)V", "trackChallengeErrorEvent", "closeTransaction", "cleanUp3DS2", "emitError", "Lorg/json/JSONObject;", ErrorBundle.DETAIL_ENTRY, "shouldClearState", "emitDetails", "(Lorg/json/JSONObject;Z)V", "errorDetails", "makeDetails", "(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;", "clearState", "Lcom/adyen/checkout/components/core/internal/ActionObserverRepository;", "Landroidx/lifecycle/c1;", "getSavedStateHandle", "()Landroidx/lifecycle/c1;", "Lcom/adyen/checkout/adyen3ds2/internal/ui/model/Adyen3DS2ComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/adyen3ds2/internal/ui/model/Adyen3DS2ComponentParams;", "Lcom/adyen/checkout/adyen3ds2/internal/data/api/SubmitFingerprintRepository;", "Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/Adyen3DS2Serializer;", "Lcom/adyen/checkout/ui/core/internal/RedirectHandler;", "Lcom/adyen/threeds2/ThreeDS2Service;", "Lv80/x;", "Landroid/app/Application;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lx80/m;", "Lcom/adyen/checkout/components/core/ActionComponentData;", "detailsChannel", "Lx80/m;", "Ly80/i;", "detailsFlow", "Ly80/i;", "getDetailsFlow", "()Ly80/i;", "exceptionChannel", "exceptionFlow", "getExceptionFlow", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "viewFlow", "getViewFlow", "_coroutineScope", "Lv80/b0;", "currentTransaction", "Lcom/adyen/threeds2/Transaction;", "Lcom/adyen/checkout/components/core/action/BaseThreeds2Action;", "<set-?>", "action$delegate", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleProperty;", "getAction", "()Lcom/adyen/checkout/components/core/action/BaseThreeds2Action;", "setAction", "(Lcom/adyen/checkout/components/core/action/BaseThreeds2Action;)V", "getCoroutineScope", "()Lv80/b0;", "Companion", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultAdyen3DS2Delegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAdyen3DS2Delegate.kt\ncom/adyen/checkout/adyen3ds2/internal/ui/DefaultAdyen3DS2Delegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,753:1\n16#2,17:754\n16#2,17:775\n16#2,17:792\n16#2,17:809\n16#2,17:826\n16#2,17:843\n16#2,17:860\n16#2,17:877\n16#2,17:894\n46#3,4:771\n*S KotlinDebug\n*F\n+ 1 DefaultAdyen3DS2Delegate.kt\ncom/adyen/checkout/adyen3ds2/internal/ui/DefaultAdyen3DS2Delegate\n*L\n250#1:754,17\n345#1:775,17\n379#1:792,17\n482#1:809,17\n492#1:826,17\n563#1:843,17\n577#1:860,17\n591#1:877,17\n605#1:894,17\n271#1:771,4\n*E\n"})
public final class DefaultAdyen3DS2Delegate implements Adyen3DS2Delegate, ChallengeStatusHandler, SavedStateHandleContainer {

    @NotNull
    public static final String ACTION_KEY = "ACTION_KEY";
    private static final int DEFAULT_CHALLENGE_TIME_OUT = 10;

    @NotNull
    private static final String PROTOCOL_VERSION_2_1_0 = "2.1.0";

    @Nullable
    private b0 _coroutineScope;

    /* JADX INFO: renamed from: action$delegate, reason: from kotlin metadata */
    @NotNull
    private final SavedStateHandleProperty action;

    @NotNull
    private final Adyen3DS2Serializer adyen3DS2Serializer;

    @Nullable
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final Application application;

    @NotNull
    private final Adyen3DS2ComponentParams componentParams;

    @NotNull
    private final x coroutineDispatcher;

    @Nullable
    private Transaction currentTransaction;

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
    private final PaymentDataRepository paymentDataRepository;

    @NotNull
    private final RedirectHandler redirectHandler;

    @NotNull
    private final c1 savedStateHandle;

    @NotNull
    private final SubmitFingerprintRepository submitFingerprintRepository;

    @NotNull
    private final ThreeDS2Service threeDS2Service;

    @NotNull
    private final i viewFlow;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {s.t(DefaultAdyen3DS2Delegate.class, "action", "getAction()Lcom/adyen/checkout/components/core/action/BaseThreeds2Action;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Threeds2Action.SubType.values().length];
            try {
                iArr[Threeds2Action.SubType.FINGERPRINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Threeds2Action.SubType.CHALLENGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.adyen3ds2.internal.ui.DefaultAdyen3DS2Delegate$submitFingerprintAutomatically$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.adyen3ds2.internal.ui.DefaultAdyen3DS2Delegate", f = "DefaultAdyen3DS2Delegate.kt", l = {433}, m = "submitFingerprintAutomatically")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultAdyen3DS2Delegate.this.submitFingerprintAutomatically(null, null, this);
        }
    }

    public DefaultAdyen3DS2Delegate(@NotNull ActionObserverRepository actionObserverRepository, @NotNull c1 c1Var, @NotNull Adyen3DS2ComponentParams adyen3DS2ComponentParams, @NotNull SubmitFingerprintRepository submitFingerprintRepository, @NotNull PaymentDataRepository paymentDataRepository, @NotNull Adyen3DS2Serializer adyen3DS2Serializer, @NotNull RedirectHandler redirectHandler, @NotNull ThreeDS2Service threeDS2Service, @NotNull x xVar, @NotNull Application application, @Nullable AnalyticsManager analyticsManager) {
        actionObserverRepository.getClass();
        c1Var.getClass();
        adyen3DS2ComponentParams.getClass();
        submitFingerprintRepository.getClass();
        paymentDataRepository.getClass();
        adyen3DS2Serializer.getClass();
        redirectHandler.getClass();
        threeDS2Service.getClass();
        xVar.getClass();
        application.getClass();
        this.observerRepository = actionObserverRepository;
        this.savedStateHandle = c1Var;
        this.componentParams = adyen3DS2ComponentParams;
        this.submitFingerprintRepository = submitFingerprintRepository;
        this.paymentDataRepository = paymentDataRepository;
        this.adyen3DS2Serializer = adyen3DS2Serializer;
        this.redirectHandler = redirectHandler;
        this.threeDS2Service = threeDS2Service;
        this.coroutineDispatcher = xVar;
        this.application = application;
        this.analyticsManager = analyticsManager;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.detailsChannel = mVarBufferedChannel;
        this.detailsFlow = r.w(mVarBufferedChannel);
        m mVarBufferedChannel2 = ChannelExtensionsKt.bufferedChannel();
        this.exceptionChannel = mVarBufferedChannel2;
        this.exceptionFlow = r.w(mVarBufferedChannel2);
        this.viewFlow = r.c(Adyen3DS2ComponentViewType.INSTANCE);
        this.action = new SavedStateHandleProperty("ACTION_KEY");
    }

    private final void cleanUp3DS2() {
        try {
            this.threeDS2Service.cleanup(this.application);
        } catch (SDKNotInitializedException unused) {
        }
    }

    private final void clearState() {
        setAction(null);
        SharedChallengeStatusHandler.INSTANCE.reset();
        closeTransaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeTransaction() {
        Transaction transaction = this.currentTransaction;
        if (transaction != null) {
            transaction.close();
        }
        this.currentTransaction = null;
        cleanUp3DS2();
    }

    private final ConfigParameters createAdyenConfigParameters(FingerprintToken fingerprintToken) {
        String directoryServerId = fingerprintToken.getDirectoryServerId();
        String directoryServerPublicKey = fingerprintToken.getDirectoryServerPublicKey();
        String directoryServerRootCertificates = fingerprintToken.getDirectoryServerRootCertificates();
        if (directoryServerId != null && directoryServerPublicKey != null && directoryServerRootCertificates != null) {
            return new AdyenConfigParameters.Builder(directoryServerId, directoryServerPublicKey, directoryServerRootCertificates).deviceParameterBlockList(getComponentParams().getDeviceParameterBlockList()).build();
        }
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAdyen3DS2Delegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "directoryServerId, directoryServerPublicKey or directoryServerRootCertificates is null.", null);
        }
        return null;
    }

    private final ChallengeParameters createChallengeParameters(ChallengeToken challenge) {
        ChallengeParameters challengeParameters = new ChallengeParameters();
        challengeParameters.set3DSServerTransactionID(challenge.getThreeDSServerTransID());
        challengeParameters.setAcsTransactionID(challenge.getAcsTransID());
        challengeParameters.setAcsRefNumber(challenge.getAcsReferenceNumber());
        challengeParameters.setAcsSignedContent(challenge.getAcsSignedContent());
        if (!Intrinsics.areEqual(challenge.getMessageVersion(), PROTOCOL_VERSION_2_1_0)) {
            challengeParameters.setThreeDSRequestorAppURL(getComponentParams().getThreeDSRequestorAppURL());
        }
        return challengeParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String createEncodedFingerprint(AuthenticationRequestParameters authenticationRequestParameters) throws ComponentException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkAppID", authenticationRequestParameters.getSDKAppID());
            jSONObject.put("sdkEncData", authenticationRequestParameters.getDeviceData());
            jSONObject.put("sdkEphemPubKey", new JSONObject(authenticationRequestParameters.getSDKEphemeralPublicKey()));
            jSONObject.put("sdkReferenceNumber", authenticationRequestParameters.getSDKReferenceNumber());
            jSONObject.put("sdkTransID", authenticationRequestParameters.getSDKTransactionID());
            jSONObject.put("messageVersion", authenticationRequestParameters.getMessageVersion());
            a aVar = f80.c.f17515f;
            String string = jSONObject.toString();
            string.getClass();
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            bytes.getClass();
            return f80.c.b(aVar, bytes);
        } catch (JSONException e5) {
            throw new ComponentException("Failed to create encoded fingerprint", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Transaction createTransaction(FingerprintToken fingerprintToken) {
        if (fingerprintToken.getThreeDSMessageVersion() == null) {
            trackFingerprintErrorEvent(ErrorEvent.THREEDS2_TRANSACTION_CREATION, "Transaction creation failed because threeDSMessageVersion is missing");
            emitError(new ComponentException("Failed to create 3DS2 Transaction. Missing threeDSMessageVersion inside fingerprintToken.", null, 2, null));
            return null;
        }
        AnalyticsEvent.Log logThreeDS2Fingerprint$default = ThreeDS2Events.threeDS2Fingerprint$default(ThreeDS2Events.INSTANCE, ThreeDS2Events.SubType.FINGERPRINT_DATA_SENT, null, null, 6, null);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.trackEvent(logThreeDS2Fingerprint$default);
        }
        try {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultAdyen3DS2Delegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "create transaction", null);
            }
            TransactionResult transactionResultCreateTransaction = this.threeDS2Service.createTransaction(null, fingerprintToken.getThreeDSMessageVersion());
            if (transactionResultCreateTransaction instanceof TransactionResult.Failure) {
                emitDetails$default(this, makeDetails(((TransactionResult.Failure) transactionResultCreateTransaction).getTransactionStatus(), ((TransactionResult.Failure) transactionResultCreateTransaction).getAdditionalDetails()), false, 2, null);
                return null;
            }
            if (transactionResultCreateTransaction instanceof TransactionResult.Success) {
                return ((TransactionResult.Success) transactionResultCreateTransaction).getTransaction();
            }
            throw new NoWhenBranchMatchedException();
        } catch (SDKNotInitializedException e5) {
            trackFingerprintErrorEvent(ErrorEvent.THREEDS2_TRANSACTION_CREATION, "Transaction creation failed because the SDK is not initialized");
            emitError(new ComponentException("Failed to create 3DS2 Transaction", e5));
            return null;
        } catch (SDKRuntimeException e11) {
            trackFingerprintErrorEvent(ErrorEvent.THREEDS2_TRANSACTION_CREATION, "Transaction creation failed because SDK threw runtime exception");
            emitError(new ComponentException("Failed to create 3DS2 Transaction", e11));
            return null;
        }
    }

    private final FingerprintToken decodeFingerprintToken(String encoded) throws ComponentException, ModelSerializationException {
        try {
            return (FingerprintToken) FingerprintToken.SERIALIZER.deserialize(new JSONObject(new String(f80.c.a(f80.c.f17515f, encoded, 0, 6), Charsets.UTF_8)));
        } catch (JSONException e5) {
            throw new ComponentException("JSON parsing of FingerprintToken failed", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitDetails(JSONObject details, boolean shouldClearState) {
        this.detailsChannel.h(new ActionComponentData(this.paymentDataRepository.getPaymentData(), details));
        if (shouldClearState) {
            clearState();
        }
    }

    public static /* synthetic */ void emitDetails$default(DefaultAdyen3DS2Delegate defaultAdyen3DS2Delegate, JSONObject jSONObject, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        defaultAdyen3DS2Delegate.emitDetails(jSONObject, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitError(CheckoutException e5) {
        this.exceptionChannel.h(e5);
        clearState();
    }

    private final BaseThreeds2Action getAction() {
        return (BaseThreeds2Action) this.action.getValue((SavedStateHandleContainer) this, $$delegatedProperties[0]);
    }

    private final b0 getCoroutineScope() {
        b0 b0Var = this._coroutineScope;
        if (b0Var != null) {
            return b0Var;
        }
        i4.a.f("Required value was null.");
        return null;
    }

    private final void handleThreeds2Action(Threeds2Action action, Activity activity) {
        if (action.getSubtype() == null) {
            emitError(new ComponentException("3DS2 Action subtype not found.", null, 2, null));
            return;
        }
        Threeds2Action.SubType.Companion companion = Threeds2Action.SubType.INSTANCE;
        String subtype = action.getSubtype();
        if (subtype == null) {
            subtype = "";
        }
        handleThreeds2ActionSubtype(action, activity, companion.parse(subtype));
    }

    private final void handleThreeds2ActionSubtype(Threeds2Action action, Activity activity, Threeds2Action.SubType subtype) {
        String token = action.getToken();
        if (token == null || token.length() == 0) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[subtype.ordinal()];
            if (i11 == 1) {
                trackFingerprintErrorEvent(ErrorEvent.THREEDS2_TOKEN_MISSING, "Token is missing for Threeds2Action");
            } else if (i11 == 2) {
                trackChallengeErrorEvent(ErrorEvent.THREEDS2_TOKEN_MISSING, "Token is missing for Threeds2Action");
            }
            emitError(new ComponentException("3DS2 token not found.", null, 2, null));
            return;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[subtype.ordinal()];
        if (i12 == 1) {
            trackFingerprintActionEvent(action);
            identifyShopper$3ds2_release(activity, token, true);
        } else {
            if (i12 != 2) {
                return;
            }
            trackChallengeActionEvent(action);
            challengeShopper$3ds2_release(activity, token);
        }
    }

    private final void handleThreeds2ChallengeAction(Threeds2ChallengeAction action, Activity activity) {
        String token = action.getToken();
        if (token == null || token.length() == 0) {
            trackChallengeErrorEvent(ErrorEvent.THREEDS2_TOKEN_MISSING, "Token is missing for Threeds2ChallengeAction");
            emitError(new ComponentException("Challenge token not found.", null, 2, null));
            return;
        }
        trackChallengeActionEvent(action);
        String token2 = action.getToken();
        if (token2 == null) {
            token2 = "";
        }
        challengeShopper$3ds2_release(activity, token2);
    }

    private final void handleThreeds2FingerprintAction(Threeds2FingerprintAction action, Activity activity) {
        String token = action.getToken();
        if (token == null || token.length() == 0) {
            trackFingerprintErrorEvent(ErrorEvent.THREEDS2_TOKEN_MISSING, "Token is missing for Threeds2FingerprintAction");
            emitError(new ComponentException("Fingerprint token not found.", null, 2, null));
            return;
        }
        trackFingerprintActionEvent(action);
        String token2 = action.getToken();
        if (token2 == null) {
            token2 = "";
        }
        identifyShopper$3ds2_release(activity, token2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject makeDetails(String transactionStatus, String errorDetails) {
        BaseThreeds2Action action = getAction();
        Threeds2Action threeds2Action = action instanceof Threeds2Action ? (Threeds2Action) action : null;
        String authorisationToken = threeds2Action != null ? threeds2Action.getAuthorisationToken() : null;
        Adyen3DS2Serializer adyen3DS2Serializer = this.adyen3DS2Serializer;
        return authorisationToken == null ? adyen3DS2Serializer.createChallengeDetails(transactionStatus, errorDetails) : adyen3DS2Serializer.createThreeDsResultDetails(transactionStatus, authorisationToken, errorDetails);
    }

    public static /* synthetic */ JSONObject makeDetails$default(DefaultAdyen3DS2Delegate defaultAdyen3DS2Delegate, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return defaultAdyen3DS2Delegate.makeDetails(str, str2);
    }

    private final void makeRedirect(Activity activity, RedirectAction action) {
        String url = action.getUrl();
        try {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultAdyen3DS2Delegate.class.getName();
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

    private final void onCancelled(ChallengeResult.Cancelled result) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAdyen3DS2Delegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "challenge cancelled", null);
        }
        try {
            emitDetails$default(this, makeDetails(result.getTransactionStatus(), result.getAdditionalDetails()), false, 2, null);
        } catch (CheckoutException e5) {
            trackChallengeErrorEvent(ErrorEvent.THREEDS2_CHALLENGE_HANDLING, "Challenge is cancelled and details cannot be created");
            emitError(e5);
        }
    }

    private final void onCompleted(String transactionStatus) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAdyen3DS2Delegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "challenge completed", null);
        }
        try {
            emitDetails$default(this, makeDetails$default(this, transactionStatus, null, 2, null), false, 2, null);
        } catch (CheckoutException e5) {
            trackChallengeErrorEvent(ErrorEvent.THREEDS2_CHALLENGE_HANDLING, "Challenge completed and details cannot be created");
            emitError(e5);
        }
    }

    private final void onError(ChallengeResult.Error result) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAdyen3DS2Delegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "challenge error", null);
        }
        try {
            emitDetails$default(this, makeDetails(result.getTransactionStatus(), result.getAdditionalDetails()), false, 2, null);
        } catch (CheckoutException e5) {
            trackChallengeErrorEvent(ErrorEvent.THREEDS2_CHALLENGE_HANDLING, "Challenge failed and details cannot be created");
            emitError(e5);
        }
    }

    private final void onSubmitFingerprintResult(SubmitFingerprintResult result, Activity activity) {
        this.paymentDataRepository.setPaymentData(null);
        if (result instanceof SubmitFingerprintResult.Completed) {
            trackFingerprintCompletedEvent(ThreeDS2Events.Result.COMPLETED);
            emitDetails$default(this, ((SubmitFingerprintResult.Completed) result).getDetails(), false, 2, null);
        } else if (result instanceof SubmitFingerprintResult.Redirect) {
            trackFingerprintCompletedEvent(ThreeDS2Events.Result.REDIRECT);
            makeRedirect(activity, ((SubmitFingerprintResult.Redirect) result).getAction());
        } else if (result instanceof SubmitFingerprintResult.Threeds2) {
            trackFingerprintCompletedEvent(ThreeDS2Events.Result.THREEDS2);
            handleAction(((SubmitFingerprintResult.Threeds2) result).getAction(), activity);
        }
    }

    private final void onTimeout(ChallengeResult.Timeout result) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAdyen3DS2Delegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "challenge timed out", null);
        }
        try {
            emitDetails$default(this, makeDetails(result.getTransactionStatus(), result.getAdditionalDetails()), false, 2, null);
        } catch (CheckoutException e5) {
            trackChallengeErrorEvent(ErrorEvent.THREEDS2_CHALLENGE_HANDLING, "Challenge timed out and details cannot be created");
            emitError(e5);
        }
    }

    private final void setAction(BaseThreeds2Action baseThreeds2Action) {
        this.action.setValue((SavedStateHandleContainer) this, $$delegatedProperties[0], baseThreeds2Action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitFingerprintAutomatically(android.app.Activity r6, java.lang.String r7, x70.c<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.adyen.checkout.adyen3ds2.internal.ui.DefaultAdyen3DS2Delegate.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.adyen.checkout.adyen3ds2.internal.ui.DefaultAdyen3DS2Delegate$submitFingerprintAutomatically$1 r0 = (com.adyen.checkout.adyen3ds2.internal.ui.DefaultAdyen3DS2Delegate.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.adyen3ds2.internal.ui.DefaultAdyen3DS2Delegate$submitFingerprintAutomatically$1 r0 = new com.adyen.checkout.adyen3ds2.internal.ui.DefaultAdyen3DS2Delegate$submitFingerprintAutomatically$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r7 = r0.L$0
            com.adyen.checkout.adyen3ds2.internal.ui.DefaultAdyen3DS2Delegate r7 = (com.adyen.checkout.adyen3ds2.internal.ui.DefaultAdyen3DS2Delegate) r7
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r8 = r8.f40851a
            goto L5b
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L3a:
            ba0.g.M(r8)
            com.adyen.checkout.adyen3ds2.internal.data.api.SubmitFingerprintRepository r8 = r5.submitFingerprintRepository
            com.adyen.checkout.adyen3ds2.internal.ui.model.Adyen3DS2ComponentParams r2 = r5.getComponentParams()
            java.lang.String r2 = r2.getClientKey()
            com.adyen.checkout.components.core.internal.PaymentDataRepository r4 = r5.paymentDataRepository
            java.lang.String r4 = r4.getPaymentData()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r8.m73submitFingerprintBWLJW6A(r7, r2, r4, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r7 = r5
        L5b:
            java.lang.Throwable r0 = u70.q.a(r8)
            if (r0 != 0) goto L67
            com.adyen.checkout.adyen3ds2.internal.data.model.SubmitFingerprintResult r8 = (com.adyen.checkout.adyen3ds2.internal.data.model.SubmitFingerprintResult) r8
            r7.onSubmitFingerprintResult(r8, r6)
            goto L78
        L67:
            com.adyen.checkout.components.core.internal.analytics.ErrorEvent r6 = com.adyen.checkout.components.core.internal.analytics.ErrorEvent.API_THREEDS2
            r8 = 2
            r1 = 0
            trackFingerprintErrorEvent$default(r7, r6, r1, r8, r1)
            com.adyen.checkout.core.exception.ComponentException r6 = new com.adyen.checkout.core.exception.ComponentException
            java.lang.String r8 = "Unable to submit fingerprint"
            r6.<init>(r8, r0)
            r7.emitError(r6)
        L78:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.adyen3ds2.internal.ui.DefaultAdyen3DS2Delegate.submitFingerprintAutomatically(android.app.Activity, java.lang.String, x70.c):java.lang.Object");
    }

    private final void trackActionEvent(Action action, String message) {
        GenericEvents genericEvents = GenericEvents.INSTANCE;
        String paymentMethodType = action.getPaymentMethodType();
        if (paymentMethodType == null) {
            paymentMethodType = "";
        }
        String type = action.getType();
        AnalyticsEvent.Log logAction = genericEvents.action(paymentMethodType, type != null ? type : "", message);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.trackEvent(logAction);
        }
    }

    private final void trackChallengeActionEvent(Action action) {
        trackActionEvent(action, "Challenge action was handled by the SDK");
    }

    private final void trackChallengeCompletedEvent(ThreeDS2Events.Result result) {
        AnalyticsEvent.Log logThreeDS2Challenge$default = ThreeDS2Events.threeDS2Challenge$default(ThreeDS2Events.INSTANCE, ThreeDS2Events.SubType.CHALLENGE_COMPLETED, result, null, 4, null);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.trackEvent(logThreeDS2Challenge$default);
        }
    }

    private final void trackChallengeErrorEvent(ErrorEvent errorEvent, String message) {
        AnalyticsEvent.Error errorThreeDS2ChallengeError = ThreeDS2Events.INSTANCE.threeDS2ChallengeError(errorEvent, message);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.trackEvent(errorThreeDS2ChallengeError);
        }
    }

    public static /* synthetic */ void trackChallengeErrorEvent$default(DefaultAdyen3DS2Delegate defaultAdyen3DS2Delegate, ErrorEvent errorEvent, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        defaultAdyen3DS2Delegate.trackChallengeErrorEvent(errorEvent, str);
    }

    private final void trackFingerprintActionEvent(Action action) {
        trackActionEvent(action, "Fingerprint action was handled by the SDK");
    }

    private final void trackFingerprintCompletedEvent(ThreeDS2Events.Result result) {
        AnalyticsEvent.Log logThreeDS2Fingerprint$default = ThreeDS2Events.threeDS2Fingerprint$default(ThreeDS2Events.INSTANCE, ThreeDS2Events.SubType.FINGERPRINT_COMPLETED, result, null, 4, null);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.trackEvent(logThreeDS2Fingerprint$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackFingerprintErrorEvent(ErrorEvent errorEvent, String message) {
        AnalyticsEvent.Error errorThreeDS2FingerprintError = ThreeDS2Events.INSTANCE.threeDS2FingerprintError(errorEvent, message);
        AnalyticsManager analyticsManager = this.analyticsManager;
        if (analyticsManager != null) {
            analyticsManager.trackEvent(errorThreeDS2FingerprintError);
        }
    }

    public static /* synthetic */ void trackFingerprintErrorEvent$default(DefaultAdyen3DS2Delegate defaultAdyen3DS2Delegate, ErrorEvent errorEvent, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        defaultAdyen3DS2Delegate.trackFingerprintErrorEvent(errorEvent, str);
    }

    public final void challengeShopper$3ds2_release(@NotNull Activity activity, @NotNull String encodedChallengeToken) {
        activity.getClass();
        encodedChallengeToken.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAdyen3DS2Delegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "challengeShopper", null);
        }
        if (this.currentTransaction == null) {
            trackChallengeErrorEvent$default(this, ErrorEvent.THREEDS2_TRANSACTION_MISSING, null, 2, null);
            emitError(new Authentication3DS2Exception("Failed to make challenge, missing reference to initial transaction."));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(f80.c.a(f80.c.f17515f, encodedChallengeToken, 0, 6), Charsets.UTF_8));
            ThreeDS2Events threeDS2Events = ThreeDS2Events.INSTANCE;
            AnalyticsEvent.Log logThreeDS2Challenge$default = ThreeDS2Events.threeDS2Challenge$default(threeDS2Events, ThreeDS2Events.SubType.CHALLENGE_DATA_SENT, null, null, 6, null);
            AnalyticsManager analyticsManager = this.analyticsManager;
            if (analyticsManager != null) {
                analyticsManager.trackEvent(logThreeDS2Challenge$default);
            }
            ChallengeParameters challengeParametersCreateChallengeParameters = createChallengeParameters((ChallengeToken) ChallengeToken.SERIALIZER.deserialize(jSONObject));
            try {
                Transaction transaction = this.currentTransaction;
                if (transaction != null) {
                    transaction.doChallenge(activity, challengeParametersCreateChallengeParameters, SharedChallengeStatusHandler.INSTANCE, 10);
                }
                AnalyticsEvent.Log logThreeDS2Challenge$default2 = ThreeDS2Events.threeDS2Challenge$default(threeDS2Events, ThreeDS2Events.SubType.CHALLENGE_DISPLAYED, null, null, 6, null);
                AnalyticsManager analyticsManager2 = this.analyticsManager;
                if (analyticsManager2 != null) {
                    analyticsManager2.trackEvent(logThreeDS2Challenge$default2);
                }
            } catch (InvalidInputException e5) {
                trackChallengeErrorEvent(ErrorEvent.THREEDS2_CHALLENGE_HANDLING, "Challenge failed because input is invalid");
                emitError(new CheckoutException("Error starting challenge", e5));
            }
        } catch (JSONException e11) {
            trackChallengeErrorEvent$default(this, ErrorEvent.THREEDS2_TOKEN_DECODING, null, 2, null);
            emitError(new ComponentException("JSON parsing of challenge token failed", e11));
        }
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

    @Override // com.adyen.checkout.components.core.internal.SavedStateHandleContainer
    @NotNull
    public c1 getSavedStateHandle() {
        return this.savedStateHandle;
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
        if (!(action instanceof BaseThreeds2Action)) {
            emitError(new ComponentException("Unsupported action", null, 2, null));
            return;
        }
        setAction((BaseThreeds2Action) action);
        this.paymentDataRepository.setPaymentData(action.getPaymentData());
        if (action instanceof Threeds2FingerprintAction) {
            handleThreeds2FingerprintAction((Threeds2FingerprintAction) action, activity);
        } else if (action instanceof Threeds2ChallengeAction) {
            handleThreeds2ChallengeAction((Threeds2ChallengeAction) action, activity);
        } else if (action instanceof Threeds2Action) {
            handleThreeds2Action((Threeds2Action) action, activity);
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.IntentHandlingDelegate
    public void handleIntent(@NotNull Intent intent) {
        intent.getClass();
        try {
            emitDetails$default(this, this.redirectHandler.parseRedirectResult(intent.getData()), false, 2, null);
        } catch (CheckoutException e5) {
            emitError(e5);
        }
    }

    public final void identifyShopper$3ds2_release(@NotNull Activity activity, @NotNull String encodedFingerprintToken, boolean submitFingerprintAutomatically) {
        activity.getClass();
        encodedFingerprintToken.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAdyen3DS2Delegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            String strConcat = "CO.".concat(name);
            companion.getLogger().log(adyenLogLevel, strConcat, "identifyShopper - submitFingerprintAutomatically: " + submitFingerprintAutomatically, null);
        }
        try {
            FingerprintToken fingerprintTokenDecodeFingerprintToken = decodeFingerprintToken(encodedFingerprintToken);
            ConfigParameters configParametersCreateAdyenConfigParameters = createAdyenConfigParameters(fingerprintTokenDecodeFingerprintToken);
            if (configParametersCreateAdyenConfigParameters == null) {
                trackFingerprintErrorEvent(ErrorEvent.THREEDS2_FINGERPRINT_CREATION, "Fingerprint creation failed because the token is partial");
                emitError(new ComponentException("Failed to create ConfigParameters.", null, 2, null));
            } else {
                f0.B(getCoroutineScope(), this.coroutineDispatcher.plus(new DefaultAdyen3DS2Delegate$identifyShopper$$inlined$CoroutineExceptionHandler$1(y.f42175a, this)), null, new DefaultAdyen3DS2Delegate$identifyShopper$2(this, activity, configParametersCreateAdyenConfigParameters, fingerprintTokenDecodeFingerprintToken, submitFingerprintAutomatically, null), 2);
            }
        } catch (CheckoutException e5) {
            trackFingerprintErrorEvent$default(this, ErrorEvent.THREEDS2_TOKEN_DECODING, null, 2, null);
            emitError(new ComponentException("Failed to decode fingerprint token", e5));
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
        this._coroutineScope = coroutineScope;
        SharedChallengeStatusHandler.INSTANCE.setOnCompletionListener(this);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super ActionComponentEvent, Unit> callback) {
        lifecycleOwner.getClass();
        coroutineScope.getClass();
        callback.getClass();
        this.observerRepository.addObservers(getDetailsFlow(), getExceptionFlow(), null, lifecycleOwner, coroutineScope, callback);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void onCleared() {
        removeObserver();
        SharedChallengeStatusHandler.INSTANCE.setOnCompletionListener(null);
        this._coroutineScope = null;
        this.redirectHandler.removeOnRedirectListener();
    }

    @Override // com.adyen.threeds2.ChallengeStatusHandler
    public void onCompletion(@NotNull ChallengeResult result) {
        result.getClass();
        if (result instanceof ChallengeResult.Cancelled) {
            trackChallengeCompletedEvent(ThreeDS2Events.Result.CANCELLED);
            onCancelled((ChallengeResult.Cancelled) result);
            return;
        }
        if (result instanceof ChallengeResult.Completed) {
            trackChallengeCompletedEvent(ThreeDS2Events.Result.COMPLETED);
            onCompleted(((ChallengeResult.Completed) result).getTransactionStatus());
        } else if (result instanceof ChallengeResult.Error) {
            trackChallengeCompletedEvent(ThreeDS2Events.Result.ERROR);
            onError((ChallengeResult.Error) result);
        } else if (result instanceof ChallengeResult.Timeout) {
            trackChallengeCompletedEvent(ThreeDS2Events.Result.TIMEOUT);
            onTimeout((ChallengeResult.Timeout) result);
        }
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
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/ui/DefaultAdyen3DS2Delegate$Companion;", "", "()V", "ACTION_KEY", "", "getACTION_KEY$3ds2_release$annotations", "DEFAULT_CHALLENGE_TIME_OUT", "", "PROTOCOL_VERSION_2_1_0", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getACTION_KEY$3ds2_release$annotations() {
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public Adyen3DS2ComponentParams getComponentParams() {
        return this.componentParams;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ActionDelegate
    public void onError(@NotNull CheckoutException e5) {
        e5.getClass();
        emitError(e5);
    }
}
