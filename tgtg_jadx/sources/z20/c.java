package z20;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a30.j f46940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f46941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f46942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f46943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tx.d f46944e;

    public c(Context context) {
        a30.j jVar = new a30.j("AppUpdateListenerRegistry", 0);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.f46943d = new HashSet();
        this.f46944e = null;
        this.f46940a = jVar;
        this.f46941b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f46942c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        tx.d dVar;
        HashSet hashSet = this.f46943d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.f46942c;
        if (!zIsEmpty && this.f46944e == null) {
            tx.d dVar2 = new tx.d(this, 1);
            this.f46944e = dVar2;
            int i11 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f46941b;
            if (i11 >= 33) {
                context.registerReceiver(dVar2, intentFilter, 2);
            } else {
                context.registerReceiver(dVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (dVar = this.f46944e) == null) {
            return;
        }
        context.unregisterReceiver(dVar);
        this.f46944e = null;
    }
}
