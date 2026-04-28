package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1zSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFi1eSDK extends AFi1hSDK {
    private final AFd1zSDK getMediationNetwork;
    private final AFi1cSDK getMonetizationNetwork;

    public AFi1eSDK(Runnable runnable, AFd1zSDK aFd1zSDK, AFi1cSDK aFi1cSDK) {
        super("store", "huawei", aFd1zSDK.AFAdRevenueData(), runnable);
        this.getMediationNetwork = aFd1zSDK;
        this.getMonetizationNetwork = aFi1cSDK;
    }

    private boolean AFAdRevenueData(Context context) {
        if (!getMonetizationNetwork()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMonetizationNetwork.getMediationNetwork(context)) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getMonetizationNetwork.getCurrencyIso4217Code(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Context context) {
        this.areAllFieldsValid = System.currentTimeMillis();
        this.component2 = AFj1zSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1zSDK.AnonymousClass3());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.getCurrencyIso4217Code.put("api_ver", Long.valueOf(AFj1pSDK.getCurrencyIso4217Code(context, str)));
        this.getCurrencyIso4217Code.put("api_ver_name", AFj1pSDK.getMonetizationNetwork(context, str));
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursorQuery != null) {
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                Map<String, Object> map = this.getCurrencyIso4217Code;
                if (zMoveToFirst) {
                    map.put("response", "OK");
                    this.getCurrencyIso4217Code.put("referrer", cursorQuery.getString(0));
                    this.getCurrencyIso4217Code.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                    this.getCurrencyIso4217Code.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                    if (cursorQuery.getColumnCount() > 3) {
                        this.getCurrencyIso4217Code.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                        HashMap map2 = new HashMap();
                        String string = cursorQuery.getString(4);
                        if (string != null) {
                            map2.put("track_id", string);
                        }
                        map2.put("referrer_ex", cursorQuery.getString(5));
                        this.getCurrencyIso4217Code.put("huawei_custom", map2);
                    }
                } else {
                    map.put("response", "FEATURE_NOT_SUPPORTED");
                }
            } else {
                this.getCurrencyIso4217Code.put("response", "SERVICE_UNAVAILABLE");
            }
        } catch (Throwable th2) {
            try {
                this.getCurrencyIso4217Code.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, th2.getMessage() != null ? th2.getMessage() : "", th2, false, true);
                if (0 != 0) {
                }
            } finally {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        getCurrencyIso4217Code();
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(Context context) {
        if (AFAdRevenueData(context)) {
            this.getMediationNetwork.getCurrencyIso4217Code().execute(new g(3, this, context));
        }
    }
}
