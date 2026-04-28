package x30;

import android.util.Log;
import cz.i;
import d40.k1;
import e0.f;
import java.util.concurrent.atomic.AtomicReference;
import u30.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f43817c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f43818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f43819b = new AtomicReference(null);

    public a(m mVar) {
        this.f43818a = mVar;
        mVar.a(new mp.a(this, 20));
    }

    public final b a() {
        a aVar = (a) this.f43819b.get();
        return aVar == null ? f43817c : aVar.a();
    }

    public final boolean b() {
        a aVar = (a) this.f43819b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c() {
        a aVar = (a) this.f43819b.get();
        return aVar != null && aVar.c();
    }

    public final void d(String str, long j9, k1 k1Var) {
        String strK = f.k("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strK, null);
        }
        this.f43818a.a(new i(str, j9, k1Var));
    }
}
