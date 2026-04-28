package com.adyen.checkout.card.internal.ui;

import androidx.lifecycle.LifecycleOwner;
import ba0.g;
import com.adyen.checkout.card.BinLookupData;
import com.adyen.checkout.card.CardComponentState;
import com.adyen.checkout.card.internal.data.model.Brand;
import com.adyen.checkout.card.internal.data.model.DetectedCardType;
import com.adyen.checkout.card.internal.ui.CardComponentViewType;
import com.adyen.checkout.card.internal.ui.model.CardComponentParams;
import com.adyen.checkout.card.internal.ui.model.CardInputData;
import com.adyen.checkout.card.internal.ui.model.CardOutputData;
import com.adyen.checkout.card.internal.ui.model.InputFieldUIState;
import com.adyen.checkout.card.internal.ui.model.StoredCVCVisibility;
import com.adyen.checkout.card.internal.util.CardValidationUtils;
import com.adyen.checkout.components.core.AddressLookupCallback;
import com.adyen.checkout.components.core.AddressLookupResult;
import com.adyen.checkout.components.core.LookupAddress;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.ErrorEvent;
import com.adyen.checkout.components.core.internal.analytics.GenericEvents;
import com.adyen.checkout.components.core.internal.data.api.PublicKeyRepository;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.components.core.internal.provider.SdkDataProvider;
import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import com.adyen.checkout.components.core.internal.ui.model.FieldState;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.components.core.paymentmethod.CardPaymentMethod;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.CardBrand;
import com.adyen.checkout.core.CardType;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.core.internal.ui.model.ExpiryDateExtKt;
import com.adyen.checkout.core.ui.model.ExpiryDate;
import com.adyen.checkout.cse.EncryptionException;
import com.adyen.checkout.cse.UnencryptedCard;
import com.adyen.checkout.cse.internal.BaseCardEncryptor;
import com.adyen.checkout.ui.core.internal.ui.AddressFormUIState;
import com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.SubmitHandler;
import com.adyen.checkout.ui.core.internal.ui.model.AddressOutputData;
import com.adyen.checkout.ui.core.internal.util.AddressValidationUtils;
import com.braze.h2;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.h1;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import v80.b0;
import v80.f0;
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
@Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 Â\u00012\u00020\u0001:\u0002Â\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010%\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0018\u0010$\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110#\u0012\u0004\u0012\u00020\u001d0\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(J#\u0010+\u001a\u00020\u001d2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001d0\"H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00105\u001a\u00020\u001d2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u00020\u001dH\u0016¢\u0006\u0004\b6\u0010(J\u000f\u00107\u001a\u00020\u001dH\u0016¢\u0006\u0004\b7\u0010(J\u000f\u00108\u001a\u00020-H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020-H\u0016¢\u0006\u0004\b=\u00109J\u000f\u0010>\u001a\u00020-H\u0016¢\u0006\u0004\b>\u00109J#\u0010@\u001a\u00020\u001d2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u001d0\"H\u0016¢\u0006\u0004\b@\u0010,J%\u0010B\u001a\u00020\u001d2\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001d\u0018\u00010\"H\u0016¢\u0006\u0004\bB\u0010,J+\u0010E\u001a\u00020\u001d2\u001a\u0010A\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C\u0012\u0004\u0012\u00020\u001d\u0018\u00010\"H\u0016¢\u0006\u0004\bE\u0010,J\u0017\u0010H\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u001d\u0010L\u001a\u00020\u001d2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0CH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020-H\u0016¢\u0006\u0004\bS\u00100J\u0017\u0010U\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020-H\u0016¢\u0006\u0004\bU\u00100J5\u0010[\u001a\u00020\u001d2\u0006\u0010W\u001a\u00020V2\b\u0010X\u001a\u0004\u0018\u00010:2\b\u0010Y\u001a\u0004\u0018\u00010V2\b\u0010Z\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u001dH\u0016¢\u0006\u0004\b]\u0010(J\u0017\u0010_\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u0011H\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\ba\u0010\u001fJ\u000f\u0010b\u001a\u00020\u001dH\u0002¢\u0006\u0004\bb\u0010(J\u000f\u0010c\u001a\u00020\u001dH\u0002¢\u0006\u0004\bc\u0010(J\u000f\u0010d\u001a\u000201H\u0002¢\u0006\u0004\bd\u0010eJ\u0019\u0010f\u001a\u00020\u00112\b\b\u0002\u00102\u001a\u000201H\u0002¢\u0006\u0004\bf\u0010gJ\u0015\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00110hH\u0002¢\u0006\u0004\bi\u0010jJ%\u0010o\u001a\b\u0012\u0004\u0012\u00020:0n2\u0006\u0010k\u001a\u00020:2\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020-H\u0002¢\u0006\u0004\bq\u00109J)\u0010w\u001a\u00020\u00112\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020:2\b\u0010v\u001a\u0004\u0018\u00010uH\u0002¢\u0006\u0004\bw\u0010xJ\u001d\u0010|\u001a\b\u0012\u0004\u0012\u00020y0{2\u0006\u0010z\u001a\u00020yH\u0002¢\u0006\u0004\b|\u0010}J\u000f\u0010~\u001a\u00020\u001dH\u0002¢\u0006\u0004\b~\u0010(J\u001c\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0085\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0083\u0001J\u0011\u0010\u0086\u0001\u001a\u00020:H\u0002¢\u0006\u0005\b\u0086\u0001\u0010<R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0087\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0088\u0001R\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0089\u0001R\u001d\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\t\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u008d\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u008e\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u008f\u0001R\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0090\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0091\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0092\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0093\u0001R\u001e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020u0\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u0097\u0001\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0017\u0010\u0099\u0001\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009b\u0001\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001e\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u0002010\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R$\u0010 \u0001\u001a\b\u0012\u0004\u0012\u0002010h8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b \u0001\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010jR\u001e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010\u009f\u0001R$\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110h8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b¤\u0001\u0010¡\u0001\u001a\u0005\b¥\u0001\u0010jR\u001f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R%\u0010ª\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010h8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\bª\u0001\u0010¡\u0001\u001a\u0005\b«\u0001\u0010jR!\u0010\u00ad\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¬\u00010\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u009f\u0001R'\u0010®\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010¬\u00010h8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b®\u0001\u0010¡\u0001\u001a\u0005\b¯\u0001\u0010jR$\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110h8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b°\u0001\u0010¡\u0001\u001a\u0005\b±\u0001\u0010jR%\u0010³\u0001\u001a\t\u0012\u0005\u0012\u00030²\u00010h8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b³\u0001\u0010¡\u0001\u001a\u0005\b´\u0001\u0010jR%\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u00030µ\u00010h8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b¶\u0001\u0010¡\u0001\u001a\u0005\b·\u0001\u0010jR\u001b\u0010¸\u0001\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010º\u0001R\u0018\u0010¾\u0001\u001a\u00030»\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u001d\u0010À\u0001\u001a\t\u0012\u0005\u0012\u00030»\u00010h8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010jR\u0015\u00102\u001a\u0002018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010e¨\u0006Ã\u0001"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/StoredCardDelegate;", "Lcom/adyen/checkout/card/internal/ui/CardDelegate;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "observerRepository", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "storedPaymentMethod", "Lcom/adyen/checkout/components/core/OrderRequest;", "order", "Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;", "componentParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;", "cardEncryptor", "Lcom/adyen/checkout/components/core/internal/data/api/PublicKeyRepository;", "publicKeyRepository", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/card/CardComponentState;", "submitHandler", "Lcom/adyen/checkout/card/internal/ui/CardConfigDataGenerator;", "cardConfigDataGenerator", "Lcom/adyen/checkout/card/internal/ui/CardValidationMapper;", "cardValidationMapper", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "sdkDataProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;Lcom/adyen/checkout/components/core/internal/data/api/PublicKeyRepository;Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;Lcom/adyen/checkout/card/internal/ui/CardConfigDataGenerator;Lcom/adyen/checkout/card/internal/ui/CardValidationMapper;Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;)V", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "Lcom/adyen/checkout/card/internal/ui/model/CardInputData;", "update", "updateInputData", "(Lkotlin/jvm/functions/Function1;)V", "", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;", "outputData", "updateComponentState$card_release", "(Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;)V", "updateComponentState", "onSubmit", "startAddressLookup", "handleBackPress", "()Z", "", "getPaymentMethodType", "()Ljava/lang/String;", "isConfirmationRequired", "shouldShowSubmitButton", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "updateAddressInputData", "listener", "setOnBinValueListener", "", "Lcom/adyen/checkout/card/BinLookupData;", "setOnBinLookupListener", "Lcom/adyen/checkout/components/core/AddressLookupCallback;", "addressLookupCallback", "setAddressLookupCallback", "(Lcom/adyen/checkout/components/core/AddressLookupCallback;)V", "Lcom/adyen/checkout/components/core/LookupAddress;", "options", "updateAddressLookupOptions", "(Ljava/util/List;)V", "Lcom/adyen/checkout/components/core/AddressLookupResult;", "addressLookupResult", "setAddressLookupResult", "(Lcom/adyen/checkout/components/core/AddressLookupResult;)V", "isAvailable", "onCardScanningAvailability", "didDisplay", "onCardScanningDisplayed", "", StatusResponse.RESULT_CODE, "pan", "expiryMonth", "expiryYear", "onCardScanningResult", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "onCleared", "cardComponentState", "onState", "(Lcom/adyen/checkout/card/CardComponentState;)V", "initializeAnalytics", "fetchPublicKey", "onInputDataChanged", "createOutputData", "()Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;", "createComponentState", "(Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;)Lcom/adyen/checkout/card/CardComponentState;", "Ly80/i;", "getTrackedSubmitFlow", "()Ly80/i;", "securityCode", "Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "detectedCardType", "Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "validateSecurityCode", "(Ljava/lang/String;Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;)Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "isCvcHidden", "Lcom/adyen/checkout/cse/EncryptedCard;", "encryptedCard", "cardNumber", "Lcom/adyen/checkout/core/CardBrand;", "firstCardBrand", "mapComponentState", "(Lcom/adyen/checkout/cse/EncryptedCard;Ljava/lang/String;Lcom/adyen/checkout/core/CardBrand;)Lcom/adyen/checkout/card/CardComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/CardPaymentMethod;", "cardPaymentMethod", "Lcom/adyen/checkout/components/core/PaymentComponentData;", "makePaymentComponentData", "(Lcom/adyen/checkout/components/core/paymentmethod/CardPaymentMethod;)Lcom/adyen/checkout/components/core/PaymentComponentData;", "initializeInputData", "Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;", "cvcPolicy", "Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;", "makeCvcUIState", "(Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;)Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;", "expiryDatePolicy", "makeExpiryDateUIState", "getPaymentMethodId", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;", "Lcom/adyen/checkout/components/core/internal/data/api/PublicKeyRepository;", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/card/internal/ui/CardConfigDataGenerator;", "Lcom/adyen/checkout/card/internal/ui/CardValidationMapper;", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "", "noCvcBrands", "Ljava/util/Set;", "cardType", "Lcom/adyen/checkout/core/CardBrand;", "storedDetectedCardTypes", "Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "inputData", "Lcom/adyen/checkout/card/internal/ui/model/CardInputData;", "Ly80/f1;", "_outputDataFlow", "Ly80/f1;", "outputDataFlow", "Ly80/i;", "getOutputDataFlow", "_componentStateFlow", "componentStateFlow", "getComponentStateFlow", "Lx80/m;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "exceptionChannel", "Lx80/m;", "exceptionFlow", "getExceptionFlow", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "viewFlow", "getViewFlow", "submitFlow", "getSubmitFlow", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState;", "uiStateFlow", "getUiStateFlow", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent;", "uiEventFlow", "getUiEventFlow", "publicKey", "Ljava/lang/String;", "Lv80/b0;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "getAddressOutputData", "()Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "addressOutputData", "getAddressOutputDataFlow", "addressOutputDataFlow", "getOutputData", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStoredCardDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoredCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/StoredCardDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 RunCompileOnly.kt\ncom/adyen/checkout/core/internal/util/RunCompileOnlyKt\n*L\n1#1,474:1\n16#2,17:475\n16#2,17:492\n16#2,17:509\n44#2,4:530\n44#2,4:543\n16#2,17:552\n16#2,17:569\n16#3,4:526\n20#3,5:534\n16#3,4:539\n20#3,5:547\n*S KotlinDebug\n*F\n+ 1 StoredCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/StoredCardDelegate\n*L\n163#1:475,17\n223#1:492,17\n260#1:509,17\n365#1:530,4\n374#1:543,4\n409#1:552,17\n419#1:569,17\n365#1:526,4\n365#1:534,5\n374#1:539,4\n374#1:547,5\n*E\n"})
public final class StoredCardDelegate implements CardDelegate {
    private static final int LAST_FOUR_LENGTH = 4;

