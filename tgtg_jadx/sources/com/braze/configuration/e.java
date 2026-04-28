package com.braze.configuration;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.g2;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import e0.f;
import kotlin.jvm.functions.Function0;
import rg.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f9650a;

    public e(Context context) {
        context.getClass();
        this.f9650a = new g2(context);
    }

    public static final String c(String str) {
        return f.k("Offline user storage provider was given user ID longer than 997. Rejecting. User ID: ", str);
    }

    public final String a() {
        String string = this.f9650a.readString(DataStoreKey.LAST_USER_ID, "");
        String str = string != null ? string : "";
        if (StringUtils.getByteSize(str) <= 997) {
            return str;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new qw.e(str, 9), 6, (Object) null);
        String strTruncateToByteLength = StringUtils.truncateToByteLength(str, 997);
        b(strTruncateToByteLength);
        return strTruncateToByteLength;
    }

    public final void b(String str) {
        str.getClass();
        if (str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new m(26), 6, (Object) null);
        } else if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new qw.e(str, 10), 6, (Object) null);
        } else {
            this.f9650a.writeData(DataStoreKey.LAST_USER_ID, str);
        }
    }

    public static final String a(String str) {
        return f.k("Stored user ID is longer than 997 bytes. Truncating. Original user ID: ", str);
    }

    public static final String b() {
        return "userId is empty in updateLastUserId. Rejecting.";
    }
}
