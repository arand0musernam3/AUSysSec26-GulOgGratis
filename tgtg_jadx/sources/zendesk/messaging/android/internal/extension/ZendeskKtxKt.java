package zendesk.messaging.android.internal.extension;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;
import zendesk.android.Zendesk;
import zendesk.android.ZendeskCredentials;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.MessagingFactory;
import zendesk.messaging.android.DefaultMessagingFactory;
import zendesk.messaging.android.internal.DefaultMessaging;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.di.MessagingComponent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzendesk/android/Zendesk$Companion;", "Landroid/content/Context;", "context", "Lzendesk/android/ZendeskCredentials;", "credentials", "Lzendesk/android/messaging/MessagingFactory;", "messagingFactory", "Lzendesk/android/ZendeskResult;", "Lzendesk/android/messaging/Messaging;", "", AnalyticsProcessor.CHANNEL, "(Lzendesk/android/Zendesk$Companion;Landroid/content/Context;Lzendesk/android/ZendeskCredentials;Lzendesk/android/messaging/MessagingFactory;Lx70/c;)Ljava/lang/Object;", "Lzendesk/messaging/android/internal/DefaultMessaging;", "defaultMessaging", "(Lzendesk/android/Zendesk$Companion;)Lzendesk/messaging/android/internal/DefaultMessaging;", "Lzendesk/messaging/android/internal/di/MessagingComponent;", "messagingComponent", "(Lzendesk/android/Zendesk$Companion;)Lzendesk/messaging/android/internal/di/MessagingComponent;", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ZendeskKtxKt {

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.extension.ZendeskKtxKt$messaging$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.extension.ZendeskKtxKt", f = "ZendeskKtx.kt", l = {29}, m = AnalyticsProcessor.CHANNEL)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
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
            return ZendeskKtxKt.messaging(null, null, null, null, this);
        }
    }

    @Nullable
    public static final DefaultMessaging defaultMessaging(@NotNull Zendesk.Companion companion) {
        companion.getClass();
        Messaging messaging = companion.getInstance().getMessaging();
        if (messaging instanceof DefaultMessaging) {
            return (DefaultMessaging) messaging;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object messaging(@org.jetbrains.annotations.NotNull zendesk.android.Zendesk.Companion r7, @org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull zendesk.android.ZendeskCredentials r9, @org.jetbrains.annotations.NotNull zendesk.android.messaging.MessagingFactory r10, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.android.ZendeskResult<? extends zendesk.android.messaging.Messaging, ? extends java.lang.Throwable>> r11) {
        /*
            boolean r0 = r11 instanceof zendesk.messaging.android.internal.extension.ZendeskKtxKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r11
            zendesk.messaging.android.internal.extension.ZendeskKtxKt$messaging$1 r0 = (zendesk.messaging.android.internal.extension.ZendeskKtxKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            zendesk.messaging.android.internal.extension.ZendeskKtxKt$messaging$1 r0 = new zendesk.messaging.android.internal.extension.ZendeskKtxKt$messaging$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            ba0.g.M(r11)
            goto L44
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L30:
            ba0.g.M(r11)
            java.lang.String r3 = r9.getChannelKey()
            r6.label = r2
            r5 = 1
            r1 = r7
            r2 = r8
            r4 = r10
            java.lang.Object r11 = r1.initialize(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L44
            return r0
        L44:
            zendesk.android.ZendeskResult r11 = (zendesk.android.ZendeskResult) r11
            boolean r7 = r11 instanceof zendesk.android.ZendeskResult.Failure
            if (r7 == 0) goto L5d
            zendesk.android.ZendeskResult$Failure r7 = new zendesk.android.ZendeskResult$Failure
            zendesk.android.internal.ZendeskError$FailedToInitialize r8 = new zendesk.android.internal.ZendeskError$FailedToInitialize
            zendesk.android.ZendeskResult$Failure r11 = (zendesk.android.ZendeskResult.Failure) r11
            java.lang.Object r9 = r11.getError()
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.<init>(r9)
            r7.<init>(r8)
            return r7
        L5d:
            boolean r7 = r11 instanceof zendesk.android.ZendeskResult.Success
            if (r7 == 0) goto L73
            zendesk.android.ZendeskResult$Success r7 = new zendesk.android.ZendeskResult$Success
            zendesk.android.ZendeskResult$Success r11 = (zendesk.android.ZendeskResult.Success) r11
            java.lang.Object r8 = r11.getValue()
            zendesk.android.Zendesk r8 = (zendesk.android.Zendesk) r8
            zendesk.android.messaging.Messaging r8 = r8.getMessaging()
            r7.<init>(r8)
            return r7
        L73:
            e40.a.f()
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.extension.ZendeskKtxKt.messaging(zendesk.android.Zendesk$Companion, android.content.Context, zendesk.android.ZendeskCredentials, zendesk.android.messaging.MessagingFactory, x70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object messaging$default(Zendesk.Companion companion, Context context, ZendeskCredentials zendeskCredentials, MessagingFactory messagingFactory, x70.c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            messagingFactory = new DefaultMessagingFactory(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        return messaging(companion, context, zendeskCredentials, messagingFactory, cVar);
    }

    @Nullable
    public static final MessagingComponent messagingComponent(@NotNull Zendesk.Companion companion) {
        companion.getClass();
        DefaultMessaging defaultMessaging = defaultMessaging(companion);
        if (defaultMessaging != null) {
            return defaultMessaging.getMessagingComponent();
        }
        return null;
    }
}
