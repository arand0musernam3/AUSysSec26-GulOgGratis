package c50;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30.g f7608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f50.k f7609b;

    public o(p30.g gVar, f50.k kVar, CoroutineContext coroutineContext, z0 z0Var) {
        gVar.getClass();
        kVar.getClass();
        coroutineContext.getClass();
        z0Var.getClass();
        this.f7608a = gVar;
        this.f7609b = kVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.4.");
        gVar.a();
        Context applicationContext = gVar.f34222a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(z0Var);
            v80.f0.B(v80.f0.b(coroutineContext), null, null, new a3.x(this, z0Var, null, 23), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
