package a3;

import android.view.View;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import com.app.tgtg.R;
import com.app.tgtg.customview.DiscoverLocationView;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.feature.authentication.ui.AuthenticationActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f617b;

    public /* synthetic */ x0(Object obj, int i11) {
        this.f616a = i11;
        this.f617b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i0.b bVarC;
        boolean z11 = true;
        char c3 = 1;
        g9.f0 f0Var = null;
        Object[] objArr = 0;
        switch (this.f616a) {
            case 0:
                w4.v vVar = (w4.v) obj;
                if (((o) this.f617b).d(vVar.f43180c)) {
                    vVar.a();
                }
                return Unit.f26487a;
            case 1:
                AuthenticationActivity authenticationActivity = (AuthenticationActivity) this.f617b;
                f70.h hVar = (f70.h) obj;
                int i11 = AuthenticationActivity.f8960i;
                hVar.getClass();
                if (hVar instanceof f70.c) {
                    g9.f0 f0Var2 = authenticationActivity.f8962g;
                    if (f0Var2 != null) {
                        f0Var = f0Var2;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("navHostController");
                    }
                    g9.p.e(f0Var, ((f70.c) hVar).f17480a);
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 2:
                al.c0 c0Var = (al.c0) this.f617b;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    sa0.a.f38953a.d(th2);
                    c0Var.a(false);
                } else {
                    ao.g3 g3Var = c0Var.f1524d;
                    v80.f0.B(g3Var.f4258b, null, null, new ao.h2(g3Var, objArr == true ? 1 : 0, c3 == true ? 1 : 0), 3);
                }
                return Unit.f26487a;
            case 3:
                return CredentialProviderBeginSignInController.handleResponse$lambda$9((CredentialProviderBeginSignInController) this.f617b, (GetCredentialException) obj);
            case 4:
                return CredentialProviderCreatePasswordController.handleResponse$lambda$9((CredentialProviderCreatePasswordController) this.f617b, (CreateCredentialException) obj);
            case 5:
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$13((CredentialProviderCreatePublicKeyCredentialController) this.f617b, (CreateCredentialException) obj);
            case 6:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$11((CredentialProviderGetSignInIntentController) this.f617b, (GetCredentialException) obj);
            case 7:
                return CreateDigitalCredentialController.handleResponse$lambda$2((CreateDigitalCredentialController) this.f617b, (CreateCredentialException) obj);
            case 8:
                return CreatePasswordCredentialController.handleResponse$lambda$7((CreatePasswordCredentialController) this.f617b, (CreateCredentialException) obj);
            case 9:
                return CreatePublicKeyCredentialController.handleResponse$lambda$15((CreatePublicKeyCredentialController) this.f617b, (CreateCredentialException) obj);
            case 10:
                ((b0.g2) this.f617b).f5203j = null;
                return Unit.f26487a;
            case 11:
                b0.e3 e3Var = (b0.e3) this.f617b;
                e0.n nVar = (e0.n) obj;
                nVar.getClass();
                e0.b0 b0Var = e3Var.f5147a;
                synchronized (b0Var.f15312c) {
                    if (b0Var.f15313d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    StringBuilder sb2 = new StringBuilder("CameraGraph-");
                    r80.b bVar = e0.r.f15399b;
                    bVar.getClass();
                    sb2.append(r80.b.f37780b.incrementAndGet(bVar));
                    bVarC = b0Var.c(nVar, new e0.r(sb2.toString()));
                }
                return bVarC;
            case 12:
                return DiscoverLocationView.a((DiscoverLocationView) this.f617b, (String) obj);
            case 13:
                GenericErrors.UnknownError unknownError = (GenericErrors.UnknownError) this.f617b;
                int i12 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                unknownError.getAction().invoke();
                return Unit.f26487a;
            case 14:
                GenericErrors.NoLocationSelected noLocationSelected = (GenericErrors.NoLocationSelected) this.f617b;
                int i13 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                noLocationSelected.getAction().invoke();
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                GenericErrors.NoRecipeFound noRecipeFound = (GenericErrors.NoRecipeFound) this.f617b;
                int i14 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                noRecipeFound.getAction().invoke();
                return Unit.f26487a;
            case 16:
                GenericErrors.NoResultsWithCurrentLocation noResultsWithCurrentLocation = (GenericErrors.NoResultsWithCurrentLocation) this.f617b;
                int i15 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                noResultsWithCurrentLocation.getAction().invoke();
                return Unit.f26487a;
            case 17:
                GenericErrors.LocationNotAvailable locationNotAvailable = (GenericErrors.LocationNotAvailable) this.f617b;
                int i16 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                locationNotAvailable.getAction().invoke();
                return Unit.f26487a;
            case 18:
                GenericErrors.NoCo2eSaved noCo2eSaved = (GenericErrors.NoCo2eSaved) this.f617b;
                int i17 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                noCo2eSaved.getAction().invoke();
                return Unit.f26487a;
            case 19:
                GenericErrors.NoOrders noOrders = (GenericErrors.NoOrders) this.f617b;
                int i18 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                noOrders.getAction().invoke();
                return Unit.f26487a;
            case 20:
                GenericErrors.SharedRecipeNotAvailable sharedRecipeNotAvailable = (GenericErrors.SharedRecipeNotAvailable) this.f617b;
                int i19 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                sharedRecipeNotAvailable.getAction().invoke();
                return Unit.f26487a;
            case 21:
                GenericErrors.NoResultWithDiscoverSearch noResultWithDiscoverSearch = (GenericErrors.NoResultWithDiscoverSearch) this.f617b;
                int i21 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                noResultWithDiscoverSearch.getAction().invoke();
                return Unit.f26487a;
            case 22:
                GenericErrors.NoResultWithDiscoverSearchAndFilters noResultWithDiscoverSearchAndFilters = (GenericErrors.NoResultWithDiscoverSearchAndFilters) this.f617b;
                int i22 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                noResultWithDiscoverSearchAndFilters.getAction().invoke();
                return Unit.f26487a;
            case 23:
                GenericErrors.NoRecipeSaved noRecipeSaved = (GenericErrors.NoRecipeSaved) this.f617b;
                int i23 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                noRecipeSaved.getAction().invoke();
                return Unit.f26487a;
            case 24:
                GenericErrors.NoResultWithFilterOn noResultWithFilterOn = (GenericErrors.NoResultWithFilterOn) this.f617b;
                int i24 = GenericErrorView.f8906b;
                ((View) obj).getClass();
                noResultWithFilterOn.getAction().invoke();
                return Unit.f26487a;
            case 25:
                se.b bVar2 = (se.b) this.f617b;
                al.h hVar2 = (al.h) obj;
                hVar2.getClass();
                int i25 = bh.c.$EnumSwitchMapping$0[hVar2.ordinal()];
                if (i25 == 1) {
                    ((xg.x) bVar2.f39010b).a(xg.b.f44259j);
                } else if (i25 == 2) {
                    ((xg.x) bVar2.f39010b).a(xg.d.f44261j);
                } else if (i25 == 3) {
                    ((xg.x) bVar2.f39010b).a(xg.c.f44260j);
                } else {
                    if (i25 != 4) {
                        e40.a.f();
                        return null;
                    }
                    ((xg.x) bVar2.f39010b).a(xg.a.f44257j);
                }
                return Unit.f26487a;
            case 26:
                bq.c cVar = (bq.c) this.f617b;
                st.a aVar = (st.a) obj;
                int i26 = bq.c.f6580i;
                aVar.getClass();
                cVar.f6585f = aVar;
                if (cVar.getStore() != null) {
                    cVar.d();
                }
                return Unit.f26487a;
            case 27:
                i80.o oVar = (i80.o) this.f617b;
                BasicItem basicItem = (BasicItem) obj;
                int i27 = bq.d.f6588c;
                basicItem.getClass();
                oVar.invoke(basicItem, null, null, f70.i.UNKNOWN);
                return Unit.f26487a;
            case 28:
                br.o oVar2 = (br.o) this.f617b;
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    oVar2.f6661g = false;
                    oVar2.f6659e.i(Boolean.FALSE);
                    oVar2.f6660f.i(th3 instanceof UnknownHostException ? new qt.a(GenericErrors.Offline.INSTANCE) : new qt.a(new GenericErrors.UnknownError(new bg.a(20))));
                    sa0.a.f38953a.d(th3);
                }
                return Unit.f26487a;
            default:
                HiddenStoresActivity hiddenStoresActivity = (HiddenStoresActivity) this.f617b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i28 = HiddenStoresActivity.f9412k;
                if (zBooleanValue) {
                    bg.k0 k0Var = new bg.k0(hiddenStoresActivity);
                    k0Var.a(R.string.hidden_stores_unlock_succes_message);
                    k0Var.c(R.string.hidden_stores_unlock_succes_btn);
                    k0Var.l = new bg.a(22);
                    k0Var.f6183o = new aa.e(hiddenStoresActivity, 19);
                    k0Var.f();
                } else {
                    hiddenStoresActivity.D();
                }
                return Unit.f26487a;
        }
    }
}
