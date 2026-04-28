package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f3250c;

    public k1(FragmentManager fragmentManager, String str, int i11) {
        this.f3250c = fragmentManager;
        this.f3248a = str;
        this.f3249b = i11;
    }

    @Override // androidx.fragment.app.j1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.f3250c.A;
        if (fragment != null && this.f3249b < 0 && this.f3248a == null && fragment.getChildFragmentManager().T(-1, 0)) {
            return false;
        }
        return this.f3250c.U(arrayList, arrayList2, this.f3248a, this.f3249b, 1);
    }
}
