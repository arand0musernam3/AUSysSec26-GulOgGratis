package zendesk.messaging.android.push;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.s;
import ba0.g;
import com.braze.h2;
import e0.f;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.p0;
import x70.c;
import y80.a2;
import y80.f1;
import y80.j;
import y80.r;
import z70.e;
import z70.i;
import zendesk.logger.Logger;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.MessagingBuildConfig;
import zendesk.messaging.android.internal.VisibleScreen;
import zendesk.messaging.android.internal.VisibleScreenTracker;
import zendesk.messaging.android.push.internal.NotificationBuilder;
import zendesk.messaging.android.push.internal.NotificationDisplayedState;
import zendesk.messaging.android.push.internal.NotificationProcessor;
import zendesk.messaging.android.push.internal.NotificationProcessorFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u00062\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0006H\u0000¢\u0006\u0004\b!\u0010\u0003R\u0014\u0010#\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010$R\u0014\u0010(\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010$R\u0014\u0010)\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010$R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\t018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000204018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R(\u00106\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u0010\u0003\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0=8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u0002040=8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010?¨\u0006B"}, d2 = {"Lzendesk/messaging/android/push/PushNotifications;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "initialize", "(Landroid/content/Context;)V", "", "channelName", "Landroid/app/NotificationChannel;", "buildChannel", "(Ljava/lang/String;)Landroid/app/NotificationChannel;", "", "messageData", "", "validatePushIntegration", "(Landroid/content/Context;Ljava/util/Map;)Z", "pushNotificationToken", "updatePushNotificationToken", "(Ljava/lang/String;)V", "Lzendesk/messaging/android/push/PushResponsibility;", "shouldBeDisplayed", "(Ljava/util/Map;)Lzendesk/messaging/android/push/PushResponsibility;", "displayNotification", "(Landroid/content/Context;Ljava/util/Map;)V", "", "smallIconId", "setNotificationSmallIconId", "(Ljava/lang/Integer;)V", "resetNotificationDisplayedState$zendesk_messaging_messaging_android", "resetNotificationDisplayedState", "reset$zendesk_messaging_messaging_android", "reset", "LOG_TAG", "Ljava/lang/String;", "NOTIFICATION_KEY", PushNotifications.MESSAGING_NOTIFICATION_CHANNEL_ID, "CONVERSATION_ID_KEY", "INTEGRATION_ID_KEY", "INTEGRATION_ID_DATA_KEY", "CONVERSATION_KIT_STORAGE", "Lzendesk/messaging/android/push/internal/NotificationProcessor;", "notificationProcessor", "Lzendesk/messaging/android/push/internal/NotificationProcessor;", "Lv80/b0;", "coroutineScope", "Lv80/b0;", "Ly80/f1;", "mutablePushNotificationToken", "Ly80/f1;", "Lzendesk/messaging/android/push/internal/NotificationDisplayedState;", "mutableNotificationDisplayed", "smallNotificationIconId", "I", "getSmallNotificationIconId$zendesk_messaging_messaging_android", "()I", "setSmallNotificationIconId$zendesk_messaging_messaging_android", "(I)V", "getSmallNotificationIconId$zendesk_messaging_messaging_android$annotations", "Ly80/i;", "getPushNotificationToken$zendesk_messaging_messaging_android", "()Ly80/i;", "getNotificationDisplayed$zendesk_messaging_messaging_android", "notificationDisplayed", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPushNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushNotifications.kt\nzendesk/messaging/android/push/PushNotifications\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,287:1\n17#2:288\n19#2:292\n46#3:289\n51#3:291\n105#4:290\n230#5,5:293\n*S KotlinDebug\n*F\n+ 1 PushNotifications.kt\nzendesk/messaging/android/push/PushNotifications\n*L\n59#1:288\n59#1:292\n59#1:289\n59#1:291\n59#1:290\n78#1:293,5\n*E\n"})
public final class PushNotifications {

    @NotNull
    private static final String CONVERSATION_ID_KEY = "conversationId";

    @NotNull
    private static final String CONVERSATION_KIT_STORAGE = "zendesk.conversationkit";

    @NotNull
    private static final String INTEGRATION_ID_DATA_KEY = "INTEGRATION_ID";

    @NotNull
    private static final String INTEGRATION_ID_KEY = "integrationId";

    @NotNull
    private static final String LOG_TAG = "PushNotifications";

    @NotNull
    private static final String MESSAGING_NOTIFICATION_CHANNEL_ID = "MESSAGING_NOTIFICATION_CHANNEL_ID";

    @NotNull
    private static final String NOTIFICATION_KEY = "smoochNotification";

    @Nullable
    private static NotificationProcessor notificationProcessor;

    @NotNull
    public static final PushNotifications INSTANCE = new PushNotifications();

    @NotNull
    private static final b0 coroutineScope = f0.b(p0.f42144a.plus(f0.d()));

