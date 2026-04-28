package ah;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.app.tgtg.feature.authentication.ui.AuthenticationActivity;
import com.app.tgtg.feature.badges.ui.BadgesActivity;
import com.app.tgtg.feature.bucketlist.ui.BucketListActivity;
import com.app.tgtg.feature.charity.ui.MainCharityActivity;
import com.app.tgtg.feature.deeplink.DeepLinkActivity;
import com.app.tgtg.feature.flashsales.list.FlashSalesListActivity;
import com.app.tgtg.feature.helpdesk.HelpCenterActivity;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.login.SplashActivity;
import com.app.tgtg.feature.login.email.EmailAccessActivity;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import com.app.tgtg.feature.login.optin.OptInActivity;
import com.app.tgtg.feature.login.terms.TermsAccessActivity;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.feature.postpurchase.PostPurchaseActivity;
import com.app.tgtg.feature.recipegenerator.RecipeGeneratorActivity;
import com.app.tgtg.feature.survey.bringmagic.BringBackMagicActivity;
import com.app.tgtg.feature.survey.rewards.RewardsSurveyActivity;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.feature.tabprofile.legal.LegalActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.privacyaction.PrivacyActionActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.ManageAccountActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.SettingsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.AccountDetailsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import com.app.tgtg.feature.webview.ui.WebViewActivity;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends k.h implements r70.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p70.b f1477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1479e;

    public n(int i11) {
        this.f1476b = i11;
        switch (i11) {
            case 1:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((LoginActivity) this, 1));
                break;
            case 2:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((SplashActivity) this, 2));
                break;
            case 3:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((OrderListActivity) this, 4));
                break;
            case 4:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((MainCharityActivity) this, 6));
                break;
            case 5:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((LegalActivity) this, 7));
                break;
            case 6:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((FlashSalesListActivity) this, 8));
                break;
            case 7:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((BringBackMagicActivity) this, 9));
                break;
            case 8:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((WebViewActivity) this, 10));
                break;
            case 9:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((HelpCenterActivity) this, 11));
                break;
            case 10:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((RecipeGeneratorActivity) this, 13));
                break;
            case 11:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((EmailAccessActivity) this, 14));
                break;
            case 12:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((EmailCodeAccessActivity) this, 15));
                break;
            case 13:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((PrivacyActionActivity) this, 16));
                break;
            case 14:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((RewardsSurveyActivity) this, 19));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((TrackingConsentActivity) this, 20));
                break;
            case 16:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((MainActivity) this, 23));
                break;
            case 17:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((ManageAccountActivity) this, 25));
                break;
            case 18:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((SettingsActivity) this, 26));
                break;
            case 19:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((NotificationSettingsActivity) this, 27));
                break;
            case 20:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((BadgesActivity) this, 28));
                break;
            case 21:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((AccountDetailsActivity) this, 29));
                break;
            case 22:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new k.g((OptInActivity) this, 2));
                break;
            case 23:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new k.g((ManufacturerOrderActivity) this, 3));
                break;
            case 24:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new k.g((EditDataActivity) this, 4));
                break;
            case 25:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new k.g((BucketListActivity) this, 7));
                break;
            case 26:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new k.g((TermsAccessActivity) this, 8));
                break;
            case 27:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new k.g((DeepLinkActivity) this, 9));
                break;
            case 28:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new k.g((PostPurchaseActivity) this, 11));
                break;
            case 29:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new k.g((VoucherActivity) this, 12));
                break;
            default:
                this.f1478d = new Object();
                this.f1479e = false;
                addOnContextAvailableListener(new m((AuthenticationActivity) this, 0));
                break;
        }
    }

    private final p70.b A() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b B() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b C() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b D() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b E() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b F() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b G() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b H() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b I() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b J() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b K() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b L() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b M() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b N() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b O() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b P() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b Q() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b R() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b S() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b T() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b U() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b V() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b W() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b X() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b Y() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    private final p70.b Z() {
        if (this.f1477c == null) {
            synchronized (this.f1478d) {
                try {
                    if (this.f1477c == null) {
                        this.f1477c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f1477c;
    }

    @Override // r70.b
    public final Object a() {
        switch (this.f1476b) {
        }
        return z().a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        switch (this.f1476b) {
        }
        return zz.f.q(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        switch (this.f1476b) {
            case 0:
                super.onCreate(bundle);
                z().d();
                break;
            case 1:
                super.onCreate(bundle);
                z().d();
                break;
            case 2:
                super.onCreate(bundle);
                z().d();
                break;
            case 3:
                super.onCreate(bundle);
                z().d();
                break;
            case 4:
                super.onCreate(bundle);
                z().d();
                break;
            case 5:
                super.onCreate(bundle);
                z().d();
                break;
            case 6:
                super.onCreate(bundle);
                z().d();
                break;
            case 7:
                super.onCreate(bundle);
                z().d();
                break;
            case 8:
                super.onCreate(bundle);
                z().d();
                break;
            case 9:
                super.onCreate(bundle);
                z().d();
                break;
            case 10:
                super.onCreate(bundle);
                z().d();
                break;
            case 11:
                super.onCreate(bundle);
                z().d();
                break;
            case 12:
                super.onCreate(bundle);
                z().d();
                break;
            case 13:
                super.onCreate(bundle);
                z().d();
                break;
            case 14:
                super.onCreate(bundle);
                z().d();
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                super.onCreate(bundle);
                z().d();
                break;
            case 16:
                super.onCreate(bundle);
                z().d();
                break;
            case 17:
                super.onCreate(bundle);
                z().d();
                break;
            case 18:
                super.onCreate(bundle);
                z().d();
                break;
            case 19:
                super.onCreate(bundle);
                z().d();
                break;
            case 20:
                super.onCreate(bundle);
                z().d();
                break;
            case 21:
                super.onCreate(bundle);
                z().d();
                break;
            case 22:
                super.onCreate(bundle);
                z().d();
                break;
            case 23:
                super.onCreate(bundle);
                z().d();
                break;
            case 24:
                super.onCreate(bundle);
                z().d();
                break;
            case 25:
                super.onCreate(bundle);
                z().d();
                break;
            case 26:
                super.onCreate(bundle);
                z().d();
                break;
            case 27:
                super.onCreate(bundle);
                z().d();
                break;
            case 28:
                super.onCreate(bundle);
                z().d();
                break;
            default:
                super.onCreate(bundle);
                z().d();
                break;
        }
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public void onDestroy() {
        switch (this.f1476b) {
            case 0:
                super.onDestroy();
                z().b();
                break;
            case 1:
                super.onDestroy();
                z().b();
                break;
            case 2:
                super.onDestroy();
                z().b();
                break;
            case 3:
                super.onDestroy();
                z().b();
                break;
            case 4:
                super.onDestroy();
                z().b();
                break;
            case 5:
                super.onDestroy();
                z().b();
                break;
            case 6:
                super.onDestroy();
                z().b();
                break;
            case 7:
                super.onDestroy();
                z().b();
                break;
            case 8:
                super.onDestroy();
                z().b();
                break;
            case 9:
                super.onDestroy();
                z().b();
                break;
            case 10:
                super.onDestroy();
                z().b();
                break;
            case 11:
                super.onDestroy();
                z().b();
                break;
            case 12:
                super.onDestroy();
                z().b();
                break;
            case 13:
                super.onDestroy();
                z().b();
                break;
            case 14:
                super.onDestroy();
                z().b();
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                super.onDestroy();
                z().b();
                break;
            case 16:
                super.onDestroy();
                z().b();
                break;
            case 17:
                super.onDestroy();
                z().b();
                break;
            case 18:
                super.onDestroy();
                z().b();
                break;
            case 19:
                super.onDestroy();
                z().b();
                break;
            case 20:
                super.onDestroy();
                z().b();
                break;
            case 21:
                super.onDestroy();
                z().b();
                break;
            case 22:
                super.onDestroy();
                z().b();
                break;
            case 23:
                super.onDestroy();
                z().b();
                break;
            case 24:
                super.onDestroy();
                z().b();
                break;
            case 25:
                super.onDestroy();
                z().b();
                break;
            case 26:
                super.onDestroy();
                z().b();
                break;
            case 27:
                super.onDestroy();
                z().b();
                break;
            case 28:
                super.onDestroy();
                z().b();
                break;
            default:
                super.onDestroy();
                z().b();
                break;
        }
    }

    public final p70.b z() {
        switch (this.f1476b) {
            case 0:
                if (this.f1477c == null) {
                    synchronized (this.f1478d) {
                        try {
                            if (this.f1477c == null) {
                                this.f1477c = new p70.b(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f1477c;
            case 1:
                if (this.f1477c == null) {
                    synchronized (this.f1478d) {
                        try {
                            if (this.f1477c == null) {
                                this.f1477c = new p70.b(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f1477c;
            case 2:
                if (this.f1477c == null) {
                    synchronized (this.f1478d) {
                        try {
                            if (this.f1477c == null) {
                                this.f1477c = new p70.b(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f1477c;
            case 3:
                return A();
            case 4:
                return B();
            case 5:
                return C();
            case 6:
                return D();
            case 7:
                return E();
            case 8:
                return F();
            case 9:
                return G();
            case 10:
                return H();
            case 11:
                return I();
            case 12:
                return J();
            case 13:
                return K();
            case 14:
                return L();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return M();
            case 16:
                return N();
            case 17:
                return O();
            case 18:
                return P();
            case 19:
                return Q();
            case 20:
                return R();
            case 21:
                return S();
            case 22:
                return T();
            case 23:
                return U();
            case 24:
                return V();
            case 25:
                return W();
            case 26:
                return X();
            case 27:
                return Y();
            case 28:
                return Z();
            default:
                if (this.f1477c == null) {
                    synchronized (this.f1478d) {
                        try {
                            if (this.f1477c == null) {
                                this.f1477c = new p70.b(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f1477c;
        }
    }
}
