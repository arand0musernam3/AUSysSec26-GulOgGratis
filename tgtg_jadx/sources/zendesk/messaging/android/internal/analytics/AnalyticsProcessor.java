package zendesk.messaging.android.internal.analytics;

import com.appsflyer.attribution.RequestError;
import com.braze.models.FeatureFlag;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y70.a;
import z70.c;
import z70.e;
import zendesk.analyticskit.android.AnalyticsKit;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.messaging.android.internal.di.MessagingScope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001c"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "", "Lzendesk/analyticskit/android/AnalyticsKit;", "analyticsKit", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "localeProvider", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "<init>", "(Lzendesk/analyticskit/android/AnalyticsKit;Lzendesk/conversationkit/android/ConversationKit;Lzendesk/core/ui/android/internal/local/LocaleProvider;Lzendesk/android/messaging/model/MessagingSettings;)V", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "analyticsEventType", "Lzendesk/analyticskit/android/model/AnalyticsEvent;", "createAnalyticsEvent", "(Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;Lx70/c;)Ljava/lang/Object;", "", "process", "", FeatureFlag.ENABLED, "enableInternalAnalytics", "(ZLx70/c;)Ljava/lang/Object;", "Lzendesk/analyticskit/android/AnalyticsKit;", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "Lzendesk/android/messaging/model/MessagingSettings;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@MessagingScope
public final class AnalyticsProcessor {

    @Deprecated
    @NotNull
    public static final String ANONYMOUS_USER_TYPE = "unauthenticated";

    @Deprecated
    @NotNull
    public static final String AUTHENTICATED_USER_TYPE = "JWTAuth";

    @Deprecated
    @NotNull
    public static final String CHANNEL = "messaging";

    @Deprecated
    @NotNull
    public static final String CHANNEL_NAME = "Android";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AnalyticsKit analyticsKit;

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final LocaleProvider localeProvider;

    @NotNull
    private final MessagingSettings messagingSettings;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.analytics.AnalyticsProcessor$createAnalyticsEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.analytics.AnalyticsProcessor", f = "AnalyticsProcessor.kt", l = {66, 74}, m = "createAnalyticsEvent")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
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
            return AnalyticsProcessor.this.createAnalyticsEvent(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.analytics.AnalyticsProcessor$process$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.analytics.AnalyticsProcessor", f = "AnalyticsProcessor.kt", l = {RequestError.NO_DEV_KEY, 42, 43}, m = "process")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03851 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03851(x70.c<? super C03851> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnalyticsProcessor.this.process(null, this);
        }
    }

    public AnalyticsProcessor(@NotNull AnalyticsKit analyticsKit, @NotNull ConversationKit conversationKit, @NotNull LocaleProvider localeProvider, @NotNull MessagingSettings messagingSettings) {
        analyticsKit.getClass();
        conversationKit.getClass();
        localeProvider.getClass();
        messagingSettings.getClass();
        this.analyticsKit = analyticsKit;
        this.conversationKit = conversationKit;
        this.localeProvider = localeProvider;
        this.messagingSettings = messagingSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createAnalyticsEvent(zendesk.messaging.android.internal.analytics.AnalyticsEventType r25, x70.c<? super zendesk.analyticskit.android.model.AnalyticsEvent> r26) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.analytics.AnalyticsProcessor.createAnalyticsEvent(zendesk.messaging.android.internal.analytics.AnalyticsEventType, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object enableInternalAnalytics(boolean z11, @NotNull x70.c<? super Unit> cVar) {
        Object objEnableInternalAnalytics = this.analyticsKit.enableInternalAnalytics(z11, cVar);
        return objEnableInternalAnalytics == a.COROUTINE_SUSPENDED ? objEnableInternalAnalytics : Unit.f26487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r7.process((zendesk.analyticskit.android.model.AnalyticsEvent) r8, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object process(@org.jetbrains.annotations.NotNull zendesk.messaging.android.internal.analytics.AnalyticsEventType r7, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zendesk.messaging.android.internal.analytics.AnalyticsProcessor.C03851
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.messaging.android.internal.analytics.AnalyticsProcessor$process$1 r0 = (zendesk.messaging.android.internal.analytics.AnalyticsProcessor.C03851) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.analytics.AnalyticsProcessor$process$1 r0 = new zendesk.messaging.android.internal.analytics.AnalyticsProcessor$process$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            ba0.g.M(r8)
            goto L79
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L34:
            ba0.g.M(r8)
            goto L6c
        L38:
            java.lang.Object r7 = r0.L$0
            zendesk.messaging.android.internal.analytics.AnalyticsEventType r7 = (zendesk.messaging.android.internal.analytics.AnalyticsEventType) r7
            ba0.g.M(r8)
            goto L50
        L40:
            ba0.g.M(r8)
            zendesk.analyticskit.android.AnalyticsKit r8 = r6.analyticsKit
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.isInternalAnalyticsEnabled(r0)
            if (r8 != r1) goto L50
            goto L78
        L50:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7c
            zendesk.android.messaging.model.MessagingSettings r8 = r6.messagingSettings
            boolean r8 = r8.getShouldTrackInternalAnalyticEvents()
            if (r8 == 0) goto L7c
            r8 = 0
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r8 = r6.createAnalyticsEvent(r7, r0)
            if (r8 != r1) goto L6c
            goto L78
        L6c:
            zendesk.analyticskit.android.model.AnalyticsEvent r8 = (zendesk.analyticskit.android.model.AnalyticsEvent) r8
            zendesk.analyticskit.android.AnalyticsKit r7 = r6.analyticsKit
            r0.label = r3
            java.lang.Object r7 = r7.process(r8, r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        L7c:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.analytics.AnalyticsProcessor.process(zendesk.messaging.android.internal.analytics.AnalyticsEventType, x70.c):java.lang.Object");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor$Companion;", "", "<init>", "()V", "CHANNEL_NAME", "", "CHANNEL", "AUTHENTICATED_USER_TYPE", "ANONYMOUS_USER_TYPE", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
