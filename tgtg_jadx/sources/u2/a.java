package u2;

import b4.s;
import b5.h1;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu2/a;", "Lb5/h1;", "Lu2/c;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f40635b;

    public a(Function0 function0) {
        this.f40635b = function0;
    }

    @Override // b5.h1
    public final s create() {
        return new c(this.f40635b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f40635b == ((a) obj).f40635b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40635b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "stylusHandwriting";
        o2Var.f7309c.b(this.f40635b, "onHandwritingSlopExceeded");
    }

    @Override // b5.h1
    public final void update(s sVar) {
        ((c) sVar).f40637q = this.f40635b;
    }
}
