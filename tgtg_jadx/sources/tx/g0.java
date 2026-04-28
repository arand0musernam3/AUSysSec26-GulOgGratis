package tx;

import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TreeSet f40513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40514b;

    public /* synthetic */ g0(int i11) {
        this.f40514b = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0011 A[Catch: all -> 0x000f, TRY_LEAVE, TryCatch #1 {all -> 0x000f, all -> 0x0024, blocks: (B:5:0x0004, B:7:0x0008, B:20:0x002b, B:22:0x002f, B:24:0x0035, B:25:0x0037, B:27:0x003b, B:29:0x0049, B:36:0x005b, B:35:0x0058, B:12:0x0011, B:19:0x0029, B:18:0x0025, B:15:0x001f), top: B:43:0x0004 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto L11
            java.util.TreeSet r4 = r3.f40513a     // Catch: java.lang.Throwable -> Lf
            if (r4 == 0) goto L11
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> Lf
            if (r4 != 0) goto L11
            goto L2b
        Lf:
            r4 = move-exception
            goto L62
        L11:
            tx.h0 r4 = tx.h0.f40515a     // Catch: java.lang.Throwable -> Lf
            java.lang.Class<tx.h0> r1 = tx.h0.class
            java.util.Set r2 = yx.a.f46339a     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r2.contains(r1)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L1f
        L1d:
            r4 = r0
            goto L29
        L1f:
            java.util.TreeSet r4 = r4.f(r3)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r4 = move-exception
            yx.a.a(r1, r4)     // Catch: java.lang.Throwable -> Lf
            goto L1d
        L29:
            r3.f40513a = r4     // Catch: java.lang.Throwable -> Lf
        L2b:
            java.util.TreeSet r4 = r3.f40513a     // Catch: java.lang.Throwable -> Lf
            if (r4 == 0) goto L35
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> Lf
            if (r4 == 0) goto L60
        L35:
            int r4 = r3.f40514b     // Catch: java.lang.Throwable -> Lf
            switch(r4) {
                case 2: goto L3b;
                default: goto L3a;
            }     // Catch: java.lang.Throwable -> Lf
        L3a:
            goto L60
        L3b:
            android.content.Context r4 = ax.a0.a()     // Catch: java.lang.Throwable -> Lf
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> Lf
            int r4 = r4.targetSdkVersion     // Catch: java.lang.Throwable -> Lf
            r1 = 30
            if (r4 < r1) goto L60
            java.lang.Class<tx.h0> r4 = tx.h0.class
            java.util.Set r1 = yx.a.f46339a     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r1.contains(r4)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L54
            goto L5b
        L54:
            java.lang.String r0 = "tx.h0"
            goto L5b
        L57:
            r1 = move-exception
            yx.a.a(r4, r1)     // Catch: java.lang.Throwable -> Lf
        L5b:
            java.lang.String r4 = "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration."
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> Lf
        L60:
            monitor-exit(r3)
            return
        L62:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.g0.a(boolean):void");
    }

    public final String b() {
        switch (this.f40514b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.instagram.android";
            case 2:
                return "com.facebook.katana";
            case 3:
                return "com.facebook.orca";
            default:
                return "com.facebook.wakizashi";
        }
    }

    public final void c() {
    }
}
