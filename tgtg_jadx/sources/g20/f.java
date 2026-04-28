package g20;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f18283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f18285c;

    public f(b bVar, View view) {
        int i11 = Build.VERSION.SDK_INT;
        this.f18283a = i11 >= 34 ? new e() : i11 >= 33 ? new c() : null;
        this.f18284b = bVar;
        this.f18285c = view;
    }

    public final void a(boolean z11) {
        c cVar = this.f18283a;
        if (cVar != null) {
            cVar.b(this.f18284b, this.f18285c, z11);
        }
    }

    public final void b() {
        c cVar = this.f18283a;
        if (cVar != null) {
            cVar.c(this.f18285c);
        }
    }
}
