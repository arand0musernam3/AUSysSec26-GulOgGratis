package n7;

import android.credentials.ClearCredentialStateException;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import o30.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30679a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f30680b;

    public o(k kVar, p pVar) {
        this.f30680b = kVar;
    }

    public final void onError(Throwable th2) {
        switch (this.f30679a) {
            case 0:
                ((ClearCredentialStateException) th2).getClass();
                Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
                ((f90.b) this.f30680b).a(new ClearCredentialUnknownException(null));
                break;
            default:
                GetCredentialException getCredentialException = (GetCredentialException) th2;
                getCredentialException.getClass();
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                k kVar = (k) this.f30680b;
                String type = getCredentialException.getType();
                type.getClass();
                kVar.a(e0.H(getCredentialException.getMessage(), type));
                break;
        }
    }

    public final void onResult(Object obj) {
        switch (this.f30679a) {
            case 0:
                Log.i("CredManProvService", "Clear result returned from framework: ");
                ((f90.b) this.f30680b).onResult((Void) obj);
                break;
            default:
                GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
                getCredentialResponse.getClass();
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                k kVar = (k) this.f30680b;
                Credential credential = getCredentialResponse.getCredential();
                credential.getClass();
                String type = credential.getType();
                type.getClass();
                Bundle data = credential.getData();
                data.getClass();
                kVar.onResult(new t(pd.g.p(data, type)));
                break;
        }
    }

    public o(f90.b bVar) {
        this.f30680b = bVar;
    }
}
