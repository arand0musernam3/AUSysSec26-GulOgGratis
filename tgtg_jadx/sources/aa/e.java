package aa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Vibrator;
import android.widget.EditText;
import androidx.activity.OnBackPressedDispatcher;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.f1;
import androidx.lifecycle.m1;
import androidx.lifecycle.s1;
import androidx.lifecycle.viewmodel.CreationExtras;
import b0.c3;
import b0.r0;
import c50.l1;
import cj.s0;
import com.app.tgtg.MainApplication;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.customview.SearchAndFilterView;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.logincharity.ui.LoginCharityActivity;
import com.app.tgtg.feature.main.ui.BottomNavigation;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.model.local.AppConstants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.outgoing.AttributionData;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.contentcards.ContentCardsFragment;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import java.math.BigInteger;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONException;
import pg.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1082b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f1081a = i11;
        this.f1082b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f1081a;
        jt.a aVar = null;
        x0 x0Var = null;
        Object obj = this.f1082b;
        switch (i11) {
            case 0:
                return ((ub.a) obj).h(":memory:");
            case 1:
                w wVar = (w) obj;
                return wVar.f1169a.h(wVar.f1170b);
            case 2:
                ab.l lVar = (ab.l) obj;
                return BigInteger.valueOf(lVar.f1215a).shiftLeft(32).or(BigInteger.valueOf(lVar.f1216b)).shiftLeft(32).or(BigInteger.valueOf(lVar.f1217c));
            case 3:
                jt.a aVar2 = ((MainApplication) obj).f8876e;
                if (aVar2 != null) {
                    aVar = aVar2;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("appApi");
                }
                return ((jt.f) aVar).b(jt.c.PUBLIC);
            case 4:
                f70.b bVar = LoginActivity.f9032j;
                ((LoginActivity) obj).a0().f1575n.f16080a.a(new f70.b(LoginCharityActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                return Unit.f26487a;
            case 5:
                return new androidx.activity.b0((OnBackPressedDispatcher) obj);
            case 6:
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$2$lambda$1((CredentialProviderBeginSignInController) obj);
            case 7:
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$lambda$1((CredentialProviderCreatePasswordController) obj);
            case 8:
                return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$6$lambda$5((CredentialProviderCreatePublicKeyCredentialController) obj);
            case 9:
                return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$4$lambda$3((CredentialProviderGetSignInIntentController) obj);
            case 10:
                return CreateDigitalCredentialController.handleResponse$lambda$4((CreateDigitalCredentialController) obj);
            case 11:
                ((androidx.lifecycle.g) obj).f3445m = null;
                return Unit.f26487a;
            case 12:
                return f1.c((s1) obj);
            case 13:
                return (c3) ((r0) obj).f5387h.get();
            case 14:
                GenericErrorView genericErrorView = (GenericErrorView) obj;
                int i12 = GenericErrorView.f8906b;
                genericErrorView.getClass();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", genericErrorView.getContext().getPackageName(), null));
                Context contextD = p70.g.d(genericErrorView.getContext());
                contextD.getClass();
                ((Activity) contextD).startActivityForResult(intent, AppConstants.GO_TO_GPS_SETTINGS);
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Function0 function0 = ((SearchAndFilterView) obj).f8918g;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f26487a;
            case 16:
                ((xg.x) ((se.b) obj).f39010b).a(xg.e.f44262j);
                return Unit.f26487a;
            case 17:
                int i13 = BottomNavigation.f9155i;
                s1 s1VarB = m1.b((BottomNavigation) obj);
                s1VarB.getClass();
                ViewModelStore viewModelStore = s1VarB.getViewModelStore();
                boolean z11 = s1VarB instanceof androidx.lifecycle.p;
                ViewModelProvider$Factory defaultViewModelProviderFactory = z11 ? ((androidx.lifecycle.p) s1VarB).getDefaultViewModelProviderFactory() : a9.b.f1000a;
                CreationExtras defaultViewModelCreationExtras = z11 ? ((androidx.lifecycle.p) s1VarB).getDefaultViewModelCreationExtras() : y8.a.f45423b;
                viewModelStore.getClass();
                defaultViewModelProviderFactory.getClass();
                defaultViewModelCreationExtras.getClass();
                com.google.firebase.messaging.a0 a0Var = new com.google.firebase.messaging.a0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(hm.v.class);
                orCreateKotlinClass.getClass();
                String qualifiedName = orCreateKotlinClass.getQualifiedName();
                if (qualifiedName != null) {
                    return (hm.v) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
                }
                i4.a.f("Local and anonymous classes can not be ViewModels");
                return null;
            case 18:
                ((Function0) ((br.i) obj).f6630d).invoke();
                return Unit.f26487a;
            case 19:
                HiddenStoresActivity hiddenStoresActivity = (HiddenStoresActivity) obj;
                x0 x0Var2 = hiddenStoresActivity.f9416e;
                if (x0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x0Var2 = null;
                }
                ((TGTGLoadingView) x0Var2.f35269j).setVisibility(0);
                x0 x0Var3 = hiddenStoresActivity.f9416e;
                if (x0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    x0Var = x0Var3;
                }
                ((EditText) x0Var.f35266g).getText().clear();
                hiddenStoresActivity.A().a();
                return Unit.f26487a;
            case 20:
                ((l1) obj).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
                String string = uuidRandomUUID.toString();
                string.getClass();
                return string;
            case 21:
                ((Vibrator) obj).cancel();
                return Unit.f26487a;
            case 22:
                Function0 function02 = ((cg.p) obj).f8048f;
                if (function02 != null) {
                    function02.invoke();
                }
                return Unit.f26487a;
            case 23:
                Function0 function03 = ((cg.a) obj).f7918c;
                if (function03 != null) {
                    function03.invoke();
                }
                return Unit.f26487a;
            case 24:
                return ((s0) obj).k();
            case 25:
                return BrazeDeeplinkHandler.Companion.setBrazeDeeplinkHandler$lambda$0((IBrazeDeeplinkHandler) obj);
            case 26:
                return BrazeWebViewClient.appendBridgeJavascript$lambda$3((BrazeWebViewClient) obj);
            case 27:
                return ContentCardsFragment.contentCardsUpdate$lambda$10((ContentCardsUpdatedEvent) obj);
            case 28:
                return DefaultInAppMessageViewWrapper.closeInAppMessageView$lambda$25((DefaultInAppMessageViewWrapper) obj);
            default:
                return AttributionData.forJsonPut$lambda$0((JSONException) obj);
        }
    }
}
