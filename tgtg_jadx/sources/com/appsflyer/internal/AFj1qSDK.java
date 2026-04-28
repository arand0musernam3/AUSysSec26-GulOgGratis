package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import com.appsflyer.AFLogger;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFj1qSDK extends AFi1hSDK {

    @NotNull
    private final ExecutorService getMediationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1qSDK(@NotNull ExecutorService executorService, @NotNull AFc1kSDK aFc1kSDK, @NotNull Runnable runnable) {
        super("preload", "samsung", aFc1kSDK, runnable);
        executorService.getClass();
        aFc1kSDK.getClass();
        runnable.getClass();
        this.getMediationNetwork = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AFAdRevenueData(com.appsflyer.internal.AFj1qSDK r10, android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1qSDK.AFAdRevenueData(com.appsflyer.internal.AFj1qSDK, android.content.Context):void");
    }

    private static boolean C_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    private final boolean getRevenue(Context context) {
        if (!getMonetizationNetwork()) {
            AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getMediationNetwork(context)) {
            return true;
        }
        AFg1hSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    @SuppressLint({"NewApi"})
    public final void getMonetizationNetwork(@NotNull Context context) {
        context.getClass();
        if (getRevenue(context)) {
            this.getMediationNetwork.execute(new g(4, this, context));
        }
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getRevenue() {
    }
}
