package com.braze.support;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.f1;
import com.braze.storage.p3;
import com.braze.support.BrazeLogger;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001\u001a\"\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u001a\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0001\u001a\n\u0010\u001b\u001a\u00020\u001c*\u00020\u0001\u001a\u0012\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0013\u001a\n\u0010\u001f\u001a\u00020\u0001*\u00020\u0001\u001a \u0010 \u001a\u00020!*\u0004\u0018\u00010\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020!0#\u001a\u001c\u0010$\u001a\u00020\u00012\b\u0010%\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0005\"\u0016\u0010\n\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0005¨\u0006&"}, d2 = {"TAG", "", "NULL_USER_ID_SUBSTITUTE_STRING", "MD5_HASH_OF_THE_STRING_NULL", "getMD5_HASH_OF_THE_STRING_NULL$annotations", "()V", "CACHE_SUFFIX_PREFERENCES_FILE", "getCACHE_SUFFIX_PREFERENCES_FILE$annotations", "SUFFIX_CACHE_USER_ID_HASH_VALUE", "getSUFFIX_CACHE_USER_ID_HASH_VALUE$annotations", "SUFFIX_CACHE_USER_ID_KEY", "getSUFFIX_CACHE_USER_ID_KEY$annotations", "isNullOrEmpty", "", "reference", "isNullOrBlank", "isBlank", "emptyToNull", "countOccurrences", "", "subString", "getCacheFileSuffix", "context", "Landroid/content/Context;", "userId", "apiKey", "getCacheMapKey", "getByteSize", "", "truncateToByteLength", "desiredByteLength", "getMd5Hash", "ifNonEmpty", "", "block", "Lkotlin/Function1;", "getSuffixFromUserIdHashAndApiKey", "userIdHash", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StringUtils {
    public static final String CACHE_SUFFIX_PREFERENCES_FILE = "com.appboy.support.stringutils.cachefilesuffix";
    public static final String MD5_HASH_OF_THE_STRING_NULL = "37a6259cc0c1dae299a7866489dff0bd";
    private static final String NULL_USER_ID_SUBSTITUTE_STRING = "null";
    public static final String SUFFIX_CACHE_USER_ID_HASH_VALUE = "user_id_hash_value";
    public static final String SUFFIX_CACHE_USER_ID_KEY = "user_id_key";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("StringUtils");

    public static final int countOccurrences(String str, String str2) {
        str.getClass();
        str2.getClass();
        return StringsKt__StringsKt.split$default(str, new String[]{str2}, false, 0, 6, null).size() - 1;
    }

    public static final String emptyToNull(String str) {
        str.getClass();
        if (StringsKt.H(str)) {
            return null;
        }
        return str;
    }

    public static final long getByteSize(String str) {
        str.getClass();
        str.getBytes(Charsets.UTF_8).getClass();
        return r2.length;
    }

    public static final String getCacheFileSuffix(Context context, String str, String str2) throws NoSuchAlgorithmException {
        context.getClass();
        String str3 = str == null ? "null" : str;
        if (Intrinsics.areEqual(str3, "null")) {
            return getSuffixFromUserIdHashAndApiKey(MD5_HASH_OF_THE_STRING_NULL, str2);
        }
        p3 p3Var = new p3(context);
        DataStoreKey dataStoreKey = DataStoreKey.SUFFIX_CACHE_USER_ID_KEY;
        String string = p3Var.readString(dataStoreKey, null);
        if (string != null && Intrinsics.areEqual(string, str3)) {
            String string2 = p3Var.readString(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, null);
            if (string2 != null && string2.length() != 0) {
                return getSuffixFromUserIdHashAndApiKey(string2, str2);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mw.e(6), 14, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new f1(str3, str2, 22), 12, (Object) null);
        String md5Hash = getMd5Hash(str3);
        p3Var.writeData(dataStoreKey, str3);
        p3Var.writeData(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, md5Hash);
        return getSuffixFromUserIdHashAndApiKey(md5Hash, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$1() {
        return "The saved user id hash was null or empty.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$2(String str, String str2) {
        return j4.s.k("Generating MD5 for user id: ", str, " apiKey: ", str2);
    }

    public static final String getCacheMapKey(String str, String str2) {
        str2.getClass();
        return str == null ? str2 : r8.k.m(str, "_", str2);
    }

    public static final String getMd5Hash(String str) throws NoSuchAlgorithmException {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        BigInteger bigInteger = new BigInteger(1, messageDigest.digest(bytes));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{bigInteger}, 1));
    }

    private static final String getSuffixFromUserIdHashAndApiKey(String str, String str2) {
        return (str2 == null || StringsKt.H(str2)) ? e0.f.k(".", str) : j4.s.k(".", str, ".", str2);
    }

    public static final void ifNonEmpty(String str, Function1<? super String, Unit> function1) {
        function1.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        function1.invoke(str);
    }

    public static final boolean isBlank(String str) {
        if (str != null) {
            return StringsKt.H(str);
        }
        return false;
    }

    public static final boolean isNullOrBlank(String str) {
        return str == null || StringsKt.H(str);
    }

    public static final boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static final String truncateToByteLength(String str, int i11) {
        str.getClass();
        if (getByteSize(str) <= i11) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        charArray.getClass();
        int byteSize = 0;
        for (char c3 : charArray) {
            byteSize += (int) getByteSize(String.valueOf(c3));
            if (byteSize > i11) {
                break;
            }
            sb2.append(c3);
        }
        return sb2.toString();
    }

    public static /* synthetic */ void getCACHE_SUFFIX_PREFERENCES_FILE$annotations() {
    }

    public static /* synthetic */ void getMD5_HASH_OF_THE_STRING_NULL$annotations() {
    }

    public static /* synthetic */ void getSUFFIX_CACHE_USER_ID_HASH_VALUE$annotations() {
    }

    public static /* synthetic */ void getSUFFIX_CACHE_USER_ID_KEY$annotations() {
    }

    public static final String getCacheFileSuffix(Context context, String str) {
        context.getClass();
        return getCacheFileSuffix(context, str, null);
    }
}
