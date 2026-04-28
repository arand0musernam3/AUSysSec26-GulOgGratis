package g9;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9.d f20171a;

    public m(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(m.class.getClassLoader());
        this.f20171a = new l9.d(bundle);
    }

    public final Bundle a() {
        l9.d dVar = this.f20171a;
        dVar.getClass();
        kotlin.collections.o0.f26530a.getClass();
        Bundle bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
        String str = dVar.f27526a;
        str.getClass();
        bundleX.putString("nav-entry-state:id", str);
        bundleX.putInt("nav-entry-state:destination-id", dVar.f27527b);
        Bundle bundleX2 = dVar.f27528c;
        if (bundleX2 == null) {
            bundleX2 = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
        }
        bundleX.putBundle("nav-entry-state:args", bundleX2);
        Bundle bundle = dVar.f27529d;
        bundle.getClass();
        bundleX.putBundle("nav-entry-state:saved-state", bundle);
        return bundleX;
    }

    public m(l lVar) {
        lVar.getClass();
        this.f20171a = new l9.d(lVar, lVar.f20163b.f20258b.f27563e);
    }
}
