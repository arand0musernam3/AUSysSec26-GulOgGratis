package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements ea.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavedStateRegistry f3448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f3450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.t f3451d;

    public g1(SavedStateRegistry savedStateRegistry, s1 s1Var) {
        savedStateRegistry.getClass();
        this.f3448a = savedStateRegistry;
        this.f3451d = u70.l.b(new aa.e(s1Var, 12));
    }

    @Override // ea.d
    public final Bundle a() {
        kotlin.collections.o0.f26530a.getClass();
        Bundle bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.f3450c;
        if (bundle != null) {
            bundleX.putAll(bundle);
        }
        for (Map.Entry entry : ((h1) this.f3451d.getValue()).f3452a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((androidx.activity.g) ((c1) entry.getValue()).f3420b.f3503e).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleX.putBundle(str, bundleA);
            }
        }
        this.f3449b = false;
        return bundleX;
    }

    public final void b() {
        if (this.f3449b) {
            return;
        }
        Bundle bundleA = this.f3448a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        kotlin.collections.o0.f26530a.getClass();
        Bundle bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.f3450c;
        if (bundle != null) {
            bundleX.putAll(bundle);
        }
        if (bundleA != null) {
            bundleX.putAll(bundleA);
        }
        this.f3450c = bundleX;
        this.f3449b = true;
    }
}
