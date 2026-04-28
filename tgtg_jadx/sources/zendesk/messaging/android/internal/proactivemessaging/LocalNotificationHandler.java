package zendesk.messaging.android.internal.proactivemessaging;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.o0;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.MessagingBuildConfig;
import zendesk.messaging.android.push.internal.NotificationBuilder;
import zendesk.messaging.android.push.internal.NotificationProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J4\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u001eJ\u0006\u0010\u001f\u001a\u00020\u0019J\u0017\u0010 \u001a\u00020\u00192\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lzendesk/messaging/android/internal/proactivemessaging/LocalNotificationHandler;", "", "notificationProcessor", "Lzendesk/messaging/android/push/internal/NotificationProcessor;", "context", "Landroid/content/Context;", "<init>", "(Lzendesk/messaging/android/push/internal/NotificationProcessor;Landroid/content/Context;)V", "smallNotificationIconId", "", "getSmallNotificationIconId", "()I", "setSmallNotificationIconId", "(I)V", "notificationManager", "Landroid/app/NotificationManager;", "localNotificationsIds", "", "getLocalNotificationsIds", "()Ljava/util/List;", "buildChannel", "Landroid/app/NotificationChannel;", "channelName", "", "displayLocalNotification", "", "id", MessageBundle.TITLE_ENTRY, "body", "intentData", "", "clearLocalNotifications", "setLocalNotificationSmallIconId", "smallIconId", "(Ljava/lang/Integer;)V", "areNotificationsEnabled", "", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalNotificationHandler {

    @NotNull
    private static final String channelName = "Proactive Messages";

    @NotNull
    private static final String proactiveMessageNotificationChannelId = "PROACTIVE_MESSAGING_NOTIFICATION_CHANNEL_ID";

    @NotNull
    private final Context context;

    @NotNull
    private final List<Integer> localNotificationsIds;

    @Nullable
    private NotificationManager notificationManager;

    @NotNull
    private final NotificationProcessor notificationProcessor;
    private int smallNotificationIconId;

    public LocalNotificationHandler(@NotNull NotificationProcessor notificationProcessor, @NotNull Context context) {
        NotificationManager notificationManager;
        notificationProcessor.getClass();
        context.getClass();
        this.notificationProcessor = notificationProcessor;
        this.context = context;
        this.smallNotificationIconId = R.drawable.zma_default_notification_icon;
        Object systemService = context.getSystemService("notification");
        this.notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        this.localNotificationsIds = new ArrayList();
        if (!MessagingBuildConfig.INSTANCE.atLeastAndroid26() || (notificationManager = this.notificationManager) == null) {
            return;
        }
        notificationManager.createNotificationChannel(buildChannel(channelName));
    }

    private final NotificationChannel buildChannel(String channelName2) {
        NotificationChannel notificationChannel = new NotificationChannel(proactiveMessageNotificationChannelId, channelName2, 4);
        notificationChannel.enableVibration(true);
        notificationChannel.enableLights(true);
        return notificationChannel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void displayLocalNotification$default(LocalNotificationHandler localNotificationHandler, int i11, String str, String str2, Map map, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            map = o0.f26530a;
            map.getClass();
        }
        localNotificationHandler.displayLocalNotification(i11, str, str2, map);
    }

    public final boolean areNotificationsEnabled() {
        return NotificationManagerCompat.from(this.context).areNotificationsEnabled();
    }

    public final void clearLocalNotifications() {
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
        this.localNotificationsIds.clear();
    }

    public final void displayLocalNotification(int id2, @NotNull String title, @NotNull String body, @NotNull Map<String, String> intentData) {
        title.getClass();
        body.getClass();
        intentData.getClass();
        this.localNotificationsIds.add(Integer.valueOf(id2));
        this.notificationProcessor.displayLocalNotification(this.context, id2, title, body, new NotificationBuilder(new s(this.context, proactiveMessageNotificationChannelId), this.context), this.smallNotificationIconId, intentData);
    }

    @NotNull
    public final List<Integer> getLocalNotificationsIds() {
        return this.localNotificationsIds;
    }

    public final int getSmallNotificationIconId() {
        return this.smallNotificationIconId;
    }

    public final void setLocalNotificationSmallIconId(@Nullable Integer smallIconId) {
        this.smallNotificationIconId = smallIconId != null ? smallIconId.intValue() : R.drawable.zma_default_notification_icon;
    }

    public final void setSmallNotificationIconId(int i11) {
        this.smallNotificationIconId = i11;
    }
}
