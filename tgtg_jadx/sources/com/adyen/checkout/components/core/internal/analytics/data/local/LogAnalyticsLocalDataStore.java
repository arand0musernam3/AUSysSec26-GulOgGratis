package com.adyen.checkout.components.core.internal.analytics.data.local;

import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import com.adyen.checkout.issuerlist.internal.ui.DefaultIssuerListDelegate;
import e90.a;
import e90.d;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/data/local/LogAnalyticsLocalDataStore;", "Lcom/adyen/checkout/components/core/internal/analytics/data/local/AnalyticsLocalDataStore;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log;", "<init>", "()V", "event", "", "storeEvent", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log;Lx70/c;)Ljava/lang/Object;", "", "size", "", "fetchEvents", "(ILx70/c;)Ljava/lang/Object;", "events", "removeEvents", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "Ljava/util/LinkedList;", DefaultIssuerListDelegate.ANALYTICS_TARGET, "Ljava/util/LinkedList;", "Le90/a;", "mutex", "Le90/a;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLogAnalyticsLocalDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogAnalyticsLocalDataStore.kt\ncom/adyen/checkout/components/core/internal/analytics/data/local/LogAnalyticsLocalDataStore\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,38:1\n116#2,11:39\n116#2,11:50\n116#2,11:61\n*S KotlinDebug\n*F\n+ 1 LogAnalyticsLocalDataStore.kt\ncom/adyen/checkout/components/core/internal/analytics/data/local/LogAnalyticsLocalDataStore\n*L\n23#1:39,11\n28#1:50,11\n33#1:61,11\n*E\n"})
public final class LogAnalyticsLocalDataStore implements AnalyticsLocalDataStore<AnalyticsEvent.Log> {

    @NotNull
    private final LinkedList<AnalyticsEvent.Log> list = new LinkedList<>();

    @NotNull
    private final a mutex = d.a();

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$fetchEvents$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore", f = "LogAnalyticsLocalDataStore.kt", l = {44}, m = "fetchEvents")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        int I$0;
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
            return LogAnalyticsLocalDataStore.this.fetchEvents(0, this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$removeEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore", f = "LogAnalyticsLocalDataStore.kt", l = {44}, m = "removeEvents")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00911 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00911(x70.c<? super C00911> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LogAnalyticsLocalDataStore.this.removeEvents(null, this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$storeEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore", f = "LogAnalyticsLocalDataStore.kt", l = {44}, m = "storeEvent")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00921 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00921(x70.c<? super C00921> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LogAnalyticsLocalDataStore.this.storeEvent2((AnalyticsEvent.Log) null, (x70.c<? super Unit>) this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.adyen.checkout.components.core.internal.analytics.data.local.AnalyticsLocalDataStore
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetchEvents(int r5, @org.jetbrains.annotations.NotNull x70.c<? super java.util.List<? extends com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent.Log>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$fetchEvents$1 r0 = (com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$fetchEvents$1 r0 = new com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$fetchEvents$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            int r5 = r0.I$0
            java.lang.Object r1 = r0.L$1
            e90.a r1 = (e90.a) r1
            java.lang.Object r0 = r0.L$0
            com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore r0 = (com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore) r0
            ba0.g.M(r6)
            goto L4e
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L38:
            ba0.g.M(r6)
            e90.a r6 = r4.mutex
            r0.L$0 = r4
            r0.L$1 = r6
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r0 = r6.g(r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
            r1 = r6
        L4e:
            r6 = 0
            java.util.LinkedList<com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Log> r0 = r0.list     // Catch: java.lang.Throwable -> L59
            java.util.List r5 = kotlin.collections.CollectionsKt.n0(r5, r0)     // Catch: java.lang.Throwable -> L59
            r1.e(r6)
            return r5
        L59:
            r5 = move-exception
            r1.e(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore.fetchEvents(int, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.adyen.checkout.components.core.internal.analytics.data.local.AnalyticsLocalDataStore
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object removeEvents(@org.jetbrains.annotations.NotNull java.util.List<? extends com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent.Log> r5, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore.C00911
            if (r0 == 0) goto L13
            r0 = r6
            com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$removeEvents$1 r0 = (com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore.C00911) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$removeEvents$1 r0 = new com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$removeEvents$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.L$2
            e90.a r5 = (e90.a) r5
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.L$0
            com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore r0 = (com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore) r0
            ba0.g.M(r6)
            r6 = r5
            r5 = r1
            goto L51
        L35:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L3c:
            ba0.g.M(r6)
            e90.a r6 = r4.mutex
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r0 = r6.g(r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            r0 = r4
        L51:
            r1 = 0
            java.util.LinkedList<com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Log> r0 = r0.list     // Catch: java.lang.Throwable -> L63
            java.util.Set r5 = kotlin.collections.CollectionsKt.v0(r5)     // Catch: java.lang.Throwable -> L63
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L63
            r0.removeAll(r5)     // Catch: java.lang.Throwable -> L63
            r6.e(r1)
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        L63:
            r5 = move-exception
            r6.e(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore.removeEvents(java.util.List, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: storeEvent, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object storeEvent2(@org.jetbrains.annotations.NotNull com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent.Log r5, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore.C00921
            if (r0 == 0) goto L13
            r0 = r6
            com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$storeEvent$1 r0 = (com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore.C00921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$storeEvent$1 r0 = new com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore$storeEvent$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.L$2
            e90.a r5 = (e90.a) r5
            java.lang.Object r1 = r0.L$1
            com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Log r1 = (com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent.Log) r1
            java.lang.Object r0 = r0.L$0
            com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore r0 = (com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore) r0
            ba0.g.M(r6)
            r6 = r5
            r5 = r1
            goto L51
        L35:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L3c:
            ba0.g.M(r6)
            e90.a r6 = r4.mutex
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r0 = r6.g(r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            r0 = r4
        L51:
            r1 = 0
            java.util.LinkedList<com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Log> r0 = r0.list     // Catch: java.lang.Throwable -> L5d
            r0.add(r5)     // Catch: java.lang.Throwable -> L5d
            r6.e(r1)
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        L5d:
            r5 = move-exception
            r6.e(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore.storeEvent2(com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Log, x70.c):java.lang.Object");
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.data.local.AnalyticsLocalDataStore
    public /* bridge */ /* synthetic */ Object storeEvent(AnalyticsEvent.Log log, x70.c cVar) {
        return storeEvent2(log, (x70.c<? super Unit>) cVar);
    }
}
