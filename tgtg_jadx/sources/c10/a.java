package c10;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.e;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;
import vz.f;
import xz.c;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile ScheduledExecutorService f6923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f6924o = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f6926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f6928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f6930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p00.a f6932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final vz.b f6933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f6935k;
    public final AtomicInteger l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f6936m;

    public a(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f6925a = new Object();
        this.f6927c = 0;
        this.f6930f = new HashSet();
        this.f6931g = true;
        this.f6933i = vz.b.f42622a;
        this.f6935k = new HashMap();
        this.l = new AtomicInteger(0);
        i0.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f6932h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f6934j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f6934j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f6926b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = f.f42633a;
        synchronized (f.class) {
            Boolean bool = f.f42637e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = e.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                f.f42637e = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i11 = vz.e.f42632a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoB = c.a(context).b(0, packageName);
                    if (applicationInfoB == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i12 = applicationInfoB.uid;
                        workSource = new WorkSource();
                        f.a(workSource, i12, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f6926b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e5) {
                    Log.wtf("WakeLock", e5.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f6923n;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f6924o) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f6923n;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f6923n = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f6936m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a() {
        this.l.incrementAndGet();
        long j9 = LongCompanionObject.MAX_VALUE;
        long jMin = Math.min(TimeConstants.ONE_MINUTE_DIFFERENCE, Math.max(Math.min(LongCompanionObject.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.f6925a) {
            try {
                if (!b()) {
                    this.f6932h = p00.a.f34107a;
                    this.f6926b.acquire();
                    this.f6933i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f6927c++;
                if (this.f6931g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f6935k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f6935k.put(null, bVar);
                }
                bVar.f6937a++;
                this.f6933i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (LongCompanionObject.MAX_VALUE - jElapsedRealtime > jMin) {
                    j9 = jElapsedRealtime + jMin;
                }
                if (j9 > this.f6929e) {
                    this.f6929e = j9;
                    ScheduledFuture scheduledFuture = this.f6928d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f6928d = this.f6936m.schedule(new a8.f(this, 2), jMin, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z11;
        synchronized (this.f6925a) {
            z11 = this.f6927c > 0;
        }
        return z11;
    }

    public final void c() {
        if (this.l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f6934j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f6925a) {
            try {
                if (this.f6931g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f6935k.containsKey(null)) {
                    b bVar = (b) this.f6935k.get(null);
                    if (bVar != null) {
                        int i11 = bVar.f6937a - 1;
                        bVar.f6937a = i11;
                        if (i11 == 0) {
                            this.f6935k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f6934j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f6930f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        org.bouncycastle.jce.provider.a.c();
    }

    public final void e() {
        synchronized (this.f6925a) {
            try {
                if (b()) {
                    if (this.f6931g) {
                        int i11 = this.f6927c - 1;
                        this.f6927c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f6927c = 0;
                    }
                    d();
                    Iterator it = this.f6935k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f6937a = 0;
                    }
                    this.f6935k.clear();
                    ScheduledFuture scheduledFuture = this.f6928d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f6928d = null;
                        this.f6929e = 0L;
                    }
                    if (this.f6926b.isHeld()) {
                        try {
                            try {
                                this.f6926b.release();
                                if (this.f6932h != null) {
                                    this.f6932h = null;
                                }
                            } catch (RuntimeException e5) {
                                if (!e5.getClass().equals(RuntimeException.class)) {
                                    throw e5;
                                }
                                Log.e("WakeLock", String.valueOf(this.f6934j).concat(" failed to release!"), e5);
                                if (this.f6932h != null) {
                                    this.f6932h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f6932h != null) {
                                this.f6932h = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f6934j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
