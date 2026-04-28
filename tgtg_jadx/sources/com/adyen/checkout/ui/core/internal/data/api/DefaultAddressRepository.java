package com.adyen.checkout.ui.core.internal.data.api;

import ba0.g;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.core.DispatcherProvider;
import com.adyen.checkout.ui.core.internal.data.model.AddressItem;
import com.adyen.checkout.ui.core.internal.ui.AddressSpecification;
import com.braze.h2;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import v80.b0;
import v80.f0;
import v80.x;
import x70.c;
import x80.m;
import y70.a;
import y80.i;
import y80.r;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R<\u0010-\u001a*\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140+j\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/data/api/DefaultAddressRepository;", "Lcom/adyen/checkout/ui/core/internal/data/api/AddressRepository;", "Lcom/adyen/checkout/ui/core/internal/data/api/AddressService;", "addressService", "Lv80/x;", "coroutineDispatcher", "<init>", "(Lcom/adyen/checkout/ui/core/internal/data/api/AddressService;Lv80/x;)V", "Ljava/util/Locale;", "shopperLocale", "", "countryCode", "Lv80/b0;", "coroutineScope", "", "fetchStateList", "(Ljava/util/Locale;Ljava/lang/String;Lv80/b0;)V", "fetchCountryList", "(Ljava/util/Locale;Lv80/b0;)V", "Lu70/q;", "", "Lcom/adyen/checkout/ui/core/internal/data/model/AddressItem;", "getCountries-gIAlu-s", "(Ljava/util/Locale;Lx70/c;)Ljava/lang/Object;", "getCountries", "getStates-0E7RQCE", "(Ljava/util/Locale;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "getStates", "getStateList", "getCountryList", "Lcom/adyen/checkout/ui/core/internal/data/api/AddressService;", "Lv80/x;", "Lx80/m;", "statesChannel", "Lx80/m;", "Ly80/i;", "statesFlow", "Ly80/i;", "getStatesFlow", "()Ly80/i;", "countriesChannel", "countriesFlow", "getCountriesFlow", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "cache", "Ljava/util/HashMap;", "Companion", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultAddressRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAddressRepository.kt\ncom/adyen/checkout/ui/core/internal/data/api/DefaultAddressRepository\n+ 2 ResultExt.kt\ncom/adyen/checkout/core/internal/util/ResultExtKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,140:1\n17#2,2:141\n19#2,4:160\n17#2,2:164\n19#2,4:183\n16#3,17:143\n16#3,17:166\n*S KotlinDebug\n*F\n+ 1 DefaultAddressRepository.kt\ncom/adyen/checkout/ui/core/internal/data/api/DefaultAddressRepository\n*L\n117#1:141,2\n117#1:160,4\n125#1:164,2\n125#1:183,4\n118#1:143,17\n126#1:166,17\n*E\n"})
public final class DefaultAddressRepository implements AddressRepository {

    @NotNull
    private static final String COUNTRIES_CACHE_KEY = "countries";

    @NotNull
    private final AddressService addressService;

    @NotNull
    private final HashMap<String, List<AddressItem>> cache;

    @NotNull
    private final x coroutineDispatcher;

    @NotNull
    private final m countriesChannel;

    @NotNull
    private final i countriesFlow;

    @NotNull
    private final m statesChannel;

    @NotNull
    private final i statesFlow;

    @NotNull
    private static final List<AddressSpecification> COUNTRIES_WITH_STATES = d0.h(AddressSpecification.BR, AddressSpecification.CA, AddressSpecification.US);

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$fetchCountryList$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$fetchCountryList$1", f = "DefaultAddressRepository.kt", l = {98}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ Locale $shopperLocale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Locale locale, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$shopperLocale = locale;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return DefaultAddressRepository.this.new AnonymousClass1(this.$shopperLocale, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM114getCountriesgIAlus;
            List list;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                DefaultAddressRepository defaultAddressRepository = DefaultAddressRepository.this;
                Locale locale = this.$shopperLocale;
                this.label = 1;
                objM114getCountriesgIAlus = defaultAddressRepository.m114getCountriesgIAlus(locale, this);
                if (objM114getCountriesgIAlus == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                objM114getCountriesgIAlus = ((q) obj).f40851a;
            }
            DefaultAddressRepository defaultAddressRepository2 = DefaultAddressRepository.this;
            if (q.a(objM114getCountriesgIAlus) == null) {
                list = (List) objM114getCountriesgIAlus;
                if (!list.isEmpty()) {
                    defaultAddressRepository2.cache.put(DefaultAddressRepository.COUNTRIES_CACHE_KEY, list);
                }
            } else {
                list = n0.f26529a;
            }
            DefaultAddressRepository.this.countriesChannel.h(list);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$fetchStateList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$fetchStateList$1", f = "DefaultAddressRepository.kt", l = {69}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C01381 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ String $countryCode;
        final /* synthetic */ Locale $shopperLocale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01381(Locale locale, String str, c<? super C01381> cVar) {
            super(2, cVar);
            this.$shopperLocale = locale;
            this.$countryCode = str;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return DefaultAddressRepository.this.new C01381(this.$shopperLocale, this.$countryCode, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((C01381) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM115getStates0E7RQCE;
            List list;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                DefaultAddressRepository defaultAddressRepository = DefaultAddressRepository.this;
                Locale locale = this.$shopperLocale;
                String str = this.$countryCode;
                this.label = 1;
                objM115getStates0E7RQCE = defaultAddressRepository.m115getStates0E7RQCE(locale, str, this);
                if (objM115getStates0E7RQCE == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                objM115getStates0E7RQCE = ((q) obj).f40851a;
            }
            DefaultAddressRepository defaultAddressRepository2 = DefaultAddressRepository.this;
            String str2 = this.$countryCode;
            if (q.a(objM115getStates0E7RQCE) == null) {
                list = (List) objM115getStates0E7RQCE;
                if (!list.isEmpty()) {
                    defaultAddressRepository2.cache.put(str2, list);
                }
            } else {
                list = n0.f26529a;
            }
            DefaultAddressRepository.this.statesChannel.h(list);
            return Unit.f26487a;
        }
    }

    public DefaultAddressRepository(@NotNull AddressService addressService, @NotNull x xVar) {
        addressService.getClass();
        xVar.getClass();
        this.addressService = addressService;
        this.coroutineDispatcher = xVar;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this.statesChannel = mVarBufferedChannel;
        this.statesFlow = r.w(mVarBufferedChannel);
        m mVarBufferedChannel2 = ChannelExtensionsKt.bufferedChannel();
        this.countriesChannel = mVarBufferedChannel2;
        this.countriesFlow = r.w(mVarBufferedChannel2);
        this.cache = new HashMap<>();
    }

    private final void fetchCountryList(Locale shopperLocale, b0 coroutineScope) {
        f0.B(coroutineScope, this.coroutineDispatcher, null, new AnonymousClass1(shopperLocale, null), 2);
    }

    private final void fetchStateList(Locale shopperLocale, String countryCode, b0 coroutineScope) {
        f0.B(coroutineScope, this.coroutineDispatcher, null, new C01381(shopperLocale, countryCode, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: getCountries-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m114getCountriesgIAlus(java.util.Locale r10, x70.c<? super u70.q<? extends java.util.List<com.adyen.checkout.ui.core.internal.data.model.AddressItem>>> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "CO."
            boolean r1 = r11 instanceof com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$getCountries$1
            if (r1 == 0) goto L15
            r1 = r11
            com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$getCountries$1 r1 = (com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$getCountries$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$getCountries$1 r1 = new com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$getCountries$1
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.result
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2e
            ba0.g.M(r11)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L85
        L2a:
            r10 = move-exception
            goto L8a
        L2c:
            r10 = move-exception
            goto L92
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            return r5
        L34:
            ba0.g.M(r11)
            u70.o r11 = u70.q.f40850b     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            com.adyen.checkout.core.AdyenLogLevel r11 = com.adyen.checkout.core.AdyenLogLevel.DEBUG     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            com.adyen.checkout.core.AdyenLogger$Companion r3 = com.adyen.checkout.core.AdyenLogger.INSTANCE     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            com.adyen.checkout.core.AdyenLogger r6 = r3.getLogger()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            boolean r6 = r6.shouldLog(r11)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r6 == 0) goto L73
            java.lang.Class<com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository> r6 = com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository.class
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r7 = 36
            java.lang.String r7 = kotlin.text.StringsKt.Y(r6, r7)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r8 = 46
            java.lang.String r7 = kotlin.text.StringsKt.W(r8, r7, r7)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r8 != 0) goto L60
            goto L66
        L60:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = kotlin.text.StringsKt.O(r7, r6)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
        L66:
            java.lang.String r0 = r0.concat(r6)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            com.adyen.checkout.core.AdyenLogger r3 = r3.getLogger()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.String r6 = "getting country list"
            r3.log(r11, r0, r6, r5)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
        L73:
            com.adyen.checkout.ui.core.internal.data.api.AddressService r11 = r9.addressService     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.String r10 = r10.toLanguageTag()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r10.getClass()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r1.label = r4     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r11 = r11.getCountries(r10, r1)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r11 != r2) goto L85
            return r2
        L85:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            u70.o r10 = u70.q.f40850b     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            return r11
        L8a:
            u70.o r11 = u70.q.f40850b
            u70.p r11 = new u70.p
            r11.<init>(r10)
            return r11
        L92:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository.m114getCountriesgIAlus(java.util.Locale, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: getStates-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m115getStates0E7RQCE(java.util.Locale r11, java.lang.String r12, x70.c<? super u70.q<? extends java.util.List<com.adyen.checkout.ui.core.internal.data.model.AddressItem>>> r13) {
        /*
            r10 = this;
            java.lang.String r0 = "getting state list for "
            java.lang.String r1 = "CO."
            boolean r2 = r13 instanceof com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$getStates$1
            if (r2 == 0) goto L17
            r2 = r13
            com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$getStates$1 r2 = (com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$getStates$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$getStates$1 r2 = new com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository$getStates$1
            r2.<init>(r10, r13)
        L1c:
            java.lang.Object r13 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L36
            if (r4 != r5) goto L30
            ba0.g.M(r13)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            goto L91
        L2c:
            r11 = move-exception
            goto L96
        L2e:
            r11 = move-exception
            goto L9e
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            return r6
        L36:
            ba0.g.M(r13)
            u70.o r13 = u70.q.f40850b     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            com.adyen.checkout.core.AdyenLogLevel r13 = com.adyen.checkout.core.AdyenLogLevel.DEBUG     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            com.adyen.checkout.core.AdyenLogger$Companion r4 = com.adyen.checkout.core.AdyenLogger.INSTANCE     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            com.adyen.checkout.core.AdyenLogger r7 = r4.getLogger()     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            boolean r7 = r7.shouldLog(r13)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            if (r7 == 0) goto L7f
            java.lang.Class<com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository> r7 = com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository.class
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r8 = 36
            java.lang.String r8 = kotlin.text.StringsKt.Y(r7, r8)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r9 = 46
            java.lang.String r8 = kotlin.text.StringsKt.W(r9, r8, r8)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            int r9 = r8.length()     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            if (r9 != 0) goto L62
            goto L68
        L62:
            java.lang.String r7 = "Kt"
            java.lang.String r7 = kotlin.text.StringsKt.O(r8, r7)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
        L68:
            java.lang.String r1 = r1.concat(r7)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            com.adyen.checkout.core.AdyenLogger r4 = r4.getLogger()     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r7.append(r12)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r4.log(r13, r1, r0, r6)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
        L7f:
            com.adyen.checkout.ui.core.internal.data.api.AddressService r13 = r10.addressService     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            java.lang.String r11 = r11.toLanguageTag()     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r11.getClass()     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r2.label = r5     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            java.lang.Object r13 = r13.getStates(r11, r12, r2)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            if (r13 != r3) goto L91
            return r3
        L91:
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            u70.o r11 = u70.q.f40850b     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            return r13
        L96:
            u70.o r12 = u70.q.f40850b
            u70.p r12 = new u70.p
            r12.<init>(r11)
            return r12
        L9e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository.m115getStates0E7RQCE(java.util.Locale, java.lang.String, x70.c):java.lang.Object");
    }

    @Override // com.adyen.checkout.ui.core.internal.data.api.AddressRepository
    @NotNull
    public i getCountriesFlow() {
        return this.countriesFlow;
    }

    @Override // com.adyen.checkout.ui.core.internal.data.api.AddressRepository
    public void getCountryList(@NotNull Locale shopperLocale, @NotNull b0 coroutineScope) {
        shopperLocale.getClass();
        coroutineScope.getClass();
        List<AddressItem> list = this.cache.get(COUNTRIES_CACHE_KEY);
        if (list != null) {
            this.countriesChannel.h(list);
        } else {
            fetchCountryList(shopperLocale, coroutineScope);
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.data.api.AddressRepository
    public void getStateList(@NotNull Locale shopperLocale, @Nullable String countryCode, @NotNull b0 coroutineScope) {
        shopperLocale.getClass();
        coroutineScope.getClass();
        boolean zContains = COUNTRIES_WITH_STATES.contains(AddressSpecification.INSTANCE.fromString(countryCode));
        if (countryCode == null || countryCode.length() == 0 || !zContains) {
            this.statesChannel.h(n0.f26529a);
            return;
        }
        List<AddressItem> list = this.cache.get(countryCode);
        if (list != null) {
            this.statesChannel.h(list);
        } else {
            fetchStateList(shopperLocale, countryCode, coroutineScope);
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.data.api.AddressRepository
    @NotNull
    public i getStatesFlow() {
        return this.statesFlow;
    }

    public /* synthetic */ DefaultAddressRepository(AddressService addressService, x xVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(addressService, (i11 & 2) != 0 ? DispatcherProvider.INSTANCE.getIO() : xVar);
    }
}
