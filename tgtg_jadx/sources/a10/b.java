package a10;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.measurement.ca;
import d00.d;
import e10.t;
import e10.u;
import f00.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lz.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends com.google.android.gms.common.api.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191a;

    public /* synthetic */ b(int i11) {
        this.f191a = i11;
    }

    @Override // com.google.android.gms.common.api.a
    public f buildClient(Context context, Looper looper, i iVar, Object obj, m mVar, n nVar) {
        switch (this.f191a) {
            case 0:
                iVar.getClass();
                Integer num = iVar.f11123f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new b10.a(context, looper, iVar, bundle, mVar, nVar);
            case 1:
                obj.getClass();
                throw new ClassCastException();
            case 2:
                return new ca(context, looper, 51, iVar, mVar, nVar);
            case 3:
            case 5:
            default:
                return super.buildClient(context, looper, iVar, obj, mVar, nVar);
            case 4:
                u uVar = (u) obj;
                if (uVar == null) {
                    uVar = new u(new t());
                }
                return new r00.i(context, looper, iVar, mVar, nVar, uVar.f15549a);
            case 6:
                return new h(context, looper, iVar, (iz.b) obj, mVar, nVar);
            case 7:
                return new e(context, looper, iVar, (GoogleSignInOptions) obj, mVar, nVar);
        }
    }

    @Override // com.google.android.gms.common.api.e
    public List getImpliedScopes(Object obj) {
        switch (this.f191a) {
            case 7:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                return googleSignInOptions == null ? Collections.EMPTY_LIST : new ArrayList(googleSignInOptions.f11023b);
            default:
                return super.getImpliedScopes(obj);
        }
    }

    @Override // com.google.android.gms.common.api.a
    public f buildClient(Context context, Looper looper, i iVar, Object obj, qz.f fVar, qz.n nVar) {
        switch (this.f191a) {
            case 3:
                context.getClass();
                looper.getClass();
                iVar.getClass();
                ((com.google.android.gms.common.api.c) obj).getClass();
                fVar.getClass();
                nVar.getClass();
                return new d(context, looper, 352, iVar, fVar, nVar);
            case 4:
            case 6:
            case 7:
            default:
                return super.buildClient(context, looper, iVar, obj, fVar, nVar);
            case 5:
                return new f00.d(context, looper, iVar, fVar, nVar);
            case 8:
                return new m00.h(context, looper, iVar, fVar, nVar);
            case 9:
                context.getClass();
                looper.getClass();
                iVar.getClass();
                ((com.google.android.gms.common.api.c) obj).getClass();
                fVar.getClass();
                nVar.getClass();
                return new nz.f(context, looper, 381, iVar, fVar, nVar);
            case 10:
                return new sz.c(context, looper, iVar, (com.google.android.gms.common.internal.u) obj, fVar, nVar);
        }
    }
}
