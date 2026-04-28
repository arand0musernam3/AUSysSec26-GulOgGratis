package com.adyen.checkout.card.internal.data.api;

import com.adyen.checkout.card.internal.data.model.BinLookupResponse;
import com.adyen.checkout.card.internal.data.model.BinLookupResult;
import com.adyen.checkout.card.internal.data.model.Brand;
import com.adyen.checkout.card.internal.data.model.DetectedCardType;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.CardBrand;
import com.adyen.checkout.core.CardType;
import com.adyen.checkout.core.internal.util.Sha256;
import com.adyen.checkout.cse.internal.BaseCardEncryptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.h1;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import x80.m;
import y80.i;
import y80.r;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"JH\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b#\u0010$JB\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b&\u0010$J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\u0006\u0010'\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)JI\u0010*\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b*\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R \u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R0\u00107\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001e05j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001e`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/adyen/checkout/card/internal/data/api/DefaultDetectCardTypeRepository;", "Lcom/adyen/checkout/card/internal/data/api/DetectCardTypeRepository;", "Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;", "cardEncryptor", "Lcom/adyen/checkout/card/internal/data/api/BinLookupService;", "binLookupService", "<init>", "(Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;Lcom/adyen/checkout/card/internal/data/api/BinLookupService;)V", "", "cardNumber", "publicKey", "", "Lcom/adyen/checkout/core/CardBrand;", "supportedCardBrands", "clientKey", "Lv80/b0;", "coroutineScope", "type", "", "fetchFromNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lv80/b0;Ljava/lang/String;)V", "Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "detectCardLocally", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "cardBrand", "localDetectedCard", "(Lcom/adyen/checkout/core/CardBrand;Ljava/util/List;)Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "", "shouldFetchReliableTypes", "(Ljava/lang/String;)Z", "Lcom/adyen/checkout/card/internal/data/model/BinLookupResult;", "getFromCache", "(Ljava/lang/String;)Lcom/adyen/checkout/card/internal/data/model/BinLookupResult;", "hashBin", "(Ljava/lang/String;)Ljava/lang/String;", "fetch", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/card/internal/data/model/BinLookupResponse;", "makeBinLookup", "binLookupResponse", "mapResponse", "(Lcom/adyen/checkout/card/internal/data/model/BinLookupResponse;)Ljava/util/List;", "detectCardType", "Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;", "Lcom/adyen/checkout/card/internal/data/api/BinLookupService;", "Lx80/m;", "_detectedCardTypesFlow", "Lx80/m;", "Ly80/i;", "detectedCardTypesFlow", "Ly80/i;", "getDetectedCardTypesFlow", "()Ly80/i;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "cachedBinLookup", "Ljava/util/HashMap;", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultDetectCardTypeRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultDetectCardTypeRepository.kt\ncom/adyen/checkout/card/internal/data/api/DefaultDetectCardTypeRepository\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ResultExt.kt\ncom/adyen/checkout/core/internal/util/ResultExtKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n16#2,17:221\n16#2,17:238\n16#2,17:255\n16#2,17:272\n16#2,17:289\n16#2,17:306\n21#2,12:338\n16#2,17:350\n16#2,17:367\n1557#3:323\n1628#3,3:324\n1557#3:329\n1628#3,3:330\n1611#3,9:384\n1863#3:393\n1864#3:395\n1620#3:396\n17#4,2:327\n19#4,4:333\n1#5:337\n1#5:394\n*S KotlinDebug\n*F\n+ 1 DefaultDetectCardTypeRepository.kt\ncom/adyen/checkout/card/internal/data/api/DefaultDetectCardTypeRepository\n*L\n52#1:221,17\n56#1:238,17\n62#1:255,17\n66#1:272,17\n91#1:289,17\n109#1:306,17\n184#1:338,12\n189#1:350,17\n190#1:367,17\n114#1:323\n114#1:324,3\n176#1:329\n176#1:330,3\n193#1:384,9\n193#1:393\n193#1:395\n193#1:396\n174#1:327,2\n174#1:333,4\n193#1:394\n*E\n"})
public final class DefaultDetectCardTypeRepository implements DetectCardTypeRepository {

