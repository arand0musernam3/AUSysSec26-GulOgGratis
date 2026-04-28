package ax;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.braze.h2;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f4849a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f4850b = h1.c(m0.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Executor f4851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile String f4852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile String f4853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f4854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f4855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile String f4856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile Boolean f4857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Context f4858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f4859k;
    public static final ReentrantLock l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f4860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f4861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f4862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f4863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicBoolean f4864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile String f4865r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile String f4866s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a40.d0 f4867t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f4868u;

    static {
        new AtomicLong(65536L);
        f4859k = 64206;
        l = new ReentrantLock();
        f4860m = "v16.0";
        f4864q = new AtomicBoolean(false);
        f4865r = "instagram.com";
        f4866s = "facebook.com";
        f4867t = new a40.d0();
    }

    public static final Context a() {
        tx.j.n();
        Context context = f4858j;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        return null;
    }

    public static final String b() {
        tx.j.n();
        String str = f4852d;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final Executor c() {
        ReentrantLock reentrantLock = l;
        reentrantLock.lock();
        try {
            if (f4851c == null) {
                f4851c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor = f4851c;
            if (executor != null) {
                return executor;
            }
            h2.b("Required value was null.");
            return null;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String d() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = f4860m;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    public static final String e() {
        Date date = b.l;
        b bVarV = pd.g.v();
        String str = bVarV != null ? bVarV.f4881k : null;
        String str2 = f4866s;
        if (str != null) {
            if (Intrinsics.areEqual(str, "gaming")) {
                return kotlin.text.y.n(str2, "facebook.com", "fb.gg", false);
            }
            if (Intrinsics.areEqual(str, "instagram")) {
                return kotlin.text.y.n(str2, "facebook.com", "instagram.com", false);
            }
        }
        return str2;
    }

    public static final boolean f(Context context) {
        context.getClass();
        tx.j.n();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final void g(m0 m0Var) {
        m0Var.getClass();
        synchronized (f4850b) {
        }
    }

    public static final void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f4852d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    if (kotlin.text.y.p(lowerCase, "fb", false)) {
                        f4852d = str.substring(2);
                    } else {
                        f4852d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            f4854f = applicationInfo.metaData.getString("com.facebook.sdk.RedirectURI");
            f4855g = applicationInfo.metaData.getString("com.facebook.sdk.IntentUriPackageTarget");
            if (f4853e == null) {
                f4853e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f4856h == null) {
                f4856h = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f4859k == 64206) {
                f4859k = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f4857i == null) {
                f4857i = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final synchronized void i(Context context) {
        context.getClass();
        j(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x0016, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0010, B:12:0x0019, B:14:0x0024, B:15:0x0029, B:17:0x003a, B:18:0x0040, B:20:0x0047, B:22:0x004d, B:24:0x0051, B:26:0x0057, B:35:0x007f, B:36:0x0081, B:38:0x0085, B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x0099, B:46:0x009f, B:48:0x00aa, B:50:0x00b2, B:52:0x00b6, B:53:0x00bc, B:59:0x00d4, B:60:0x00d7, B:62:0x00e3, B:64:0x00ea, B:47:0x00a7, B:33:0x0079, B:67:0x015a, B:68:0x0161, B:69:0x0162, B:70:0x0169, B:56:0x00c7, B:30:0x006c), top: B:78:0x0003, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085 A[Catch: all -> 0x0016, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0010, B:12:0x0019, B:14:0x0024, B:15:0x0029, B:17:0x003a, B:18:0x0040, B:20:0x0047, B:22:0x004d, B:24:0x0051, B:26:0x0057, B:35:0x007f, B:36:0x0081, B:38:0x0085, B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x0099, B:46:0x009f, B:48:0x00aa, B:50:0x00b2, B:52:0x00b6, B:53:0x00bc, B:59:0x00d4, B:60:0x00d7, B:62:0x00e3, B:64:0x00ea, B:47:0x00a7, B:33:0x0079, B:67:0x015a, B:68:0x0161, B:69:0x0162, B:70:0x0169, B:56:0x00c7, B:30:0x006c), top: B:78:0x0003, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7 A[Catch: all -> 0x0016, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0010, B:12:0x0019, B:14:0x0024, B:15:0x0029, B:17:0x003a, B:18:0x0040, B:20:0x0047, B:22:0x004d, B:24:0x0051, B:26:0x0057, B:35:0x007f, B:36:0x0081, B:38:0x0085, B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x0099, B:46:0x009f, B:48:0x00aa, B:50:0x00b2, B:52:0x00b6, B:53:0x00bc, B:59:0x00d4, B:60:0x00d7, B:62:0x00e3, B:64:0x00ea, B:47:0x00a7, B:33:0x0079, B:67:0x015a, B:68:0x0161, B:69:0x0162, B:70:0x0169, B:56:0x00c7, B:30:0x006c), top: B:78:0x0003, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2 A[Catch: all -> 0x0016, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0010, B:12:0x0019, B:14:0x0024, B:15:0x0029, B:17:0x003a, B:18:0x0040, B:20:0x0047, B:22:0x004d, B:24:0x0051, B:26:0x0057, B:35:0x007f, B:36:0x0081, B:38:0x0085, B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x0099, B:46:0x009f, B:48:0x00aa, B:50:0x00b2, B:52:0x00b6, B:53:0x00bc, B:59:0x00d4, B:60:0x00d7, B:62:0x00e3, B:64:0x00ea, B:47:0x00a7, B:33:0x0079, B:67:0x015a, B:68:0x0161, B:69:0x0162, B:70:0x0169, B:56:0x00c7, B:30:0x006c), top: B:78:0x0003, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3 A[Catch: all -> 0x0016, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0010, B:12:0x0019, B:14:0x0024, B:15:0x0029, B:17:0x003a, B:18:0x0040, B:20:0x0047, B:22:0x004d, B:24:0x0051, B:26:0x0057, B:35:0x007f, B:36:0x0081, B:38:0x0085, B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x0099, B:46:0x009f, B:48:0x00aa, B:50:0x00b2, B:52:0x00b6, B:53:0x00bc, B:59:0x00d4, B:60:0x00d7, B:62:0x00e3, B:64:0x00ea, B:47:0x00a7, B:33:0x0079, B:67:0x015a, B:68:0x0161, B:69:0x0162, B:70:0x0169, B:56:0x00c7, B:30:0x006c), top: B:78:0x0003, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void j(android.content.Context r8) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.a0.j(android.content.Context):void");
    }
}
