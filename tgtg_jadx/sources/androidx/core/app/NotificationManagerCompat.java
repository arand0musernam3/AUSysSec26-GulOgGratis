package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners;
    private static t0 sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                try {
                    if (!string.equals(sEnabledNotificationListeners)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        sEnabledNotificationListenerPackages = hashSet;
                        sEnabledNotificationListeners = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(u0 u0Var) {
        synchronized (sLock) {
            try {
                if (sSideChannelManager == null) {
                    sSideChannelManager = new t0(this.mContext.getApplicationContext());
                }
                sSideChannelManager.f2695b.obtainMessage(0, u0Var).sendToTarget();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle bundle = notification.extras;
        return bundle != null && bundle.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean areNotificationsEnabled() {
        return this.mNotificationManager.areNotificationsEnabled();
    }

    public boolean canPostPromotedNotifications() {
        if (Build.VERSION.SDK_INT >= 36) {
            return n0.a(this.mNotificationManager);
        }
        return false;
    }

    public boolean canUseFullScreenIntent() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29) {
            return true;
        }
        return i11 < 34 ? this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0 : p0.a(this.mNotificationManager);
    }

    public void cancel(String str, int i11) {
        this.mNotificationManager.cancel(str, i11);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(k kVar) {
        createNotificationChannel(kVar.a());
    }

    public void createNotificationChannelGroup(m mVar) {
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(mVar.f2630a, mVar.f2631b);
        if (Build.VERSION.SDK_INT >= 28) {
            l.f(notificationChannelGroup, mVar.f2632c);
        }
        createNotificationChannelGroup(notificationChannelGroup);
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        this.mNotificationManager.createNotificationChannelGroups(list);
    }

    public void createNotificationChannelGroupsCompat(List<m> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (m mVar : list) {
            NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(mVar.f2630a, mVar.f2631b);
            if (Build.VERSION.SDK_INT >= 28) {
                l.f(notificationChannelGroup, mVar.f2632c);
            }
            arrayList.add(notificationChannelGroup);
        }
        this.mNotificationManager.createNotificationChannelGroups(arrayList);
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        this.mNotificationManager.createNotificationChannels(list);
    }

    public void createNotificationChannelsCompat(List<k> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        this.mNotificationManager.createNotificationChannels(arrayList);
    }

    public void deleteNotificationChannel(String str) {
        this.mNotificationManager.deleteNotificationChannel(str);
    }

    public void deleteNotificationChannelGroup(String str) {
        this.mNotificationManager.deleteNotificationChannelGroup(str);
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        for (NotificationChannel notificationChannel : this.mNotificationManager.getNotificationChannels()) {
            if (!collection.contains(notificationChannel.getId()) && (Build.VERSION.SDK_INT < 30 || !collection.contains(j.d(notificationChannel)))) {
                this.mNotificationManager.deleteNotificationChannel(notificationChannel.getId());
            }
        }
    }

    public List<StatusBarNotification> getActiveNotifications() {
        StatusBarNotification[] activeNotifications = this.mNotificationManager.getActiveNotifications();
        return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
    }

    public int getCurrentInterruptionFilter() {
        return this.mNotificationManager.getCurrentInterruptionFilter();
    }

    public int getImportance() {
        return this.mNotificationManager.getImportance();
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        return Build.VERSION.SDK_INT >= 30 ? j.b(this.mNotificationManager, str, str2) : getNotificationChannel(str);
    }

    public k getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel = getNotificationChannel(str);
        if (notificationChannel != null) {
            return new k(notificationChannel);
        }
        return null;
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return l.d(this.mNotificationManager, str);
        }
        for (NotificationChannelGroup notificationChannelGroup : getNotificationChannelGroups()) {
            if (notificationChannelGroup.getId().equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    public m getNotificationChannelGroupCompat(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            NotificationChannelGroup notificationChannelGroup = getNotificationChannelGroup(str);
            if (notificationChannelGroup != null) {
                return new m(notificationChannelGroup);
            }
            return null;
        }
        NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
        if (notificationChannelGroup2 != null) {
            return new m(notificationChannelGroup2, getNotificationChannels());
        }
        return null;
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return this.mNotificationManager.getNotificationChannelGroups();
    }

    public List<m> getNotificationChannelGroupsCompat() {
        List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
        if (notificationChannelGroups.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List<NotificationChannel> notificationChannels = Build.VERSION.SDK_INT >= 28 ? Collections.EMPTY_LIST : getNotificationChannels();
        ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
        for (NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add(new m(notificationChannelGroup));
            } else {
                arrayList.add(new m(notificationChannelGroup, notificationChannels));
            }
        }
        return arrayList;
    }

    public List<NotificationChannel> getNotificationChannels() {
        return this.mNotificationManager.getNotificationChannels();
    }

    public List<k> getNotificationChannelsCompat() {
        List<NotificationChannel> notificationChannels = getNotificationChannels();
        if (notificationChannels.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(notificationChannels.size());
        Iterator<NotificationChannel> it = notificationChannels.iterator();
        while (it.hasNext()) {
            arrayList.add(new k(it.next()));
        }
        return arrayList;
    }

    public void notify(String str, int i11, Notification notification) {
        if (!useSideChannelForNotification(notification)) {
            this.mNotificationManager.notify(str, i11, notification);
        } else {
            pushSideChannelQueue(new q0(this.mContext.getPackageName(), i11, str, notification));
            this.mNotificationManager.cancel(str, i11);
        }
    }

    public void cancel(int i11) {
        cancel(null, i11);
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        this.mNotificationManager.createNotificationChannel(notificationChannel);
    }

    public k getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel = getNotificationChannel(str, str2);
        if (notificationChannel != null) {
            return new k(notificationChannel);
        }
        return null;
    }

    public NotificationManagerCompat(NotificationManager notificationManager, Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    public NotificationChannel getNotificationChannel(String str) {
        return this.mNotificationManager.getNotificationChannel(str);
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        this.mNotificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    public void notify(int i11, Notification notification) {
        notify(null, i11, notification);
    }

    public void notify(List<Object> list) {
        if (list.size() <= 0) {
            return;
        }
        list.get(0).getClass();
        org.bouncycastle.jce.provider.a.c();
    }
}
