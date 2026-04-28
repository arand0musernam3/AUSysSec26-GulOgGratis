package tx;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.webkit.CookieManager;
import com.adyen.checkout.components.core.Address;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.braze.h2;
import com.facebook.FacebookException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f40535a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f40536b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile long f40537c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile long f40538d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile String f40539e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile String f40540f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile String f40541g = "NoCarrier";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile String f40542h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile Locale f40543i;

    public static final HashMap A(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                String string = jSONObject.getString(next);
                string.getClass();
                map.put(next, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String B(Map map) {
        map.getClass();
        String string = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        string.getClass();
        return string;
    }

    public static final Bundle C(String str) {
        Bundle bundle = new Bundle();
        if (!x(str)) {
            if (str == null) {
                h2.b("Required value was null.");
                return null;
            }
            for (String str2 : (String[]) StringsKt__StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, null).toArray(new String[0])) {
                String[] strArr = (String[]) StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], ArticleContentView.UTF_8_ENCODING_TYPE), URLDecoder.decode(strArr[1], ArticleContentView.UTF_8_ENCODING_TYPE));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], ArticleContentView.UTF_8_ENCODING_TYPE), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    ax.a0 a0Var = ax.a0.f4849a;
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void D(Bundle bundle, JSONArray jSONArray) {
        bundle.getClass();
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    public static final HashMap E(Parcel parcel) {
        int i11 = parcel.readInt();
        if (i11 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i12 = 0; i12 < i11; i12++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    public static final String F(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[NewHope.SENDB_BYTES];
            while (true) {
                int i11 = inputStreamReader.read(cArr);
                if (i11 == -1) {
                    String string = sb2.toString();
                    inputStreamReader.close();
                    return string;
                }
                sb2.append(cArr, 0, i11);
            }
        } finally {
        }
    }

    public static final void G(JSONObject jSONObject, Context context) throws JSONException {
        Locale locale;
        int i11;
        int i12;
        Display display;
        context.getClass();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i13 = 0;
        if (f40536b == -1 || System.currentTimeMillis() - f40536b >= 1800000) {
            f40536b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                displayName.getClass();
                f40539e = displayName;
                String id2 = timeZone.getID();
                id2.getClass();
                f40540f = id2;
            } catch (AssertionError unused) {
            } catch (Exception unused2) {
                ax.a0 a0Var = ax.a0.f4849a;
            }
            if (Intrinsics.areEqual(f40541g, "NoCarrier")) {
                try {
                    Object systemService = context.getSystemService("phone");
                    systemService.getClass();
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    networkOperatorName.getClass();
                    f40541g = networkOperatorName;
                } catch (Exception unused3) {
                    ax.a0 a0Var2 = ax.a0.f4849a;
                }
            }
            try {
                if (Intrinsics.areEqual("mounted", Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f40537c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                }
                f40537c = Math.round(f40537c / 1.073741824E9d);
            } catch (Exception unused4) {
            }
            try {
                if (Intrinsics.areEqual("mounted", Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f40538d = ((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize());
                }
                f40538d = Math.round(f40538d / 1.073741824E9d);
            } catch (Exception unused5) {
            }
        }
        String packageName = context.getPackageName();
        int i14 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i14 = packageInfo.versionCode;
            f40542h = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused6) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i14);
        jSONArray.put(f40542h);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } catch (Exception unused7) {
            locale = Locale.getDefault();
        }
        f40543i = locale;
        StringBuilder sb2 = new StringBuilder();
        Locale locale2 = f40543i;
        String language = locale2 != null ? locale2.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale3 = f40543i;
        String country = locale3 != null ? locale3.getCountry() : null;
        sb2.append(country != null ? country : "");
        jSONArray.put(sb2.toString());
        jSONArray.put(f40539e);
        jSONArray.put(f40541g);
        double d3 = 0.0d;
        try {
            Object systemService2 = context.getSystemService("display");
            DisplayManager displayManager = systemService2 instanceof DisplayManager ? (DisplayManager) systemService2 : null;
            display = displayManager != null ? displayManager.getDisplay(0) : null;
        } catch (Exception unused8) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i15 = displayMetrics.widthPixels;
            try {
                i13 = displayMetrics.heightPixels;
                d3 = displayMetrics.density;
            } catch (Exception unused9) {
            }
            i11 = i13;
            i13 = i15;
        } else {
            i11 = 0;
        }
        jSONArray.put(i13);
        jSONArray.put(i11);
        jSONArray.put(new DecimalFormat("#.##").format(d3));
        if (f40535a > 0) {
            i12 = f40535a;
        } else {
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new a40.h(4));
                if (fileArrListFiles != null) {
                    f40535a = fileArrListFiles.length;
                }
            } catch (Exception unused10) {
                ax.a0 a0Var3 = ax.a0.f4849a;
            }
            if (f40535a <= 0) {
                f40535a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i12 = f40535a;
        }
        jSONArray.put(i12);
        jSONArray.put(f40537c);
        jSONArray.put(f40538d);
        jSONArray.put(f40540f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final String H(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.getClass();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            bArrDigest.getClass();
            for (byte b8 : bArrDigest) {
                sb2.append(Integer.toHexString((b8 >> 4) & 15));
                sb2.append(Integer.toHexString(b8 & 15));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final void I(Parcel parcel, Map map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final Uri a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        uriBuild.getClass();
        return uriBuild;
    }

    public static void b(String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) StringsKt__StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, null).toArray(new String[0])) {
            String[] strArr = (String[]) StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb2 = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i11 = 0;
                boolean z11 = false;
                while (i11 <= length) {
                    boolean z12 = Intrinsics.compare((int) str3.charAt(!z11 ? i11 : length), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z12) {
                        i11++;
                    } else {
                        z11 = true;
                    }
                }
                sb2.append(str3.subSequence(i11, length + 1).toString());
                sb2.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb2.toString());
            }
        }
        cookieManager.flush();
    }

    public static final void c(Context context) {
        context.getClass();
        try {
            b("facebook.com");
            b(".facebook.com");
            b("https://facebook.com");
            b("https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final String d(String str) {
        return x(str) ? "" : str;
    }

    public static final HashSet e(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            String string = jSONArray.getString(i11);
            string.getClass();
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final ArrayList f(JSONArray jSONArray) {
        jSONArray.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String string = jSONArray.getString(i11);
                string.getClass();
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap g(JSONObject jSONObject) {
        jSONObject.getClass();
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    String string = jSONArrayNames.getString(i11);
                    string.getClass();
                    Object objG = jSONObject.get(string);
                    if (objG instanceof JSONObject) {
                        objG = g((JSONObject) objG);
                    }
                    objG.getClass();
                    map.put(string, objG);
                } catch (JSONException unused) {
                    ax.a0 a0Var = ax.a0.f4849a;
                }
            }
        }
        return map;
    }

    public static final HashMap h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                next.getClass();
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static final int i(InputStream inputStream, FilterOutputStream filterOutputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[8192];
            int i11 = 0;
            while (true) {
                int i12 = bufferedInputStream.read(bArr);
                if (i12 == -1) {
                    bufferedInputStream.close();
                    return i11;
                }
                filterOutputStream.write(bArr, 0, i12);
                i11 += i12;
            }
        } finally {
        }
    }

    public static final void j(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static final String k(Context context) {
        return context == null ? Address.ADDRESS_NULL_PLACEHOLDER : context == context.getApplicationContext() ? PaymentMethodTypes.UNKNOWN : context.getClass().getSimpleName();
    }

    public static final String l(Context context) {
        context.getClass();
        try {
            ax.a0 a0Var = ax.a0.f4849a;
            j.n();
            String str = ax.a0.f4853e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i11 = applicationInfo.labelRes;
            if (i11 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i11);
            string.getClass();
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date m(Bundle bundle, String str, Date date) {
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (jLongValue == 0) {
            return new Date(LongCompanionObject.MAX_VALUE);
        }
        return new Date((jLongValue * 1000) + date.getTime());
    }

    public static final JSONObject n() {
        if (yx.a.f46339a.contains(n0.class)) {
            return null;
        }
        try {
            String string = ax.a0.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                    ax.a0 a0Var = ax.a0.f4849a;
                }
            }
            return null;
        } catch (Throwable th2) {
            yx.a.a(n0.class, th2);
            return null;
        }
    }

    public static final void o(final String str, final m0 m0Var) {
        String str2;
        str.getClass();
        JSONObject jSONObject = (JSONObject) i0.f40522a.get(str);
        if (jSONObject != null) {
            m0Var.d(jSONObject);
            return;
        }
        ax.c0 c0Var = new ax.c0() { // from class: tx.l0
            @Override // ax.c0
            public final void a(ax.k0 k0Var) {
                String str3 = str;
                str3.getClass();
                k0Var.getClass();
                ax.w wVar = k0Var.f4943c;
                JSONObject jSONObject2 = k0Var.f4944d;
                m0 m0Var2 = m0Var;
                if (wVar != null) {
                    m0Var2.i(wVar.f5026i);
                } else if (jSONObject2 == null) {
                    h2.b("Required value was null.");
                } else {
                    i0.f40522a.put(str3, jSONObject2);
                    m0Var2.d(jSONObject2);
                }
            }
        };
        Bundle bundle = new Bundle();
        Date date = ax.b.l;
        ax.b bVarV = pd.g.v();
        if (bVarV == null || (str2 = bVarV.f4881k) == null) {
            str2 = "facebook";
        }
        bundle.putString("fields", Intrinsics.areEqual(str2, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        ax.h0 h0Var = new ax.h0(null, "me", null, null, new ax.d(null, 1));
        h0Var.f4920d = bundle;
        h0Var.k(ax.l0.GET);
        h0Var.j(c0Var);
        h0Var.d();
    }

    public static final Method p(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method q(String str, String str2, Class... clsArr) {
        try {
            return p(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object r(String str, String str2, JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    public static final Object s(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean t() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{ax.a0.b()}, 1))));
            Context contextA = ax.a0.a();
            PackageManager packageManager = contextA.getPackageManager();
            String packageName = contextA.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            listQueryIntentActivities.getClass();
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean u(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str == null) {
            return false;
        }
        str.getClass();
        return new Regex(".+_cheets|cheets_.+").e(str);
    }

    public static final boolean v() {
        if (!yx.a.f46339a.contains(n0.class)) {
            try {
                JSONObject jSONObjectN = n();
                if (jSONObjectN != null) {
                    try {
                        JSONArray jSONArray = jSONObjectN.getJSONArray("data_processing_options");
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            String string = jSONArray.getString(i11);
                            string.getClass();
                            String lowerCase = string.toLowerCase();
                            lowerCase.getClass();
                            if (Intrinsics.areEqual(lowerCase, "ldu")) {
                                return true;
                            }
                        }
                    } catch (Exception unused) {
                        ax.a0 a0Var = ax.a0.f4849a;
                    }
                }
            } catch (Throwable th2) {
                yx.a.a(n0.class, th2);
                return false;
            }
        }
        return false;
    }

    public static boolean w(Context context) {
        Method methodQ = q("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodQ != null) {
            Object objS = s(null, methodQ, context);
            if ((objS instanceof Integer) && Intrinsics.areEqual(objS, (Object) 0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean x(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean y(Uri uri) {
        if (uri != null) {
            return "http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }

    public static final ArrayList z(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(jSONArray.getString(i11));
        }
        return arrayList;
    }
}
