package fd;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td.f f17580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.t f17581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.t f17582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u70.t f17583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f17584f;

    public q(Context context, td.f fVar, u70.t tVar, u70.t tVar2, u70.t tVar3, e eVar) {
        this.f17579a = context;
        this.f17580b = fVar;
        this.f17581c = tVar;
        this.f17582d = tVar2;
        this.f17583e = tVar3;
        this.f17584f = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!Intrinsics.areEqual(this.f17579a, qVar.f17579a) || !Intrinsics.areEqual(this.f17580b, qVar.f17580b) || !Intrinsics.areEqual(this.f17581c, qVar.f17581c) || !Intrinsics.areEqual(this.f17582d, qVar.f17582d) || !Intrinsics.areEqual(this.f17583e, qVar.f17583e)) {
            return false;
        }
        h hVar = h.f17565a;
        return Intrinsics.areEqual(hVar, hVar) && Intrinsics.areEqual(this.f17584f, qVar.f17584f) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return (this.f17584f.hashCode() + ((h.f17565a.hashCode() + ((this.f17583e.hashCode() + ((this.f17582d.hashCode() + ((this.f17581c.hashCode() + ((this.f17580b.hashCode() + (this.f17579a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.f17579a + ", defaults=" + this.f17580b + ", mainCoroutineContextLazy=" + this.f17581c + ", memoryCacheLazy=" + this.f17582d + ", diskCacheLazy=" + this.f17583e + ", eventListenerFactory=" + h.f17565a + ", componentRegistry=" + this.f17584f + ", logger=null)";
    }
}
