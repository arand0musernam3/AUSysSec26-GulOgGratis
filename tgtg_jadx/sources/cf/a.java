package cf;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0;
import gf.e;
import gf.h;
import kotlin.Pair;
import kotlin.collections.x0;
import pd.g;
import u70.o;
import u70.p;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends FragmentManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f7912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kf.b f7913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f7914c;

    public a(h hVar, kf.b bVar, e eVar) {
        this.f7912a = hVar;
        this.f7913b = bVar;
        this.f7914c = eVar;
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void b(FragmentManager fragmentManager, Fragment fragment) {
        Object pVar;
        fragment.getClass();
        if (((Boolean) this.f7914c.invoke()).booleanValue()) {
            String canonicalName = fragment.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = fragment.getClass().getSimpleName();
            }
            try {
                o oVar = q.f40850b;
                pVar = fragment.getResources().getResourceEntryName(fragment.getId());
            } catch (Throwable th2) {
                o oVar2 = q.f40850b;
                pVar = new p(th2);
            }
            Throwable thA = q.a(pVar);
            if (thA != null) {
                this.f7913b.a("Failed to get resource entry name: " + thA);
            }
            if (pVar instanceof p) {
                pVar = null;
            }
            String str = (String) pVar;
            o0 activity = fragment.getActivity();
            this.f7912a.invoke("[Amplitude] Fragment Viewed", x0.e(new Pair("[Amplitude] Fragment Class", canonicalName), new Pair("[Amplitude] Fragment Identifier", str), new Pair("[Amplitude] Screen Name", activity != null ? g.x(activity) : null), new Pair("[Amplitude] Fragment Tag", fragment.getTag())));
        }
    }
}
