package e0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f15419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dn.k f15420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lz.i f15421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f15422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f15423f;

    public y(Context context, a0 a0Var, x xVar) {
        dn.k kVar = new dn.k(1);
        lz.i iVar = new lz.i(10);
        z zVar = new z();
        context.getClass();
        this.f15418a = context;
        this.f15419b = a0Var;
        this.f15420c = kVar;
        this.f15421d = iVar;
        this.f15422e = xVar;
        this.f15423f = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.f15418a, yVar.f15418a) && Intrinsics.areEqual(this.f15419b, yVar.f15419b) && Intrinsics.areEqual(this.f15420c, yVar.f15420c) && Intrinsics.areEqual(this.f15421d, yVar.f15421d) && Intrinsics.areEqual(this.f15422e, yVar.f15422e) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f15423f, yVar.f15423f) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        int iHashCode = (this.f15422e.hashCode() + ((this.f15421d.hashCode() + ((this.f15420c.hashCode() + ((this.f15419b.hashCode() + (this.f15418a.hashCode() * 31)) * 31)) * 31)) * 31)) * 961;
        this.f15423f.getClass();
        return (Boolean.hashCode(false) + iHashCode) * 31;
    }

    public final String toString() {
        return "Config(appContext=" + this.f15418a + ", threadConfig=" + this.f15419b + ", cameraMetadataConfig=" + this.f15420c + ", cameraBackendConfig=" + this.f15421d + ", cameraInteropConfig=" + this.f15422e + ", imageSources=null, flags=" + this.f15423f + ", platformApiCompat=null)";
    }
}
