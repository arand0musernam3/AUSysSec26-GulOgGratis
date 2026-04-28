package co.datadome.sdk;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DataDomeUtils {
    public static String a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                for (String str2 : ((String) it.next()).split(";")) {
                    String strTrim = str2.trim();
                    if (strTrim.startsWith("datadome=")) {
                        arrayList.add("datadome=" + str);
                        z12 = true;
                    } else {
                        arrayList.add(strTrim);
                    }
                }
            }
            z11 = z12;
        }
        if (!z11) {
            arrayList.add("datadome=" + str);
        }
        return String.join("; ", arrayList);
    }

    public static String b(Map map) {
        for (String str : map.keySet()) {
            if (str.equalsIgnoreCase("Content-type")) {
                return (String) map.get(str);
            }
        }
        return null;
    }

    public static void c(final String str, final List list, final int i11, final ValueCallback valueCallback) {
        if (i11 >= list.size()) {
            valueCallback.onReceiveValue(Boolean.TRUE);
            return;
        }
        String str2 = (String) list.get(i11);
        if (TextUtils.isEmpty(str2)) {
            c(str, list, i11 + 1, valueCallback);
        } else {
            CookieManager.getInstance().setCookie(str, str2, new ValueCallback() { // from class: co.datadome.sdk.g
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    DataDomeUtils.c(str, list, i11 + 1, valueCallback);
                }
            });
        }
    }

    public static void d(String str, List list, ValueCallback valueCallback) {
        if (list == null || list.isEmpty()) {
            valueCallback.onReceiveValue(Boolean.FALSE);
        } else {
            c(str, list, 0, valueCallback);
        }
    }

    public static String e(String str) {
        String[] strArrSplit = str.split("=");
        return strArrSplit.length > 1 ? strArrSplit[1].contains(";") ? strArrSplit[1].split(";")[0] : strArrSplit[1] : "";
    }

    @NonNull
    public static Boolean isNullOrEmpty(String str) {
        return str == null ? Boolean.TRUE : Boolean.valueOf(str.isEmpty());
    }

    @NonNull
    public static Boolean isValidCookie(String str) {
        return str == null ? Boolean.FALSE : !str.startsWith("datadome=") ? Boolean.FALSE : Boolean.valueOf(!isNullOrEmpty(e(str)).booleanValue());
    }

    public static Boolean isValidParameter(String str) {
        return Boolean.valueOf((str == null || str.trim().isEmpty()) ? false : true);
    }
}
