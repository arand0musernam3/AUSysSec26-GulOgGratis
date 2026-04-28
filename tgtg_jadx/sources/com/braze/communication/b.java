package com.braze.communication;

import android.net.TrafficStats;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.json.JSONObject;
import v0.n;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9589b = (int) 15000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9590a;

    public b(int i11) {
        this.f9590a = i11;
    }

    public final HttpURLConnection a(URL url, JSONObject jSONObject, HashMap map) throws IOException {
        url.getClass();
        jSONObject.getClass();
        map.getClass();
        String string = jSONObject.toString();
        string.getClass();
        Charset charsetForName = Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE);
        charsetForName.getClass();
        byte[] bytes = string.getBytes(charsetForName);
        bytes.getClass();
        HttpURLConnection httpURLConnectionA = g.f9636a.a(url);
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnectionA.setConnectTimeout(f9589b);
        httpURLConnectionA.setReadTimeout(this.f9590a);
        httpURLConnectionA.setUseCaches(false);
        httpURLConnectionA.setInstanceFollowRedirects(false);
        httpURLConnectionA.setRequestMethod("POST");
        httpURLConnectionA.setDoOutput(true);
        httpURLConnectionA.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = httpURLConnectionA.getOutputStream();
        try {
            outputStream.write(bytes);
            outputStream.close();
            return httpURLConnectionA;
        } finally {
        }
    }

    public static final String a(com.braze.requests.util.d dVar) {
        return "Failed request to [" + dVar + "]";
    }

    public final d a(com.braze.requests.util.d dVar, HashMap map, JSONObject jSONObject) {
        dVar.getClass();
        map.getClass();
        jSONObject.getClass();
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        URL url = dVar.f10481c;
        Map mapA = o0.f26530a;
        mapA.getClass();
        int responseCode = -1;
        try {
            HttpURLConnection httpURLConnectionA = a(url, jSONObject, map);
            responseCode = httpURLConnectionA.getResponseCode();
            Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
            headerFields.getClass();
            mapA = q.a(headerFields);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.a(httpURLConnectionA), Charsets.UTF_8), 8192);
            try {
                String strD = n.D(bufferedReader);
                bufferedReader.close();
                return new d(responseCode, mapA, new JSONObject(strD));
            } finally {
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new hw.e(dVar, 1), 4, (Object) null);
            return new d(responseCode, mapA, 4);
        }
    }
}
