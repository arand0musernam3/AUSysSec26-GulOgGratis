package androidx.credentials.playservices.controllers.blockstore.createrestorecredential;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.restorecredential.CreateRestoreCredentialDomException;
import androidx.credentials.exceptions.restorecredential.E2eeUnavailableException;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.d;
import androidx.credentials.playservices.g;
import androidx.credentials.playservices.h;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import lw.o;
import mz.b;
import mz.c;
import n7.i;
import n7.l;
import org.bouncycastle.jce.provider.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Ln7/i;", "Lmz/b;", "Lmz/c;", "Ln7/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Ln7/l;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Ln7/i;Ln7/l;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Ln7/i;)Lmz/b;", "response", "convertResponseToCredentialManager", "(Lmz/c;)Ln7/c;", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialProviderCreateRestoreCredentialController extends CredentialProviderController<i, b, c, n7.c, CreateCredentialException> {

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreateRestoreCredentialController(@NotNull Context context) {
        super(context);
        context.getClass();
        this.context = context;
    }

    private static final Unit invokePlayServices$lambda$4(CredentialProviderCreateRestoreCredentialController credentialProviderCreateRestoreCredentialController, CancellationSignal cancellationSignal, Executor executor, l lVar, c cVar) {
        try {
            cVar.getClass();
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new o(executor, lVar, credentialProviderCreateRestoreCredentialController.convertResponseToCredentialManager(cVar), 19));
        } catch (Exception e5) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new g(executor, lVar, e5, 2));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$1(Executor executor, l lVar, n7.c cVar) {
        executor.execute(new d(lVar, cVar, 1));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$3(Executor executor, l lVar, Exception exc) {
        executor.execute(new androidx.credentials.playservices.l(lVar, exc, 2));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$4$lambda$3$lambda$2(l lVar, Exception exc) {
        lVar.a(new CreateCredentialUnknownException(exc.getMessage()));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, androidx.credentials.exceptions.CreateCredentialException] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, androidx.credentials.exceptions.CreateCredentialException] */
    private static final void invokePlayServices$lambda$8(CancellationSignal cancellationSignal, Executor executor, l lVar, Exception exc) {
        exc.getClass();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new CreateCredentialUnknownException(k.j(exc, new StringBuilder("Create restore credential failed for unknown reason, failure: ")));
        if (exc instanceof ApiException) {
            Status status = ((ApiException) exc).f11049a;
            switch (status.f11059a) {
                case 40201:
                    objectRef.element = new CreateCredentialUnknownException(k.j(exc, new StringBuilder("The restore credential internal service had a failure, failure: ")));
                    break;
                case 40202:
                    objectRef.element = new CreateRestoreCredentialDomException(k.j(exc, new StringBuilder("The request did not match the fido spec, failure: ")), "androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR");
                    break;
                case 40203:
                    objectRef.element = new E2eeUnavailableException("E2ee is not available on the device. Check whether the backup and screen lock are enabled.", "androidx.credentials.TYPE_E2EE_UNAVAILABLE_EXCEPTION");
                    break;
                default:
                    objectRef.element = new CreateCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + status.f11059a);
                    break;
            }
        }
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new androidx.credentials.playservices.k(executor, lVar, objectRef, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$7(Executor executor, l lVar, Ref.ObjectRef objectRef) {
        executor.execute(new h(lVar, objectRef, 1));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8$lambda$7$lambda$6(l lVar, Ref.ObjectRef objectRef) {
        lVar.a(objectRef.element);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ b convertRequestToPlayServices(i iVar) {
        if (iVar == null) {
            return convertRequestToPlayServices2((i) null);
        }
        a.c();
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public n7.c convertResponseToCredentialManager(@NotNull c response) throws CreateCredentialUnknownException {
        response.getClass();
        Bundle bundle = response.f30263a;
        bundle.getClass();
        String string = bundle.getString("androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE");
        if (string == null) {
            throw new CreateCredentialUnknownException("The response bundle did not contain the response data. This should not happen.");
        }
        n7.d dVar = new n7.d(bundle, "androidx.credentials.TYPE_RESTORE_CREDENTIAL");
        if (string.length() != 0) {
            try {
                new JSONObject(string);
                return dVar;
            } catch (Exception unused) {
            }
        }
        i4.a.f("registrationResponseJson must not be empty, and must be a valid JSON");
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(i iVar, l lVar, Executor executor, CancellationSignal cancellationSignal) {
        if (iVar == null) {
            invokePlayServices2((i) null, lVar, executor, cancellationSignal);
        } else {
            a.c();
        }
    }

    /* JADX INFO: renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(@NotNull i request, @NotNull l callback, @NotNull Executor executor, @Nullable CancellationSignal cancellationSignal) {
        throw null;
    }

    @NotNull
    /* JADX INFO: renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public b convertRequestToPlayServices2(@NotNull i request) {
        throw null;
    }
}
