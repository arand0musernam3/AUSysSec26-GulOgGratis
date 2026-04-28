package zendesk.android.internal;

import com.app.tgtg.model.local.AppConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.f0;
import z70.c;
import z70.e;
import zendesk.android.ZendeskAuthenticationDelegate;
import zendesk.android.events.ZendeskEvent;
import zendesk.android.internal.di.ZendeskComponent;
import zendesk.android.messaging.MessagingFactory;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.messaging.android.internal.di.MessagingComponentKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ@\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b!\u0010\"J8\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lzendesk/android/internal/ZendeskFactory;", "", "<init>", "()V", "Lzendesk/android/settings/internal/model/SettingsDto;", "settings", "Lzendesk/android/messaging/MessagingFactory;", "messagingFactory", "Lzendesk/android/internal/di/ZendeskComponent;", "zendeskComponent", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "featureFlagManager", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "", "restoreSession", "Lzendesk/android/messaging/Messaging;", "initialiseNativeMessaging", "(Lzendesk/android/settings/internal/model/SettingsDto;Lzendesk/android/messaging/MessagingFactory;Lzendesk/android/internal/di/ZendeskComponent;Lzendesk/conversationkit/android/ConversationKit;Lzendesk/core/android/internal/app/FeatureFlagManager;Lzendesk/android/messaging/model/MessagingSettings;ZLx70/c;)Ljava/lang/Object;", "Lzendesk/android/settings/internal/model/SunCoConfigDto;", "sunCoConfigDto", "", "integrationId", "initialiseConversationKit", "(Lzendesk/android/settings/internal/model/SunCoConfigDto;Ljava/lang/String;Lzendesk/android/internal/di/ZendeskComponent;Lx70/c;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_LIGHT_COLORS, MessagingComponentKt.USER_DARK_COLORS, "Lzendesk/android/internal/usercolors/UserColorsSchemePersistence;", "resolveUserColors", "(Landroid/content/Context;Ljava/lang/String;Lzendesk/android/messaging/model/UserColors;Lzendesk/android/messaging/model/UserColors;ZLx70/c;)Ljava/lang/Object;", "Lzendesk/android/ZendeskResult;", "Lzendesk/android/Zendesk;", "", "create", "(Lzendesk/android/internal/di/ZendeskComponent;Lzendesk/android/messaging/MessagingFactory;ZLx70/c;)Ljava/lang/Object;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZendeskFactory {

    @NotNull
    public static final ZendeskFactory INSTANCE = new ZendeskFactory();

    /* JADX INFO: renamed from: zendesk.android.internal.ZendeskFactory$create$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.ZendeskFactory", f = "ZendeskFactory.kt", l = {48, 58, 89}, m = "create")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
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
            return ZendeskFactory.this.create(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.ZendeskFactory$initialiseConversationKit$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.ZendeskFactory", f = "ZendeskFactory.kt", l = {171}, m = "initialiseConversationKit")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01901 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01901(x70.c<? super C01901> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ZendeskFactory.this.initialiseConversationKit(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.ZendeskFactory$initialiseNativeMessaging$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.ZendeskFactory", f = "ZendeskFactory.kt", l = {AppConstants.RESULT_CODE_FLASH_SALES_SURVEY}, m = "initialiseNativeMessaging")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01911 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C01911(x70.c<? super C01911> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ZendeskFactory.this.initialiseNativeMessaging(null, null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.ZendeskFactory$resolveUserColors$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.ZendeskFactory", f = "ZendeskFactory.kt", l = {216, 218, AppConstants.GPS_SETTINGS}, m = "resolveUserColors")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01921 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01921(x70.c<? super C01921> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ZendeskFactory.this.resolveUserColors(null, null, null, null, false, this);
        }
    }

    private ZendeskFactory() {
    }

    public static /* synthetic */ Object create$default(ZendeskFactory zendeskFactory, ZendeskComponent zendeskComponent, MessagingFactory messagingFactory, boolean z11, x70.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            messagingFactory = null;
        }
        return zendeskFactory.create(zendeskComponent, messagingFactory, z11, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$0(ZendeskAuthenticationDelegate zendeskAuthenticationDelegate, Throwable th2, Function1 function1) {
        function1.getClass();
        zendeskAuthenticationDelegate.onInvalidAuth(th2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initialiseConversationKit(zendesk.android.settings.internal.model.SunCoConfigDto r9, java.lang.String r10, zendesk.android.internal.di.ZendeskComponent r11, x70.c<? super zendesk.conversationkit.android.ConversationKit> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof zendesk.android.internal.ZendeskFactory.C01901
            if (r0 == 0) goto L14
            r0 = r12
            zendesk.android.internal.ZendeskFactory$initialiseConversationKit$1 r0 = (zendesk.android.internal.ZendeskFactory.C01901) r0
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
            zendesk.android.internal.ZendeskFactory$initialiseConversationKit$1 r0 = new zendesk.android.internal.ZendeskFactory$initialiseConversationKit$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r9 = r7.L$0
            r11 = r9
            zendesk.android.internal.di.ZendeskComponent r11 = (zendesk.android.internal.di.ZendeskComponent) r11
            ba0.g.M(r12)
            goto L5d
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L35:
            ba0.g.M(r12)
            zendesk.android.internal.ConversationKitProvider r1 = zendesk.android.internal.ConversationKitProvider.INSTANCE
            zendesk.android.internal.di.ZendeskComponentConfig r12 = r11.componentData()
            java.lang.String r12 = r12.getBaseUrl()
            zendesk.conversationkit.android.model.Config r9 = r1.toConversationKitConfig$zendesk_zendesk_android(r9, r12)
            android.content.Context r4 = r11.context()
            v80.b0 r6 = r11.mainScope()
            r7.L$0 = r11
            r7.label = r2
            java.lang.String r5 = "1.36.0"
            r2 = r9
            r3 = r10
            java.lang.Object r12 = r1.createConversationKit$zendesk_zendesk_android(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L5d
            return r0
        L5d:
            zendesk.conversationkit.android.ConversationKit r12 = (zendesk.conversationkit.android.ConversationKit) r12
            ib0.a r9 = new ib0.a
            r10 = 1
            r9.<init>(r11, r10)
            r12.addEventListener(r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.ZendeskFactory.initialiseConversationKit(zendesk.android.settings.internal.model.SunCoConfigDto, java.lang.String, zendesk.android.internal.di.ZendeskComponent, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialiseConversationKit$lambda$2(ZendeskComponent zendeskComponent, ConversationKitEvent conversationKitEvent) {
        conversationKitEvent.getClass();
        if (conversationKitEvent instanceof ConversationKitEvent.UserAccessRevoked) {
            f0.B(zendeskComponent.mainScope(), null, null, new ZendeskFactory$initialiseConversationKit$2$1(conversationKitEvent, zendeskComponent, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initialiseNativeMessaging(zendesk.android.settings.internal.model.SettingsDto r24, zendesk.android.messaging.MessagingFactory r25, zendesk.android.internal.di.ZendeskComponent r26, zendesk.conversationkit.android.ConversationKit r27, zendesk.core.android.internal.app.FeatureFlagManager r28, zendesk.android.messaging.model.MessagingSettings r29, boolean r30, x70.c<? super zendesk.android.messaging.Messaging> r31) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.ZendeskFactory.initialiseNativeMessaging(zendesk.android.settings.internal.model.SettingsDto, zendesk.android.messaging.MessagingFactory, zendesk.android.internal.di.ZendeskComponent, zendesk.conversationkit.android.ConversationKit, zendesk.core.android.internal.app.FeatureFlagManager, zendesk.android.messaging.model.MessagingSettings, boolean, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialiseNativeMessaging$lambda$1(ZendeskComponent zendeskComponent, ZendeskEvent zendeskEvent) {
        zendeskEvent.getClass();
        f0.B(zendeskComponent.mainScope(), null, null, new ZendeskFactory$initialiseNativeMessaging$messaging$1$1(zendeskComponent, zendeskEvent, null), 3);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveUserColors(android.content.Context r7, java.lang.String r8, zendesk.android.messaging.model.UserColors r9, zendesk.android.messaging.model.UserColors r10, boolean r11, x70.c<? super zendesk.android.internal.usercolors.UserColorsSchemePersistence> r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof zendesk.android.internal.ZendeskFactory.C01921
            if (r0 == 0) goto L13
            r0 = r12
            zendesk.android.internal.ZendeskFactory$resolveUserColors$1 r0 = (zendesk.android.internal.ZendeskFactory.C01921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.android.internal.ZendeskFactory$resolveUserColors$1 r0 = new zendesk.android.internal.ZendeskFactory$resolveUserColors$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            ba0.g.M(r12)
            return r12
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L34:
            java.lang.Object r7 = r0.L$0
            zendesk.android.internal.usercolors.UserColorsRepository r7 = (zendesk.android.internal.usercolors.UserColorsRepository) r7
            ba0.g.M(r12)
            goto L6a
        L3c:
            ba0.g.M(r12)
            return r12
        L40:
            ba0.g.M(r12)
            zendesk.android.internal.usercolors.UserColorsStorage r12 = new zendesk.android.internal.usercolors.UserColorsStorage
            zendesk.android.internal.usercolors.UserColorsStorage$StorageProvider r2 = zendesk.android.internal.usercolors.UserColorsStorage.StorageProvider.INSTANCE
            zendesk.storage.android.Storage r7 = r2.createStorage(r7, r8)
            r12.<init>(r7)
            zendesk.android.internal.usercolors.UserColorsRepository r7 = new zendesk.android.internal.usercolors.UserColorsRepository
            r7.<init>(r12)
            if (r11 == 0) goto L5f
            r0.label = r5
            java.lang.Object r7 = r7.getUserColors(r0)
            if (r7 != r1) goto L5e
            goto L75
        L5e:
            return r7
        L5f:
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r7.updateUserColors(r9, r10, r0)
            if (r8 != r1) goto L6a
            goto L75
        L6a:
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = r7.getUserColors(r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.ZendeskFactory.resolveUserColors(android.content.Context, java.lang.String, zendesk.android.messaging.model.UserColors, zendesk.android.messaging.model.UserColors, boolean, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:15:0x003f, B:54:0x0177, B:22:0x0060, B:46:0x00f9, B:48:0x0103, B:50:0x0114, B:49:0x010e, B:25:0x0074, B:32:0x0098, B:34:0x009e, B:36:0x00aa, B:38:0x00ae, B:40:0x00c9, B:42:0x00d3, B:56:0x0194, B:58:0x019c, B:59:0x01a1, B:28:0x007d), top: B:65:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:15:0x003f, B:54:0x0177, B:22:0x0060, B:46:0x00f9, B:48:0x0103, B:50:0x0114, B:49:0x010e, B:25:0x0074, B:32:0x0098, B:34:0x009e, B:36:0x00aa, B:38:0x00ae, B:40:0x00c9, B:42:0x00d3, B:56:0x0194, B:58:0x019c, B:59:0x01a1, B:28:0x007d), top: B:65:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object create(@org.jetbrains.annotations.NotNull zendesk.android.internal.di.ZendeskComponent r27, @org.jetbrains.annotations.Nullable zendesk.android.messaging.MessagingFactory r28, boolean r29, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.android.ZendeskResult<zendesk.android.Zendesk, ? extends java.lang.Throwable>> r30) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.ZendeskFactory.create(zendesk.android.internal.di.ZendeskComponent, zendesk.android.messaging.MessagingFactory, boolean, x70.c):java.lang.Object");
    }
}
