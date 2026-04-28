package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.w5;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Set;
import qz.b0;
import qz.f0;
import qz.j0;
import qz.l0;
import qz.m0;
import qz.n0;
import qz.u;
import qz.v;
import qz.w;
import qz.x;
import qz.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    @NonNull
    protected final qz.g zaa;
    private final Context zab;
    private final String zac;
    private final xz.a zad;
    private final h zae;
    private final d zaf;
    private final qz.a zag;
    private final Looper zah;
    private final int zai;
    private final o zaj;
    private final qz.r zak;

    public l(Context context, Activity activity, h hVar, d dVar, k kVar) {
        i0.i(context, "Null context is not permitted.");
        i0.i(hVar, "Api must not be null.");
        i0.i(kVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        i0.i(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        int i11 = Build.VERSION.SDK_INT;
        String attributionTag = i11 >= 30 ? i11 >= 30 ? context.getAttributionTag() : null : getApiFallbackAttributionTag(context);
        this.zac = attributionTag;
        this.zad = i11 >= 31 ? new xz.a(context.getAttributionSource()) : null;
        this.zae = hVar;
        this.zaf = dVar;
        this.zah = kVar.f11086b;
        qz.a aVar = new qz.a(hVar, dVar, attributionTag);
        this.zag = aVar;
        this.zaj = new b0(this);
        qz.g gVarE = qz.g.e(applicationContext);
        this.zaa = gVarE;
        this.zai = gVarE.f37343h.getAndIncrement();
        this.zak = kVar.f11085a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            qz.j jVarB = qz.i.b(activity);
            w wVar = (w) jVarB.c(w.class, "ConnectionlessLifecycleHelper");
            if (wVar == null) {
                Object obj = GoogleApiAvailability.f11043c;
                wVar = new w(jVarB, gVarE);
            }
            wVar.f37397f.add(aVar);
            gVarE.f(wVar);
        }
        w5 w5Var = gVarE.f37348n;
        w5Var.sendMessage(w5Var.obtainMessage(7, this));
    }

    public final void a(int i11, qz.d dVar) {
        boolean z11 = true;
        if (!dVar.f11079i && !((Boolean) BasePendingResult.f11070j.get()).booleanValue()) {
            z11 = false;
        }
        dVar.f11079i = z11;
        qz.g gVar = this.zaa;
        gVar.getClass();
        f0 f0Var = new f0(new l0(i11, dVar), gVar.f37344i.get(), this);
        w5 w5Var = gVar.f37348n;
        w5Var.sendMessage(w5Var.obtainMessage(4, f0Var));
    }

    @NonNull
    public o asGoogleApiClient() {
        return this.zaj;
    }

    public final d10.o b(int i11, u uVar) {
        d10.g gVar = new d10.g();
        qz.r rVar = this.zak;
        qz.g gVar2 = this.zaa;
        gVar2.getClass();
        gVar2.c(gVar, uVar.zab(), this);
        f0 f0Var = new f0(new n0(i11, uVar, gVar, rVar), gVar2.f37344i.get(), this);
        w5 w5Var = gVar2.f37348n;
        w5Var.sendMessage(w5Var.obtainMessage(4, f0Var));
        return gVar.f13697a;
    }

    @NonNull
    public com.google.android.gms.common.internal.h createClientSettingsBuilder() {
        com.google.android.gms.common.internal.h hVar = new com.google.android.gms.common.internal.h();
        Set set = Collections.EMPTY_SET;
        if (hVar.f11115a == null) {
            hVar.f11115a = new q1.f(0);
        }
        hVar.f11115a.addAll(set);
        Context context = this.zab;
        hVar.f11117c = context.getClass().getName();
        hVar.f11116b = context.getPackageName();
        return hVar;
    }

    @NonNull
    public Task<Boolean> disconnectService() {
        qz.g gVar = this.zaa;
        gVar.getClass();
        x xVar = new x(getApiKey());
        w5 w5Var = gVar.f37348n;
        w5Var.sendMessage(w5Var.obtainMessage(14, xVar));
        return xVar.f37400b.f13697a;
    }

    @NonNull
    public <TResult, A extends b> Task<TResult> doBestEffortWrite(@NonNull u uVar) {
        return b(2, uVar);
    }

    @NonNull
    public <TResult, A extends b> Task<TResult> doRead(@NonNull u uVar) {
        return b(0, uVar);
    }

    @NonNull
    @Deprecated
    public <A extends b, T extends qz.o, U extends v> Task<Void> doRegisterEventListener(@NonNull T t9, @NonNull U u7) {
        i0.h(t9);
        i0.h(u7);
        i0.i(t9.f37375a.f37368b, "Listener has already been released.");
        i0.i(u7.f37392a, "Listener has already been released.");
        i0.a("Listener registration and unregistration methods must be constructed with the same ListenerHolder.", i0.k(t9.f37375a.f37368b, u7.f37392a));
        return this.zaa.h(this, t9, u7, q.f11088a);
    }

    @NonNull
    public Task<Boolean> doUnregisterEventListener(@NonNull qz.k kVar, int i11) {
        i0.i(kVar, "Listener key cannot be null.");
        qz.g gVar = this.zaa;
        gVar.getClass();
        d10.g gVar2 = new d10.g();
        gVar.c(gVar2, i11, this);
        f0 f0Var = new f0(new m0(kVar, gVar2), gVar.f37344i.get(), this);
        w5 w5Var = gVar.f37348n;
        w5Var.sendMessage(w5Var.obtainMessage(13, f0Var));
        return gVar2.f13697a;
    }

    @NonNull
    public <TResult, A extends b> Task<TResult> doWrite(@NonNull u uVar) {
        return b(1, uVar);
    }

    public String getApiFallbackAttributionTag(@NonNull Context context) {
        return null;
    }

    @NonNull
    public final qz.a getApiKey() {
        return this.zag;
    }

    @NonNull
    public d getApiOptions() {
        return this.zaf;
    }

    @NonNull
    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    @NonNull
    public Looper getLooper() {
        return this.zah;
    }

    @NonNull
    public <L> qz.m registerListener(@NonNull L l, @NonNull String str) {
        Looper looper = this.zah;
        i0.i(l, "Listener must not be null");
        i0.i(looper, "Looper must not be null");
        i0.i(str, "Listener type must not be null");
        return new qz.m(looper, l, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f zaa(Looper looper, z zVar) {
        com.google.android.gms.common.internal.h hVarCreateClientSettingsBuilder = createClientSettingsBuilder();
        com.google.android.gms.common.internal.i iVar = new com.google.android.gms.common.internal.i(hVarCreateClientSettingsBuilder.f11116b, hVarCreateClientSettingsBuilder.f11117c, hVarCreateClientSettingsBuilder.f11115a);
        a aVar = this.zae.f11064a;
        i0.h(aVar);
        f fVarBuildClient = aVar.buildClient(this.zab, looper, iVar, (Object) this.zaf, (m) zVar, (n) zVar);
        xz.a aVar2 = this.zad;
        if (aVar2 != null && (fVarBuildClient instanceof com.google.android.gms.common.internal.f)) {
            ((com.google.android.gms.common.internal.f) fVarBuildClient).setAttributionSourceWrapper(aVar2);
            return fVarBuildClient;
        }
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (fVarBuildClient instanceof com.google.android.gms.common.internal.f)) {
            ((com.google.android.gms.common.internal.f) fVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        return fVarBuildClient;
    }

    public final int zab() {
        return this.zai;
    }

    public final j0 zac(Context context, Handler handler) {
        com.google.android.gms.common.internal.h hVarCreateClientSettingsBuilder = createClientSettingsBuilder();
        return new j0(context, handler, new com.google.android.gms.common.internal.i(hVarCreateClientSettingsBuilder.f11116b, hVarCreateClientSettingsBuilder.f11117c, hVarCreateClientSettingsBuilder.f11115a));
    }

    @NonNull
    public <A extends b, T extends qz.d> T doBestEffortWrite(@NonNull T t9) {
        a(2, t9);
        return t9;
    }

    @NonNull
    public <A extends b, T extends qz.d> T doRead(@NonNull T t9) {
        a(0, t9);
        return t9;
    }

    @NonNull
    public <A extends b, T extends qz.d> T doWrite(@NonNull T t9) {
        a(1, t9);
        return t9;
    }

    @NonNull
    public <A extends b> Task<Void> doRegisterEventListener(@NonNull qz.p pVar) {
        i0.h(pVar);
        i0.i(pVar.f37380a.f37375a.f37368b, "Listener has already been released.");
        qz.i0 i0Var = pVar.f37381b;
        i0.i(i0Var.f37392a, "Listener has already been released.");
        return this.zaa.h(this, pVar.f37380a, i0Var, l8.n.f27470b);
    }

    @NonNull
    public Task<Boolean> doUnregisterEventListener(@NonNull qz.k kVar) {
        return doUnregisterEventListener(kVar, 0);
    }
}
