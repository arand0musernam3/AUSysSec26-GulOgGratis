package com.braze.push;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.Channel;
import com.braze.events.BrazePushEvent;
import com.braze.f1;
import com.braze.g1;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.l;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.UriUtils;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import v0.n;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001sB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u000f\u0010\u0013J\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u000f\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\n*\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\"\u0010!J5\u0010(\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b,\u0010+J)\u0010/\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b/\u00100J\u0017\u0010/\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b/\u0010!J\u0017\u00101\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b7\u00106J\u001f\u00108\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b8\u00106J)\u00109\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b9\u0010:J)\u0010;\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b;\u0010:J\u001f\u0010=\u001a\u00020%2\u0006\u0010<\u001a\u00020-2\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b?\u00106J\u001f\u0010@\u001a\u00020\n2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bB\u00106J\u001f\u0010C\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bC\u00106J\u001f\u0010D\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bD\u00106J\u001f\u0010E\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bE\u00106J\u001f\u0010F\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bF\u00106J\u001f\u0010G\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bG\u00106J\u001f\u0010H\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bH\u00106J\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020%H\u0007¢\u0006\u0004\bJ\u0010KJ#\u0010M\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010L\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bO\u0010\u0013J\u001f\u0010P\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u00020\f2\u0006\u00104\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bV\u00106J\u001f\u0010W\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bW\u0010\u0013J\u0017\u0010X\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bX\u00102J\u001f\u0010Y\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bY\u0010\u0013J#\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010[\u001a\u00020Z2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b]\u0010^J)\u0010a\u001a\u00020`2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\ba\u0010bJ5\u0010e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010d\u001a\u00020c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\be\u0010fJ)\u0010e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010g\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\be\u0010hR\u0014\u0010i\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010jR\u0011\u0010o\u001a\u00020l8G¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0015\u0010r\u001a\u0006\u0012\u0002\b\u00030#8G¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006t"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", InAppMessageBase.EXTRAS, "", "deepLink", "", "useWebView", "", "routeUserWithNotificationOpenedIntent$android_sdk_ui_release", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;Z)V", "routeUserWithNotificationOpenedIntent", "Landroid/content/Intent;", "intent", "handleNotificationOpened", "(Landroid/content/Context;Landroid/content/Intent;)V", "handleNotificationDeleted", "Lcom/braze/events/BrazePushEvent;", "brazePush", "(Landroid/content/Context;Lcom/braze/events/BrazePushEvent;)V", "isBrazePushMessage", "(Landroid/content/Intent;)Z", "isNotificationMessage", "notificationExtras", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "sendPushMessageReceivedBroadcast", "(Landroid/content/Context;Landroid/os/Bundle;Lcom/braze/models/push/BrazeNotificationPayload;)V", "refreshFeatureFlagsIfAppropriate", "(Lcom/braze/models/push/BrazeNotificationPayload;)Z", "refreshBannersIfAppropriate", "Ljava/lang/Class;", "thisClass", "", "notificationId", "durationInMillis", "setNotificationDurationAlarm", "(Landroid/content/Context;Ljava/lang/Class;II)V", "getNotificationId", "(Lcom/braze/models/push/BrazeNotificationPayload;)I", "getNotificationPriority", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "wakeScreenIfAppropriate", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/os/Bundle;)Z", "prefetchBitmapsIfNewlyReceivedStoryPush", "(Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroidx/core/app/s;", "notificationBuilder", "setTitleIfPresent", "(Landroidx/core/app/s;Lcom/braze/models/push/BrazeNotificationPayload;)V", "setContentIfPresent", "setTickerIfPresent", "setContentIntentIfPresent", "(Landroid/content/Context;Landroidx/core/app/s;Landroid/os/Bundle;)V", "setDeleteIntent", "appConfigurationProvider", "setSmallIcon", "(Lcom/braze/configuration/BrazeConfigurationProvider;Landroidx/core/app/s;)I", "setSetShowWhen", "setLargeIconIfPresentAndSupported", "(Landroidx/core/app/s;Lcom/braze/models/push/BrazeNotificationPayload;)Z", "setSoundIfPresentAndSupported", "setSummaryTextIfPresentAndSupported", "setPriorityIfPresentAndSupported", "setAccentColorIfPresentAndSupported", "setCategoryIfPresentAndSupported", "setVisibilityIfPresentAndSupported", "setPublicVersionIfPresentAndSupported", "visibility", "isValidNotificationVisibility", "(I)Z", "customContentString", "logBaiduNotificationClick", "(Landroid/content/Context;Ljava/lang/String;)V", "handleCancelNotificationAction", "cancelNotification", "(Landroid/content/Context;I)V", "isUninstallTrackingPush", "(Landroid/os/Bundle;)Z", "getOrCreateNotificationChannelId", "(Lcom/braze/models/push/BrazeNotificationPayload;)Ljava/lang/String;", "setNotificationBadgeNumberIfPresent", "handlePushStoryPageClicked", "handleContentCardsSerializedCardIfPresent", "sendNotificationOpenedBroadcast", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/NotificationChannel;", "getValidNotificationChannel", "(Landroid/app/NotificationManager;Landroid/os/Bundle;)Landroid/app/NotificationChannel;", "action", "Landroid/app/PendingIntent;", "getPushActionPendingIntent", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/app/PendingIntent;", "Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "broadcastType", "sendPushActionIntent", "(Landroid/content/Context;Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;Landroid/os/Bundle;Lcom/braze/models/push/BrazeNotificationPayload;)V", "pushIntent", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "TAG", "Ljava/lang/String;", "SOURCE_KEY", "Lcom/braze/IBrazeNotificationFactory;", "getActiveNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "activeNotificationFactory", "getNotificationReceiverClass", "()Ljava/lang/Class;", "notificationReceiverClass", "BrazeNotificationBroadcastType", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrazeNotificationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeNotificationUtils.kt\ncom/braze/push/BrazeNotificationUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,1110:1\n1#2:1111\n1#2:1122\n1611#3,9:1112\n1863#3:1121\n1864#3:1123\n1620#3:1124\n1863#3,2:1125\n29#4:1127\n*S KotlinDebug\n*F\n+ 1 BrazeNotificationUtils.kt\ncom/braze/push/BrazeNotificationUtils\n*L\n445#1:1122\n445#1:1112,9\n445#1:1121\n445#1:1123\n445#1:1124\n446#1:1125,2\n616#1:1127\n*E\n"})
public final class BrazeNotificationUtils {

