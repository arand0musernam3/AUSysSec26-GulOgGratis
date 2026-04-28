package androidx.credentials.playservices.controllers;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.c;
import androidx.credentials.playservices.f;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import h7.i0;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m2.c2;
import n7.l;
import n7.t;
import o30.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.g;
import qm.a;
import r7.b;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/playservices/controllers/ResponseUtils;", "", "<init>", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResponseUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "GetCredentialController";

    public static final void handleGetCredentialResponse(int i11, int i12, @Nullable Intent intent, @NotNull Executor executor, @NotNull l lVar, @Nullable CancellationSignal cancellationSignal) {
        INSTANCE.handleGetCredentialResponse(i11, i12, intent, executor, lVar, cancellationSignal);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/credentials/playservices/controllers/ResponseUtils$Companion;", "", "<init>", "()V", "", "uniqueRequestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", Bayeux.KEY_DATA, "Ljava/util/concurrent/Executor;", "executor", "Ln7/l;", "Ln7/t;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "handleGetCredentialResponse", "(IILandroid/content/Intent;Ljava/util/concurrent/Executor;Ln7/l;Landroid/os/CancellationSignal;)V", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$0(CancellationSignal cancellationSignal, Function0 function0) {
            function0.getClass();
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, function0);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$2(Executor executor, l lVar, GetCredentialException getCredentialException) {
            getCredentialException.getClass();
            executor.execute(new c(lVar, getCredentialException, 2));
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$4(Executor executor, l lVar) {
            executor.execute(new f(lVar, 10));
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$4$lambda$3(l lVar) {
            lVar.a(new GetCredentialUnknownException("No provider data returned."));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$6(Executor executor, l lVar, t tVar) {
            executor.execute(new b(lVar, tVar, 0));
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$8(Executor executor, l lVar, GetCredentialException getCredentialException) {
            executor.execute(new c(lVar, getCredentialException, 1));
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$8$lambda$7(l lVar, GetCredentialException getCredentialException) {
            if (getCredentialException == null) {
                getCredentialException = new GetCredentialUnknownException("No provider data returned");
            }
            lVar.a(getCredentialException);
        }

        public final void handleGetCredentialResponse(int uniqueRequestCode, int resultCode, @Nullable Intent data, @NotNull Executor executor, @NotNull l callback, @Nullable CancellationSignal cancellationSignal) {
            String string;
            Bundle bundle;
            t tVar;
            executor.getClass();
            callback.getClass();
            CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
            if (uniqueRequestCode != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
                Log.w(ResponseUtils.TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release() + " which  does not match what was given " + uniqueRequestCode);
                return;
            }
            CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
            if (companion2.maybeReportErrorResultCodeGet$credentials_play_services_auth_release(resultCode, new a(14), new c2(26, executor, callback), cancellationSignal)) {
                return;
            }
            if (data == null) {
                companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new androidx.credentials.playservices.a(executor, callback, 9));
                return;
            }
            int i11 = Build.VERSION.SDK_INT;
            GetCredentialException getCredentialExceptionH = null;
            if (i11 >= 34) {
                tVar = i0.f(data);
            } else {
                Bundle bundleExtra = data.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                tVar = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new t(g.p(bundle, string));
            }
            if (tVar != null) {
                companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new r7.c(executor, callback, tVar, 0));
                return;
            }
            if (i11 >= 34) {
                getCredentialExceptionH = i0.e(data);
            } else {
                int i12 = GetCredentialException.f2802a;
                Bundle bundleExtra2 = data.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                if (bundleExtra2 != null) {
                    String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                    if (string2 == null) {
                        i4.a.f("Bundle was missing exception type.");
                        return;
                    }
                    getCredentialExceptionH = e0.H(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                }
            }
            companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.b(executor, callback, getCredentialExceptionH, 1));
        }

        private Companion() {
        }
    }
}
