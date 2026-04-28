package v80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f42151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i80.n f42152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f42153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f42154e;

    public /* synthetic */ s(Object obj, j jVar, i80.n nVar, Throwable th2, int i11) {
        this(obj, (i11 & 2) != 0 ? null : jVar, (i11 & 4) != 0 ? null : nVar, (Object) null, (i11 & 16) != 0 ? null : th2);
    }

    public static s a(s sVar, j jVar, Throwable th2, int i11) {
        Object obj = sVar.f42150a;
        if ((i11 & 2) != 0) {
            jVar = sVar.f42151b;
        }
        j jVar2 = jVar;
        i80.n nVar = sVar.f42152c;
        Object obj2 = sVar.f42153d;
        if ((i11 & 16) != 0) {
            th2 = sVar.f42154e;
        }
        return new s(obj, jVar2, nVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f42150a, sVar.f42150a) && Intrinsics.areEqual(this.f42151b, sVar.f42151b) && Intrinsics.areEqual(this.f42152c, sVar.f42152c) && Intrinsics.areEqual(this.f42153d, sVar.f42153d) && Intrinsics.areEqual(this.f42154e, sVar.f42154e);
    }

    public final int hashCode() {
        Object obj = this.f42150a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        j jVar = this.f42151b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        i80.n nVar = this.f42152c;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Object obj2 = this.f42153d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f42154e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f42150a + ", cancelHandler=" + this.f42151b + ", onCancellation=" + this.f42152c + ", idempotentResume=" + this.f42153d + ", cancelCause=" + this.f42154e + ')';
    }

    public s(Object obj, j jVar, i80.n nVar, Object obj2, Throwable th2) {
        this.f42150a = obj;
        this.f42151b = jVar;
        this.f42152c = nVar;
        this.f42153d = obj2;
        this.f42154e = th2;
    }
}
