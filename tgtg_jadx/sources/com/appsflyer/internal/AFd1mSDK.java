package com.appsflyer.internal;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.model.local.AppConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFd1mSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;
    private static long component3 = 0;
    private static int copy = 1;
    private static char equals;
    private static String getCurrencyIso4217Code;
    public static String getRevenue;
    private static int toString;
    private final AppsFlyerProperties AFAdRevenueData;
    private final AFf1kSDK areAllFieldsValid;
    private final AFe1vSDK component1;
    private final AFj1kSDK component4;
    private final AFc1kSDK getMediationNetwork;
    private final AFd1oSDK getMonetizationNetwork;

    static {
        getMediationNetwork();
        getRevenue = "https://%sgcdsdk.%s/install_data/v5.0/";
        getCurrencyIso4217Code = "https://%sonelink.%s/shortlink-sdk/v2";
        toString = (copy + 37) % 128;
    }

    public AFd1mSDK(AFd1oSDK aFd1oSDK, AFc1kSDK aFc1kSDK, AppsFlyerProperties appsFlyerProperties, AFe1vSDK aFe1vSDK, AFj1kSDK aFj1kSDK, AFf1kSDK aFf1kSDK) {
        this.getMonetizationNetwork = aFd1oSDK;
        this.getMediationNetwork = aFc1kSDK;
        this.AFAdRevenueData = appsFlyerProperties;
        this.component1 = aFe1vSDK;
        this.component4 = aFj1kSDK;
        this.areAllFieldsValid = aFf1kSDK;
    }

    private static void a(String str, int i11, String str2, char c3, String str3, Object[] objArr) {
        char[] charArray;
        int i12 = $11 + 17;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            charArray = str2.toCharArray();
            $11 = ($10 + 45) % 128;
        } else {
            charArray = str2;
        }
        char[] cArr = charArray;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        AFk1hSDK aFk1hSDK = new AFk1hSDK();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c3);
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = charArray2.length;
        char[] cArr4 = new char[length3];
        aFk1hSDK.AFAdRevenueData = 0;
        while (true) {
            int i13 = aFk1hSDK.AFAdRevenueData;
            if (i13 >= length3) {
                objArr[0] = new String(cArr4);
                return;
            }
            $11 = ($10 + 105) % 128;
            int i14 = (i13 + 3) % 4;
            int i15 = cArr2[i13 % 4] * 32718;
            char c7 = cArr3[(i13 + 2) % 4];
            char c8 = (char) ((i15 + c7) % Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            aFk1hSDK.getCurrencyIso4217Code = c8;
            cArr3[i14] = (char) (((cArr2[i14] * 32718) + c7) / Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            cArr2[i14] = c8;
            cArr4[i13] = (char) (((((long) (charArray2[i13] ^ c8)) ^ (component3 ^ 3492843682015808844L)) ^ ((long) ((int) (((long) component2) ^ 3492843682015808844L)))) ^ ((long) ((char) (((long) equals) ^ 3492843682015808844L))));
            aFk1hSDK.AFAdRevenueData = i13 + 1;
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String revenue;
        String revenue2;
        AFd1mSDK aFd1mSDK = (AFd1mSDK) objArr[0];
        AFh1sSDK aFh1sSDK = (AFh1sSDK) objArr[1];
        try {
            try {
                Object[] objArr2 = {aFh1sSDK, (String) objArr[2], (AFc1fSDK) objArr[3]};
                Map map = AFa1kSDK.f9510i;
                Object method = map.get(-191513370);
                if (method == null) {
                    method = ((Class) AFa1kSDK.getMediationNetwork((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 37, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 196)).getMethod("AFAdRevenueData", AFh1sSDK.class, String.class, AFc1fSDK.class);
                    map.put(-191513370, method);
                }
                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr2);
                aFd1mSDK.getMonetizationNetwork(aFh1sSDK, bArr);
                AFj1kSDK aFj1kSDK = aFd1mSDK.component4;
                aFh1sSDK.getClass();
                boolean zAFAdRevenueData = aFh1sSDK.AFAdRevenueData();
                boolean z11 = aFh1sSDK instanceof AFh1qSDK;
                boolean z12 = aFh1sSDK instanceof AFh1nSDK;
                boolean z13 = aFh1sSDK instanceof AFh1pSDK;
                boolean z14 = aFh1sSDK instanceof AFh1hSDK;
                boolean z15 = aFh1sSDK instanceof AFh1fSDK;
                boolean z16 = aFh1sSDK instanceof AFf1aSDK;
                if (aFh1sSDK instanceof AFh1eSDK) {
                    revenue = aFj1kSDK.getMonetizationNetwork.getRevenue("https://%spia.%s/api/v1.0/pia-android-event?app_id=");
                } else if (z13 || z12) {
                    revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.getCurrencyIso4217Code);
                } else if (z11) {
                    revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.AFAdRevenueData);
                } else if (z14) {
                    toString = (copy + 9) % 128;
                    revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.component1);
                } else {
                    if (z15) {
                        int i11 = copy + 93;
                        toString = i11 % 128;
                        if (i11 % 2 != 0) {
                            aFj1kSDK.getMonetizationNetwork.getRevenue("https://%ssdk-services.%s/validate-android-signature");
                            throw null;
                        }
                        revenue2 = aFj1kSDK.getMonetizationNetwork.getRevenue("https://%ssdk-services.%s/validate-android-signature");
                        AFd1fSDK revenue3 = aFd1mSDK.getRevenue(new AFd1cSDK(revenue2, bArr, "POST", aFh1sSDK.getRevenue, aFh1sSDK.getMediationNetwork()), new AFd1aSDK());
                        copy = (toString + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
                        return revenue3;
                    }
                    if (z16) {
                        revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.component3);
                    } else if (!zAFAdRevenueData) {
                        revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.component4);
                    } else if (aFh1sSDK.component1 < 2) {
                        revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.getRevenue);
                        toString = (copy + 25) % 128;
                    } else {
                        revenue = aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.component2);
                    }
                }
                revenue2 = aFj1kSDK.getRevenue(AFj1kSDK.getMediationNetwork(aFj1kSDK.AFAdRevenueData(revenue), z11), z16);
                AFd1fSDK revenue32 = aFd1mSDK.getRevenue(new AFd1cSDK(revenue2, bArr, "POST", aFh1sSDK.getRevenue, aFh1sSDK.getMediationNetwork()), new AFd1aSDK());
                copy = (toString + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
                return revenue32;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
    }

    public final AFd1nSDK AFAdRevenueData(Map<String, Object> map, String str) {
        copy = (toString + 61) % 128;
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1kSDK.f9510i;
                Object method = map2.get(-1325765758);
                if (method == null) {
                    method = ((Class) AFa1kSDK.getMediationNetwork((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 197)).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                    map2.put(-1325765758, method);
                }
                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                if (bArr != null) {
                    return new AFd1nSDK(this.getMediationNetwork, bArr);
                }
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                int i11 = copy + 7;
                toString = i11 % 128;
                if (i11 % 2 == 0) {
                    return null;
                }
                throw null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
    }

    public final AFd1fSDK<String> getCurrencyIso4217Code(@NonNull String str, @NonNull Map<String, String> map, String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", "-1");
        map2.put("uuid", string);
        map2.put(Bayeux.KEY_DATA, map);
        map2.put("meta", (Map) getCurrencyIso4217Code(new Object[]{this}, 27881414, -27881413, System.identityHashCode(this)));
        if (str2 != null) {
            int i11 = toString + 41;
            copy = i11 % 128;
            if (i11 % 2 == 0) {
                map2.put("brand_domain", str2);
                int i12 = 97 / 0;
            } else {
                map2.put("brand_domain", str2);
            }
            copy = (toString + 13) % 128;
        }
        String string2 = AFg1lSDK.getMonetizationNetwork(map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        a("縡⪔뽔ᒪ", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "⍱\uf17a美꺶嚡ᗰ\uf25c藛鳡䢿\u2456擥", objArr);
        map3.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, string, "POST", string2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getMediationNetwork().getHostName()));
        sb2.append(ExpiryDateInput.SEPARATOR);
        sb2.append(str);
        return AFAdRevenueData(new AFd1cSDK(sb2.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), new AFd1aSDK(), true);
    }

    public final AFd1fSDK<Map<String, String>> getMediationNetwork(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getMediationNetwork().getHostName()));
        sb2.append(ExpiryDateInput.SEPARATOR);
        sb2.append(str);
        sb2.append("?id=");
        sb2.append(str2);
        String string2 = sb2.toString();
        Map map = (Map) getCurrencyIso4217Code(new Object[]{this}, 27881414, -27881413, System.identityHashCode(this));
        String strValueOf = String.valueOf(map.get("build_number"));
        HashMap map2 = new HashMap();
        map2.put("Af-UUID", uuid.toString());
        map2.put("Af-Meta-Sdk-Ver", strValueOf);
        map2.put("Af-Meta-Counter", String.valueOf(map.get("counter")));
        map2.put("Af-Meta-Model", String.valueOf(map.get("model")));
        map2.put("Af-Meta-Platform", String.valueOf(map.get("platformextension")));
        map2.put("Af-Meta-System-Version", String.valueOf(map.get("sdk")));
        Object[] objArr = new Object[1];
        a("縡⪔뽔ᒪ", ViewConfiguration.getFadingEdgeLength() >> 16, "\u0000\u0000\u0000\u0000", (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "⍱\uf17a美꺶嚡ᗰ\uf25c藛鳡䢿\u2456擥", objArr);
        map2.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, string, "GET", string, str, str2, strValueOf));
        AFd1fSDK<Map<String, String>> revenue = getRevenue(new AFd1cSDK(string2, null, "GET", map2, false), new AFd1bSDK());
        int i11 = toString + 9;
        copy = i11 % 128;
        if (i11 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    public final AFd1fSDK<String> getRevenue(Map<String, Object> map, String str) {
        byte[] bArr;
        int i11 = toString + 5;
        copy = i11 % 128;
        try {
            if (i11 % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1kSDK.f9510i;
                    Object method = map2.get(-1325765758);
                    if (method == null) {
                        method = ((Class) AFa1kSDK.getMediationNetwork((char) Gravity.getAbsoluteGravity(0, 0), 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 197 - TextUtils.getOffsetBefore("", 0))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                        map2.put(-1325765758, method);
                    }
                    bArr = (byte[]) ((Method) method).invoke(null, objArr);
                    int i12 = 17 / 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            } else {
                try {
                    Object[] objArr2 = {map, str};
                    Map map3 = AFa1kSDK.f9510i;
                    Object method2 = map3.get(-1325765758);
                    if (method2 == null) {
                        method2 = ((Class) AFa1kSDK.getMediationNetwork((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 196 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                        map3.put(-1325765758, method2);
                    }
                    bArr = (byte[]) ((Method) method2).invoke(null, objArr2);
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            }
            byte[] bArr2 = bArr;
            AFj1kSDK aFj1kSDK = this.component4;
            AFd1fSDK<String> revenue = getRevenue(new AFd1cSDK(aFj1kSDK.AFAdRevenueData(aFj1kSDK.getMonetizationNetwork.getRevenue("https://%svalidate-and-log.%s/api/v4.0/android/one_time_purchase/validateAndLog?app_id=")), bArr2, "POST", Collections.EMPTY_MAP, true), new AFd1aSDK());
            int i13 = toString + 99;
            copy = i13 % 128;
            if (i13 % 2 != 0) {
                return revenue;
            }
            throw null;
        } catch (Throwable th4) {
            AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th4, false, false);
            return null;
        }
    }

    @NonNull
    public final AFd1fSDK<AFh1cSDK> AFAdRevenueData(boolean z11, boolean z12, @NonNull String str, int i11) {
        String str2;
        AFe1vSDK aFe1vSDK = this.component1;
        str.getClass();
        String str3 = z11 ? AFe1vSDK.getMediationNetwork : AFe1vSDK.getMonetizationNetwork;
        String str4 = "";
        if (!z12) {
            str2 = "";
        } else {
            toString = (copy + 47) % 128;
            str2 = "stg";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        if (AFe1vSDK.getMediationNetwork()) {
            copy = (toString + 121) % 128;
            str4 = (String) aFe1vSDK.getRevenue.getValue();
        }
        AFd1cSDK aFd1cSDK = new AFd1cSDK(String.format(str3, Arrays.copyOf(new Object[]{str4, str2, aFe1vSDK.getCurrencyIso4217Code(), str}, 4)), "GET");
        aFd1cSDK.areAllFieldsValid = 1500;
        return getRevenue(aFd1cSDK, new AFd1eSDK());
    }

    private boolean AFAdRevenueData() {
        int i11 = toString + 49;
        copy = i11 % 128;
        int i12 = i11 % 2;
        AppsFlyerProperties appsFlyerProperties = this.AFAdRevenueData;
        if (i12 != 0 ? appsFlyerProperties.getBoolean(AppsFlyerProperties.HTTP_CACHE, true) : appsFlyerProperties.getBoolean(AppsFlyerProperties.HTTP_CACHE, false)) {
            return false;
        }
        toString = (copy + 107) % 128;
        return true;
    }

    private <T> AFd1fSDK<T> AFAdRevenueData(AFd1cSDK aFd1cSDK, AFe1wSDK<T> aFe1wSDK, boolean z11) {
        aFd1cSDK.getCurrencyIso4217Code = z11;
        AFd1oSDK aFd1oSDK = this.getMonetizationNetwork;
        AFd1fSDK<T> aFd1fSDK = new AFd1fSDK<>(aFd1cSDK, aFd1oSDK.getMonetizationNetwork, aFd1oSDK.getRevenue, aFe1wSDK);
        int i11 = toString + 29;
        copy = i11 % 128;
        if (i11 % 2 != 0) {
            return aFd1fSDK;
        }
        throw null;
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ((~(i11 | i12 | i13)) * (-301)) + (i12 * 302) + (i11 * (-300));
        int i15 = ~i12;
        int i16 = (((~((~i11) | i13)) | i15) * 301) + (((~(i15 | i13)) | (~((~i13) | i11))) * (-301)) + i14;
        return i16 != 1 ? i16 != 2 ? getMediationNetwork(objArr) : getMonetizationNetwork(objArr) : getCurrencyIso4217Code(objArr);
    }

    public final AFd1fSDK<String> getCurrencyIso4217Code(@NonNull String str) {
        AFd1cSDK aFd1cSDK = new AFd1cSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFd1cSDK.areAllFieldsValid = 10000;
        aFd1cSDK.getMonetizationNetwork = false;
        AFd1fSDK<String> revenue = getRevenue(aFd1cSDK, new AFd1aSDK());
        int i11 = copy + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        toString = i11 % 128;
        if (i11 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1mSDK aFd1mSDK = (AFd1mSDK) objArr[0];
        HashMap map = new HashMap();
        map.put("build_number", "6.18.0");
        map.put("counter", Integer.valueOf(aFd1mSDK.getMediationNetwork.getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0)));
        map.put("model", Build.MODEL);
        Object[] objArr2 = new Object[1];
        a("糯\uf4ba醲ᕼ", View.resolveSizeAndState(0, 0, 0) - 1292584324, "\u0000\u0000\u0000\u0000", (char) (TextUtils.lastIndexOf("", '0', 0) + 31890), "鷋蝗\uebe1黗⟿", objArr2);
        map.put(((String) objArr2[0]).intern(), Build.BRAND);
        map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        map.put("app_version_name", aFd1mSDK.getMediationNetwork.n_().versionName);
        map.put("app_id", aFd1mSDK.getMediationNetwork.getRevenue.getCurrencyIso4217Code.getPackageName());
        map.put("platformextension", new AFa1vSDK().getRevenue());
        int i11 = copy + 115;
        toString = i11 % 128;
        if (i11 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public final AFd1fSDK<Map<String, Object>> getRevenue(String str, String str2) {
        AFd1fSDK<Map<String, Object>> revenue = getRevenue(AFd1iSDK.getMonetizationNetwork(this.getMediationNetwork.getRevenue.getCurrencyIso4217Code.getPackageName(), AFb1iSDK.getCurrencyIso4217Code(this.getMediationNetwork.getCurrencyIso4217Code), str, str2), new AFd1gSDK());
        int i11 = toString + 91;
        copy = i11 % 128;
        if (i11 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    public final AFd1fSDK<String> getRevenue(AFh1jSDK aFh1jSDK) {
        AFd1fSDK<String> revenue = getRevenue(new AFd1cSDK(aFh1jSDK.component3, aFh1jSDK.getCurrencyIso4217Code(), "POST", aFh1jSDK.getRevenue, true), new AFd1aSDK());
        int i11 = toString + 111;
        copy = i11 % 128;
        if (i11 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    private <T> AFd1fSDK<T> getRevenue(AFd1cSDK aFd1cSDK, AFe1wSDK<T> aFe1wSDK) {
        int i11 = copy + 25;
        toString = i11 % 128;
        if (i11 % 2 == 0) {
            AFd1fSDK<T> aFd1fSDKAFAdRevenueData = AFAdRevenueData(aFd1cSDK, aFe1wSDK, AFAdRevenueData());
            copy = (toString + 105) % 128;
            return aFd1fSDKAFAdRevenueData;
        }
        AFAdRevenueData(aFd1cSDK, aFe1wSDK, AFAdRevenueData());
        throw null;
    }

    @NonNull
    public final AFd1fSDK<AFa1mSDK> getCurrencyIso4217Code(AFa1pSDK aFa1pSDK) {
        AFd1fSDK<AFa1mSDK> revenue = getRevenue(new AFd1cSDK(aFa1pSDK.component3, AFg1lSDK.getMonetizationNetwork(aFa1pSDK.AFAdRevenueData).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFa1pSDK.getMediationNetwork()), new AFa1rSDK());
        int i11 = toString + 93;
        copy = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 0 / 0;
        }
        return revenue;
    }

    public final AFd1fSDK<String> getMediationNetwork(Map<String, Object> map, String str, String str2) {
        String revenue;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1kSDK.f9510i;
            Object method = map2.get(-1325765758);
            if (method == null) {
                method = ((Class) AFa1kSDK.getMediationNetwork((char) (ViewConfiguration.getEdgeSlop() >> 16), 37 - (ViewConfiguration.getPressedStateDuration() >> 16), Gravity.getAbsoluteGravity(0, 0) + 197)).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                map2.put(-1325765758, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            copy = (toString + 51) % 128;
            AFj1kSDK aFj1kSDK = this.component4;
            if (str2 != null && str2.length() != 0 && !new Regex("4.?(\\d+)?.?(\\d+)").e(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").e(str2)) {
                revenue = aFj1kSDK.getMonetizationNetwork.getRevenue("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
            } else {
                copy = (toString + 33) % 128;
                revenue = aFj1kSDK.getMonetizationNetwork.getRevenue("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            }
            return getRevenue(new AFd1cSDK(aFj1kSDK.getRevenue(aFj1kSDK.AFAdRevenueData(revenue), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1aSDK());
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    private Map<String, Object> getRevenue() {
        return (Map) getCurrencyIso4217Code(new Object[]{this}, 27881414, -27881413, System.identityHashCode(this));
    }

    public final AFd1fSDK<String> getMediationNetwork(Map<String, Object> map, String str) {
        int i11 = copy + 63;
        toString = i11 % 128;
        try {
            if (i11 % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1kSDK.f9510i;
                    Object method = map2.get(-1325765758);
                    if (method == null) {
                        method = ((Class) AFa1kSDK.getMediationNetwork((char) TextUtils.getOffsetAfter("", 0), 37 - KeyEvent.keyCodeFromString(""), 197 - KeyEvent.normalizeMetaState(0))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                        map2.put(-1325765758, method);
                    }
                    byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                    AFj1kSDK aFj1kSDK = this.component4;
                    AFd1fSDK<String> revenue = getRevenue(new AFd1cSDK(aFj1kSDK.AFAdRevenueData(aFj1kSDK.getMonetizationNetwork.getRevenue("https://%svalidate-and-log.%s/api/v4.0/android/subscription/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1aSDK());
                    int i12 = copy + 9;
                    toString = i12 % 128;
                    if (i12 % 2 == 0) {
                        return revenue;
                    }
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFa1kSDK.f9510i;
                Object method2 = map3.get(-1325765758);
                if (method2 == null) {
                    method2 = ((Class) AFa1kSDK.getMediationNetwork((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), View.MeasureSpec.getSize(0) + 37, TextUtils.lastIndexOf("", '0') + 198)).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                    map3.put(-1325765758, method2);
                }
                throw null;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th4, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th4, false, false);
        return null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        String revenue;
        AFd1mSDK aFd1mSDK = (AFd1mSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        try {
            Object[] objArr2 = {map, str};
            Map map2 = AFa1kSDK.f9510i;
            Object method = map2.get(-1325765758);
            if (method == null) {
                method = ((Class) AFa1kSDK.getMediationNetwork((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 197 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("getCurrencyIso4217Code", Map.class, String.class);
                map2.put(-1325765758, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr2);
            int i11 = copy + 23;
            toString = i11 % 128;
            if (i11 % 2 == 0) {
                AFj1kSDK aFj1kSDK = aFd1mSDK.component4;
                if (str2 != null && str2.length() != 0 && !new Regex("4.?(\\d+)?.?(\\d+)").e(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").e(str2)) {
                    revenue = aFj1kSDK.getMonetizationNetwork.getRevenue("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                } else {
                    toString = (copy + 1) % 128;
                    revenue = aFj1kSDK.getMonetizationNetwork.getRevenue("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                }
                return aFd1mSDK.getRevenue(new AFd1cSDK(aFj1kSDK.getRevenue(aFj1kSDK.AFAdRevenueData(revenue), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1aSDK());
            }
            AFj1kSDK aFj1kSDK2 = aFd1mSDK.component4;
            throw null;
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    public static void getMediationNetwork() {
        component3 = 3492843682015808844L;
        component2 = -1434120884;
        equals = (char) 13050;
    }

    public final AFd1fSDK<String> getMediationNetwork(AFh1sSDK aFh1sSDK, String str, AFc1fSDK aFc1fSDK) {
        return (AFd1fSDK) getCurrencyIso4217Code(new Object[]{this, aFh1sSDK, str, aFc1fSDK}, -846475552, 846475554, System.identityHashCode(this));
    }

    private static String getMonetizationNetwork(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("v2");
        String currencyIso4217Code = AFj1jSDK.getCurrencyIso4217Code(strJoin, sb2.toString());
        toString = (copy + 117) % 128;
        return currencyIso4217Code;
    }

    private void getMonetizationNetwork(AFh1sSDK aFh1sSDK, byte[] bArr) {
        toString = (copy + 59) % 128;
        boolean mediationNetwork = this.getMediationNetwork.getMediationNetwork("com.appsflyer.security.enable");
        if (aFh1sSDK.getMonetizationNetwork() && mediationNetwork && AFf1kSDK.getRevenue(aFh1sSDK, this.getMediationNetwork)) {
            copy = (toString + 5) % 128;
            AFf1kSDK.getMonetizationNetwork(new Object[]{aFh1sSDK, bArr}, -254860318, 254860321, (int) System.currentTimeMillis());
        }
    }

    public final AFd1fSDK<String> getMonetizationNetwork(Map<String, Object> map, String str, String str2) {
        return (AFd1fSDK) getCurrencyIso4217Code(new Object[]{this, map, str, str2}, 158494896, -158494896, System.identityHashCode(this));
    }
}
