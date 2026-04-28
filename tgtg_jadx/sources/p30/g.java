package p30;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.common.internal.q;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lx.u;
import u30.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f34221k = new Object();
    public static final q1.e l = new q1.e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f34224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u30.f f34225d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f34228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t40.b f34229h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f34226e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f34227f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f34230i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f34231j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, String str, i iVar) {
        ?? arrayList;
        this.f34222a = context;
        i0.e(str);
        this.f34223b = str;
        this.f34224c = iVar;
        a aVar = FirebaseInitProvider.f12895a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new u30.d((String) it.next(), 0));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        v30.k kVar = v30.k.INSTANCE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i11 = 1;
        arrayList3.add(new u30.d(new FirebaseCommonRegistrar(), i11));
        arrayList3.add(new u30.d(new ExecutorsRegistrar(), i11));
        arrayList4.add(u30.b.c(context, Context.class, new Class[0]));
        arrayList4.add(u30.b.c(this, g.class, new Class[0]));
        arrayList4.add(u30.b.c(iVar, i.class, new Class[0]));
        qb.e eVar = new qb.e();
        if (u.K(context) && FirebaseInitProvider.f12896b.get()) {
            arrayList4.add(u30.b.c(aVar, a.class, new Class[0]));
        }
        u30.f fVar = new u30.f(kVar, arrayList3, arrayList4, eVar);
        this.f34225d = fVar;
        Trace.endSection();
        this.f34228g = new k(new c(0, this, context));
        this.f34229h = fVar.c(r40.c.class);
        d dVar = new d(this);
        a();
        if (this.f34226e.get()) {
            qz.c.f37315e.f37316a.get();
        }
        this.f34230i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f34221k) {
            try {
                gVar = (g) l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + vz.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((r40.c) gVar.f34229h.get()).b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (f34221k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i iVarA = i.a(context);
                if (iVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, iVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static g g(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.f34218a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f34218a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        qz.c.a(application);
                        qz.c cVar = qz.c.f37315e;
                        cVar.getClass();
                        synchronized (cVar) {
                            cVar.f37318c.add(eVar);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f34221k) {
            q1.e eVar2 = l;
            i0.j("FirebaseApp name [DEFAULT] already exists!", !eVar2.containsKey("[DEFAULT]"));
            i0.i(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            eVar2.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        i0.j("FirebaseApp was deleted", !this.f34227f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f34225d.b(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(vz.c.c(this.f34223b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(vz.c.c(this.f34224c.f34238b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        HashMap map;
        if (!u.K(this.f34222a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f34223b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f34222a;
            AtomicReference atomicReference = f.f34219b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f34223b);
        Log.i("FirebaseApp", sb3.toString());
        u30.f fVar2 = this.f34225d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f34223b);
        AtomicReference atomicReference2 = fVar2.f40685f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (fVar2) {
                    map = new HashMap(fVar2.f40680a);
                }
                fVar2.h(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((r40.c) this.f34229h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f34223b.equals(gVar.f34223b);
    }

    public final boolean h() {
        boolean z11;
        a();
        y40.a aVar = (y40.a) this.f34228g.get();
        synchronized (aVar) {
            z11 = aVar.f45412a;
        }
        return z11;
    }

    public final int hashCode() {
        return this.f34223b.hashCode();
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.b(this.f34223b, "name");
        qVar.b(this.f34224c, "options");
        return qVar.toString();
    }
}