    @NotNull
    private final f1 _componentStateFlow;

    @NotNull
    private final f1 _outputDataFlow;

    @NotNull
    private final f1 _viewFlow;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final CardConfigDataGenerator cardConfigDataGenerator;

    @NotNull
    private final BaseCardEncryptor cardEncryptor;

    @NotNull
    private final CardBrand cardType;

    @NotNull
    private final CardValidationMapper cardValidationMapper;

    @NotNull
    private final CardComponentParams componentParams;

    @NotNull
    private final i componentStateFlow;

    @Nullable
    private b0 coroutineScope;

    @NotNull
    private final m exceptionChannel;

    @NotNull
    private final i exceptionFlow;

    @NotNull
    private final CardInputData inputData;

    @NotNull
    private final Set<CardBrand> noCvcBrands;

    @NotNull
    private final PaymentObserverRepository observerRepository;

    @Nullable
    private final OrderRequest order;

    @NotNull
    private final i outputDataFlow;

    @Nullable
    private String publicKey;

    @NotNull
    private final PublicKeyRepository publicKeyRepository;

    @NotNull
    private final SdkDataProvider sdkDataProvider;

    @NotNull
    private final DetectedCardType storedDetectedCardTypes;

    @NotNull
    private final StoredPaymentMethod storedPaymentMethod;

