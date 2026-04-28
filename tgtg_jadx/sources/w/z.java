package w;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.s1;
import com.adyen.checkout.blik.internal.ui.view.BlikView;
import com.adyen.checkout.card.internal.ui.view.StoredCardView;
import com.adyen.checkout.components.core.ComponentAvailableCallback;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.googlepay.internal.ui.DefaultGooglePayDelegate;
import com.adyen.checkout.googlepay.internal.ui.GooglePayFragment;
import com.adyen.checkout.mbway.internal.ui.view.MbWayView;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import com.app.tgtg.R;
import com.app.tgtg.feature.flashsales.list.FlashSalesListActivity;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.login.SplashActivity;
import com.app.tgtg.feature.tabprofile.legal.LegalActivity;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h7.h2;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements e6.j, d10.b, d10.e, s1, m0.i0, AdyenTextInputEditText.Listener, ComponentAvailableCallback, ActivityResultCallback, OnCompleteListener, ez.a, vz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42799b;

    public /* synthetic */ z(Object obj, int i11) {
        this.f42798a = i11;
        this.f42799b = obj;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void a(Object obj) {
        x6.d dVarE;
        int i11 = this.f42798a;
        Object obj2 = this.f42799b;
        switch (i11) {
            case 18:
                GooglePayFragment.googlePayLauncher$lambda$0((GooglePayFragment) obj2, (g10.a) obj);
                break;
            case 24:
                LegalActivity legalActivity = (LegalActivity) obj2;
                h.a aVar = (h.a) obj;
                int i12 = LegalActivity.f9324k;
                aVar.getClass();
                if (aVar.f20935a == 1338) {
                    ax.h hVar = new ax.h(legalActivity);
                    String string = ((View) hVar.f4914e).getResources().getString(R.string.privacy_request_data_snackbar_success);
                    string.getClass();
                    hVar.f4910a = string;
                    WindowInsetsCompat windowInsetsCompatY = ViewCompat.y(legalActivity.getWindow().getDecorView());
                    hVar.f4912c = (windowInsetsCompatY == null || (dVarE = windowInsetsCompatY.e(h2.h())) == null) ? 0 : dVarE.f43876d;
                    hVar.c();
                }
                break;
            default:
                ((b4.x) obj2).invoke((h.a) obj);
                break;
        }
    }

    @Override // vz.a
    public void accept(Object obj, Object obj2) {
        FlashSalesListActivity flashSalesListActivity = (FlashSalesListActivity) this.f42799b;
        mq.a aVar = (mq.a) obj;
        int i11 = FlashSalesListActivity.f8995p;
        aVar.getClass();
        ((lq.j) obj2).getClass();
        lq.j jVar = flashSalesListActivity.f9001k;
        if (aVar instanceof FlashSalesItem) {
            dk.f fVar = (dk.f) flashSalesListActivity.f8998h.getValue();
            String strMo340getItemIdFvU5WIY = ((FlashSalesItem) aVar).getInformation().mo340getItemIdFvU5WIY();
            String str = jVar.f28129c;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fillerType");
                str = null;
            }
            strMo340getItemIdFvU5WIY.getClass();
            str.getClass();
            ck.a aVar2 = fVar.f14960e;
            aVar2.getClass();
            f70.g gVar = aVar2.f8438a;
            mk.c cVar = new mk.c(strMo340getItemIdFvU5WIY, ItemViewActivity.class);
            cVar.f29984g = str;
            gVar.a(cVar.a());
        }
    }

    @Override // ez.a
    public Object e() {
        switch (this.f42798a) {
            case 27:
                dz.g gVar = (dz.g) ((cz.j) this.f42799b).f13635e;
                SQLiteDatabase sQLiteDatabaseA = gVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar.f15256b.c()).execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                    return null;
                } catch (Throwable th2) {
                    sQLiteDatabaseA.endTransaction();
                    throw th2;
                }
            default:
                com.google.firebase.messaging.a0 a0Var = (com.google.firebase.messaging.a0) this.f42799b;
                Iterator it = ((Iterable) ((dz.g) a0Var.f12780c).g(new c50.w(21))).iterator();
                while (it.hasNext()) {
                    ((a8.h) a0Var.f12781d).z((wy.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // d10.b
    public Object g(Task task) {
        switch (this.f42798a) {
            case 1:
                ((CountDownLatch) this.f42799b).countDown();
                return null;
            case 13:
                return (Task) ((a40.m) this.f42799b).call();
            default:
                ((Runnable) this.f42799b).run();
                return Tasks.d(null);
        }
    }

    @Override // androidx.fragment.app.s1
    public void h(Bundle bundle) {
        SplashActivity splashActivity = (SplashActivity) this.f42799b;
        int i11 = SplashActivity.l;
        splashActivity.getSupportFragmentManager().e();
        if (bundle.getBoolean("accepted", false)) {
            splashActivity.c0();
        }
    }

    @Override // m0.i0
    public void j() {
        ((v80.q) this.f42799b).R(Unit.f26487a);
    }

    @Override // e6.j
    public Object o(e6.i iVar) {
        ((v80.s1) this.f42799b).J(new sg.c(iVar, 19));
        return "Job.asListenableFuture";
    }

    @Override // com.adyen.checkout.components.core.ComponentAvailableCallback
    public void onAvailabilityResult(boolean z11, PaymentMethod paymentMethod) {
        DefaultGooglePayDelegate.checkAvailability$lambda$1((DefaultGooglePayDelegate) this.f42799b, z11, paymentMethod);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f42798a) {
            case 21:
                com.google.firebase.messaging.l0.c((Intent) this.f42799b);
                break;
            case 22:
                ((com.google.firebase.messaging.n0) this.f42799b).f12853b.d(null);
                break;
            default:
                ((ScheduledFuture) this.f42799b).cancel(false);
                break;
        }
    }

    @Override // d10.e
    public void onSuccess(Object obj) {
        int i11 = this.f42798a;
        Object obj2 = this.f42799b;
        switch (i11) {
            case 2:
                int i12 = SplashActivity.l;
                ((al.r) obj2).invoke(obj);
                break;
            case 3:
            case 4:
            default:
                ((androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.a) obj2).invoke(obj);
                break;
            case 5:
                ((androidx.credentials.playservices.b) obj2).invoke(obj);
                break;
            case 6:
                ((androidx.credentials.playservices.d) obj2).invoke(obj);
                break;
            case 7:
                ((androidx.credentials.playservices.i) obj2).invoke(obj);
                break;
            case 8:
                ((androidx.credentials.playservices.controllers.identityauth.beginsignin.a) obj2).invoke(obj);
                break;
            case 9:
                ((androidx.credentials.playservices.controllers.identityauth.getsigninintent.c) obj2).invoke(obj);
                break;
            case 10:
                ((androidx.credentials.playservices.controllers.identitycredentials.getcredential.a) obj2).invoke(obj);
                break;
        }
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText.Listener
    public void onTextChanged(Editable editable) {
        switch (this.f42798a) {
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                BlikView.initBlikCodeInput$lambda$1((BlikView) this.f42799b, editable);
                break;
            case 16:
                StoredCardView.initSecurityCodeInput$lambda$1((StoredCardView) this.f42799b, editable);
                break;
            default:
                MbWayView.initMobileNumberInput$lambda$1((MbWayView) this.f42799b, editable);
                break;
        }
    }
}
