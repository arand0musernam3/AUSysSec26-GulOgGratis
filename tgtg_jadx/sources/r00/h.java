package r00;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import e10.j;
import e10.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends a30.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d10.g f37521i;

    public /* synthetic */ h(int i11, d10.g gVar) {
        this.f37520h = i11;
        this.f37521i = gVar;
    }

    @Override // a30.d
    public void Q(Status status, boolean z11) {
        switch (this.f37520h) {
            case 0:
                na0.a.w0(status, Boolean.valueOf(z11), this.f37521i);
                break;
        }
    }

    @Override // a30.d
    public void R(Status status, j jVar) {
        switch (this.f37520h) {
            case 1:
                int i11 = e10.a.f15466b;
                boolean zD = status.d();
                d10.g gVar = this.f37521i;
                if (!zD) {
                    gVar.a(i0.l(status));
                } else {
                    gVar.b(jVar);
                }
                break;
        }
    }

    @Override // a30.d
    public void S(Status status, l lVar) {
        switch (this.f37520h) {
            case 2:
                int i11 = e10.a.f15466b;
                boolean zD = status.d();
                d10.g gVar = this.f37521i;
                if (!zD) {
                    gVar.a(i0.l(status));
                } else {
                    gVar.b(lVar);
                }
                break;
        }
    }

    @Override // a30.d
    public void T(int i11, boolean z11) {
        switch (this.f37520h) {
            case 0:
                na0.a.w0(new Status(i11, null, null, null), Boolean.valueOf(z11), this.f37521i);
                break;
        }
    }
}
