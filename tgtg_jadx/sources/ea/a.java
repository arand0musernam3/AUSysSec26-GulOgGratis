package ea;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Arrays;
import java.util.LinkedHashSet;
import jb.u;
import k.h;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15895b;

    public a(SavedStateRegistry savedStateRegistry) {
        this.f15894a = 0;
        this.f15895b = new LinkedHashSet();
        savedStateRegistry.c("androidx.savedstate.Restarter", this);
    }

    @Override // ea.d
    public final Bundle a() {
        switch (this.f15894a) {
            case 0:
                o0.f26530a.getClass();
                Bundle bundleX = u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
                xz.b.H(bundleX, "classes_to_restore", CollectionsKt.r0((LinkedHashSet) this.f15895b));
                return bundleX;
            default:
                Bundle bundle = new Bundle();
                ((h) this.f15895b).getDelegate().x(bundle);
                return bundle;
        }
    }

    public a(h hVar) {
        this.f15894a = 1;
        this.f15895b = hVar;
    }
}
