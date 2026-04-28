package qs;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.app.tgtg.feature.locationpicker.LocationPickerActivity;
import com.app.tgtg.feature.logincharity.ui.LoginCharityActivity;
import com.app.tgtg.feature.storeview.ui.StoreViewActivity;
import com.app.tgtg.feature.tabprofile.c2creferral.ui.InviteFriendsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherExperienceActivity;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends k.h implements r70.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p70.b f37247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f37248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37249e;

    public a(int i11) {
        this.f37246b = i11;
        switch (i11) {
            case 1:
                this.f37248d = new Object();
                this.f37249e = false;
                addOnContextAvailableListener(new k.g((InviteFriendsActivity) this, 14));
                break;
            case 2:
                this.f37248d = new Object();
                this.f37249e = false;
                addOnContextAvailableListener(new k.g((ContactUsActivity) this, 16));
                break;
            case 3:
                this.f37248d = new Object();
                this.f37249e = false;
                addOnContextAvailableListener(new k.g((LocationPickerActivity) this, 19));
                break;
            case 4:
                this.f37248d = new Object();
                this.f37249e = false;
                addOnContextAvailableListener(new k.g((LoginCharityActivity) this, 22));
                break;
            case 5:
                this.f37248d = new Object();
                this.f37249e = false;
                addOnContextAvailableListener(new k.g((StoreViewActivity) this, 24));
                break;
            default:
                this.f37248d = new Object();
                this.f37249e = false;
                addOnContextAvailableListener(new k.g((VoucherExperienceActivity) this, 13));
                break;
        }
    }

    private final p70.b A() {
        if (this.f37247c == null) {
            synchronized (this.f37248d) {
                try {
                    if (this.f37247c == null) {
                        this.f37247c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f37247c;
    }

    private final p70.b B() {
        if (this.f37247c == null) {
            synchronized (this.f37248d) {
                try {
                    if (this.f37247c == null) {
                        this.f37247c = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f37247c;
    }

    @Override // r70.b
    public final Object a() {
        switch (this.f37246b) {
        }
        return z().a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        switch (this.f37246b) {
        }
        return zz.f.q(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        switch (this.f37246b) {
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
            default:
                super.onCreate(bundle);
                z().d();
                break;
        }
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public void onDestroy() {
        switch (this.f37246b) {
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
            default:
                super.onDestroy();
                z().b();
                break;
        }
    }

    public final p70.b z() {
        switch (this.f37246b) {
            case 0:
                if (this.f37247c == null) {
                    synchronized (this.f37248d) {
                        try {
                            if (this.f37247c == null) {
                                this.f37247c = new p70.b(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f37247c;
            case 1:
                if (this.f37247c == null) {
                    synchronized (this.f37248d) {
                        try {
                            if (this.f37247c == null) {
                                this.f37247c = new p70.b(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f37247c;
            case 2:
                if (this.f37247c == null) {
                    synchronized (this.f37248d) {
                        try {
                            if (this.f37247c == null) {
                                this.f37247c = new p70.b(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f37247c;
            case 3:
                return A();
            case 4:
                return B();
            default:
                if (this.f37247c == null) {
                    synchronized (this.f37248d) {
                        try {
                            if (this.f37247c == null) {
                                this.f37247c = new p70.b(this);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f37247c;
        }
    }
}