    @NotNull
    private final i submitFlow;

    @NotNull
    private final SubmitHandler<CardComponentState> submitHandler;

    @NotNull
    private final i uiEventFlow;

    @NotNull
    private final i uiStateFlow;

    @NotNull
    private final i viewFlow;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Brand.FieldPolicy.values().length];
            try {
                iArr[Brand.FieldPolicy.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Brand.FieldPolicy.OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Brand.FieldPolicy.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.StoredCardDelegate$fetchPublicKey$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.StoredCardDelegate$fetchPublicKey$1", f = "StoredCardDelegate.kt", l = {195}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return StoredCardDelegate.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objMo85fetchPublicKey0E7RQCE;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                PublicKeyRepository publicKeyRepository = StoredCardDelegate.this.publicKeyRepository;
                Environment environment = StoredCardDelegate.this.getComponentParams().getEnvironment();
                String clientKey = StoredCardDelegate.this.getComponentParams().getClientKey();
                this.label = 1;
                objMo85fetchPublicKey0E7RQCE = publicKeyRepository.mo85fetchPublicKey0E7RQCE(environment, clientKey, this);
                if (objMo85fetchPublicKey0E7RQCE == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                objMo85fetchPublicKey0E7RQCE = ((q) obj).f40851a;
            }
            StoredCardDelegate storedCardDelegate = StoredCardDelegate.this;
            Throwable thA = q.a(objMo85fetchPublicKey0E7RQCE);
            if (thA == null) {
                storedCardDelegate.publicKey = (String) objMo85fetchPublicKey0E7RQCE;
                storedCardDelegate.updateComponentState$card_release(storedCardDelegate.getOutputData());
            } else {
                GenericEvents genericEvents = GenericEvents.INSTANCE;
                String type = storedCardDelegate.storedPaymentMethod.getType();
                if (type == null) {
                    type = "";
                }
                storedCardDelegate.analyticsManager.trackEvent(GenericEvents.error$default(genericEvents, type, ErrorEvent.API_PUBLIC_KEY, null, null, 12, null));
                storedCardDelegate.exceptionChannel.h(new ComponentException("Unable to fetch publicKey.", thA));
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.StoredCardDelegate$getTrackedSubmitFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.StoredCardDelegate$getTrackedSubmitFlow$1", f = "StoredCardDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/card/CardComponentState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00791 extends z70.i implements Function2<CardComponentState, c<? super Unit>, Object> {
        int label;

        public C00791(c<? super C00791> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return StoredCardDelegate.this.new C00791(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CardComponentState cardComponentState, @Nullable c<? super Unit> cVar) {
            return ((C00791) create(cardComponentState, cVar)).invokeSuspend(Unit.f26487a);
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
            String type = StoredCardDelegate.this.storedPaymentMethod.getType();
            if (type == null) {
                type = "";
            }
            StoredCardDelegate.this.analyticsManager.trackEvent(genericEvents.submit(type));
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.StoredCardDelegate$initialize$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.StoredCardDelegate$initialize$1", f = "StoredCardDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/card/CardComponentState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00801 extends z70.i implements Function2<CardComponentState, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C00801(c<? super C00801> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00801 c00801 = StoredCardDelegate.this.new C00801(cVar);
            c00801.L$0 = obj;
            return c00801;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CardComponentState cardComponentState, @Nullable c<? super Unit> cVar) {
            return ((C00801) create(cardComponentState, cVar)).invokeSuspend(Unit.f26487a);
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
            StoredCardDelegate.this.onState((CardComponentState) this.L$0);
            return Unit.f26487a;
        }
    }

    public StoredCardDelegate(@NotNull PaymentObserverRepository paymentObserverRepository, @NotNull StoredPaymentMethod storedPaymentMethod, @Nullable OrderRequest orderRequest, @NotNull CardComponentParams cardComponentParams, @NotNull AnalyticsManager analyticsManager, @NotNull BaseCardEncryptor baseCardEncryptor, @NotNull PublicKeyRepository publicKeyRepository, @NotNull SubmitHandler<CardComponentState> submitHandler, @NotNull CardConfigDataGenerator cardConfigDataGenerator, @NotNull CardValidationMapper cardValidationMapper, @NotNull SdkDataProvider sdkDataProvider) {
        paymentObserverRepository.getClass();
        storedPaymentMethod.getClass();
        cardComponentParams.getClass();
        analyticsManager.getClass();
        baseCardEncryptor.getClass();
        publicKeyRepository.getClass();
        submitHandler.getClass();
        cardConfigDataGenerator.getClass();
        cardValidationMapper.getClass();
        sdkDataProvider.getClass();
        this.observerRepository = paymentObserverRepository;
        this.storedPaymentMethod = storedPaymentMethod;
        this.order = orderRequest;
        this.componentParams = cardComponentParams;
        this.analyticsManager = analyticsManager;
        this.cardEncryptor = baseCardEncryptor;
        this.publicKeyRepository = publicKeyRepository;
        this.submitHandler = submitHandler;
        this.cardConfigDataGenerator = cardConfigDataGenerator;
        this.cardValidationMapper = cardValidationMapper;
        this.sdkDataProvider = sdkDataProvider;
        HashSet hashSetC = h1.c(new CardBrand(CardType.BCMC));
        this.noCvcBrands = hashSetC;
        String brand = storedPaymentMethod.getBrand();
        CardBrand cardBrand = new CardBrand(brand == null ? "" : brand);
        this.cardType = cardBrand;
        this.storedDetectedCardTypes = new DetectedCardType(cardBrand, true, true, (getComponentParams().getStoredCVCVisibility() == StoredCVCVisibility.HIDE || hashSetC.contains(cardBrand)) ? Brand.FieldPolicy.HIDDEN : Brand.FieldPolicy.REQUIRED, Brand.FieldPolicy.REQUIRED, true, null, null, null);
        this.inputData = new CardInputData(null, null, null, null, null, null, null, null, null, false, null, null, 4095, null);
        a2 a2VarC = r.c(createOutputData());
        this._outputDataFlow = a2VarC;
        this.outputDataFlow = a2VarC;
        a2 a2VarC2 = r.c(createComponentState$default(this, null, 1, null));
        this._componentStateFlow = a2VarC2;
        this.componentStateFlow = a2VarC2;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.exceptionChannel = mVarBufferedChannel;
        this.exceptionFlow = r.w(mVarBufferedChannel);
        a2 a2VarC3 = r.c(null);
        this._viewFlow = a2VarC3;
        this.viewFlow = a2VarC3;
        this.submitFlow = getTrackedSubmitFlow();
        this.uiStateFlow = submitHandler.getUiStateFlow();
        this.uiEventFlow = submitHandler.getUiEventFlow();
    }

    private final CardComponentState createComponentState(CardOutputData outputData) {
        String value = outputData.getCardNumberState().getValue();
        DetectedCardType detectedCardType = (DetectedCardType) CollectionsKt.firstOrNull(outputData.getDetectedCardTypes());
        CardBrand cardBrand = detectedCardType != null ? detectedCardType.getCardBrand() : null;
        String str = this.publicKey;
        if (!outputData.getIsValid() || str == null) {
            return new CardComponentState(new PaymentComponentData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16376, null), outputData.getIsValid(), str != null, cardBrand, "", null);
        }
        UnencryptedCard.Builder builder = new UnencryptedCard.Builder();
        try {
            if (!isCvcHidden()) {
                String value2 = outputData.getSecurityCodeState().getValue();
                if (value2.length() > 0) {
                    builder.setCvc(value2);
                }
            }
            String value3 = outputData.getExpiryDateState().getValue();
            if (!StringsKt.H(value3)) {
                ExpiryDate expiryDateFrom = ExpiryDate.INSTANCE.from(value3);
                builder.setExpiryDate(String.valueOf(expiryDateFrom.getExpiryMonth()), String.valueOf(expiryDateFrom.getExpiryYear()));
            }
            return mapComponentState(this.cardEncryptor.encryptFields(builder.build(), str), value, cardBrand);
        } catch (EncryptionException e5) {
            GenericEvents genericEvents = GenericEvents.INSTANCE;
            String type = this.storedPaymentMethod.getType();
            if (type == null) {
                type = "";
            }
            this.analyticsManager.trackEvent(GenericEvents.error$default(genericEvents, type, ErrorEvent.ENCRYPTION, null, null, 12, null));
            this.exceptionChannel.h(e5);
            return new CardComponentState(new PaymentComponentData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16376, null), false, true, cardBrand, "", null);
        }
    }

    public static /* synthetic */ CardComponentState createComponentState$default(StoredCardDelegate storedCardDelegate, CardOutputData cardOutputData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cardOutputData = storedCardDelegate.getOutputData();
        }
        return storedCardDelegate.createComponentState(cardOutputData);
    }

    private final CardOutputData createOutputData() {
        CardInputData cardInputData = this.inputData;
        String cardNumber = cardInputData.getCardNumber();
        Validation.Valid valid = Validation.Valid.INSTANCE;
        FieldState fieldState = new FieldState(cardNumber, valid);
        FieldState fieldState2 = new FieldState(cardInputData.getExpiryDate(), valid);
        FieldState<String> fieldStateValidateSecurityCode = validateSecurityCode(cardInputData.getSecurityCode(), this.storedDetectedCardTypes);
        FieldState fieldState3 = new FieldState(cardInputData.getHolderName(), valid);
        FieldState fieldState4 = new FieldState(cardInputData.getSocialSecurityNumber(), valid);
        FieldState fieldState5 = new FieldState(cardInputData.getKcpBirthDateOrTaxNumber(), valid);
        FieldState fieldState6 = new FieldState(cardInputData.getKcpCardPassword(), valid);
        AddressOutputData addressOutputDataMakeValidEmptyAddressOutput = AddressValidationUtils.INSTANCE.makeValidEmptyAddressOutput(this.inputData.getAddress());
        FieldState fieldState7 = new FieldState(this.inputData.getInstallmentOption(), valid);
        boolean zIsStorePaymentMethodSwitchChecked = cardInputData.isStorePaymentMethodSwitchChecked();
        InputFieldUIState inputFieldUIStateMakeCvcUIState = makeCvcUIState(this.storedDetectedCardTypes.getCvcPolicy());
        InputFieldUIState inputFieldUIStateMakeExpiryDateUIState = makeExpiryDateUIState(this.storedDetectedCardTypes.getExpiryDatePolicy());
        InputFieldUIState inputFieldUIState = InputFieldUIState.HIDDEN;
        List listC = c0.c(this.storedDetectedCardTypes);
        AddressFormUIState addressFormUIState = AddressFormUIState.NONE;
        n0 n0Var = n0.f26529a;
        return new CardOutputData(fieldState, fieldState2, fieldStateValidateSecurityCode, fieldState3, fieldState4, fieldState5, fieldState6, addressOutputDataMakeValidEmptyAddressOutput, fieldState7, zIsStorePaymentMethodSwitchChecked, inputFieldUIStateMakeCvcUIState, inputFieldUIStateMakeExpiryDateUIState, inputFieldUIState, false, listC, false, false, addressFormUIState, n0Var, n0Var, null, null, false);
    }

    private final void fetchPublicKey() {
        b0 b0Var = this.coroutineScope;
        if (b0Var != null) {
            f0.B(b0Var, null, null, new AnonymousClass1(null), 3);
        }
    }

    private final String getPaymentMethodId() {
        String id2 = this.storedPaymentMethod.getId();
        return id2 == null ? "ID_NOT_FOUND" : id2;
    }

    private final i getTrackedSubmitFlow() {
        return new w(this.submitHandler.getSubmitFlow(), new C00791(null), 5);
    }

    private final void initializeAnalytics(b0 coroutineScope) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = StoredCardDelegate.class.getName();
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
        this.analyticsManager.trackEvent(GenericEvents.rendered$default(genericEvents, type, Boolean.TRUE, null, this.cardConfigDataGenerator.generate(getComponentParams(), true), 4, null));
    }

    private final void initializeInputData() {
        CardInputData cardInputData = this.inputData;
        String lastFour = this.storedPaymentMethod.getLastFour();
        if (lastFour == null) {
            lastFour = "";
        }
        cardInputData.setCardNumber(lastFour);
        String expiryMonth = this.storedPaymentMethod.getExpiryMonth();
        String expiryYear = this.storedPaymentMethod.getExpiryYear();
        if (expiryMonth == null || StringsKt.H(expiryMonth) || expiryYear == null || StringsKt.H(expiryYear)) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.WARN;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = StoredCardDelegate.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Failed to parse stored expiry date", null);
            }
            this.inputData.setExpiryDate("");
        } else {
            this.inputData.setExpiryDate(ExpiryDateExtKt.toMMyyString(expiryMonth, expiryYear));
        }
        onInputDataChanged();
    }

    private final boolean isCvcHidden() {
        return getOutputData().getCvcUIState() == InputFieldUIState.HIDDEN;
    }

    private final InputFieldUIState makeCvcUIState(Brand.FieldPolicy cvcPolicy) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = StoredCardDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            String strConcat = "CO.".concat(name);
            companion.getLogger().log(adyenLogLevel, strConcat, "makeCvcUIState: " + cvcPolicy, null);
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[cvcPolicy.ordinal()];
        if (i11 == 1) {
            return InputFieldUIState.REQUIRED;
        }
        if (i11 == 2) {
            return InputFieldUIState.OPTIONAL;
        }
        if (i11 == 3) {
            return InputFieldUIState.HIDDEN;
        }
        e40.a.f();
        return null;
    }

    private final InputFieldUIState makeExpiryDateUIState(Brand.FieldPolicy expiryDatePolicy) {
        return !expiryDatePolicy.isRequired() ? InputFieldUIState.OPTIONAL : InputFieldUIState.REQUIRED;
    }

    private final PaymentComponentData<CardPaymentMethod> makePaymentComponentData(CardPaymentMethod cardPaymentMethod) {
        return new PaymentComponentData<>(cardPaymentMethod, this.order, getComponentParams().getAmount(), null, getComponentParams().getShopperReference(), null, null, null, null, null, null, null, null, null, 16360, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r0 r5 r7
      0x0029: PHI (r0v2 'e' java.lang.Throwable) = (r0v1 'e' java.lang.Throwable), (r0v4 'e' java.lang.Throwable) binds: [B:10:0x0027, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r5v1 com.adyen.checkout.core.AdyenLogLevel) = (r5v0 com.adyen.checkout.core.AdyenLogLevel), (r5v2 com.adyen.checkout.core.AdyenLogLevel) binds: [B:10:0x0027, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r7v1 com.adyen.checkout.core.AdyenLogger$Companion) = (r7v0 com.adyen.checkout.core.AdyenLogger$Companion), (r7v3 com.adyen.checkout.core.AdyenLogger$Companion) binds: [B:10:0x0027, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[PHI: r0 r5 r6
      0x008e: PHI (r0v9 'e' java.lang.Throwable) = (r0v8 'e' java.lang.Throwable), (r0v10 'e' java.lang.Throwable) binds: [B:26:0x008c, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r5v5 com.adyen.checkout.core.AdyenLogLevel) = (r5v4 com.adyen.checkout.core.AdyenLogLevel), (r5v6 com.adyen.checkout.core.AdyenLogLevel) binds: [B:26:0x008c, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r6v2 com.adyen.checkout.core.AdyenLogger$Companion) = (r6v1 com.adyen.checkout.core.AdyenLogger$Companion), (r6v4 com.adyen.checkout.core.AdyenLogger$Companion) binds: [B:26:0x008c, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.adyen.checkout.card.CardComponentState mapComponentState(com.adyen.checkout.cse.EncryptedCard r23, java.lang.String r24, com.adyen.checkout.core.CardBrand r25) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "Class not found. Are you missing a dependency?"
            java.lang.String r3 = "CO.runCompileOnly"
            com.adyen.checkout.components.core.internal.analytics.AnalyticsManager r0 = r1.analyticsManager
            java.lang.String r6 = r0.getCheckoutAttemptId()
            com.adyen.checkout.components.core.internal.provider.SdkDataProvider r4 = r1.sdkDataProvider
            r21 = 0
            com.adyen.threeds2.ThreeDS2Service r0 = com.adyen.threeds2.ThreeDS2Service.INSTANCE     // Catch: java.lang.NoClassDefFoundError -> L17 java.lang.ClassNotFoundException -> L19
            java.lang.String r0 = r0.getSDKVersion()     // Catch: java.lang.NoClassDefFoundError -> L17 java.lang.ClassNotFoundException -> L19
            goto L42
        L17:
            r0 = move-exception
            goto L1b
        L19:
            r0 = move-exception
            goto L31
        L1b:
            com.adyen.checkout.core.AdyenLogLevel r5 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r7 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r8 = r7.getLogger()
            boolean r8 = r8.shouldLog(r5)
            if (r8 == 0) goto L40
        L29:
            com.adyen.checkout.core.AdyenLogger r7 = r7.getLogger()
            r7.log(r5, r3, r2, r0)
            goto L40
        L31:
            com.adyen.checkout.core.AdyenLogLevel r5 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r7 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r8 = r7.getLogger()
            boolean r8 = r8.shouldLog(r5)
            if (r8 == 0) goto L40
            goto L29
        L40:
            r0 = r21
        L42:
            java.lang.String r7 = r4.createEncodedSdkData(r0)
            com.adyen.checkout.components.core.paymentmethod.CardPaymentMethod r4 = new com.adyen.checkout.components.core.paymentmethod.CardPaymentMethod
            java.lang.String r5 = "scheme"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 16376(0x3ff8, float:2.2948E-41)
            r20 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r0 = r1.getPaymentMethodId()
            r4.setStoredPaymentMethodId(r0)
            boolean r0 = r1.isCvcHidden()
            if (r0 != 0) goto L73
            java.lang.String r0 = r23.getEncryptedSecurityCode()
            r4.setEncryptedSecurityCode(r0)
        L73:
            com.adyen.threeds2.ThreeDS2Service r0 = com.adyen.threeds2.ThreeDS2Service.INSTANCE     // Catch: java.lang.NoClassDefFoundError -> L7c java.lang.ClassNotFoundException -> L7e
            java.lang.String r21 = r0.getSDKVersion()     // Catch: java.lang.NoClassDefFoundError -> L7c java.lang.ClassNotFoundException -> L7e
        L79:
            r0 = r21
            goto La5
        L7c:
            r0 = move-exception
            goto L80
        L7e:
            r0 = move-exception
            goto L96
        L80:
            com.adyen.checkout.core.AdyenLogLevel r5 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r6 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r7 = r6.getLogger()
            boolean r7 = r7.shouldLog(r5)
            if (r7 == 0) goto L79
        L8e:
            com.adyen.checkout.core.AdyenLogger r6 = r6.getLogger()
            r6.log(r5, r3, r2, r0)
            goto L79
        L96:
            com.adyen.checkout.core.AdyenLogLevel r5 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r6 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r7 = r6.getLogger()
            boolean r7 = r7.shouldLog(r5)
            if (r7 == 0) goto L79
            goto L8e
        La5:
            r4.setThreeDS2SdkVersion(r0)
            com.adyen.checkout.components.core.PaymentComponentData r6 = r1.makePaymentComponentData(r4)
            r0 = 4
            r2 = r24
            java.lang.String r11 = kotlin.text.b0.y(r0, r2)
            com.adyen.checkout.card.CardComponentState r5 = new com.adyen.checkout.card.CardComponentState
            r8 = 1
            java.lang.String r10 = ""
            r7 = 1
            r9 = r25
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.ui.StoredCardDelegate.mapComponentState(com.adyen.checkout.cse.EncryptedCard, java.lang.String, com.adyen.checkout.core.CardBrand):com.adyen.checkout.card.CardComponentState");
    }

    private final void onInputDataChanged() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = StoredCardDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onInputDataChanged", null);
        }
        CardOutputData cardOutputDataCreateOutputData = createOutputData();
        ((a2) this._outputDataFlow).j(cardOutputDataCreateOutputData);
        updateComponentState$card_release(cardOutputDataCreateOutputData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onState(CardComponentState cardComponentState) {
        if (cardComponentState.isValid()) {
            this.submitHandler.onSubmit(cardComponentState);
        }
    }

    private final FieldState<String> validateSecurityCode(String securityCode, DetectedCardType detectedCardType) {
        return this.cardValidationMapper.mapSecurityCodeValidation(securityCode, CardValidationUtils.INSTANCE.validateSecurityCode$card_release(securityCode, detectedCardType, makeCvcUIState(detectedCardType.getCvcPolicy())));
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressDelegate
    @NotNull
    public AddressOutputData getAddressOutputData() {
        return ((CardOutputData) ((a2) this._outputDataFlow).getValue()).getAddressState();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressDelegate
    @NotNull
    public i getAddressOutputDataFlow() {
        return r.c(((CardOutputData) ((a2) this._outputDataFlow).getValue()).getAddressState());
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    @NotNull
    public i getComponentStateFlow() {
        return this.componentStateFlow;
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    @NotNull
    public i getExceptionFlow() {
        return this.exceptionFlow;
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    @NotNull
    public CardOutputData getOutputData() {
        return (CardOutputData) ((a2) this._outputDataFlow).getValue();
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
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

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public boolean handleBackPress() {
        return false;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
        this.coroutineScope = coroutineScope;
        this.submitHandler.initialize(coroutineScope, getComponentStateFlow());
        initializeAnalytics(coroutineScope);
        initializeInputData();
        fetchPublicKey();
        if (isCvcHidden()) {
            r.u(coroutineScope, new w(getComponentStateFlow(), new C00801(null), 5));
            return;
        }
        ((a2) this._viewFlow).j(CardComponentViewType.StoredCardView.INSTANCE);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean isConfirmationRequired() {
        return ((a2) this._viewFlow).getValue() instanceof ButtonComponentViewType;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super PaymentComponentEvent<CardComponentState>, Unit> callback) {
        lifecycleOwner.getClass();
        coroutineScope.getClass();
        callback.getClass();
        this.observerRepository.addObservers(getComponentStateFlow(), getExceptionFlow(), getSubmitFlow(), lifecycleOwner, coroutineScope, callback);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void onCleared() {
        removeObserver();
        this.coroutineScope = null;
        this.analyticsManager.clear(this);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public void onSubmit() {
        this.submitHandler.onSubmit((CardComponentState) ((a2) this._componentStateFlow).getValue());
    }

    @Override // com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate
    public void removeObserver() {
        this.observerRepository.removeObservers();
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate, com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void setAddressLookupCallback(@NotNull AddressLookupCallback addressLookupCallback) {
        addressLookupCallback.getClass();
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate, com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void setAddressLookupResult(@NotNull AddressLookupResult addressLookupResult) {
        addressLookupResult.getClass();
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void setInteractionBlocked(boolean isInteractionBlocked) {
        this.submitHandler.setInteractionBlocked(isInteractionBlocked);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean shouldShowSubmitButton() {
        return isConfirmationRequired() && getComponentParams().isSubmitButtonVisible();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressDelegate
    public void updateAddressInputData(@NotNull Function1<? super AddressInputModel, Unit> update) {
        update.getClass();
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate, com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void updateAddressLookupOptions(@NotNull List<LookupAddress> options) {
        options.getClass();
    }

    public final void updateComponentState$card_release(@NotNull CardOutputData outputData) {
        outputData.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = StoredCardDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "updateComponentState", null);
        }
        ((a2) this._componentStateFlow).j(createComponentState(outputData));
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void updateInputData(@NotNull Function1<? super CardInputData, Unit> update) {
        update.getClass();
        update.invoke(this.inputData);
        onInputDataChanged();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public CardComponentParams getComponentParams() {
        return this.componentParams;
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void startAddressLookup() {
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void onCardScanningAvailability(boolean isAvailable) {
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void onCardScanningDisplayed(boolean didDisplay) {
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void setOnBinLookupListener(@Nullable Function1<? super List<BinLookupData>, Unit> listener) {
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void setOnBinValueListener(@Nullable Function1<? super String, Unit> listener) {
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void onCardScanningResult(int resultCode, @Nullable String pan, @Nullable Integer expiryMonth, @Nullable Integer expiryYear) {
    }
}
