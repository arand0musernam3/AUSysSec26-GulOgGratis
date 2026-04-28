package oz;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m2.f2;
import q1.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f33800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PendingIntent f33801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f33802j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f33804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2 f33805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f33806d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f33808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f33809g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f33803a = new k1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f33807e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f33804b = context;
        this.f33805c = new f2(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f33806d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d10.o a(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.b.a(android.os.Bundle):d10.o");
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.f33803a) {
            try {
                d10.g gVar = (d10.g) this.f33803a.remove(str);
                if (gVar != null) {
                    gVar.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
