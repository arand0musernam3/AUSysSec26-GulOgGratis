package com.braze.support;

import android.content.Context;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.braze.Constants;
import com.braze.f1;
import com.braze.h2;
import com.braze.support.BrazeLogger;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;
import m90.z;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J$\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/braze/support/WebContentUtils;", "", "<init>", "()V", "ZIP_EXTENSION", "", "ASSET_LOADER_DUMMY_DOMAIN", "HTML_INAPP_MESSAGES_FOLDER", "getLocalHtmlUrlFromRemoteUrl", "localDirectory", "Ljava/io/File;", "remoteZipUrl", "unpackZipIntoDirectory", "", "unpackDirectory", "zipFile", "getHtmlInAppMessageAssetCacheDirectory", "context", "Landroid/content/Context;", "replacePrefetchedUrlsWithLocalAssets", "originalString", "remoteToLocalAssetMap", "", "validateChildFileExistsUnderParent", "intendedParentDirectory", "childFilePath", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebContentUtils {
    public static final String ASSET_LOADER_DUMMY_DOMAIN = "iamcache.braze";
    public static final String HTML_INAPP_MESSAGES_FOLDER = "braze-html-inapp-messages";
    public static final WebContentUtils INSTANCE = new WebContentUtils();
    private static final String ZIP_EXTENSION = ".zip";

    private WebContentUtils() {
    }

    public static final File getHtmlInAppMessageAssetCacheDirectory(Context context) {
        context.getClass();
        return new File(r8.k.l(context.getCacheDir().getPath(), "/braze-html-inapp-messages"));
    }

    public static final String getLocalHtmlUrlFromRemoteUrl(File localDirectory, String remoteZipUrl) {
        localDirectory.getClass();
        remoteZipUrl.getClass();
        if (StringsKt.H(remoteZipUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.e(13), 6, (Object) null);
            return null;
        }
        String absolutePath = localDirectory.getAbsolutePath();
        String strValueOf = String.valueOf(IntentUtils.getRequestCode());
        String strM = r8.k.m(absolutePath, ExpiryDateInput.SEPARATOR, strValueOf);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        WebContentUtils webContentUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f1(remoteZipUrl, strM, 24), 7, (Object) null);
        try {
            File file = (File) BrazeFileUtils.downloadFileToPath(strM, remoteZipUrl, strValueOf, ZIP_EXTENSION).f26485a;
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f1(remoteZipUrl, strM, 25), 7, (Object) null);
            if (unpackZipIntoDirectory(strM, file)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mw.d(strM, 14), 7, (Object) null);
                return strM;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.e(14), 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(strM));
            return null;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new mw.d(remoteZipUrl, 15), 4, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(strM));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$0() {
        return "Remote zip url is empty. No local URL will be created.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$1(String str, String str2) {
        return j4.s.k("Starting download of url: ", str, " to ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$2(String str) {
        return e0.f.k("Could not download zip file to local storage. ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$3(String str, String str2) {
        return j4.s.k("Html content zip downloaded. ", str, " to ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$4() {
        return "Error during the zip unpack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$5(String str) {
        return a0.p("Html content zip unpacked to to ", str, ".");
    }

    public static final String replacePrefetchedUrlsWithLocalAssets(String originalString, Map<String, String> remoteToLocalAssetMap) {
        originalString.getClass();
        remoteToLocalAssetMap.getClass();
        for (Map.Entry<String, String> entry : remoteToLocalAssetMap.entrySet()) {
            String value = entry.getValue();
            if (new File(value).exists()) {
                String key = entry.getKey();
                if (StringsKt.z(value, Constants.TRIGGERS_ASSETS_FOLDER, false)) {
                    String strK = e0.f.k("https://iamcache.braze/ab_triggers", (String) StringsKt__StringsKt.split$default(value, new String[]{Constants.TRIGGERS_ASSETS_FOLDER}, false, 0, 6, null).get(1));
                    if (StringsKt.z(originalString, key, false)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f1(key, strK, 23), 7, (Object) null);
                        originalString = y.n(originalString, key, strK, false);
                    }
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.d(value, 13), 6, (Object) null);
            }
        }
        return originalString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$12(String str) {
        return e0.f.k("Cannot find local asset file at path: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$13(String str, String str2) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Replacing remote url \"", str, "\" with local uri \"", str2, "\"");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.String] */
    public static final boolean unpackZipIntoDirectory(String unpackDirectory, File zipFile) {
        unpackDirectory.getClass();
        zipFile.getClass();
        if (StringsKt.H(unpackDirectory)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new mw.e(15), 6, (Object) null);
            return false;
        }
        new File(unpackDirectory).mkdirs();
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    ?? name = nextEntry.getName();
                    objectRef.element = name;
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = name.toLowerCase(locale);
                    lowerCase.getClass();
                    if (!y.p(lowerCase, "__macosx", false)) {
                        try {
                            String strValidateChildFileExistsUnderParent = validateChildFileExistsUnderParent(unpackDirectory, unpackDirectory + ExpiryDateInput.SEPARATOR + objectRef.element);
                            if (nextEntry.isDirectory()) {
                                new File(strValidateChildFileExistsUnderParent).mkdirs();
                            } else {
                                try {
                                    File parentFile = new File(strValidateChildFileExistsUnderParent).getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                    }
                                } catch (Exception e5) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new ga0.c(objectRef, 3), 4, (Object) null);
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(strValidateChildFileExistsUnderParent));
                                try {
                                    pd.g.o(zipInputStream, bufferedOutputStream);
                                    bufferedOutputStream.close();
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        u00.d.p(bufferedOutputStream, th2);
                                        throw th3;
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new ga0.c(objectRef, 4), 4, (Object) null);
                        }
                    }
                    zipInputStream.closeEntry();
                }
                zipInputStream.close();
                return true;
            } finally {
            }
        } catch (Throwable th4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, th4, false, (Function0) new z(8, zipFile, unpackDirectory), 4, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$10$lambda$7(Ref.ObjectRef objectRef) {
        return j4.s.j(objectRef.element, "Error creating parent directory ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$10$lambda$9(Ref.ObjectRef objectRef) {
        return j4.s.j(objectRef.element, "Error unpacking zipEntry ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$11(File file, String str) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Error during unpack of zip file ", file.getAbsolutePath(), " to ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$6() {
        return "Unpack directory is blank. Zip file not unpacked.";
    }

    public static final String validateChildFileExistsUnderParent(String intendedParentDirectory, String childFilePath) throws IOException {
        intendedParentDirectory.getClass();
        childFilePath.getClass();
        String canonicalPath = new File(intendedParentDirectory).getCanonicalPath();
        String canonicalPath2 = new File(childFilePath).getCanonicalPath();
        canonicalPath2.getClass();
        canonicalPath.getClass();
        if (y.p(canonicalPath2, canonicalPath, false)) {
            return canonicalPath2;
        }
        h2.b(e0.f.n(e0.f.t("Invalid file with original path: ", childFilePath, " with canonical path: ", canonicalPath2, " does not exist under intended parent with  path: "), intendedParentDirectory, " and canonical path: ", canonicalPath));
        return null;
    }
}
