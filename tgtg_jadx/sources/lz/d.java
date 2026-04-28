package lz;

import android.content.Context;
import android.util.Log;
import c50.w;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends c9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Semaphore f28437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f28438b;

    public d(Context context, Set set) {
        super(context);
        this.f28437a = new Semaphore(0);
        this.f28438b = set;
    }

    @Override // c9.b
    public final Object loadInBackground() {
        Iterator it = this.f28438b.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            w.d();
            return null;
        }
        try {
            this.f28437a.tryAcquire(0, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e5) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e5);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // c9.e
    public final void onStartLoading() {
        this.f28437a.drainPermits();
        forceLoad();
    }
}
