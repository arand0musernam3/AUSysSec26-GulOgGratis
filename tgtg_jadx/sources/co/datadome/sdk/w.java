package co.datadome.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f8713d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f8715b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile String f8716c = "";

    public w(Context context, String str) {
        this.f8714a = context.getSharedPreferences("datadome_storage_" + str, 0);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String strB = b(defaultSharedPreferences);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        c(strB);
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.remove("PREF_COOKIES");
        editorEdit.commit();
    }

    public static synchronized w a(Context context, String str) {
        HashMap map;
        try {
            map = f8713d;
            if (!map.containsKey(str)) {
                map.put(str, new w(context, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (w) map.get(str);
    }

    public static String b(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString("PREF_COOKIES", "");
        } catch (ClassCastException unused) {
            try {
                Set<String> stringSet = sharedPreferences.getStringSet("PREF_COOKIES", null);
                if (stringSet == null) {
                    return "";
                }
                for (String str : stringSet) {
                    if (str.startsWith("datadome=")) {
                        return str;
                    }
                }
                return "";
            } catch (Exception unused2) {
                return "";
            }
        }
    }

    public final void c(String str) {
        if (DataDomeUtils.isValidCookie(str).booleanValue()) {
            String strA = m.a(str, b(this.f8714a));
            if (!TextUtils.isEmpty(strA)) {
                this.f8715b = strA;
                v.a("Store cookie: " + this.f8715b);
            }
        }
        synchronized (this) {
            try {
                if (!this.f8715b.equals(this.f8716c)) {
                    e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String d() {
        if (DataDomeUtils.isNullOrEmpty(this.f8715b).booleanValue()) {
            String strA = m.a(b(this.f8714a), null);
            if (TextUtils.isEmpty(strA)) {
                strA = "";
            }
            v.a("Retrieve cookie from disk: " + strA);
            this.f8715b = strA;
        }
        v.a("Retrieve cookie: " + this.f8715b);
        return this.f8715b;
    }

    public final void e() {
        v.a("Store cookie on disk: " + this.f8715b);
        this.f8714a.edit().putString("PREF_COOKIES", this.f8715b).apply();
        this.f8716c = this.f8715b;
    }
}
