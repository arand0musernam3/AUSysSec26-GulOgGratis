package com.appsflyer.internal;

import c5.l3;
import com.appsflyer.AFLogger;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u0013\u0010\f\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\f\u0010\u0010J\u001b\u0010\f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\f\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001d"}, d2 = {"Lcom/appsflyer/internal/AFc1dSDK;", "", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "", "getMediationNetwork", "()Z", "Ljava/net/HttpURLConnection;", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/net/HttpURLConnection;J)Z", "getCurrencyIso4217Code", "[B", "Lcom/appsflyer/internal/AFd1hSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFd1hSDK;", "getMonetizationNetwork", "Ljava/util/Map;", "Z", "I", "getRevenue", "()Ljava/lang/String;", "component3"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMonitorHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonitorHttpRequest.kt\ncom/appsflyer/internal/components/monitorsdk/MonitorHttpRequest\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n215#2,2:135\n215#2,2:138\n1#3:137\n*S KotlinDebug\n*F\n+ 1 MonitorHttpRequest.kt\ncom/appsflyer/internal/components/monitorsdk/MonitorHttpRequest\n*L\n58#1:135,2\n104#1:138,2\n*E\n"})
public abstract class AFc1dSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final boolean getMonetizationNetwork;

    @NotNull
    public byte[] getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    public int getRevenue;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @Nullable
    public Map<String, String> getMediationNetwork;

    public AFc1dSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i11) {
        bArr.getClass();
        this.getCurrencyIso4217Code = bArr;
        this.getMediationNetwork = map;
        this.getRevenue = i11;
        this.getMonetizationNetwork = true;
    }

    private final boolean getMediationNetwork(HttpURLConnection httpURLConnection, long j9) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb2.append("\n length: ");
        sb2.append(new String(this.getCurrencyIso4217Code, Charsets.UTF_8).length());
        Map<String, String> map = this.getMediationNetwork;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
        }
        String mediationNetwork = getMediationNetwork("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb2));
        if (getGetMonetizationNetwork()) {
            AFLogger.afRDLog(mediationNetwork);
        } else {
            AFLogger.afVerboseLog(mediationNetwork);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.getRevenue);
        httpURLConnection.setConnectTimeout(this.getRevenue);
        httpURLConnection.addRequestProperty("Content-Type", getGetMonetizationNetwork().getMediationNetwork);
        Map<String, String> map2 = this.getMediationNetwork;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getCurrencyIso4217Code.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.getClass();
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getCurrencyIso4217Code);
        bufferedOutputStream.close();
        String mediationNetwork2 = getMediationNetwork(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j9;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + mediationNetwork2 + "\n\ttook " + jCurrentTimeMillis + "ms";
        String mediationNetwork3 = getMediationNetwork("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
        if (getGetMonetizationNetwork()) {
            AFLogger.afRDLog(mediationNetwork3);
        } else {
            AFLogger.afVerboseLog(mediationNetwork3);
        }
        return AFd1sSDK.getMediationNetwork(httpURLConnection);
    }

    @NotNull
    /* JADX INFO: renamed from: AFAdRevenueData */
    public abstract AFd1hSDK getGetMonetizationNetwork();

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from getter */
    public boolean getGetMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }

    @NotNull
    public abstract String getMediationNetwork(@NotNull String str);

    @NotNull
    public abstract String getMonetizationNetwork();

    public final boolean getMediationNetwork() {
        HttpURLConnection httpURLConnection;
        Throwable th2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String monetizationNetwork = getMonetizationNetwork();
            monetizationNetwork.getClass();
            URLConnection uRLConnectionOpenConnection = new URL(monetizationNetwork).openConnection();
            uRLConnectionOpenConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                boolean mediationNetwork = getMediationNetwork(httpURLConnection, jCurrentTimeMillis);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return mediationNetwork;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    String str = "error: " + th2 + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th2.getMessage();
                    String mediationNetwork2 = getMediationNetwork("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str);
                    if (getGetMonetizationNetwork()) {
                        AFLogger.afRDLog(mediationNetwork2);
                    } else {
                        AFLogger.afVerboseLog(mediationNetwork2);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return false;
                } catch (Throwable th4) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            httpURLConnection = null;
            th2 = th5;
        }
    }

    private static String getMediationNetwork(HttpURLConnection p02) throws IOException {
        InputStream errorStream;
        try {
            errorStream = p02.getInputStream();
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            String message = th2.getMessage();
            AFg1hSDK.e$default(aFLogger, aFg1cSDK, message == null ? "" : message, th2, false, false, false, false, 96, null);
            errorStream = p02.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : new o80.a(new l3(bufferedReader, 1))) {
                str.getClass();
                arrayList.add(str);
            }
            bufferedReader.close();
            String strU = CollectionsKt.U(arrayList, null, null, null, null, 63);
            bufferedReader.close();
            return strU;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u00.d.p(bufferedReader, th3);
                throw th4;
            }
        }
    }
}
