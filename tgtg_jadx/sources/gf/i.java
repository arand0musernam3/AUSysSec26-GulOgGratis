package gf;

import a3.a3;
import a90.p;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.o0;
import dn.k;
import h2.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import u70.t;
import v80.b0;
import v80.f0;
import v80.p0;
import ye.l;
import ye.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Application.ActivityLifecycleCallbacks, qf.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.j f20418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf.c f20419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ye.b f20420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PackageInfo f20421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ye.b f20422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f20423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public df.g f20424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f20425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f20426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f20427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f20428k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20429m;

    public i(com.google.firebase.messaging.j jVar) {
        jVar.getClass();
        this.f20418a = jVar;
        this.f20419b = qf.c.Utility;
        this.f20425h = new LinkedHashMap();
        this.f20426i = new LinkedHashSet();
        this.f20427j = new LinkedHashSet();
        this.f20428k = new LinkedHashMap();
    }

    @Override // qf.d
    public final void a(ye.b bVar) {
        PackageInfo packageInfo;
        bVar.getClass();
        b0 b0Var = bVar.f45854c;
        bVar.getClass();
        this.f20420c = bVar;
        this.f20422e = bVar;
        Context context = bVar.f45852a.f45887b;
        context.getClass();
        Application application = (Application) context;
        int i11 = 0;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            packageInfo.getClass();
        } catch (PackageManager.NameNotFoundException unused) {
            bVar.f().a("Cannot find package with application.packageName: " + application.getPackageName());
            packageInfo = new PackageInfo();
        }
        this.f20421d = packageInfo;
        c90.f fVar = p0.f42144a;
        w80.c cVar = p.f1044a;
        x70.c cVar2 = null;
        f0.B(b0Var, cVar, null, new d8.c(this, application, cVar2, 29), 2);
        f0.B(b0Var, cVar, null, new g(this, cVar2, i11), 2);
    }

    public final ye.f c() {
        ye.b bVar = this.f20422e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            bVar = null;
        }
        return (ye.f) ((ye.c) bVar.f45868r.getValue()).f45879d.f45488a.getValue();
    }

    public final void d(Activity activity) {
        ye.b bVar;
        int iHashCode = activity.hashCode();
        Integer numValueOf = Integer.valueOf(iHashCode);
        LinkedHashSet linkedHashSet = this.f20426i;
        if (linkedHashSet.contains(numValueOf)) {
            return;
        }
        linkedHashSet.add(Integer.valueOf(iHashCode));
        ye.b bVar2 = this.f20422e;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            bVar = null;
        } else {
            bVar = bVar2;
        }
        k kVar = new k(bVar);
        e eVar = new e(this, 0);
        if (((Boolean) ((t) kVar.f15019c).getValue()).booleanValue()) {
            WeakHashMap weakHashMap = cf.b.f7915a;
            h hVar = new h(2, bVar, ye.b.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8, 1);
            kf.b bVarF = bVar.f();
            bVarF.getClass();
            o0 o0Var = activity instanceof o0 ? (o0) activity : null;
            if (o0Var == null) {
                bVarF.b("Activity is not a FragmentActivity");
                return;
            }
            cf.a aVar = new cf.a(hVar, bVarF, eVar);
            o0Var.getSupportFragmentManager().W(aVar, true);
            WeakHashMap weakHashMap2 = cf.b.f7915a;
            Object arrayList = weakHashMap2.get(o0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                weakHashMap2.put(o0Var, arrayList);
            }
            ((List) arrayList).add(aVar);
        }
    }

    public final void e(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        int iIdentityHashCode = System.identityHashCode(intent);
        int iHashCode = activity.hashCode();
        Integer numValueOf = Integer.valueOf(iHashCode);
        LinkedHashMap linkedHashMap = this.f20428k;
        Integer num = (Integer) linkedHashMap.get(numValueOf);
        if (num != null && num.intValue() == iIdentityHashCode) {
            return;
        }
        linkedHashMap.put(Integer.valueOf(iHashCode), Integer.valueOf(iIdentityHashCode));
        ye.b bVar = this.f20422e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            bVar = null;
        }
        new k(bVar);
        Intent intent2 = activity.getIntent();
        if (intent2 != null) {
            Uri referrer = activity.getReferrer();
            String string = referrer != null ? referrer.toString() : null;
            Uri data = intent2.getData();
            if (data != null) {
                String string2 = data.toString();
                string2.getClass();
                ye.b.k(bVar, "[Amplitude] Deep Link Opened", x0.e(new Pair("[Amplitude] Link URL", string2), new Pair("[Amplitude] Link Referrer", string)), 4);
            }
        }
    }

    @Override // qf.d
    public final qf.c getType() {
        return this.f20419b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        this.f20425h.put(Integer.valueOf(activity.hashCode()), new WeakReference(activity));
        if (c().f45883c) {
            d(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        int iHashCode = activity.hashCode();
        this.f20425h.remove(Integer.valueOf(iHashCode));
        this.f20426i.remove(Integer.valueOf(iHashCode));
        this.f20428k.remove(Integer.valueOf(iHashCode));
        ye.b bVar = this.f20422e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            bVar = null;
        }
        if (((Boolean) ((t) new k(bVar).f15019c).getValue()).booleanValue()) {
            WeakHashMap weakHashMap = cf.b.f7915a;
            kf.b bVarF = bVar.f();
            bVarF.getClass();
            o0 o0Var = activity instanceof o0 ? (o0) activity : null;
            if (o0Var == null) {
                bVarF.b("Activity is not a FragmentActivity");
                return;
            }
            List list = (List) cf.b.f7915a.remove(o0Var);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    o0Var.getSupportFragmentManager().k0((cf.a) it.next());
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (c().f45884d) {
            e(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        ye.b bVar = null;
        if (!this.f20425h.containsKey(Integer.valueOf(activity.hashCode()))) {
            Intent intent = activity.getIntent();
            onActivityCreated(activity, intent != null ? intent.getExtras() : null);
        }
        LinkedHashSet linkedHashSet = this.f20427j;
        if (linkedHashSet.isEmpty()) {
            ye.b bVar2 = this.f20422e;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                bVar2 = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            ye.b0 b0Var = bVar2.f45858g;
            b0Var.getClass();
            b0Var.f45871c.h(new ye.j(jCurrentTimeMillis));
        }
        linkedHashSet.add(Integer.valueOf(activity.hashCode()));
        if (c().f45882b && linkedHashSet.size() == 1) {
            ye.b bVar3 = this.f20422e;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                bVar3 = null;
            }
            new k(bVar3);
            PackageInfo packageInfo = this.f20421d;
            if (packageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("packageInfo");
                packageInfo = null;
            }
            boolean z11 = this.l;
            packageInfo.getClass();
            ye.b.k(bVar3, "[Amplitude] Application Opened", x0.e(new Pair("[Amplitude] From Background", Boolean.valueOf(z11)), new Pair("[Amplitude] Version", packageInfo.versionName), new Pair("[Amplitude] Build", a3.c(packageInfo).toString())), 4);
        }
        if (linkedHashSet.size() == 1) {
            this.l = false;
        }
        if (c().f45884d) {
            e(activity);
        }
        if (c().f45883c) {
            ye.b bVar4 = this.f20422e;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            } else {
                bVar = bVar4;
            }
            k kVar = new k(bVar);
            try {
                ye.b.k(bVar, "[Amplitude] Screen Viewed", w0.b(new Pair("[Amplitude] Screen Name", pd.g.x(activity))), 4);
            } catch (Exception e5) {
                ((ye.b) kVar.f15018b).f().a("Failed to track screen viewed event: " + e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        Integer numValueOf = Integer.valueOf(activity.hashCode());
        LinkedHashSet linkedHashSet = this.f20427j;
        linkedHashSet.remove(numValueOf);
        x70.c cVar = null;
        if (c().f45882b && linkedHashSet.isEmpty()) {
            ye.b bVar = this.f20422e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                bVar = null;
            }
            new k(bVar);
            ye.b.k(bVar, "[Amplitude] Application Backgrounded", null, 6);
        }
        if (linkedHashSet.isEmpty()) {
            this.l = true;
            ye.b bVar2 = this.f20422e;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                bVar2 = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            ye.b0 b0Var = bVar2.f45858g;
            b0Var.getClass();
            b0Var.f45871c.h(new l(jCurrentTimeMillis));
            if (bVar2.f45852a.f45896k) {
                f0.B(bVar2.f45854c, bVar2.f45855d, null, new b1(bVar2, cVar, 15), 2);
            }
        }
    }
}
