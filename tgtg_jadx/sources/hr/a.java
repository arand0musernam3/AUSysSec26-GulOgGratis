package hr;

import a3.z1;
import android.content.Context;
import android.widget.Toast;
import androidx.lifecycle.m1;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.c2creferral.ui.InviteFriendsActivity;
import com.app.tgtg.feature.tabprofile.legal.LegalActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.ManageAccountActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.AccountDetailsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherExperienceActivity;
import g9.c0;
import h2.a0;
import jb.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import mv.r0;
import org.bouncycastle.iana.AEADAlgorithm;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageAccountActivity f22420b;

    public /* synthetic */ a(ManageAccountActivity manageAccountActivity, int i11) {
        this.f22419a = i11;
        this.f22420b = manageAccountActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strA;
        int i11 = this.f22419a;
        ManageAccountActivity manageAccountActivity = this.f22420b;
        x70.c cVar = null;
        switch (i11) {
            case 0:
                String str = (String) obj;
                int i12 = ManageAccountActivity.f9348i;
                str.getClass();
                i iVarA0 = manageAccountActivity.a0();
                f0.B(m1.d(iVarA0), null, null, new al.n(iVarA0, str, cVar, 19), 3);
                break;
            case 1:
                c0 c0Var = (c0) obj;
                int i13 = ManageAccountActivity.f9348i;
                c0Var.getClass();
                zz.f.m(c0Var, "screen_list", new u3.d(new z1(manageAccountActivity, 5), true, 581607837));
                break;
            case 2:
                int i14 = ManageAccountActivity.f9348i;
                i iVarA02 = manageAccountActivity.a0();
                f0.B(m1.d(iVarA02), null, null, new g(iVarA02, null, 0), 3);
                break;
            default:
                f fVar = (f) obj;
                int i15 = ManageAccountActivity.f9348i;
                fVar.getClass();
                int i16 = c.$EnumSwitchMapping$0[fVar.ordinal()];
                ManageAccountActivity manageAccountActivity2 = this.f22420b;
                switch (i16) {
                    case 1:
                        manageAccountActivity2.a0().f22437i.f46334a.a(new f70.b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        break;
                    case 2:
                        manageAccountActivity2.a0().f22437i.f46334a.a(new f70.b(PaymentOptionsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        break;
                    case 3:
                        manageAccountActivity2.a0().f22437i.f46334a.a(new f70.b(VoucherActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        break;
                    case 4:
                        manageAccountActivity2.a0().f22437i.f46334a.a(new f70.b(VoucherExperienceActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        break;
                    case 5:
                        manageAccountActivity2.a0().f22437i.f46334a.a(new f70.b(SpecialRewardsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        break;
                    case 6:
                        manageAccountActivity2.a0().f22437i.f46334a.a(new f70.b(NotificationSettingsActivity.class, u.x(new Pair("OPEN_SYSTEM_SETTINGS", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020));
                        break;
                    case 7:
                        Context applicationContext = manageAccountActivity2.getApplicationContext();
                        applicationContext.getClass();
                        if (!r0.u(applicationContext)) {
                            Toast.makeText(manageAccountActivity2.getApplicationContext(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
                        } else {
                            i iVarA03 = manageAccountActivity2.a0();
                            cv.i iVar = cv.i.ACTION_INVITE_FRIENDS;
                            dv.a aVar = dv.a.SOURCE;
                            dv.d dVar = dv.d.MANAGE_ACCOUNT;
                            strA = dVar != null ? dVar.a() : null;
                            iVar.getClass();
                            aVar.getClass();
                            iVarA03.f22430b.d(iVar, aVar, strA);
                            manageAccountActivity2.a0().f22437i.f46334a.a(new f70.b(InviteFriendsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        }
                        break;
                    case 8:
                        i.b(manageAccountActivity2.a0(), 1);
                        break;
                    case 9:
                        i.b(manageAccountActivity2.a0(), 2);
                        break;
                    case 10:
                        ft.c.J(!ft.c.C());
                        manageAccountActivity2.setResult(-1);
                        manageAccountActivity2.finish();
                        break;
                    case 11:
                        manageAccountActivity2.a0().a(ek.b.GO_TO_ORDER_HELP);
                        break;
                    case 12:
                        manageAccountActivity2.a0().a(ek.b.GO_TO_HOW_TGTG_WORKS);
                        break;
                    case 13:
                        manageAccountActivity2.a0().a(ek.b.GO_TO_JOIN_TGTG);
                        break;
                    case 14:
                        manageAccountActivity2.a0().f22437i.f46334a.a(new f70.b(HiddenStoresActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                        break;
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        i iVarA04 = manageAccountActivity2.a0();
                        cv.i iVar2 = cv.i.ACTION_GOTO_BLOG;
                        dv.a aVar2 = dv.a.SOURCE;
                        dv.d dVar2 = dv.d.MANAGE_ACCOUNT;
                        strA = dVar2 != null ? dVar2.a() : null;
                        iVar2.getClass();
                        aVar2.getClass();
                        iVarA04.f22430b.d(iVar2, aVar2, strA);
                        i iVarA05 = manageAccountActivity2.a0();
                        String blogUrl = manageAccountActivity2.a0().f22429a.n().getBlogUrl();
                        ct.a aVar3 = ct.a.BLOG;
                        Integer numValueOf = Integer.valueOf(R.string.webview_blog_title);
                        aVar3.getClass();
                        at.c0.c(iVarA05.f22438j, blogUrl, aVar3, numValueOf, false, 24);
                        break;
                    case 16:
                        manageAccountActivity2.a0().f22437i.f46334a.a(new f70.b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                        break;
                    case 17:
                        i iVarA06 = manageAccountActivity2.a0();
                        b bVar = new b(manageAccountActivity2, 2);
                        String email = iVarA06.f22429a.m().getEmail();
                        if (email == null || StringsKt.H(email)) {
                            f0.B(m1.d(iVarA06), null, null, new g(iVarA06, null, 1), 3);
                        } else {
                            f0.B(m1.d(iVarA06), null, null, new a0(iVarA06, manageAccountActivity2, bVar, null, 6), 3);
                        }
                        break;
                    default:
                        e40.a.f();
                        break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
