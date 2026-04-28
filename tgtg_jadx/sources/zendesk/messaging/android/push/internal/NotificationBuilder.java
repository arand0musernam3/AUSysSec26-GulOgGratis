package zendesk.messaging.android.push.internal;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.e0;
import androidx.core.app.f0;
import androidx.core.app.l0;
import androidx.core.app.s;
import androidx.core.app.y0;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.android.Zendesk;
import zendesk.android.ZendeskCredentials;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.MessagingScreen;
import zendesk.messaging.android.internal.DefaultMessaging;
import zendesk.messaging.android.internal.extension.ZendeskKtxKt;
import zendesk.messaging.android.internal.messagingscreen.MessagingActivityIntentBuilder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010\u000bJ\u001f\u0010#\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b&\u0010\u001aJ\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0010¢\u0006\u0004\b(\u0010\u001aJ\u0015\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0010¢\u0006\u0004\b*\u0010\u001aJ\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/¨\u00061"}, d2 = {"Lzendesk/messaging/android/push/internal/NotificationBuilder;", "", "Landroidx/core/app/s;", "compatBuilder", "Landroid/content/Context;", "context", "<init>", "(Landroidx/core/app/s;Landroid/content/Context;)V", "", "smallIconId", "setSmallIcon", "(I)Lzendesk/messaging/android/push/internal/NotificationBuilder;", "Landroidx/core/app/l0;", "style", "setStyle", "(Landroidx/core/app/l0;)Lzendesk/messaging/android/push/internal/NotificationBuilder;", "", TextBundle.TEXT_ENTRY, "", "received", "Landroidx/core/app/y0;", "person", "setMessagingStyle", "(Ljava/lang/String;JLandroidx/core/app/y0;)Lzendesk/messaging/android/push/internal/NotificationBuilder;", "category", "setCategory", "(Ljava/lang/String;)Lzendesk/messaging/android/push/internal/NotificationBuilder;", "", "autoCancel", "setAutoCancel", "(Z)Lzendesk/messaging/android/push/internal/NotificationBuilder;", "unreadCount", "setUnreadCount", "notificationId", "campaignId", "setOpenProactiveNotificationIntent", "(ILjava/lang/String;)Lzendesk/messaging/android/push/internal/NotificationBuilder;", "conversationId", "setOpenConversationIntent", MessageBundle.TITLE_ENTRY, "setTitle", InAppMessageBase.MESSAGE, "setMessage", "Landroid/app/Notification;", "build", "()Landroid/app/Notification;", "Landroidx/core/app/s;", "Landroid/content/Context;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationBuilder {

    @NotNull
    public static final String PROACTIVE_CAMPAIGN_ID = "CAMPAIGN_ID";

    @NotNull
    public static final String PROACTIVE_NOTIFICATION_ID = "NOTIFICATION_ID";

    @NotNull
    private final s compatBuilder;

    @NotNull
    private final Context context;

    public NotificationBuilder(@NotNull s sVar, @NotNull Context context) {
        sVar.getClass();
        context.getClass();
        this.compatBuilder = sVar;
        this.context = context;
    }

    @NotNull
    public final Notification build() {
        Notification notificationA = this.compatBuilder.a();
        notificationA.getClass();
        return notificationA;
    }

    @NotNull
    public final NotificationBuilder setAutoCancel(boolean autoCancel) {
        this.compatBuilder.c(16, autoCancel);
        return this;
    }

    @NotNull
    public final NotificationBuilder setCategory(@NotNull String category) {
        category.getClass();
        this.compatBuilder.f2677o = category;
        return this;
    }

    @NotNull
    public final NotificationBuilder setMessage(@NotNull String message) {
        message.getClass();
        s sVar = this.compatBuilder;
        sVar.getClass();
        sVar.f2669f = s.b(message);
        return this;
    }

    @NotNull
    public final NotificationBuilder setMessagingStyle(@NotNull String text, long received, @NotNull y0 person) {
        text.getClass();
        person.getClass();
        f0 f0Var = new f0(person);
        e0 e0Var = new e0(text, received, person);
        ArrayList arrayList = f0Var.f2597a;
        arrayList.add(e0Var);
        if (arrayList.size() > 25) {
            arrayList.remove(0);
        }
        setStyle(f0Var);
        return this;
    }

    @NotNull
    public final NotificationBuilder setOpenConversationIntent(@NotNull String conversationId) {
        Intent launchIntentForPackage;
        conversationId.getClass();
        Messaging messaging = Zendesk.INSTANCE.getInstance().getMessaging();
        DefaultMessaging defaultMessaging = messaging instanceof DefaultMessaging ? (DefaultMessaging) messaging : null;
        ZendeskCredentials zendeskCredentials = defaultMessaging != null ? defaultMessaging.credentials : null;
        if (zendeskCredentials == null || (launchIntentForPackage = new MessagingActivityIntentBuilder(this.context, zendeskCredentials, conversationId, new MessagingScreen.Conversation(conversationId, (MessagingScreen.ExitAction) null, 2, (DefaultConstructorMarker) null)).getIntent()) == null) {
            launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
        }
        int i11 = Build.VERSION.SDK_INT > 30 ? 1140850688 : 1073741824;
        if (launchIntentForPackage != null) {
            this.compatBuilder.f2670g = PendingIntent.getActivity(this.context, Objects.hash(conversationId), launchIntentForPackage, i11);
        }
        return this;
    }

    @NotNull
    public final NotificationBuilder setOpenProactiveNotificationIntent(int notificationId, @Nullable String campaignId) {
        Intent launchIntentForPackage;
        DefaultMessaging defaultMessaging = ZendeskKtxKt.defaultMessaging(Zendesk.INSTANCE);
        if (defaultMessaging == null || (launchIntentForPackage = DefaultMessaging.messagingScreenIntent$zendesk_messaging_messaging_android$default(defaultMessaging, this.context, 0, new MessagingScreen.NewConversation((MessagingScreen.ExitAction) null, 1, (DefaultConstructorMarker) null), 2, null)) == null) {
            launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.putExtra(PROACTIVE_NOTIFICATION_ID, notificationId);
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.putExtra(PROACTIVE_CAMPAIGN_ID, campaignId);
        }
        int i11 = Build.VERSION.SDK_INT > 30 ? 1140850688 : 1073741824;
        if (launchIntentForPackage != null) {
            this.compatBuilder.f2670g = PendingIntent.getActivity(this.context, notificationId, launchIntentForPackage, i11);
        }
        return this;
    }

    @NotNull
    public final NotificationBuilder setSmallIcon(int smallIconId) {
        this.compatBuilder.f2687y.icon = smallIconId;
        return this;
    }

    @NotNull
    public final NotificationBuilder setStyle(@Nullable l0 style) {
        this.compatBuilder.e(style);
        return this;
    }

    @NotNull
    public final NotificationBuilder setTitle(@NotNull String title) {
        title.getClass();
        s sVar = this.compatBuilder;
        sVar.getClass();
        sVar.f2668e = s.b(title);
        return this;
    }

    @NotNull
    public final NotificationBuilder setUnreadCount(int unreadCount) {
        this.compatBuilder.f2672i = unreadCount;
        return this;
    }
}
