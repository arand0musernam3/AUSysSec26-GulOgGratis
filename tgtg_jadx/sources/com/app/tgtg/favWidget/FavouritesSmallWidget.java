package com.app.tgtg.favWidget;

import ag.i;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.widgets.response.FavouriteWidgetItem;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.internal.StringCompanionObject;
import mv.p0;
import o00.h0;
import rg.a;
import rg.d;
import rg.g;
import rg.t;
import rg.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class FavouritesSmallWidget extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f8952e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f8953f = new Object();

    @Override // rg.a
    public final RemoteViews a(Context context, g gVar) {
        context.getClass();
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.favourites_small_widget);
        List listH = d0.h(new v(R.id.small_widget_fav_item_1_cover_image, R.id.small_widget_fav_item_1_Logo, R.id.small_widget_fav_item_1_pickup_time, R.id.small_widget_fav_item_1_pickup_day, R.id.small_widget_fav_item_1, null), new v(R.id.small_widget_fav_item_2_cover_image, R.id.small_widget_fav_item_2_Logo, R.id.small_widget_fav_item_2_pickup_time, R.id.small_widget_fav_item_2_pickup_day, R.id.small_widget_fav_item_2, Integer.valueOf(R.id.small_widget_empty_favourite_2)), new v(R.id.small_widget_fav_item_3_cover_image, R.id.small_widget_fav_item_3_Logo, R.id.small_widget_fav_item_3_pickup_time, R.id.small_widget_fav_item_3_pickup_day, R.id.small_widget_fav_item_3, Integer.valueOf(R.id.small_widget_empty_favourite_3)));
        List list = gVar.f38006b;
        int i11 = 0;
        int i12 = 0;
        for (Object obj : listH) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                d0.n();
                throw null;
            }
            v vVar = (v) obj;
            FavouriteWidgetItem favouriteWidgetItem = list != null ? (FavouriteWidgetItem) CollectionsKt.Q(i12, list) : null;
            if (favouriteWidgetItem != null) {
                remoteViews.setViewVisibility(vVar.f38027e, i11);
                Integer num = vVar.f38028f;
                if (num != null) {
                    remoteViews.setViewVisibility(num.intValue(), 8);
                }
                int i14 = vVar.f38023a;
                Picture coverPicture = favouriteWidgetItem.getCoverPicture();
                FavouriteWidgetItem favouriteWidgetItem2 = favouriteWidgetItem;
                c(context, remoteViews, i14, coverPicture != null ? coverPicture.getCurrentUrl() : null, R.drawable.widget_empty_favourite_background, 94, 88, n0.f26529a);
                int i15 = vVar.f38024b;
                Picture logoPicture = favouriteWidgetItem2.getLogoPicture();
                c(context, remoteViews, i15, logoPicture != null ? logoPicture.getCurrentUrl() : null, R.drawable.light_grey_circle_bg, 40, 40, c0.c(new yd.a()));
                remoteViews.setTextViewText(vVar.f38026d, a.a.C(favouriteWidgetItem2, context));
                int i16 = vVar.f38025c;
                PickupInterval pickupInterval = favouriteWidgetItem2.getPickupInterval();
                remoteViews.setTextViewText(i16, pickupInterval != null ? p0.u(context, pickupInterval) : " - ");
                int i17 = vVar.f38027e;
                String strM546getItemIdRWxzYZM = favouriteWidgetItem2.m546getItemIdRWxzYZM();
                if (strM546getItemIdRWxzYZM == null) {
                    strM546getItemIdRWxzYZM = null;
                }
                PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse(AppConstants.SHARE_URL_ITEM_VIEW + strM546getItemIdRWxzYZM + "/widget")), 201326592);
                activity.getClass();
                remoteViews.setOnClickPendingIntent(i17, activity);
            } else {
                int i18 = i11;
                remoteViews.setViewVisibility(vVar.f38027e, 8);
                Integer num2 = vVar.f38028f;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    remoteViews.setViewVisibility(iIntValue, i18);
                    PendingIntent activity2 = PendingIntent.getActivity(context, i18, new Intent("android.intent.action.VIEW", Uri.parse("https://share.toogoodtogo.com//widget/discover")), 201326592);
                    activity2.getClass();
                    remoteViews.setOnClickPendingIntent(iIntValue, activity2);
                }
            }
            i12 = i13;
            i11 = 0;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = context.getString(R.string.fav_widget_last_updated_text);
        string.getClass();
        remoteViews.setTextViewText(R.id.small_widget_last_updated, String.format(string, Arrays.copyOf(new Object[]{p0.g(context, p0.F(gVar.f38005a))}, 1)));
        Intent intent = new Intent(context, (Class<?>) FavouritesSmallWidget.class);
        intent.setAction("ACTION_CONTENT_REFRESH");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        broadcast.getClass();
        remoteViews.setOnClickPendingIntent(R.id.small_widget_icon_refresh, broadcast);
        PendingIntent activity3 = PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse("https://share.toogoodtogo.com//widget/favorites")), 201326592);
        activity3.getClass();
        remoteViews.setOnClickPendingIntent(R.id.small_widget_content, activity3);
        return remoteViews;
    }

    @Override // rg.a
    public final int d() {
        return R.layout.favourites_preview_small_widget;
    }

    @Override // rg.a
    public final String e() {
        return "smallWidget";
    }

    @Override // rg.a, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!this.f8952e) {
            synchronized (this.f8953f) {
                try {
                    if (!this.f8952e) {
                        i iVar = (i) ((t) h0.u(context));
                        this.f37991a = (ao.v) iVar.f1341q.get();
                        this.f37992b = (d) iVar.W.get();
                        this.f8952e = true;
                    }
                } finally {
                }
            }
        }
        super.onReceive(context, intent);
    }
}
