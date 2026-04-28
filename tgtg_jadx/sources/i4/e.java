package i4;

import android.content.Context;
import android.os.Build;
import c5.o3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f23235g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5.y f23236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23237b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m4.b f23238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k8.d f23240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ae.b f23241f;

    public e(c5.y yVar) {
        this.f23236a = yVar;
        ae.b bVar = new ae.b(this, 1);
        this.f23241f = bVar;
        if (yVar.isAttachedToWindow()) {
            Context context = yVar.getContext();
            if (!this.f23239d) {
                context.getApplicationContext().registerComponentCallbacks(bVar);
                this.f23239d = true;
            }
        }
        yVar.addOnAttachStateChangeListener(new o3(this, 2));
    }

    @Override // i4.e0
    public final void a(l4.b bVar) {
        synchronized (this.f23237b) {
            if (!bVar.f27290s) {
                bVar.f27290s = true;
                bVar.b();
            }
        }
    }

    @Override // i4.e0
    public final k8.d b() {
        k8.d dVar = this.f23240e;
        if (dVar != null) {
            return dVar;
        }
        k8.d dVar2 = new k8.d(24);
        this.f23240e = dVar2;
        return dVar2;
    }

    @Override // i4.e0
    public final l4.b c() {
        l4.d hVar;
        l4.b bVar;
        synchronized (this.f23237b) {
            try {
                c5.y yVar = this.f23236a;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    b.b(yVar);
                }
                if (i11 >= 29) {
                    hVar = new l4.f();
                } else if (f23235g) {
                    try {
                        hVar = new l4.e(this.f23236a, new u(), new k4.b());
                    } catch (Throwable unused) {
                        f23235g = false;
                        c5.y yVar2 = this.f23236a;
                        m4.b bVar2 = this.f23238c;
                        if (bVar2 == null) {
                            m4.b bVar3 = new m4.b(yVar2.getContext());
                            yVar2.addView(bVar3, -1);
                            this.f23238c = bVar3;
                            bVar2 = bVar3;
                        }
                        hVar = new l4.h(bVar2);
                    }
                } else {
                    c5.y yVar3 = this.f23236a;
                    m4.b bVar4 = this.f23238c;
                    if (bVar4 == null) {
                        m4.b bVar5 = new m4.b(yVar3.getContext());
                        yVar3.addView(bVar5, -1);
                        this.f23238c = bVar5;
                        bVar4 = bVar5;
                    }
                    hVar = new l4.h(bVar4);
                }
                bVar = new l4.b(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
