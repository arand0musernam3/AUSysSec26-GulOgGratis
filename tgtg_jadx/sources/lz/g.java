package lz;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends qz.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f28442k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, int i11) {
        super(oVar);
        this.f28442k = i11;
        i0.i(oVar, "GoogleApiClient must not be null");
        i0.i(iz.a.f24243a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ p b(Status status) {
        int i11 = this.f28442k;
        return status;
    }

    @Override // qz.d
    public final void f(com.google.android.gms.common.api.b bVar) {
        switch (this.f28442k) {
            case 0:
                e eVar = (e) bVar;
                j jVar = (j) eVar.getService();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.f28439a;
                Parcel parcelA = jVar.a();
                int i11 = f00.g.f17037a;
                parcelA.writeStrongBinder(fVar);
                f00.g.c(parcelA, googleSignInOptions);
                jVar.b(102, parcelA);
                break;
            default:
                e eVar2 = (e) bVar;
                j jVar2 = (j) eVar2.getService();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.f28439a;
                Parcel parcelA2 = jVar2.a();
                int i12 = f00.g.f17037a;
                parcelA2.writeStrongBinder(fVar2);
                f00.g.c(parcelA2, googleSignInOptions2);
                jVar2.b(103, parcelA2);
                break;
        }
    }
}