    @NotNull
    private static final f1 mutablePushNotificationToken = r.c("");

    @NotNull
    private static final f1 mutableNotificationDisplayed = r.c(NotificationDisplayedState.Idle.INSTANCE);
    private static int smallNotificationIconId = R.drawable.zma_default_notification_icon;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PushResponsibility.values().length];
            try {
                iArr[PushResponsibility.NOT_FROM_MESSAGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PushResponsibility.MESSAGING_SHOULD_NOT_DISPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PushResponsibility.MESSAGING_SHOULD_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.push.PushNotifications$displayNotification$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.push.PushNotifications$displayNotification$1", f = "PushNotifications.kt", l = {254}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nPushNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushNotifications.kt\nzendesk/messaging/android/push/PushNotifications$displayNotification$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,287:1\n230#2,5:288\n*S KotlinDebug\n*F\n+ 1 PushNotifications.kt\nzendesk/messaging/android/push/PushNotifications$displayNotification$1\n*L\n263#1:288,5\n*E\n"})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Map<String, String> $messageData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Map<String, String> map, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$context = context;
            this.$messageData = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(String str, double d3) {
            a2 a2Var;
            Object value;
            f1 f1Var = PushNotifications.mutableNotificationDisplayed;
            do {
                a2Var = (a2) f1Var;
                value = a2Var.getValue();
            } while (!a2Var.g(value, new NotificationDisplayedState.Displayed(str, d3)));
            return Unit.f26487a;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$context, this.$messageData, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                NotificationProcessor notificationProcessor = PushNotifications.notificationProcessor;
                if (notificationProcessor != null) {
                    Context context = this.$context;
                    Map<String, String> map = this.$messageData;
                    NotificationBuilder notificationBuilder = new NotificationBuilder(new s(this.$context, PushNotifications.MESSAGING_NOTIFICATION_CHANNEL_ID), this.$context);
                    int smallNotificationIconId$zendesk_messaging_messaging_android = PushNotifications.INSTANCE.getSmallNotificationIconId$zendesk_messaging_messaging_android();
                    a aVar2 = new a();
                    this.label = 1;
                    if (notificationProcessor.displayPushNotification(context, map, notificationBuilder, smallNotificationIconId$zendesk_messaging_messaging_android, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    Logger.w(PushNotifications.LOG_TAG, "Cannot display notification because internal push setup has not completed", new Object[0]);
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    private PushNotifications() {
    }

    private final NotificationChannel buildChannel(String channelName) {
        NotificationChannel notificationChannel = new NotificationChannel(MESSAGING_NOTIFICATION_CHANNEL_ID, channelName, 4);
        notificationChannel.enableVibration(true);
        notificationChannel.enableLights(true);
        return notificationChannel;
    }

    public static final void displayNotification(@NotNull Context context, @NotNull Map<String, String> messageData) {
        context.getClass();
        messageData.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[shouldBeDisplayed(messageData).ordinal()];
        if (i11 == 1) {
            Logger.w(LOG_TAG, "Cannot display notification because it doesn't belong to Messaging", new Object[0]);
        } else if (i11 != 2 && i11 != 3) {
            e40.a.f();
        } else {
            INSTANCE.initialize(context);
            f0.B(coroutineScope, null, null, new AnonymousClass1(context, messageData, null), 3);
        }
    }

    private final void initialize(Context context) {
        if (MessagingBuildConfig.INSTANCE.atLeastAndroid26()) {
            Object systemService = context.getSystemService("notification");
            NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
            if (notificationManager != null) {
                String string = context.getString(R.string.zma_notification_channel_name);
                string.getClass();
                notificationManager.createNotificationChannel(buildChannel(string));
            }
        }
        notificationProcessor = NotificationProcessorFactory.INSTANCE.create();
    }

    public static final void setNotificationSmallIconId(@Nullable Integer smallIconId) {
        smallNotificationIconId = smallIconId != null ? smallIconId.intValue() : R.drawable.zma_default_notification_icon;
    }

    @NotNull
    public static final PushResponsibility shouldBeDisplayed(@NotNull Map<String, String> messageData) {
        messageData.getClass();
        if (!Boolean.parseBoolean(messageData.get(NOTIFICATION_KEY))) {
            return PushResponsibility.NOT_FROM_MESSAGING;
        }
        VisibleScreenTracker visibleScreenTracker = VisibleScreenTracker.INSTANCE;
        Set<VisibleScreen> visibleScreens$zendesk_messaging_messaging_android = visibleScreenTracker.getVisibleScreens$zendesk_messaging_messaging_android();
        String str = messageData.get("conversationId");
        if (visibleScreens$zendesk_messaging_messaging_android.contains(VisibleScreen.ConversationListScreen.INSTANCE)) {
            return PushResponsibility.MESSAGING_SHOULD_NOT_DISPLAY;
        }
        Boolean boolValueOf = str != null ? Boolean.valueOf(visibleScreenTracker.isConversationVisibleOnScreen$zendesk_messaging_messaging_android(str)) : null;
        if (str == null || !Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            return PushResponsibility.MESSAGING_SHOULD_DISPLAY;
        }
        Logger.d(LOG_TAG, "Notification received from Messaging but shouldn't be displayed as the Conversation Screen is displayed.", new Object[0]);
        return PushResponsibility.MESSAGING_SHOULD_NOT_DISPLAY;
    }

    public static final void updatePushNotificationToken(@NotNull String pushNotificationToken) {
        pushNotificationToken.getClass();
        ((a2) mutablePushNotificationToken).j(pushNotificationToken);
    }

    public static final boolean validatePushIntegration(@NotNull Context context, @NotNull Map<String, String> messageData) {
        context.getClass();
        messageData.getClass();
        String str = messageData.get(INTEGRATION_ID_KEY);
        Logger.d(LOG_TAG, f.k("Push Integration ID: ", str), new Object[0]);
        SharedPreferences sharedPreferences = context.getSharedPreferences(CONVERSATION_KIT_STORAGE, 0);
        String string = sharedPreferences.contains(INTEGRATION_ID_DATA_KEY) ? sharedPreferences.getString(INTEGRATION_ID_DATA_KEY, null) : "";
        Logger.d(LOG_TAG, f.k("Cached Integration ID: ", string), new Object[0]);
        if (Intrinsics.areEqual(string, str)) {
            return true;
        }
        Logger.d(LOG_TAG, "Notification received from Messaging but shouldn't be displayed as the cached cached integration id is different from the push integration id.", new Object[0]);
        return false;
    }

    @NotNull
    public final y80.i getNotificationDisplayed$zendesk_messaging_messaging_android() {
        return mutableNotificationDisplayed;
    }

    @NotNull
    public final y80.i getPushNotificationToken$zendesk_messaging_messaging_android() {
        final f1 f1Var = mutablePushNotificationToken;
        return new y80.i() { // from class: zendesk.messaging.android.push.PushNotifications$special$$inlined$filter$1

            /* JADX INFO: renamed from: zendesk.messaging.android.push.PushNotifications$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PushNotifications.kt\nzendesk/messaging/android/push/PushNotifications\n*L\n1#1,49:1\n18#2:50\n19#2:52\n59#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* JADX INFO: renamed from: zendesk.messaging.android.push.PushNotifications$special$$inlined$filter$1$2$1, reason: invalid class name */
                @e(c = "zendesk.messaging.android.push.PushNotifications$special$$inlined$filter$1$2", f = "PushNotifications.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class AnonymousClass1 extends z70.c {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(j jVar) {
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
                        boolean r0 = r6 instanceof zendesk.messaging.android.push.PushNotifications$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        zendesk.messaging.android.push.PushNotifications$special$$inlined$filter$1$2$1 r0 = (zendesk.messaging.android.push.PushNotifications$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        zendesk.messaging.android.push.PushNotifications$special$$inlined$filter$1$2$1 r0 = new zendesk.messaging.android.push.PushNotifications$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        y70.a r1 = y70.a.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2e
                        if (r2 != r3) goto L27
                        ba0.g.M(r6)
                        goto L45
                    L27:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        com.braze.h2.b(r5)
                        r5 = 0
                        return r5
                    L2e:
                        ba0.g.M(r6)
                        y80.j r6 = r4.$this_unsafeFlow
                        r2 = r5
                        java.lang.String r2 = (java.lang.String) r2
                        int r2 = r2.length()
                        if (r2 <= 0) goto L45
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        kotlin.Unit r5 = kotlin.Unit.f26487a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.push.PushNotifications$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                }
            }

            @Override // y80.i
            public Object collect(j jVar, c cVar) {
                Object objCollect = f1Var.collect(new AnonymousClass2(jVar), cVar);
                return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
            }
        };
    }

    public final int getSmallNotificationIconId$zendesk_messaging_messaging_android() {
        return smallNotificationIconId;
    }

    public final void reset$zendesk_messaging_messaging_android() {
        smallNotificationIconId = R.drawable.zma_default_notification_icon;
        notificationProcessor = null;
    }

    public final void resetNotificationDisplayedState$zendesk_messaging_messaging_android() {
        a2 a2Var;
        Object value;
        f1 f1Var = mutableNotificationDisplayed;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, NotificationDisplayedState.Idle.INSTANCE));
    }

    public final void setSmallNotificationIconId$zendesk_messaging_messaging_android(int i11) {
        smallNotificationIconId = i11;
    }

    public static /* synthetic */ void getSmallNotificationIconId$zendesk_messaging_messaging_android$annotations() {
    }
}
