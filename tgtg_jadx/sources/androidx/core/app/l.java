package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static y0 b(Person person) {
        CharSequence name = person.getName();
        IconCompat iconCompatB = person.getIcon() != null ? IconCompat.b(person.getIcon()) : null;
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        y0 y0Var = new y0();
        y0Var.f2711a = name;
        y0Var.f2712b = iconCompatB;
        y0Var.f2713c = uri;
        y0Var.f2714d = key;
        y0Var.f2715e = zIsBot;
        y0Var.f2716f = zIsImportant;
        return y0Var;
    }

    public static String c(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getDescription();
    }

    public static NotificationChannelGroup d(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannelGroup(str);
    }

    public static void e(NotificationChannelGroup notificationChannelGroup) {
        notificationChannelGroup.isBlocked();
    }

    public static void f(NotificationChannelGroup notificationChannelGroup, String str) {
        notificationChannelGroup.setDescription(str);
    }

    public static void g(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static Person h(y0 y0Var) {
        Person.Builder name = new Person.Builder().setName(y0Var.f2711a);
        IconCompat iconCompat = y0Var.f2712b;
        return name.setIcon(iconCompat != null ? iconCompat.h(null) : null).setUri(y0Var.f2713c).setKey(y0Var.f2714d).setBot(y0Var.f2715e).setImportant(y0Var.f2716f).build();
    }
}
