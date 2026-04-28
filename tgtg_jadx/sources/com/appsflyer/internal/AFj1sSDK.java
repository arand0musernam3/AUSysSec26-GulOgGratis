package com.appsflyer.internal;

import android.content.ContentResolver;
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
public final class AFj1sSDK extends AFi1bSDK {
    private final AFd1zSDK getMonetizationNetwork;

    public AFj1sSDK(Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("store", "samsung", runnable);
        this.getMonetizationNetwork = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(Context context) {
        AFb1tSDK<Map<String, Object>> aFb1tSDK = new AFb1tSDK<Map<String, Object>>(context, this.getMonetizationNetwork.getCurrencyIso4217Code(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1sSDK.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFb1tSDK
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> getMediationNetwork() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.getCurrencyIso4217Code.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.getMonetizationNetwork);
                        cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), null, null, null, null);
                        if (cursorQuery != null) {
                            boolean zMoveToFirst = cursorQuery.moveToFirst();
                            AFj1sSDK aFj1sSDK = AFj1sSDK.this;
                            if (zMoveToFirst) {
                                aFj1sSDK.getCurrencyIso4217Code.put("response", "OK");
                                E_("referrer", AFj1sSDK.this.getCurrencyIso4217Code, cursorQuery);
                                D_("click_ts", AFj1sSDK.this.getCurrencyIso4217Code, cursorQuery);
                                D_("install_begin_ts", AFj1sSDK.this.getCurrencyIso4217Code, cursorQuery);
                                D_("install_end_ts", AFj1sSDK.this.getCurrencyIso4217Code, cursorQuery);
                                E_("organic_keywords", AFj1sSDK.this.getCurrencyIso4217Code, cursorQuery);
                                E_("attr_type", AFj1sSDK.this.getCurrencyIso4217Code, cursorQuery);
                                HashMap map = new HashMap();
                                int columnIndex = cursorQuery.getColumnIndex("instant");
                                if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                    map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                                }
                                D_("click_server_ts", map, cursorQuery);
                                D_("install_begin_server_ts", map, cursorQuery);
                                E_("install_version", map, cursorQuery);
                                if (!map.isEmpty()) {
                                    AFj1sSDK.this.getCurrencyIso4217Code.put("custom", map);
                                }
                            } else {
                                aFj1sSDK.getCurrencyIso4217Code.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            AFj1sSDK.this.getCurrencyIso4217Code.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e5) {
                        AFj1sSDK.this.getCurrencyIso4217Code.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e5.getMessage(), e5, false, true);
                        if (0 != 0) {
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    String str = ((PackageItemInfo) this.getCurrencyIso4217Code.getPackageManager().resolveContentProvider(this.getMonetizationNetwork, 128)).packageName;
                    AFj1sSDK.this.getCurrencyIso4217Code.put("api_ver", Long.valueOf(AFj1pSDK.getCurrencyIso4217Code(this.getCurrencyIso4217Code, str)));
                    AFj1sSDK.this.getCurrencyIso4217Code.put("api_ver_name", AFj1pSDK.getMonetizationNetwork(this.getCurrencyIso4217Code, str));
                    AFj1sSDK.this.getCurrencyIso4217Code();
                    return AFj1sSDK.this.getCurrencyIso4217Code;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }

            private static void D_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j9 = cursor.getLong(columnIndex);
                if (j9 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j9));
            }

            private static void E_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        };
        AFc1jSDK mediationNetwork = this.getMonetizationNetwork.getMediationNetwork();
        AFa1tSDK.getMediationNetwork();
        if (AFa1tSDK.getMediationNetwork(mediationNetwork, false) > 0 || !aFb1tSDK.getMonetizationNetwork()) {
            return;
        }
        aFb1tSDK.getRevenue.execute(aFb1tSDK.getMediationNetwork);
        this.areAllFieldsValid = System.currentTimeMillis();
        this.component2 = AFj1zSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1zSDK.AnonymousClass3());
    }
}
