package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f2631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2633d;

    public m(NotificationChannelGroup notificationChannelGroup, List list) {
        String id2 = notificationChannelGroup.getId();
        this.f2633d = Collections.EMPTY_LIST;
        id2.getClass();
        this.f2630a = id2;
        this.f2631b = notificationChannelGroup.getName();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            this.f2632c = l.c(notificationChannelGroup);
        }
        if (i11 < 28) {
            a(list);
        } else {
            l.e(notificationChannelGroup);
            a(notificationChannelGroup.getChannels());
        }
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannel = (NotificationChannel) it.next();
            if (this.f2630a.equals(notificationChannel.getGroup())) {
                arrayList.add(new k(notificationChannel));
            }
        }
        return arrayList;
    }

    public m(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.EMPTY_LIST);
    }
}
