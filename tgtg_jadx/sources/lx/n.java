package lx;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import ax.a0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f28403a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f28404b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f28405c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f28406d = a0.a().getPackageName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SharedPreferences f28407e = a0.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SharedPreferences f28408f = a0.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList f(Context context, Object obj) {
        if (yx.a.f46339a.contains(n.class)) {
            return null;
        }
        try {
            context.getClass();
            n nVar = f28403a;
            return nVar.a(nVar.e(context, obj, "inapp"));
        } catch (Throwable th2) {
            yx.a.a(n.class, th2);
            return null;
        }
    }

    public final ArrayList a(ArrayList arrayList) {
        SharedPreferences sharedPreferences = f28408f;
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j9 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j9 / 1000) <= 86400 && !Intrinsics.areEqual(sharedPreferences.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final Class b(Context context, String str) {
        Class<?> clsLoadClass;
        HashMap map = f28405c;
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return null;
        }
        try {
            Class cls = (Class) map.get(str);
            if (cls != null) {
                return cls;
            }
            if (set.contains(u.class)) {
                clsLoadClass = null;
            } else {
                try {
                    context.getClass();
                } catch (Throwable th2) {
                    yx.a.a(u.class, th2);
                }
                try {
                    clsLoadClass = context.getClassLoader().loadClass(str);
                } catch (ClassNotFoundException unused) {
                    clsLoadClass = null;
                }
            }
            if (clsLoadClass != null) {
                map.put(str, clsLoadClass);
            }
            return clsLoadClass;
        } catch (Throwable th3) {
            yx.a.a(this, th3);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.reflect.Method c(java.lang.Class r7, java.lang.String r8) {
        /*
            r6 = this;
            java.util.Set r0 = yx.a.f46339a
            boolean r0 = r0.contains(r6)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.HashMap r0 = lx.n.f28404b     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r0.get(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L15
            return r2
        L15:
            int r2 = r8.hashCode()     // Catch: java.lang.Throwable -> L34
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            switch(r2) {
                case -1801122596: goto L68;
                case -1450694211: goto L57;
                case -1123215065: goto L47;
                case -594356707: goto L36;
                case -573310373: goto L23;
                default: goto L22;
            }
        L22:
            goto L70
        L23:
            java.lang.String r2 = "getSkuDetails"
            boolean r2 = r8.equals(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L2c
            goto L70
        L2c:
            r4.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.Class[] r2 = new java.lang.Class[]{r4, r5, r5, r3}     // Catch: java.lang.Throwable -> L34
            goto L79
        L34:
            r7 = move-exception
            goto L95
        L36:
            java.lang.String r2 = "getPurchaseHistory"
            boolean r2 = r8.equals(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L3f
            goto L70
        L3f:
            r4.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.Class[] r2 = new java.lang.Class[]{r4, r5, r5, r5, r3}     // Catch: java.lang.Throwable -> L34
            goto L79
        L47:
            java.lang.String r2 = "asInterface"
            boolean r2 = r8.equals(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L50
            goto L70
        L50:
            java.lang.Class<android.os.IBinder> r2 = android.os.IBinder.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L34
            goto L79
        L57:
            java.lang.String r2 = "isBillingSupported"
            boolean r2 = r8.equals(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L60
            goto L70
        L60:
            r4.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.Class[] r2 = new java.lang.Class[]{r4, r5, r5}     // Catch: java.lang.Throwable -> L34
            goto L79
        L68:
            java.lang.String r2 = "getPurchases"
            boolean r2 = r8.equals(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L72
        L70:
            r2 = r1
            goto L79
        L72:
            r4.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.Class[] r2 = new java.lang.Class[]{r4, r5, r5, r5}     // Catch: java.lang.Throwable -> L34
        L79:
            if (r2 != 0) goto L84
            java.lang.Class[] r2 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L34
            java.lang.reflect.Method r7 = lx.u.F(r7, r8, r2)     // Catch: java.lang.Throwable -> L34
            goto L8f
        L84:
            int r3 = r2.length     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch: java.lang.Throwable -> L34
            java.lang.Class[] r2 = (java.lang.Class[]) r2     // Catch: java.lang.Throwable -> L34
            java.lang.reflect.Method r7 = lx.u.F(r7, r8, r2)     // Catch: java.lang.Throwable -> L34
        L8f:
            if (r7 == 0) goto L94
            r0.put(r8, r7)     // Catch: java.lang.Throwable -> L34
        L94:
            return r7
        L95:
            yx.a.a(r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.n.c(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(android.content.Context r18, java.lang.Object r19) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = "inapp"
            java.util.Set r2 = yx.a.f46339a
            boolean r2 = r2.contains(r1)
            r7 = 0
            if (r2 == 0) goto Le
            return r7
        Le:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81
            r8.<init>()     // Catch: java.lang.Throwable -> L81
            r2 = r18
            r5 = r19
            boolean r3 = r1.i(r2, r5, r0)     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L9a
            r3 = 0
            r9 = r3
            r10 = r9
            r3 = r7
        L21:
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = lx.n.f28406d     // Catch: java.lang.Throwable -> L81
            android.os.Bundle r11 = new android.os.Bundle     // Catch: java.lang.Throwable -> L81
            r11.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.Object[] r6 = new java.lang.Object[]{r4, r6, r0, r3, r11}     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r4 = "getPurchaseHistory"
            java.lang.Object r3 = r1.h(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L8b
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L81
            r11 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r11
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "RESPONSE_CODE"
            int r2 = r3.getInt(r2)     // Catch: java.lang.Throwable -> L81
            if (r2 != 0) goto L8b
            java.lang.String r2 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r2 = r3.getStringArrayList(r2)     // Catch: java.lang.Throwable -> L81
            if (r2 != 0) goto L55
            goto L8b
        L55:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L81
        L59:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r6 == 0) goto L83
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L81
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: org.json.JSONException -> L59 java.lang.Throwable -> L81
            r13.<init>(r6)     // Catch: org.json.JSONException -> L59 java.lang.Throwable -> L81
            java.lang.String r14 = "purchaseTime"
            long r13 = r13.getLong(r14)     // Catch: org.json.JSONException -> L59 java.lang.Throwable -> L81
            long r13 = r13 / r11
            long r13 = r4 - r13
            r15 = 1200(0x4b0, double:5.93E-321)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 <= 0) goto L7b
            r10 = 1
            goto L83
        L7b:
            r8.add(r6)     // Catch: org.json.JSONException -> L59 java.lang.Throwable -> L81
            int r9 = r9 + 1
            goto L59
        L81:
            r0 = move-exception
            goto L9b
        L83:
            java.lang.String r2 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.Throwable -> L81
            r3 = r2
            goto L8c
        L8b:
            r3 = r7
        L8c:
            r2 = 30
            if (r9 >= r2) goto L9a
            if (r3 == 0) goto L9a
            if (r10 == 0) goto L95
            goto L9a
        L95:
            r2 = r18
            r5 = r19
            goto L21
        L9a:
            return r8
        L9b:
            yx.a.a(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.n.d(android.content.Context, java.lang.Object):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList e(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            java.util.Set r0 = yx.a.f46339a
            boolean r0 = r0.contains(r12)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            if (r14 != 0) goto L13
        L11:
            r6 = r12
            goto L66
        L13:
            boolean r2 = r12.i(r13, r14, r15)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L11
            r2 = 0
            r3 = r1
        L1b:
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = lx.n.f28406d     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r5, r15, r3}     // Catch: java.lang.Throwable -> L63
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r13 = r6.h(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L55
            if (r13 == 0) goto L58
            android.os.Bundle r13 = (android.os.Bundle) r13     // Catch: java.lang.Throwable -> L55
            java.lang.String r14 = "RESPONSE_CODE"
            int r14 = r13.getInt(r14)     // Catch: java.lang.Throwable -> L55
            if (r14 != 0) goto L58
            java.lang.String r14 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r14 = r13.getStringArrayList(r14)     // Catch: java.lang.Throwable -> L55
            if (r14 == 0) goto L66
            int r3 = r14.size()     // Catch: java.lang.Throwable -> L55
            int r2 = r2 + r3
            r0.addAll(r14)     // Catch: java.lang.Throwable -> L55
            java.lang.String r14 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r13 = r13.getString(r14)     // Catch: java.lang.Throwable -> L55
            r3 = r13
            goto L59
        L55:
            r0 = move-exception
        L56:
            r13 = r0
            goto L67
        L58:
            r3 = r1
        L59:
            r13 = 30
            if (r2 >= r13) goto L66
            if (r3 != 0) goto L60
            goto L66
        L60:
            r13 = r7
            r14 = r10
            goto L1b
        L63:
            r0 = move-exception
            r6 = r12
            goto L56
        L66:
            return r0
        L67:
            yx.a.a(r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.n.e(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z11) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                try {
                    Object objH = h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, f28406d, z11 ? "subs" : "inapp", bundle});
                    if (objH != null) {
                        Bundle bundle2 = (Bundle) objH;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    Object obj2 = arrayList.get(i11);
                                    obj2.getClass();
                                    String str = stringArrayList.get(i11);
                                    str.getClass();
                                    linkedHashMap.put(obj2, str);
                                }
                            }
                            k(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    yx.a.a(this, th);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th3) {
            th = th3;
            yx.a.a(this, th);
            return null;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodC;
        if (!yx.a.f46339a.contains(this)) {
            try {
                Class clsB = b(context, str);
                if (clsB != null && (methodC = c(clsB, str2)) != null) {
                    return u.I(clsB, obj, methodC, Arrays.copyOf(objArr, objArr.length));
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final boolean i(Context context, Object obj, String str) {
        if (!yx.a.f46339a.contains(this) && obj != null) {
            try {
                try {
                    Object objH = h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f28406d, str});
                    if (objH != null) {
                        if (((Integer) objH).intValue() == 0) {
                            return true;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    yx.a.a(this, th);
                    return false;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return false;
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String string = f28407e.getString(str, null);
                if (string != null) {
                    List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{";"}, false, 2, 2, null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listSplit$default.get(0)) < 43200) {
                        str.getClass();
                        linkedHashMap.put(str, listSplit$default.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = f28407e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis + ';' + ((String) entry.getValue()));
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
