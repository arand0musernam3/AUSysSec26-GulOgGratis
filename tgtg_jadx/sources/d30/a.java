package d30;

import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import i30.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements IntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f14007a;

    public a(e eVar) {
        this.f14007a = eVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        e eVar = this.f14007a;
        i30.c cVar = eVar.f14021d;
        if (cVar == null) {
            return Tasks.c(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.b(), 10);
            Long lA = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof g) {
            }
            eVar.f14018a.a("requestIntegrityToken(%s)", integrityTokenRequest);
            d10.g gVar = new d10.g();
            cVar.a().post(new p(cVar, gVar, gVar, new c(eVar, gVar, bArrDecode, lA, gVar, integrityTokenRequest)));
            return gVar.f13697a;
        } catch (IllegalArgumentException e5) {
            return Tasks.c(new IntegrityServiceException(-13, e5));
        }
    }
}
