package g3;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg3/z2;", "Lb5/h1;", "Lg3/a3;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z2 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z2 f19875b = new z2();

    @Override // b5.h1
    public final b4.s create() {
        return new a3();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = "minimumInteractiveComponentSize";
        o2Var.f7309c.b("Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller", "README");
    }

    @Override // b5.h1
    public final /* bridge */ /* synthetic */ void update(b4.s sVar) {
    }
}
