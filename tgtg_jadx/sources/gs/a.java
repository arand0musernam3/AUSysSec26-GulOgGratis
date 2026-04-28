package gs;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.app.tgtg.model.remote.DailyReminder;
import com.app.tgtg.model.remote.PushNotificationsSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y80.a2;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds.a f20827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f20828c = r.c(null);

    public a(Context context, ds.a aVar) {
        this.f20826a = context;
        this.f20827b = aVar;
    }

    public final boolean a() {
        return NotificationManagerCompat.from(this.f20826a).areNotificationsEnabled();
    }

    public final PushNotificationsSettings b() {
        PushNotificationsSettings pushNotificationsSettings = (PushNotificationsSettings) this.f20828c.getValue();
        PushNotificationsSettings pushNotificationsSettings2 = pushNotificationsSettings == null ? new PushNotificationsSettings(false, false, false, false, new DailyReminder(false, false, false, false, false, false, false, 127, (DefaultConstructorMarker) null), 15, (DefaultConstructorMarker) null) : pushNotificationsSettings;
        DailyReminder dailyReminder = pushNotificationsSettings2.getDailyReminder();
        return PushNotificationsSettings.copy$default(pushNotificationsSettings2, false, false, false, false, dailyReminder != null ? DailyReminder.copy$default(dailyReminder, false, false, false, false, false, false, false, 127, null) : null, 15, null);
    }
}
