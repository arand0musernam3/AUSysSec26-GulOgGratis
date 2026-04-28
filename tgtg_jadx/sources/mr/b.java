package mr;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.lifecycle.m1;
import ao.g3;
import bg.k0;
import bg.w0;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.AccountDetailsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.user.requests.CollectionTime;
import com.app.tgtg.model.remote.user.requests.DietaryPreferences;
import com.app.tgtg.model.remote.user.requests.UserGender;
import com.app.tgtg.model.remote.user.response.EmailStatusResponse;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import mv.m0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.b1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditDataActivity f30078b;

    public /* synthetic */ b(EditDataActivity editDataActivity, int i11) {
        this.f30077a = i11;
        this.f30078b = editDataActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r9v1 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f30077a;
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        pg.p pVar = 0;
        pg.p pVar2 = null;
        pg.p pVar3 = null;
        pg.p pVar4 = null;
        pg.p pVar5 = null;
        pg.p pVar6 = null;
        pg.p pVar7 = null;
        pg.p pVar8 = null;
        pg.p pVar9 = null;
        pg.p pVar10 = null;
        pg.p pVar11 = null;
        pg.p pVar12 = null;
        EditDataActivity editDataActivity = this.f30078b;
        switch (i11) {
            case 0:
                String str = (String) obj;
                pg.p pVar13 = editDataActivity.f9361g;
                if (pVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pVar = pVar13;
                }
                ((ImageButton) ((b1) pVar.f35055u).f34796d).setVisibility(Intrinsics.areEqual(str, editDataActivity.b0().f30129v) ? 4 : 0);
                break;
            case 1:
                int i15 = EditDataActivity.f9359n;
                ((View) obj).getClass();
                editDataActivity.d0();
                break;
            case 2:
                int i16 = EditDataActivity.f9359n;
                ((View) obj).getClass();
                r rVarB0 = editDataActivity.b0();
                g3 g3Var = rVarB0.f30110b;
                String phoneNumber = g3Var.m().getPhoneNumber();
                String phoneCountryCode = g3Var.m().getPhoneCountryCode();
                g3Var.m().setPhoneNumber("");
                g3Var.m().setPhoneCountryCode("");
                rVarB0.g(new l(rVarB0, phoneNumber, phoneCountryCode, i13));
                break;
            case 3:
                int i17 = EditDataActivity.f9359n;
                ((View) obj).getClass();
                editDataActivity.getOnBackPressedDispatcher().d();
                break;
            case 4:
                int i18 = EditDataActivity.f9359n;
                ((View) obj).getClass();
                r rVarB02 = editDataActivity.b0();
                c cVar = new c(editDataActivity, 1);
                rVarB02.f30119k.k(Boolean.TRUE);
                rVarB02.f30122o.k(Boolean.FALSE);
                f0.B(m1.d(rVarB02), null, null, new mn.g(rVarB02, cVar, pVar, i12), 3).J(new i(rVarB02, 1));
                break;
            case 5:
                int i19 = EditDataActivity.f9359n;
                ((View) obj).getClass();
                r rVarB03 = editDataActivity.b0();
                or.g gVar = (or.g) editDataActivity.b0().f30118j.d();
                rVarB03.f(String.valueOf(gVar != null ? gVar.f32957a.getCurrentEmail() : null), or.b.CANCEL_EMAIL_CHANGE);
                break;
            case 6:
                int i21 = EditDataActivity.f9359n;
                ((View) obj).getClass();
                r rVarB04 = editDataActivity.b0();
                g3 g3Var2 = rVarB04.f30110b;
                UserGender gender = g3Var2.m().getGender();
                g3Var2.m().setGender(null);
                g3Var2.m().setClearGender(Boolean.TRUE);
                rVarB04.g(new j(rVarB04, gender, i14));
                ev.e eVar = rVarB04.f30111c.f13429b;
                if (eVar.f16489b) {
                    try {
                        BrazeUser currentUser = Braze.INSTANCE.getInstance(eVar.f16488a).getCurrentUser();
                        if (currentUser != null) {
                            currentUser.setGender(Gender.UNKNOWN);
                        }
                    } catch (Throwable th2) {
                        eVar.f16489b = false;
                        sa0.a.f38953a.d(th2);
                    }
                } else {
                    sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
                }
                break;
            case 7:
                int i22 = EditDataActivity.f9359n;
                ((View) obj).getClass();
                r rVarB05 = editDataActivity.b0();
                g3 g3Var3 = rVarB05.f30110b;
                DietaryPreferences dietary = g3Var3.m().getDietary();
                g3Var3.m().setDietary(null);
                g3Var3.m().setClearDietary(Boolean.TRUE);
                rVarB05.g(new m(rVarB05, dietary, i14));
                ev.e eVar2 = rVarB05.f30111c.f13429b;
                if (eVar2.f16489b) {
                    try {
                        BrazeUser currentUser2 = Braze.INSTANCE.getInstance(eVar2.f16488a).getCurrentUser();
                        if (currentUser2 != null) {
                            currentUser2.unsetCustomUserAttribute(cv.a.DEMOGRAPHIC_DIETARY_PREFERENCES.a());
                        }
                    } catch (Throwable th3) {
                        eVar2.f16489b = false;
                        sa0.a.f38953a.d(th3);
                    }
                } else {
                    sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
                }
                break;
            case 8:
                or.c cVar2 = (or.c) obj;
                int i23 = EditDataActivity.f9359n;
                if (cVar2 != null) {
                    if (cVar2.f32955a) {
                        or.b bVar = cVar2.f32956b;
                        int i24 = bVar == null ? -1 : d.$EnumSwitchMapping$0[bVar.ordinal()];
                        if (i24 != -1) {
                            if (i24 == 1) {
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                String string = editDataActivity.getResources().getString(R.string.profile_email_dialog_confirmation_description);
                                string.getClass();
                                or.g gVar2 = (or.g) editDataActivity.b0().f30118j.d();
                                String str2 = String.format(string, Arrays.copyOf(new Object[]{gVar2 != null ? gVar2.f32957a.getPendingEmail() : null}, 1));
                                k0 k0Var = new k0(editDataActivity);
                                k0Var.e(R.string.profile_email_dialog_confirmation_title);
                                k0Var.f6172c = str2;
                                k0Var.c(R.string.profile_email_dialog_confirmation);
                                k0Var.f6179j = false;
                                k0Var.f();
                            } else if (i24 == 2) {
                                editDataActivity.b0().e(or.f.ON_CREATE_ACTIVITY);
                            } else if (i24 != 3) {
                                e40.a.f();
                                break;
                            } else if (editDataActivity.b0().f30110b.n().getShouldVerifyEmail()) {
                                editDataActivity.b0().e(or.f.ON_CREATE_ACTIVITY);
                            } else {
                                editDataActivity.b0().f30114f.f28165a.a(new f70.b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                            }
                        }
                    } else {
                        k0 k0Var2 = new k0(editDataActivity);
                        k0Var2.e(R.string.email_something_wrong_dialog_title);
                        k0Var2.a(R.string.email_something_wrong_dialog_description);
                        k0Var2.c(R.string.email_something_wrong_dialog_confirmation);
                        k0Var2.f6179j = false;
                        k0Var2.f();
                    }
                }
                break;
            case 9:
                List<? extends CollectionTime> list = (List) obj;
                int i25 = EditDataActivity.f9359n;
                list.getClass();
                r rVarB06 = editDataActivity.b0();
                List listD = rVarB06.d();
                rVarB06.f30110b.m().setCollectionTimes(CollectionTime.INSTANCE.toRawValues(list));
                rVarB06.f30126s = list;
                rVarB06.g(new h(i14, rVarB06, listD));
                r rVarB07 = editDataActivity.b0();
                cv.i iVar = cv.i.TEMP_SCREEN_ACCT_DETAILS_FIELD_SAVED;
                Pair pair = new Pair(dv.a.SCREEN, new dv.c("collection_times"));
                dv.a aVar = dv.a.SELECTED_VALUES;
                List listD2 = editDataActivity.b0().d();
                ArrayList arrayList = new ArrayList(e0.o(listD2, 10));
                Iterator it = listD2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CollectionTime) it.next()).getRawValue());
                }
                dv.b bVarE = h0.g.E(pair, new Pair(aVar, new dv.c(arrayList)));
                iVar.getClass();
                rVarB07.f30111c.c(iVar, bVarE);
                break;
            case 10:
                or.g gVar3 = (or.g) obj;
                int i26 = EditDataActivity.f9359n;
                if (gVar3 != null) {
                    EmailStatusResponse emailStatusResponse = gVar3.f32957a;
                    or.f fVar = gVar3.f32958b;
                    String currentEmail = emailStatusResponse.getCurrentEmail();
                    String str3 = currentEmail != null ? currentEmail : "";
                    String strValueOf = String.valueOf(emailStatusResponse.getPendingEmail());
                    pg.p pVar14 = editDataActivity.f9361g;
                    if (pVar14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        pVar14 = null;
                    }
                    if (((EditText) pVar14.f35047m).getText().toString().length() == 0) {
                        editDataActivity.f0(str3);
                    }
                    int i27 = d.$EnumSwitchMapping$1[emailStatusResponse.getStatus().ordinal()];
                    if (i27 != 1) {
                        if (i27 != 2) {
                            if (i27 != 3) {
                                if (i27 != 4) {
                                    if (i27 != 5) {
                                        e40.a.f();
                                    } else {
                                        m0 m0Var = sa0.a.f38953a;
                                        m0Var.h("EditDataActivity");
                                        m0Var.f("emailStatusLiveData.observer -> UNKNOWN Status", new Object[0]);
                                    }
                                } else if (fVar == or.f.USER_ACTION) {
                                    r rVarB08 = editDataActivity.b0();
                                    pg.p pVar15 = editDataActivity.f9361g;
                                    if (pVar15 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    } else {
                                        pVar6 = pVar15;
                                    }
                                    rVarB08.f(((EditText) pVar6.f35047m).getText().toString(), or.b.SAVE_NEW_CHANGE);
                                }
                                break;
                            } else if (fVar == or.f.USER_ACTION) {
                                pg.p pVar16 = editDataActivity.f9361g;
                                if (pVar16 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    pVar7 = pVar16;
                                }
                                editDataActivity.i0(((EditText) pVar7.f35047m).getText().toString());
                            } else if (fVar == or.f.ON_CREATE_ACTIVITY) {
                                pg.p pVar17 = editDataActivity.f9361g;
                                if (pVar17 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    pVar17 = null;
                                }
                                pVar17.f35046k.setVisibility(8);
                                pg.p pVar18 = editDataActivity.f9361g;
                                if (pVar18 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    pVar8 = pVar18;
                                }
                                ((EditText) pVar8.f35047m).setText(str3);
                            }
                        } else if (fVar == or.f.USER_ACTION) {
                            pg.p pVar19 = editDataActivity.f9361g;
                            if (pVar19 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                pVar9 = pVar19;
                            }
                            editDataActivity.i0(((EditText) pVar9.f35047m).getText().toString());
                        } else if (fVar == or.f.ON_CREATE_ACTIVITY) {
                            editDataActivity.c0();
                            editDataActivity.g0();
                            pg.p pVar20 = editDataActivity.f9361g;
                            if (pVar20 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                pVar20 = null;
                            }
                            p30.b.E(pVar20.f35046k, true);
                            pg.p pVar21 = editDataActivity.f9361g;
                            if (pVar21 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                pVar21 = null;
                            }
                            ((Button) pVar21.l).setVisibility(8);
                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                            String string2 = editDataActivity.getResources().getString(R.string.profile_verify_email_description);
                            string2.getClass();
                            String str4 = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
                            pg.p pVar22 = editDataActivity.f9361g;
                            if (pVar22 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                pVar10 = pVar22;
                            }
                            pVar10.f35045j.setText(str4);
                        }
                    } else if (fVar == or.f.USER_ACTION) {
                        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                        String string3 = editDataActivity.getResources().getString(R.string.email_change_pending_dialog_description);
                        string3.getClass();
                        pg.p pVar23 = editDataActivity.f9361g;
                        if (pVar23 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            pVar11 = pVar23;
                        }
                        String str5 = String.format(string3, Arrays.copyOf(new Object[]{((EditText) pVar11.f35047m).getText().toString()}, 1));
                        k0 k0Var3 = new k0(editDataActivity);
                        k0Var3.e(R.string.email_change_pending_dialog_title);
                        k0Var3.f6172c = str5;
                        k0Var3.c(R.string.email_change_pending_dialog_confirmation);
                        k0Var3.b(R.string.email_change_pending_dialog_cancel);
                        k0Var3.f6179j = false;
                        k0Var3.l = new c(editDataActivity, 0);
                        k0Var3.f();
                    } else if (fVar == or.f.ON_CREATE_ACTIVITY) {
                        pg.p pVar24 = editDataActivity.f9361g;
                        if (pVar24 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            pVar24 = null;
                        }
                        p30.b.E(pVar24.f35046k, true);
                        pg.p pVar25 = editDataActivity.f9361g;
                        if (pVar25 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            pVar25 = null;
                        }
                        p30.b.E((Button) pVar25.l, true);
                        pg.p pVar26 = editDataActivity.f9361g;
                        if (pVar26 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            pVar26 = null;
                        }
                        ((EditText) pVar26.f35047m).setText(str3);
                        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                        String string4 = editDataActivity.getResources().getString(R.string.profile_verify_email_description);
                        string4.getClass();
                        String str6 = String.format(string4, Arrays.copyOf(new Object[]{strValueOf}, 1));
                        pg.p pVar27 = editDataActivity.f9361g;
                        if (pVar27 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            pVar12 = pVar27;
                        }
                        pVar12.f35045j.setText(str6);
                    }
                }
                break;
            case 11:
                Boolean bool = (Boolean) obj;
                int i28 = EditDataActivity.f9359n;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                w0 w0Var = editDataActivity.l;
                if (zBooleanValue) {
                    if (w0Var == null) {
                        editDataActivity.l = new w0(editDataActivity);
                    }
                    w0 w0Var2 = editDataActivity.l;
                    w0Var2.getClass();
                    pg.p pVar28 = editDataActivity.f9361g;
                    if (pVar28 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        pVar5 = pVar28;
                    }
                    w0Var2.b(pVar5.f35041f);
                } else if (w0Var != null) {
                    w0Var.a();
                }
                break;
            case 12:
                int i29 = EditDataActivity.f9359n;
                Toast.makeText(editDataActivity, R.string.generic_err_undefined_error, 0).show();
                break;
            case 13:
                Boolean bool2 = (Boolean) obj;
                int i31 = EditDataActivity.f9359n;
                bool2.getClass();
                boolean zBooleanValue2 = bool2.booleanValue();
                pg.p pVar29 = editDataActivity.f9361g;
                if (pVar29 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pVar29 = null;
                }
                ((EditText) pVar29.f35047m).setEnabled(zBooleanValue2);
                pg.p pVar30 = editDataActivity.f9361g;
                if (pVar30 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pVar4 = pVar30;
                }
                ((EditText) pVar4.f35048n).setEnabled(zBooleanValue2);
                break;
            case 14:
                int i32 = EditDataActivity.f9359n;
                if (!editDataActivity.isFinishing() && !editDataActivity.isDestroyed()) {
                    editDataActivity.setResult(AppConstants.CONTACT_US_RESULT_UPDATE_EMAIL);
                    editDataActivity.getOnBackPressedDispatcher().d();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                UserGender userGender = (UserGender) obj;
                pg.p pVar31 = editDataActivity.f9361g;
                if (pVar31 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pVar3 = pVar31;
                }
                ((ImageButton) ((b1) pVar3.f35055u).f34796d).setVisibility(userGender != editDataActivity.b0().f30130w ? 0 : 4);
                break;
            default:
                DietaryPreferences dietaryPreferences = (DietaryPreferences) obj;
                pg.p pVar32 = editDataActivity.f9361g;
                if (pVar32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pVar2 = pVar32;
                }
                ((ImageButton) ((b1) pVar2.f35055u).f34796d).setVisibility(dietaryPreferences != editDataActivity.b0().f30131x ? 0 : 4);
                break;
        }
        return Unit.f26487a;
    }
}
