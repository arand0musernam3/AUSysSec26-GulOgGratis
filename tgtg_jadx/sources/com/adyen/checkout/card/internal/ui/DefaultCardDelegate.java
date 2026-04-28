package com.adyen.checkout.card.internal.ui;

import androidx.lifecycle.LifecycleOwner;
import ba0.g;
import com.adyen.checkout.card.BinLookupData;
import com.adyen.checkout.card.CardComponentState;
import com.adyen.checkout.card.KCPAuthVisibility;
import com.adyen.checkout.card.R;
import com.adyen.checkout.card.SocialSecurityNumberVisibility;
import com.adyen.checkout.card.internal.analytics.CardEvents;
import com.adyen.checkout.card.internal.data.api.DetectCardTypeRepository;
import com.adyen.checkout.card.internal.data.model.Brand;
import com.adyen.checkout.card.internal.data.model.DetectedCardType;
import com.adyen.checkout.card.internal.ui.CardComponentViewType;
import com.adyen.checkout.card.internal.ui.model.CVCVisibility;
import com.adyen.checkout.card.internal.ui.model.CardComponentParams;
import com.adyen.checkout.card.internal.ui.model.CardInputData;
import com.adyen.checkout.card.internal.ui.model.CardListItem;
import com.adyen.checkout.card.internal.ui.model.CardOutputData;
import com.adyen.checkout.card.internal.ui.model.DualBrandData;
import com.adyen.checkout.card.internal.ui.model.InputFieldUIState;
import com.adyen.checkout.card.internal.ui.model.InstallmentParams;
import com.adyen.checkout.card.internal.ui.view.InstallmentModel;
import com.adyen.checkout.card.internal.util.BinLookupDataMapperKt;
import com.adyen.checkout.card.internal.util.CardAddressValidationUtils;
import com.adyen.checkout.card.internal.util.CardValidationUtils;
import com.adyen.checkout.card.internal.util.DualBrandedCardHandler;
import com.adyen.checkout.card.internal.util.InstallmentUtils;
import com.adyen.checkout.card.internal.util.KcpValidationUtils;
import com.adyen.checkout.components.core.AddressLookupCallback;
import com.adyen.checkout.components.core.AddressLookupResult;
import com.adyen.checkout.components.core.LookupAddress;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
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
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.core.internal.ui.model.ExpiryDateExtKt;
import com.adyen.checkout.core.ui.model.ExpiryDate;
import com.adyen.checkout.cse.EncryptionException;
import com.adyen.checkout.cse.UnencryptedCard;
import com.adyen.checkout.cse.internal.BaseCardEncryptor;
import com.adyen.checkout.cse.internal.BaseGenericEncryptor;
import com.adyen.checkout.ui.core.internal.data.api.AddressRepository;
import com.adyen.checkout.ui.core.internal.data.model.AddressItem;
import com.adyen.checkout.ui.core.internal.ui.AddressDelegate;
import com.adyen.checkout.ui.core.internal.ui.AddressFormUIState;
import com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate;
import com.adyen.checkout.ui.core.internal.ui.ButtonComponentViewType;
import com.adyen.checkout.ui.core.internal.ui.SubmitHandler;
import com.adyen.checkout.ui.core.internal.ui.model.AddressListItem;
import com.adyen.checkout.ui.core.internal.ui.model.AddressOutputData;
import com.adyen.checkout.ui.core.internal.ui.model.AddressParams;
import com.adyen.checkout.ui.core.internal.util.AddressFormUtils;
import com.adyen.checkout.ui.core.internal.util.AddressValidationUtils;
import com.adyen.checkout.ui.core.internal.util.SocialSecurityNumberUtils;
import com.braze.h2;
import e0.f;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.q;
import v80.b0;
import v80.f0;
import x70.c;
import x80.m;
import y70.a;
import y80.a2;
import y80.f1;
import y80.i;
import y80.p1;
import y80.r;
import y80.w;
import y80.y1;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00ad\u00022\u00020\u00012\u00020\u0002:\u0002\u00ad\u0002B\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b&\u0010'J \u0010,\u001a\u00020%2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0018\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0018\u00105\u001a\u00020%2\u0006\u00104\u001a\u000203H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b7\u0010'J\u0010\u00108\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b8\u0010'J\u0017\u0010,\u001a\u00020%2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u00109J9\u0010?\u001a\u00020%2\u0006\u0010;\u001a\u00020:2\u0006\u0010)\u001a\u00020(2\u0018\u0010>\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0=\u0012\u0004\u0012\u00020%0<H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020%H\u0016¢\u0006\u0004\bA\u0010'J#\u0010D\u001a\u00020%2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020%0<H\u0016¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\u00020%2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020%0<H\u0016¢\u0006\u0004\bF\u0010EJ\u0017\u0010H\u001a\u00020%2\u0006\u0010G\u001a\u000200H\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u000203H\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010P\u001a\u00020%2\u0006\u0010M\u001a\u00020LH\u0001¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020%H\u0016¢\u0006\u0004\bQ\u0010'J\u000f\u0010R\u001a\u00020%H\u0016¢\u0006\u0004\bR\u0010'J\u000f\u0010S\u001a\u000200H\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u000200H\u0016¢\u0006\u0004\bU\u0010TJ\u000f\u0010V\u001a\u000200H\u0016¢\u0006\u0004\bV\u0010TJ%\u0010X\u001a\u00020%2\u0014\u0010W\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020%\u0018\u00010<H\u0016¢\u0006\u0004\bX\u0010EJ+\u0010[\u001a\u00020%2\u001a\u0010W\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0Y\u0012\u0004\u0012\u00020%\u0018\u00010<H\u0016¢\u0006\u0004\b[\u0010EJ\u0017\u0010^\u001a\u00020%2\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b^\u0010_J\u001d\u0010a\u001a\u00020%2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020.0YH\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010e\u001a\u00020%2\u0006\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020%2\u0006\u0010g\u001a\u000200H\u0016¢\u0006\u0004\bh\u0010IJ\u0017\u0010j\u001a\u00020%2\u0006\u0010i\u001a\u000200H\u0016¢\u0006\u0004\bj\u0010IJ5\u0010p\u001a\u00020%2\u0006\u0010l\u001a\u00020k2\b\u0010m\u001a\u0004\u0018\u0001032\b\u0010n\u001a\u0004\u0018\u00010k2\b\u0010o\u001a\u0004\u0018\u00010kH\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020%H\u0016¢\u0006\u0004\br\u0010'J\u0017\u0010s\u001a\u00020%2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\bs\u00109J\u000f\u0010t\u001a\u00020%H\u0002¢\u0006\u0004\bt\u0010'J\u000f\u0010u\u001a\u00020%H\u0002¢\u0006\u0004\bu\u0010'J\u000f\u0010v\u001a\u00020%H\u0002¢\u0006\u0004\bv\u0010'J\u000f\u0010w\u001a\u00020%H\u0002¢\u0006\u0004\bw\u0010'J\u000f\u0010x\u001a\u00020%H\u0002¢\u0006\u0004\bx\u0010'J\u000f\u0010y\u001a\u00020%H\u0002¢\u0006\u0004\by\u0010'J@\u0010\u007f\u001a\u00020%2\u000e\b\u0002\u0010{\u001a\b\u0012\u0004\u0012\u00020z0Y2\u000e\b\u0002\u0010}\u001a\b\u0012\u0004\u0012\u00020|0Y2\u000e\b\u0002\u0010~\u001a\b\u0012\u0004\u0012\u00020|0YH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001JB\u0010\u0081\u0001\u001a\u00020L2\u000e\b\u0002\u0010{\u001a\b\u0012\u0004\u0012\u00020z0Y2\u000e\b\u0002\u0010}\u001a\b\u0012\u0004\u0012\u00020|0Y2\u000e\b\u0002\u0010~\u001a\b\u0012\u0004\u0012\u00020|0YH\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J0\u0010\u0085\u0001\u001a\u0002002\u000e\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010Y2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020z0YH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001c\u0010\u0087\u0001\u001a\u00020\u001a2\b\b\u0002\u0010M\u001a\u00020LH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0019\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0089\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J4\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u0002030\u008f\u00012\u0007\u0010\u008c\u0001\u001a\u0002032\u0007\u0010\u008d\u0001\u001a\u0002002\u0007\u0010\u008e\u0001\u001a\u000200H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J.\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u0002030\u008f\u00012\u0007\u0010\u0092\u0001\u001a\u0002032\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J-\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u0002030\u008f\u00012\u0007\u0010\u0097\u0001\u001a\u0002032\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010zH\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\"\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u0002030\u008f\u00012\u0007\u0010\u009b\u0001\u001a\u000203H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\"\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u0002030\u008f\u00012\u0007\u0010\u009e\u0001\u001a\u000203H\u0002¢\u0006\u0006\b\u009f\u0001\u0010\u009d\u0001J\"\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u0002030\u008f\u00012\u0007\u0010 \u0001\u001a\u000203H\u0002¢\u0006\u0006\b¡\u0001\u0010\u009d\u0001J\"\u0010£\u0001\u001a\t\u0012\u0004\u0012\u0002030\u008f\u00012\u0007\u0010¢\u0001\u001a\u000203H\u0002¢\u0006\u0006\b£\u0001\u0010\u009d\u0001JL\u0010¨\u0001\u001a\u00030§\u00012\u0006\u0010+\u001a\u00020*2\b\u0010¥\u0001\u001a\u00030¤\u00012\t\u0010¦\u0001\u001a\u0004\u0018\u00010z2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020|0Y2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020|0YH\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001e\u0010¬\u0001\u001a\u0002002\n\b\u0002\u0010«\u0001\u001a\u00030ª\u0001H\u0002¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0011\u0010®\u0001\u001a\u000200H\u0002¢\u0006\u0005\b®\u0001\u0010TJ\u0011\u0010¯\u0001\u001a\u000200H\u0002¢\u0006\u0005\b¯\u0001\u0010TJ\u0013\u0010°\u0001\u001a\u00030ª\u0001H\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0011\u0010²\u0001\u001a\u000200H\u0002¢\u0006\u0005\b²\u0001\u0010TJ\u001c\u0010³\u0001\u001a\u0002002\b\u0010¥\u0001\u001a\u00030¤\u0001H\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0013\u0010µ\u0001\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0005\bµ\u0001\u0010KJ:\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030»\u00010Y2\n\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00012\n\u0010¹\u0001\u001a\u0005\u0018\u00010¸\u00012\u0007\u0010º\u0001\u001a\u000200H\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0011\u0010¾\u0001\u001a\u00020%H\u0002¢\u0006\u0005\b¾\u0001\u0010'J\u001c\u0010À\u0001\u001a\u00020%2\t\u0010¿\u0001\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0005\bÀ\u0001\u00106J\u001e\u0010Á\u0001\u001a\u00030ª\u00012\t\u0010¦\u0001\u001a\u0004\u0018\u00010zH\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001f\u0010Ã\u0001\u001a\u00030ª\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0002¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J(\u0010Æ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010»\u00010\u008f\u00012\n\u0010Å\u0001\u001a\u0005\u0018\u00010»\u0001H\u0002¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001JC\u0010Í\u0001\u001a\u00020\u001a2\b\u0010É\u0001\u001a\u00030È\u00012\u0007\u0010Ê\u0001\u001a\u00020L2\u0007\u0010\u008c\u0001\u001a\u0002032\n\u0010Ë\u0001\u001a\u0005\u0018\u00010¸\u00012\u0007\u0010Ì\u0001\u001a\u000203H\u0002¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u0011\u0010Ï\u0001\u001a\u000200H\u0002¢\u0006\u0005\bÏ\u0001\u0010TJ\u001b\u0010Ñ\u0001\u001a\u00020k2\u0007\u0010Ð\u0001\u001a\u000203H\u0002¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J-\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030Ó\u00010Õ\u00012\b\u0010Ô\u0001\u001a\u00030Ó\u00012\u0007\u0010Ê\u0001\u001a\u00020LH\u0002¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u001b\u0010Ù\u0001\u001a\u0002002\u0007\u0010Ø\u0001\u001a\u00020LH\u0002¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J'\u0010Û\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010Y2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020z0YH\u0002¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J.\u0010ß\u0001\u001a\u0004\u0018\u0001032\f\u0010{\u001a\b\u0012\u0004\u0012\u00020z0Y2\n\u0010Þ\u0001\u001a\u0005\u0018\u00010Ý\u0001H\u0002¢\u0006\u0006\bß\u0001\u0010à\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010á\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010â\u0001R\u001d\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\b\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010æ\u0001R\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010ç\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010è\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010é\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010ê\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010ë\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010ì\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010í\u0001R\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010î\u0001R\u0015\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010ï\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010ð\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010ñ\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010ò\u0001R\u0017\u0010ó\u0001\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R\u001b\u0010õ\u0001\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u001e\u0010ø\u0001\u001a\t\u0012\u0004\u0012\u00020L0÷\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R&\u0010ú\u0001\u001a\t\u0012\u0004\u0012\u00020L0\u0089\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010\u008b\u0001R(\u0010\u0080\u0002\u001a\n\u0012\u0005\u0012\u00030§\u00010\u0089\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u008b\u0001R\u001e\u0010\u0081\u0002\u001a\t\u0012\u0004\u0012\u00020\u001a0÷\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010ù\u0001R&\u0010\u0082\u0002\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0089\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0002\u0010û\u0001\u001a\u0006\b\u0083\u0002\u0010\u008b\u0001R\u001f\u0010\u0086\u0002\u001a\n\u0012\u0005\u0012\u00030\u0085\u00020\u0084\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R'\u0010\u0088\u0002\u001a\n\u0012\u0005\u0012\u00030\u0085\u00020\u0089\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010û\u0001\u001a\u0006\b\u0089\u0002\u0010\u008b\u0001R\u001b\u0010\u008a\u0002\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R!\u0010\u008d\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008c\u00020÷\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0002\u0010ù\u0001R)\u0010\u008e\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008c\u00020\u0089\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008e\u0002\u0010û\u0001\u001a\u0006\b\u008f\u0002\u0010\u008b\u0001R&\u0010\u0090\u0002\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0089\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010û\u0001\u001a\u0006\b\u0091\u0002\u0010\u008b\u0001R'\u0010\u0093\u0002\u001a\n\u0012\u0005\u0012\u00030\u0092\u00020\u0089\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0093\u0002\u0010û\u0001\u001a\u0006\b\u0094\u0002\u0010\u008b\u0001R'\u0010\u0096\u0002\u001a\n\u0012\u0005\u0012\u00030\u0095\u00020\u0089\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0002\u0010û\u0001\u001a\u0006\b\u0097\u0002\u0010\u008b\u0001R'\u0010\u0098\u0002\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020%\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0099\u0002R-\u0010\u009a\u0002\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0Y\u0012\u0004\u0012\u00020%\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u0099\u0002R\u0018\u0010\u009e\u0002\u001a\u00030\u009b\u00028\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R \u0010 \u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001030\u0089\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u009f\u0002\u0010\u008b\u0001R\u001f\u0010£\u0002\u001a\n\u0012\u0005\u0012\u00030¡\u00020\u0089\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b¢\u0002\u0010\u008b\u0001R\u001e\u0010¥\u0002\u001a\t\u0012\u0004\u0012\u00020*0\u0089\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b¤\u0002\u0010\u008b\u0001R\u0018\u0010¨\u0002\u001a\u00030§\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0002\u0010§\u0002R\u0016\u0010M\u001a\u00020L8VX\u0096\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010ª\u0002R\u0016\u0010)\u001a\u00020(8BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010¬\u0002¨\u0006®\u0002"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/DefaultCardDelegate;", "Lcom/adyen/checkout/card/internal/ui/CardDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/AddressLookupDelegate;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "observerRepository", "Lcom/adyen/checkout/components/core/internal/data/api/PublicKeyRepository;", "publicKeyRepository", "Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;", "componentParams", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/OrderRequest;", "order", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/ui/core/internal/data/api/AddressRepository;", "addressRepository", "Lcom/adyen/checkout/card/internal/data/api/DetectCardTypeRepository;", "detectCardTypeRepository", "Lcom/adyen/checkout/card/internal/ui/CardValidationMapper;", "cardValidationMapper", "Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;", "cardEncryptor", "Lcom/adyen/checkout/cse/internal/BaseGenericEncryptor;", "genericEncryptor", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/card/CardComponentState;", "submitHandler", "addressLookupDelegate", "Lcom/adyen/checkout/card/internal/ui/CardConfigDataGenerator;", "cardConfigDataGenerator", "Lcom/adyen/checkout/card/internal/util/DualBrandedCardHandler;", "dualBrandedCardHandler", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "sdkDataProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;Lcom/adyen/checkout/components/core/internal/data/api/PublicKeyRepository;Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/ui/core/internal/data/api/AddressRepository;Lcom/adyen/checkout/card/internal/data/api/DetectCardTypeRepository;Lcom/adyen/checkout/card/internal/ui/CardValidationMapper;Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;Lcom/adyen/checkout/cse/internal/BaseGenericEncryptor;Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;Lcom/adyen/checkout/ui/core/internal/ui/AddressLookupDelegate;Lcom/adyen/checkout/card/internal/ui/CardConfigDataGenerator;Lcom/adyen/checkout/card/internal/util/DualBrandedCardHandler;Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;)V", "", "clear", "()V", "Lv80/b0;", "coroutineScope", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "addressInputModel", "initialize", "(Lv80/b0;Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;)V", "Lcom/adyen/checkout/components/core/LookupAddress;", "lookupAddress", "", "onAddressLookupCompletion", "(Lcom/adyen/checkout/components/core/LookupAddress;)Z", "", "query", "onAddressQueryChanged", "(Ljava/lang/String;)V", "onManualEntryModeSelected", "submitAddress", "(Lv80/b0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "Lcom/adyen/checkout/card/internal/ui/model/CardInputData;", "update", "updateInputData", "(Lkotlin/jvm/functions/Function1;)V", "updateAddressInputData", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "getPaymentMethodType", "()Ljava/lang/String;", "Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;", "outputData", "updateComponentState$card_release", "(Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;)V", "updateComponentState", "onSubmit", "startAddressLookup", "handleBackPress", "()Z", "isConfirmationRequired", "shouldShowSubmitButton", "listener", "setOnBinValueListener", "", "Lcom/adyen/checkout/card/BinLookupData;", "setOnBinLookupListener", "Lcom/adyen/checkout/components/core/AddressLookupCallback;", "addressLookupCallback", "setAddressLookupCallback", "(Lcom/adyen/checkout/components/core/AddressLookupCallback;)V", "options", "updateAddressLookupOptions", "(Ljava/util/List;)V", "Lcom/adyen/checkout/components/core/AddressLookupResult;", "addressLookupResult", "setAddressLookupResult", "(Lcom/adyen/checkout/components/core/AddressLookupResult;)V", "isAvailable", "onCardScanningAvailability", "didDisplay", "onCardScanningDisplayed", "", StatusResponse.RESULT_CODE, "pan", "expiryMonth", "expiryYear", "onCardScanningResult", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "onCleared", "initializeAnalytics", "fetchPublicKey", "onInputDataChanged", "subscribeToDetectedCardTypes", "subscribeToDualBrandedAnalyticsEvents", "subscribeToCountryList", "subscribeToStatesList", "Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "detectedCardTypes", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressListItem;", "countryOptions", "stateOptions", "updateOutputData", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "createOutputData", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;", "Lcom/adyen/checkout/card/internal/ui/model/CardListItem;", "cardBrands", "isCardListVisible", "(Ljava/util/List;Ljava/util/List;)Z", "createComponentState", "(Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;)Lcom/adyen/checkout/card/CardComponentState;", "Ly80/i;", "getTrackedSubmitFlow", "()Ly80/i;", "cardNumber", "enableLuhnCheck", "isBrandSupported", "Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "validateCardNumber", "(Ljava/lang/String;ZZ)Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "expiryDate", "Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;", "expiryDatePolicy", "validateExpiryDate", "(Ljava/lang/String;Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;)Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "securityCode", "cardType", "validateSecurityCode", "(Ljava/lang/String;Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;)Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "holderName", "validateHolderName", "(Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "socialSecurityNumber", "validateSocialSecurityNumber", "kcpBirthDateOrTaxNumber", "validateKcpBirthDateOrTaxNumber", "kcpCardPassword", "validateKcpCardPassword", "Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;", "addressFormUIState", "detectedCardType", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "validateAddress", "(Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;Ljava/util/List;Ljava/util/List;)Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;", "cvcUIState", "isCvcHidden", "(Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;)Z", "isSocialSecurityNumberRequired", "isKCPAuthRequired", "getHolderNameUIState", "()Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;", "isHolderNameRequired", "isAddressRequired", "(Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;)Z", "getFundingSource", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentParams;", "installmentParams", "Lcom/adyen/checkout/core/CardBrand;", "cardBrand", "isCardTypeReliable", "Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;", "getInstallmentOptions", "(Lcom/adyen/checkout/card/internal/ui/model/InstallmentParams;Lcom/adyen/checkout/core/CardBrand;Z)Ljava/util/List;", "requestCountryList", "countryCode", "requestStateList", "makeCvcUIState", "(Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;)Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;", "makeExpiryDateUIState", "(Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;)Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;", "installmentModel", "makeInstallmentFieldState", "(Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;)Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "Lcom/adyen/checkout/cse/EncryptedCard;", "encryptedCard", "stateOutputData", "firstCardBrand", "binValue", "mapComponentState", "(Lcom/adyen/checkout/cse/EncryptedCard;Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;Ljava/lang/String;Lcom/adyen/checkout/core/CardBrand;Ljava/lang/String;)Lcom/adyen/checkout/card/CardComponentState;", "showStorePaymentField", "input", "getKcpBirthDateOrTaxNumberHint", "(Ljava/lang/String;)I", "Lcom/adyen/checkout/components/core/paymentmethod/CardPaymentMethod;", "cardPaymentMethod", "Lcom/adyen/checkout/components/core/PaymentComponentData;", "makePaymentComponentData", "(Lcom/adyen/checkout/components/core/paymentmethod/CardPaymentMethod;Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;)Lcom/adyen/checkout/components/core/PaymentComponentData;", "cardOutputData", "isInstallmentsRequired", "(Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;)Z", "getCardBrands", "(Ljava/util/List;)Ljava/util/List;", "Lcom/adyen/checkout/card/internal/ui/model/DualBrandData;", "dualBrandData", "getCardBrand", "(Ljava/util/List;Lcom/adyen/checkout/card/internal/ui/model/DualBrandData;)Ljava/lang/String;", "Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "Lcom/adyen/checkout/components/core/internal/data/api/PublicKeyRepository;", "Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;", "Lcom/adyen/checkout/components/core/PaymentMethod;", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/ui/core/internal/data/api/AddressRepository;", "Lcom/adyen/checkout/card/internal/data/api/DetectCardTypeRepository;", "Lcom/adyen/checkout/card/internal/ui/CardValidationMapper;", "Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;", "Lcom/adyen/checkout/cse/internal/BaseGenericEncryptor;", "Lcom/adyen/checkout/ui/core/internal/ui/SubmitHandler;", "Lcom/adyen/checkout/ui/core/internal/ui/AddressLookupDelegate;", "Lcom/adyen/checkout/card/internal/ui/CardConfigDataGenerator;", "Lcom/adyen/checkout/card/internal/util/DualBrandedCardHandler;", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "inputData", "Lcom/adyen/checkout/card/internal/ui/model/CardInputData;", "publicKey", "Ljava/lang/String;", "Ly80/f1;", "_outputDataFlow", "Ly80/f1;", "outputDataFlow", "Ly80/i;", "getOutputDataFlow", "addressOutputDataFlow$delegate", "Lu70/j;", "getAddressOutputDataFlow", "addressOutputDataFlow", "_componentStateFlow", "componentStateFlow", "getComponentStateFlow", "Lx80/m;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "exceptionChannel", "Lx80/m;", "exceptionFlow", "getExceptionFlow", "_coroutineScope", "Lv80/b0;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "_viewFlow", "viewFlow", "getViewFlow", "submitFlow", "getSubmitFlow", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState;", "uiStateFlow", "getUiStateFlow", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent;", "uiEventFlow", "getUiEventFlow", "onBinValueListener", "Lkotlin/jvm/functions/Function1;", "onBinLookupListener", "Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;", "getAddressDelegate", "()Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;", "addressDelegate", "getAddressLookupErrorPopupFlow", "addressLookupErrorPopupFlow", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "getAddressLookupStateFlow", "addressLookupStateFlow", "getAddressLookupSubmitFlow", "addressLookupSubmitFlow", "getAddressOutputData", "()Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "addressOutputData", "getOutputData", "()Lcom/adyen/checkout/card/internal/ui/model/CardOutputData;", "getCoroutineScope", "()Lv80/b0;", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultCardDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 RunCompileOnly.kt\ncom/adyen/checkout/core/internal/util/RunCompileOnlyKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n16#2,17:963\n16#2,17:980\n16#2,17:997\n16#2,17:1034\n16#2,17:1059\n16#2,17:1076\n44#2,4:1097\n44#2,4:1110\n16#2,17:1129\n49#3:1014\n51#3:1018\n49#3:1019\n51#3:1023\n49#3:1024\n51#3:1028\n49#3:1029\n51#3:1033\n46#4:1015\n51#4:1017\n46#4:1020\n51#4:1022\n46#4:1025\n51#4:1027\n46#4:1030\n51#4:1032\n105#5:1016\n105#5:1021\n105#5:1026\n105#5:1031\n1755#6,3:1051\n774#6:1054\n865#6,2:1055\n295#6,2:1057\n1557#6:1119\n1628#6,2:1120\n1557#6:1122\n1628#6,3:1123\n1630#6:1126\n295#6,2:1127\n16#7,4:1093\n20#7,5:1101\n16#7,4:1106\n20#7,5:1114\n1#8:1146\n*S KotlinDebug\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate\n*L\n187#1:963,17\n217#1:980,17\n256#1:997,17\n371#1:1034,17\n456#1:1059,17\n709#1:1076,17\n760#1:1097,4\n794#1:1110,4\n894#1:1129,17\n280#1:1014\n280#1:1018\n291#1:1019\n291#1:1023\n307#1:1024\n307#1:1028\n310#1:1029\n310#1:1033\n280#1:1015\n280#1:1017\n291#1:1020\n291#1:1022\n307#1:1025\n307#1:1027\n310#1:1030\n310#1:1032\n280#1:1016\n291#1:1021\n307#1:1026\n310#1:1031\n381#1:1051,3\n383#1:1054\n383#1:1055,2\n386#1:1057,2\n854#1:1119\n854#1:1120,2\n857#1:1122\n857#1:1123,3\n854#1:1126\n870#1:1127,2\n760#1:1093,4\n760#1:1101,5\n794#1:1106,4\n794#1:1114,5\n*E\n"})
public final class DefaultCardDelegate implements CardDelegate, AddressLookupDelegate {
    public static final int BIN_VALUE_EXTENDED_LENGTH = 8;
    public static final int BIN_VALUE_LENGTH = 6;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DEBIT_FUNDING_SOURCE = "debit";

