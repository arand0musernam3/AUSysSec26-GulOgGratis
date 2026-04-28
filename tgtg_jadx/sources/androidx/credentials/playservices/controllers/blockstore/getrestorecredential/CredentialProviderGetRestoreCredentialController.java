package androidx.credentials.playservices.controllers.blockstore.getrestorecredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.g;
import androidx.credentials.playservices.h;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import g00.a;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import ky.o;
import mz.d;
import mz.e;
import n7.l;
import n7.m;
import n7.s;
import n7.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qz.u;
import r7.b;
import r7.c;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/blockstore/getrestorecredential/CredentialProviderGetRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Ln7/s;", "Lmz/d;", "Lmz/e;", "Ln7/t;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Ln7/l;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Ln7/s;Ln7/l;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Ln7/s;)Lmz/d;", "response", "convertResponseToCredentialManager", "(Lmz/e;)Ln7/t;", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialProviderGetRestoreCredentialController extends CredentialProviderController<s, d, e, t, GetCredentialException> {

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController(@NotNull Context context) {
        super(context);
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4(CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController, CancellationSignal cancellationSignal, Executor executor, l lVar, e eVar) {
        try {
            eVar.getClass();
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new c(executor, lVar, credentialProviderGetRestoreCredentialController.convertResponseToCredentialManager(eVar), 1));
        } catch (Exception e5) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new g(executor, lVar, e5, 3));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$1(Executor executor, l lVar, t tVar) {
        executor.execute(new b(lVar, tVar, 1));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$3(Executor executor, l lVar, Exception exc) {
        executor.execute(new androidx.credentials.playservices.l(lVar, exc, 3));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$4$lambda$3$lambda$2(l lVar, Exception exc) {
        lVar.a(exc instanceof NoCredentialException ? (GetCredentialException) exc : new GetCredentialUnknownException(exc.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    public static final void invokePlayServices$lambda$8(CancellationSignal cancellationSignal, Executor executor, l lVar, Exception exc) {
        exc.getClass();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new GetCredentialUnknownException(k.j(exc, new StringBuilder("Get restore credential failed for unknown reason, failure: ")));
        if (exc instanceof ApiException) {
            Status status = ((ApiException) exc).f11049a;
            if (status.f11059a == 40201) {
                objectRef.element = new GetCredentialUnknownException(k.j(exc, new StringBuilder("The restore credential internal service had a failure, failure: ")));
            } else {
                objectRef.element = new GetCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + status.f11059a);
            }
        }
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new androidx.credentials.playservices.k(executor, lVar, objectRef, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$7(Executor executor, l lVar, Ref.ObjectRef objectRef) {
        executor.execute(new h(lVar, objectRef, 2));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8$lambda$7$lambda$6(l lVar, Ref.ObjectRef objectRef) {
        lVar.a(objectRef.element);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public d convertRequestToPlayServices(@NotNull s request) {
        request.getClass();
        for (m mVar : request.f30682a) {
        }
        Intrinsics.throwUninitializedPropertyAccessException("credentialOption");
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public t convertResponseToCredentialManager(@NotNull e response) {
        response.getClass();
        return new t(pd.g.p(response.f30265a, "androidx.credentials.TYPE_RESTORE_CREDENTIAL"));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull s request, @NotNull final l callback, @NotNull final Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        request.getClass();
        callback.getClass();
        executor.getClass();
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        d dVarConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Context context = this.context;
        context.getClass();
        nz.e eVar = new nz.e(context, null, nz.e.f31455a, com.google.android.gms.common.api.d.S, com.google.android.gms.common.api.k.f11084c);
        dVarConvertRequestToPlayServices.getClass();
        qz.t tVarBuilder = u.builder();
        tVarBuilder.f37390c = new pz.d[]{a.f18061b};
        o oVar = new o(6, false);
        oVar.f26718b = dVarConvertRequestToPlayServices;
        tVarBuilder.f37388a = oVar;
        tVarBuilder.f37391d = 1695;
        Task taskDoRead = eVar.doRead(tVarBuilder.a());
        taskDoRead.getClass();
        taskDoRead.g(new mp.a(new Function1() { // from class: t7.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$4(this.f39835a, cancellationSignal, executor, callback, (e) obj);
            }
        }, 13)).e(new androidx.credentials.playservices.c(cancellationSignal, executor, callback, 1));
    }
}
