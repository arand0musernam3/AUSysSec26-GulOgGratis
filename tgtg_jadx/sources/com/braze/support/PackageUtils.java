package com.braze.support;

import android.content.Context;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/support/PackageUtils;", "", "<init>", "()V", "packageName", "", "setResourcePackageName", "", "getResourcePackageName", "context", "Landroid/content/Context;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PackageUtils {
    public static final PackageUtils INSTANCE = new PackageUtils();
    private static String packageName;

    private PackageUtils() {
    }

    public static final String getResourcePackageName(Context context) {
        context.getClass();
        String str = packageName;
        if (str != null) {
            return str;
        }
        String packageName2 = context.getPackageName();
        packageName = packageName2;
        return packageName2 == null ? "unknown.package" : packageName2;
    }

    public static final void setResourcePackageName(String packageName2) {
        packageName2.getClass();
        if (StringsKt.H(packageName2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new m60.a(22), 6, (Object) null);
        } else {
            packageName = packageName2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setResourcePackageName$lambda$0() {
        return "Package name may not be blank";
    }
}
