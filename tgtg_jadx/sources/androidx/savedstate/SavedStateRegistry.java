package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.q;
import com.braze.h2;
import ea.d;
import ga.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import w0.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "ea/d", "ea/c", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ea.a f4004b;

    public SavedStateRegistry(a aVar) {
        this.f4003a = aVar;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        a aVar = this.f4003a;
        if (!aVar.f20269g) {
            h2.b("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = aVar.f20268f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                e.D(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            aVar.f20268f = null;
        }
        return bundle;
    }

    public final d b() {
        d dVar;
        a aVar = this.f4003a;
        synchronized (aVar.f20265c) {
            Iterator it = aVar.f20266d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                d dVar2 = (d) entry.getValue();
                if (Intrinsics.areEqual(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public final void c(String str, d dVar) {
        dVar.getClass();
        a aVar = this.f4003a;
        synchronized (aVar.f20265c) {
            if (aVar.f20266d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f20266d.put(str, dVar);
        }
    }

    public final void d() {
        if (!this.f4003a.f20270h) {
            h2.b("Can not perform this action after onSaveInstanceState");
            return;
        }
        ea.a aVar = this.f4004b;
        if (aVar == null) {
            aVar = new ea.a(this);
        }
        this.f4004b = aVar;
        try {
            q.class.getDeclaredConstructor(null);
            ea.a aVar2 = this.f4004b;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f15895b).add(q.class.getName());
            }
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Class " + q.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
        }
    }
}
