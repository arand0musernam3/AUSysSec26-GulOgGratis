package g9;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.s1;
import androidx.savedstate.SavedStateRegistry;
import com.braze.h2;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements LifecycleOwner, s1, androidx.lifecycle.p, ea.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ky.b f20162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f20163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f20164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lifecycle.State f20165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f20166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f20168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l9.c f20169h = new l9.c(this);

    public l(ky.b bVar, z zVar, Bundle bundle, Lifecycle.State state, q qVar, String str, Bundle bundle2) {
        this.f20162a = bVar;
        this.f20163b = zVar;
        this.f20164c = bundle;
        this.f20165d = state;
        this.f20166e = qVar;
        this.f20167f = str;
        this.f20168g = bundle2;
        u70.l.b(new cw.b(this, 19));
    }

    public final void a(Lifecycle.State state) {
        state.getClass();
        l9.c cVar = this.f20169h;
        cVar.getClass();
        cVar.f27524k = state;
        cVar.b();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            Bundle bundle = lVar.f20164c;
            if (Intrinsics.areEqual(this.f20167f, lVar.f20167f) && Intrinsics.areEqual(this.f20163b, lVar.f20163b) && Intrinsics.areEqual(this.f20169h.f27523j, lVar.f20169h.f27523j) && Intrinsics.areEqual(getSavedStateRegistry(), lVar.getSavedStateRegistry())) {
                Bundle bundle2 = this.f20164c;
                if (Intrinsics.areEqual(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!Intrinsics.areEqual(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // androidx.lifecycle.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
        /*
            r5 = this;
            l9.c r0 = r5.f20169h
            r0.getClass()
            y8.d r1 = new y8.d
            r2 = 0
            r1.<init>(r2)
            g9.l r2 = r0.f27514a
            java.util.LinkedHashMap r3 = r1.f3543a
            qb.e r4 = androidx.lifecycle.f1.f3442a
            r3.put(r4, r2)
            r40.d r4 = androidx.lifecycle.f1.f3443b
            r3.put(r4, r2)
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L24
            n20.f r2 = androidx.lifecycle.f1.f3444c
            r3.put(r2, r0)
        L24:
            r0 = 0
            ky.b r2 = r5.f20162a
            if (r2 == 0) goto L3a
            android.content.Context r2 = r2.f26684a
            if (r2 == 0) goto L32
            android.content.Context r2 = r2.getApplicationContext()
            goto L33
        L32:
            r2 = r0
        L33:
            boolean r4 = r2 instanceof android.app.Application
            if (r4 == 0) goto L3a
            android.app.Application r2 = (android.app.Application) r2
            goto L3b
        L3a:
            r2 = r0
        L3b:
            if (r2 == 0) goto L3e
            r0 = r2
        L3e:
            if (r0 == 0) goto L45
            qb.e r2 = androidx.lifecycle.o1.f3505d
            r3.put(r2, r0)
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.l.getDefaultViewModelCreationExtras():androidx.lifecycle.viewmodel.CreationExtras");
    }

    @Override // androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return this.f20169h.l;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f20169h.f27523j;
    }

    @Override // ea.f
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.f20169h.f27521h.f15899b;
    }

    @Override // androidx.lifecycle.s1
    public final ViewModelStore getViewModelStore() {
        l9.c cVar = this.f20169h;
        if (!cVar.f27522i) {
            h2.b("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (cVar.f27523j.f3435d == Lifecycle.State.DESTROYED) {
            h2.b("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        q qVar = cVar.f27518e;
        if (qVar == null) {
            h2.b("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = cVar.f27519f;
        str.getClass();
        LinkedHashMap linkedHashMap = qVar.f20195a;
        ViewModelStore viewModelStore = (ViewModelStore) linkedHashMap.get(str);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        linkedHashMap.put(str, viewModelStore2);
        return viewModelStore2;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f20163b.hashCode() + (this.f20167f.hashCode() * 31);
        Bundle bundle = this.f20164c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i11 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i11 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.f20169h.f27523j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f20169h.toString();
    }
}
