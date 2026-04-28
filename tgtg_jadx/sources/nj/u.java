package nj;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f70.g f30957a;

    public u(f70.g gVar) {
        gVar.getClass();
        this.f30957a = gVar;
    }

    public final void a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("accepted", true);
        f70.d dVar = new f70.d(bundle);
        f70.g gVar = this.f30957a;
        gVar.a(dVar);
        gVar.a(new f70.a());
    }
}
