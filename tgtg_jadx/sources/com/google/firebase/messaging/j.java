package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.cg;
import com.google.android.gms.internal.measurement.dd;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.m6;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Objects;
import y00.a3;
import y00.c3;
import y00.d3;
import y00.l1;
import y00.n1;
import y00.r3;
import y00.t2;
import y00.u3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12830b;

    public j(int i11) {
        this.f12829a = i11;
        switch (i11) {
            case 1:
                this.f12830b = cg.a(Integer.MAX_VALUE, null, null, 6);
                break;
            default:
                this.f12830b = new ArrayDeque(10);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:22:0x0048, B:25:0x004f, B:30:0x0061, B:35:0x006e, B:15:0x002d, B:17:0x0034, B:19:0x0040), top: B:44:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(com.google.android.gms.internal.measurement.l6 r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f12830b
            r1 = r0
            y00.t2 r1 = (y00.t2) r1
            java.lang.Object r0 = r1.f21216b     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            y00.n1 r0 = (y00.n1) r0     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            y00.w0 r2 = r0.f44987f     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            y00.n1.m(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            y00.u0 r2 = r2.f45267o     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "onActivityCreated"
            r2.a(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            android.content.Intent r2 = r9.f11593c     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L7d
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 == 0) goto L2d
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r4 != 0) goto L26
            goto L2d
        L26:
            r5 = r3
            goto L46
        L28:
            r0 = move-exception
            goto L9f
        L2b:
            r0 = move-exception
            goto L8a
        L2d:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r4 = 0
            if (r3 == 0) goto L45
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r5 != 0) goto L45
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto L26
        L45:
            r5 = r4
        L46:
            if (r5 == 0) goto L7d
            boolean r3 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L4f
            goto L7d
        L4f:
            y00.r4 r3 = r0.f44990i     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            y00.n1.k(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            boolean r2 = y00.r4.s0(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L5e
            java.lang.String r2 = "gs"
        L5c:
            r6 = r2
            goto L61
        L5e:
            java.lang.String r2 = "auto"
            goto L5c
        L61:
            java.lang.String r2 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r10 != 0) goto L6c
            r2 = 1
        L6a:
            r4 = r2
            goto L6e
        L6c:
            r2 = 0
            goto L6a
        L6e:
            y00.l1 r0 = r0.f44988g     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            y00.n1.m(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            y00.i2 r2 = new y00.i2     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r0.y(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto L9a
        L7d:
            java.lang.Object r0 = r1.f21216b
            y00.n1 r0 = (y00.n1) r0
        L81:
            y00.d3 r0 = r0.l
            y00.n1.l(r0)
            r0.w(r9, r10)
            return
        L8a:
            java.lang.Object r2 = r1.f21216b     // Catch: java.lang.Throwable -> L28
            y00.n1 r2 = (y00.n1) r2     // Catch: java.lang.Throwable -> L28
            y00.w0 r2 = r2.f44987f     // Catch: java.lang.Throwable -> L28
            y00.n1.m(r2)     // Catch: java.lang.Throwable -> L28
            y00.u0 r2 = r2.f45260g     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.b(r0, r3)     // Catch: java.lang.Throwable -> L28
        L9a:
            java.lang.Object r0 = r1.f21216b
            y00.n1 r0 = (y00.n1) r0
            goto L81
        L9f:
            java.lang.Object r1 = r1.f21216b
            y00.n1 r1 = (y00.n1) r1
            y00.d3 r1 = r1.l
            y00.n1.l(r1)
            r1.w(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.j.i(com.google.android.gms.internal.measurement.l6, android.os.Bundle):void");
    }

    public void j(l6 l6Var) {
        d3 d3Var = ((n1) ((t2) this.f12830b).f21216b).l;
        n1.l(d3Var);
        synchronized (d3Var.f44687m) {
            try {
                if (Objects.equals(d3Var.f44683h, l6Var)) {
                    d3Var.f44683h = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((n1) d3Var.f21216b).f44985d.E()) {
            d3Var.f44682g.remove(Integer.valueOf(l6Var.f11591a));
        }
    }

    public void k(l6 l6Var) {
        n1 n1Var = (n1) ((t2) this.f12830b).f21216b;
        d3 d3Var = n1Var.l;
        n1.l(d3Var);
        synchronized (d3Var.f44687m) {
            d3Var.l = false;
            d3Var.f44684i = true;
        }
        n1 n1Var2 = (n1) d3Var.f21216b;
        n1Var2.f44992k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (n1Var2.f44985d.E()) {
            a3 a3VarZ = d3Var.z(l6Var);
            d3Var.f44680e = d3Var.f44679d;
            d3Var.f44679d = null;
            l1 l1Var = n1Var2.f44988g;
            n1.m(l1Var);
            l1Var.y(new dd(d3Var, a3VarZ, jElapsedRealtime));
        } else {
            d3Var.f44679d = null;
            l1 l1Var2 = n1Var2.f44988g;
            n1.m(l1Var2);
            l1Var2.y(new y00.z(d3Var, jElapsedRealtime));
        }
        u3 u3Var = n1Var.f44989h;
        n1.l(u3Var);
        n1 n1Var3 = (n1) u3Var.f21216b;
        n1Var3.f44992k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        l1 l1Var3 = n1Var3.f44988g;
        n1.m(l1Var3);
        l1Var3.y(new r3(u3Var, jElapsedRealtime2, 1));
    }

    public void l(l6 l6Var) {
        n1 n1Var = (n1) ((t2) this.f12830b).f21216b;
        u3 u3Var = n1Var.f44989h;
        n1.l(u3Var);
        n1 n1Var2 = (n1) u3Var.f21216b;
        n1Var2.f44992k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        l1 l1Var = n1Var2.f44988g;
        n1.m(l1Var);
        l1Var.y(new r3(u3Var, jElapsedRealtime, 0));
        d3 d3Var = n1Var.l;
        n1.l(d3Var);
        Object obj = d3Var.f44687m;
        synchronized (obj) {
            try {
                d3Var.l = true;
                if (!Objects.equals(l6Var, d3Var.f44683h)) {
                    synchronized (obj) {
                        d3Var.f44683h = l6Var;
                        d3Var.f44684i = false;
                        n1 n1Var3 = (n1) d3Var.f21216b;
                        if (n1Var3.f44985d.E()) {
                            d3Var.f44685j = null;
                            l1 l1Var2 = n1Var3.f44988g;
                            n1.m(l1Var2);
                            l1Var2.y(new c3(d3Var, 1));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        n1 n1Var4 = (n1) d3Var.f21216b;
        if (!n1Var4.f44985d.E()) {
            d3Var.f44679d = d3Var.f44685j;
            l1 l1Var3 = n1Var4.f44988g;
            n1.m(l1Var3);
            l1Var3.y(new c3(d3Var, 0));
            return;
        }
        d3Var.x(l6Var.f11592b, d3Var.z(l6Var), false);
        y00.a0 a0Var = ((n1) d3Var.f21216b).f44994n;
        n1.j(a0Var);
        n1 n1Var5 = (n1) a0Var.f21216b;
        n1Var5.f44992k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        l1 l1Var4 = n1Var5.f44988g;
        n1.m(l1Var4);
        l1Var4.y(new y00.z(a0Var, jElapsedRealtime2));
    }

    public void m(l6 l6Var, Bundle bundle) {
        a3 a3Var;
        d3 d3Var = ((n1) ((t2) this.f12830b).f21216b).l;
        n1.l(d3Var);
        if (!((n1) d3Var.f21216b).f44985d.E() || bundle == null || (a3Var = (a3) d3Var.f44682g.get(Integer.valueOf(l6Var.f11591a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", a3Var.f44581c);
        bundle2.putString("name", a3Var.f44579a);
        bundle2.putString("referrer_name", a3Var.f44580b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f12829a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f12830b;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e5) {
                        Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e5);
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null) {
                            if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                                r30.a aVar = (r30.a) p30.g.c().b(r30.a.class);
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                                }
                                if (aVar != null) {
                                    String string2 = bundle2.getString("google.c.a.c_id");
                                    r30.b bVar = (r30.b) aVar;
                                    if (!s30.a.f38832c.contains("fcm")) {
                                        a7 a7Var = bVar.f37611a.f12154a;
                                        a7Var.a(new m6(a7Var, string2, 0));
                                    }
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("source", "Firebase");
                                    bundle3.putString("medium", "notification");
                                    bundle3.putString("campaign", string2);
                                    bVar.a("fcm", "_cmp", bundle3);
                                } else {
                                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                                }
                            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                            }
                        }
                        l0.g(bundle2, "_no");
                    }
                    break;
                }
                break;
            case 1:
                activity.getClass();
                ((x80.i) this.f12830b).h(new jf.a(new WeakReference(activity), jf.b.Created));
                break;
            default:
                i(l6.d(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f12829a) {
            case 0:
                break;
            case 1:
                activity.getClass();
                ((x80.i) this.f12830b).h(new jf.a(new WeakReference(activity), jf.b.Destroyed));
                break;
            default:
                j(l6.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f12829a) {
            case 0:
                break;
            case 1:
                activity.getClass();
                ((x80.i) this.f12830b).h(new jf.a(new WeakReference(activity), jf.b.Paused));
                break;
            default:
                k(l6.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f12829a) {
            case 0:
                break;
            case 1:
                activity.getClass();
                ((x80.i) this.f12830b).h(new jf.a(new WeakReference(activity), jf.b.Resumed));
                break;
            default:
                l(l6.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f12829a) {
            case 0:
                break;
            case 1:
                activity.getClass();
                bundle.getClass();
                break;
            default:
                m(l6.d(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f12829a) {
            case 1:
                activity.getClass();
                ((x80.i) this.f12830b).h(new jf.a(new WeakReference(activity), jf.b.Started));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f12829a) {
            case 1:
                activity.getClass();
                ((x80.i) this.f12830b).h(new jf.a(new WeakReference(activity), jf.b.Stopped));
                break;
        }
    }

    private final void a(Activity activity) {
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    public j(t2 t2Var) {
        this.f12829a = 2;
        this.f12830b = t2Var;
    }

    private final void d(Activity activity, Bundle bundle) {
    }
}
