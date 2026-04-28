package z;

import e0.p1;
import kotlin.jvm.internal.Intrinsics;
import s0.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f46369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.b f46370c;

    public e(int i11, x0 x0Var, i0.b bVar) {
        x0Var.getClass();
        this.f46368a = i11;
        this.f46369b = x0Var;
        this.f46370c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f46368a == eVar.f46368a && Intrinsics.areEqual(this.f46369b, eVar.f46369b) && Intrinsics.areEqual(this.f46370c, eVar.f46370c);
    }

    public final int hashCode() {
        return this.f46370c.hashCode() + ((this.f46369b.hashCode() + (Integer.hashCode(this.f46368a) * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredOutput(streamId=" + ((Object) p1.a(this.f46368a)) + ", deferrableSurface=" + this.f46369b + ", graph=" + this.f46370c + ')';
    }
}
