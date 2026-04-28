package tc;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f39933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f39934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39935c;

    public j(t tVar, t tVar2, boolean z11) {
        this.f39933a = tVar;
        this.f39934b = tVar2;
        this.f39935c = z11;
    }

    @Override // tc.g
    public final h a(Object obj, zc.n nVar) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.areEqual(uri.getScheme(), "http") && !Intrinsics.areEqual(uri.getScheme(), "https")) {
            return null;
        }
        return new m(uri.toString(), nVar, this.f39933a, this.f39934b, this.f39935c);
    }
}
