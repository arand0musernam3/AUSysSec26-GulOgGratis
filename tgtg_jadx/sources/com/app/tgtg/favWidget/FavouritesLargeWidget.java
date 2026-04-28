package com.app.tgtg.favWidget;

import ag.i;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import ao.v;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import mv.p0;
import o00.h0;
import r8.k;
import rg.a;
import rg.d;
import rg.g;
import rg.s;
import rg.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class FavouritesLargeWidget extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f8950e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f8951f = new Object();

    @Override // rg.a
    public final RemoteViews a(Context context, g gVar) {
        String storeName;
        context.getClass();
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.favourites_large_widget);
        List listH = d0.h(new u(R.id.large_widget_fav_item_1_cover_image, R.id.large_widget_fav_item_1_Logo, R.id.large_widget_fav_item_1_store_name, R.id.large_widget_fav_item_1_item_name, R.id.large_widget_fav_item_1_pickup_time, R.id.large_widget_fav_item_1_pickup_day, R.id.large_widget_fav_item_1), new u(R.id.large_widget_fav_item_2_cover_image, R.id.large_widget_fav_item_2_Logo, R.id.large_widget_fav_item_2_store_name, R.id.large_widget_fav_item_2_item_name, R.id.large_widget_fav_item_2_pickup_time, R.id.large_widget_fav_item_2_pickup_day, R.id.large_widget_fav_item_2), new u(R.id.large_widget_fav_item_3_cover_image, R.id.large_widget_fav_item_3_Logo, R.id.large_widget_fav_item_3_store_name, R.id.large_widget_fav_item_3_item_name, R.id.large_widget_fav_item_3_pickup_time, R.id.large_widget_fav_item_3_pickup_day, R.id.large_widget_fav_item_3));
        List list = gVar.f38006b;
        int i11 = 0;
        int i12 = 0;
        for (Object obj : listH) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                d0.n();
                throw null;
            }
            u uVar = (u) obj;
            FavouriteWidgetItem favouriteWidgetItem = list != null ? (FavouriteWidgetItem) CollectionsKt.Q(i12, list) : null;
            if (favouriteWidgetItem != null) {
                remoteViews.setViewVisibility(uVar.f38022g, i11);
                int i14 = uVar.f38016a;
                Picture coverPicture = favouriteWidgetItem.getCoverPicture();
                FavouriteWidgetItem favouriteWidgetItem2 = favouriteWidgetItem;
                c(context, remoteViews, i14, coverPicture != null ? coverPicture.getCurrentUrl() : null, R.drawable.widget_empty_favourite_background, 304, 88, n0.f26529a);
                int i15 = uVar.f38017b;
                Picture logoPicture = favouriteWidgetItem2.getLogoPicture();
                c(context, remoteViews, i15, logoPicture != null ? logoPicture.getCurrentUrl() : null, R.drawable.light_grey_circle_bg, 40, 40, c0.c(new yd.a()));
                int i16 = uVar.f38018c;
                String storeName2 = favouriteWidgetItem2.getStoreName();
                if (storeName2 == null || StringsKt.H(storeName2)) {
                    storeName = "";
                } else {
                    String branch = favouriteWidgetItem2.getBranch();
                    storeName = (branch == null || StringsKt.H(branch)) ? favouriteWidgetItem2.getStoreName() : k.m(favouriteWidgetItem2.getStoreName(), " - ", favouriteWidgetItem2.getBranch());
                }
                remoteViews.setTextViewText(i16, storeName);
                int i17 = uVar.f38019d;
                String itemName = favouriteWidgetItem2.getItemName();
                if (itemName == null || itemName.length() == 0 || Intrinsics.areEqual(itemName, favouriteWidgetItem2.getStoreName())) {
                    itemName = null;
                }
                if (itemName == null) {
                    itemName = context.getString(R.string.item_view_default_item_name);
                    itemName.getClass();
                }
                remoteViews.setTextViewText(i17, itemName);
                remoteViews.setTextViewText(uVar.f38021f, a.a.C(favouriteWidgetItem2, context));
                int i18 = uVar.f38020e;
                PickupInterval pickupInterval = favouriteWidgetItem2.getPickupInterval();
                remoteViews.setTextViewText(i18, pickupInterval != null ? p0.u(context, pickupInterval) : " - ");
                int i19 = uVar.f38022g;
                String strM546getItemIdRWxzYZM = favouriteWidgetItem2.m546getItemIdRWxzYZM();
                if (strM546getItemIdRWxzYZM == null) {
                    strM546getItemIdRWxzYZM = null;
                }
                PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse(AppConstants.SHARE_URL_ITEM_VIEW + strM546getItemIdRWxzYZM + "/widget")), 201326592);
                activity.getClass();
                remoteViews.setOnClickPendingIntent(i19, activity);
            } else {
                remoteViews.setViewVisibility(uVar.f38022g, 8);
            }
            i12 = i13;
            i11 = 0;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = context.getString(R.string.fav_widget_last_updated_text);
        string.getClass();
        remoteViews.setTextViewText(R.id.large_widget_last_updated, String.format(string, Arrays.copyOf(new Object[]{p0.g(context, p0.F(gVar.f38005a))}, 1)));
        Intent intent = new Intent(context, (Class<?>) FavouritesLargeWidget.class);
        intent.setAction("ACTION_CONTENT_REFRESH");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        broadcast.getClass();
        remoteViews.setOnClickPendingIntent(R.id.large_widget_icon_refresh, broadcast);
        PendingIntent activity2 = PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse("https://share.toogoodtogo.com//widget/favorites")), 201326592);
        activity2.getClass();
        remoteViews.setOnClickPendingIntent(R.id.large_widget, activity2);
        return remoteViews;
    }

    @Override // rg.a
    public final int d() {
        return R.layout.favourites_preview_large_widget;
    }

    @Override // rg.a
    public final String e() {
        return "largeWidget";
    }

    @Override // rg.a, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!this.f8950e) {
            synchronized (this.f8951f) {
                try {
                    if (!this.f8950e) {
                        i iVar = (i) ((s) h0.u(context));
                        this.f37991a = (v) iVar.f1341q.get();
                        this.f37992b = (d) iVar.W.get();
                        this.f8950e = true;
                    }
                } finally {
                }
            }
        }
        super.onReceive(context, intent);
    }
}
