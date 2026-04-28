package oz;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.internal.measurement.w5;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33829a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Messenger f33830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f33831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f33832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f33833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f33834f;

    public l(o oVar) {
        this.f33834f = oVar;
        w5 w5Var = new w5(Looper.getMainLooper(), new k(this, 0));
        Looper.getMainLooper();
        this.f33830b = new Messenger(w5Var);
        this.f33832d = new ArrayDeque();
        this.f33833e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f33829a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f33829a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f33829a = 4;
            uz.a.b().c((Context) this.f33834f.f33845b, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.f33832d.iterator();
            while (it.hasNext()) {
                ((n) it.next()).b(zztVar);
            }
            this.f33832d.clear();
            int i12 = 0;
            while (true) {
                int size = this.f33833e.size();
                SparseArray sparseArray = this.f33833e;
                if (i12 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((n) sparseArray.valueAt(i12)).b(zztVar);
                    i12++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f33829a == 2 && this.f33832d.isEmpty() && this.f33833e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f33829a = 3;
                uz.a.b().c((Context) this.f33834f.f33845b, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d(n nVar) {
        int i11 = this.f33829a;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f33832d.add(nVar);
                return true;
            }
            if (i11 != 2) {
                return false;
            }
            this.f33832d.add(nVar);
            ((ScheduledExecutorService) this.f33834f.f33846c).execute(new j(this, 0));
            return true;
        }
        this.f33832d.add(nVar);
        if (this.f33829a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f33829a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (uz.a.b().a((Context) this.f33834f.f33845b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f33834f.f33846c).schedule(new j(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e5) {
            b("Unable to bind to service", e5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f33834f.f33846c).execute(new x0.f(13, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f33834f.f33846c).execute(new j(this, 2));
    }
}
