package com.app.tgtg.feature.tabprofile.manageaccount;

import a8.k;
import ah.n;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.n1;
import bg.k0;
import com.app.tgtg.R;
import com.app.tgtg.customview.MenuItemView;
import com.app.tgtg.feature.tabprofile.manageaccount.SettingsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.AccountDetailsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import e.b;
import e70.c;
import hr.l;
import jb.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o30.f0;
import pg.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class SettingsActivity extends n {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f9353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e0 f9357k;

    public SettingsActivity() {
        super(18);
        this.f9354h = new n1(Reflection.getOrCreateKotlinClass(hr.n.class), new l(this, 1), new l(this, 0), new l(this, 2));
        this.f9357k = new e0(this, 23);
    }

    public final hr.n a0() {
        return (hr.n) this.f9354h.getValue();
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i11 = d.A;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        d dVar = null;
        final int i12 = 0;
        d dVar2 = (d) k.Z(layoutInflater, R.layout.activity_settings, null, false, null);
        dVar2.getClass();
        this.f9353g = dVar2;
        setContentView(dVar2.f986f);
        f0.S(this, false);
        getOnBackPressedDispatcher().a(this.f9357k);
        d dVar3 = this.f9353g;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar3 = null;
        }
        ((TextView) dVar3.f34831y.f34795c).setText(R.string.me_menu_tab_title_settings);
        d dVar4 = this.f9353g;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar4 = null;
        }
        MenuItemView menuItemView = dVar4.f34829w;
        menuItemView.getClass();
        a0();
        menuItemView.setVisibility(!ft.c.C() ? 0 : 8);
        d dVar5 = this.f9353g;
        if (dVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar5 = null;
        }
        TextView textView = dVar5.f34832z;
        a0();
        textView.setText("26.4.1 (21117)");
        d dVar6 = this.f9353g;
        if (dVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar6 = null;
        }
        ((ImageButton) dVar6.f34831y.f34796d).setOnClickListener(new View.OnClickListener(this) { // from class: hr.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f22449b;

            {
                this.f22449b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                SettingsActivity settingsActivity = this.f22449b;
                switch (i13) {
                    case 0:
                        int i14 = SettingsActivity.l;
                        settingsActivity.getOnBackPressedDispatcher().d();
                        break;
                    default:
                        int i15 = SettingsActivity.l;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j9 = settingsActivity.f9355i;
                        if (j9 == 0 || jCurrentTimeMillis - j9 > 3000) {
                            settingsActivity.f9355i = jCurrentTimeMillis;
                            settingsActivity.f9356j = 1;
                        } else {
                            settingsActivity.f9356j++;
                        }
                        if (settingsActivity.f9356j == 7) {
                            settingsActivity.a0().f22459f.f46336a.a(yr.b.f46335a);
                        }
                        break;
                }
            }
        });
        MenuItemView menuItemView2 = dVar6.f34826t;
        menuItemView2.getClass();
        mv.d.x(menuItemView2, new Function1(this) { // from class: hr.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f22451b;

            {
                this.f22451b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z11;
                int i13 = i12;
                SettingsActivity settingsActivity = this.f22451b;
                switch (i13) {
                    case 0:
                        int i14 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 1:
                        int i15 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(PaymentOptionsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 2:
                        int i16 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(VoucherActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 3:
                        int i17 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(NotificationSettingsActivity.class, u.x(new Pair("OPEN_SYSTEM_SETTINGS", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020));
                        return Unit.f26487a;
                    case 4:
                        int i18 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(HiddenStoresActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 5:
                        int i19 = SettingsActivity.l;
                        ((View) obj).getClass();
                        k0 k0Var = new k0(settingsActivity);
                        k0Var.e(R.string.logout_alert_dialog_title);
                        k0Var.c(R.string.logout_alert_dialog_positive_btn_text);
                        k0Var.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                        k0Var.l = new hi.d(settingsActivity, 10);
                        k0Var.b(R.string.logout_alert_dialog_negative_btn_text);
                        k0Var.f();
                        return Unit.f26487a;
                    default:
                        f70.h hVar = (f70.h) obj;
                        int i21 = SettingsActivity.l;
                        hVar.getClass();
                        if (Intrinsics.areEqual(hVar, yr.b.f46335a)) {
                            new ng.d().show(settingsActivity.getSupportFragmentManager(), "ServerSelector");
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        });
        MenuItemView menuItemView3 = dVar6.f34828v;
        menuItemView3.getClass();
        final int i13 = 1;
        mv.d.x(menuItemView3, new Function1(this) { // from class: hr.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f22451b;

            {
                this.f22451b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z11;
                int i132 = i13;
                SettingsActivity settingsActivity = this.f22451b;
                switch (i132) {
                    case 0:
                        int i14 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 1:
                        int i15 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(PaymentOptionsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 2:
                        int i16 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(VoucherActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 3:
                        int i17 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(NotificationSettingsActivity.class, u.x(new Pair("OPEN_SYSTEM_SETTINGS", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020));
                        return Unit.f26487a;
                    case 4:
                        int i18 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(HiddenStoresActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 5:
                        int i19 = SettingsActivity.l;
                        ((View) obj).getClass();
                        k0 k0Var = new k0(settingsActivity);
                        k0Var.e(R.string.logout_alert_dialog_title);
                        k0Var.c(R.string.logout_alert_dialog_positive_btn_text);
                        k0Var.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                        k0Var.l = new hi.d(settingsActivity, 10);
                        k0Var.b(R.string.logout_alert_dialog_negative_btn_text);
                        k0Var.f();
                        return Unit.f26487a;
                    default:
                        f70.h hVar = (f70.h) obj;
                        int i21 = SettingsActivity.l;
                        hVar.getClass();
                        if (Intrinsics.areEqual(hVar, yr.b.f46335a)) {
                            new ng.d().show(settingsActivity.getSupportFragmentManager(), "ServerSelector");
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        });
        MenuItemView menuItemView4 = dVar6.f34830x;
        menuItemView4.getClass();
        final int i14 = 2;
        mv.d.x(menuItemView4, new Function1(this) { // from class: hr.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f22451b;

            {
                this.f22451b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z11;
                int i132 = i14;
                SettingsActivity settingsActivity = this.f22451b;
                switch (i132) {
                    case 0:
                        int i142 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 1:
                        int i15 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(PaymentOptionsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 2:
                        int i16 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(VoucherActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 3:
                        int i17 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(NotificationSettingsActivity.class, u.x(new Pair("OPEN_SYSTEM_SETTINGS", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020));
                        return Unit.f26487a;
                    case 4:
                        int i18 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(HiddenStoresActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 5:
                        int i19 = SettingsActivity.l;
                        ((View) obj).getClass();
                        k0 k0Var = new k0(settingsActivity);
                        k0Var.e(R.string.logout_alert_dialog_title);
                        k0Var.c(R.string.logout_alert_dialog_positive_btn_text);
                        k0Var.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                        k0Var.l = new hi.d(settingsActivity, 10);
                        k0Var.b(R.string.logout_alert_dialog_negative_btn_text);
                        k0Var.f();
                        return Unit.f26487a;
                    default:
                        f70.h hVar = (f70.h) obj;
                        int i21 = SettingsActivity.l;
                        hVar.getClass();
                        if (Intrinsics.areEqual(hVar, yr.b.f46335a)) {
                            new ng.d().show(settingsActivity.getSupportFragmentManager(), "ServerSelector");
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        });
        MenuItemView menuItemView5 = dVar6.f34827u;
        menuItemView5.getClass();
        final int i15 = 3;
        mv.d.x(menuItemView5, new Function1(this) { // from class: hr.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f22451b;

            {
                this.f22451b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z11;
                int i132 = i15;
                SettingsActivity settingsActivity = this.f22451b;
                switch (i132) {
                    case 0:
                        int i142 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 1:
                        int i152 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(PaymentOptionsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 2:
                        int i16 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(VoucherActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 3:
                        int i17 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(NotificationSettingsActivity.class, u.x(new Pair("OPEN_SYSTEM_SETTINGS", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020));
                        return Unit.f26487a;
                    case 4:
                        int i18 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(HiddenStoresActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 5:
                        int i19 = SettingsActivity.l;
                        ((View) obj).getClass();
                        k0 k0Var = new k0(settingsActivity);
                        k0Var.e(R.string.logout_alert_dialog_title);
                        k0Var.c(R.string.logout_alert_dialog_positive_btn_text);
                        k0Var.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                        k0Var.l = new hi.d(settingsActivity, 10);
                        k0Var.b(R.string.logout_alert_dialog_negative_btn_text);
                        k0Var.f();
                        return Unit.f26487a;
                    default:
                        f70.h hVar = (f70.h) obj;
                        int i21 = SettingsActivity.l;
                        hVar.getClass();
                        if (Intrinsics.areEqual(hVar, yr.b.f46335a)) {
                            new ng.d().show(settingsActivity.getSupportFragmentManager(), "ServerSelector");
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        });
        MenuItemView menuItemView6 = dVar6.f34829w;
        menuItemView6.getClass();
        final int i16 = 4;
        mv.d.x(menuItemView6, new Function1(this) { // from class: hr.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f22451b;

            {
                this.f22451b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z11;
                int i132 = i16;
                SettingsActivity settingsActivity = this.f22451b;
                switch (i132) {
                    case 0:
                        int i142 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 1:
                        int i152 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(PaymentOptionsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 2:
                        int i162 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(VoucherActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 3:
                        int i17 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(NotificationSettingsActivity.class, u.x(new Pair("OPEN_SYSTEM_SETTINGS", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020));
                        return Unit.f26487a;
                    case 4:
                        int i18 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(HiddenStoresActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 5:
                        int i19 = SettingsActivity.l;
                        ((View) obj).getClass();
                        k0 k0Var = new k0(settingsActivity);
                        k0Var.e(R.string.logout_alert_dialog_title);
                        k0Var.c(R.string.logout_alert_dialog_positive_btn_text);
                        k0Var.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                        k0Var.l = new hi.d(settingsActivity, 10);
                        k0Var.b(R.string.logout_alert_dialog_negative_btn_text);
                        k0Var.f();
                        return Unit.f26487a;
                    default:
                        f70.h hVar = (f70.h) obj;
                        int i21 = SettingsActivity.l;
                        hVar.getClass();
                        if (Intrinsics.areEqual(hVar, yr.b.f46335a)) {
                            new ng.d().show(settingsActivity.getSupportFragmentManager(), "ServerSelector");
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        });
        MenuItemView menuItemView7 = dVar6.f34825s;
        menuItemView7.getClass();
        final int i17 = 5;
        mv.d.x(menuItemView7, new Function1(this) { // from class: hr.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f22451b;

            {
                this.f22451b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z11;
                int i132 = i17;
                SettingsActivity settingsActivity = this.f22451b;
                switch (i132) {
                    case 0:
                        int i142 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 1:
                        int i152 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(PaymentOptionsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 2:
                        int i162 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(VoucherActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 3:
                        int i172 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(NotificationSettingsActivity.class, u.x(new Pair("OPEN_SYSTEM_SETTINGS", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020));
                        return Unit.f26487a;
                    case 4:
                        int i18 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(HiddenStoresActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 5:
                        int i19 = SettingsActivity.l;
                        ((View) obj).getClass();
                        k0 k0Var = new k0(settingsActivity);
                        k0Var.e(R.string.logout_alert_dialog_title);
                        k0Var.c(R.string.logout_alert_dialog_positive_btn_text);
                        k0Var.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                        k0Var.l = new hi.d(settingsActivity, 10);
                        k0Var.b(R.string.logout_alert_dialog_negative_btn_text);
                        k0Var.f();
                        return Unit.f26487a;
                    default:
                        f70.h hVar = (f70.h) obj;
                        int i21 = SettingsActivity.l;
                        hVar.getClass();
                        if (Intrinsics.areEqual(hVar, yr.b.f46335a)) {
                            new ng.d().show(settingsActivity.getSupportFragmentManager(), "ServerSelector");
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        });
        d dVar7 = this.f9353g;
        if (dVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar7 = null;
        }
        dVar7.f34832z.setOnClickListener(new View.OnClickListener(this) { // from class: hr.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f22449b;

            {
                this.f22449b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i13;
                SettingsActivity settingsActivity = this.f22449b;
                switch (i132) {
                    case 0:
                        int i142 = SettingsActivity.l;
                        settingsActivity.getOnBackPressedDispatcher().d();
                        break;
                    default:
                        int i152 = SettingsActivity.l;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j9 = settingsActivity.f9355i;
                        if (j9 == 0 || jCurrentTimeMillis - j9 > 3000) {
                            settingsActivity.f9355i = jCurrentTimeMillis;
                            settingsActivity.f9356j = 1;
                        } else {
                            settingsActivity.f9356j++;
                        }
                        if (settingsActivity.f9356j == 7) {
                            settingsActivity.a0().f22459f.f46336a.a(yr.b.f46335a);
                        }
                        break;
                }
            }
        });
        c cVar = this.f9352f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        final int i18 = 6;
        c.b(cVar, this, new Function1(this) { // from class: hr.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f22451b;

            {
                this.f22451b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z11;
                int i132 = i18;
                SettingsActivity settingsActivity = this.f22451b;
                switch (i132) {
                    case 0:
                        int i142 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 1:
                        int i152 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(PaymentOptionsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 2:
                        int i162 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(VoucherActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 3:
                        int i172 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(NotificationSettingsActivity.class, u.x(new Pair("OPEN_SYSTEM_SETTINGS", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020));
                        return Unit.f26487a;
                    case 4:
                        int i182 = SettingsActivity.l;
                        ((View) obj).getClass();
                        settingsActivity.a0().f22459f.f46336a.a(new f70.b(HiddenStoresActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        return Unit.f26487a;
                    case 5:
                        int i19 = SettingsActivity.l;
                        ((View) obj).getClass();
                        k0 k0Var = new k0(settingsActivity);
                        k0Var.e(R.string.logout_alert_dialog_title);
                        k0Var.c(R.string.logout_alert_dialog_positive_btn_text);
                        k0Var.f6176g = Integer.valueOf(R.drawable.button_primary_warning_bg_states);
                        k0Var.l = new hi.d(settingsActivity, 10);
                        k0Var.b(R.string.logout_alert_dialog_negative_btn_text);
                        k0Var.f();
                        return Unit.f26487a;
                    default:
                        f70.h hVar = (f70.h) obj;
                        int i21 = SettingsActivity.l;
                        hVar.getClass();
                        if (Intrinsics.areEqual(hVar, yr.b.f46335a)) {
                            new ng.d().show(settingsActivity.getSupportFragmentManager(), "ServerSelector");
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }, 2);
        d dVar8 = this.f9353g;
        if (dVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dVar = dVar8;
        }
        ViewCompat.k0(dVar.f986f, new b(this, 14));
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        this.f9357k.remove();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        d dVar = this.f9353g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar = null;
        }
        dVar.f34828v.setExpiredPaymentBreadcrumb(a0().f22454a.n().getHasExpiredPaymentMethods());
    }
}
