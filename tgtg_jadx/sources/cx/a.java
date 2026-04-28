package cx;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13458a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f13459b;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r3, java.lang.String r4, java.util.HashMap r5) {
        /*
            java.util.HashMap r0 = cx.d.f13465e
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case 3585: goto L51;
                case 3586: goto L3a;
                case 3587: goto L31;
                case 3588: goto Lc;
                default: goto La;
            }
        La:
            goto L77
        Lc:
            java.lang.String r0 = "r6"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L15
            goto L77
        L15:
            java.lang.String r0 = "-"
            boolean r2 = kotlin.text.StringsKt.z(r4, r0, r1)
            if (r2 == 0) goto L77
            kotlin.text.Regex r2 = new kotlin.text.Regex
            r2.<init>(r0)
            java.util.List r4 = r2.g(r1, r4)
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r4 = r4[r1]
            goto L77
        L31:
            java.lang.String r0 = "r5"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L43
            goto L77
        L3a:
            java.lang.String r0 = "r4"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L43
            goto L77
        L43:
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "[^a-z]+"
            r0.<init>(r1)
            java.lang.String r1 = ""
            java.lang.String r4 = r0.replace(r4, r1)
            goto L77
        L51:
            java.lang.String r0 = "r3"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5a
            goto L77
        L5a:
            java.lang.String r0 = "m"
            boolean r2 = kotlin.text.y.p(r4, r0, r1)
            if (r2 != 0) goto L76
            java.lang.String r2 = "b"
            boolean r2 = kotlin.text.y.p(r4, r2, r1)
            if (r2 != 0) goto L76
            java.lang.String r2 = "ge"
            boolean r4 = kotlin.text.y.p(r4, r2, r1)
            if (r4 == 0) goto L73
            goto L76
        L73:
            java.lang.String r4 = "f"
            goto L77
        L76:
            r4 = r0
        L77:
            r5.put(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cx.a.a(java.lang.String, java.lang.String, java.util.HashMap):void");
    }

    public static void b(Activity activity) {
        View viewU;
        int iHashCode = activity.hashCode();
        HashMap map = null;
        if (!yx.a.f46339a.contains(d.class)) {
            try {
                map = d.f13465e;
            } catch (Throwable th2) {
                yx.a.a(d.class, th2);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object dVar = map.get(numValueOf);
        if (dVar == null) {
            dVar = new d(activity);
            map.put(numValueOf, dVar);
        }
        d dVar2 = (d) dVar;
        Set set = yx.a.f46339a;
        if (set.contains(d.class)) {
            return;
        }
        try {
        } catch (Throwable th3) {
            yx.a.a(d.class, th3);
        }
        if (set.contains(dVar2)) {
            return;
        }
        try {
            if (!dVar2.f13469d.getAndSet(true) && (viewU = nx.d.u((Activity) dVar2.f13468c.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewU.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalFocusChangeListener(dVar2);
                    return;
                }
                return;
                yx.a.a(d.class, th3);
            }
        } catch (Throwable th4) {
            yx.a.a(dVar2, th4);
        }
    }
}
