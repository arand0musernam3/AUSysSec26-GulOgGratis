package zendesk.android.internal.frontendevents;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;
import zendesk.android.internal.di.ZendeskComponentConfig;
import zendesk.android.internal.di.ZendeskInitializedComponentScope;
import zendesk.android.internal.network.NetworkData;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.ui.android.internal.local.LocaleProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@ZendeskInitializedComponentScope
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B9\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 ¨\u0006\""}, d2 = {"Lzendesk/android/internal/frontendevents/FrontendEventsRepository;", "", "Lzendesk/android/internal/frontendevents/FrontendEventsApi;", "frontendEventsApi", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "zendeskComponentConfig", "Lzendesk/android/internal/frontendevents/FrontendEventsStorage;", "frontendEventsStorage", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/android/internal/network/NetworkData;", "networkData", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "localeProvider", "<init>", "(Lzendesk/android/internal/frontendevents/FrontendEventsApi;Lzendesk/android/internal/di/ZendeskComponentConfig;Lzendesk/android/internal/frontendevents/FrontendEventsStorage;Lzendesk/conversationkit/android/ConversationKit;Lzendesk/android/internal/network/NetworkData;Lzendesk/core/ui/android/internal/local/LocaleProvider;)V", "Lzendesk/android/pageviewevents/PageView;", "pageTitle", "Lzendesk/android/ZendeskResult;", "", "", "sendPageViewEvent", "(Lzendesk/android/pageviewevents/PageView;Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;", "proactiveCampaign", "sendProactiveMessagingAnalyticsEvent", "(Lzendesk/android/internal/frontendevents/analyticsevents/model/ProactiveCampaignAnalyticsDTO;Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/internal/frontendevents/FrontendEventsApi;", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "Lzendesk/android/internal/frontendevents/FrontendEventsStorage;", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/android/internal/network/NetworkData;", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrontendEventsRepository {

    @NotNull
    private static final String CHANNEL = "mobile-sdk";

    @NotNull
    private static final String CLIENT_ID = "383F2407-53F9-475B-87BD-6D2F1CE12105";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String LOG_TAG = "FrontendEventsRepository";

    @NotNull
    private static final String ZENDESK_SDK_VERSION = "Zendesk-SDK/";

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final FrontendEventsApi frontendEventsApi;

    @NotNull
    private final FrontendEventsStorage frontendEventsStorage;

    @NotNull
    private final LocaleProvider localeProvider;

    @NotNull
    private final NetworkData networkData;

    @NotNull
    private final ZendeskComponentConfig zendeskComponentConfig;

    /* JADX INFO: renamed from: zendesk.android.internal.frontendevents.FrontendEventsRepository$sendPageViewEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.frontendevents.FrontendEventsRepository", f = "FrontendEventsRepository.kt", l = {BERTags.OBJECT_IDENTIFIER_IRI, 36, 53}, m = "sendPageViewEvent")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
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
            return FrontendEventsRepository.this.sendPageViewEvent(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.frontendevents.FrontendEventsRepository$sendProactiveMessagingAnalyticsEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.frontendevents.FrontendEventsRepository", f = "FrontendEventsRepository.kt", l = {67, 68, 79}, m = "sendProactiveMessagingAnalyticsEvent")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01931 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01931(x70.c<? super C01931> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FrontendEventsRepository.this.sendProactiveMessagingAnalyticsEvent(null, this);
        }
    }

    public FrontendEventsRepository(@NotNull FrontendEventsApi frontendEventsApi, @NotNull ZendeskComponentConfig zendeskComponentConfig, @NotNull FrontendEventsStorage frontendEventsStorage, @NotNull ConversationKit conversationKit, @NotNull NetworkData networkData, @NotNull LocaleProvider localeProvider) {
        frontendEventsApi.getClass();
        zendeskComponentConfig.getClass();
        frontendEventsStorage.getClass();
        conversationKit.getClass();
        networkData.getClass();
        localeProvider.getClass();
        this.frontendEventsApi = frontendEventsApi;
        this.zendeskComponentConfig = zendeskComponentConfig;
        this.frontendEventsStorage = frontendEventsStorage;
        this.conversationKit = conversationKit;
        this.networkData = networkData;
        this.localeProvider = localeProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r14 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendPageViewEvent(@org.jetbrains.annotations.NotNull zendesk.android.pageviewevents.PageView r13, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.android.ZendeskResult<kotlin.Unit, ? extends java.lang.Throwable>> r14) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.frontendevents.FrontendEventsRepository.sendPageViewEvent(zendesk.android.pageviewevents.PageView, x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (r13.sendProactiveCampaignAnalyticsEvent("383F2407-53F9-475B-87BD-6D2F1CE12105", r4, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendProactiveMessagingAnalyticsEvent(@org.jetbrains.annotations.NotNull zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveCampaignAnalyticsDTO r13, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof zendesk.android.internal.frontendevents.FrontendEventsRepository.C01931
            if (r0 == 0) goto L13
            r0 = r14
            zendesk.android.internal.frontendevents.FrontendEventsRepository$sendProactiveMessagingAnalyticsEvent$1 r0 = (zendesk.android.internal.frontendevents.FrontendEventsRepository.C01931) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.android.internal.frontendevents.FrontendEventsRepository$sendProactiveMessagingAnalyticsEvent$1 r0 = new zendesk.android.internal.frontendevents.FrontendEventsRepository$sendProactiveMessagingAnalyticsEvent$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L32
            ba0.g.M(r14)     // Catch: java.lang.Exception -> L2e
            goto Lb1
        L2e:
            r0 = move-exception
            r13 = r0
            goto La7
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
            r13 = 0
            return r13
        L39:
            java.lang.Object r13 = r0.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r0.L$0
            zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveCampaignAnalyticsDTO r2 = (zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveCampaignAnalyticsDTO) r2
            ba0.g.M(r14)
            r9 = r13
            r11 = r2
            goto L73
        L47:
            java.lang.Object r13 = r0.L$0
            zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveCampaignAnalyticsDTO r13 = (zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveCampaignAnalyticsDTO) r13
            ba0.g.M(r14)
            goto L5f
        L4f:
            ba0.g.M(r14)
            zendesk.android.internal.frontendevents.FrontendEventsStorage r14 = r12.frontendEventsStorage
            r0.L$0 = r13
            r0.label = r5
            java.lang.Object r14 = r14.getSUID(r0)
            if (r14 != r1) goto L5f
            goto La6
        L5f:
            java.lang.String r14 = (java.lang.String) r14
            zendesk.conversationkit.android.ConversationKit r2 = r12.conversationKit
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r4
            java.lang.Object r2 = r2.getClientId(r0)
            if (r2 != r1) goto L70
            goto La6
        L70:
            r11 = r13
            r9 = r14
            r14 = r2
        L73:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L79
            java.lang.String r14 = ""
        L79:
            r5 = r14
            java.lang.String r8 = zendesk.core.android.internal.DateKtxKt.currentIso8601UtcTimestamp()
            zendesk.android.internal.di.ZendeskComponentConfig r13 = r12.zendeskComponentConfig
            java.lang.String r13 = r13.getVersionName()
            java.lang.String r14 = "Zendesk-SDK/"
            java.lang.String r7 = e0.f.k(r14, r13)
            java.lang.String r10 = j4.s.e()
            zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveMessageAnalyticsEvent r4 = new zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveMessageAnalyticsEvent
            java.lang.String r6 = "mobile-sdk"
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            zendesk.android.internal.frontendevents.FrontendEventsApi r13 = r12.frontendEventsApi     // Catch: java.lang.Exception -> L2e
            java.lang.String r14 = "383F2407-53F9-475B-87BD-6D2F1CE12105"
            r2 = 0
            r0.L$0 = r2     // Catch: java.lang.Exception -> L2e
            r0.L$1 = r2     // Catch: java.lang.Exception -> L2e
            r0.label = r3     // Catch: java.lang.Exception -> L2e
            java.lang.Object r13 = r13.sendProactiveCampaignAnalyticsEvent(r14, r4, r0)     // Catch: java.lang.Exception -> L2e
            if (r13 != r1) goto Lb1
        La6:
            return r1
        La7:
            r14 = 0
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r0 = "FrontendEventsRepository"
            java.lang.String r1 = "Failed to send analytics event"
            zendesk.logger.Logger.e(r0, r1, r13, r14)
        Lb1:
            kotlin.Unit r13 = kotlin.Unit.f26487a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.frontendevents.FrontendEventsRepository.sendProactiveMessagingAnalyticsEvent(zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveCampaignAnalyticsDTO, x70.c):java.lang.Object");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lzendesk/android/internal/frontendevents/FrontendEventsRepository$Companion;", "", "<init>", "()V", "CLIENT_ID", "", "CHANNEL", "ZENDESK_SDK_VERSION", "LOG_TAG", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
