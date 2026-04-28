package gv;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.r;
import androidx.core.app.s;
import com.app.tgtg.R;
import com.app.tgtg.feature.deeplink.DeepLinkActivity;
import com.app.tgtg.model.remote.AppSettings;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.services.notifications.NotificationPublisher;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.StringCompanionObject;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.c f20908b;

    public b(Context context, ao.c cVar, NotificationManagerCompat notificationManagerCompat) {
        cVar.getClass();
        this.f20907a = context;
        this.f20908b = cVar;
        String string = context.getString(R.string.system_setting_news_from_tgtg);
        string.getClass();
        NotificationChannel notificationChannel = new NotificationChannel("tgtg_channel", "Too Good To Go", 2);
        notificationChannel.setDescription(string);
        notificationChannel.setShowBadge(true);
        notificationManagerCompat.createNotificationChannel(notificationChannel);
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).createNotificationChannelGroup(new NotificationChannelGroup("tgtg_group", "tgtg"));
    }

    public final void a() {
        Context context = this.f20907a;
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        Intent intent = new Intent(context, (Class<?>) NotificationPublisher.class);
        intent.setPackage(context.getPackageName());
        intent.setAction("com.app.tgtg.LOCAL_NOTIFICATION");
        ((AlarmManager) systemService).cancel(PendingIntent.getBroadcast(context, 0, intent, 201326592));
    }

    public final Notification b(String str, String str2, Order order) {
        Context context = this.f20907a;
        Intent intent = new Intent(context, (Class<?>) DeepLinkActivity.class);
        intent.putExtra("LOCAL_NOTIFICATION", true);
        intent.putExtra("ORDER_ID", order.m429getOrderIdreIZeYA());
        if (order.getInvitationId() != null) {
            intent.putExtra("INVITATION_ID", order.getInvitationId());
        }
        intent.putExtra("FROM_RATING_NOTIFICATION", true);
        intent.setPackage(context.getPackageName());
        intent.setAction("android.intent.action.VIEW");
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        s sVar = new s(context, "tgtg_channel");
        sVar.f2687y.icon = 2131231545;
        r rVar = new r();
        rVar.f2661a = s.b(str + " " + str2);
        sVar.e(rVar);
        sVar.f2669f = s.b(str + " " + str2);
        sVar.f2684v = "tgtg_channel";
        sVar.c(16, true);
        sVar.f2670g = activity;
        Notification notificationA = sVar.a();
        notificationA.getClass();
        notificationA.flags = 16 | notificationA.flags;
        notificationA.defaults |= 1;
        return notificationA;
    }

    public final void c(Notification notification, long j9) {
        Context context = this.f20907a;
        Intent intent = new Intent(context, (Class<?>) NotificationPublisher.class);
        int i11 = NotificationPublisher.f9492d;
        intent.putExtra("notification-id", 1);
        intent.putExtra("notification", notification);
        intent.setAction("com.app.tgtg.LOCAL_NOTIFICATION");
        intent.setPackage(context.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        ((AlarmManager) systemService).set(2, j9, broadcast);
    }

    public final void d(Order order) {
        String string;
        order.getClass();
        Context context = this.f20907a;
        if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
            String str = "00:" + ((Object) 90) + ":00";
            if (str.length() == 0) {
                return;
            }
            ao.c cVar = this.f20908b;
            AppSettings appSettings = cVar.f4197e;
            String purchaseRatingStart = appSettings != null ? appSettings.getPurchaseRatingStart() : null;
            AppSettings appSettings2 = cVar.f4197e;
            String purchaseRatingEnd = appSettings2 != null ? appSettings2.getPurchaseRatingEnd() : null;
            try {
                Calendar calendar = Calendar.getInstance();
                Object objClone = calendar.clone();
                objClone.getClass();
                Calendar calendar2 = (Calendar) objClone;
                purchaseRatingStart.getClass();
                calendar2.set(11, Integer.parseInt(purchaseRatingStart.substring(0, 2)));
                calendar2.set(12, Integer.parseInt(purchaseRatingStart.substring(3, 5)));
                calendar2.set(13, 0);
                Date time = calendar2.getTime();
                Object objClone2 = calendar.clone();
                objClone2.getClass();
                Calendar calendar3 = (Calendar) objClone2;
                purchaseRatingEnd.getClass();
                calendar3.set(11, Integer.parseInt(purchaseRatingEnd.substring(0, 2)));
                calendar3.set(12, Integer.parseInt(purchaseRatingEnd.substring(3, 5)));
                calendar3.set(13, 0);
                Date time2 = calendar3.getTime();
                Object objClone3 = calendar.clone();
                objClone3.getClass();
                Calendar calendar4 = (Calendar) objClone3;
                Date date = new Date();
                date.setTime(System.currentTimeMillis() + simpleDateFormat.parse(str).getTime());
                calendar4.setTime(date);
                Date time3 = calendar4.getTime();
                Date date2 = new Date();
                date2.setTime(simpleDateFormat.parse(str).getTime());
                long time4 = date2.getTime();
                if (time3.before(time) || time3.after(time2)) {
                    Object objClone4 = calendar2.clone();
                    objClone4.getClass();
                    Calendar calendar5 = (Calendar) objClone4;
                    calendar5.add(5, 1);
                    time4 = calendar5.getTime().getTime();
                }
                String string2 = context.getString(R.string.order_rating_notification_description);
                string2.getClass();
                if (order.getStoreName() != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string3 = context.getString(R.string.order_rating_notification_header_with_name);
                    string3.getClass();
                    string = String.format(string3, Arrays.copyOf(new Object[]{order.getStoreName()}, 1));
                } else {
                    string = context.getString(R.string.order_rating_notification_header_no_name);
                    string.getClass();
                }
                c(b(string, string2, order), SystemClock.elapsedRealtime() + time4);
            } catch (Exception unused) {
            }
        }
    }
}
