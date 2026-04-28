package c40;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f7061a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7062b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7063c;

    public e(int i11) {
        this.f7063c = i11;
    }

    public static String a(int i11, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i11) {
                return str.substring(0, i11);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String strA = a(this.f7063c, str);
        if (this.f7061a.size() >= this.f7062b && !this.f7061a.containsKey(strA)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f7062b, null);
            return false;
        }
        String strA2 = a(this.f7063c, str2);
        String str3 = (String) this.f7061a.get(strA);
        if (str3 == null ? strA2 == null : str3.equals(strA2)) {
            return false;
        }
        HashMap map = this.f7061a;
        if (str2 == null) {
            strA2 = "";
        }
        map.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.f7063c, str);
                if (this.f7061a.size() < this.f7062b || this.f7061a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.f7061a.put(strA, str2 == null ? "" : a(this.f7063c, str2));
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i11 + " entries when adding custom keys. Maximum allowable: " + this.f7062b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
