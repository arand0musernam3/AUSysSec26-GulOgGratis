package rg;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.app.tgtg.favWidget.FavouritesLargeWidget;
import com.app.tgtg.favWidget.FavouritesSmallWidget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38029a;

    public w(Context context) {
        this.f38029a = context;
    }

    public final void a(String str) {
        Class cls;
        if (Intrinsics.areEqual(str, "smallWidget")) {
            cls = FavouritesSmallWidget.class;
        } else if (Intrinsics.areEqual(str, "largeWidget")) {
            cls = FavouritesLargeWidget.class;
        } else {
            sa0.a.f38953a.c("Unknown widget type: ".concat(str), new Object[0]);
            cls = null;
        }
        if (cls == null) {
            return;
        }
        Context context = this.f38029a;
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) cls));
        appWidgetIds.getClass();
        if (appWidgetIds.length == 0) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        intent.putExtra("appWidgetIds", appWidgetIds);
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent, "com.app.tgtg.permission.WIDGET_INTERNAL_UPDATE");
    }
}
