package px;

import java.util.Set;
import kotlin.collections.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35631a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f35632b = y.W(new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a() {
        /*
            px.f r0 = px.f.f35636a
            java.util.Set r1 = yx.a.f46339a
            java.lang.Class<px.a> r2 = px.a.class
            boolean r3 = r1.contains(r2)
            r4 = 0
            if (r3 == 0) goto Le
            return r4
        Le:
            android.content.Context r3 = ax.a0.a()     // Catch: java.lang.Throwable -> L54
            boolean r3 = ax.a0.f(r3)     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L56
            boolean r3 = tx.n0.v()     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L56
            java.lang.Class<px.f> r3 = px.f.class
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L54
            r5 = 1
            if (r1 == 0) goto L29
        L27:
            r0 = r4
            goto L50
        L29:
            java.lang.Boolean r1 = px.f.f35637b     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L43
            android.content.Context r1 = ax.a0.a()     // Catch: java.lang.Throwable -> L41
            android.content.Intent r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L39
            r0 = r5
            goto L3a
        L39:
            r0 = r4
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L41
            px.f.f35637b = r0     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r0 = move-exception
            goto L4c
        L43:
            java.lang.Boolean r0 = px.f.f35637b     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L27
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L41
            goto L50
        L4c:
            yx.a.a(r3, r0)     // Catch: java.lang.Throwable -> L54
            goto L27
        L50:
            if (r0 == 0) goto L56
            r4 = r5
            goto L56
        L54:
            r0 = move-exception
            goto L57
        L56:
            return r4
        L57:
            yx.a.a(r2, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: px.a.a():boolean");
    }
}
