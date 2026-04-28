package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.R;
import java.text.NumberFormat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    CharSequence mBigContentTitle;
    protected s mBuilder;
    CharSequence mSummaryText;
    boolean mSummaryTextSet = false;

    public static l0 constructCompatStyleByName(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "androidx.core.app.NotificationCompat$ProgressStyle":
                return new k0();
            case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                return new x();
            case "androidx.core.app.NotificationCompat$BigPictureStyle":
                return new q();
            case "androidx.core.app.NotificationCompat$CallStyle":
                return new v();
            case "androidx.core.app.NotificationCompat$InboxStyle":
                return new y();
            case "androidx.core.app.NotificationCompat$BigTextStyle":
                return new r();
            case "androidx.core.app.NotificationCompat$MessagingStyle":
                return new f0();
            default:
                return null;
        }
    }

    public static l0 constructCompatStyleForBundle(Bundle bundle) {
        l0 l0VarConstructCompatStyleByName = constructCompatStyleByName(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
        if (l0VarConstructCompatStyleByName != null) {
            return l0VarConstructCompatStyleByName;
        }
        if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
            return new f0();
        }
        if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
            return new q();
        }
        if (bundle.containsKey("android.bigText")) {
            return new r();
        }
        if (bundle.containsKey("android.textLines")) {
            return new y();
        }
        if (bundle.containsKey("android.callType")) {
            return new v();
        }
        if (bundle.containsKey("android.progressSegments") || bundle.containsKey("android.progressPoints")) {
            return new k0();
        }
        String string = bundle.getString("android.template");
        if (string == null) {
            return null;
        }
        if (string.equals(Notification.BigPictureStyle.class.getName())) {
            return new q();
        }
        if (string.equals(Notification.BigTextStyle.class.getName())) {
            return new r();
        }
        if (string.equals(Notification.InboxStyle.class.getName())) {
            return new y();
        }
        if (Build.VERSION.SDK_INT >= 36 && string.equals(Notification.ProgressStyle.class.getName())) {
            return new k0();
        }
        if (string.equals(Notification.MessagingStyle.class.getName())) {
            return new f0();
        }
        if (string.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
            return new x();
        }
        return null;
    }

    public static l0 constructStyleForExtras(Bundle bundle) {
        l0 l0VarConstructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
        if (l0VarConstructCompatStyleForBundle == null) {
            return null;
        }
        try {
            l0VarConstructCompatStyleForBundle.restoreFromCompatExtras(bundle);
            return l0VarConstructCompatStyleForBundle;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static l0 extractStyleFromNotification(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        return constructStyleForExtras(bundle);
    }

    public final Bitmap a(IconCompat iconCompat, int i11, int i12) {
        Object obj;
        ApplicationInfo applicationInfo;
        Resources resourcesForApplication;
        Context context = this.mBuilder.f2664a;
        if (iconCompat.f2719a == 2 && (obj = iconCompat.f2720b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split(ExpiryDateInput.SEPARATOR, -1)[0];
                String str4 = str2.split(ExpiryDateInput.SEPARATOR, -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                } else {
                    String strF = iconCompat.f();
                    if (AnalyticsPlatformParams.channel.equals(strF)) {
                        resourcesForApplication = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            applicationInfo = packageManager.getApplicationInfo(strF, 8192);
                        } catch (PackageManager.NameNotFoundException e5) {
                            Log.e("IconCompat", "Unable to find pkg=" + strF + " for icon", e5);
                        }
                        resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (iconCompat.f2723e != identifier) {
                        Log.i("IconCompat", "Id has changed for " + strF + " " + str);
                        iconCompat.f2723e = identifier;
                    }
                }
            }
        }
        Drawable drawableLoadDrawable = iconCompat.h(context).loadDrawable(context);
        int intrinsicWidth = i12 == 0 ? drawableLoadDrawable.getIntrinsicWidth() : i12;
        if (i12 == 0) {
            i12 = drawableLoadDrawable.getIntrinsicHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i12, Bitmap.Config.ARGB_8888);
        drawableLoadDrawable.setBounds(0, 0, intrinsicWidth, i12);
        if (i11 != 0) {
            drawableLoadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        drawableLoadDrawable.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public void addCompatExtras(Bundle bundle) {
        if (this.mSummaryTextSet) {
            bundle.putCharSequence("android.summaryText", this.mSummaryText);
        }
        CharSequence charSequence = this.mBigContentTitle;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String className = getClassName();
        if (className != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
        }
    }

    public RemoteViews applyStandardTemplate(boolean z11, int i11, boolean z12) {
        boolean z13;
        boolean z14;
        Resources resources = this.mBuilder.f2664a.getResources();
        RemoteViews remoteViews = new RemoteViews(this.mBuilder.f2664a.getPackageName(), i11);
        s sVar = this.mBuilder;
        if (sVar.f2671h != null) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            remoteViews.setImageViewBitmap(R.id.icon, createColoredBitmap(this.mBuilder.f2671h, 0));
            if (z11 && this.mBuilder.f2687y.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
                int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding) * 2);
                s sVar2 = this.mBuilder;
                remoteViews.setImageViewBitmap(R.id.right_icon, b(sVar2.f2687y.icon, dimensionPixelSize, dimensionPixelSize2, sVar2.f2679q));
                remoteViews.setViewVisibility(R.id.right_icon, 0);
            }
        } else if (z11 && sVar.f2687y.icon != 0) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
            s sVar3 = this.mBuilder;
            remoteViews.setImageViewBitmap(R.id.icon, b(sVar3.f2687y.icon, dimensionPixelSize3, dimensionPixelSize4, sVar3.f2679q));
        }
        CharSequence charSequence = this.mBuilder.f2668e;
        if (charSequence != null) {
            remoteViews.setTextViewText(R.id.title, charSequence);
        }
        CharSequence charSequence2 = this.mBuilder.f2669f;
        boolean z15 = true;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence2);
            z13 = true;
        } else {
            z13 = false;
        }
        this.mBuilder.getClass();
        if (this.mBuilder.f2672i > 0) {
            if (this.mBuilder.f2672i > resources.getInteger(R.integer.status_bar_notification_info_maxnum)) {
                remoteViews.setTextViewText(R.id.info, resources.getString(R.string.status_bar_notification_info_overflow));
            } else {
                remoteViews.setTextViewText(R.id.info, NumberFormat.getIntegerInstance().format(this.mBuilder.f2672i));
            }
            remoteViews.setViewVisibility(R.id.info, 0);
            z13 = true;
            z14 = true;
        } else {
            remoteViews.setViewVisibility(R.id.info, 8);
            z14 = false;
        }
        CharSequence charSequence3 = this.mBuilder.f2675m;
        if (charSequence3 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence3);
            CharSequence charSequence4 = this.mBuilder.f2669f;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(R.id.text2, charSequence4);
                remoteViews.setViewVisibility(R.id.text2, 0);
                if (z12) {
                    remoteViews.setTextViewTextSize(R.id.text, 0, resources.getDimensionPixelSize(R.dimen.notification_subtext_size));
                }
                remoteViews.setViewPadding(R.id.line1, 0, 0, 0, 0);
            } else {
                remoteViews.setViewVisibility(R.id.text2, 8);
            }
        }
        s sVar4 = this.mBuilder;
        if ((sVar4.f2674k ? sVar4.f2687y.when : 0L) != 0) {
            sVar4.getClass();
            remoteViews.setViewVisibility(R.id.time, 0);
            s sVar5 = this.mBuilder;
            remoteViews.setLong(R.id.time, "setTime", sVar5.f2674k ? sVar5.f2687y.when : 0L);
        } else {
            z15 = z14;
        }
        remoteViews.setViewVisibility(R.id.right_side, z15 ? 0 : 8);
        remoteViews.setViewVisibility(R.id.line3, z13 ? 0 : 8);
        return remoteViews;
    }

    public final Bitmap b(int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            i14 = 0;
        }
        Context context = this.mBuilder.f2664a;
        PorterDuff.Mode mode = IconCompat.f2718k;
        context.getClass();
        Bitmap bitmapA = a(IconCompat.d(context.getResources(), context.getPackageName(), R.drawable.notification_icon_background), i14, i12);
        Canvas canvas = new Canvas(bitmapA);
        Drawable drawableMutate = this.mBuilder.f2664a.getResources().getDrawable(i11).mutate();
        drawableMutate.setFilterBitmap(true);
        int i15 = (i12 - i13) / 2;
        int i16 = i13 + i15;
        drawableMutate.setBounds(i15, i15, i16, i16);
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        drawableMutate.draw(canvas);
        return bitmapA;
    }

    public Notification build() {
        s sVar = this.mBuilder;
        if (sVar != null) {
            return sVar.a();
        }
        return null;
    }

    public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
        remoteViews.setViewVisibility(R.id.title, 8);
        remoteViews.setViewVisibility(R.id.text2, 8);
        remoteViews.setViewVisibility(R.id.text, 8);
        remoteViews.removeAllViews(R.id.notification_main_column);
        remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(R.id.notification_main_column, 0);
        Resources resources = this.mBuilder.f2664a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
        float f11 = resources.getConfiguration().fontScale;
        if (f11 < 1.0f) {
            f11 = 1.0f;
        } else if (f11 > 1.3f) {
            f11 = 1.3f;
        }
        float f12 = (f11 - 1.0f) / 0.29999995f;
        remoteViews.setViewPadding(R.id.notification_main_column_container, 0, Math.round((f12 * dimensionPixelSize2) + ((1.0f - f12) * dimensionPixelSize)), 0, 0);
    }

    public void clearCompatExtraKeys(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public Bitmap createColoredBitmap(int i11, int i12) {
        Context context = this.mBuilder.f2664a;
        PorterDuff.Mode mode = IconCompat.f2718k;
        context.getClass();
        return a(IconCompat.d(context.getResources(), context.getPackageName(), i11), i12, 0);
    }

    public boolean displayCustomViewInline() {
        return false;
    }

    public String getClassName() {
        return null;
    }

    public RemoteViews makeBigContentView(i iVar) {
        return null;
    }

    public RemoteViews makeContentView(i iVar) {
        return null;
    }

    public RemoteViews makeHeadsUpContentView(i iVar) {
        return null;
    }

    public void restoreFromCompatExtras(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.mSummaryText = bundle.getCharSequence("android.summaryText");
            this.mSummaryTextSet = true;
        }
        this.mBigContentTitle = bundle.getCharSequence("android.title.big");
    }

    public void setBuilder(s sVar) {
        if (this.mBuilder != sVar) {
            this.mBuilder = sVar;
            if (sVar != null) {
                sVar.e(this);
            }
        }
    }

    public void apply(i iVar) {
    }

    public Bitmap createColoredBitmap(IconCompat iconCompat, int i11) {
        return a(iconCompat, i11, 0);
    }
}
