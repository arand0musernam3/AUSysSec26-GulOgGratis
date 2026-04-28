package com.adyen.checkout.components.core.internal.analytics.data;

import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import com.adyen.checkout.components.core.internal.analytics.data.local.AnalyticsLocalDataStore;
import com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsRemoteDataStore;
import com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsSetupProvider;
import com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsTrackRequestProvider;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y70.a;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\u00152\u001e\u0010\u0014\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\"\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%¨\u0006&"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/data/DefaultAnalyticsRepository;", "Lcom/adyen/checkout/components/core/internal/analytics/data/AnalyticsRepository;", "Lcom/adyen/checkout/components/core/internal/analytics/data/local/AnalyticsLocalDataStore;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info;", "localInfoDataStore", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log;", "localLogDataStore", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error;", "localErrorDataStore", "Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsRemoteDataStore;", "remoteDataStore", "Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsSetupProvider;", "analyticsSetupProvider", "Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsTrackRequestProvider;", "analyticsTrackRequestProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/analytics/data/local/AnalyticsLocalDataStore;Lcom/adyen/checkout/components/core/internal/analytics/data/local/AnalyticsLocalDataStore;Lcom/adyen/checkout/components/core/internal/analytics/data/local/AnalyticsLocalDataStore;Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsRemoteDataStore;Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsSetupProvider;Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsTrackRequestProvider;)V", "", "", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;", "eventLists", "", "hasEventsToTrack", "([Ljava/util/List;)Z", "", "fetchCheckoutAttemptId", "(Lx70/c;)Ljava/lang/Object;", "event", "", "storeEvent", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;Lx70/c;)Ljava/lang/Object;", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "sendEvents", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/components/core/internal/analytics/data/local/AnalyticsLocalDataStore;", "Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsRemoteDataStore;", "Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsSetupProvider;", "Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsTrackRequestProvider;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultAnalyticsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAnalyticsRepository.kt\ncom/adyen/checkout/components/core/internal/analytics/data/DefaultAnalyticsRepository\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,73:1\n16#2,17:74\n*S KotlinDebug\n*F\n+ 1 DefaultAnalyticsRepository.kt\ncom/adyen/checkout/components/core/internal/analytics/data/DefaultAnalyticsRepository\n*L\n61#1:74,17\n*E\n"})
public final class DefaultAnalyticsRepository implements AnalyticsRepository {

    @NotNull
    private final AnalyticsSetupProvider analyticsSetupProvider;

    @NotNull
    private final AnalyticsTrackRequestProvider analyticsTrackRequestProvider;

    @NotNull
    private final AnalyticsLocalDataStore<AnalyticsEvent.Error> localErrorDataStore;

    @NotNull
    private final AnalyticsLocalDataStore<AnalyticsEvent.Info> localInfoDataStore;

    @NotNull
    private final AnalyticsLocalDataStore<AnalyticsEvent.Log> localLogDataStore;

