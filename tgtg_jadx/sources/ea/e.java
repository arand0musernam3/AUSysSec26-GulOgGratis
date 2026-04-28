package ea;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import com.braze.h2;
import java.util.Arrays;
import java.util.Map;
import jb.u;
import kotlin.Pair;
import kotlin.collections.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ga.a f15898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavedStateRegistry f15899b;

    public e(ga.a aVar) {
        this.f15898a = aVar;
        this.f15899b = new SavedStateRegistry(aVar);
    }

    public final void a() {
        this.f15898a.a();
    }

    public final void b(Bundle bundle) {
        ga.a aVar = this.f15898a;
        f fVar = aVar.f20263a;
        if (!aVar.f20267e) {
            aVar.a();
        }
        if (fVar.getLifecycle().b().a(Lifecycle.State.STARTED)) {
            org.bouncycastle.jce.provider.a.s(fVar.getLifecycle().b(), "performRestore cannot be called when owner is ");
            return;
        }
        if (aVar.f20269g) {
            h2.b("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                w0.e.D("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        aVar.f20268f = bundle2;
        aVar.f20269g = true;
    }

    public final void c(Bundle bundle) {
        bundle.getClass();
        ga.a aVar = this.f15898a;
        o0.f26530a.getClass();
        Bundle bundleX = u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = aVar.f20268f;
        if (bundle2 != null) {
            bundleX.putAll(bundle2);
        }
        synchronized (aVar.f20265c) {
            for (Map.Entry entry : aVar.f20266d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((d) entry.getValue()).a();
                str.getClass();
                bundleX.putBundle(str, bundleA);
            }
        }
        if (bundleX.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleX);
    }
}
