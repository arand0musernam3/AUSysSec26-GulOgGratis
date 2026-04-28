package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.app.tgtg.R;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.i18n.MessageBundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f2650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f2651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f2652d = new Bundle();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.os.Parcelable[]] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r2v44, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v45, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v19, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r9v27, types: [android.os.Bundle] */
    public o0(s sVar) {
        ?? r17;
        ?? r102;
        int i11;
        ArrayList arrayList;
        o oVarC;
        this.f2651c = sVar;
        Context context = sVar.f2664a;
        ArrayList arrayList2 = sVar.f2688z;
        ArrayList<y0> arrayList3 = sVar.f2666c;
        ArrayList arrayList4 = sVar.f2667d;
        this.f2649a = context;
        Notification.Builder builder = new Notification.Builder(context, sVar.f2684v);
        this.f2650b = builder;
        Notification notification = sVar.f2687y;
        ?? r103 = 0;
        int i12 = 2;
        int i13 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(sVar.f2668e).setContentText(sVar.f2669f).setContentInfo(null).setContentIntent(sVar.f2670g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(sVar.f2672i).setProgress(0, 0, false);
        IconCompat iconCompat = sVar.f2671h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.h(context));
        builder.setSubText(sVar.f2675m).setUsesChronometer(false).setPriority(sVar.f2673j);
        l0 l0Var = sVar.l;
        if (l0Var instanceof v) {
            v vVar = (v) l0Var;
            PendingIntent pendingIntent = vVar.f2701d;
            Integer num = vVar.f2705h;
            o oVarC2 = pendingIntent == null ? vVar.c(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, num, R.color.call_notification_decline_color, vVar.f2702e) : vVar.c(R.drawable.ic_call_decline, R.string.call_notification_decline_action, num, R.color.call_notification_decline_color, pendingIntent);
            PendingIntent pendingIntent2 = vVar.f2700c;
            if (pendingIntent2 == null) {
                oVarC = null;
            } else {
                boolean z11 = vVar.f2703f;
                oVarC = vVar.c(z11 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z11 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, vVar.f2704g, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(oVarC2);
            ArrayList<o> arrayList6 = vVar.mBuilder.f2665b;
            if (arrayList6 != null) {
                for (o oVar : arrayList6) {
                    oVar.getClass();
                    if (!oVar.f2641a.getBoolean("key_action_priority")) {
                        arrayList5.add(oVar);
                        i12--;
                    }
                    if (oVarC != null && i12 == 1) {
                        arrayList5.add(oVarC);
                        i12--;
                    }
                }
            }
            if (oVarC != null && i12 >= 1) {
                arrayList5.add(oVarC);
            }
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                a((o) it.next());
            }
        } else {
            Iterator it2 = sVar.f2665b.iterator();
            while (it2.hasNext()) {
                a((o) it2.next());
            }
        }
        Bundle bundle = sVar.f2678p;
        if (bundle != null) {
            this.f2652d.putAll(bundle);
        }
        this.f2650b.setShowWhen(sVar.f2674k);
        this.f2650b.setLocalOnly(sVar.f2676n);
        this.f2650b.setGroup(null);
        this.f2650b.setSortKey(null);
        this.f2650b.setGroupSummary(false);
        this.f2650b.setCategory(sVar.f2677o);
        this.f2650b.setColor(sVar.f2679q);
        this.f2650b.setVisibility(sVar.f2680r);
        this.f2650b.setPublicVersion(sVar.f2681s);
        this.f2650b.setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                for (y0 y0Var : arrayList3) {
                    CharSequence charSequence = y0Var.f2711a;
                    String str = y0Var.f2713c;
                    if (str == null) {
                        str = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList.add(str);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    q1.f fVar = new q1.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                this.f2650b.addPerson((String) it3.next());
            }
        }
        if (arrayList4.size() > 0) {
            if (sVar.f2678p == null) {
                sVar.f2678p = new Bundle();
            }
            Bundle bundle2 = sVar.f2678p.getBundle("android.car.EXTENSIONS");
            ?? bundle3 = bundle2 == null ? new Bundle() : bundle2;
            ?? bundle4 = new Bundle((Bundle) bundle3);
            ?? bundle5 = new Bundle();
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                String string = Integer.toString(i14);
                o oVar2 = (o) arrayList4.get(i14);
                ?? bundle6 = new Bundle();
                if (oVar2.f2642b == null && (i11 = oVar2.f2646f) != 0) {
                    oVar2.f2642b = IconCompat.d(r103, "", i11);
                }
                IconCompat iconCompat2 = oVar2.f2642b;
                ?? r172 = r103;
                Bundle bundle7 = oVar2.f2641a;
                bundle6.putInt(InAppMessageBase.ICON, iconCompat2 != null ? iconCompat2.e() : i13);
                bundle6.putCharSequence(MessageBundle.TITLE_ENTRY, oVar2.f2647g);
                bundle6.putParcelable("actionIntent", oVar2.f2648h);
                Bundle bundle8 = bundle7 != null ? new Bundle(bundle7) : new Bundle();
                bundle8.putBoolean("android.support.allowGeneratedReplies", oVar2.f2644d);
                bundle6.putBundle(InAppMessageBase.EXTRAS, bundle8);
                c1[] c1VarArr = oVar2.f2643c;
                if (c1VarArr == null) {
                    r102 = r172;
                } else {
                    r102 = new Bundle[c1VarArr.length];
                    if (c1VarArr.length > 0) {
                        c1 c1Var = c1VarArr[0];
                        new Bundle();
                        throw r172;
                    }
                }
                bundle6.putParcelableArray("remoteInputs", r102);
                bundle6.putBoolean("showsUserInterface", oVar2.f2645e);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
                i14++;
                i13 = 0;
                r103 = r172;
            }
            r17 = r103;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (sVar.f2678p == null) {
                sVar.f2678p = new Bundle();
            }
            sVar.f2678p.putBundle("android.car.EXTENSIONS", bundle3);
            this.f2652d.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            r17 = 0;
        }
        this.f2650b.setExtras(sVar.f2678p);
        this.f2650b.setRemoteInputHistory(r17);
        RemoteViews remoteViews = sVar.f2682t;
        if (remoteViews != null) {
            this.f2650b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = sVar.f2683u;
        if (remoteViews2 != null) {
            this.f2650b.setCustomBigContentView(remoteViews2);
        }
        this.f2650b.setBadgeIconType(0);
        this.f2650b.setSettingsText(null);
        this.f2650b.setShortcutId(sVar.f2685w);
        this.f2650b.setTimeoutAfter(0L);
        this.f2650b.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(sVar.f2684v)) {
            this.f2650b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            for (y0 y0Var2 : arrayList3) {
                Notification.Builder builder2 = this.f2650b;
                y0Var2.getClass();
                l.a(builder2, l.h(y0Var2));
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            f.c(this.f2650b, sVar.f2686x);
            f.d(this.f2650b);
        }
        if (i15 >= 36) {
            n0.b(this.f2650b);
        }
    }

    public final void a(o oVar) {
        int i11;
        if (oVar.f2642b == null && (i11 = oVar.f2646f) != 0) {
            oVar.f2642b = IconCompat.d(null, "", i11);
        }
        IconCompat iconCompat = oVar.f2642b;
        boolean z11 = oVar.f2644d;
        Bundle bundle = oVar.f2641a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.h(null) : null, oVar.f2647g, oVar.f2648h);
        c1[] c1VarArr = oVar.f2643c;
        if (c1VarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[c1VarArr.length];
            if (c1VarArr.length > 0) {
                c1 c1Var = c1VarArr[0];
                throw null;
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z11);
        builder.setAllowGeneratedReplies(z11);
        bundle2.putInt("android.support.action.semanticAction", 0);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            l.g(builder);
        }
        if (i12 >= 29) {
            f.e(builder);
        }
        if (i12 >= 31) {
            m0.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", oVar.f2645e);
        builder.addExtras(bundle2);
        this.f2650b.addAction(builder.build());
    }
}
