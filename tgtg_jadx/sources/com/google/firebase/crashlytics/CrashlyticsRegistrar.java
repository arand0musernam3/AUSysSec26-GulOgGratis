package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import d50.d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import o00.h0;
import p30.g;
import t30.a;
import t30.b;
import t30.c;
import u30.i;
import u30.o;
import u40.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f12755d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f12756a = new o(a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12757b = new o(b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f12758c = new o(c.class, ExecutorService.class);

    static {
        d dVar = d.CRASHLYTICS;
        d50.c cVar = d50.c.f14422a;
        dVar.getClass();
        Map map = d50.c.f14423b;
        if (map.containsKey(dVar)) {
            Log.d("FirebaseSessions", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new d50.a(new e90.c(true)));
        Log.d("FirebaseSessions", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        u30.a aVarA = u30.b.a(w30.b.class);
        aVarA.f40663a = "fire-cls";
        aVarA.a(i.a(g.class));
        aVarA.a(i.a(e.class));
        aVarA.a(new i(this.f12756a, 1, 0));
        aVarA.a(new i(this.f12757b, 1, 0));
        aVarA.a(new i(this.f12758c, 1, 0));
        aVarA.a(new i(0, 2, x30.a.class));
        aVarA.a(new i(0, 2, r30.a.class));
        aVarA.a(new i(0, 2, b50.a.class));
        aVarA.f40668f = new mp.a(this, 19);
        aVarA.c(2);
        return Arrays.asList(aVarA.b(), h0.r("fire-cls", "20.0.4"));
    }
}
