package com.braze.support;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.TrafficStats;
import android.net.Uri;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.a2;
import com.braze.support.BrazeLogger;
import d8.b0;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0007\u001a\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0011\u001a\n\u0010\u0012\u001a\u00020\u0010*\u00020\u0011\u001aH\u0010\u0013\u001a \u0012\u0004\u0012\u00020\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015j\u0002`\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"TAG", "", "REMOTE_SCHEMES", "", "FILE_SCHEME", "SHARED_PREFERENCES_FILENAME_SUFFIX", "deleteFileOrDirectory", "", "fileOrDirectory", "Ljava/io/File;", "deleteSharedPreferencesFile", "context", "Landroid/content/Context;", BrazeFileUtils.FILE_SCHEME, "deleteDataStoreFile", "isRemoteUri", "", "Landroid/net/Uri;", "isLocalUri", "downloadFileToPath", "Lkotlin/Pair;", "", "Lcom/braze/communication/HttpHeaders;", "downloadDirectoryAbsolutePath", "remoteFileUrl", "outputFilename", "extension", "getAssetFileStringContents", "Landroid/content/res/AssetManager;", "assetPath", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BrazeFileUtils {
    private static final String FILE_SCHEME = "file";
    private static final String SHARED_PREFERENCES_FILENAME_SUFFIX = ".xml";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeFileUtils");
    public static final List<String> REMOTE_SCHEMES = d0.h("http", "https", "ftp", "ftps", "about", "javascript");

    public static final void deleteDataStoreFile(File file) {
        file.getClass();
        if (!file.exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b0(file, 2), 12, (Object) null);
        } else if (file.delete()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b0(file, 3), 14, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b0(file, 4), 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteDataStoreFile$lambda$3(File file) {
        return e0.f.k("Cannot delete DataStore file that does not exist. Path: ", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteDataStoreFile$lambda$4(File file) {
        return e0.f.k("Successfully deleted DataStore file: ", file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteDataStoreFile$lambda$5(File file) {
        return e0.f.k("Failed to delete DataStore file: ", file.getAbsolutePath());
    }

    public static final void deleteFileOrDirectory(File file) {
        file.getClass();
        if (e80.m.e(file)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b0(file, 1), 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteFileOrDirectory$lambda$0(File file) {
        return e0.f.k("Could not recursively delete ", file.getName());
    }

    public static final void deleteSharedPreferencesFile(Context context, File file) {
        context.getClass();
        file.getClass();
        if (!file.exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b0(file, 5), 12, (Object) null);
            return;
        }
        String name = file.getName();
        name.getClass();
        if (y.j(name, SHARED_PREFERENCES_FILENAME_SUFFIX, false)) {
            context.deleteSharedPreferences(StringsKt.O(name, SHARED_PREFERENCES_FILENAME_SUFFIX));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b0(file, 6), 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteSharedPreferencesFile$lambda$1(File file) {
        return e0.f.k("Cannot delete SharedPreferences that does not exist. Path: ", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteSharedPreferencesFile$lambda$2(File file) {
        return e0.f.k("SharedPreferences file is expected to end in .xml. Path: ", file.getAbsolutePath());
    }

    public static final Pair<File, Map<String, String>> downloadFileToPath(String str, String str2, String str3, String str4) throws Exception {
        str.getClass();
        str2.getClass();
        str3.getClass();
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        if (Braze.INSTANCE.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new lw.m(str2, 27), 12, (Object) null);
            throw new Exception("SDK is offline. File not downloaded for url: ".concat(str2));
        }
        if (StringsKt.H(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new m60.a(6), 12, (Object) null);
            throw new Exception("Download directory is blank. File not downloaded.");
        }
        if (StringsKt.H(str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new m60.a(5), 12, (Object) null);
            throw new Exception("Zip file url is blank. File not downloaded.");
        }
        if (StringsKt.H(str3)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new m60.a(4), 12, (Object) null);
            throw new Exception("Output filename is blank. File not downloaded.");
        }
        try {
            try {
                new File(str).mkdirs();
                if (str4 != null && !StringsKt.H(str4)) {
                    str3 = str3.concat(str4);
                }
                File file = new File(str, str3);
                HttpURLConnection httpURLConnectionA = com.braze.communication.g.f9636a.a(new URL(str2));
                int responseCode = httpURLConnectionA.getResponseCode();
                if (responseCode != 200) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a2(responseCode, str2), 14, (Object) null);
                    throw new Exception("HTTP response code was " + responseCode + ". File with url " + str2 + " could not be downloaded.");
                }
                DataInputStream dataInputStream = new DataInputStream(httpURLConnectionA.getInputStream());
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        pd.g.o(dataInputStream, fileOutputStream);
                        fileOutputStream.close();
                        dataInputStream.close();
                        Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
                        headerFields.getClass();
                        LinkedHashMap linkedHashMapA = q.a(headerFields);
                        httpURLConnectionA.disconnect();
                        return new Pair<>(file, linkedHashMapA);
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        u00.d.p(dataInputStream, th2);
                        throw th3;
                    }
                }
            } finally {
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.m(str2, 26), 8, (Object) null);
            throw new Exception("Exception during download of file from url : ".concat(str2));
        }
    }

    public static /* synthetic */ Pair downloadFileToPath$default(String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        return downloadFileToPath(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$10() {
        return "Output filename null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$11(int i11, String str) {
        return "HTTP response code was " + i11 + ". File with url " + str + " could not be downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$14(String str) {
        return e0.f.k("Exception during download of file from url : ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$7(String str) {
        return e0.f.k("SDK is offline. File not downloaded for url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$8() {
        return "Download directory null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$9() {
        return "Zip file url null or blank. File not downloaded.";
    }

    public static final String getAssetFileStringContents(AssetManager assetManager, String str) {
        assetManager.getClass();
        str.getClass();
        InputStream inputStreamOpen = assetManager.open(str);
        inputStreamOpen.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
        try {
            String strD = v0.n.D(bufferedReader);
            bufferedReader.close();
            return strD;
        } finally {
        }
    }

    public static final boolean isLocalUri(Uri uri) {
        uri.getClass();
        String scheme = uri.getScheme();
        return scheme == null || StringsKt.H(scheme) || Intrinsics.areEqual(scheme, FILE_SCHEME);
    }

    public static final boolean isRemoteUri(Uri uri) {
        uri.getClass();
        String scheme = uri.getScheme();
        if (scheme != null && !StringsKt.H(scheme)) {
            return REMOTE_SCHEMES.contains(scheme);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new m60.a(7), 12, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isRemoteUri$lambda$6() {
        return "Null or blank Uri scheme.";
    }
}
