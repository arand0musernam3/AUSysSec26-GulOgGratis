package bz;

import a8.h;
import android.content.Context;
import com.google.firebase.messaging.a0;
import cz.j;
import cz.k;
import cz.l;
import dz.g;
import n20.f;
import wy.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements yy.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f6780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.a f6781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yy.b f6782d;

    public /* synthetic */ d(t70.a aVar, t70.a aVar2, yy.b bVar, int i11) {
        this.f6779a = i11;
        this.f6780b = aVar;
        this.f6781c = aVar2;
        this.f6782d = bVar;
    }

    @Override // t70.a
    public final Object get() {
        switch (this.f6779a) {
            case 0:
                return new h((Context) this.f6780b.get(), (g) this.f6781c.get(), (cz.a) ((c) this.f6782d).get(), 17);
            default:
                return new p(new f(16), new r40.d(), (a) ((b) this.f6780b).get(), (j) ((k) this.f6781c).get(), (a0) ((l) this.f6782d).get());
        }
    }
}
