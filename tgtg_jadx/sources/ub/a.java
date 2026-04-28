package ub;

import a40.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b0.n2;
import b0.o2;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.app.tgtg.R;
import e0.v;
import f0.t0;
import h2.s0;
import he.k0;
import j4.s;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.zip.GZIPOutputStream;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import lx.u;
import m3.k1;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONException;
import org.json.JSONObject;
import qc.f;
import qc.y;
import u70.e;
import v1.g;
import v40.d;
import v80.i0;
import vf.j;
import x.k;
import xc.h;
import y00.g0;
import y00.g2;
import y00.n1;
import y00.t2;
import y00.w0;
import y00.y3;
import y3.i;
import zc.n;
import zc.o;
import zc.r;
import zendesk.core.android.internal.DateKtxConstants;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class a implements k, h, i, ha.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f40981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f40982c;

    public a(xf.b bVar) throws IOException {
        this.f40980a = 19;
        this.f40981b = bVar;
        File file = bVar.f44248d;
        u.y(file);
        t5.a aVar = new t5.a(file, bVar.f44249e, bVar.f44250f);
        this.f40982c = aVar;
        File file2 = (File) aVar.f39793d;
        if (file2.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    ((Properties) aVar.f39792c).load(fileInputStream);
                    fileInputStream.close();
                } finally {
                }
            } catch (Throwable th2) {
                file2.delete();
                kf.b bVar2 = (kf.b) aVar.f39791b;
                if (bVar2 != null) {
                    bVar2.a("Failed to load property file with path " + file2.getAbsolutePath() + ", error stacktrace: " + e.b(th2));
                }
                file2.getParentFile().mkdirs();
                file2.createNewFile();
            }
        } else {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        t5.a aVar2 = (t5.a) this.f40982c;
        String str = ((xf.b) this.f40981b).f44246b;
        String property = ((Properties) aVar2.f39792c).getProperty("api_key", null);
        if (!(property == null ? true : Intrinsics.areEqual(property, str))) {
            List listH = d0.h("user_id", "device_id", "api_key", "experiment_api_key");
            aVar2.getClass();
            listH.getClass();
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                ((Properties) aVar2.f39792c).remove((String) it.next());
            }
            aVar2.H();
        }
        aVar2.D("api_key", str);
    }

    public static r B(ld.k kVar, zc.k kVar2, xc.b bVar, xc.c cVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(kVar2.f47464a.getResources(), cVar.f44223a);
        f fVar = f.MEMORY_CACHE;
        Map map = cVar.f44224b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z11 = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = ed.k.f15927a;
        if (kVar != null && kVar.f27646b) {
            z11 = true;
        }
        return new r(bitmapDrawable, kVar2, fVar, bVar, str, zBooleanValue, z11);
    }

    public xc.b A(zc.k kVar, Object obj, n nVar, pc.b bVar) {
        String strA;
        Map map;
        xc.b bVar2 = kVar.f47468e;
        List list = kVar.f47471h;
        if (bVar2 != null) {
            return bVar2;
        }
        List list2 = ((pc.h) this.f40981b).f34662h.f34638c;
        int size = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                strA = null;
                break;
            }
            Pair pair = (Pair) list2.get(i11);
            vc.b bVar3 = (vc.b) pair.f26485a;
            if (((Class) pair.f26486b).isAssignableFrom(obj.getClass())) {
                bVar3.getClass();
                strA = bVar3.a(obj, nVar);
                if (strA != null) {
                    break;
                }
            }
            i11++;
        }
        if (strA == null) {
            return null;
        }
        Map map2 = kVar.f47488z.f47507a;
        if (map2.isEmpty()) {
            map = o0.f26530a;
            map.getClass();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                String str = ((o) entry.getValue()).f47505b;
                if (str != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
            map = linkedHashMap;
        }
        if (list.isEmpty() && map.isEmpty()) {
            return new xc.b(strA);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        if (!list.isEmpty()) {
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                linkedHashMap2.put(s.f(i12, "coil#transformation_"), ((cd.a) ((cd.c) list.get(i12))).f7911a);
            }
            linkedHashMap2.put("coil#transformation_size", nVar.f47493d.toString());
        }
        return new xc.b(strA, linkedHashMap2);
    }

    public void C(Throwable th2) {
        t2 t2Var = (t2) this.f40982c;
        t2Var.p();
        n1 n1Var = (n1) t2Var.f21216b;
        t2Var.f45155j = false;
        t2Var.N().add((y3) this.f40981b);
        if (t2Var.f45156k > ((Integer) g0.f44813v0.a(null)).intValue()) {
            t2Var.f45156k = 1;
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45263j.c("registerTriggerAsync failed. May try later. App ID, throwable", w0.x(n1Var.r().v()), w0.x(th2.toString()));
            return;
        }
        w0 w0Var2 = n1Var.f44987f;
        n1.m(w0Var2);
        w0Var2.f45263j.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", w0.x(n1Var.r().v()), w0.x(String.valueOf(t2Var.f45156k)), w0.x(th2.toString()));
        int i11 = t2Var.f45156k;
        if (t2Var.l == null) {
            t2Var.l = new g2(t2Var, n1Var, 1);
        }
        t2Var.l.b(((long) i11) * 1000);
        int i12 = t2Var.f45156k;
        t2Var.f45156k = i12 + i12;
    }

    public void D(int i11, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i11 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            y30.b bVar = "clx".equals(bundle2.getString("_o")) ? (t5.a) this.f40981b : (u6.f) this.f40982c;
            if (bVar == null) {
                return;
            }
            bVar.i(bundle2, string);
        }
    }

    public v40.b E() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(u());
            while (true) {
                try {
                    int i11 = fileInputStream.read(bArr, 0, BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE);
                    if (i11 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        d dVar = d.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", dVar.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i12 = v40.b.f42005h;
        v40.a aVar = new v40.a();
        aVar.f42002f = 0L;
        aVar.f42004h = (byte) (aVar.f42004h | 2);
        aVar.b(dVar);
        aVar.f42001e = 0L;
        aVar.f42004h = (byte) (aVar.f42004h | 1);
        aVar.f41997a = strOptString;
        aVar.b(d.values()[iOptInt]);
        aVar.f41999c = strOptString2;
        aVar.f42000d = strOptString3;
        aVar.f42002f = jOptLong;
        byte b8 = (byte) (aVar.f42004h | 2);
        aVar.f42001e = jOptLong2;
        aVar.f42004h = (byte) (b8 | 1);
        aVar.f42003g = strOptString4;
        return aVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(y2.d r29) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.a.F(y2.d):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ub.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Map] */
    public vf.e G(vf.d dVar) {
        int responseCode;
        String responseMessage;
        InputStream inputStreamV;
        byte[] bytes;
        String str = dVar.f42306a;
        kf.b bVar = (kf.b) this.f40982c;
        try {
            ?? url = new URL(str);
            try {
                try {
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    uRLConnectionOpenConnection.getClass();
                    url = (HttpURLConnection) uRLConnectionOpenConnection;
                    try {
                        url.setRequestMethod(dVar.f42307b.name());
                        url.setConnectTimeout(15000);
                        url.setReadTimeout(20000);
                        url.setDoInput(true);
                        for (Map.Entry entry : vf.d.f42305f.entrySet()) {
                            url.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        for (Map.Entry entry2 : dVar.f42308c.entrySet()) {
                            url.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                        String str2 = dVar.f42309d;
                        ?? r62 = str2;
                        if (str2 != null) {
                            url.setDoOutput(true);
                            if (dVar.f42310e) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                    try {
                                        byte[] bytes2 = str2.getBytes(Charsets.UTF_8);
                                        bytes2.getClass();
                                        gZIPOutputStream.write(bytes2);
                                        gZIPOutputStream.close();
                                        bytes = byteArrayOutputStream.toByteArray();
                                        bytes.getClass();
                                        url.setRequestProperty("Content-Encoding", "gzip");
                                    } finally {
                                    }
                                } catch (Exception e5) {
                                    bVar.d("Gzip compression failed, sending uncompressed: " + e5.getMessage());
                                    bytes = str2.getBytes(Charsets.UTF_8);
                                    bytes.getClass();
                                }
                            } else {
                                bytes = str2.getBytes(Charsets.UTF_8);
                                bytes.getClass();
                            }
                            OutputStream outputStream = url.getOutputStream();
                            int length = bytes.length;
                            outputStream.write(bytes, 0, length);
                            url.getOutputStream().close();
                            r62 = length;
                        }
                        try {
                            responseCode = url.getResponseCode();
                            responseMessage = url.getResponseMessage();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            inputStreamV = v(url);
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamV, Charsets.UTF_8), 8192);
                                try {
                                    String strD = v0.n.D(bufferedReader);
                                    bufferedReader.close();
                                    inputStreamV.close();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    Map<String, List<String>> headerFields = url.getHeaderFields();
                                    headerFields.getClass();
                                    for (Map.Entry<String, List<String>> entry3 : headerFields.entrySet()) {
                                        String key = entry3.getKey();
                                        List<String> value = entry3.getValue();
                                        if (key != null) {
                                            if (value == null) {
                                                value = n0.f26529a;
                                            }
                                            linkedHashMap.put(key, value);
                                        }
                                    }
                                    vf.e eVar = new vf.e(responseCode, strD, responseMessage, linkedHashMap);
                                    url.disconnect();
                                    return eVar;
                                } finally {
                                }
                            } catch (IOException e11) {
                                e = e11;
                                bVar.a("Failed to read response from server: " + e.getMessage());
                                o0 o0Var = o0.f26530a;
                                o0Var.getClass();
                                vf.e eVar2 = new vf.e(408, null, "Request timeout", o0Var);
                                if (inputStreamV != null) {
                                    inputStreamV.close();
                                }
                                url.disconnect();
                                return eVar2;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            inputStreamV = null;
                        } catch (Throwable th3) {
                            th = th3;
                            r62 = 0;
                            if (r62 != 0) {
                                r62.close();
                            }
                            throw th;
                        }
                    } catch (Exception e13) {
                        bVar.a("Request failed: " + e13.getClass().getName() + ": " + e13.getMessage());
                        o0 o0Var2 = o0.f26530a;
                        o0Var2.getClass();
                        vf.e eVar3 = new vf.e(500, null, "Request failed: " + e13.getMessage(), o0Var2);
                        url.disconnect();
                        return eVar3;
                    }
                } catch (IOException e14) {
                    bVar.a("Failed to open connection: " + e14.getMessage());
                    o0 o0Var3 = o0.f26530a;
                    o0Var3.getClass();
                    return new vf.e(500, null, "Connection failed", o0Var3);
                }
            } catch (Throwable th4) {
                url.disconnect();
                throw th4;
            }
        } catch (MalformedURLException e15) {
            bVar.a("Attempted to use malformed url: " + str + ", error: " + e15.getMessage());
            o0 o0Var4 = o0.f26530a;
            o0Var4.getClass();
            return new vf.e(400, null, "Malformed URL", o0Var4);
        }
    }

    public InputMethodManager H() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f40982c;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = ((View) this.f40981b).getContext().getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.f40982c = inputMethodManager2;
        return inputMethodManager2;
    }

    public void I() {
        if (((t4.b) this.f40982c) != null) {
            this.f40982c = null;
            ((g) this.f40981b).S0(true);
        }
    }

    public s0 K(String str, String str2) throws JSONException {
        str.getClass();
        ye.g gVar = (ye.g) this.f40981b;
        String str3 = gVar.f45894i == nf.d.EU ? "https://api.eu.amplitude.com/2/httpapi" : "https://api2.amplitude.com/2/httpapi";
        String str4 = gVar.f45886a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateKtxConstants.ISO_8601_UTC_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sbS = e0.f.s("{\"api_key\":\"", str4, "\",\"client_upload_time\":\"");
        String str5 = simpleDateFormat.format(new Date(jCurrentTimeMillis));
        str5.getClass();
        sbS.append(str5);
        sbS.append("\",\"events\":");
        sbS.append(str);
        sb2.append(sbS.toString());
        if (str2 != null) {
            sb2.append(",\"request_metadata\":{\"sdk\":" + str2 + '}');
        }
        sb2.append("}");
        vf.e eVarG = G(new vf.d(str3, vf.c.POST, null, sb2.toString(), true, 100));
        int i11 = eVarG.f42311a;
        String str6 = eVarG.f42312b;
        vf.f fVar = vf.f.SUCCESS;
        IntRange intRangeA = fVar.a();
        int i12 = intRangeA.f26553a;
        if (i11 <= intRangeA.f26554b && i12 <= i11) {
            return new vf.h(fVar, 3);
        }
        IntRange intRangeA2 = vf.f.BAD_REQUEST.a();
        int i13 = intRangeA2.f26553a;
        if (i11 <= intRangeA2.f26554b && i13 <= i11) {
            return new vf.a(new JSONObject(str6));
        }
        IntRange intRangeA3 = vf.f.PAYLOAD_TOO_LARGE.a();
        int i14 = intRangeA3.f26553a;
        if (i11 <= intRangeA3.f26554b && i14 <= i11) {
            return new vf.g(new JSONObject(str6));
        }
        IntRange intRangeA4 = vf.f.TOO_MANY_REQUESTS.a();
        int i15 = intRangeA4.f26553a;
        if (i11 <= intRangeA4.f26554b && i15 <= i11) {
            return new j(new JSONObject(str6));
        }
        vf.f fVar2 = vf.f.TIMEOUT;
        IntRange intRangeA5 = fVar2.a();
        int i16 = intRangeA5.f26553a;
        if (i11 <= intRangeA5.f26554b && i16 <= i11) {
            return new vf.i(fVar2, 3);
        }
        JSONObject jSONObject = new JSONObject();
        if (str6 != null && str6.length() != 0) {
            try {
                jSONObject = new JSONObject(str6);
            } catch (Exception unused) {
                jSONObject.put(StatusResponseUtils.RESULT_ERROR, str6);
            }
        }
        return new vf.b(jSONObject);
    }

    public void L(String str, String str2) {
        if (((b) this.f40981b).f40988f <= 2) {
            ((jb.b) this.f40982c).s(str, str2);
        }
    }

    public void M(String str) {
        if (((b) this.f40981b).f40988f <= 5) {
            ((ky.o) ((jb.b) this.f40982c).f24851a).w(new lc.a("PayKitAnalytics", 5, str, null));
            Log.w("PayKitAnalytics", str);
        }
    }

    @Override // x.k
    public float a() {
        v vVar = ((b0.n) this.f40981b).f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
        key.getClass();
        Object objValueOf = Float.valueOf(1.0f);
        t0 t0Var = (t0) vVar;
        t0Var.getClass();
        Object objC = t0Var.c(key);
        if (objC != null) {
            objValueOf = objC;
        }
        Float f11 = (Float) objValueOf;
        if (Math.abs(r0) >= ((double) Math.ulp(Math.abs(f11.floatValue()))) * 2.0d) {
            return f11.floatValue();
        }
        if (wd.a.B(5, "CXCP")) {
            Log.w("CXCP", "Invalid max zoom ratio of " + f11 + " detected, defaulting to 1.0f");
        }
        return 1.0f;
    }

    @Override // xc.h
    public xc.c b(xc.b bVar) {
        xc.f fVar = (xc.f) ((aa.j) this.f40982c).c(bVar);
        if (fVar != null) {
            return new xc.c(fVar.f44227a, fVar.f44228b);
        }
        return null;
    }

    @Override // xc.h
    public void c(int i11) {
        int i12;
        aa.j jVar = (aa.j) this.f40982c;
        if (i11 >= 40) {
            jVar.h(-1);
            return;
        }
        if (10 > i11 || i11 >= 20) {
            return;
        }
        synchronized (jVar.f35717c) {
            i12 = jVar.f35718d;
        }
        jVar.h(i12 / 2);
    }

    @Override // x.k
    public float d() {
        return 1.0f;
    }

    @Override // y3.i
    public Object e(Object obj) {
        return ((Function1) this.f40982c).invoke(obj);
    }

    @Override // x.k
    public i0 f(o2 o2Var) {
        o2Var.getClass();
        return o2Var.j(c0.c(CaptureRequest.SCALER_CROP_REGION), n2.DEFAULT);
    }

    @Override // x.k
    public i0 g(o2 o2Var) {
        o2Var.getClass();
        Rect rect = (Rect) this.f40982c;
        if (Math.abs(1.0f) < ((double) Math.ulp(Math.abs(1.0f))) * 2.0d && wd.a.B(5, "CXCP")) {
            Log.w("CXCP", "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
        }
        float fWidth = rect.width() / 1.0f;
        float fHeight = rect.height() / 1.0f;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        return o2.k(o2Var, kotlin.collections.w0.b(new Pair(CaptureRequest.SCALER_CROP_REGION, new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #3 {all -> 0x00a4, blocks: (B:20:0x004a, B:22:0x004e, B:25:0x005f, B:29:0x0066, B:31:0x0073, B:33:0x007e, B:32:0x0079, B:27:0x0063, B:28:0x0065, B:45:0x009c, B:46:0x00a3, B:24:0x005a), top: B:73:0x004a, outer: #5, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c A[Catch: all -> 0x00a4, TRY_ENTER, TryCatch #3 {all -> 0x00a4, blocks: (B:20:0x004a, B:22:0x004e, B:25:0x005f, B:29:0x0066, B:31:0x0073, B:33:0x007e, B:32:0x0079, B:27:0x0063, B:28:0x0065, B:45:0x009c, B:46:0x00a3, B:24:0x005a), top: B:73:0x004a, outer: #5, inners: #0 }] */
    @Override // ha.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ha.a h(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.a.h(java.lang.String):ha.a");
    }

    @Override // y3.i
    public Object i(y3.a aVar, Object obj) {
        return ((Function2) this.f40981b).invoke(aVar, obj);
    }

    public void j(String str) {
        Set set = (Set) this.f40982c;
        set.add(str);
        while (set.size() > 10) {
            set.remove(CollectionsKt.N(set));
        }
    }

    public void k(w2.j jVar, int i11, int i12, int i13) {
        int i14;
        o3.e eVar = (o3.e) this.f40982c;
        int i15 = eVar.f31832c;
        if (i15 == 0) {
            i14 = 0;
        } else if (i15 == 0) {
            y.h("MutableVector is empty.");
            return;
        } else {
            w2.j jVar2 = (w2.j) eVar.f31830a[i15 - 1];
            i14 = jVar2.f42942b - jVar2.f42944d;
        }
        if (jVar == null) {
            int i16 = i11 - i14;
            jVar = new w2.j(i11, i12 + i13, i16, (i12 - i11) + i16);
        } else {
            if (jVar.f42941a > i11) {
                jVar.f42941a = i11;
                jVar.f42943c = i11;
            }
            int i17 = jVar.f42942b;
            if (i12 > i17) {
                int i18 = i17 - jVar.f42944d;
                jVar.f42942b = i12;
                jVar.f42944d = i12 - i18;
            }
            jVar.f42942b += i13;
        }
        eVar.b(jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x048b, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0506 A[LOOP:15: B:180:0x0500->B:182:0x0506, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0520 A[LOOP:16: B:184:0x051a->B:186:0x0520, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0303  */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y0.g l(int r29, s0.g0 r30, java.util.ArrayList r31, java.util.ArrayList r32, s0.z r33, android.util.Range r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 1846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.a.l(int, s0.g0, java.util.ArrayList, java.util.ArrayList, s0.z, android.util.Range, boolean):y0.g");
    }

    public void m() {
        ((o3.e) this.f40981b).g();
    }

    @Override // xc.h
    public void n(xc.b bVar, Bitmap bitmap, Map map) {
        int i11;
        int iR = zz.f.r(bitmap);
        aa.j jVar = (aa.j) this.f40982c;
        synchronized (jVar.f35717c) {
            i11 = jVar.f35715a;
        }
        aa.j jVar2 = (aa.j) this.f40982c;
        if (iR <= i11) {
            jVar2.d(bVar, new xc.f(bitmap, map, iR));
        } else {
            jVar2.e(bVar);
            ((xc.i) this.f40981b).e(bVar, bitmap, map, iR);
        }
    }

    @Override // ha.b
    public boolean o() {
        return ((ha.b) this.f40981b).o();
    }

    public void p(String str, String str2, Exception exc) {
        if (((b) this.f40981b).f40988f <= 6) {
            ((jb.b) this.f40982c).r(str, str2, exc);
        }
    }

    public String q() {
        Set set = (Set) this.f40982c;
        List list = (List) this.f40981b;
        if ((list == null || list.isEmpty()) && set.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list2 = (List) this.f40981b;
        if (list2 != null) {
            list2.getClass();
            if (!list2.isEmpty()) {
                List list3 = (List) this.f40981b;
                list3.getClass();
                linkedHashMap.put("malformed_events", list3);
            }
        }
        if (!set.isEmpty()) {
            linkedHashMap.put("error_logs", CollectionsKt.r0(set));
        }
        String strValueOf = String.valueOf(ex.i.O(linkedHashMap));
        List list4 = (List) this.f40981b;
        if (list4 != null) {
            list4.clear();
        }
        set.clear();
        return strValueOf;
    }

    public void r() {
        k1 k1Var = (k1) this.f40982c;
        z3.g gVarC = z3.v.c();
        Function1 function1E = gVarC != null ? gVarC.e() : null;
        z3.g gVarD = z3.v.d(gVarC);
        try {
            y2.d dVar = (y2.d) k1Var.getValue();
            if (dVar != null) {
                y2.e eVar = (y2.e) this.f40981b;
                z3.r rVar = eVar.f45385b;
                z3.r rVar2 = eVar.f45386c;
                rVar2.clear();
                while (rVar2.size() + rVar.size() > eVar.f45384a - 1) {
                    kotlin.collections.i0.w(rVar);
                }
                rVar.add(dVar);
            }
            k1Var.setValue(null);
        } finally {
            z3.v.f(gVarC, gVarD, function1E);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory s(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.a.s(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0143 A[PHI: r24
      0x0143: PHI (r24v2 boolean) = (r24v1 boolean), (r24v1 boolean), (r24v3 boolean) binds: [B:69:0x013f, B:64:0x0132, B:57:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d8 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xc.c t(zc.k r24, xc.b r25, ad.h r26, ad.g r27) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.a.t(zc.k, xc.b, ad.h, ad.g):xc.c");
    }

    public String toString() {
        switch (this.f40980a) {
            case 6:
                StringBuilder sb2 = new StringBuilder("ChangeList(changes=[");
                o3.e eVar = (o3.e) this.f40981b;
                Object[] objArr = eVar.f31830a;
                int i11 = eVar.f31832c;
                for (int i12 = 0; i12 < i11; i12++) {
                    w2.j jVar = (w2.j) objArr[i12];
                    sb2.append("(" + jVar.f42943c + ',' + jVar.f42944d + ")->(" + jVar.f42941a + ',' + jVar.f42942b + ')');
                    if (i12 < ((o3.e) this.f40981b).f31832c - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public File u() {
        if (((File) this.f40981b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f40981b) == null) {
                        String str = "PersistedInstallation." + ((p30.g) this.f40982c).d() + ".json";
                        p30.g gVar = (p30.g) this.f40982c;
                        gVar.a();
                        File file = new File(gVar.f34222a.getNoBackupFilesDir(), str);
                        this.f40981b = file;
                        if (file.exists()) {
                            return (File) this.f40981b;
                        }
                        p30.g gVar2 = (p30.g) this.f40982c;
                        gVar2.a();
                        File file2 = new File(gVar2.f34222a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f40981b)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.f40981b;
    }

    public InputStream v(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            inputStream.getClass();
            return inputStream;
        } catch (IOException e5) {
            ((kf.b) this.f40982c).d("Failed to get input stream, falling back to error stream: " + e5.getMessage());
            InputStream errorStream = httpURLConnection.getErrorStream();
            errorStream.getClass();
            return errorStream;
        }
    }

    public Object w(we.b bVar) {
        return (k0) this.f40982c;
    }

    public Object x(float f11, float f12, Object obj, Object obj2, float f13, float f14, float f15) {
        we.b bVar = (we.b) this.f40981b;
        bVar.f43402a = f11;
        bVar.f43403b = f12;
        bVar.f43404c = obj;
        bVar.f43405d = obj2;
        bVar.f43406e = f13;
        bVar.f43407f = f14;
        bVar.f43408g = f15;
        return w(bVar);
    }

    public void y(v40.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f42006a);
            jSONObject.put("Status", bVar.f42007b.ordinal());
            jSONObject.put("AuthToken", bVar.f42008c);
            jSONObject.put("RefreshToken", bVar.f42009d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f42011f);
            jSONObject.put("ExpiresInSecs", bVar.f42010e);
            jSONObject.put("FisError", bVar.f42012g);
            p30.g gVar = (p30.g) this.f40982c;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f34222a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(ArticleContentView.UTF_8_ENCODING_TYPE));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(u())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public xf.a z() {
        t5.a aVar = (t5.a) this.f40982c;
        aVar.getClass();
        String property = ((Properties) aVar.f39792c).getProperty("user_id", null);
        aVar.getClass();
        return new xf.a(property, ((Properties) aVar.f39792c).getProperty("device_id", null));
    }

    public void J() {
    }

    public /* synthetic */ a(int i11, boolean z11) {
        this.f40980a = i11;
    }

    public /* synthetic */ a(Object obj, int i11) {
        this.f40980a = i11;
        this.f40981b = obj;
    }

    public /* synthetic */ a(Object obj, int i11, byte b8) {
        this.f40980a = i11;
        this.f40981b = obj;
        this.f40982c = null;
    }

    public /* synthetic */ a(Object obj, Object obj2, boolean z11, int i11) {
        this.f40980a = i11;
        this.f40981b = obj2;
        this.f40982c = obj;
    }

    public /* synthetic */ a(Object obj, boolean z11, int i11) {
        this.f40980a = i11;
        this.f40982c = obj;
    }

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f40980a = i11;
        this.f40981b = obj;
        this.f40982c = obj2;
    }

    public a(ye.g gVar, kf.b bVar) {
        this.f40980a = 5;
        bVar.getClass();
        this.f40981b = gVar;
        this.f40982c = bVar;
    }

    public a(b bVar, jb.b bVar2) {
        this.f40980a = 0;
        bVar2.getClass();
        this.f40981b = bVar;
        this.f40982c = bVar2;
    }

    public a(a aVar) {
        o3.e eVar;
        this.f40980a = 6;
        this.f40981b = new o3.e(new w2.j[16], 0);
        this.f40982c = new o3.e(new w2.j[16], 0);
        if (aVar == null || (eVar = (o3.e) aVar.f40981b) == null) {
            return;
        }
        Object[] objArr = eVar.f31830a;
        int i11 = eVar.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            w2.j jVar = (w2.j) objArr[i12];
            ((o3.e) this.f40981b).b(new w2.j(jVar.f42941a, jVar.f42942b, jVar.f42943c, jVar.f42944d));
        }
    }

    public a(pc.h hVar, t5.a aVar, ed.o oVar) {
        this.f40980a = 16;
        this.f40981b = hVar;
        this.f40982c = oVar;
    }

    public a(int i11) {
        this.f40980a = i11;
        switch (i11) {
            case 12:
                this.f40981b = new Object();
                this.f40982c = new LinkedHashMap();
                break;
            case 18:
                this.f40981b = new Object();
                this.f40982c = new ArrayBlockingQueue(512);
                break;
            default:
                this.f40981b = new we.b();
                this.f40982c = null;
                break;
        }
    }

    public a(k0 k0Var) {
        this.f40980a = 11;
        this.f40981b = new we.b();
        this.f40982c = k0Var;
    }

    public a(y2.d dVar, y2.e eVar) {
        this.f40980a = 3;
        this.f40981b = eVar;
        this.f40982c = m3.i.w(dVar);
    }

    public a(int i11, xc.i iVar) {
        this.f40980a = 17;
        this.f40981b = iVar;
        this.f40982c = new aa.j(i11, this);
    }

    public a(x xVar, ha.b bVar) {
        this.f40980a = 29;
        bVar.getClass();
        this.f40982c = xVar;
        this.f40981b = bVar;
    }

    public a(Context context) {
        this.f40980a = 14;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ex.i.I(context, x10.i.class.getCanonicalName(), R.attr.materialCalendarStyle).data, j10.a.f24432z);
        l50.a.m(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        l50.a.m(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        l50.a.m(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        l50.a.m(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListP = h0.g.p(context, typedArrayObtainStyledAttributes, 7);
        this.f40981b = l50.a.m(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        l50.a.m(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f40982c = l50.a.m(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListP.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public a(b0.n nVar) {
        this.f40980a = 13;
        this.f40981b = nVar;
        v vVar = nVar.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Object objC = ((t0) vVar).c(key);
        objC.getClass();
        this.f40982c = (Rect) objC;
    }
}
