package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f2610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f2615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AudioAttributes f2616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2619k;
    public final long[] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2621n;

    public k(NotificationChannel notificationChannel) {
        String id2 = notificationChannel.getId();
        int importance = notificationChannel.getImportance();
        this.f2614f = true;
        this.f2615g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f2618j = 0;
        id2.getClass();
        this.f2609a = id2;
        this.f2611c = importance;
        this.f2616h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        this.f2610b = notificationChannel.getName();
        this.f2612d = notificationChannel.getDescription();
        this.f2613e = notificationChannel.getGroup();
        this.f2614f = notificationChannel.canShowBadge();
        this.f2615g = notificationChannel.getSound();
        this.f2616h = notificationChannel.getAudioAttributes();
        this.f2617i = notificationChannel.shouldShowLights();
        this.f2618j = notificationChannel.getLightColor();
        this.f2619k = notificationChannel.shouldVibrate();
        this.l = notificationChannel.getVibrationPattern();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.f2620m = j.c(notificationChannel);
            this.f2621n = j.a(notificationChannel);
        }
        notificationChannel.canBypassDnd();
        notificationChannel.getLockscreenVisibility();
        if (i11 >= 29) {
            f.a(notificationChannel);
        }
        if (i11 >= 30) {
            j.e(notificationChannel);
        }
    }

    public final NotificationChannel a() {
        String str;
        String str2;
        NotificationChannel notificationChannel = new NotificationChannel(this.f2609a, this.f2610b, this.f2611c);
        notificationChannel.setDescription(this.f2612d);
        notificationChannel.setGroup(this.f2613e);
        notificationChannel.setShowBadge(this.f2614f);
        notificationChannel.setSound(this.f2615g, this.f2616h);
        notificationChannel.enableLights(this.f2617i);
        notificationChannel.setLightColor(this.f2618j);
        notificationChannel.setVibrationPattern(this.l);
        notificationChannel.enableVibration(this.f2619k);
        if (Build.VERSION.SDK_INT >= 30 && (str = this.f2620m) != null && (str2 = this.f2621n) != null) {
            j.f(notificationChannel, str, str2);
        }
        return notificationChannel;
    }
}
