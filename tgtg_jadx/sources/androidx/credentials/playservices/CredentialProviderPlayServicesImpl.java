package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import c50.w;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.o;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import n7.m;
import n7.n;
import n7.s;
import n7.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qz.t;
import qz.u;
import w.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ?\u0010!\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0016¢\u0006\u0004\b!\u0010\"J3\u0010&\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\fH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010)J?\u0010*\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0002¢\u0006\u0004\b*\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R(\u0010-\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Ln7/n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ln7/s;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Ln7/l;", "Ln7/t;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "", "onGetCredential", "(Landroid/content/Context;Ln7/s;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ln7/l;)V", "Ln7/b;", "Ln7/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Ln7/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ln7/l;)V", "", "isAvailableOnDevice", "()Z", "", "minApkVersion", "(I)Z", "Ln7/a;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Ln7/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ln7/l;)V", "Ln7/x;", "Ln7/y;", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "onSignalCredentialState", "(Ln7/x;Ljava/util/concurrent/Executor;Ln7/l;)V", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "runFallbackClearCredFlow", "Landroid/content/Context;", "Lcom/google/android/gms/common/GoogleApiAvailability;", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/GoogleApiAvailability;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialProviderPlayServicesImpl implements n {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;

    @NotNull
    private static final String TAG = "PlayServicesImpl";

    @NotNull
    private final Context context;

    @NotNull
    private GoogleApiAvailability googleApiAvailability;

    public CredentialProviderPlayServicesImpl(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.googleApiAvailability = GoogleApiAvailability.f11044d;
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.b(context, minApkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$10(CancellationSignal cancellationSignal, Executor executor, n7.l lVar, Boolean bool) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new a(executor, lVar, 3));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$10$lambda$9(Executor executor, n7.l lVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new f(lVar, 4));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    public static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, Executor executor, n7.l lVar, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Clearing restore credential failed", exc);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((exc instanceof ApiException) && ((ApiException) exc).f11049a.f11059a == 40201) {
            objectRef.element = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new k(executor, lVar, objectRef, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$14$lambda$13(Executor executor, n7.l lVar, Ref.ObjectRef objectRef) {
        executor.execute(new h(lVar, objectRef, 0));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(n7.l lVar, Ref.ObjectRef objectRef) {
        lVar.a(objectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$17(CancellationSignal cancellationSignal, Executor executor, n7.l lVar, c00.c cVar) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new a(executor, lVar, 1));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$17$lambda$16(Executor executor, n7.l lVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new f(lVar, 1));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, n7.a aVar, CancellationSignal cancellationSignal, Executor executor, n7.l lVar, Exception exc) {
        exc.getClass();
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aVar, cancellationSignal, executor, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$7(Executor executor, n7.l lVar) {
        executor.execute(new f(lVar, 2));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(n7.l lVar) {
        lVar.a(new ClearCredentialProviderConfigurationException());
    }

    private static final Unit onCreateCredential$lambda$5(Executor executor, n7.l lVar) {
        executor.execute(new f(lVar, 5));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(n7.l lVar) {
        lVar.a(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$1(Executor executor, n7.l lVar) {
        executor.execute(new f(lVar, 0));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(n7.l lVar) {
        lVar.a(new GetCredentialProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$3(Executor executor, n7.l lVar) {
        executor.execute(new f(lVar, 6));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(n7.l lVar) {
        lVar.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private final void runFallbackClearCredFlow(n7.a request, final CancellationSignal cancellationSignal, final Executor executor, final n7.l callback) {
        f00.c cVarV = ba0.g.v(this.context);
        cVarV.getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = o.f11087a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            w.d();
            return;
        }
        qz.g.a();
        t tVarBuilder = u.builder();
        tVarBuilder.f37390c = new pz.d[]{f00.e.f17033a};
        tVarBuilder.f37388a = new lz.i(cVarV, 13);
        tVarBuilder.f37389b = false;
        tVarBuilder.f37391d = 1554;
        cVarV.doWrite(tVarBuilder.a()).g(new z(new Function1() { // from class: androidx.credentials.playservices.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, callback, (Void) obj);
            }
        }, 7)).e(new j(this, cancellationSignal, executor, callback, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, Executor executor, n7.l lVar, Void r52) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new a(executor, lVar, 4));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, n7.l lVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new f(lVar, 3));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, n7.l lVar, Exception exc) {
        exc.getClass();
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new g(exc, executor, lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(Exception exc, Executor executor, n7.l lVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new l(lVar, exc, 0));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(n7.l lVar, Exception exc) {
        lVar.a(new ClearCredentialUnknownException(exc.getMessage()));
    }

    @NotNull
    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z11 = iIsGooglePlayServicesAvailable == 0;
        if (!z11) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new pz.b(iIsGooglePlayServicesAvailable, null, null));
        }
        return z11;
    }

    @Override // n7.n
    public void onClearCredential(@NotNull n7.a request, @Nullable final CancellationSignal cancellationSignal, @NotNull final Executor executor, @NotNull final n7.l callback) {
        request.getClass();
        executor.getClass();
        callback.getClass();
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        boolean zAreEqual = Intrinsics.areEqual(request.f30671a, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL");
        com.google.android.gms.common.api.c cVar = com.google.android.gms.common.api.d.S;
        if (!zAreEqual) {
            if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                runFallbackClearCredFlow(request, cancellationSignal, executor, callback);
                return;
            }
            Context context = this.context;
            context.getClass();
            d00.f fVar = new d00.f(context, null, d00.f.f13667a, cVar, com.google.android.gms.common.api.k.f11084c);
            c00.b bVar = new c00.b();
            t tVarBuilder = u.builder();
            tVarBuilder.f37390c = new pz.d[]{l00.b.f26752b};
            tVarBuilder.f37388a = new se.b(bVar, 12);
            tVarBuilder.f37391d = 32708;
            Task taskDoWrite = fVar.doWrite(tVarBuilder.a());
            taskDoWrite.getClass();
            taskDoWrite.g(new z(new Function1() { // from class: androidx.credentials.playservices.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CredentialProviderPlayServicesImpl.onClearCredential$lambda$17(cancellationSignal, executor, callback, (c00.c) obj);
                }
            }, 6)).f(d10.h.f13698a, new e(this, request, cancellationSignal, executor, callback));
            return;
        }
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
            companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new a(executor, callback, 5));
            return;
        }
        Context context2 = this.context;
        context2.getClass();
        nz.e eVar = new nz.e(context2, null, nz.e.f31455a, cVar, com.google.android.gms.common.api.k.f11084c);
        mz.a aVar = new mz.a(request.f30672b);
        t tVarBuilder2 = u.builder();
        tVarBuilder2.f37390c = new pz.d[]{g00.a.f18060a};
        jd.f fVar2 = new jd.f(12);
        fVar2.f24983b = aVar;
        tVarBuilder2.f37388a = fVar2;
        tVarBuilder2.f37391d = 1694;
        Task taskDoRead = eVar.doRead(tVarBuilder2.a());
        taskDoRead.getClass();
        taskDoRead.g(new z(new Function1() { // from class: androidx.credentials.playservices.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$10(cancellationSignal, executor, callback, (Boolean) obj);
            }
        }, 5)).f(d10.h.f13698a, new c(cancellationSignal, executor, callback, 0));
    }

    public void onCreateCredential(@NotNull Context context, @NotNull n7.b request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull n7.l callback) {
        context.getClass();
        throw null;
    }

    @Override // n7.n
    public void onGetCredential(@NotNull Context context, @NotNull s request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull n7.l callback) {
        context.getClass();
        request.getClass();
        executor.getClass();
        callback.getClass();
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isDigitalCredentialRequest$credentials_play_services_auth_release(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                new CredentialProviderGetDigitalCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new a(executor, callback, 0));
                return;
            }
        }
        if (companion.isGetRestoreCredentialRequest$credentials_play_services_auth_release(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderGetRestoreCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new a(executor, callback, 2));
                return;
            }
        }
        if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            new GetCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }

    public void onPrepareCredential(@NotNull s sVar, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull n7.l lVar) {
        sVar.getClass();
        executor.getClass();
        lVar.getClass();
    }

    public void onSignalCredentialState(@NotNull x request, @NotNull Executor executor, @NotNull n7.l callback) {
        throw null;
    }

    public final void setGoogleApiAvailability(@NotNull GoogleApiAvailability googleApiAvailability) {
        googleApiAvailability.getClass();
        this.googleApiAvailability = googleApiAvailability;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "", "callback", "cancellationReviewerWithCallback$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function0;)V", "cancellationReviewerWithCallback", "", "cancellationReviewer$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;)Z", "cancellationReviewer", "Ln7/s;", "request", "isGetSignInIntentRequest$credentials_play_services_auth_release", "(Ln7/s;)Z", "isGetSignInIntentRequest", "isGetRestoreCredentialRequest$credentials_play_services_auth_release", "isGetRestoreCredentialRequest", "isDigitalCredentialRequest$credentials_play_services_auth_release", "isDigitalCredentialRequest", "", "TAG", "Ljava/lang/String;", "", "MIN_GMS_APK_VERSION", "I", "PRE_U_MIN_GMS_APK_VERSION", "MIN_GMS_APK_VERSION_RESTORE_CRED", "MIN_GMS_APK_VERSION_DIGITAL_CRED", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(@Nullable CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(@Nullable CancellationSignal cancellationSignal, @NotNull Function0<Unit> callback) {
            callback.getClass();
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isDigitalCredentialRequest$credentials_play_services_auth_release(@NotNull s request) {
            request.getClass();
            for (m mVar : request.f30682a) {
            }
            return false;
        }

        public final boolean isGetRestoreCredentialRequest$credentials_play_services_auth_release(@NotNull s request) {
            request.getClass();
            for (m mVar : request.f30682a) {
            }
            return false;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(@NotNull s request) {
            request.getClass();
            Iterator it = request.f30682a.iterator();
            while (it.hasNext()) {
                if (((m) it.next()) instanceof i10.b) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    @Override // n7.n
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onGetCredential(@NotNull Context context, @NotNull n7.w wVar, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull n7.l lVar) {
        context.getClass();
        throw null;
    }
}
