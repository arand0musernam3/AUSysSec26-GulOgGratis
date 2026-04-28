package yz;

import android.os.RemoteException;
import cz.j;
import j30.g;
import java.util.Objects;
import qc.y;
import u00.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f46348b;

    public d(j jVar, int i11) {
        this.f46347a = i11;
        switch (i11) {
            case 1:
                Objects.requireNonNull(jVar);
                this.f46348b = jVar;
                break;
            default:
                Objects.requireNonNull(jVar);
                this.f46348b = jVar;
                break;
        }
    }

    @Override // yz.e
    public final int a() {
        switch (this.f46347a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // yz.e
    public final void b() {
        switch (this.f46347a) {
            case 0:
                g gVar = (g) this.f46348b.f13632b;
                gVar.getClass();
                try {
                    h hVar = (h) gVar.f24503c;
                    hVar.M(12, hVar.L());
                } catch (RemoteException e5) {
                    y.l(e5);
                    return;
                }
                break;
            default:
                g gVar2 = (g) this.f46348b.f13632b;
                gVar2.getClass();
                try {
                    h hVar2 = (h) gVar2.f24503c;
                    hVar2.M(3, hVar2.L());
                } catch (RemoteException e11) {
                    y.l(e11);
                }
                break;
        }
    }
}
