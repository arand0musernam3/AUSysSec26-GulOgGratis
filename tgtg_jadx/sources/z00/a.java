package z00;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.a f46384a = com.google.android.gms.common.a.f11048b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f46385b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f46386c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f46387d = false;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4 A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:12:0x0052, B:15:0x0059, B:22:0x007c, B:23:0x0081, B:20:0x0068, B:25:0x0083, B:27:0x0088, B:33:0x0094, B:35:0x0098, B:38:0x00d4, B:41:0x00e4, B:42:0x00e9, B:44:0x00eb, B:45:0x00f9), top: B:48:0x0052, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:12:0x0052, B:15:0x0059, B:22:0x007c, B:23:0x0081, B:20:0x0068, B:25:0x0083, B:27:0x0088, B:33:0x0094, B:35:0x0098, B:38:0x00d4, B:41:0x00e4, B:42:0x00e9, B:44:0x00eb, B:45:0x00f9), top: B:48:0x0052, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z00.a.a(android.content.Context):void");
    }

    public static void b(Context context, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (f46386c == null) {
                f46386c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f46386c.invoke(null, context);
        } catch (Exception e5) {
            Throwable cause = e5.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e5.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
