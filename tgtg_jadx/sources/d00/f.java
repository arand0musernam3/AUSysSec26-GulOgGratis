package d00;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import qz.t;
import qz.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f13667a = new h("IdentityCredentials.API", new a10.b(3), new g());

    public final Task c(GetCredentialRequest getCredentialRequest) {
        getCredentialRequest.getClass();
        t tVarBuilder = u.builder();
        tVarBuilder.f37390c = new pz.d[]{l00.b.f26751a};
        tVarBuilder.f37388a = new se.d(getCredentialRequest, 11);
        tVarBuilder.f37391d = 32701;
        Task taskDoRead = doRead(tVarBuilder.a());
        taskDoRead.getClass();
        return taskDoRead;
    }
}
