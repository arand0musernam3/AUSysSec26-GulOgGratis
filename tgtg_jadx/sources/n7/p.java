package n7;

import android.content.Context;
import android.credentials.ClearCredentialStateRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CredentialManager f30681a;

    public p(Context context) {
        context.getClass();
        this.f30681a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // n7.n
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f30681a != null;
    }

    @Override // n7.n
    public final void onClearCredential(a aVar, CancellationSignal cancellationSignal, Executor executor, l lVar) {
        Log.i("CredManProvService", "In CredentialProviderFrameworkImpl onClearCredential");
        f90.b bVar = (f90.b) lVar;
        CredentialManager credentialManager = this.f30681a;
        if (credentialManager == null) {
            bVar.a(new ClearCredentialUnsupportedException("Your device doesn't support credential manager", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION"));
            return;
        }
        o oVar = new o(bVar);
        credentialManager.getClass();
        credentialManager.clearCredentialState(new ClearCredentialStateRequest(new Bundle()), cancellationSignal, executor, oVar);
    }

    @Override // n7.n
    public final void onGetCredential(Context context, s sVar, CancellationSignal cancellationSignal, Executor executor, l lVar) {
        context.getClass();
        sVar.getClass();
        k kVar = (k) lVar;
        CredentialManager credentialManager = this.f30681a;
        if (credentialManager == null) {
            kVar.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
            return;
        }
        o oVar = new o(kVar, this);
        credentialManager.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (m mVar : sVar.f30682a) {
            mVar.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", mVar.f30676a, mVar.f30677b).setIsSystemProviderRequired(true).setAllowedProviders(mVar.f30678c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builder.build();
        getCredentialRequestBuild.getClass();
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, executor, oVar);
    }
}
