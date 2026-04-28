package androidx.work.impl.foreground;

import a8.h;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.f0;
import ib.w;
import ib.y;
import java.util.UUID;
import jb.s;
import jf.e;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import pb.a;
import qw.b;
import rb.k;
import x0.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends Service implements LifecycleOwner {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f4166e = w.f("SystemFgService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f4167a = new h(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f4169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NotificationManager f4170d;

    public final void a() {
        this.f4170d = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f4169c = aVar;
        if (aVar.f34633i != null) {
            w.d().b(a.f34624j, "A callback already exists.");
        } else {
            aVar.f34633i = this;
        }
    }

    public final void b() {
        h hVar = this.f4167a;
        hVar.getClass();
        hVar.y(androidx.lifecycle.w.ON_CREATE);
        super.onCreate();
    }

    public final void c() {
        h hVar = this.f4167a;
        hVar.getClass();
        hVar.y(androidx.lifecycle.w.ON_STOP);
        hVar.y(androidx.lifecycle.w.ON_DESTROY);
        super.onDestroy();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (f0) this.f4167a.f973b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        h hVar = this.f4167a;
        hVar.getClass();
        hVar.y(androidx.lifecycle.w.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        b();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c();
        this.f4169c.d();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i11) {
        h hVar = this.f4167a;
        hVar.getClass();
        hVar.y(androidx.lifecycle.w.ON_START);
        super.onStart(intent, i11);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        boolean z11 = this.f4168b;
        String str = f4166e;
        if (z11) {
            w.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f4169c.d();
            a();
            this.f4168b = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f4169c;
        aVar.getClass();
        String str2 = a.f34624j;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            w.d().e(str2, "Started foreground service " + intent);
            aVar.f34626b.a(new f(aVar, intent.getStringExtra("KEY_WORKSPEC_ID"), false, 14));
            aVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            w.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = aVar.f34633i;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f4168b = true;
            w.d().a(str, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i12);
            return 3;
        }
        w.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        s sVar = aVar.f34625a;
        UUID uuidFromString = UUID.fromString(stringExtra);
        sVar.getClass();
        uuidFromString.getClass();
        y yVar = sVar.f24925b.f23703m;
        k kVar = sVar.f24927d.f38956a;
        kVar.getClass();
        e.I(yVar, "CancelWorkById", kVar, new b(7, sVar, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i11) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f4169c.f(i11, NewHope.SENDB_BYTES);
    }

    public final void onTimeout(int i11, int i12) {
        this.f4169c.f(i11, i12);
    }
}
