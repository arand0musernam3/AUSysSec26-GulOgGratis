package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.app.tgtg.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2664a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f2668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f2669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f2670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f2671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2673j;
    public l0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f2675m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bundle f2678p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Notification f2681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RemoteViews f2682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RemoteViews f2683u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f2684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f2685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f2686x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Notification f2687y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f2688z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2665b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2666c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2667d = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2674k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2676n = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2679q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2680r = 0;

    public s(Context context, String str) {
        Notification notification = new Notification();
        this.f2687y = notification;
        this.f2664a = context;
        this.f2684v = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f2673j = 0;
        this.f2688z = new ArrayList();
        this.f2686x = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        o0 o0Var = new o0(this);
        s sVar = o0Var.f2651c;
        l0 l0Var = sVar.l;
        if (l0Var != null) {
            l0Var.apply(o0Var);
        }
        RemoteViews remoteViewsMakeContentView = l0Var != null ? l0Var.makeContentView(o0Var) : null;
        Notification notificationBuild = o0Var.f2650b.build();
        if (remoteViewsMakeContentView != null) {
            notificationBuild.contentView = remoteViewsMakeContentView;
        } else {
            RemoteViews remoteViews = sVar.f2682t;
            if (remoteViews != null) {
                notificationBuild.contentView = remoteViews;
            }
        }
        if (l0Var != null && (remoteViewsMakeBigContentView = l0Var.makeBigContentView(o0Var)) != null) {
            notificationBuild.bigContentView = remoteViewsMakeBigContentView;
        }
        if (l0Var != null && (remoteViewsMakeHeadsUpContentView = sVar.l.makeHeadsUpContentView(o0Var)) != null) {
            notificationBuild.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (l0Var != null && (bundle = notificationBuild.extras) != null) {
            l0Var.addCompatExtras(bundle);
        }
        return notificationBuild;
    }

    public final void c(int i11, boolean z11) {
        Notification notification = this.f2687y;
        if (z11) {
            notification.flags = i11 | notification.flags;
        } else {
            notification.flags = (~i11) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompatC;
        if (bitmap == null) {
            iconCompatC = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f2664a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            iconCompatC = IconCompat.c(bitmap);
        }
        this.f2671h = iconCompatC;
    }

    public final void e(l0 l0Var) {
        if (this.l != l0Var) {
            this.l = l0Var;
            if (l0Var != null) {
                l0Var.setBuilder(this);
            }
        }
    }
}
