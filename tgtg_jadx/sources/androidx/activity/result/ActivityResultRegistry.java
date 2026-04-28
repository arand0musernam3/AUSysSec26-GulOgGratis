package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c0;
import androidx.lifecycle.w;
import e0.f;
import h.a;
import h.c;
import h.d;
import h.e;
import h0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import o80.o;
import qc.y;
import se.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "<init>", "()V", "h/c", "h/d", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,422:1\n127#2,2:423\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n*L\n380#1:423,2\n*E\n"})
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1754a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1755b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1756c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1757d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1758e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1759f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f1760g = new Bundle();

    public final boolean a(int i11, int i12, Intent intent) {
        String str = (String) this.f1754a.get(Integer.valueOf(i11));
        if (str == null) {
            return false;
        }
        c cVar = (c) this.f1758e.get(str);
        if ((cVar != null ? cVar.f20941a : null) != null) {
            ArrayList arrayList = this.f1757d;
            if (arrayList.contains(str)) {
                cVar.f20941a.a(cVar.f20942b.c(i12, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1759f.remove(str);
        this.f1760g.putParcelable(str, new a(i12, intent));
        return true;
    }

    public abstract void b(int i11, ActivityResultContract activityResultContract, Object obj, b bVar);

    public final e c(String str, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        str.getClass();
        e(str);
        this.f1758e.put(str, new c(activityResultContract, activityResultCallback));
        LinkedHashMap linkedHashMap = this.f1759f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            activityResultCallback.a(obj);
        }
        Bundle bundle = this.f1760g;
        a aVar = (a) g.t(bundle, str, a.class);
        if (aVar != null) {
            bundle.remove(str);
            activityResultCallback.a(activityResultContract.c(aVar.f20935a, aVar.f20936b));
        }
        return new e(this, str, activityResultContract, 1);
    }

    public final e d(final String str, LifecycleOwner lifecycleOwner, final ActivityResultContract activityResultContract, final ActivityResultCallback activityResultCallback) {
        str.getClass();
        lifecycleOwner.getClass();
        activityResultContract.getClass();
        activityResultCallback.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().a(Lifecycle.State.STARTED)) {
            StringBuilder sb2 = new StringBuilder("LifecycleOwner ");
            sb2.append(lifecycleOwner);
            Lifecycle.State stateB = lifecycle.b();
            sb2.append(" is attempting to register while current state is ");
            sb2.append(stateB);
            sb2.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb2.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.f1756c;
        d dVar = (d) linkedHashMap.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        c0 c0Var = new c0() { // from class: h.b
            @Override // androidx.lifecycle.c0
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, w wVar) {
                w wVar2 = w.ON_START;
                ActivityResultRegistry activityResultRegistry = this.f20937a;
                String str2 = str;
                if (wVar2 != wVar) {
                    if (w.ON_STOP == wVar) {
                        activityResultRegistry.f1758e.remove(str2);
                        return;
                    } else {
                        if (w.ON_DESTROY == wVar) {
                            activityResultRegistry.f(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = activityResultRegistry.f1758e;
                Bundle bundle = activityResultRegistry.f1760g;
                LinkedHashMap linkedHashMap3 = activityResultRegistry.f1759f;
                ActivityResultContract activityResultContract2 = activityResultContract;
                ActivityResultCallback activityResultCallback2 = activityResultCallback;
                linkedHashMap2.put(str2, new c(activityResultContract2, activityResultCallback2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    activityResultCallback2.a(obj);
                }
                a aVar = (a) h0.g.t(bundle, str2, a.class);
                if (aVar != null) {
                    bundle.remove(str2);
                    activityResultCallback2.a(activityResultContract2.c(aVar.f20935a, aVar.f20936b));
                }
            }
        };
        dVar.f20943a.a(c0Var);
        dVar.f20944b.add(c0Var);
        linkedHashMap.put(str, dVar);
        return new e(this, str, activityResultContract, 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f1755b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : o.e(new g60.d(29))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f1754a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        y.h("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.f1757d.contains(str) && (num = (Integer) this.f1755b.remove(str)) != null) {
            this.f1754a.remove(num);
        }
        this.f1758e.remove(str);
        LinkedHashMap linkedHashMap = this.f1759f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbS = f.s("Dropping pending result for request ", str, ": ");
            sbS.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbS.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f1760g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((a) g.t(bundle, str, a.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f1756c;
        d dVar = (d) linkedHashMap2.get(str);
        if (dVar != null) {
            ArrayList arrayList = dVar.f20944b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dVar.f20943a.d((c0) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
