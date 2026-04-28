package q0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0.b f35704b;

    public e(String str, n0.b bVar) {
        bVar.getClass();
        this.f35703a = str;
        this.f35704b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f35703a, eVar.f35703a) && Intrinsics.areEqual(this.f35704b, eVar.f35704b);
    }

    public final int hashCode() {
        return this.f35704b.hashCode() + (this.f35703a.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.f35703a + ", featureRequiring=" + this.f35704b + ')';
    }
}