    @NotNull
    private static final String SOURCE_KEY = "source";

    @NotNull
    public static final BrazeNotificationUtils INSTANCE = new BrazeNotificationUtils();

    @NotNull
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeNotificationUtils.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "", "brazePushEventType", "Lcom/braze/enums/BrazePushEventType;", "<init>", "(Ljava/lang/String;ILcom/braze/enums/BrazePushEventType;)V", "getBrazePushEventType", "()Lcom/braze/enums/BrazePushEventType;", "OPENED", "RECEIVED", "DELETED", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BrazeNotificationBroadcastType {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ BrazeNotificationBroadcastType[] $VALUES;

        @NotNull
        private final BrazePushEventType brazePushEventType;
        public static final BrazeNotificationBroadcastType OPENED = new BrazeNotificationBroadcastType("OPENED", 0, BrazePushEventType.NOTIFICATION_OPENED);
        public static final BrazeNotificationBroadcastType RECEIVED = new BrazeNotificationBroadcastType("RECEIVED", 1, BrazePushEventType.NOTIFICATION_RECEIVED);
        public static final BrazeNotificationBroadcastType DELETED = new BrazeNotificationBroadcastType("DELETED", 2, BrazePushEventType.NOTIFICATION_DELETED);

        private static final /* synthetic */ BrazeNotificationBroadcastType[] $values() {
            return new BrazeNotificationBroadcastType[]{OPENED, RECEIVED, DELETED};
        }

        static {
            BrazeNotificationBroadcastType[] brazeNotificationBroadcastTypeArr$values = $values();
            $VALUES = brazeNotificationBroadcastTypeArr$values;
            $ENTRIES = n.w(brazeNotificationBroadcastTypeArr$values);
        }

        private BrazeNotificationBroadcastType(String str, int i11, BrazePushEventType brazePushEventType) {
            this.brazePushEventType = brazePushEventType;
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static BrazeNotificationBroadcastType valueOf(String str) {
            return (BrazeNotificationBroadcastType) Enum.valueOf(BrazeNotificationBroadcastType.class, str);
        }

        public static BrazeNotificationBroadcastType[] values() {
            return (BrazeNotificationBroadcastType[]) $VALUES.clone();
        }

        @NotNull
        public final BrazePushEventType getBrazePushEventType() {
            return this.brazePushEventType;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeNotificationBroadcastType.values().length];
            try {
                iArr[BrazeNotificationBroadcastType.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BrazeNotificationUtils() {
    }

    public static final void cancelNotification(@NotNull Context context, int notificationId) {
        context.getClass();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l(notificationId, 4), 7, (Object) null);
            Intent intent = new Intent(Constants.BRAZE_CANCEL_NOTIFICATION_ACTION).setClass(context, getNotificationReceiverClass());
            intent.getClass();
            intent.setPackage(context.getPackageName());
            intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, notificationId);
            IntentUtils.addComponentAndSendBroadcast(context, intent);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new i(6), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$63(int i11) {
        return s.f(i11, "Cancelling notification action with id: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$64() {
        return "Exception occurred attempting to cancel notification.";
    }

    @NotNull
    public static final IBrazeNotificationFactory getActiveNotificationFactory() {
        IBrazeNotificationFactory customBrazeNotificationFactory = Braze.INSTANCE.getCustomBrazeNotificationFactory();
        return customBrazeNotificationFactory == null ? BrazeNotificationFactory.INSTANCE.getInstance() : customBrazeNotificationFactory;
    }

    public static final int getNotificationId(@NotNull BrazeNotificationPayload payload) {
        payload.getClass();
        Integer customNotificationId = payload.getCustomNotificationId();
        if (customNotificationId != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f(customNotificationId, 0), 7, (Object) null);
            return customNotificationId.intValue();
        }
        String titleText = payload.getTitleText();
        if (titleText == null) {
            titleText = "";
        }
        String contentText = payload.getContentText();
        if (contentText != null) {
            titleText = ((Object) titleText) + contentText;
        }
        int iHashCode = titleText.hashCode();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l(iHashCode, 2), 7, (Object) null);
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$16(Integer num) {
        return "Using notification id provided in the message's extras bundle: " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$19(int i11) {
        return s.f(i11, "Message without notification id provided in the extras bundle received. Using a hash of the message: ");
    }

    public static final int getNotificationPriority(@NotNull BrazeNotificationPayload payload) {
        payload.getClass();
        Integer notificationPriorityInt = payload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = payload.getNotificationPriorityInt();
        if (notificationPriorityInt2 == null) {
            return 0;
        }
        int iIntValue = notificationPriorityInt2.intValue();
        if (-2 <= iIntValue && iIntValue < 3) {
            return iIntValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new f(notificationPriorityInt, 1), 6, (Object) null);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationPriority$lambda$21$lambda$20(Integer num) {
        return "Received invalid notification priority " + num;
    }

    @NotNull
    public static final Class<?> getNotificationReceiverClass() {
        return Constants.isAmazonDevice() ? BrazeAmazonDeviceMessagingReceiver.class : BrazePushReceiver.class;
    }

    @NotNull
    public static final String getOrCreateNotificationChannelId(@NotNull BrazeNotificationPayload payload) {
        payload.getClass();
        String notificationChannelId = payload.getNotificationChannelId();
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        Object systemService = context != null ? context.getSystemService("notification") : null;
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationChannelId != null) {
            if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(notificationChannelId, 18), 7, (Object) null);
                return notificationChannelId;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(notificationChannelId, 19), 7, (Object) null);
        }
        if (notificationManager.getNotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(21), 7, (Object) null);
            NotificationChannel notificationChannel = new NotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID, configurationProvider != null ? configurationProvider.getDefaultNotificationChannelName() : null, 3);
            notificationChannel.setDescription(configurationProvider != null ? configurationProvider.getDefaultNotificationChannelDescription() : null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$66(String str) {
        return e0.f.k("Found notification channel in extras with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$67(String str) {
        return e0.f.k("Notification channel from extras is invalid. No channel found with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$68() {
        return "Braze default notification channel does not exist on device. Creating default channel.";
    }

    private final PendingIntent getPushActionPendingIntent(Context context, String action, Bundle notificationExtras) {
        Intent intent = new Intent(action).setClass(context, NotificationTrampolineActivity.class);
        intent.getClass();
        if (notificationExtras != null) {
            intent.putExtras(notificationExtras);
        }
        PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
        activity.getClass();
        return activity;
    }

    @TargetApi(26)
    @Nullable
    public static final NotificationChannel getValidNotificationChannel(@NotNull NotificationManager notificationManager, @Nullable Bundle notificationExtras) {
        notificationManager.getClass();
        if (notificationExtras == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(14), 7, (Object) null);
            return null;
        }
        String string = notificationExtras.getString(Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY, null);
        if (string != null && !StringsKt.H(string)) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string);
            if (notificationChannel != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(string, 14), 7, (Object) null);
                return notificationChannel;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(string, 15), 7, (Object) null);
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID);
        if (notificationChannel2 != null) {
            return notificationChannel2;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(15), 7, (Object) null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$74() {
        return "Notification extras bundle was null. Could not find a valid notification channel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$75(String str) {
        return e0.f.k("Found notification channel in extras with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$76(String str) {
        return e0.f.k("Notification channel from extras is invalid, no channel found with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$77() {
        return "Braze default notification channel does not exist on device.";
    }

    public static final void handleCancelNotificationAction(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            if (intent.hasExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID)) {
                int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l(intExtra, 5), 7, (Object) null);
                Object systemService = context.getSystemService("notification");
                systemService.getClass();
                ((NotificationManager) systemService).cancel(Constants.BRAZE_PUSH_NOTIFICATION_TAG, intExtra);
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new i(19), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$61(int i11) {
        return s.f(i11, "Cancelling notification action with id: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$62() {
        return "Exception occurred handling cancel notification intent.";
    }

    public static final void handleContentCardsSerializedCardIfPresent(@NotNull BrazeNotificationPayload payload) {
        payload.getClass();
        String contentCardSyncData = payload.getContentCardSyncData();
        String contentCardSyncUserId = payload.getContentCardSyncUserId();
        Context context = payload.getContext();
        if (contentCardSyncData == null || context == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f1(contentCardSyncUserId, contentCardSyncData, 6), 7, (Object) null);
        BrazeInternal.addSerializedContentCardToStorage(context, contentCardSyncData, contentCardSyncUserId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleContentCardsSerializedCardIfPresent$lambda$72(String str, String str2) {
        return s.k("Push contains associated Content Cards card. User id: ", str, " Card data: ", str2);
    }

    public static final void handleNotificationDeleted(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(28), 7, (Object) null);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.DELETED, extras, null, 8, null);
                return;
            }
            brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.DELETED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new e(29), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$2() {
        return "Sending notification deleted broadcast";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$3() {
        return "Exception occurred attempting to handle notification delete intent.";
    }

    public static final void handleNotificationOpened(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            Braze.INSTANCE.getInstance(context).logPushNotificationOpened(intent);
            sendNotificationOpenedBroadcast(context, intent);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new i(1), 6, (Object) null);
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new i(2), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$0() {
        return "Not handling deep links automatically, skipping deep link handling";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$1() {
        return "Exception occurred attempting to handle notification opened intent.";
    }

    public static final void handlePushStoryPageClicked(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            Braze.INSTANCE.getInstance(context).logPushStoryPageClicked(intent.getStringExtra(Constants.BRAZE_CAMPAIGN_ID), intent.getStringExtra(Constants.BRAZE_STORY_PAGE_ID));
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, 0);
            if (configurationProvider.getDoesPushStoryDismissOnClick() && intExtra != 0) {
                cancelNotification(context, intExtra);
            }
            String stringExtra = intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY);
            if (stringExtra == null || StringsKt.H(stringExtra)) {
                intent.removeExtra("uri");
            } else {
                intent.putExtra("uri", intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY));
                String stringExtra2 = intent.getStringExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY);
                if (stringExtra2 != null && !StringsKt.H(stringExtra2)) {
                    intent.putExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, stringExtra2);
                }
            }
            sendNotificationOpenedBroadcast(context, intent);
            if (configurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new a(stringExtra, 16), 6, (Object) null);
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new e(19), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$70(String str) {
        return a0.p("Not handling deep links automatically, skipping deep link handling for '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$71() {
        return "Caught exception while handling story click.";
    }

    public static final boolean isBrazePushMessage(@NotNull Intent intent) {
        intent.getClass();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return "true".equalsIgnoreCase(extras.getString(Constants.BRAZE_PUSH_BRAZE_KEY));
    }

    public static final boolean isNotificationMessage(@NotNull Intent intent) {
        intent.getClass();
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey(Constants.BRAZE_PUSH_TITLE_KEY) && extras.containsKey(Constants.BRAZE_PUSH_CONTENT_KEY);
    }

    public static final boolean isUninstallTrackingPush(@NotNull Bundle notificationExtras) {
        notificationExtras.getClass();
        try {
            if (notificationExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY)) {
                return true;
            }
            Bundle bundle = notificationExtras.getBundle(Constants.BRAZE_PUSH_EXTRAS_KEY);
            if (bundle != null) {
                return bundle.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY);
            }
            return false;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new e(18), 4, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isUninstallTrackingPush$lambda$65() {
        return "Failed to determine if push is uninstall tracking. Returning false.";
    }

    public static final boolean isValidNotificationVisibility(int visibility) {
        return visibility == -1 || visibility == 0 || visibility == 1;
    }

    public static final void logBaiduNotificationClick(@Nullable Context context, @Nullable String customContentString) {
        if (customContentString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e(10), 6, (Object) null);
            return;
        }
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e(11), 6, (Object) null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(customContentString);
            String optionalString = JsonUtils.getOptionalString(jSONObject, SOURCE_KEY);
            String optionalString2 = JsonUtils.getOptionalString(jSONObject, Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            if (optionalString == null || !Intrinsics.areEqual(optionalString, Constants.BRAZE) || optionalString2 == null) {
                return;
            }
            Braze.INSTANCE.getInstance(context).logPushNotificationOpened(optionalString2);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new a(customContentString, 12), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBaiduNotificationClick$lambda$58() {
        return "customContentString was null. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBaiduNotificationClick$lambda$59() {
        return "Cannot log baidu click with null context. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBaiduNotificationClick$lambda$60(String str) {
        return e0.f.k("Caught an exception processing customContentString: ", str);
    }

    public static final void prefetchBitmapsIfNewlyReceivedStoryPush(@NotNull BrazeNotificationPayload payload) {
        payload.getClass();
        Context context = payload.getContext();
        if (context != null && payload.getIsPushStory() && payload.getIsNewlyReceivedPushStory()) {
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            ArrayList<String> arrayList = new ArrayList();
            Iterator<T> it = pushStoryPages.iterator();
            while (it.hasNext()) {
                String bitmapUrl = ((BrazeNotificationPayload.PushStoryPage) it.next()).getBitmapUrl();
                if (bitmapUrl != null) {
                    arrayList.add(bitmapUrl);
                }
            }
            for (String str : arrayList) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new a(str, 17), 6, (Object) null);
                Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getBrazeExtras(), str, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            }
            payload.setNewlyReceivedPushStory(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prefetchBitmapsIfNewlyReceivedStoryPush$lambda$29$lambda$28(String str) {
        return e0.f.k("Pre-fetching bitmap at URL: ", str);
    }

    public static final boolean refreshBannersIfAppropriate(@NotNull BrazeNotificationPayload payload) {
        payload.getClass();
        Context context = payload.getContext();
        if (!payload.getShouldRefreshBanners() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new e(22), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(21), 7, (Object) null);
        BrazeInternal.refreshBanners(context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$13() {
        return "Banners refresh key was true. Refreshing Banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$14() {
        return "Banners refresh key not included in push payload or false. Not refreshing banners.";
    }

    public static final boolean refreshFeatureFlagsIfAppropriate(@NotNull BrazeNotificationPayload payload) {
        payload.getClass();
        Context context = payload.getContext();
        if (!payload.getShouldRefreshFeatureFlags() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new e(13), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(12), 7, (Object) null);
        BrazeInternal.refreshFeatureFlags(context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$11() {
        return "Feature flag refresh key was true. Refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$12() {
        return "Feature flag refresh key not included in push payload or false. Not refreshing feature flags.";
    }

    public static final void routeUserWithNotificationOpenedIntent(@NotNull Context context, @NotNull BrazePushEvent brazePush) {
        context.getClass();
        brazePush.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(20), 7, (Object) null);
        Bundle brazeExtras = brazePush.getNotificationPayload().getBrazeExtras();
        brazeExtras.putString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, brazePush.getNotificationPayload().getCampaignId());
        brazeExtras.putString(SOURCE_KEY, Constants.BRAZE);
        String deeplink = brazePush.getNotificationPayload().getDeeplink();
        Boolean useWebView = brazePush.getNotificationPayload().getUseWebView();
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent$android_sdk_ui_release(context, brazeExtras, deeplink, useWebView != null ? useWebView.booleanValue() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$4() {
        return "routeUserWithNotificationOpenedIntent called with Intent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$5() {
        return "routeUserWithNotificationOpenedIntent called with BrazePushEvent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$6(String str) {
        return a0.p("Delayed initialization is enabled. Deep link:", str, " will not be handled.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$7(Intent intent) {
        return "Push notification had no deep link. Opening main activity:" + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$8(String str, boolean z11) {
        return "Found a deep link:" + str + ". Use webview set to:" + z11;
    }

    public static final void sendNotificationOpenedBroadcast(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(6), 7, (Object) null);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.OPENED, extras, null, 8, null);
            return;
        }
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.OPENED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendNotificationOpenedBroadcast$lambda$73() {
        return "Sending notification opened broadcast";
    }

    private final void sendPushActionIntent(Context context, BrazeNotificationBroadcastType broadcastType, Bundle notificationExtras, BrazeNotificationPayload payload) {
        Intent intent;
        int i11 = WhenMappings.$EnumSwitchMapping$0[broadcastType.ordinal()];
        if (i11 == 1) {
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_OPENED).setPackage(context.getPackageName());
            intent.getClass();
        } else if (i11 == 2) {
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED).setPackage(context.getPackageName());
            intent.getClass();
        } else if (i11 != 3) {
            e40.a.f();
            return;
        } else {
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_DELETED).setPackage(context.getPackageName());
            intent.getClass();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new h(broadcastType, 0), 6, (Object) null);
        sendPushActionIntent(context, intent, notificationExtras);
        if (payload != null) {
            BrazeInternal.INSTANCE.publishBrazePushAction(context, broadcastType.getBrazePushEventType(), payload);
        }
    }

    public static /* synthetic */ void sendPushActionIntent$default(BrazeNotificationUtils brazeNotificationUtils, Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            brazeNotificationPayload = null;
        }
        brazeNotificationUtils.sendPushActionIntent(context, brazeNotificationBroadcastType, bundle, brazeNotificationPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$78(BrazeNotificationBroadcastType brazeNotificationBroadcastType) {
        return "Sending Braze broadcast receiver intent for " + brazeNotificationBroadcastType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$79(Intent intent) {
        return "Sending push action intent: " + intent;
    }

    public static final void sendPushMessageReceivedBroadcast(@NotNull Context context, @NotNull Bundle notificationExtras, @NotNull BrazeNotificationPayload payload) {
        context.getClass();
        notificationExtras.getClass();
        payload.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(24), 7, (Object) null);
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.RECEIVED, notificationExtras, payload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushMessageReceivedBroadcast$lambda$10() {
        return "Sending push message received broadcast";
    }

    public static final void setAccentColorIfPresentAndSupported(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        Integer accentColor = payload.getAccentColor();
        if (accentColor != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(7), 7, (Object) null);
            notificationBuilder.f2679q = accentColor.intValue();
            return;
        }
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (configurationProvider != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(8), 7, (Object) null);
            notificationBuilder.f2679q = configurationProvider.getDefaultNotificationAccentColor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$50() {
        return "Using accent color for notification from extras bundle";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$52$lambda$51() {
        return "Using default accent color for notification";
    }

    public static final void setCategoryIfPresentAndSupported(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        String notificationCategory = payload.getNotificationCategory();
        if (notificationCategory == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(26), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(25), 7, (Object) null);
            notificationBuilder.f2677o = notificationCategory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$53() {
        return "Setting category for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$54() {
        return "Category not present in notification extras. Not setting category for notification.";
    }

    public static final void setContentIfPresent(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        notificationBuilder.getClass();
        payload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(23), 7, (Object) null);
        String contentText = payload.getContentText();
        if (contentText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.f2669f = androidx.core.app.s.b(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIfPresent$lambda$31() {
        return "Setting content for notification";
    }

    public static final void setContentIntentIfPresent(@NotNull Context context, @NotNull androidx.core.app.s notificationBuilder, @Nullable Bundle notificationExtras) {
        context.getClass();
        notificationBuilder.getClass();
        try {
            notificationBuilder.f2670g = INSTANCE.getPushActionPendingIntent(context, Constants.BRAZE_PUSH_CLICKED_ACTION, notificationExtras);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new i(9), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIntentIfPresent$lambda$33() {
        return "Error setting content intent.";
    }

    public static final void setDeleteIntent(@NotNull Context context, @NotNull androidx.core.app.s notificationBuilder, @Nullable Bundle notificationExtras) {
        context.getClass();
        notificationBuilder.getClass();
        try {
            Intent intent = new Intent(Constants.BRAZE_PUSH_DELETED_ACTION).setClass(context, getNotificationReceiverClass());
            intent.getClass();
            if (notificationExtras != null) {
                intent.putExtras(notificationExtras);
            }
            notificationBuilder.f2687y.deleteIntent = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new e(5), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDeleteIntent$lambda$34() {
        return "Error setting delete intent.";
    }

    public static final boolean setLargeIconIfPresentAndSupported(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        BrazeLogger brazeLogger;
        BrazeNotificationUtils brazeNotificationUtils;
        String largeIcon;
        notificationBuilder.getClass();
        payload.getClass();
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(13), 7, (Object) null);
            return false;
        }
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            brazeLogger = BrazeLogger.INSTANCE;
            brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(14), 7, (Object) null);
            largeIcon = payload.getLargeIcon();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new i(17), 4, (Object) null);
        }
        if (largeIcon != null) {
            notificationBuilder.d(Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, null, largeIcon, BrazeViewBounds.NOTIFICATION_LARGE_ICON));
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(15), 7, (Object) null);
        int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
        if (largeNotificationIconResourceId != 0) {
            notificationBuilder.d(BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId));
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(16), 7, (Object) null);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(18), 7, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$38() {
        return "Large icon not supported in story push.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$39() {
        return "Setting large icon for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$41() {
        return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$42() {
        return "Large icon resource id not present for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$43() {
        return "Error setting large notification icon";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$44() {
        return "Large icon not set for notification";
    }

    public static final void setNotificationBadgeNumberIfPresent(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        Integer notificationBadgeNumber = payload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            notificationBuilder.f2672i = notificationBadgeNumber.intValue();
        }
    }

    private static final String setNotificationBadgeNumberIfPresent$lambda$69() {
        return "Notification badge number not supported on this android version. Not setting badge number for notification.";
    }

    public static final void setNotificationDurationAlarm(@NotNull Context context, @Nullable Class<?> thisClass, int notificationId, int durationInMillis) {
        context.getClass();
        Intent intent = new Intent(context, thisClass);
        intent.setAction(Constants.BRAZE_CANCEL_NOTIFICATION_ACTION);
        intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, notificationId);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728 | IntentUtils.getImmutablePendingIntentFlags());
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        AlarmManager alarmManager = (AlarmManager) systemService;
        if (durationInMillis >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l(durationInMillis, 3), 7, (Object) null);
            alarmManager.set(3, SystemClock.elapsedRealtime() + ((long) durationInMillis), broadcast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setNotificationDurationAlarm$lambda$15(int i11) {
        return r8.k.h(i11, "Setting Notification duration alarm for ", " ms");
    }

    public static final void setPriorityIfPresentAndSupported(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(23), 7, (Object) null);
        notificationBuilder.f2673j = getNotificationPriority(payload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPriorityIfPresentAndSupported$lambda$49() {
        return "Setting priority for notification";
    }

    public static final void setPublicVersionIfPresentAndSupported(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (context == null || payload.getPublicNotificationExtras() == null || configurationProvider == null) {
            return;
        }
        String orCreateNotificationChannelId = getOrCreateNotificationChannelId(payload);
        Bundle jsonObjectIntoBundle = JsonUtils.parseJsonObjectIntoBundle(payload.getPublicNotificationExtras());
        if (jsonObjectIntoBundle.isEmpty()) {
            return;
        }
        BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(jsonObjectIntoBundle, null, context, configurationProvider, 2, null);
        androidx.core.app.s sVar = new androidx.core.app.s(context, orCreateNotificationChannelId);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(brazeNotificationPayload, 1), 7, (Object) null);
        setContentIfPresent(sVar, brazeNotificationPayload);
        setTitleIfPresent(sVar, brazeNotificationPayload);
        setSummaryTextIfPresentAndSupported(sVar, brazeNotificationPayload);
        setSmallIcon(configurationProvider, sVar);
        setAccentColorIfPresentAndSupported(sVar, brazeNotificationPayload);
        notificationBuilder.f2681s = sVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPublicVersionIfPresentAndSupported$lambda$57(BrazeNotificationPayload brazeNotificationPayload) {
        return "Setting public version of notification with payload: " + brazeNotificationPayload;
    }

    public static final void setSetShowWhen(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(9), 7, (Object) null);
            notificationBuilder.f2674k = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSetShowWhen$lambda$37() {
        return "Set show when not supported in story push.";
    }

    public static final int setSmallIcon(@NotNull BrazeConfigurationProvider appConfigurationProvider, @NotNull androidx.core.app.s notificationBuilder) {
        appConfigurationProvider.getClass();
        notificationBuilder.getClass();
        int smallNotificationIconResourceId = appConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(7), 7, (Object) null);
            smallNotificationIconResourceId = appConfigurationProvider.getApplicationIconResourceId();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(8), 7, (Object) null);
        }
        notificationBuilder.f2687y.icon = smallNotificationIconResourceId;
        return smallNotificationIconResourceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$35() {
        return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$36() {
        return "Setting small icon for notification via resource id";
    }

    public static final void setSoundIfPresentAndSupported(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        Notification notification = notificationBuilder.f2687y;
        payload.getClass();
        String notificationSound = payload.getNotificationSound();
        if (notificationSound == null) {
            return;
        }
        if (Intrinsics.areEqual(notificationSound, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(16), 7, (Object) null);
            notification.defaults = 1;
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(17), 7, (Object) null);
            notification.sound = Uri.parse(notificationSound);
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$45() {
        return "Setting default sound for notification.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$46() {
        return "Setting sound for notification via uri.";
    }

    public static final void setSummaryTextIfPresentAndSupported(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        String summaryText = payload.getSummaryText();
        if (summaryText == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(5), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(4), 7, (Object) null);
        notificationBuilder.getClass();
        notificationBuilder.f2675m = androidx.core.app.s.b(summaryText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$47() {
        return "Setting summary text for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$48() {
        return "Summary text not present. Not setting summary text for notification.";
    }

    public static final void setTickerIfPresent(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(0), 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null) {
            return;
        }
        notificationBuilder.f2687y.tickerText = androidx.core.app.s.b(titleText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTickerIfPresent$lambda$32() {
        return "Setting ticker for notification";
    }

    public static final void setTitleIfPresent(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        notificationBuilder.getClass();
        payload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(10), 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.f2668e = androidx.core.app.s.b(HtmlUtils.getHtmlSpannedTextIfEnabled(titleText, configurationProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTitleIfPresent$lambda$30() {
        return "Setting title for notification";
    }

    public static final void setVisibilityIfPresentAndSupported(@NotNull androidx.core.app.s notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        Integer notificationVisibility = payload.getNotificationVisibility();
        if (notificationVisibility != null) {
            if (!isValidNotificationVisibility(notificationVisibility.intValue())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new f(notificationVisibility, 2), 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(27), 7, (Object) null);
                notificationBuilder.f2680r = notificationVisibility.intValue();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$55() {
        return "Setting visibility for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$56(Integer num) {
        return "Received invalid notification visibility " + num;
    }

    @SuppressLint({"WakelockTimeout"})
    public static final boolean wakeScreenIfAppropriate(@NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        payload.getClass();
        Context context = payload.getContext();
        if (context != null && (configurationProvider = payload.getConfigurationProvider()) != null) {
            Bundle notificationExtras = payload.getNotificationExtras();
            if (PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK") && configurationProvider.isPushWakeScreenForNotificationEnabled()) {
                try {
                    Object systemService = context.getSystemService("uimode");
                    systemService.getClass();
                    if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(3), 7, (Object) null);
                        return false;
                    }
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new i(12), 4, (Object) null);
                }
                Object systemService2 = context.getSystemService("notification");
                systemService2.getClass();
                NotificationChannel validNotificationChannel = getValidNotificationChannel((NotificationManager) systemService2, notificationExtras);
                if (validNotificationChannel == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(20), 7, (Object) null);
                    return false;
                }
                if (validNotificationChannel.getImportance() == 1) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h(validNotificationChannel, 4), 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(22), 7, (Object) null);
                Object systemService3 = context.getSystemService("power");
                systemService3.getClass();
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService3).newWakeLock(268435482, TAG);
                wakeLockNewWakeLock.acquire();
                wakeLockNewWakeLock.release();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$22() {
        return "Not waking this TV UI mode device";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$23() {
        return "Failed to check for TV status during screen wake. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$24() {
        return "Not waking screen on Android O+ device, could not find notification channel.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$25(NotificationChannel notificationChannel) {
        return s.f(notificationChannel.getImportance(), "Not acquiring wake-lock for Android O+ notification with importance: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$26() {
        return "Waking screen for notification";
    }

    public final void routeUserWithNotificationOpenedIntent$android_sdk_ui_release(@NotNull Context context, @NotNull Bundle extras, @Nullable String deepLink, boolean useWebView) {
        context.getClass();
        extras.getClass();
        Braze.Companion companion = Braze.INSTANCE;
        if (companion.isDelayedInitializationEnabled() || deepLink == null || StringsKt.H(deepLink)) {
            Intent mainActivityIntent = UriUtils.getMainActivityIntent(context, extras);
            context.startActivity(mainActivityIntent);
            if (companion.isDelayedInitializationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(deepLink, 13), 7, (Object) null);
                return;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g(0, mainActivityIntent), 7, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g1(deepLink, useWebView, 2), 7, (Object) null);
        extras.putString("uri", deepLink);
        extras.putBoolean(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, useWebView);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.INSTANCE;
        UriAction uriActionCreateUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(deepLink, extras, useWebView, Channel.PUSH);
        if (uriActionCreateUriActionFromUrlString != null) {
            companion2.getInstance().gotoUri(context, uriActionCreateUriActionFromUrlString);
        }
    }

    public static final void routeUserWithNotificationOpenedIntent(@NotNull Context context, @NotNull Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(11), 7, (Object) null);
        Bundle bundleExtra = intent.getBundleExtra(Constants.BRAZE_PUSH_EXTRAS_KEY);
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY));
        bundleExtra.putString(SOURCE_KEY, Constants.BRAZE);
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent$android_sdk_ui_release(context, bundleExtra, intent.getStringExtra("uri"), "true".equalsIgnoreCase(intent.getStringExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY)));
    }

    private final void sendPushActionIntent(Context context, Intent pushIntent, Bundle notificationExtras) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new g(1, pushIntent), 6, (Object) null);
        if (notificationExtras != null) {
            pushIntent.putExtras(notificationExtras);
        }
        IntentUtils.addComponentAndSendBroadcast(context, pushIntent);
    }

    public static final boolean wakeScreenIfAppropriate(@NotNull Context context, @NotNull BrazeConfigurationProvider configurationProvider, @Nullable Bundle notificationExtras) {
        context.getClass();
        configurationProvider.getClass();
        return wakeScreenIfAppropriate(new BrazeNotificationPayload(notificationExtras, null, context, configurationProvider, 2, null));
    }
}
