package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.braze.h2;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.c6;
import com.google.android.gms.internal.measurement.e6;
import com.google.android.gms.internal.measurement.g6;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.z5;
import com.google.firebase.messaging.j;
import h7.h1;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import ky.p;
import o30.m0;
import q1.e;
import x0.f;
import y00.a0;
import y00.a3;
import y00.b4;
import y00.d2;
import y00.d3;
import y00.e4;
import y00.g0;
import y00.i2;
import y00.j2;
import y00.l1;
import y00.l2;
import y00.m2;
import y00.n1;
import y00.n2;
import y00.o0;
import y00.r4;
import y00.s4;
import y00.t;
import y00.t2;
import y00.u;
import y00.u0;
import y00.w0;
import y00.w2;
import y00.y2;
import y00.z0;
import yz.a;
import yz.b;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends z5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n1 f12155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f12156h;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f12155g = null;
        this.f12156h = new e(0);
    }

    public final void C(String str, c6 c6Var) {
        b();
        r4 r4Var = this.f12155g.f44990i;
        n1.k(r4Var);
        r4Var.d0(str, c6Var);
    }

    public final void b() {
        if (this.f12155g != null) {
            return;
        }
        h2.b("Attempting to perform action before initialize.");
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void beginAdUnitExposure(@NonNull String str, long j9) throws RemoteException {
        b();
        a0 a0Var = this.f12155g.f44994n;
        n1.j(a0Var);
        a0Var.q(j9, str);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.D(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void clearMeasurementEnabled(long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.q();
        l1 l1Var = ((n1) t2Var.f21216b).f44988g;
        n1.m(l1Var);
        l1Var.y(new f(t2Var, null, false, 22));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void endAdUnitExposure(@NonNull String str, long j9) throws RemoteException {
        b();
        a0 a0Var = this.f12155g.f44994n;
        n1.j(a0Var);
        a0Var.r(j9, str);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void generateEventId(c6 c6Var) throws RemoteException {
        b();
        r4 r4Var = this.f12155g.f44990i;
        n1.k(r4Var);
        long jO0 = r4Var.o0();
        b();
        r4 r4Var2 = this.f12155g.f44990i;
        n1.k(r4Var2);
        r4Var2.e0(c6Var, jO0);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void getAppInstanceId(c6 c6Var) throws RemoteException {
        b();
        l1 l1Var = this.f12155g.f44988g;
        n1.m(l1Var);
        l1Var.y(new f(this, c6Var, false, 20));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void getCachedAppInstanceId(c6 c6Var) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        C((String) t2Var.f45153h.get(), c6Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void getConditionalUserProperties(String str, String str2, c6 c6Var) throws RemoteException {
        b();
        l1 l1Var = this.f12155g.f44988g;
        n1.m(l1Var);
        l1Var.y(new h1(this, c6Var, str, str2, false, 6));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void getCurrentScreenClass(c6 c6Var) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        d3 d3Var = ((n1) t2Var.f21216b).l;
        n1.l(d3Var);
        a3 a3Var = d3Var.f44679d;
        C(a3Var != null ? a3Var.f44580b : null, c6Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void getCurrentScreenName(c6 c6Var) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        d3 d3Var = ((n1) t2Var.f21216b).l;
        n1.l(d3Var);
        a3 a3Var = d3Var.f44679d;
        C(a3Var != null ? a3Var.f44579a : null, c6Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void getGmpAppId(c6 c6Var) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        C(t2Var.E(), c6Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void getMaxUserProperties(String str, c6 c6Var) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        i0.e(str);
        ((n1) t2Var.f21216b).getClass();
        b();
        r4 r4Var = this.f12155g.f44990i;
        n1.k(r4Var);
        r4Var.f0(c6Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void getSessionId(c6 c6Var) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        l1 l1Var = ((n1) t2Var.f21216b).f44988g;
        n1.m(l1Var);
        l1Var.y(new m0(t2Var, c6Var));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void getTestFlag(c6 c6Var, int i11) throws RemoteException {
        b();
        if (i11 == 0) {
            r4 r4Var = this.f12155g.f44990i;
            n1.k(r4Var);
            t2 t2Var = this.f12155g.f44993m;
            n1.l(t2Var);
            AtomicReference atomicReference = new AtomicReference();
            l1 l1Var = ((n1) t2Var.f21216b).f44988g;
            n1.m(l1Var);
            r4Var.d0((String) l1Var.z(atomicReference, 15000L, "String test flag value", new l2(t2Var, atomicReference, 1)), c6Var);
            return;
        }
        if (i11 == 1) {
            r4 r4Var2 = this.f12155g.f44990i;
            n1.k(r4Var2);
            t2 t2Var2 = this.f12155g.f44993m;
            n1.l(t2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            l1 l1Var2 = ((n1) t2Var2.f21216b).f44988g;
            n1.m(l1Var2);
            r4Var2.e0(c6Var, ((Long) l1Var2.z(atomicReference2, 15000L, "long test flag value", new n2(t2Var2, atomicReference2, 0))).longValue());
            return;
        }
        if (i11 == 2) {
            r4 r4Var3 = this.f12155g.f44990i;
            n1.k(r4Var3);
            t2 t2Var3 = this.f12155g.f44993m;
            n1.l(t2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            l1 l1Var3 = ((n1) t2Var3.f21216b).f44988g;
            n1.m(l1Var3);
            double dDoubleValue = ((Double) l1Var3.z(atomicReference3, 15000L, "double test flag value", new n2(t2Var3, atomicReference3, 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                c6Var.A(bundle);
                return;
            } catch (RemoteException e5) {
                w0 w0Var = ((n1) r4Var3.f21216b).f44987f;
                n1.m(w0Var);
                w0Var.f45263j.b(e5, "Error returning double value to wrapper");
                return;
            }
        }
        if (i11 == 3) {
            r4 r4Var4 = this.f12155g.f44990i;
            n1.k(r4Var4);
            t2 t2Var4 = this.f12155g.f44993m;
            n1.l(t2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            l1 l1Var4 = ((n1) t2Var4.f21216b).f44988g;
            n1.m(l1Var4);
            r4Var4.f0(c6Var, ((Integer) l1Var4.z(atomicReference4, 15000L, "int test flag value", new l2(t2Var4, atomicReference4, 2))).intValue());
            return;
        }
        if (i11 != 4) {
            return;
        }
        r4 r4Var5 = this.f12155g.f44990i;
        n1.k(r4Var5);
        t2 t2Var5 = this.f12155g.f44993m;
        n1.l(t2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        l1 l1Var5 = ((n1) t2Var5.f21216b).f44988g;
        n1.m(l1Var5);
        r4Var5.h0(c6Var, ((Boolean) l1Var5.z(atomicReference5, 15000L, "boolean test flag value", new l2(t2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void getUserProperties(String str, String str2, boolean z11, c6 c6Var) throws RemoteException {
        b();
        l1 l1Var = this.f12155g.f44988g;
        n1.m(l1Var);
        l1Var.y(new i2(this, c6Var, str, str2, z11));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void initForTests(@NonNull Map map) throws RemoteException {
        b();
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void initialize(a aVar, j6 j6Var, long j9) throws RemoteException {
        n1 n1Var = this.f12155g;
        if (n1Var == null) {
            Context context = (Context) b.V(aVar);
            i0.h(context);
            this.f12155g = n1.s(context, j6Var, Long.valueOf(j9), null);
        } else {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45263j.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void initializeWithElapsedTime(a aVar, j6 j6Var, long j9, long j11) {
        n1 n1Var = this.f12155g;
        if (n1Var == null) {
            Context context = (Context) b.V(aVar);
            i0.h(context);
            this.f12155g = n1.s(context, j6Var, Long.valueOf(j9), Long.valueOf(j11));
        } else {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45263j.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void isDataCollectionEnabled(c6 c6Var) throws RemoteException {
        b();
        l1 l1Var = this.f12155g.f44988g;
        n1.m(l1Var);
        l1Var.y(new m0(this, c6Var, false, 25));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z11, boolean z12, long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.u(str, str2, bundle, z11, z12, j9, 0L);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void logEventAndBundle(String str, String str2, Bundle bundle, c6 c6Var, long j9) throws RemoteException {
        b();
        i0.e(str2);
        String str3 = true != this.f12155g.f44985d.A(null, g0.f44779f1) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        u uVar = new u(str2, new t(bundle), str3, j9, 0L);
        l1 l1Var = this.f12155g.f44988g;
        n1.m(l1Var);
        l1Var.y(new h1(this, c6Var, uVar, str, false, 3));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void logEventWithElapsedTime(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z11, boolean z12, long j9, long j11) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.u(str, str2, bundle, z11, z12, j9, j11);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void logHealthData(int i11, @NonNull String str, @NonNull a aVar, @NonNull a aVar2, @NonNull a aVar3) throws RemoteException {
        b();
        Object objV = aVar == null ? null : b.V(aVar);
        Object objV2 = aVar2 == null ? null : b.V(aVar2);
        Object objV3 = aVar3 != null ? b.V(aVar3) : null;
        w0 w0Var = this.f12155g.f44987f;
        n1.m(w0Var);
        w0Var.y(i11, true, false, str, objV, objV2, objV3);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityCreated(@NonNull a aVar, @NonNull Bundle bundle, long j9) throws RemoteException {
        b();
        Activity activity = (Activity) b.V(aVar);
        i0.h(activity);
        onActivityCreatedByScionActivityInfo(l6.d(activity), bundle, j9);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityCreatedByScionActivityInfo(l6 l6Var, Bundle bundle, long j9) {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        j jVar = t2Var.f45149d;
        if (jVar != null) {
            t2 t2Var2 = this.f12155g.f44993m;
            n1.l(t2Var2);
            t2Var2.I();
            jVar.i(l6Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityDestroyed(@NonNull a aVar, long j9) throws RemoteException {
        b();
        Activity activity = (Activity) b.V(aVar);
        i0.h(activity);
        onActivityDestroyedByScionActivityInfo(l6.d(activity), j9);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityDestroyedByScionActivityInfo(l6 l6Var, long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        j jVar = t2Var.f45149d;
        if (jVar != null) {
            t2 t2Var2 = this.f12155g.f44993m;
            n1.l(t2Var2);
            t2Var2.I();
            jVar.j(l6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityPaused(@NonNull a aVar, long j9) throws RemoteException {
        b();
        Activity activity = (Activity) b.V(aVar);
        i0.h(activity);
        onActivityPausedByScionActivityInfo(l6.d(activity), j9);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityPausedByScionActivityInfo(l6 l6Var, long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        j jVar = t2Var.f45149d;
        if (jVar != null) {
            t2 t2Var2 = this.f12155g.f44993m;
            n1.l(t2Var2);
            t2Var2.I();
            jVar.k(l6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityResumed(@NonNull a aVar, long j9) throws RemoteException {
        b();
        Activity activity = (Activity) b.V(aVar);
        i0.h(activity);
        onActivityResumedByScionActivityInfo(l6.d(activity), j9);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityResumedByScionActivityInfo(l6 l6Var, long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        j jVar = t2Var.f45149d;
        if (jVar != null) {
            t2 t2Var2 = this.f12155g.f44993m;
            n1.l(t2Var2);
            t2Var2.I();
            jVar.l(l6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivitySaveInstanceState(a aVar, c6 c6Var, long j9) throws RemoteException {
        b();
        Activity activity = (Activity) b.V(aVar);
        i0.h(activity);
        onActivitySaveInstanceStateByScionActivityInfo(l6.d(activity), c6Var, j9);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivitySaveInstanceStateByScionActivityInfo(l6 l6Var, c6 c6Var, long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        j jVar = t2Var.f45149d;
        Bundle bundle = new Bundle();
        if (jVar != null) {
            t2 t2Var2 = this.f12155g.f44993m;
            n1.l(t2Var2);
            t2Var2.I();
            jVar.m(l6Var, bundle);
        }
        try {
            c6Var.A(bundle);
        } catch (RemoteException e5) {
            w0 w0Var = this.f12155g.f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(e5, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityStarted(@NonNull a aVar, long j9) throws RemoteException {
        b();
        Activity activity = (Activity) b.V(aVar);
        i0.h(activity);
        onActivityStartedByScionActivityInfo(l6.d(activity), j9);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityStartedByScionActivityInfo(l6 l6Var, long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        if (t2Var.f45149d != null) {
            t2 t2Var2 = this.f12155g.f44993m;
            n1.l(t2Var2);
            t2Var2.I();
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityStopped(@NonNull a aVar, long j9) throws RemoteException {
        b();
        Activity activity = (Activity) b.V(aVar);
        i0.h(activity);
        onActivityStoppedByScionActivityInfo(l6.d(activity), j9);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void onActivityStoppedByScionActivityInfo(l6 l6Var, long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        if (t2Var.f45149d != null) {
            t2 t2Var2 = this.f12155g.f44993m;
            n1.l(t2Var2);
            t2Var2.I();
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void performAction(Bundle bundle, c6 c6Var, long j9) throws RemoteException {
        b();
        c6Var.A(null);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void registerOnMeasurementEventListener(g6 g6Var) throws RemoteException {
        Object s4Var;
        b();
        e eVar = this.f12156h;
        synchronized (eVar) {
            try {
                s4Var = (d2) eVar.get(Integer.valueOf(g6Var.c()));
                if (s4Var == null) {
                    s4Var = new s4(this, g6Var);
                    eVar.put(Integer.valueOf(g6Var.c()), s4Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.q();
        if (t2Var.f45151f.add(s4Var)) {
            return;
        }
        w0 w0Var = ((n1) t2Var.f21216b).f44987f;
        n1.m(w0Var);
        w0Var.f45263j.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.a6
    @Deprecated
    public void resetAnalyticsData(long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.f45153h.set(null);
        l1 l1Var = ((n1) t2Var.f21216b).f44988g;
        n1.m(l1Var);
        l1Var.y(new j2(t2Var, j9, 1));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void resetAnalyticsDataWithElapsedTime(long j9, long j11) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.f45153h.set(null);
        l1 l1Var = ((n1) t2Var.f21216b).f44988g;
        n1.m(l1Var);
        l1Var.y(new j2(t2Var, j9, 1));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void retrieveAndUploadBatches(e6 e6Var) {
        y2 y2Var;
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.q();
        n1 n1Var = (n1) t2Var.f21216b;
        l1 l1Var = n1Var.f44988g;
        n1.m(l1Var);
        if (l1Var.v()) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        l1 l1Var2 = n1Var.f44988g;
        n1.m(l1Var2);
        if (Thread.currentThread() == l1Var2.f44907e) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45260g.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zV = p.v();
        w0 w0Var3 = n1Var.f44987f;
        if (zV) {
            n1.m(w0Var3);
            w0Var3.f45260g.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        n1.m(w0Var3);
        w0Var3.f45267o.a("[sgtm] Started client-side batch upload work.");
        boolean z11 = false;
        int size = 0;
        int i11 = 0;
        while (!z11) {
            w0 w0Var4 = n1Var.f44987f;
            n1.m(w0Var4);
            w0Var4.f45267o.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            l1 l1Var3 = n1Var.f44988g;
            n1.m(l1Var3);
            l1Var3.z(atomicReference, ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, "[sgtm] Getting upload batches", new l2(t2Var, atomicReference, 3));
            e4 e4Var = (e4) atomicReference.get();
            if (e4Var == null) {
                break;
            }
            List list = e4Var.f44745a;
            if (list.isEmpty()) {
                break;
            }
            w0 w0Var5 = n1Var.f44987f;
            n1.m(w0Var5);
            w0Var5.f45267o.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                b4 b4Var = (b4) it.next();
                try {
                    URL url = new URI(b4Var.f44625c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    o0 o0VarR = ((n1) t2Var.f21216b).r();
                    o0VarR.q();
                    i0.h(o0VarR.f45025h);
                    String str = o0VarR.f45025h;
                    n1 n1Var2 = (n1) t2Var.f21216b;
                    w0 w0Var6 = n1Var2.f44987f;
                    n1.m(w0Var6);
                    u0 u0Var = w0Var6.f45267o;
                    Long lValueOf = Long.valueOf(b4Var.f44623a);
                    u0Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, b4Var.f44625c, Integer.valueOf(b4Var.f44624b.length));
                    if (!TextUtils.isEmpty(b4Var.f44629g)) {
                        w0 w0Var7 = n1Var2.f44987f;
                        n1.m(w0Var7);
                        w0Var7.f45267o.c("[sgtm] Uploading data from app. row_id", lValueOf, b4Var.f44629g);
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = b4Var.f44626d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    w2 w2Var = n1Var2.f44995o;
                    n1.m(w2Var);
                    byte[] bArr = b4Var.f44624b;
                    t5.a aVar = new t5.a(t2Var, atomicReference2, b4Var, 20);
                    w2Var.r();
                    i0.h(url);
                    i0.h(bArr);
                    l1 l1Var4 = ((n1) w2Var.f21216b).f44988g;
                    n1.m(l1Var4);
                    l1Var4.B(new z0(w2Var, str, url, bArr, map, aVar));
                    try {
                        r4 r4Var = n1Var2.f44990i;
                        n1.k(r4Var);
                        n1 n1Var3 = (n1) r4Var.f21216b;
                        n1Var3.f44992k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j9 = jCurrentTimeMillis + TimeConstants.ONE_MINUTE_DIFFERENCE;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = TimeConstants.ONE_MINUTE_DIFFERENCE; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = j9 - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    n1Var3.f44992k.getClass();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        w0 w0Var8 = ((n1) t2Var.f21216b).f44987f;
                        n1.m(w0Var8);
                        w0Var8.f45263j.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    y2Var = atomicReference2.get() == null ? y2.UNKNOWN : (y2) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e5) {
                    w0 w0Var9 = ((n1) t2Var.f21216b).f44987f;
                    n1.m(w0Var9);
                    w0Var9.f45260g.d("[sgtm] Bad upload url for row_id", b4Var.f44625c, Long.valueOf(b4Var.f44623a), e5);
                    y2Var = y2.FAILURE;
                }
                if (y2Var != y2.SUCCESS) {
                    if (y2Var == y2.BACKOFF) {
                        z11 = true;
                        break;
                    }
                } else {
                    i11++;
                }
            }
        }
        w0 w0Var10 = n1Var.f44987f;
        n1.m(w0Var10);
        w0Var10.f45267o.c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i11));
        try {
            e6Var.d();
        } catch (RemoteException e11) {
            n1 n1Var4 = this.f12155g;
            i0.h(n1Var4);
            w0 w0Var11 = n1Var4.f44987f;
            n1.m(w0Var11);
            w0Var11.f45263j.b(e11, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j9) throws RemoteException {
        b();
        n1 n1Var = this.f12155g;
        if (bundle == null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.a("Conditional user property must not be null");
        } else {
            t2 t2Var = n1Var.f44993m;
            n1.l(t2Var);
            t2Var.C(bundle, j9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setConsentThirdParty(@NonNull Bundle bundle, long j9) throws Throwable {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.J(bundle, -20, j9);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setCurrentScreen(@NonNull a aVar, @NonNull String str, @NonNull String str2, long j9) throws RemoteException {
        b();
        Activity activity = (Activity) b.V(aVar);
        i0.h(activity);
        setCurrentScreenByScionActivityInfo(l6.d(activity), str, str2, j9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r3 > 500) goto L27;
     */
    @Override // com.google.android.gms.internal.measurement.a6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.l6 r6, java.lang.String r7, java.lang.String r8, long r9) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.l6, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setDataCollectionEnabled(boolean z11) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.q();
        l1 l1Var = ((n1) t2Var.f21216b).f44988g;
        n1.m(l1Var);
        l1Var.y(new y00.h2(t2Var, z11));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        l1 l1Var = ((n1) t2Var.f21216b).f44988g;
        n1.m(l1Var);
        l1Var.y(new m2(t2Var, bundle2, 1));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setEventInterceptor(g6 g6Var) throws RemoteException {
        b();
        ub.a aVar = new ub.a(this, g6Var, false, 26);
        l1 l1Var = this.f12155g.f44988g;
        n1.m(l1Var);
        boolean zV = l1Var.v();
        n1 n1Var = this.f12155g;
        if (!zV) {
            l1 l1Var2 = n1Var.f44988g;
            n1.m(l1Var2);
            l1Var2.y(new f(this, aVar, false, 23));
            return;
        }
        t2 t2Var = n1Var.f44993m;
        n1.l(t2Var);
        t2Var.p();
        t2Var.q();
        ub.a aVar2 = t2Var.f45150e;
        if (aVar != aVar2) {
            i0.j("EventInterceptor already set.", aVar2 == null);
        }
        t2Var.f45150e = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setInstanceIdProvider(i6 i6Var) throws RemoteException {
        b();
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setMeasurementEnabled(boolean z11, long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        Boolean boolValueOf = Boolean.valueOf(z11);
        t2Var.q();
        l1 l1Var = ((n1) t2Var.f21216b).f44988g;
        n1.m(l1Var);
        l1Var.y(new f(t2Var, boolValueOf, false, 22));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setMinimumSessionDuration(long j9) throws RemoteException {
        b();
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setSessionTimeoutDuration(long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        l1 l1Var = ((n1) t2Var.f21216b).f44988g;
        n1.m(l1Var);
        l1Var.y(new j2(t2Var, j9, 0));
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        n1 n1Var = (n1) t2Var.f21216b;
        Uri data = intent.getData();
        if (data == null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45265m.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45265m.a("[sgtm] Preview Mode was not enabled.");
            n1Var.f44985d.f44759d = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        w0 w0Var3 = n1Var.f44987f;
        n1.m(w0Var3);
        w0Var3.f45265m.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        n1Var.f44985d.f44759d = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setUserId(@NonNull String str, long j9) throws RemoteException {
        b();
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        n1 n1Var = (n1) t2Var.f21216b;
        if (str != null && TextUtils.isEmpty(str)) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45263j.a("User ID must be non-empty or null");
        } else {
            l1 l1Var = n1Var.f44988g;
            n1.m(l1Var);
            l1Var.y(new m0(23, t2Var, str));
            t2Var.z(null, "_id", str, true, j9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull a aVar, boolean z11, long j9) throws RemoteException {
        b();
        Object objV = b.V(aVar);
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.z(str, str2, objV, z11, j9);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void unregisterOnMeasurementEventListener(g6 g6Var) throws RemoteException {
        Object s4Var;
        b();
        e eVar = this.f12156h;
        synchronized (eVar) {
            s4Var = (d2) eVar.remove(Integer.valueOf(g6Var.c()));
        }
        if (s4Var == null) {
            s4Var = new s4(this, g6Var);
        }
        t2 t2Var = this.f12155g.f44993m;
        n1.l(t2Var);
        t2Var.q();
        if (t2Var.f45151f.remove(s4Var)) {
            return;
        }
        w0 w0Var = ((n1) t2Var.f21216b).f44987f;
        n1.m(w0Var);
        w0Var.f45263j.a("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public void setConsent(@NonNull Bundle bundle, long j9) throws RemoteException {
    }
}