    @NotNull
    private static final String DUAL_BRAND_ANALYTICS_TARGET = "dual_brand_button";

    @NotNull
    private static final String ENCRYPTION_KEY_FOR_KCP_PASSWORD = "password";
    private static final int EXTENDED_CARD_NUMBER_LENGTH = 16;
    private static final int LAST_FOUR_LENGTH = 4;

    @NotNull
    private final f1 _componentStateFlow;

    @Nullable
    private b0 _coroutineScope;

    @NotNull
    private final f1 _outputDataFlow;

    @NotNull
    private final f1 _viewFlow;

    @NotNull
    private final AddressLookupDelegate addressLookupDelegate;

    /* JADX INFO: renamed from: addressOutputDataFlow$delegate, reason: from kotlin metadata */
    @NotNull
    private final j addressOutputDataFlow;

    @NotNull
    private final AddressRepository addressRepository;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final CardConfigDataGenerator cardConfigDataGenerator;

    @NotNull
    private final BaseCardEncryptor cardEncryptor;

    @NotNull
    private final CardValidationMapper cardValidationMapper;

    @NotNull
    private final CardComponentParams componentParams;

    @NotNull
    private final i componentStateFlow;

    @NotNull
    private final DetectCardTypeRepository detectCardTypeRepository;

    @NotNull
    private final DualBrandedCardHandler dualBrandedCardHandler;

