package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3376a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3377b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3378c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q1 f3379d;

    public final void a(Fragment fragment) {
        if (this.f3376a.contains(fragment)) {
            j4.d.e(fragment, "Fragment already added: ");
            return;
        }
        synchronized (this.f3376a) {
            this.f3376a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        w1 w1Var = (w1) this.f3377b.get(str);
        if (w1Var != null) {
            return w1Var.f3369c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (w1 w1Var : this.f3377b.values()) {
            if (w1Var != null && (fragmentFindFragmentByWho = w1Var.f3369c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (w1 w1Var : this.f3377b.values()) {
            if (w1Var != null) {
                arrayList.add(w1Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (w1 w1Var : this.f3377b.values()) {
            if (w1Var != null) {
                arrayList.add(w1Var.f3369c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f3376a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f3376a) {
            arrayList = new ArrayList(this.f3376a);
        }
        return arrayList;
    }

    public final void g(w1 w1Var) {
        Fragment fragment = w1Var.f3369c;
        String str = fragment.mWho;
        HashMap map = this.f3377b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, w1Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            boolean z11 = fragment.mRetainInstance;
            q1 q1Var = this.f3379d;
            if (z11) {
                q1Var.a(fragment);
            } else {
                q1Var.e(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(w1 w1Var) {
        Fragment fragment = w1Var.f3369c;
        if (fragment.mRetainInstance) {
            this.f3379d.e(fragment);
        }
        String str = fragment.mWho;
        HashMap map = this.f3377b;
        if (map.get(str) == w1Var && ((w1) map.put(fragment.mWho, null)) != null && FragmentManager.L(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap map = this.f3378c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
