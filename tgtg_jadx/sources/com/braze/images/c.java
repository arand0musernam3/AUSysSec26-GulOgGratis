package com.braze.images;

import android.content.Context;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import d8.b0;
import java.io.File;
import kotlin.jvm.functions.Function0;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public final void a(Context context) {
        context.getClass();
        try {
            File file = new File(context.getCacheDir(), DefaultBrazeImageLoader.BRAZE_LRU_CACHE_FOLDER);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b0(file, 10), 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(file);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new xh.d(25), 4, (Object) null);
        }
    }

    public static final String a(File file) {
        return e0.f.k("Deleting lru image cache directory at: ", file.getAbsolutePath());
    }

    public static final String a() {
        return "Failed to delete stored data in image loader";
    }

    public static File a(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(k.m(context.getCacheDir().getPath(), File.separator, str));
    }
}
