package l9;

import android.os.Bundle;
import g9.l;
import java.util.Arrays;
import jb.u;
import kotlin.Pair;
import kotlin.collections.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f27528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f27529d;

    public d(l lVar, int i11) {
        this.f27526a = lVar.f20167f;
        this.f27527b = i11;
        c cVar = lVar.f20169h;
        this.f27528c = cVar.a();
        o0.f26530a.getClass();
        Bundle bundleX = u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
        this.f27529d = bundleX;
        cVar.f27521h.c(bundleX);
    }

    public d(Bundle bundle) {
        bundle.getClass();
        bundle.getClass();
        this.f27526a = w.b.N(bundle, "nav-entry-state:id");
        this.f27527b = w.b.K(bundle, "nav-entry-state:destination-id");
        this.f27528c = w.b.M(bundle, "nav-entry-state:args");
        this.f27529d = w.b.M(bundle, "nav-entry-state:saved-state");
    }
}