    @NotNull
    private static final Set<CardBrand> NO_CVC_BRANDS = h1.c(new CardBrand(CardType.BCMC));
    private static final int REQUIRED_BIN_SIZE = 11;

    @NotNull
    private final m _detectedCardTypesFlow;

    @NotNull
    private final BinLookupService binLookupService;

    @NotNull
    private final HashMap<String, BinLookupResult> cachedBinLookup;

    @NotNull
    private final BaseCardEncryptor cardEncryptor;

    @NotNull
    private final i detectedCardTypesFlow;

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository$fetch$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository", f = "DefaultDetectCardTypeRepository.kt", l = {155}, m = "fetch")
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
            return DefaultDetectCardTypeRepository.this.fetch(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository$fetchFromNetwork$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository$fetchFromNetwork$2", f = "DefaultDetectCardTypeRepository.kt", l = {95, 102}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nDefaultDetectCardTypeRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultDetectCardTypeRepository.kt\ncom/adyen/checkout/card/internal/data/api/DefaultDetectCardTypeRepository$fetchFromNetwork$2\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,220:1\n16#2,17:221\n*S KotlinDebug\n*F\n+ 1 DefaultDetectCardTypeRepository.kt\ncom/adyen/checkout/card/internal/data/api/DefaultDetectCardTypeRepository$fetchFromNetwork$2\n*L\n94#1:221,17\n*E\n"})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $cardNumber;
        final /* synthetic */ String $clientKey;
        final /* synthetic */ String $publicKey;
        final /* synthetic */ List<CardBrand> $supportedCardBrands;
        final /* synthetic */ String $type;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, List<CardBrand> list, String str3, String str4, x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$cardNumber = str;
            this.$publicKey = str2;
            this.$supportedCardBrands = list;
            this.$clientKey = str3;
            this.$type = str4;
        }

        @Override // z70.a
        @NotNull
        public final x70.c<Unit> create(@Nullable Object obj, @NotNull x70.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = DefaultDetectCardTypeRepository.this.new AnonymousClass2(this.$cardNumber, this.$publicKey, this.$supportedCardBrands, this.$clientKey, this.$type, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
        
            if (r1.f(r15, r14) == r0) goto L24;
         */
        @Override // z70.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                r14 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r14.label
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L19
                if (r1 != r3) goto L12
                ba0.g.M(r15)
                r13 = r14
                goto L8d
            L12:
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r15)
                r15 = 0
                return r15
            L19:
                ba0.g.M(r15)
                r13 = r14
                goto L7a
            L1e:
                ba0.g.M(r15)
                java.lang.Object r15 = r14.L$0
                v80.b0 r15 = (v80.b0) r15
                com.adyen.checkout.core.AdyenLogLevel r1 = com.adyen.checkout.core.AdyenLogLevel.DEBUG
                com.adyen.checkout.core.AdyenLogger$Companion r4 = com.adyen.checkout.core.AdyenLogger.INSTANCE
                com.adyen.checkout.core.AdyenLogger r5 = r4.getLogger()
                boolean r5 = r5.shouldLog(r1)
                if (r5 == 0) goto L64
                java.lang.Class r15 = r15.getClass()
                java.lang.String r15 = r15.getName()
                r5 = 36
                java.lang.String r5 = kotlin.text.StringsKt.Y(r15, r5)
                r6 = 46
                java.lang.String r5 = kotlin.text.StringsKt.W(r6, r5, r5)
                int r6 = r5.length()
                if (r6 != 0) goto L4e
                goto L54
            L4e:
                java.lang.String r15 = "Kt"
                java.lang.String r15 = kotlin.text.StringsKt.O(r5, r15)
            L54:
                java.lang.String r5 = "CO."
                java.lang.String r15 = r5.concat(r15)
                com.adyen.checkout.core.AdyenLogger r4 = r4.getLogger()
                java.lang.String r5 = "Emitting new detectedCardTypes"
                r6 = 0
                r4.log(r1, r15, r5, r6)
            L64:
                com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository r7 = com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository.this
                java.lang.String r8 = r14.$cardNumber
                java.lang.String r9 = r14.$publicKey
                java.util.List<com.adyen.checkout.core.CardBrand> r10 = r14.$supportedCardBrands
                java.lang.String r11 = r14.$clientKey
                java.lang.String r12 = r14.$type
                r14.label = r2
                r13 = r14
                java.lang.Object r15 = com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository.access$fetch(r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r0) goto L7a
                goto L8c
            L7a:
                java.util.List r15 = (java.util.List) r15
                if (r15 == 0) goto L8d
                com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository r1 = com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository.this
                x80.m r1 = com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository.access$get_detectedCardTypesFlow$p(r1)
                r13.label = r3
                java.lang.Object r15 = r1.f(r15, r14)
                if (r15 != r0) goto L8d
            L8c:
                return r0
            L8d:
                kotlin.Unit r15 = kotlin.Unit.f26487a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository$makeBinLookup$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository", f = "DefaultDetectCardTypeRepository.kt", l = {179}, m = "makeBinLookup")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00701 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00701(x70.c<? super C00701> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultDetectCardTypeRepository.this.makeBinLookup(null, null, null, null, null, this);
        }
    }

    public DefaultDetectCardTypeRepository(@NotNull BaseCardEncryptor baseCardEncryptor, @NotNull BinLookupService binLookupService) {
        baseCardEncryptor.getClass();
        binLookupService.getClass();
        this.cardEncryptor = baseCardEncryptor;
        this.binLookupService = binLookupService;
        m mVarBufferedChannel = ChannelExtensionsKt.bufferedChannel();
        this._detectedCardTypesFlow = mVarBufferedChannel;
        this.detectedCardTypesFlow = r.w(mVarBufferedChannel);
        this.cachedBinLookup = new HashMap<>();
    }

    private final List<DetectedCardType> detectCardLocally(String cardNumber, List<CardBrand> supportedCardBrands) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultDetectCardTypeRepository.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "detectCardLocally", null);
        }
        if (cardNumber.length() == 0) {
            return n0.f26529a;
        }
        List<CardBrand> listEstimate = CardBrand.INSTANCE.estimate(cardNumber);
        ArrayList arrayList = new ArrayList(e0.o(listEstimate, 10));
        Iterator<T> it = listEstimate.iterator();
        while (it.hasNext()) {
            arrayList.add(localDetectedCard((CardBrand) it.next(), supportedCardBrands));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetch(java.lang.String r9, java.lang.String r10, java.util.List<com.adyen.checkout.core.CardBrand> r11, java.lang.String r12, java.lang.String r13, x70.c<? super java.util.List<com.adyen.checkout.card.internal.data.model.DetectedCardType>> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r14
            com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository$fetch$1 r0 = (com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository$fetch$1 r0 = new com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository$fetch$1
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r9 = r7.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r7.L$0
            com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository r10 = (com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository) r10
            ba0.g.M(r14)
            goto L5d
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
        L36:
            r9 = 0
            return r9
        L38:
            ba0.g.M(r14)
            java.lang.String r14 = r8.hashBin(r9)
            java.util.HashMap<java.lang.String, com.adyen.checkout.card.internal.data.model.BinLookupResult> r1 = r8.cachedBinLookup
            com.adyen.checkout.card.internal.data.model.BinLookupResult$Loading r3 = com.adyen.checkout.card.internal.data.model.BinLookupResult.Loading.INSTANCE
            r1.put(r14, r3)
            r7.L$0 = r8
            r7.L$1 = r14
            r7.label = r2
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r9 = r1.makeBinLookup(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L59
            return r0
        L59:
            r10 = r14
            r14 = r9
            r9 = r10
            r10 = r8
        L5d:
            com.adyen.checkout.card.internal.data.model.BinLookupResponse r14 = (com.adyen.checkout.card.internal.data.model.BinLookupResponse) r14
            if (r14 != 0) goto L67
            java.util.HashMap<java.lang.String, com.adyen.checkout.card.internal.data.model.BinLookupResult> r10 = r10.cachedBinLookup
            r10.remove(r9)
            goto L36
        L67:
            java.util.List r11 = r10.mapResponse(r14)
            java.util.HashMap<java.lang.String, com.adyen.checkout.card.internal.data.model.BinLookupResult> r10 = r10.cachedBinLookup
            com.adyen.checkout.card.internal.data.model.BinLookupResult$Available r12 = new com.adyen.checkout.card.internal.data.model.BinLookupResult$Available
            r12.<init>(r11)
            r10.put(r9, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository.fetch(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    private final void fetchFromNetwork(String cardNumber, String publicKey, List<CardBrand> supportedCardBrands, String clientKey, b0 coroutineScope, String type) {
        if (publicKey != null) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultDetectCardTypeRepository.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Launching Bin Lookup", null);
            }
            f0.B(coroutineScope, null, null, new AnonymousClass2(cardNumber, publicKey, supportedCardBrands, clientKey, type, null), 3);
        }
    }

    private final BinLookupResult getFromCache(String cardNumber) {
        BinLookupResult binLookupResult = this.cachedBinLookup.get(hashBin(cardNumber));
        return binLookupResult == null ? BinLookupResult.Unavailable.INSTANCE : binLookupResult;
    }

    private final String hashBin(String cardNumber) {
        return Sha256.INSTANCE.hashString(kotlin.text.b0.x(11, cardNumber));
    }

    private final DetectedCardType localDetectedCard(CardBrand cardBrand, List<CardBrand> supportedCardBrands) {
        return new DetectedCardType(cardBrand, false, true, NO_CVC_BRANDS.contains(cardBrand) ? Brand.FieldPolicy.HIDDEN : Brand.FieldPolicy.REQUIRED, Brand.FieldPolicy.REQUIRED, supportedCardBrands.contains(cardBrand), null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object makeBinLookup(java.lang.String r6, java.lang.String r7, java.util.List<com.adyen.checkout.core.CardBrand> r8, java.lang.String r9, java.lang.String r10, x70.c<? super com.adyen.checkout.card.internal.data.model.BinLookupResponse> r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository.makeBinLookup(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    private final List<DetectedCardType> mapResponse(BinLookupResponse binLookupResponse) {
        DetectedCardType detectedCardType;
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultDetectCardTypeRepository.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "handleBinLookupResponse", null);
        }
        AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.VERBOSE;
        if (companion.getLogger().shouldLog(adyenLogLevel2)) {
            String name2 = DefaultDetectCardTypeRepository.class.getName();
            String strY2 = StringsKt.Y(name2, '$');
            String strW2 = StringsKt.W('.', strY2, strY2);
            if (strW2.length() != 0) {
                name2 = StringsKt.O(strW2, "Kt");
            }
            String strConcat = "CO.".concat(name2);
            companion.getLogger().log(adyenLogLevel2, strConcat, "Brands: " + binLookupResponse.getBrands(), null);
        }
        List<Brand> brands = binLookupResponse.getBrands();
        if (brands == null) {
            brands = n0.f26529a;
        }
        ArrayList arrayList = new ArrayList();
        for (Brand brand : brands) {
            if (brand.getBrand() == null) {
                detectedCardType = null;
            } else {
                CardBrand cardBrand = new CardBrand(brand.getBrand());
                boolean zAreEqual = Intrinsics.areEqual(brand.getEnableLuhnCheck(), Boolean.TRUE);
                Brand.FieldPolicy.Companion companion2 = Brand.FieldPolicy.INSTANCE;
                String cvcPolicy = brand.getCvcPolicy();
                if (cvcPolicy == null) {
                    cvcPolicy = Brand.FieldPolicy.REQUIRED.getValue();
                }
                Brand.FieldPolicy fieldPolicy = companion2.parse(cvcPolicy);
                String expiryDatePolicy = brand.getExpiryDatePolicy();
                if (expiryDatePolicy == null) {
                    expiryDatePolicy = Brand.FieldPolicy.REQUIRED.getValue();
                }
                detectedCardType = new DetectedCardType(cardBrand, true, zAreEqual, fieldPolicy, companion2.parse(expiryDatePolicy), !Intrinsics.areEqual(brand.getSupported(), Boolean.FALSE), brand.getPanLength(), brand.getPaymentMethodVariant(), brand.getLocalizedBrand());
            }
            if (detectedCardType != null) {
                arrayList.add(detectedCardType);
            }
        }
        return arrayList;
    }

    private final boolean shouldFetchReliableTypes(String cardNumber) {
        return cardNumber.length() >= 11;
    }

    @Override // com.adyen.checkout.card.internal.data.api.DetectCardTypeRepository
    public void detectCardType(@NotNull String cardNumber, @Nullable String publicKey, @NotNull List<CardBrand> supportedCardBrands, @NotNull String clientKey, @NotNull b0 coroutineScope, @Nullable String type) {
        cardNumber.getClass();
        supportedCardBrands.getClass();
        clientKey.getClass();
        coroutineScope.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultDetectCardTypeRepository.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "detectCardType", null);
        }
        if (shouldFetchReliableTypes(cardNumber)) {
            BinLookupResult fromCache = getFromCache(cardNumber);
            if (fromCache instanceof BinLookupResult.Available) {
                if (companion.getLogger().shouldLog(adyenLogLevel)) {
                    String name2 = DefaultDetectCardTypeRepository.class.getName();
                    String strY2 = StringsKt.Y(name2, '$');
                    String strW2 = StringsKt.W('.', strY2, strY2);
                    if (strW2.length() != 0) {
                        name2 = StringsKt.O(strW2, "Kt");
                    }
                    companion.getLogger().log(adyenLogLevel, "CO.".concat(name2), "Retrieving from cache.", null);
                }
                this._detectedCardTypesFlow.h(((BinLookupResult.Available) fromCache).getDetectedCardTypes());
                return;
            }
            if (fromCache instanceof BinLookupResult.Loading) {
                if (companion.getLogger().shouldLog(adyenLogLevel)) {
                    String name3 = DefaultDetectCardTypeRepository.class.getName();
                    String strY3 = StringsKt.Y(name3, '$');
                    String strW3 = StringsKt.W('.', strY3, strY3);
                    if (strW3.length() != 0) {
                        name3 = StringsKt.O(strW3, "Kt");
                    }
                    companion.getLogger().log(adyenLogLevel, "CO.".concat(name3), "BinLookup request is in progress.", null);
                }
            } else if (fromCache instanceof BinLookupResult.Unavailable) {
                if (companion.getLogger().shouldLog(adyenLogLevel)) {
                    String name4 = DefaultDetectCardTypeRepository.class.getName();
                    String strY4 = StringsKt.Y(name4, '$');
                    String strW4 = StringsKt.W('.', strY4, strY4);
                    if (strW4.length() != 0) {
                        name4 = StringsKt.O(strW4, "Kt");
                    }
                    companion.getLogger().log(adyenLogLevel, "CO.".concat(name4), "Fetching from network.", null);
                }
                fetchFromNetwork(cardNumber, publicKey, supportedCardBrands, clientKey, coroutineScope, type);
            }
        }
        this._detectedCardTypesFlow.h(detectCardLocally(cardNumber, supportedCardBrands));
    }

    @Override // com.adyen.checkout.card.internal.data.api.DetectCardTypeRepository
    @NotNull
    public i getDetectedCardTypesFlow() {
        return this.detectedCardTypesFlow;
    }
}
