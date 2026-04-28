package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends androidx.lifecycle.l1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p1 f3321g = new p1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3325d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3322a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3323b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3324c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3326e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3327f = false;

    public q1(boolean z11) {
        this.f3325d = z11;
    }

    public final void a(Fragment fragment) {
        if (this.f3327f) {
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment.mWho;
        HashMap map = this.f3322a;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void b(Fragment fragment, boolean z11) {
        if (FragmentManager.L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        d(fragment.mWho, z11);
    }

    public final void c(String str, boolean z11) {
        if (FragmentManager.L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        d(str, z11);
    }

    public final void d(String str, boolean z11) {
        HashMap map = this.f3323b;
        q1 q1Var = (q1) map.get(str);
        if (q1Var != null) {
            if (z11) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(q1Var.f3323b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    q1Var.c((String) it.next(), true);
                }
            }
            q1Var.onCleared();
            map.remove(str);
        }
        HashMap map2 = this.f3324c;
        ViewModelStore viewModelStore = (ViewModelStore) map2.get(str);
        if (viewModelStore != null) {
            viewModelStore.a();
            map2.remove(str);
        }
    }

    public final void e(Fragment fragment) {
        if (this.f3327f) {
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3322a.remove(fragment.mWho) == null || !FragmentManager.L(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f3322a.equals(q1Var.f3322a) && this.f3323b.equals(q1Var.f3323b) && this.f3324c.equals(q1Var.f3324c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3324c.hashCode() + ((this.f3323b.hashCode() + (this.f3322a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.l1
    public final void onCleared() {
        if (FragmentManager.L(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3326e = true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f3322a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f3323b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f3324c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