    @NotNull
    private final AnalyticsRemoteDataStore remoteDataStore;

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository$fetchCheckoutAttemptId$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository", f = "DefaultAnalyticsRepository.kt", l = {30}, m = "fetchCheckoutAttemptId")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
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
            return DefaultAnalyticsRepository.this.fetchCheckoutAttemptId(this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository$sendEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository", f = "DefaultAnalyticsRepository.kt", l = {44, 45, 46, 55, 57, 58, 59}, m = "sendEvents")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00861 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C00861(x70.c<? super C00861> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultAnalyticsRepository.this.sendEvents(null, this);
        }
    }

    public DefaultAnalyticsRepository(@NotNull AnalyticsLocalDataStore<AnalyticsEvent.Info> analyticsLocalDataStore, @NotNull AnalyticsLocalDataStore<AnalyticsEvent.Log> analyticsLocalDataStore2, @NotNull AnalyticsLocalDataStore<AnalyticsEvent.Error> analyticsLocalDataStore3, @NotNull AnalyticsRemoteDataStore analyticsRemoteDataStore, @NotNull AnalyticsSetupProvider analyticsSetupProvider, @NotNull AnalyticsTrackRequestProvider analyticsTrackRequestProvider) {
        analyticsLocalDataStore.getClass();
        analyticsLocalDataStore2.getClass();
        analyticsLocalDataStore3.getClass();
        analyticsRemoteDataStore.getClass();
        analyticsSetupProvider.getClass();
        analyticsTrackRequestProvider.getClass();
        this.localInfoDataStore = analyticsLocalDataStore;
        this.localLogDataStore = analyticsLocalDataStore2;
        this.localErrorDataStore = analyticsLocalDataStore3;
        this.remoteDataStore = analyticsRemoteDataStore;
        this.analyticsSetupProvider = analyticsSetupProvider;
        this.analyticsTrackRequestProvider = analyticsTrackRequestProvider;
    }

    private final boolean hasEventsToTrack(List<? extends AnalyticsEvent>... eventLists) {
        for (List<? extends AnalyticsEvent> list : eventLists) {
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.adyen.checkout.components.core.internal.analytics.data.AnalyticsRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetchCheckoutAttemptId(@org.jetbrains.annotations.NotNull x70.c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository$fetchCheckoutAttemptId$1 r0 = (com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository$fetchCheckoutAttemptId$1 r0 = new com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository$fetchCheckoutAttemptId$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L42
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsSetupProvider r5 = r4.analyticsSetupProvider
            com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest r5 = r5.provide()
            com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsRemoteDataStore r2 = r4.remoteDataStore
            r0.label = r3
            java.lang.Object r5 = r2.fetchCheckoutAttemptId(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupResponse r5 = (com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupResponse) r5
            java.lang.String r5 = r5.getCheckoutAttemptId()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository.fetchCheckoutAttemptId(x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x015f, code lost:
    
        if (r2.removeEvents(r13, r0) != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e A[PHI: r2 r3 r12
      0x013e: PHI (r2v19 java.util.List<com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Log>) = 
      (r2v16 java.util.List<com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Log>)
      (r2v21 java.util.List<com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Log>)
     binds: [B:40:0x013b, B:14:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r3v12 com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository) = 
      (r3v8 com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository)
      (r3v14 com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository)
     binds: [B:40:0x013b, B:14:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r12v17 java.util.List<com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Error>) = 
      (r12v14 java.util.List<com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Error>)
      (r12v20 java.util.List<com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Error>)
     binds: [B:40:0x013b, B:14:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.adyen.checkout.components.core.internal.analytics.data.AnalyticsRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object sendEvents(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository.sendEvents(java.lang.String, x70.c):java.lang.Object");
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.data.AnalyticsRepository
    @Nullable
    public Object storeEvent(@NotNull AnalyticsEvent analyticsEvent, @NotNull x70.c<? super Unit> cVar) {
        if (analyticsEvent instanceof AnalyticsEvent.Info) {
            Object objStoreEvent = this.localInfoDataStore.storeEvent(analyticsEvent, cVar);
            return objStoreEvent == a.COROUTINE_SUSPENDED ? objStoreEvent : Unit.f26487a;
        }
        if (analyticsEvent instanceof AnalyticsEvent.Log) {
            Object objStoreEvent2 = this.localLogDataStore.storeEvent(analyticsEvent, cVar);
            return objStoreEvent2 == a.COROUTINE_SUSPENDED ? objStoreEvent2 : Unit.f26487a;
        }
        if (!(analyticsEvent instanceof AnalyticsEvent.Error)) {
            return Unit.f26487a;
        }
        Object objStoreEvent3 = this.localErrorDataStore.storeEvent(analyticsEvent, cVar);
        return objStoreEvent3 == a.COROUTINE_SUSPENDED ? objStoreEvent3 : Unit.f26487a;
    }
}
