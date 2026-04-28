package r90;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import o80.o;
import o80.r;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KClass f37805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f37806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f37807e;

    public b(KClass kClass, Object obj, w wVar) {
        obj.getClass();
        wVar.getClass();
        this.f37805c = kClass;
        this.f37806d = obj;
        this.f37807e = wVar;
    }

    @Override // y9.w
    public final w E(KClass kClass, Object obj) {
        KClass kClass2 = this.f37805c;
        boolean zAreEqual = Intrinsics.areEqual(kClass, kClass2);
        w bVar = this.f37807e;
        if (!zAreEqual) {
            w wVarE = bVar.E(kClass, null);
            bVar = wVarE == bVar ? this : new b(kClass2, this.f37806d, wVarE);
        }
        return obj != null ? new b(kClass, obj, bVar) : bVar;
    }

    @Override // y9.w
    public final Object t(KClass kClass) {
        return Intrinsics.areEqual(kClass, this.f37805c) ? w.v(kClass).cast(this.f37806d) : this.f37807e.t(kClass);
    }

    public final String toString() {
        return CollectionsKt.U(CollectionsKt.f0(r.o(o.d(this, new qb.r(20)))), null, "{", "}", new qb.r(21), 25);
    }
}
