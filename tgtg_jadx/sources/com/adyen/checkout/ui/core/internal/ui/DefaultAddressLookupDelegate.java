package com.adyen.checkout.ui.core.internal.ui;

import ba0.g;
import com.adyen.checkout.components.core.AddressDataKt;
import com.adyen.checkout.components.core.AddressLookupCallback;
import com.adyen.checkout.components.core.AddressLookupResult;
import com.adyen.checkout.components.core.LookupAddress;
import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.ui.core.internal.data.api.AddressRepository;
import com.adyen.checkout.ui.core.internal.data.model.AddressItem;
import com.adyen.checkout.ui.core.internal.ui.model.AddressListItem;
import com.adyen.checkout.ui.core.internal.ui.model.AddressLookupEvent;
import com.adyen.checkout.ui.core.internal.ui.model.AddressLookupInputData;
import com.adyen.checkout.ui.core.internal.ui.model.AddressLookupState;
import com.adyen.checkout.ui.core.internal.ui.model.AddressOutputData;
import com.adyen.checkout.ui.core.internal.ui.model.AddressParams;
import com.adyen.checkout.ui.core.internal.ui.view.LookupOption;
import com.adyen.checkout.ui.core.internal.util.AddressFormUtils;
import com.adyen.checkout.ui.core.internal.util.AddressValidationUtils;
import com.braze.h2;
import e0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\u00020\r2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010\u001aJ\u0017\u0010-\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u0010.J\u0017\u00102\u001a\u00020\r2\u0006\u00101\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u0010\u0013J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002052\u0006\u00104\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u0002052\u0006\u00104\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u000205H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u000205H\u0002¢\u0006\u0004\b@\u0010?J\u0017\u0010B\u001a\u0002052\u0006\u00104\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u0002052\u0006\u00104\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u000205H\u0002¢\u0006\u0004\bG\u0010?J\u000f\u0010H\u001a\u000205H\u0002¢\u0006\u0004\bH\u0010?J+\u0010M\u001a\u00020L2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u001c2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\u001cH\u0002¢\u0006\u0004\bM\u0010NJ/\u0010O\u001a\u00020\r2\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u001c2\u000e\b\u0002\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\u001cH\u0002¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010QR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010RR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010SR\u001a\u0010T\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R&\u0010]\u001a\b\u0012\u0004\u0012\u0002050\\8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b]\u0010^\u0012\u0004\ba\u0010\u001a\u001a\u0004\b_\u0010`R \u0010c\u001a\b\u0012\u0004\u0012\u0002050b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u0002030g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u0002030b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010dR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020L0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010^R \u0010l\u001a\b\u0012\u0004\u0012\u00020L0b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010d\u001a\u0004\bm\u0010fR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u000b0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010iR \u0010o\u001a\b\u0012\u0004\u0012\u00020\u000b0b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010d\u001a\u0004\bp\u0010fR\u001c\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010iR\"\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010d\u001a\u0004\bs\u0010fR\u0014\u0010v\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010x\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010?¨\u0006y"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/DefaultAddressLookupDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/AddressLookupDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;", "Lcom/adyen/checkout/ui/core/internal/data/api/AddressRepository;", "addressRepository", "Ljava/util/Locale;", "shopperLocale", "<init>", "(Lcom/adyen/checkout/ui/core/internal/data/api/AddressRepository;Ljava/util/Locale;)V", "Lv80/b0;", "coroutineScope", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "addressInputModel", "", "initialize", "(Lv80/b0;Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;)V", "", "query", "onAddressQueryChanged", "(Ljava/lang/String;)V", "Lcom/adyen/checkout/components/core/LookupAddress;", "lookupAddress", "", "onAddressLookupCompletion", "(Lcom/adyen/checkout/components/core/LookupAddress;)Z", "onManualEntryModeSelected", "()V", "submitAddress", "", "options", "updateAddressLookupOptions", "(Ljava/util/List;)V", "Lcom/adyen/checkout/components/core/AddressLookupResult;", "addressLookupResult", "setAddressLookupResult", "(Lcom/adyen/checkout/components/core/AddressLookupResult;)V", "Lcom/adyen/checkout/components/core/AddressLookupCallback;", "addressLookupCallback", "setAddressLookupCallback", "(Lcom/adyen/checkout/components/core/AddressLookupCallback;)V", "Lkotlin/Function1;", "update", "updateAddressInputData", "(Lkotlin/jvm/functions/Function1;)V", "clear", "subscribeToCountryList", "(Lv80/b0;)V", "requestCountryList", "subscribeToStateList", "countryCode", "requestStatesList", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;", "event", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "makeAddressLookupState", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;)Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$Initialize;", "handleInitializeEvent", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$Initialize;)Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$Query;", "handleQueryEvent", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$Query;)Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "handleClearQueryEvent", "()Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "handleManualEvent", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$SearchResult;", "handleSearchResultEvent", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$SearchResult;)Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$OptionSelected;", "handleOptionSelectedEvent", "(Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent$OptionSelected;)Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupState;", "handleInvalidUIEvent", "handleErrorEvent", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressListItem;", "countryOptions", "stateOptions", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "createOutputData", "(Ljava/util/List;Ljava/util/List;)Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "emitOutputData", "(Ljava/util/List;Ljava/util/List;)V", "Lcom/adyen/checkout/ui/core/internal/data/api/AddressRepository;", "Ljava/util/Locale;", "Lv80/b0;", "addressDelegate", "Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;", "getAddressDelegate", "()Lcom/adyen/checkout/ui/core/internal/ui/AddressDelegate;", "Lcom/adyen/checkout/components/core/AddressLookupCallback;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupInputData;", "addressLookupInputData", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupInputData;", "Ly80/f1;", "mutableAddressLookupStateFlow", "Ly80/f1;", "getMutableAddressLookupStateFlow$ui_core_release", "()Ly80/f1;", "getMutableAddressLookupStateFlow$ui_core_release$annotations", "Ly80/i;", "addressLookupStateFlow", "Ly80/i;", "getAddressLookupStateFlow", "()Ly80/i;", "Lx80/m;", "addressLookupEventChannel", "Lx80/m;", "addressLookupEventFlow", "_addressOutputDataFlow", "addressOutputDataFlow", "getAddressOutputDataFlow", "submitAddressChannel", "addressLookupSubmitFlow", "getAddressLookupSubmitFlow", "addressLookupErrorPopupChannel", "addressLookupErrorPopupFlow", "getAddressLookupErrorPopupFlow", "getAddressOutputData", "()Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "addressOutputData", "getCurrentAddressLookupState", "currentAddressLookupState", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultAddressLookupDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAddressLookupDelegate.kt\ncom/adyen/checkout/ui/core/internal/ui/DefaultAddressLookupDelegate\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,355:1\n16#2,17:356\n16#2,17:373\n1557#3:390\n1628#3,3:391\n1557#3:394\n1628#3,3:395\n1557#3:398\n1628#3,3:399\n*S KotlinDebug\n*F\n+ 1 DefaultAddressLookupDelegate.kt\ncom/adyen/checkout/ui/core/internal/ui/DefaultAddressLookupDelegate\n*L\n127#1:356,17\n151#1:373,17\n271#1:390\n271#1:391,3\n288#1:394\n288#1:395,3\n317#1:398\n317#1:399,3\n*E\n"})
public final class DefaultAddressLookupDelegate implements AddressLookupDelegate, AddressDelegate {

    @NotNull
    private final f1 _addressOutputDataFlow;

    @NotNull
    private final AddressDelegate addressDelegate;

    @Nullable
    private AddressLookupCallback addressLookupCallback;

    @NotNull
    private final m addressLookupErrorPopupChannel;

    @NotNull
    private final i addressLookupErrorPopupFlow;

    @NotNull
    private final m addressLookupEventChannel;

    @NotNull
    private final i addressLookupEventFlow;

    @NotNull
    private final AddressLookupInputData addressLookupInputData;

    @NotNull
    private final i addressLookupStateFlow;

    @NotNull
    private final i addressLookupSubmitFlow;

    @NotNull
    private final i addressOutputDataFlow;

    @NotNull
    private final AddressRepository addressRepository;

    @Nullable
    private b0 coroutineScope;

    @NotNull
    private final f1 mutableAddressLookupStateFlow;

    @NotNull
    private final Locale shopperLocale;

    @NotNull
    private final m submitAddressChannel;

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.ui.DefaultAddressLookupDelegate$initialize$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.internal.ui.DefaultAddressLookupDelegate$initialize$1", f = "DefaultAddressLookupDelegate.kt", l = {91}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "addressLookupEvent", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupEvent;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.i implements Function2<AddressLookupEvent, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = DefaultAddressLookupDelegate.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AddressLookupEvent addressLookupEvent, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(addressLookupEvent, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AddressLookupEvent addressLookupEvent;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                AddressLookupEvent addressLookupEvent2 = (AddressLookupEvent) this.L$0;
                f1 mutableAddressLookupStateFlow = DefaultAddressLookupDelegate.this.getMutableAddressLookupStateFlow();
                AddressLookupState addressLookupStateMakeAddressLookupState = DefaultAddressLookupDelegate.this.makeAddressLookupState(addressLookupEvent2);
                this.L$0 = addressLookupEvent2;
                this.label = 1;
                ((a2) mutableAddressLookupStateFlow).j(addressLookupStateMakeAddressLookupState);
                if (Unit.f26487a == aVar) {
                    return aVar;
                }
                addressLookupEvent = addressLookupEvent2;
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                addressLookupEvent = (AddressLookupEvent) this.L$0;
                g.M(obj);
            }
            if (addressLookupEvent instanceof AddressLookupEvent.ErrorResult) {
                DefaultAddressLookupDelegate.this.addressLookupErrorPopupChannel.h(((AddressLookupEvent.ErrorResult) addressLookupEvent).getMessage());
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.ui.DefaultAddressLookupDelegate$subscribeToCountryList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.internal.ui.DefaultAddressLookupDelegate$subscribeToCountryList$1", f = "DefaultAddressLookupDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "", "Lcom/adyen/checkout/ui/core/internal/data/model/AddressItem;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultAddressLookupDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAddressLookupDelegate.kt\ncom/adyen/checkout/ui/core/internal/ui/DefaultAddressLookupDelegate$subscribeToCountryList$1\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,355:1\n16#2,17:356\n*S KotlinDebug\n*F\n+ 1 DefaultAddressLookupDelegate.kt\ncom/adyen/checkout/ui/core/internal/ui/DefaultAddressLookupDelegate$subscribeToCountryList$1\n*L\n113#1:356,17\n*E\n"})
    public static final class C01391 extends z70.i implements Function2<List<? extends AddressItem>, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C01391(c<? super C01391> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C01391 c01391 = DefaultAddressLookupDelegate.this.new C01391(cVar);
            c01391.L$0 = obj;
            return c01391;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull List<AddressItem> list, @Nullable c<? super Unit> cVar) {
            return ((C01391) create(list, cVar)).invokeSuspend(Unit.f26487a);
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
            DefaultAddressLookupDelegate defaultAddressLookupDelegate = DefaultAddressLookupDelegate.this;
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = defaultAddressLookupDelegate.getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "country flow", null);
            }
            AddressFormUtils addressFormUtils = AddressFormUtils.INSTANCE;
            List<AddressListItem> listInitializeCountryOptions = addressFormUtils.initializeCountryOptions(DefaultAddressLookupDelegate.this.shopperLocale, new AddressParams.Lookup(), list);
            DefaultAddressLookupDelegate defaultAddressLookupDelegate2 = DefaultAddressLookupDelegate.this;
            DefaultAddressLookupDelegate.emitOutputData$default(defaultAddressLookupDelegate2, addressFormUtils.markAddressListItemSelected(listInitializeCountryOptions, defaultAddressLookupDelegate2.addressLookupInputData.getSelectedAddress().getCountry()), null, 2, null);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.ui.DefaultAddressLookupDelegate$subscribeToStateList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.internal.ui.DefaultAddressLookupDelegate$subscribeToStateList$1", f = "DefaultAddressLookupDelegate.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "", "Lcom/adyen/checkout/ui/core/internal/data/model/AddressItem;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultAddressLookupDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAddressLookupDelegate.kt\ncom/adyen/checkout/ui/core/internal/ui/DefaultAddressLookupDelegate$subscribeToStateList$1\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,355:1\n16#2,17:356\n*S KotlinDebug\n*F\n+ 1 DefaultAddressLookupDelegate.kt\ncom/adyen/checkout/ui/core/internal/ui/DefaultAddressLookupDelegate$subscribeToStateList$1\n*L\n134#1:356,17\n*E\n"})
    public static final class C01401 extends z70.i implements Function2<List<? extends AddressItem>, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C01401(c<? super C01401> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C01401 c01401 = DefaultAddressLookupDelegate.this.new C01401(cVar);
            c01401.L$0 = obj;
            return c01401;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull List<AddressItem> list, @Nullable c<? super Unit> cVar) {
            return ((C01401) create(list, cVar)).invokeSuspend(Unit.f26487a);
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
            DefaultAddressLookupDelegate defaultAddressLookupDelegate = DefaultAddressLookupDelegate.this;
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = defaultAddressLookupDelegate.getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                String strConcat = "CO.".concat(name);
                companion.getLogger().log(adyenLogLevel, strConcat, "state flow " + list, null);
            }
            AddressFormUtils addressFormUtils = AddressFormUtils.INSTANCE;
            List<AddressListItem> listInitializeStateOptions = addressFormUtils.initializeStateOptions(list);
            DefaultAddressLookupDelegate defaultAddressLookupDelegate2 = DefaultAddressLookupDelegate.this;
            defaultAddressLookupDelegate2.emitOutputData(addressFormUtils.markAddressListItemSelected(defaultAddressLookupDelegate2.getAddressOutputData().getCountryOptions(), DefaultAddressLookupDelegate.this.addressLookupInputData.getSelectedAddress().getCountry()), addressFormUtils.markAddressListItemSelected(listInitializeStateOptions, DefaultAddressLookupDelegate.this.addressLookupInputData.getSelectedAddress().getStateOrProvince()));
            return Unit.f26487a;
        }
    }

    public DefaultAddressLookupDelegate(@NotNull AddressRepository addressRepository, @NotNull Locale locale) {
        addressRepository.getClass();
        locale.getClass();
        this.addressRepository = addressRepository;
        this.shopperLocale = locale;
        this.addressDelegate = this;
        AddressLookupInputData addressLookupInputData = new AddressLookupInputData(null, null, 3, null);
        this.addressLookupInputData = addressLookupInputData;
        a2 a2VarC = r.c(AddressLookupState.Initial.INSTANCE);
        this.mutableAddressLookupStateFlow = a2VarC;
        this.addressLookupStateFlow = a2VarC;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.addressLookupEventChannel = mVarBufferedChannel;
        this.addressLookupEventFlow = r.w(mVarBufferedChannel);
        AddressValidationUtils addressValidationUtils = AddressValidationUtils.INSTANCE;
        AddressInputModel selectedAddress = addressLookupInputData.getSelectedAddress();
        AddressFormUIState addressFormUIState = AddressFormUIState.LOOKUP;
        n0 n0Var = n0.f26529a;
        a2 a2VarC2 = r.c(addressValidationUtils.validateAddressInput(selectedAddress, addressFormUIState, n0Var, n0Var, false));
        this._addressOutputDataFlow = a2VarC2;
        this.addressOutputDataFlow = a2VarC2;
        m mVarBufferedChannel2 = ChannelExtensionsKt.bufferedChannel();
        this.submitAddressChannel = mVarBufferedChannel2;
        this.addressLookupSubmitFlow = r.w(mVarBufferedChannel2);
        m mVarBufferedChannel3 = ChannelExtensionsKt.bufferedChannel();
        this.addressLookupErrorPopupChannel = mVarBufferedChannel3;
        this.addressLookupErrorPopupFlow = r.w(mVarBufferedChannel3);
    }

    private final AddressOutputData createOutputData(List<AddressListItem> countryOptions, List<AddressListItem> stateOptions) {
        return AddressValidationUtils.INSTANCE.validateAddressInput(this.addressLookupInputData.getSelectedAddress(), AddressFormUIState.LOOKUP, countryOptions, stateOptions, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitOutputData(List<AddressListItem> countryOptions, List<AddressListItem> stateOptions) {
        ((a2) this._addressOutputDataFlow).j(createOutputData(countryOptions, stateOptions));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void emitOutputData$default(DefaultAddressLookupDelegate defaultAddressLookupDelegate, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = defaultAddressLookupDelegate.getAddressOutputData().getCountryOptions();
        }
        if ((i11 & 2) != 0) {
            list2 = defaultAddressLookupDelegate.getAddressOutputData().getStateOptions();
        }
        defaultAddressLookupDelegate.emitOutputData(list, list2);
    }

    private final AddressLookupState getCurrentAddressLookupState() {
        return (AddressLookupState) ((a2) this.mutableAddressLookupStateFlow).getValue();
    }

    private final AddressLookupState handleClearQueryEvent() {
        return !this.addressLookupInputData.getSelectedAddress().isEmpty() ? new AddressLookupState.Form(this.addressLookupInputData.getSelectedAddress()) : AddressLookupState.Initial.INSTANCE;
    }

    private final AddressLookupState handleErrorEvent() {
        List<LookupOption> options;
        if (!(getCurrentAddressLookupState() instanceof AddressLookupState.SearchResult)) {
            return getCurrentAddressLookupState();
        }
        AddressLookupState currentAddressLookupState = getCurrentAddressLookupState();
        List list = null;
        AddressLookupState.SearchResult searchResult = currentAddressLookupState instanceof AddressLookupState.SearchResult ? (AddressLookupState.SearchResult) currentAddressLookupState : null;
        String query = searchResult != null ? searchResult.getQuery() : null;
        if (query == null) {
            query = "";
        }
        AddressLookupState currentAddressLookupState2 = getCurrentAddressLookupState();
        AddressLookupState.SearchResult searchResult2 = currentAddressLookupState2 instanceof AddressLookupState.SearchResult ? (AddressLookupState.SearchResult) currentAddressLookupState2 : null;
        if (searchResult2 != null && (options = searchResult2.getOptions()) != null) {
            ArrayList arrayList = new ArrayList(e0.o(options, 10));
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                arrayList.add(LookupOption.copy$default((LookupOption) it.next(), null, false, 1, null));
            }
            list = arrayList;
        }
        if (list == null) {
            list = n0.f26529a;
        }
        return new AddressLookupState.SearchResult(query, list);
    }

    private final AddressLookupState handleInitializeEvent(AddressLookupEvent.Initialize event) {
        this.addressLookupInputData.getSelectedAddress().set(event.getAddress());
        return event.getAddress().isEmpty() ? AddressLookupState.Initial.INSTANCE : new AddressLookupState.Form(event.getAddress());
    }

    private final AddressLookupState handleInvalidUIEvent() {
        return getCurrentAddressLookupState() instanceof AddressLookupState.Form ? AddressLookupState.InvalidUI.INSTANCE : getCurrentAddressLookupState();
    }

    private final AddressLookupState handleManualEvent() {
        return ((getCurrentAddressLookupState() instanceof AddressLookupState.Initial) || (getCurrentAddressLookupState() instanceof AddressLookupState.Error) || (getCurrentAddressLookupState() instanceof AddressLookupState.SearchResult)) ? new AddressLookupState.Form(null) : getCurrentAddressLookupState();
    }

    private final AddressLookupState handleOptionSelectedEvent(AddressLookupEvent.OptionSelected event) {
        if (!(getCurrentAddressLookupState() instanceof AddressLookupState.SearchResult)) {
            return getCurrentAddressLookupState();
        }
        if (!event.getLoading()) {
            return new AddressLookupState.Form(AddressDataKt.mapToAddressInputModel(event.getLookupAddress().getAddress()));
        }
        AddressLookupState currentAddressLookupState = getCurrentAddressLookupState();
        currentAddressLookupState.getClass();
        String query = ((AddressLookupState.SearchResult) currentAddressLookupState).getQuery();
        AddressLookupState currentAddressLookupState2 = getCurrentAddressLookupState();
        currentAddressLookupState2.getClass();
        List<LookupOption> options = ((AddressLookupState.SearchResult) currentAddressLookupState2).getOptions();
        ArrayList arrayList = new ArrayList(e0.o(options, 10));
        for (LookupOption lookupOption : options) {
            arrayList.add(new LookupOption(lookupOption.getLookupAddress(), Intrinsics.areEqual(lookupOption.getLookupAddress(), event.getLookupAddress())));
        }
        return new AddressLookupState.SearchResult(query, arrayList);
    }

    private final AddressLookupState handleQueryEvent(AddressLookupEvent.Query event) {
        this.addressLookupInputData.setQuery(event.getQuery());
        return AddressLookupState.Loading.INSTANCE;
    }

    private final AddressLookupState handleSearchResultEvent(AddressLookupEvent.SearchResult event) {
        if (!(getCurrentAddressLookupState() instanceof AddressLookupState.Loading)) {
            return getCurrentAddressLookupState();
        }
        boolean zIsEmpty = event.getAddressLookupOptions().isEmpty();
        AddressLookupInputData addressLookupInputData = this.addressLookupInputData;
        if (zIsEmpty) {
            return new AddressLookupState.Error(addressLookupInputData.getQuery());
        }
        String query = addressLookupInputData.getQuery();
        List<LookupAddress> addressLookupOptions = event.getAddressLookupOptions();
        ArrayList arrayList = new ArrayList(e0.o(addressLookupOptions, 10));
        Iterator<T> it = addressLookupOptions.iterator();
        while (it.hasNext()) {
            arrayList.add(new LookupOption((LookupAddress) it.next(), false));
        }
        return new AddressLookupState.SearchResult(query, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressLookupState makeAddressLookupState(AddressLookupEvent event) {
        if (event instanceof AddressLookupEvent.Initialize) {
            return handleInitializeEvent((AddressLookupEvent.Initialize) event);
        }
        if (event instanceof AddressLookupEvent.Query) {
            return handleQueryEvent((AddressLookupEvent.Query) event);
        }
        if (Intrinsics.areEqual(event, AddressLookupEvent.ClearQuery.INSTANCE)) {
            return handleClearQueryEvent();
        }
        if (Intrinsics.areEqual(event, AddressLookupEvent.Manual.INSTANCE)) {
            return handleManualEvent();
        }
        if (event instanceof AddressLookupEvent.SearchResult) {
            return handleSearchResultEvent((AddressLookupEvent.SearchResult) event);
        }
        if (event instanceof AddressLookupEvent.OptionSelected) {
            return handleOptionSelectedEvent((AddressLookupEvent.OptionSelected) event);
        }
        if (event instanceof AddressLookupEvent.InvalidUI) {
            return handleInvalidUIEvent();
        }
        if (event instanceof AddressLookupEvent.ErrorResult) {
            return handleErrorEvent();
        }
        e40.a.f();
        return null;
    }

    private final void requestCountryList(b0 coroutineScope) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAddressLookupDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "requesting countries", null);
        }
        this.addressRepository.getCountryList(this.shopperLocale, coroutineScope);
    }

    private final void requestStatesList(String countryCode) {
        Unit unit;
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAddressLookupDelegate.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), f.k("requesting states for ", countryCode), null);
        }
        b0 b0Var = this.coroutineScope;
        if (b0Var != null) {
            this.addressRepository.getStateList(this.shopperLocale, countryCode, b0Var);
            unit = Unit.f26487a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new CheckoutException("Coroutine scope hasn't been initalized.", null, 2, null);
        }
    }

    private final void subscribeToCountryList(b0 coroutineScope) {
        r.u(coroutineScope, new w(this.addressRepository.getCountriesFlow(), new C01391(null), 5));
    }

    private final void subscribeToStateList(b0 coroutineScope) {
        r.u(coroutineScope, new w(this.addressRepository.getStatesFlow(), new C01401(null), 5));
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void clear() {
        this.coroutineScope = null;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    @NotNull
    public AddressDelegate getAddressDelegate() {
        return this.addressDelegate;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    @NotNull
    public i getAddressLookupErrorPopupFlow() {
        return this.addressLookupErrorPopupFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    @NotNull
    public i getAddressLookupStateFlow() {
        return this.addressLookupStateFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    @NotNull
    public i getAddressLookupSubmitFlow() {
        return this.addressLookupSubmitFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressDelegate
    @NotNull
    public AddressOutputData getAddressOutputData() {
        return (AddressOutputData) ((a2) this._addressOutputDataFlow).getValue();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressDelegate
    @NotNull
    public i getAddressOutputDataFlow() {
        return this.addressOutputDataFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: getMutableAddressLookupStateFlow$ui_core_release, reason: from getter */
    public final f1 getMutableAddressLookupStateFlow() {
        return this.mutableAddressLookupStateFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void initialize(@NotNull b0 coroutineScope, @NotNull AddressInputModel addressInputModel) {
        coroutineScope.getClass();
        addressInputModel.getClass();
        this.coroutineScope = coroutineScope;
        r.u(coroutineScope, new w(this.addressLookupEventFlow, new AnonymousClass1(null), 5));
        subscribeToCountryList(coroutineScope);
        subscribeToStateList(coroutineScope);
        requestCountryList(coroutineScope);
        this.addressLookupEventChannel.h(new AddressLookupEvent.Initialize(addressInputModel));
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public boolean onAddressLookupCompletion(@NotNull LookupAddress lookupAddress) {
        lookupAddress.getClass();
        AddressLookupCallback addressLookupCallback = this.addressLookupCallback;
        boolean zOnLookupCompletion = addressLookupCallback != null ? addressLookupCallback.onLookupCompletion(lookupAddress) : false;
        this.addressLookupEventChannel.h(new AddressLookupEvent.OptionSelected(lookupAddress, zOnLookupCompletion));
        return zOnLookupCompletion;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void onAddressQueryChanged(@NotNull String query) {
        query.getClass();
        int length = query.length();
        m mVar = this.addressLookupEventChannel;
        if (length == 0) {
            mVar.h(AddressLookupEvent.ClearQuery.INSTANCE);
        } else {
            mVar.h(new AddressLookupEvent.Query(query));
        }
        AddressLookupCallback addressLookupCallback = this.addressLookupCallback;
        if (addressLookupCallback != null) {
            addressLookupCallback.onQueryChanged(query);
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void onManualEntryModeSelected() {
        this.addressLookupEventChannel.h(AddressLookupEvent.Manual.INSTANCE);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void setAddressLookupCallback(@NotNull AddressLookupCallback addressLookupCallback) {
        addressLookupCallback.getClass();
        this.addressLookupCallback = addressLookupCallback;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void setAddressLookupResult(@NotNull AddressLookupResult addressLookupResult) {
        addressLookupResult.getClass();
        if (addressLookupResult instanceof AddressLookupResult.Error) {
            this.addressLookupEventChannel.h(new AddressLookupEvent.ErrorResult(((AddressLookupResult.Error) addressLookupResult).getMessage()));
        } else if (addressLookupResult instanceof AddressLookupResult.Completed) {
            this.addressLookupEventChannel.h(new AddressLookupEvent.OptionSelected(((AddressLookupResult.Completed) addressLookupResult).getLookupAddress(), false));
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void submitAddress() {
        if (getAddressDelegate().getAddressOutputData().getIsValid()) {
            this.submitAddressChannel.h(this.addressLookupInputData.getSelectedAddress());
        } else {
            this.addressLookupEventChannel.h(AddressLookupEvent.InvalidUI.INSTANCE);
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressDelegate
    public void updateAddressInputData(@NotNull Function1<? super AddressInputModel, Unit> update) {
        update.getClass();
        update.invoke(this.addressLookupInputData.getSelectedAddress());
        requestStatesList(this.addressLookupInputData.getSelectedAddress().getCountry());
        emitOutputData$default(this, null, null, 3, null);
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.AddressLookupDelegate
    public void updateAddressLookupOptions(@NotNull List<LookupAddress> options) {
        options.getClass();
        this.addressLookupEventChannel.h(new AddressLookupEvent.SearchResult(options));
    }

    public static /* synthetic */ void getMutableAddressLookupStateFlow$ui_core_release$annotations() {
    }
}