    @NotNull
    private final m exceptionChannel;

    @NotNull
    private final i exceptionFlow;

    @NotNull
    private final BaseGenericEncryptor genericEncryptor;

    @NotNull
    private final CardInputData inputData;

    @NotNull
    private final PaymentObserverRepository observerRepository;

    @Nullable
    private Function1<? super List<BinLookupData>, Unit> onBinLookupListener;

    @Nullable
    private Function1<? super String, Unit> onBinValueListener;

    @Nullable
    private final OrderRequest order;

    @NotNull
    private final i outputDataFlow;

    @NotNull
    private final PaymentMethod paymentMethod;

    @Nullable
    private String publicKey;

    @NotNull
    private final PublicKeyRepository publicKeyRepository;

    @NotNull
    private final SdkDataProvider sdkDataProvider;

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
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Brand.FieldPolicy.values().length];
            try {
                iArr[Brand.FieldPolicy.OPTIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Brand.FieldPolicy.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Brand.FieldPolicy.REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CVCVisibility.values().length];
            try {
                iArr2[CVCVisibility.ALWAYS_SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CVCVisibility.HIDE_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CVCVisibility.ALWAYS_HIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$fetchPublicKey$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$fetchPublicKey$2", f = "DefaultCardDelegate.kt", l = {219}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nDefaultCardDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate$fetchPublicKey$2\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,962:1\n16#2,17:963\n16#2,17:980\n*S KotlinDebug\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate$fetchPublicKey$2\n*L\n224#1:963,17\n229#1:980,17\n*E\n"})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = DefaultCardDelegate.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b0 b0Var;
            Object obj2;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                b0 b0Var2 = (b0) this.L$0;
                PublicKeyRepository publicKeyRepository = DefaultCardDelegate.this.publicKeyRepository;
                Environment environment = DefaultCardDelegate.this.getComponentParams().getEnvironment();
                String clientKey = DefaultCardDelegate.this.getComponentParams().getClientKey();
                this.L$0 = b0Var2;
                this.label = 1;
                Object objMo85fetchPublicKey0E7RQCE = publicKeyRepository.mo85fetchPublicKey0E7RQCE(environment, clientKey, this);
                if (objMo85fetchPublicKey0E7RQCE == aVar) {
                    return aVar;
                }
                b0Var = b0Var2;
                obj2 = objMo85fetchPublicKey0E7RQCE;
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0Var = (b0) this.L$0;
                g.M(obj);
                obj2 = ((q) obj).f40851a;
            }
            DefaultCardDelegate defaultCardDelegate = DefaultCardDelegate.this;
            Throwable thA = q.a(obj2);
            if (thA == null) {
                String str = (String) obj2;
                AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
                AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
                if (companion.getLogger().shouldLog(adyenLogLevel)) {
                    String name = b0Var.getClass().getName();
                    String strY = StringsKt.Y(name, '$');
                    String strW = StringsKt.W('.', strY, strY);
                    if (strW.length() != 0) {
                        name = StringsKt.O(strW, "Kt");
                    }
                    companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Public key fetched", null);
                }
                defaultCardDelegate.publicKey = str;
                defaultCardDelegate.updateComponentState$card_release(defaultCardDelegate.getOutputData());
            } else {
                AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.ERROR;
                AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
                if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
                    String name2 = b0Var.getClass().getName();
                    String strY2 = StringsKt.Y(name2, '$');
                    String strW2 = StringsKt.W('.', strY2, strY2);
                    if (strW2.length() != 0) {
                        name2 = StringsKt.O(strW2, "Kt");
                    }
                    companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Unable to fetch public key", null);
                }
                GenericEvents genericEvents = GenericEvents.INSTANCE;
                String type = defaultCardDelegate.paymentMethod.getType();
                if (type == null) {
                    type = "";
                }
                defaultCardDelegate.analyticsManager.trackEvent(GenericEvents.error$default(genericEvents, type, ErrorEvent.API_PUBLIC_KEY, null, null, 12, null));
                defaultCardDelegate.exceptionChannel.h(new ComponentException("Unable to fetch publicKey.", thA));
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$getTrackedSubmitFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$getTrackedSubmitFlow$1", f = "DefaultCardDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/card/CardComponentState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.i implements Function2<CardComponentState, c<? super Unit>, Object> {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return DefaultCardDelegate.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CardComponentState cardComponentState, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(cardComponentState, cVar)).invokeSuspend(Unit.f26487a);
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
            String type = DefaultCardDelegate.this.paymentMethod.getType();
            if (type == null) {
                type = "";
            }
            DefaultCardDelegate.this.analyticsManager.trackEvent(genericEvents.submit(type));
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$initialize$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$initialize$1", f = "DefaultCardDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00721 extends z70.i implements Function2<AddressInputModel, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C00721(c<? super C00721> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00721 c00721 = DefaultCardDelegate.this.new C00721(cVar);
            c00721.L$0 = obj;
            return c00721;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AddressInputModel addressInputModel, @Nullable c<? super Unit> cVar) {
            return ((C00721) create(addressInputModel, cVar)).invokeSuspend(Unit.f26487a);
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
            AddressInputModel addressInputModel = (AddressInputModel) this.L$0;
            ((a2) DefaultCardDelegate.this._viewFlow).j(CardComponentViewType.DefaultCardView.INSTANCE);
            DefaultCardDelegate.this.inputData.getAddress().set(addressInputModel);
            DefaultCardDelegate.updateOutputData$default(DefaultCardDelegate.this, null, null, null, 7, null);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToCountryList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToCountryList$1", f = "DefaultCardDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "countries", "", "Lcom/adyen/checkout/ui/core/internal/data/model/AddressItem;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultCardDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate$subscribeToCountryList$1\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,962:1\n16#2,17:963\n295#3,2:980\n*S KotlinDebug\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate$subscribeToCountryList$1\n*L\n327#1:963,17\n333#1:980,2\n*E\n"})
    public static final class C00741 extends z70.i implements Function2<List<? extends AddressItem>, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C00741(c<? super C00741> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00741 c00741 = DefaultCardDelegate.this.new C00741(cVar);
            c00741.L$0 = obj;
            return c00741;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull List<AddressItem> list, @Nullable c<? super Unit> cVar) {
            return ((C00741) create(list, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            Object obj2 = null;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            List<AddressItem> list = (List) this.L$0;
            DefaultCardDelegate defaultCardDelegate = DefaultCardDelegate.this;
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = defaultCardDelegate.getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), s.f(list.size(), "New countries emitted - countries: "), null);
            }
            List<AddressListItem> listInitializeCountryOptions = AddressFormUtils.INSTANCE.initializeCountryOptions(DefaultCardDelegate.this.getComponentParams().getShopperLocale(), DefaultCardDelegate.this.getComponentParams().getAddressParams(), list);
            Iterator<T> it = listInitializeCountryOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((AddressListItem) next).getSelected()) {
                    obj2 = next;
                    break;
                }
            }
            AddressListItem addressListItem = (AddressListItem) obj2;
            if (addressListItem != null) {
                DefaultCardDelegate defaultCardDelegate2 = DefaultCardDelegate.this;
                defaultCardDelegate2.inputData.getAddress().setCountry(addressListItem.getCode());
                defaultCardDelegate2.inputData.getAddress().setCountryDisplayName(addressListItem.getName());
                defaultCardDelegate2.requestStateList(addressListItem.getCode());
            }
            DefaultCardDelegate.updateOutputData$default(DefaultCardDelegate.this, null, listInitializeCountryOptions, null, 5, null);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$1", f = "DefaultCardDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "detectedCardTypes", "", "Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultCardDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate$subscribeToDetectedCardTypes$1\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,962:1\n16#2,15:963\n32#2:982\n1557#3:978\n1628#3,3:979\n1557#3:983\n1628#3,3:984\n*S KotlinDebug\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate$subscribeToDetectedCardTypes$1\n*L\n271#1:963,15\n271#1:982\n272#1:978\n272#1:979,3\n276#1:983\n276#1:984,3\n*E\n"})
    public static final class C00751 extends z70.i implements Function2<List<? extends DetectedCardType>, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C00751(c<? super C00751> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00751 c00751 = DefaultCardDelegate.this.new C00751(cVar);
            c00751.L$0 = obj;
            return c00751;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull List<DetectedCardType> list, @Nullable c<? super Unit> cVar) {
            return ((C00751) create(list, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            List list = (List) this.L$0;
            DefaultCardDelegate defaultCardDelegate = DefaultCardDelegate.this;
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = defaultCardDelegate.getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                String strConcat = "CO.".concat(name);
                AdyenLogger logger = companion.getLogger();
                ArrayList arrayList = new ArrayList(e0.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DetectedCardType) it.next()).getCardBrand());
                }
                DetectedCardType detectedCardType = (DetectedCardType) CollectionsKt.firstOrNull(list);
                logger.log(adyenLogLevel, strConcat, "New detected card types emitted - detectedCardTypes: " + arrayList + " - isReliable: " + (detectedCardType != null ? Boolean.valueOf(detectedCardType.isReliable()) : null), null);
            }
            if (!Intrinsics.areEqual(list, DefaultCardDelegate.this.getOutputData().getDetectedCardTypes()) && (function1 = DefaultCardDelegate.this.onBinLookupListener) != null) {
                ArrayList arrayList2 = new ArrayList(e0.o(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(BinLookupDataMapperKt.toBinLookupData((DetectedCardType) it2.next()));
                }
                function1.invoke(arrayList2);
            }
            DefaultCardDelegate.updateOutputData$default(DefaultCardDelegate.this, list, null, null, 6, null);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$3", f = "DefaultCardDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "", "Lcom/adyen/checkout/core/CardBrand;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends z70.i implements Function2<List<? extends CardBrand>, c<? super Unit>, Object> {
        int label;

        public AnonymousClass3(c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return DefaultCardDelegate.this.new AnonymousClass3(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull List<CardBrand> list, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass3) create(list, cVar)).invokeSuspend(Unit.f26487a);
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
            DefaultCardDelegate.this.inputData.setSelectedCardBrand(null);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$2", f = "DefaultCardDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u008a@"}, d2 = {"<anonymous>", "", "brand", "Lcom/adyen/checkout/core/CardBrand;", "Lcom/adyen/checkout/card/CardBrand;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultCardDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$2\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,962:1\n16#2,17:963\n*S KotlinDebug\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$2\n*L\n302#1:963,17\n*E\n"})
    public static final class C00762 extends z70.i implements Function2<CardBrand, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C00762(c<? super C00762> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00762 c00762 = DefaultCardDelegate.this.new C00762(cVar);
            c00762.L$0 = obj;
            return c00762;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CardBrand cardBrand, @Nullable c<? super Unit> cVar) {
            return ((C00762) create(cardBrand, cVar)).invokeSuspend(Unit.f26487a);
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
            CardBrand cardBrand = (CardBrand) this.L$0;
            if (DefaultCardDelegate.this.inputData.getSelectedCardBrand() != null) {
                GenericEvents genericEvents = GenericEvents.INSTANCE;
                String type = DefaultCardDelegate.this.paymentMethod.getType();
                if (type == null) {
                    type = "";
                }
                DefaultCardDelegate.this.analyticsManager.trackEvent(GenericEvents.selected$default(genericEvents, type, DefaultCardDelegate.DUAL_BRAND_ANALYTICS_TARGET, null, cardBrand.getTxVariant(), 4, null));
                DefaultCardDelegate defaultCardDelegate = DefaultCardDelegate.this;
                AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
                AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
                if (companion.getLogger().shouldLog(adyenLogLevel)) {
                    String name = defaultCardDelegate.getClass().getName();
                    String strY = StringsKt.Y(name, '$');
                    String strW = StringsKt.W('.', strY, strY);
                    if (strW.length() != 0) {
                        name = StringsKt.O(strW, "Kt");
                    }
                    companion.getLogger().log(adyenLogLevel, "CO.".concat(name), f.k("brand selection changed: ", cardBrand.getTxVariant()), null);
                }
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToStatesList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToStatesList$1", f = "DefaultCardDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "states", "", "Lcom/adyen/checkout/ui/core/internal/data/model/AddressItem;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultCardDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate$subscribeToStatesList$1\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,962:1\n16#2,17:963\n*S KotlinDebug\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate$subscribeToStatesList$1\n*L\n347#1:963,17\n*E\n"})
    public static final class C00771 extends z70.i implements Function2<List<? extends AddressItem>, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C00771(c<? super C00771> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00771 c00771 = DefaultCardDelegate.this.new C00771(cVar);
            c00771.L$0 = obj;
            return c00771;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull List<AddressItem> list, @Nullable c<? super Unit> cVar) {
            return ((C00771) create(list, cVar)).invokeSuspend(Unit.f26487a);
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
            List<AddressItem> list = (List) this.L$0;
            DefaultCardDelegate defaultCardDelegate = DefaultCardDelegate.this;
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = defaultCardDelegate.getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), s.f(list.size(), "New states emitted - states: "), null);
            }
            DefaultCardDelegate.updateOutputData$default(DefaultCardDelegate.this, null, null, AddressFormUtils.INSTANCE.initializeStateOptions(list), 3, null);
            return Unit.f26487a;
        }
    }

    public DefaultCardDelegate(@NotNull PaymentObserverRepository paymentObserverRepository, @NotNull PublicKeyRepository publicKeyRepository, @NotNull CardComponentParams cardComponentParams, @NotNull PaymentMethod paymentMethod, @Nullable OrderRequest orderRequest, @NotNull AnalyticsManager analyticsManager, @NotNull AddressRepository addressRepository, @NotNull DetectCardTypeRepository detectCardTypeRepository, @NotNull CardValidationMapper cardValidationMapper, @NotNull BaseCardEncryptor baseCardEncryptor, @NotNull BaseGenericEncryptor baseGenericEncryptor, @NotNull SubmitHandler<CardComponentState> submitHandler, @NotNull AddressLookupDelegate addressLookupDelegate, @NotNull CardConfigDataGenerator cardConfigDataGenerator, @NotNull DualBrandedCardHandler dualBrandedCardHandler, @NotNull SdkDataProvider sdkDataProvider) {
        paymentObserverRepository.getClass();
        publicKeyRepository.getClass();
        cardComponentParams.getClass();
        paymentMethod.getClass();
        analyticsManager.getClass();
        addressRepository.getClass();
        detectCardTypeRepository.getClass();
        cardValidationMapper.getClass();
        baseCardEncryptor.getClass();
        baseGenericEncryptor.getClass();
        submitHandler.getClass();
        addressLookupDelegate.getClass();
        cardConfigDataGenerator.getClass();
        dualBrandedCardHandler.getClass();
        sdkDataProvider.getClass();
        this.observerRepository = paymentObserverRepository;
        this.publicKeyRepository = publicKeyRepository;
        this.componentParams = cardComponentParams;
        this.paymentMethod = paymentMethod;
        this.order = orderRequest;
        this.analyticsManager = analyticsManager;
        this.addressRepository = addressRepository;
        this.detectCardTypeRepository = detectCardTypeRepository;
        this.cardValidationMapper = cardValidationMapper;
        this.cardEncryptor = baseCardEncryptor;
        this.genericEncryptor = baseGenericEncryptor;
        this.submitHandler = submitHandler;
        this.addressLookupDelegate = addressLookupDelegate;
        this.cardConfigDataGenerator = cardConfigDataGenerator;
        this.dualBrandedCardHandler = dualBrandedCardHandler;
        this.sdkDataProvider = sdkDataProvider;
        this.inputData = new CardInputData(null, null, null, null, null, null, null, null, null, false, null, null, 4095, null);
        a2 a2VarC = r.c(createOutputData$default(this, null, null, null, 7, null));
        this._outputDataFlow = a2VarC;
        this.outputDataFlow = a2VarC;
        this.addressOutputDataFlow = l.b(new Function0<y1>() { // from class: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$addressOutputDataFlow$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final y1 invoke() {
                final i outputDataFlow = this.this$0.getOutputDataFlow();
                return r.x(new i() { // from class: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$addressOutputDataFlow$2$invoke$$inlined$map$1

                    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$addressOutputDataFlow$2$invoke$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate$addressOutputDataFlow$2\n*L\n1#1,49:1\n50#2:50\n133#3:51\n*E\n"})
                    public static final class AnonymousClass2<T> implements y80.j {
                        final /* synthetic */ y80.j $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$addressOutputDataFlow$2$invoke$$inlined$map$1$2$1, reason: invalid class name */
                        @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$addressOutputDataFlow$2$invoke$$inlined$map$1$2", f = "DefaultCardDelegate.kt", l = {50}, m = "emit")
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        public static final class AnonymousClass1 extends z70.c {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(c cVar) {
                                super(cVar);
                            }

                            @Override // z70.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(y80.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // y80.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, x70.c r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.adyen.checkout.card.internal.ui.DefaultCardDelegate$addressOutputDataFlow$2$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.adyen.checkout.card.internal.ui.DefaultCardDelegate$addressOutputDataFlow$2$invoke$$inlined$map$1$2$1 r0 = (com.adyen.checkout.card.internal.ui.DefaultCardDelegate$addressOutputDataFlow$2$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.adyen.checkout.card.internal.ui.DefaultCardDelegate$addressOutputDataFlow$2$invoke$$inlined$map$1$2$1 r0 = new com.adyen.checkout.card.internal.ui.DefaultCardDelegate$addressOutputDataFlow$2$invoke$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                y70.a r1 = y70.a.COROUTINE_SUSPENDED
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L2e
                                if (r2 != r3) goto L27
                                ba0.g.M(r6)
                                goto L42
                            L27:
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                com.braze.h2.b(r5)
                                r5 = 0
                                return r5
                            L2e:
                                ba0.g.M(r6)
                                y80.j r6 = r4.$this_unsafeFlow
                                com.adyen.checkout.card.internal.ui.model.CardOutputData r5 = (com.adyen.checkout.card.internal.ui.model.CardOutputData) r5
                                com.adyen.checkout.ui.core.internal.ui.model.AddressOutputData r5 = r5.getAddressState()
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L42
                                return r1
                            L42:
                                kotlin.Unit r5 = kotlin.Unit.f26487a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$addressOutputDataFlow$2$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                        }
                    }

                    @Override // y80.i
                    public Object collect(y80.j jVar, c cVar) {
                        Object objCollect = outputDataFlow.collect(new AnonymousClass2(jVar), cVar);
                        return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
                    }
                }, this.this$0.getCoroutineScope(), p1.f45552b, this.this$0.getOutputData().getAddressState());
            }
        });
        a2 a2VarC2 = r.c(createComponentState$default(this, null, 1, null));
        this._componentStateFlow = a2VarC2;
        this.componentStateFlow = a2VarC2;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.exceptionChannel = mVarBufferedChannel;
        this.exceptionFlow = r.w(mVarBufferedChannel);
        a2 a2VarC3 = r.c(CardComponentViewType.DefaultCardView.INSTANCE);
        this._viewFlow = a2VarC3;
        this.viewFlow = a2VarC3;
        this.submitFlow = getTrackedSubmitFlow();
        this.uiStateFlow = submitHandler.getUiStateFlow();
        this.uiEventFlow = submitHandler.getUiEventFlow();
    }

    private final CardComponentState createComponentState(CardOutputData outputData) {
        CardBrand cardBrand;
        Function1<? super String, Unit> function1;
        CardComponentState cardComponentState;
        String value = outputData.getCardNumberState().getValue();
        DualBrandData dualBrandData = outputData.getDualBrandData();
        if (dualBrandData == null || (cardBrand = dualBrandData.getSelectedBrand()) == null) {
            DetectedCardType detectedCardType = (DetectedCardType) CollectionsKt.firstOrNull(outputData.getDetectedCardTypes());
            if (detectedCardType != null) {
                CardBrand cardBrand2 = detectedCardType.getCardBrand();
                cardBrand = cardBrand2;
            } else {
                cardBrand = null;
            }
        } else {
            cardBrand = cardBrand2;
        }
        String strX = (!outputData.getCardNumberState().getValidation().isValid() || value.length() < 16) ? kotlin.text.b0.x(6, value) : kotlin.text.b0.x(8, value);
        f1 f1Var = this._componentStateFlow;
        if (!Intrinsics.areEqual((f1Var == null || (cardComponentState = (CardComponentState) ((a2) f1Var).getValue()) == null) ? null : cardComponentState.getBinValue(), strX) && (function1 = this.onBinValueListener) != null) {
            function1.invoke(strX);
        }
        String str = this.publicKey;
        if (!outputData.getIsValid() || str == null) {
            return new CardComponentState(new PaymentComponentData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16376, null), outputData.getIsValid(), str != null, cardBrand, strX, null);
        }
        UnencryptedCard.Builder builder = new UnencryptedCard.Builder();
        try {
            builder.setNumber(outputData.getCardNumberState().getValue());
            if (!isCvcHidden$default(this, null, 1, null)) {
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
            return mapComponentState(this.cardEncryptor.encryptFields(builder.build(), str), outputData, value, cardBrand, strX);
        } catch (EncryptionException e5) {
            GenericEvents genericEvents = GenericEvents.INSTANCE;
            String type = this.paymentMethod.getType();
            if (type == null) {
                type = "";
            }
            this.analyticsManager.trackEvent(GenericEvents.error$default(genericEvents, type, ErrorEvent.ENCRYPTION, null, null, 12, null));
            this.exceptionChannel.h(e5);
            return new CardComponentState(new PaymentComponentData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16376, null), false, true, cardBrand, strX, null);
        }
    }

    public static /* synthetic */ CardComponentState createComponentState$default(DefaultCardDelegate defaultCardDelegate, CardOutputData cardOutputData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cardOutputData = defaultCardDelegate.getOutputData();
        }
        return defaultCardDelegate.createComponentState(cardOutputData);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.adyen.checkout.card.internal.ui.model.CardOutputData createOutputData(java.util.List<com.adyen.checkout.card.internal.data.model.DetectedCardType> r35, java.util.List<com.adyen.checkout.ui.core.internal.ui.model.AddressListItem> r36, java.util.List<com.adyen.checkout.ui.core.internal.ui.model.AddressListItem> r37) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.ui.DefaultCardDelegate.createOutputData(java.util.List, java.util.List, java.util.List):com.adyen.checkout.card.internal.ui.model.CardOutputData");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CardOutputData createOutputData$default(DefaultCardDelegate defaultCardDelegate, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = n0.f26529a;
        }
        if ((i11 & 2) != 0) {
            list2 = n0.f26529a;
        }
        if ((i11 & 4) != 0) {
            list3 = n0.f26529a;
        }
        return defaultCardDelegate.createOutputData(list, list2, list3);
    }

    private final void fetchPublicKey() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultCardDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "fetchPublicKey", null);
        }
        f0.B(getCoroutineScope(), null, null, new AnonymousClass2(null), 3);
    }

    private final String getCardBrand(List<DetectedCardType> detectedCardTypes, DualBrandData dualBrandData) {
        Object next;
        CardBrand cardBrand;
        if (dualBrandData != null) {
            CardBrand selectedBrand = dualBrandData.getSelectedBrand();
            if (selectedBrand != null) {
                return selectedBrand.getTxVariant();
            }
            return null;
        }
        Iterator<T> it = detectedCardTypes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DetectedCardType) next).isReliable()) {
                break;
            }
        }
        DetectedCardType detectedCardType = (DetectedCardType) next;
        DetectedCardType detectedCardType2 = (DetectedCardType) CollectionsKt.firstOrNull(detectedCardTypes);
        if (detectedCardType == null) {
            detectedCardType = detectedCardType2;
        }
        if (detectedCardType == null || (cardBrand = detectedCardType.getCardBrand()) == null) {
            return null;
        }
        return cardBrand.getTxVariant();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.adyen.checkout.card.internal.ui.model.CardListItem> getCardBrands(java.util.List<com.adyen.checkout.card.internal.data.model.DetectedCardType> r9) {
        /*
            r8 = this;
            boolean r0 = r9.isEmpty()
            com.adyen.checkout.card.internal.ui.model.CardComponentParams r1 = r8.getComponentParams()
            java.util.List r1 = r1.getSupportedCardBrands()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.e0.o(r1, r3)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r1.next()
            com.adyen.checkout.core.CardBrand r4 = (com.adyen.checkout.core.CardBrand) r4
            if (r0 != 0) goto L53
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.e0.o(r9, r3)
            r5.<init>(r6)
            java.util.Iterator r6 = r9.iterator()
        L36:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r6.next()
            com.adyen.checkout.card.internal.data.model.DetectedCardType r7 = (com.adyen.checkout.card.internal.data.model.DetectedCardType) r7
            com.adyen.checkout.core.CardBrand r7 = r7.getCardBrand()
            r5.add(r7)
            goto L36
        L4a:
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto L51
            goto L53
        L51:
            r5 = 0
            goto L54
        L53:
            r5 = 1
        L54:
            com.adyen.checkout.card.internal.ui.model.CardComponentParams r6 = r8.getComponentParams()
            com.adyen.checkout.core.Environment r6 = r6.getEnvironment()
            com.adyen.checkout.card.internal.ui.model.CardListItem r7 = new com.adyen.checkout.card.internal.ui.model.CardListItem
            r7.<init>(r4, r5, r6)
            r2.add(r7)
            goto L1b
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.ui.DefaultCardDelegate.getCardBrands(java.util.List):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0 getCoroutineScope() {
        b0 b0Var = this._coroutineScope;
        if (b0Var != null) {
            return b0Var;
        }
        i4.a.f("Required value was null.");
        return null;
    }

    private final String getFundingSource() {
        return this.paymentMethod.getFundingSource();
    }

    private final InputFieldUIState getHolderNameUIState() {
        return isHolderNameRequired() ? InputFieldUIState.REQUIRED : InputFieldUIState.HIDDEN;
    }

    private final List<InstallmentModel> getInstallmentOptions(InstallmentParams installmentParams, CardBrand cardBrand, boolean isCardTypeReliable) {
        return Intrinsics.areEqual(getFundingSource(), DEBIT_FUNDING_SOURCE) ? n0.f26529a : InstallmentUtils.INSTANCE.makeInstallmentOptions(installmentParams, cardBrand, isCardTypeReliable);
    }

    private final int getKcpBirthDateOrTaxNumberHint(String input) {
        return input.length() > 6 ? R.string.checkout_kcp_tax_number_hint : R.string.checkout_kcp_birth_date_or_tax_number_hint;
    }

    private final i getTrackedSubmitFlow() {
        return new w(this.submitHandler.getSubmitFlow(), new AnonymousClass1(null), 5);
    }

    private final void initializeAnalytics(b0 coroutineScope) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultCardDelegate.class.getName();
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
        this.analyticsManager.trackEvent(GenericEvents.rendered$default(genericEvents, type, null, null, this.cardConfigDataGenerator.generate(getComponentParams(), false), 6, null));
    }

    private final boolean isAddressRequired(AddressFormUIState addressFormUIState) {
        return AddressFormUtils.INSTANCE.isAddressRequired(addressFormUIState);
    }

    private final boolean isCardListVisible(List<CardListItem> cardBrands, List<DetectedCardType> detectedCardTypes) {
        return !cardBrands.isEmpty() && detectedCardTypes.isEmpty() && Intrinsics.areEqual(this.paymentMethod.getType(), "scheme");
    }

    private final boolean isCvcHidden(InputFieldUIState cvcUIState) {
        return cvcUIState == InputFieldUIState.HIDDEN;
    }

    public static /* synthetic */ boolean isCvcHidden$default(DefaultCardDelegate defaultCardDelegate, InputFieldUIState inputFieldUIState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            inputFieldUIState = defaultCardDelegate.getOutputData().getCvcUIState();
        }
        return defaultCardDelegate.isCvcHidden(inputFieldUIState);
    }

    private final boolean isHolderNameRequired() {
        return getComponentParams().isHolderNameRequired();
    }

    private final boolean isInstallmentsRequired(CardOutputData cardOutputData) {
        return !cardOutputData.getInstallmentOptions().isEmpty();
    }

    private final boolean isKCPAuthRequired() {
        return getComponentParams().getKcpAuthVisibility() == KCPAuthVisibility.SHOW;
    }

    private final boolean isSocialSecurityNumberRequired() {
        return getComponentParams().getSocialSecurityNumberVisibility() == SocialSecurityNumberVisibility.SHOW;
    }

    private final InputFieldUIState makeCvcUIState(DetectedCardType detectedCardType) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultCardDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            String strConcat = "CO.".concat(name);
            companion.getLogger().log(adyenLogLevel, strConcat, "makeCvcUIState: " + (detectedCardType != null ? detectedCardType.getCvcPolicy() : null), null);
        }
        if (detectedCardType == null || !detectedCardType.isReliable()) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[getComponentParams().getCvcVisibility().ordinal()];
            if (i11 == 1) {
                return InputFieldUIState.REQUIRED;
            }
            if (i11 == 2) {
                return InputFieldUIState.HIDDEN;
            }
            if (i11 == 3) {
                return InputFieldUIState.HIDDEN;
            }
            e40.a.f();
            return null;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$1[getComponentParams().getCvcVisibility().ordinal()];
        if (i12 == 1) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[detectedCardType.getCvcPolicy().ordinal()];
            return i13 != 1 ? i13 != 2 ? InputFieldUIState.REQUIRED : InputFieldUIState.HIDDEN : InputFieldUIState.OPTIONAL;
        }
        if (i12 == 2) {
            int i14 = WhenMappings.$EnumSwitchMapping$0[detectedCardType.getCvcPolicy().ordinal()];
            return i14 != 1 ? i14 != 3 ? InputFieldUIState.HIDDEN : InputFieldUIState.REQUIRED : InputFieldUIState.OPTIONAL;
        }
        if (i12 == 3) {
            return InputFieldUIState.HIDDEN;
        }
        e40.a.f();
        return null;
    }

    private final InputFieldUIState makeExpiryDateUIState(Brand.FieldPolicy expiryDatePolicy) {
        int i11 = expiryDatePolicy == null ? -1 : WhenMappings.$EnumSwitchMapping$0[expiryDatePolicy.ordinal()];
        return i11 != 1 ? i11 != 2 ? InputFieldUIState.REQUIRED : InputFieldUIState.HIDDEN : InputFieldUIState.OPTIONAL;
    }

    private final FieldState<InstallmentModel> makeInstallmentFieldState(InstallmentModel installmentModel) {
        return new FieldState<>(installmentModel, Validation.Valid.INSTANCE);
    }

    private final PaymentComponentData<CardPaymentMethod> makePaymentComponentData(CardPaymentMethod cardPaymentMethod, CardOutputData stateOutputData) {
        PaymentComponentData<CardPaymentMethod> paymentComponentData = new PaymentComponentData<>(cardPaymentMethod, this.order, getComponentParams().getAmount(), showStorePaymentField() ? Boolean.valueOf(stateOutputData.getShouldStorePaymentMethod()) : null, getComponentParams().getShopperReference(), null, null, null, null, null, null, null, null, null, 16352, null);
        if (isSocialSecurityNumberRequired()) {
            paymentComponentData.setSocialSecurityNumber(stateOutputData.getSocialSecurityNumberState().getValue());
        }
        if (isAddressRequired(stateOutputData.getAddressUIState())) {
            paymentComponentData.setBillingAddress(AddressFormUtils.INSTANCE.makeAddressData(stateOutputData.getAddressState(), stateOutputData.getAddressUIState()));
        }
        if (isInstallmentsRequired(stateOutputData)) {
            paymentComponentData.setInstallments(InstallmentUtils.INSTANCE.makeInstallmentModelObject(stateOutputData.getInstallmentState().getValue()));
        }
        return paymentComponentData;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[PHI: r0 r6 r7
      0x0022: PHI (r0v1 'e' java.lang.Throwable) = (r0v0 'e' java.lang.Throwable), (r0v3 'e' java.lang.Throwable) binds: [B:10:0x0020, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0022: PHI (r6v1 com.adyen.checkout.core.AdyenLogLevel) = (r6v0 com.adyen.checkout.core.AdyenLogLevel), (r6v2 com.adyen.checkout.core.AdyenLogLevel) binds: [B:10:0x0020, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0022: PHI (r7v1 com.adyen.checkout.core.AdyenLogger$Companion) = (r7v0 com.adyen.checkout.core.AdyenLogger$Companion), (r7v3 com.adyen.checkout.core.AdyenLogger$Companion) binds: [B:10:0x0020, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe A[PHI: r0 r4 r7
      0x00fe: PHI (r0v17 'e' java.lang.Throwable) = (r0v16 'e' java.lang.Throwable), (r0v18 'e' java.lang.Throwable) binds: [B:40:0x00fc, B:43:0x0112] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r4v3 com.adyen.checkout.core.AdyenLogLevel) = (r4v2 com.adyen.checkout.core.AdyenLogLevel), (r4v4 com.adyen.checkout.core.AdyenLogLevel) binds: [B:40:0x00fc, B:43:0x0112] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r7v6 com.adyen.checkout.core.AdyenLogger$Companion) = (r7v5 com.adyen.checkout.core.AdyenLogger$Companion), (r7v8 com.adyen.checkout.core.AdyenLogger$Companion) binds: [B:40:0x00fc, B:43:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.adyen.checkout.card.CardComponentState mapComponentState(com.adyen.checkout.cse.EncryptedCard r24, com.adyen.checkout.card.internal.ui.model.CardOutputData r25, java.lang.String r26, com.adyen.checkout.core.CardBrand r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.ui.DefaultCardDelegate.mapComponentState(com.adyen.checkout.cse.EncryptedCard, com.adyen.checkout.card.internal.ui.model.CardOutputData, java.lang.String, com.adyen.checkout.core.CardBrand, java.lang.String):com.adyen.checkout.card.CardComponentState");
    }

    private final void onInputDataChanged() {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultCardDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onInputDataChanged", null);
        }
        this.detectCardTypeRepository.detectCardType(this.inputData.getCardNumber(), this.publicKey, getComponentParams().getSupportedCardBrands(), getComponentParams().getClientKey(), getCoroutineScope(), this.paymentMethod.getType());
        requestStateList(this.inputData.getAddress().getCountry());
    }

    private final void requestCountryList() {
        this.addressRepository.getCountryList(getComponentParams().getShopperLocale(), getCoroutineScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestStateList(String countryCode) {
        this.addressRepository.getStateList(getComponentParams().getShopperLocale(), countryCode, getCoroutineScope());
    }

    private final boolean showStorePaymentField() {
        return getComponentParams().isStorePaymentFieldVisible();
    }

    private final void subscribeToCountryList() {
        r.u(getCoroutineScope(), new w(r.l(this.addressRepository.getCountriesFlow()), new C00741(null), 5));
    }

    private final void subscribeToDetectedCardTypes() {
        final w wVar = new w(this.detectCardTypeRepository.getDetectedCardTypesFlow(), new C00751(null), 5);
        r.u(getCoroutineScope(), new w(r.l(new i() { // from class: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$$inlined$map$1

            /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n281#3:51\n774#4:52\n865#4,2:53\n1557#4:55\n1628#4,3:56\n*S KotlinDebug\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate\n*L\n281#1:52\n281#1:53,2\n281#1:55\n281#1:56,3\n*E\n"})
            public static final class AnonymousClass2<T> implements y80.j {
                final /* synthetic */ y80.j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$$inlined$map$1$2$1, reason: invalid class name */
                @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$$inlined$map$1$2", f = "DefaultCardDelegate.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class AnonymousClass1 extends z70.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(y80.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // y80.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, x70.c r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$$inlined$map$1$2$1 r0 = (com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$$inlined$map$1$2$1 r0 = new com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        y70.a r1 = y70.a.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2e
                        if (r2 != r3) goto L27
                        ba0.g.M(r9)
                        goto L87
                    L27:
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        com.braze.h2.b(r8)
                        r8 = 0
                        return r8
                    L2e:
                        ba0.g.M(r9)
                        y80.j r9 = r7.$this_unsafeFlow
                        java.util.List r8 = (java.util.List) r8
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r8 = r8.iterator()
                    L3e:
                        boolean r4 = r8.hasNext()
                        if (r4 == 0) goto L5b
                        java.lang.Object r4 = r8.next()
                        r5 = r4
                        com.adyen.checkout.card.internal.data.model.DetectedCardType r5 = (com.adyen.checkout.card.internal.data.model.DetectedCardType) r5
                        boolean r6 = r5.isReliable()
                        if (r6 == 0) goto L3e
                        boolean r5 = r5.isSupported()
                        if (r5 == 0) goto L3e
                        r2.add(r4)
                        goto L3e
                    L5b:
                        java.util.ArrayList r8 = new java.util.ArrayList
                        r4 = 10
                        int r4 = kotlin.collections.e0.o(r2, r4)
                        r8.<init>(r4)
                        java.util.Iterator r2 = r2.iterator()
                    L6a:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L7e
                        java.lang.Object r4 = r2.next()
                        com.adyen.checkout.card.internal.data.model.DetectedCardType r4 = (com.adyen.checkout.card.internal.data.model.DetectedCardType) r4
                        com.adyen.checkout.core.CardBrand r4 = r4.getCardBrand()
                        r8.add(r4)
                        goto L6a
                    L7e:
                        r0.label = r3
                        java.lang.Object r8 = r9.emit(r8, r0)
                        if (r8 != r1) goto L87
                        return r1
                    L87:
                        kotlin.Unit r8 = kotlin.Unit.f26487a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDetectedCardTypes$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                }
            }

            @Override // y80.i
            public Object collect(y80.j jVar, c cVar) {
                Object objCollect = wVar.collect(new AnonymousClass2(jVar), cVar);
                return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
            }
        }), new AnonymousClass3(null), 5));
    }

    private final void subscribeToDualBrandedAnalyticsEvents() {
        final i outputDataFlow = getOutputDataFlow();
        r.u(getCoroutineScope(), new w(r.l(new mn.j(new i() { // from class: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$1

            /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate\n*L\n1#1,49:1\n50#2:50\n291#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements y80.j {
                final /* synthetic */ y80.j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$1$2$1, reason: invalid class name */
                @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$1$2", f = "DefaultCardDelegate.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class AnonymousClass1 extends z70.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(y80.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // y80.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, x70.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$1$2$1 r0 = (com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$1$2$1 r0 = new com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        y70.a r1 = y70.a.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2e
                        if (r2 != r3) goto L27
                        ba0.g.M(r6)
                        goto L4a
                    L27:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        com.braze.h2.b(r5)
                        r5 = 0
                        return r5
                    L2e:
                        ba0.g.M(r6)
                        y80.j r6 = r4.$this_unsafeFlow
                        com.adyen.checkout.card.internal.ui.model.CardOutputData r5 = (com.adyen.checkout.card.internal.ui.model.CardOutputData) r5
                        com.adyen.checkout.card.internal.ui.model.DualBrandData r5 = r5.getDualBrandData()
                        if (r5 == 0) goto L40
                        com.adyen.checkout.core.CardBrand r5 = r5.getSelectedBrand()
                        goto L41
                    L40:
                        r5 = 0
                    L41:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4a
                        return r1
                    L4a:
                        kotlin.Unit r5 = kotlin.Unit.f26487a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                }
            }

            @Override // y80.i
            public Object collect(y80.j jVar, c cVar) {
                Object objCollect = outputDataFlow.collect(new AnonymousClass2(jVar), cVar);
                return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
            }
        }, 17)), new C00762(null), 5));
        final i outputDataFlow2 = getOutputDataFlow();
        final i iVarL = r.l(new mn.j(new i() { // from class: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$2

            /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n307#3:51\n1557#4:52\n1628#4,3:53\n*S KotlinDebug\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate\n*L\n307#1:52\n307#1:53,3\n*E\n"})
            public static final class AnonymousClass2<T> implements y80.j {
                final /* synthetic */ y80.j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$2$2$1, reason: invalid class name */
                @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$2$2", f = "DefaultCardDelegate.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class AnonymousClass1 extends z70.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(y80.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // y80.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, x70.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$2$2$1 r0 = (com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$2$2$1 r0 = new com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        y70.a r1 = y70.a.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2e
                        if (r2 != r3) goto L27
                        ba0.g.M(r7)
                        goto L72
                    L27:
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        com.braze.h2.b(r6)
                        r6 = 0
                        return r6
                    L2e:
                        ba0.g.M(r7)
                        y80.j r7 = r5.$this_unsafeFlow
                        com.adyen.checkout.card.internal.ui.model.CardOutputData r6 = (com.adyen.checkout.card.internal.ui.model.CardOutputData) r6
                        com.adyen.checkout.card.internal.ui.model.DualBrandData r6 = r6.getDualBrandData()
                        if (r6 == 0) goto L68
                        java.util.List r6 = r6.getBrandOptions()
                        if (r6 == 0) goto L68
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = kotlin.collections.e0.o(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L50:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L69
                        java.lang.Object r4 = r6.next()
                        com.adyen.checkout.card.internal.ui.model.CardBrandItem r4 = (com.adyen.checkout.card.internal.ui.model.CardBrandItem) r4
                        com.adyen.checkout.core.CardBrand r4 = r4.getBrand()
                        java.lang.String r4 = r4.getTxVariant()
                        r2.add(r4)
                        goto L50
                    L68:
                        r2 = 0
                    L69:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L72
                        return r1
                    L72:
                        kotlin.Unit r6 = kotlin.Unit.f26487a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                }
            }

            @Override // y80.i
            public Object collect(y80.j jVar, c cVar) {
                Object objCollect = outputDataFlow2.collect(new AnonymousClass2(jVar), cVar);
                return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
            }
        }, 17));
        r.u(getCoroutineScope(), new i() { // from class: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$3

            /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate\n+ 4 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,49:1\n50#2:50\n311#3,8:51\n319#3:76\n16#4,17:59\n*S KotlinDebug\n*F\n+ 1 DefaultCardDelegate.kt\ncom/adyen/checkout/card/internal/ui/DefaultCardDelegate\n*L\n318#1:59,17\n*E\n"})
            public static final class AnonymousClass2<T> implements y80.j {
                final /* synthetic */ y80.j $this_unsafeFlow;
                final /* synthetic */ DefaultCardDelegate this$0;

                /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$3$2$1, reason: invalid class name */
                @e(c = "com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$3$2", f = "DefaultCardDelegate.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class AnonymousClass1 extends z70.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(y80.j jVar, DefaultCardDelegate defaultCardDelegate) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = defaultCardDelegate;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // y80.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r13, x70.c r14) {
                    /*
                        Method dump skipped, instruction units count: 219
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.ui.DefaultCardDelegate$subscribeToDualBrandedAnalyticsEvents$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                }
            }

            @Override // y80.i
            public Object collect(y80.j jVar, c cVar) {
                Object objCollect = iVarL.collect(new AnonymousClass2(jVar, this), cVar);
                return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
            }
        });
    }

    private final void subscribeToStatesList() {
        r.u(getCoroutineScope(), new w(r.l(this.addressRepository.getStatesFlow()), new C00771(null), 5));
    }

    private final void updateOutputData(List<DetectedCardType> detectedCardTypes, List<AddressListItem> countryOptions, List<AddressListItem> stateOptions) {
        CardOutputData cardOutputDataCreateOutputData = createOutputData(detectedCardTypes, countryOptions, stateOptions);
        ((a2) this._outputDataFlow).j(cardOutputDataCreateOutputData);
        updateComponentState$card_release(cardOutputDataCreateOutputData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateOutputData$default(DefaultCardDelegate defaultCardDelegate, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = defaultCardDelegate.getOutputData().getDetectedCardTypes();
        }
        if ((i11 & 2) != 0) {
            list2 = defaultCardDelegate.getOutputData().getAddressState().getCountryOptions();
        }
        if ((i11 & 4) != 0) {
            list3 = defaultCardDelegate.getOutputData().getAddressState().getStateOptions();
        }
        defaultCardDelegate.updateOutputData(list, list2, list3);
    }

    private final AddressOutputData validateAddress(AddressInputModel addressInputModel, AddressFormUIState addressFormUIState, DetectedCardType detectedCardType, List<AddressListItem> countryOptions, List<AddressListItem> stateOptions) {
        CardBrand cardBrand;
        return AddressValidationUtils.INSTANCE.validateAddressInput(addressInputModel, addressFormUIState, countryOptions, stateOptions, CardAddressValidationUtils.INSTANCE.isAddressOptional(getComponentParams().getAddressParams(), (detectedCardType == null || (cardBrand = detectedCardType.getCardBrand()) == null) ? null : cardBrand.getTxVariant()));
    }

    private final FieldState<String> validateCardNumber(String cardNumber, boolean enableLuhnCheck, boolean isBrandSupported) {
        return this.cardValidationMapper.mapCardNumberValidation(cardNumber, CardValidationUtils.INSTANCE.validateCardNumber$card_release(cardNumber, enableLuhnCheck, isBrandSupported));
    }

    private final FieldState<String> validateExpiryDate(String expiryDate, Brand.FieldPolicy expiryDatePolicy) {
        return this.cardValidationMapper.mapExpiryDateValidation(expiryDate, CardValidationUtils.INSTANCE.validateExpiryDate$card_release(expiryDate, expiryDatePolicy));
    }

    private final FieldState<String> validateHolderName(String holderName) {
        return (getComponentParams().isHolderNameRequired() && StringsKt.H(holderName)) ? new FieldState<>(holderName, new Validation.Invalid(R.string.checkout_holder_name_not_valid, false, 2, null)) : new FieldState<>(holderName, Validation.Valid.INSTANCE);
    }

    private final FieldState<String> validateKcpBirthDateOrTaxNumber(String kcpBirthDateOrTaxNumber) {
        return isKCPAuthRequired() ? KcpValidationUtils.INSTANCE.validateKcpBirthDateOrTaxNumber(kcpBirthDateOrTaxNumber) : new FieldState<>(kcpBirthDateOrTaxNumber, Validation.Valid.INSTANCE);
    }

    private final FieldState<String> validateKcpCardPassword(String kcpCardPassword) {
        return isKCPAuthRequired() ? KcpValidationUtils.INSTANCE.validateKcpCardPassword(kcpCardPassword) : new FieldState<>(kcpCardPassword, Validation.Valid.INSTANCE);
    }

    private final FieldState<String> validateSecurityCode(String securityCode, DetectedCardType cardType) {
        return this.cardValidationMapper.mapSecurityCodeValidation(securityCode, CardValidationUtils.INSTANCE.validateSecurityCode$card_release(securityCode, cardType, makeCvcUIState(cardType)));
    }

    private final FieldState<String> validateSocialSecurityNumber(String socialSecurityNumber) {
        return isSocialSecurityNumberRequired() ? SocialSecurityNumberUtils.INSTANCE.validateSocialSecurityNumber(socialSecurityNumber) : new FieldState<>(socialSecurityNumber, Validation.Valid.INSTANCE);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void clear() {
        this.addressLookupDelegate.clear();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    @NotNull
    public AddressDelegate getAddressDelegate() {
        return this.addressLookupDelegate.getAddressDelegate();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    @NotNull
    public i getAddressLookupErrorPopupFlow() {
        return this.addressLookupDelegate.getAddressLookupErrorPopupFlow();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    @NotNull
    public i getAddressLookupStateFlow() {
        return this.addressLookupDelegate.getAddressLookupStateFlow();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    @NotNull
    public i getAddressLookupSubmitFlow() {
        return this.addressLookupDelegate.getAddressLookupSubmitFlow();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressDelegate
    @NotNull
    public AddressOutputData getAddressOutputData() {
        return getOutputData().getAddressState();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressDelegate
    @NotNull
    public i getAddressOutputDataFlow() {
        return (i) this.addressOutputDataFlow.getValue();
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
        String type = this.paymentMethod.getType();
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
        if (!Intrinsics.areEqual(((a2) this._viewFlow).getValue(), CardComponentViewType.AddressLookup.INSTANCE)) {
            return false;
        }
        getAddressDelegate().updateAddressInputData(new Function1<AddressInputModel, Unit>() { // from class: com.adyen.checkout.card.internal.ui.DefaultCardDelegate.handleBackPress.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AddressInputModel) obj);
                return Unit.f26487a;
            }

            public final void invoke(@NotNull AddressInputModel addressInputModel) {
                addressInputModel.getClass();
                addressInputModel.reset();
            }
        });
        ((a2) this._viewFlow).j(CardComponentViewType.DefaultCardView.INSTANCE);
        return true;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void initialize(@NotNull b0 coroutineScope) {
        coroutineScope.getClass();
        this._coroutineScope = coroutineScope;
        this.submitHandler.initialize(coroutineScope, getComponentStateFlow());
        initializeAnalytics(coroutineScope);
        fetchPublicKey();
        subscribeToDetectedCardTypes();
        subscribeToDualBrandedAnalyticsEvents();
        if ((getComponentParams().getAddressParams() instanceof AddressParams.FullAddress) || (getComponentParams().getAddressParams() instanceof AddressParams.Lookup)) {
            subscribeToStatesList();
            subscribeToCountryList();
            requestCountryList();
        }
        r.u(coroutineScope, new w(this.addressLookupDelegate.getAddressLookupSubmitFlow(), new C00721(null), 5));
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

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public boolean onAddressLookupCompletion(@NotNull LookupAddress lookupAddress) {
        lookupAddress.getClass();
        return this.addressLookupDelegate.onAddressLookupCompletion(lookupAddress);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void onAddressQueryChanged(@NotNull String query) {
        query.getClass();
        this.addressLookupDelegate.onAddressQueryChanged(query);
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void onCardScanningAvailability(boolean isAvailable) {
        this.analyticsManager.trackEvent(isAvailable ? CardEvents.INSTANCE.cardScannerAvailable(getPaymentMethodType()) : CardEvents.INSTANCE.cardScannerUnavailable(getPaymentMethodType()));
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void onCardScanningDisplayed(boolean didDisplay) {
        this.analyticsManager.trackEvent(didDisplay ? CardEvents.INSTANCE.cardScannerPresented(getPaymentMethodType()) : CardEvents.INSTANCE.cardScannerFailure(getPaymentMethodType()));
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void onCardScanningResult(int resultCode, @Nullable final String pan, @Nullable final Integer expiryMonth, @Nullable final Integer expiryYear) {
        AnalyticsEvent.Log logCardScannerCancelled = resultCode == 0 ? CardEvents.INSTANCE.cardScannerCancelled(getPaymentMethodType()) : (pan == null && expiryMonth == null && expiryYear == null) ? CardEvents.INSTANCE.cardScannerFailure(getPaymentMethodType()) : resultCode == -1 ? CardEvents.INSTANCE.cardScannerSuccess(getPaymentMethodType()) : null;
        if (logCardScannerCancelled != null) {
            this.analyticsManager.trackEvent(logCardScannerCancelled);
        }
        updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.DefaultCardDelegate.onCardScanningResult.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull CardInputData cardInputData) {
                cardInputData.getClass();
                String str = pan;
                if (str != null) {
                    cardInputData.setCardNumber(str);
                }
                Integer num = expiryMonth;
                if (num == null || expiryYear == null) {
                    return;
                }
                cardInputData.setExpiryDate(ExpiryDateExtKt.toMMyyString(num.toString(), expiryYear.toString()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardInputData) obj);
                return Unit.f26487a;
            }
        });
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    public void onCleared() {
        removeObserver();
        this._coroutineScope = null;
        this.onBinValueListener = null;
        this.onBinLookupListener = null;
        this.addressLookupDelegate.clear();
        this.analyticsManager.clear(this);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void onManualEntryModeSelected() {
        this.addressLookupDelegate.onManualEntryModeSelected();
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
        this.addressLookupDelegate.setAddressLookupCallback(addressLookupCallback);
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate, com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void setAddressLookupResult(@NotNull AddressLookupResult addressLookupResult) {
        addressLookupResult.getClass();
        this.addressLookupDelegate.setAddressLookupResult(addressLookupResult);
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void setInteractionBlocked(boolean isInteractionBlocked) {
        this.submitHandler.setInteractionBlocked(isInteractionBlocked);
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void setOnBinLookupListener(@Nullable Function1<? super List<BinLookupData>, Unit> listener) {
        this.onBinLookupListener = listener;
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void setOnBinValueListener(@Nullable Function1<? super String, Unit> listener) {
        this.onBinValueListener = listener;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ButtonDelegate
    public boolean shouldShowSubmitButton() {
        return isConfirmationRequired() && getComponentParams().isSubmitButtonVisible();
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate
    public void startAddressLookup() {
        this.addressLookupDelegate.initialize(getCoroutineScope(), this.inputData.getAddress());
        ((a2) this._viewFlow).j(CardComponentViewType.AddressLookup.INSTANCE);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void submitAddress() {
        this.addressLookupDelegate.submitAddress();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressDelegate
    public void updateAddressInputData(@NotNull final Function1<? super AddressInputModel, Unit> update) {
        update.getClass();
        updateInputData(new Function1<CardInputData, Unit>() { // from class: com.adyen.checkout.card.internal.ui.DefaultCardDelegate.updateAddressInputData.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void invoke(@NotNull CardInputData cardInputData) {
                cardInputData.getClass();
                update.invoke(cardInputData.getAddress());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardInputData) obj);
                return Unit.f26487a;
            }
        });
    }

    @Override // com.adyen.checkout.card.internal.ui.CardDelegate, com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void updateAddressLookupOptions(@NotNull List<LookupAddress> options) {
        options.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultCardDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            String strConcat = "CO.".concat(name);
            companion.getLogger().log(adyenLogLevel, strConcat, "update address lookup options " + options, null);
        }
        this.addressLookupDelegate.updateAddressLookupOptions(options);
    }

    public final void updateComponentState$card_release(@NotNull CardOutputData outputData) {
        outputData.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultCardDelegate.class.getName();
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

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/DefaultCardDelegate$Companion;", "", "()V", "BIN_VALUE_EXTENDED_LENGTH", "", "getBIN_VALUE_EXTENDED_LENGTH$card_release$annotations", "BIN_VALUE_LENGTH", "getBIN_VALUE_LENGTH$card_release$annotations", "DEBIT_FUNDING_SOURCE", "", "DUAL_BRAND_ANALYTICS_TARGET", "ENCRYPTION_KEY_FOR_KCP_PASSWORD", "EXTENDED_CARD_NUMBER_LENGTH", "LAST_FOUR_LENGTH", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getBIN_VALUE_EXTENDED_LENGTH$card_release$annotations() {
        }

        public static /* synthetic */ void getBIN_VALUE_LENGTH$card_release$annotations() {
        }
    }

    @Override // com.adyen.checkout.components.core.internal.ui.ComponentDelegate
    @NotNull
    public CardComponentParams getComponentParams() {
        return this.componentParams;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void initialize(@NotNull b0 coroutineScope, @NotNull AddressInputModel addressInputModel) {
        coroutineScope.getClass();
        addressInputModel.getClass();
        this.addressLookupDelegate.initialize(coroutineScope, addressInputModel);
    }
}
