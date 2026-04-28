package a40;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.z f779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w2.z f781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w2.z f782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g40.b f785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w30.a f786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w30.a f787k;
    public final k l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x30.a f788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u6.f f789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b40.f f790o;

    public u(p30.g gVar, b0 b0Var, x30.a aVar, x xVar, w30.a aVar2, w30.a aVar3, g40.b bVar, k kVar, u6.f fVar, b40.f fVar2) {
        this.f778b = xVar;
        gVar.a();
        this.f777a = gVar.f34222a;
        this.f784h = b0Var;
        this.f788m = aVar;
        this.f786j = aVar2;
        this.f787k = aVar3;
        this.f785i = bVar;
        this.l = kVar;
        this.f789n = fVar;
        this.f790o = fVar2;
        this.f780d = System.currentTimeMillis();
        this.f779c = new w2.z(6);
    }

    public final void a(cz.j jVar) {
        b40.f.a();
        b40.f.a();
        this.f781e.j();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f786j.d(new t(this));
                this.f783g.g();
                if (!jVar.h().f23342b.f23338a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f783g.d(jVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f783g.h(((d10.g) ((AtomicReference) jVar.f13639i).get()).f13697a);
                c();
            } catch (Exception e5) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e5);
                c();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(cz.j jVar) {
        Future<?> futureSubmit = this.f790o.f5742a.f5737a.submit(new p(this, jVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e5) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e5);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        b40.f.a();
        try {
            w2.z zVar = this.f781e;
            g40.b bVar = (g40.b) zVar.f43084c;
            String str = (String) zVar.f43083b;
            bVar.getClass();
            if (new File((File) bVar.f20002c, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e5) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e5);
        }
    }
}
