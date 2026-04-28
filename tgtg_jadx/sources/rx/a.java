package rx;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import ax.a0;
import ax.h0;
import bx.m;
import bx.y;
import fx.h;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38242a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Object f38243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Object f38244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Object f38245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static JSONObject f38246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f38247f;

    public static final boolean a(String str, String str2) {
        HashSet hashSet = f.f38262e;
        b bVar = b.f38248a;
        String str3 = null;
        if (!yx.a.f46339a.contains(b.class)) {
            try {
                LinkedHashMap linkedHashMap = b.f38249b;
                if (linkedHashMap.containsKey(str)) {
                    str3 = (String) linkedHashMap.get(str);
                }
            } catch (Throwable th2) {
                yx.a.a(b.class, th2);
            }
        }
        if (str3 == null) {
            return false;
        }
        int i11 = 1;
        if (!Intrinsics.areEqual(str3, "other")) {
            try {
                a0.c().execute(new y(str3, str2, i11));
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public static void b(View view, View view2, String str) {
        HashSet hashSet;
        Field declaredField;
        Field declaredField2;
        Object obj;
        view.getClass();
        str.getClass();
        int iHashCode = view.hashCode();
        HashSet hashSet2 = f.f38262e;
        HashSet hashSet3 = null;
        if (yx.a.f46339a.contains(f.class)) {
            hashSet = null;
        } else {
            try {
                hashSet = f.f38262e;
            } catch (Throwable th2) {
                yx.a.a(f.class, th2);
                hashSet = null;
            }
        }
        if (hashSet.contains(Integer.valueOf(iHashCode))) {
            return;
        }
        f fVar = new f(view, view2, str);
        if (!yx.a.f46339a.contains(h.class)) {
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    declaredField = null;
                }
                if (declaredField == null || declaredField2 == null) {
                    view.setOnClickListener(fVar);
                } else {
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    try {
                        declaredField.setAccessible(true);
                        obj = declaredField.get(view);
                    } catch (IllegalAccessException unused3) {
                        obj = null;
                    }
                    if (obj == null) {
                        view.setOnClickListener(fVar);
                    } else {
                        declaredField2.set(obj, fVar);
                    }
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                yx.a.a(h.class, th3);
            }
        }
        if (!yx.a.f46339a.contains(f.class)) {
            try {
                hashSet3 = f.f38262e;
            } catch (Throwable th4) {
                yx.a.a(f.class, th4);
            }
        }
        hashSet3.add(Integer.valueOf(iHashCode));
    }

    public static final float[] c(String str, JSONObject jSONObject) {
        String lowerCase;
        JSONObject jSONObject2;
        String strOptString;
        JSONArray jSONArray;
        a aVar;
        JSONObject jSONObjectD;
        if (!yx.a.f46339a.contains(a.class)) {
            try {
                str.getClass();
                if (f38247f) {
                    float[] fArr = new float[30];
                    for (int i11 = 0; i11 < 30; i11++) {
                        fArr[i11] = 0.0f;
                    }
                    try {
                        lowerCase = str.toLowerCase();
                        lowerCase.getClass();
                        jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                        strOptString = jSONObject.optString("screenname");
                        jSONArray = new JSONArray();
                        aVar = f38242a;
                        aVar.k(jSONObject2, jSONArray);
                        aVar.n(fArr, aVar.i(jSONObject2));
                        jSONObjectD = aVar.d(jSONObject2);
                    } catch (JSONException unused) {
                    }
                    if (jSONObjectD != null) {
                        strOptString.getClass();
                        String string = jSONObject2.toString();
                        string.getClass();
                        aVar.n(fArr, aVar.h(jSONObjectD, jSONArray, strOptString, string, lowerCase));
                        return fArr;
                    }
                }
            } catch (Throwable th2) {
                yx.a.a(a.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final String e(String str, String str2, String str3) {
        if (yx.a.f46339a.contains(a.class)) {
            return null;
        }
        try {
            str.getClass();
            str2.getClass();
            str3.getClass();
            String lowerCase = (str3 + " | " + str2 + ", " + str).toLowerCase();
            lowerCase.getClass();
            return lowerCase;
        } catch (Throwable th2) {
            yx.a.a(a.class, th2);
            return null;
        }
    }

    public static final void f(File file) {
        if (yx.a.f46339a.contains(a.class)) {
            return;
        }
        try {
            try {
                f38246e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f38246e = new JSONObject(new String(bArr, Charsets.UTF_8));
                f38243b = x0.e(new Pair("ENGLISH", "1"), new Pair("GERMAN", "2"), new Pair("SPANISH", "3"), new Pair("JAPANESE", "4"));
                f38244c = x0.e(new Pair("VIEW_CONTENT", "0"), new Pair("SEARCH", "1"), new Pair("ADD_TO_CART", "2"), new Pair("ADD_TO_WISHLIST", "3"), new Pair("INITIATE_CHECKOUT", "4"), new Pair("ADD_PAYMENT_INFO", "5"), new Pair("PURCHASE", "6"), new Pair("LEAD", "7"), new Pair("COMPLETE_REGISTRATION", "8"));
                f38245d = x0.e(new Pair("BUTTON_TEXT", "1"), new Pair("PAGE_TITLE", "2"), new Pair("RESOLVED_DOCUMENT_LINK", "3"), new Pair("BUTTON_ID", "4"));
                f38247f = true;
            } catch (Throwable th2) {
                yx.a.a(a.class, th2);
            }
        } catch (Exception unused) {
        }
    }

    public static void j(String str, String str2, float[] fArr) {
        boolean zContains;
        boolean zContains2;
        d dVar = d.f38254a;
        if (yx.a.f46339a.contains(d.class)) {
            zContains = false;
        } else {
            try {
                str.getClass();
                zContains = d.f38256c.contains(str);
            } catch (Throwable th2) {
                yx.a.a(d.class, th2);
                zContains = false;
            }
        }
        if (zContains) {
            m mVar = new m(a0.a(), (String) null);
            if (yx.a.f46339a.contains(mVar)) {
                return;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                mVar.d(bundle, str);
                return;
            } catch (Throwable th3) {
                yx.a.a(mVar, th3);
                return;
            }
        }
        if (yx.a.f46339a.contains(d.class)) {
            zContains2 = false;
        } else {
            try {
                str.getClass();
                zContains2 = d.f38257d.contains(str);
            } catch (Throwable th4) {
                yx.a.a(d.class, th4);
                zContains2 = false;
            }
        }
        if (zContains2) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                for (float f11 : fArr) {
                    sb2.append(f11);
                    sb2.append(MessageLogView.COMMA_SEPARATOR);
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", str2);
                bundle2.putString("metadata", jSONObject.toString());
                String str3 = h0.f4915j;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                h0 h0VarZ = qb.e.z(null, String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{a0.b()}, 1)), null, null);
                h0VarZ.f4920d = bundle2;
                h0VarZ.c();
            } catch (JSONException unused) {
            }
        }
    }

    public JSONObject d(JSONObject jSONObject) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                jSONObject2.getClass();
                JSONObject jSONObjectD = d(jSONObject2);
                if (jSONObjectD != null) {
                    return jSONObjectD;
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
        return null;
    }

    public boolean g(String[] strArr, String[] strArr2) {
        if (!yx.a.f46339a.contains(this)) {
            try {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (StringsKt.z(str2, str, false)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float[] h(org.json.JSONObject r19, org.json.JSONArray r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.a.h(org.json.JSONObject, org.json.JSONArray, java.lang.String, java.lang.String, java.lang.String):float[]");
    }

    public float[] i(JSONObject jSONObject) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String strOptString = jSONObject.optString(TextBundle.TEXT_ENTRY);
            strOptString.getClass();
            String lowerCase = strOptString.toLowerCase();
            lowerCase.getClass();
            String strOptString2 = jSONObject.optString("hint");
            strOptString2.getClass();
            String lowerCase2 = strOptString2.toLowerCase();
            lowerCase2.getClass();
            String strOptString3 = jSONObject.optString("classname");
            strOptString3.getClass();
            String lowerCase3 = strOptString3.toLowerCase();
            lowerCase3.getClass();
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (StringsKt.z(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (StringsKt.z(lowerCase3, "radio", false) && StringsKt.z(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i12);
                    jSONObject2.getClass();
                    n(fArr, i(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public boolean k(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z11;
        if (!yx.a.f46339a.contains(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return true;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z11 = false;
                        break;
                    }
                    if (jSONArrayOptJSONArray.getJSONObject(i11).optBoolean("is_interacted")) {
                        z11 = true;
                        break;
                    }
                    i11++;
                }
                boolean z12 = z11;
                JSONArray jSONArray2 = new JSONArray();
                if (z11) {
                    int length2 = jSONArrayOptJSONArray.length();
                    for (int i12 = 0; i12 < length2; i12++) {
                        jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i12));
                    }
                    return z12;
                }
                int length3 = jSONArrayOptJSONArray.length();
                for (int i13 = 0; i13 < length3; i13++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i13);
                    jSONObject2.getClass();
                    if (k(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z12 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
                return z12;
            } catch (JSONException unused) {
            } catch (Throwable th2) {
                yx.a.a(this, th2);
            }
        }
        return false;
    }

    public boolean l(String str, String str2) {
        if (yx.a.f46339a.contains(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public boolean m(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (!yx.a.f46339a.contains(this)) {
            try {
                JSONObject jSONObject = f38246e;
                String strOptString = null;
                ?? r32 = 0;
                strOptString = null;
                strOptString = null;
                strOptString = null;
                strOptString = null;
                if (jSONObject == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rules");
                    jSONObject = null;
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
                if (jSONObjectOptJSONObject3 != null) {
                    Object obj = f38243b;
                    ?? r42 = obj;
                    if (obj == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("languageInfo");
                        r42 = 0;
                    }
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject((String) r42.get("ENGLISH"));
                    if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                        Object obj2 = f38244c;
                        ?? r12 = obj2;
                        if (obj2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventInfo");
                            r12 = 0;
                        }
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject((String) r12.get(str));
                        if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                            Object obj3 = f38245d;
                            if (obj3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textTypeInfo");
                            } else {
                                r32 = obj3;
                            }
                            strOptString = jSONObjectOptJSONObject2.optString((String) r32.get(str2));
                        }
                    }
                }
                if (strOptString != null) {
                    return l(strOptString, str3);
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return false;
            }
        }
        return false;
    }

    public void n(float[] fArr, float[] fArr2) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                fArr[i11] = fArr[i11] + fArr2[i11];
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public void o(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString(TextBundle.TEXT_ENTRY, "");
            strOptString.getClass();
            String lowerCase = strOptString.toLowerCase();
            lowerCase.getClass();
            String strOptString2 = jSONObject.optString("hint", "");
            strOptString2.getClass();
            String lowerCase2 = strOptString2.toLowerCase();
            lowerCase2.getClass();
            if (lowerCase.length() > 0) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                    jSONObject2.getClass();
                    o(jSONObject2, sb2, sb3);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
