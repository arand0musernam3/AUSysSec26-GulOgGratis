package qb;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MenuItem;
import ax.a0;
import ax.b0;
import ax.c0;
import ax.d0;
import ax.g0;
import ax.h0;
import ax.j0;
import ax.l0;
import ax.m0;
import com.braze.Constants;
import com.facebook.FacebookException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import i4.k0;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tx.f0;
import tx.n0;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d10.f, y8.b, ax.i, ba0.l, o.j, nf.f, ke.b {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A(org.json.JSONObject r6, java.lang.String r7, ax.d0 r8) {
        /*
            java.util.regex.Pattern r0 = ax.h0.f4916k
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r1 = r0.matches()
            r2 = 1
            if (r1 == 0) goto L15
            java.lang.String r0 = r0.group(r2)
            r0.getClass()
            goto L16
        L15:
            r0 = r7
        L16:
            java.lang.String r1 = "me/"
            r3 = 0
            boolean r1 = kotlin.text.y.p(r0, r1, r3)
            if (r1 != 0) goto L2a
            java.lang.String r1 = "/me/"
            boolean r0 = kotlin.text.y.p(r0, r1, r3)
            if (r0 == 0) goto L28
            goto L2a
        L28:
            r7 = r3
            goto L40
        L2a:
            java.lang.String r0 = ":"
            r1 = 6
            int r0 = kotlin.text.StringsKt.G(r7, r0, r3, r3, r1)
            java.lang.String r4 = "?"
            int r7 = kotlin.text.StringsKt.G(r7, r4, r3, r3, r1)
            r1 = 3
            if (r0 <= r1) goto L28
            r1 = -1
            if (r7 == r1) goto L3f
            if (r0 >= r7) goto L28
        L3f:
            r7 = r2
        L40:
            java.util.Iterator r0 = r6.keys()
        L44:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r6.opt(r1)
            if (r7 == 0) goto L60
            java.lang.String r5 = "image"
            boolean r5 = kotlin.text.y.k(r1, r5, r2)
            if (r5 == 0) goto L60
            r5 = r2
            goto L61
        L60:
            r5 = r3
        L61:
            r1.getClass()
            r4.getClass()
            B(r1, r4, r8, r5)
            goto L44
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.e.A(org.json.JSONObject, java.lang.String, ax.d0):void");
    }

    public static void B(String str, Object obj, d0 d0Var, boolean z11) {
        Class<?> cls = obj.getClass();
        if (!JSONObject.class.isAssignableFrom(cls)) {
            if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11)}, 2));
                    Object objOpt = jSONArray.opt(i11);
                    objOpt.getClass();
                    B(str2, objOpt, d0Var, z11);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                d0Var.a(str, obj.toString());
                return;
            }
            if (!Date.class.isAssignableFrom(cls)) {
                String str3 = h0.f4915j;
                a0 a0Var = a0.f4849a;
                return;
            } else {
                String str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                str4.getClass();
                d0Var.a(str, str4);
                return;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (z11) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str5 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                Object objOpt2 = jSONObject.opt(next);
                objOpt2.getClass();
                B(str5, objOpt2, d0Var, z11);
            }
            return;
        }
        if (jSONObject.has("id")) {
            String strOptString = jSONObject.optString("id");
            strOptString.getClass();
            B(str, strOptString, d0Var, z11);
        } else if (jSONObject.has(Constants.BRAZE_WEBVIEW_URL_EXTRA)) {
            String strOptString2 = jSONObject.optString(Constants.BRAZE_WEBVIEW_URL_EXTRA);
            strOptString2.getClass();
            B(str, strOptString2, d0Var, z11);
        } else if (jSONObject.has("fbsdk:create_object")) {
            String string = jSONObject.toString();
            string.getClass();
            B(str, string, d0Var, z11);
        }
    }

    public static void D(j0 j0Var, f0 f0Var, int i11, URL url, FilterOutputStream filterOutputStream, boolean z11) throws JSONException {
        String strB;
        ax.f0 f0Var2 = new ax.f0();
        f0Var2.f4906c = filterOutputStream;
        f0Var2.f4907d = f0Var;
        f0Var2.f4904a = true;
        f0Var2.f4905b = z11;
        if (i11 == 1) {
            h0 h0Var = (h0) j0Var.f4938c.get(0);
            HashMap map = new HashMap();
            for (String str : h0Var.f4920d.keySet()) {
                Object obj = h0Var.f4920d.get(str);
                if (w(obj)) {
                    str.getClass();
                    map.put(str, new b0(h0Var, obj));
                }
            }
            f0Var.a();
            Bundle bundle = h0Var.f4920d;
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (x(obj2)) {
                    str2.getClass();
                    f0Var2.m(str2, obj2, h0Var);
                }
            }
            f0Var.a();
            F(map, f0Var2);
            JSONObject jSONObject = h0Var.f4919c;
            if (jSONObject != null) {
                String path = url.getPath();
                path.getClass();
                A(jSONObject, path, f0Var2);
                return;
            }
            return;
        }
        j0Var.getClass();
        Iterator<E> it = j0Var.iterator();
        while (true) {
            if (it.hasNext()) {
                ax.b bVar = ((h0) it.next()).f4917a;
                if (bVar != null) {
                    strB = bVar.f4878h;
                    break;
                }
            } else {
                String str3 = h0.f4915j;
                strB = a0.b();
                break;
            }
        }
        if (strB.length() == 0) {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        f0Var2.a("batch_app_id", strB);
        HashMap map2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = j0Var.iterator();
        while (it2.hasNext()) {
            h0 h0Var2 = (h0) it2.next();
            h0Var2.getClass();
            String str4 = h0.f4915j;
            JSONObject jSONObject2 = new JSONObject();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strH = h0Var2.h(String.format("https://graph.%s", Arrays.copyOf(new Object[]{a0.e()}, 1)));
            h0Var2.a();
            Uri uri = Uri.parse(h0Var2.b(strH, true));
            String str5 = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
            jSONObject2.put("relative_url", str5);
            jSONObject2.put("method", h0Var2.f4924h);
            ax.b bVar2 = h0Var2.f4917a;
            if (bVar2 != null) {
                f0.f40508d.B(bVar2.f4875e);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it3 = h0Var2.f4920d.keySet().iterator();
            while (it3.hasNext()) {
                Object obj3 = h0Var2.f4920d.get(it3.next());
                if (w(obj3)) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str6 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map2.size())}, 2));
                    arrayList.add(str6);
                    map2.put(str6, new b0(h0Var2, obj3));
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject2.put("attached_files", TextUtils.join(MessageLogView.COMMA_SEPARATOR, arrayList));
            }
            JSONObject jSONObject3 = h0Var2.f4919c;
            if (jSONObject3 != null) {
                ArrayList arrayList2 = new ArrayList();
                A(jSONObject3, str5, new g0(arrayList2));
                jSONObject2.put("body", TextUtils.join("&", arrayList2));
            }
            jSONArray.put(jSONObject2);
        }
        String string = jSONArray.toString();
        string.getClass();
        f0Var2.a("batch", string);
        f0Var.a();
        F(map2, f0Var2);
    }

    public static void E(j0 j0Var, ArrayList arrayList) {
        j0Var.getClass();
        ArrayList arrayList2 = j0Var.f4938c;
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            h0 h0Var = (h0) arrayList2.get(i11);
            if (h0Var.f4923g != null) {
                arrayList3.add(new Pair(h0Var.f4923g, arrayList.get(i11)));
            }
        }
        if (arrayList3.size() > 0) {
            a40.l lVar = new a40.l(17, arrayList3, j0Var);
            Handler handler = j0Var.f4936a;
            if (handler != null) {
                handler.post(lVar);
            } else {
                lVar.run();
            }
        }
    }

    public static void F(HashMap map, ax.f0 f0Var) {
        for (Map.Entry entry : map.entrySet()) {
            String str = h0.f4915j;
            if (w(((b0) entry.getValue()).f4883b)) {
                f0Var.m((String) entry.getKey(), ((b0) entry.getValue()).f4883b, ((b0) entry.getValue()).f4882a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void G(ax.j0 r11, java.net.HttpURLConnection r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.e.G(ax.j0, java.net.HttpURLConnection):void");
    }

    public static HttpURLConnection H(j0 j0Var) throws Throwable {
        URL url;
        j0Var.getClass();
        Iterator<E> it = j0Var.iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            if (l0.GET == h0Var.f4924h && n0.x(h0Var.f4920d.getString("fields"))) {
                l50.a aVar = f0.f40508d;
                m0.DEVELOPER_ERRORS.getClass();
                synchronized (a0.f4850b) {
                }
            }
        }
        try {
            if (j0Var.f4938c.size() == 1) {
                url = new URL(((h0) j0Var.f4938c.get(0)).g());
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                url = new URL(String.format("https://graph.%s", Arrays.copyOf(new Object[]{a0.e()}, 1)));
            }
            HttpURLConnection httpURLConnectionT = null;
            try {
                httpURLConnectionT = t(url);
                G(j0Var, httpURLConnectionT);
                return httpURLConnectionT;
            } catch (IOException e5) {
                n0.j(httpURLConnectionT);
                throw new FacebookException("could not construct request body", e5);
            } catch (JSONException e11) {
                n0.j(httpURLConnectionT);
                throw new FacebookException("could not construct request body", e11);
            }
        } catch (MalformedURLException e12) {
            throw new FacebookException("could not construct URL for request", e12);
        }
    }

    public static k0 I(List list, float f11, float f12, int i11) {
        return new k0(list, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i11 & 2) != 0 ? 0.0f : f11)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i11 & 4) != 0 ? Float.POSITIVE_INFINITY : f12)) & 4294967295L));
    }

    public static final CharSequence J(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final String m(ia0.j jVar, ia0.j[] jVarArr, int i11) {
        int i12;
        boolean z11;
        int i13;
        int i14;
        ia0.j jVar2 = da0.c.f14858b;
        int iE = jVar.e();
        int i15 = 0;
        while (i15 < iE) {
            int i16 = (i15 + iE) / 2;
            while (i16 > -1 && jVar.j(i16) != 10) {
                i16--;
            }
            int i17 = i16 + 1;
            int i18 = 1;
            while (true) {
                i12 = i17 + i18;
                if (jVar.j(i12) == 10) {
                    break;
                }
                i18++;
            }
            int i19 = i12 - i17;
            int i21 = i11;
            boolean z12 = false;
            int i22 = 0;
            int i23 = 0;
            while (true) {
                if (z12) {
                    i13 = 46;
                    z11 = false;
                } else {
                    byte bJ = jVarArr[i21].j(i22);
                    byte[] bArr = r90.e.f37811a;
                    int i24 = bJ & 255;
                    z11 = z12;
                    i13 = i24;
                }
                byte bJ2 = jVar.j(i17 + i23);
                byte[] bArr2 = r90.e.f37811a;
                i14 = i13 - (bJ2 & 255);
                if (i14 != 0) {
                    break;
                }
                i23++;
                i22++;
                if (i23 == i19) {
                    break;
                }
                if (jVarArr[i21].e() != i22) {
                    z12 = z11;
                } else {
                    if (i21 == jVarArr.length - 1) {
                        break;
                    }
                    i21++;
                    i22 = -1;
                    z12 = true;
                }
            }
            if (i14 >= 0) {
                if (i14 <= 0) {
                    int i25 = i19 - i23;
                    int iE2 = jVarArr[i21].e() - i22;
                    int length = jVarArr.length;
                    for (int i26 = i21 + 1; i26 < length; i26++) {
                        iE2 += jVarArr[i26].e();
                    }
                    if (iE2 >= i25) {
                        if (iE2 <= i25) {
                            return jVar.p(i17, i19 + i17).o(Charsets.UTF_8);
                        }
                    }
                }
                i15 = i12 + 1;
            }
            iE = i16;
        }
        return null;
    }

    public static final void n(ia0.d dVar) {
        androidx.constraintlayout.widget.z zVar = ia0.d.f23614h;
        if (ia0.d.f23615i == null) {
            ia0.d.f23615i = new ia0.d();
            ia0.c cVar = new ia0.c("Okio Watchdog");
            cVar.setDaemon(true);
            cVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j9 = dVar.f23660c;
        boolean z11 = dVar.f23658a;
        if (j9 != 0 && z11) {
            dVar.f23621g = Math.min(j9, dVar.c() - jNanoTime) + jNanoTime;
        } else if (j9 != 0) {
            dVar.f23621g = jNanoTime + j9;
        } else {
            if (!z11) {
                throw new AssertionError();
            }
            dVar.f23621g = dVar.c();
        }
        androidx.constraintlayout.widget.z zVar2 = ia0.d.f23614h;
        int i11 = zVar2.f2542b + 1;
        zVar2.f2542b = i11;
        ia0.d[] dVarArr = (ia0.d[]) zVar2.f2543c;
        if (i11 == dVarArr.length) {
            ia0.d[] dVarArr2 = new ia0.d[i11 * 2];
            kotlin.collections.x.i(0, 0, 14, dVarArr, dVarArr2);
            zVar2.f2543c = dVarArr2;
        }
        zVar2.k(i11, dVar);
        if (dVar.f23620f == 1) {
            ia0.d.f23617k.signal();
        }
    }

    public static final String o(Object obj) {
        String str = h0.f4915j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (!(obj instanceof Date)) {
            i4.a.f("Unsupported parameter type.");
            return null;
        }
        String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
        str2.getClass();
        return str2;
    }

    public static ArrayList p(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q90.f0) obj) != q90.f0.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((q90.f0) it.next()).toString());
        }
        return arrayList2;
    }

    public static ia0.d r() throws InterruptedException {
        androidx.constraintlayout.widget.z zVar = ia0.d.f23614h;
        ia0.d dVar = ((ia0.d[]) zVar.f2543c)[1];
        if (dVar == null) {
            long jNanoTime = System.nanoTime();
            ia0.d.f23617k.await(ia0.d.l, TimeUnit.MILLISECONDS);
            if (((ia0.d[]) zVar.f2543c)[1] != null || System.nanoTime() - jNanoTime < ia0.d.f23618m) {
                return null;
            }
            return ia0.d.f23615i;
        }
        long jNanoTime2 = dVar.f23621g - System.nanoTime();
        if (jNanoTime2 > 0) {
            ia0.d.f23617k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        zVar.o(dVar);
        dVar.f23619e = 2;
        return dVar;
    }

    public static byte[] s(List list) {
        list.getClass();
        ia0.g gVar = new ia0.g();
        for (String str : p(list)) {
            gVar.z0(str.length());
            gVar.F0(str);
        }
        return gVar.O(gVar.f23643b);
    }

    public static HttpURLConnection t(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        if (h0.l == null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            h0.l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.2.3"}, 2));
        }
        httpURLConnection.setRequestProperty("User-Agent", h0.l);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    public static ArrayList u(j0 j0Var) throws Throwable {
        Exception exc;
        HttpURLConnection httpURLConnectionH;
        ArrayList arrayListV;
        j0Var.getClass();
        tx.j.l(j0Var);
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionH = H(j0Var);
            exc = null;
        } catch (Exception e5) {
            exc = e5;
            httpURLConnectionH = null;
        } catch (Throwable th2) {
            th = th2;
            n0.j(httpURLConnection);
            throw th;
        }
        try {
            if (httpURLConnectionH != null) {
                arrayListV = v(j0Var, httpURLConnectionH);
            } else {
                ArrayList arrayListZ = w.b.z(j0Var.f4938c, null, new FacebookException(exc));
                E(j0Var, arrayListZ);
                arrayListV = arrayListZ;
            }
            n0.j(httpURLConnectionH);
            return arrayListV;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = httpURLConnectionH;
            n0.j(httpURLConnection);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0030 A[EXC_TOP_SPLITTER, PHI: r0 r2
      0x0030: PHI (r0v4 java.util.ArrayList) = (r0v2 java.util.ArrayList), (r0v3 java.util.ArrayList), (r0v9 java.util.ArrayList) binds: [B:29:0x005a, B:31:0x006a, B:19:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r2v1 java.io.InputStream) = (r2v0 java.io.InputStream), (r2v0 java.io.InputStream), (r2v5 java.io.InputStream) binds: [B:29:0x005a, B:31:0x006a, B:19:0x002e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList v(ax.j0 r7, java.net.HttpURLConnection r8) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.e.v(ax.j0, java.net.HttpURLConnection):java.util.ArrayList");
    }

    public static boolean w(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ax.e0);
    }

    public static boolean x(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static h0 y(ax.b bVar, String str, c0 c0Var) {
        return new h0(bVar, str, null, null, c0Var);
    }

    public static h0 z(ax.b bVar, String str, JSONObject jSONObject, c0 c0Var) {
        h0 h0Var = new h0(bVar, str, null, l0.POST, c0Var);
        h0Var.f4919c = jSONObject;
        return h0Var;
    }

    public List C(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (u30.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f40670a;
            if (str != null) {
                bVar = new u30.b(str, bVar.f40671b, bVar.f40672c, bVar.f40673d, bVar.f40674e, new a50.d(16, str, bVar), bVar.f40676g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // ba0.l
    public boolean a(SSLSocket sSLSocket) {
        return kotlin.text.y.p(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // ke.b
    public boolean b(float f11) {
        throw new IllegalStateException("not implemented");
    }

    @Override // ke.b
    public we.a c() {
        throw new IllegalStateException("not implemented");
    }

    @Override // ke.b
    public boolean d(float f11) {
        return false;
    }

    @Override // nf.f
    public hf.g e(ye.b bVar) {
        ye.g gVar = bVar.f45852a;
        SharedPreferences sharedPreferences = gVar.f45887b.getSharedPreferences("amplitude-events-" + gVar.f45890e, 0);
        String str = gVar.f45890e;
        kf.b bVarV = gVar.f45892g.v(bVar);
        sharedPreferences.getClass();
        return new hf.g(str, bVarV, sharedPreferences, new File(gVar.a(), "events"), bVar.f45863m, new hf.a(bVar, 0));
    }

    @Override // ba0.l
    public ba0.n f(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                i4.a.d(w.a0.k(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                return null;
            }
        }
        return new ba0.e(superclass);
    }

    @Override // ke.b
    public float g() {
        return 1.0f;
    }

    @Override // d10.f
    public Task h(Object obj) {
        return Tasks.d(Boolean.TRUE);
    }

    @Override // ax.i
    public String i() {
        return "ig_refresh_token";
    }

    @Override // ke.b
    public boolean isEmpty() {
        return true;
    }

    @Override // o.j
    public boolean j(o.l lVar, MenuItem menuItem) {
        return false;
    }

    @Override // ax.i
    public String k() {
        return "refresh_access_token";
    }

    @Override // ke.b
    public float l() {
        return 0.0f;
    }

    @Override // o.j
    public void q(o.l lVar) {
    }
}
