package com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit;

import ah.n;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import ao.g3;
import bg.k0;
import bg.m0;
import bg.w0;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.MenuItemView;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.user.requests.DietaryPreferences;
import com.app.tgtg.model.remote.user.requests.UserGender;
import cv.i;
import e70.c;
import h0.g;
import is.h;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.y;
import m90.z0;
import mr.a;
import mr.b;
import mr.d;
import mr.e;
import mr.f;
import mr.j;
import mr.l;
import mr.m;
import mr.r;
import mv.r0;
import o30.f0;
import pg.b1;
import pg.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class EditDataActivity extends n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f9359n = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f9361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f9363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f9364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f9365k;
    public w0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f9366m;

    public EditDataActivity() {
        super(24);
        this.f9362h = new n1(Reflection.getOrCreateKotlinClass(r.class), new f(this, 1), new f(this, 0), new f(this, 2));
        this.f9366m = new e(this, 0);
    }

    public static final void a0(EditDataActivity editDataActivity, ArrayList arrayList, String str) {
        editDataActivity.b0().f30129v = str;
        editDataActivity.f9363i = new a(editDataActivity, arrayList, str, new b(editDataActivity, 0));
        p pVar = editDataActivity.f9361g;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pVar = null;
        }
        ((ListView) pVar.f35049o).setAdapter((ListAdapter) editDataActivity.f9363i);
    }

    public final r b0() {
        return (r) this.f9362h.getValue();
    }

    public final void c0() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            Object systemService = getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d0() {
        UserGender userGender;
        DietaryPreferences dietaryPreferences;
        or.a aVar = (or.a) b0().f30109a.a("DATA");
        final int i11 = 1;
        final int i12 = 0;
        p pVar = null;
        p pVar2 = null;
        p pVar3 = null;
        switch (aVar == null ? -1 : d.$EnumSwitchMapping$2[aVar.ordinal()]) {
            case -1:
            case 7:
                break;
            case 0:
            default:
                e40.a.f();
                break;
            case 1:
                p pVar4 = this.f9361g;
                if (pVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pVar = pVar4;
                }
                String string = ((EditText) pVar.f35047m).getText().toString();
                final r rVarB0 = b0();
                g3 g3Var = rVarB0.f30110b;
                string.getClass();
                final String name = g3Var.m().getName();
                g3Var.m().setName(string);
                rVarB0.g(new Runnable() { // from class: mr.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                r rVar = rVarB0;
                                String str = name;
                                rVar.h(str);
                                rVar.f30111c.f13429b.d(str);
                                break;
                            default:
                                String str2 = name;
                                str2.getClass();
                                rVarB0.f30110b.m().setName(str2);
                                break;
                        }
                    }
                });
                break;
            case 2:
                g0();
                c0();
                p pVar5 = this.f9361g;
                if (pVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pVar3 = pVar5;
                }
                if (!r0.s(((EditText) pVar3.f35047m).getText().toString())) {
                    b0().e(or.f.USER_ACTION);
                } else {
                    h0(R.string.profil_edit_email_error_valid_email);
                }
                break;
            case 3:
                p pVar6 = this.f9361g;
                if (pVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    pVar6 = null;
                }
                String string2 = ((EditText) pVar6.f35048n).getText().toString();
                if (!StringsKt.z(string2, "+", false)) {
                    string2 = "+".concat(string2);
                }
                p pVar7 = this.f9361g;
                if (pVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    pVar2 = pVar7;
                }
                String string3 = ((EditText) pVar2.f35047m).getText().toString();
                if (!r0.w(string2 + string3)) {
                    r rVarB02 = b0();
                    g3 g3Var2 = rVarB02.f30110b;
                    String phoneNumber = g3Var2.m().getPhoneNumber();
                    String phoneCountryCode = g3Var2.m().getPhoneCountryCode();
                    g3Var2.m().setPhoneNumber(string3);
                    g3Var2.m().setPhoneCountryCode(y.n(string2, "+", "", false));
                    rVarB02.g(new l(rVarB02, phoneNumber, phoneCountryCode, i12));
                } else {
                    h0(R.string.profile_edit_phone_error_invalid_number);
                }
                break;
            case 4:
                final r rVarB03 = b0();
                a aVar2 = this.f9363i;
                String str = aVar2 != null ? (String) aVar2.f30075c : null;
                final String strH = rVarB03.f30110b.h();
                rVarB03.h(str);
                rVarB03.f30111c.f13429b.d(str);
                rVarB03.g(new Runnable() { // from class: mr.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                r rVar = rVarB03;
                                String str2 = strH;
                                rVar.h(str2);
                                rVar.f30111c.f13429b.d(str2);
                                break;
                            default:
                                String str22 = strH;
                                str22.getClass();
                                rVarB03.f30110b.m().setName(str22);
                                break;
                        }
                    }
                });
                rVarB03.f30113e.f4432q = 0L;
                if (!Intrinsics.areEqual(strH, str)) {
                    BasketManager.INSTANCE.deleteBasket();
                }
                break;
            case 5:
                a aVar3 = this.f9364j;
                if (aVar3 != null && (userGender = (UserGender) aVar3.f30075c) != null) {
                    r rVarB04 = b0();
                    g3 g3Var3 = rVarB04.f30110b;
                    UserGender gender = g3Var3.m().getGender();
                    g3Var3.m().setGender(userGender);
                    rVarB04.g(new j(rVarB04, gender, i11));
                    rVarB04.f30111c.f13429b.c(userGender);
                }
                r rVarB05 = b0();
                i iVar = i.TEMP_ACTION_ACCT_DETAILS_FIELD_SAVE;
                dv.b bVarE = g.E(new Pair(dv.a.SCREEN, new dv.c("gender")));
                iVar.getClass();
                rVarB05.f30111c.c(iVar, bVarE);
                break;
            case 6:
                a aVar4 = this.f9365k;
                if (aVar4 != null && (dietaryPreferences = (DietaryPreferences) aVar4.f30075c) != null) {
                    r rVarB06 = b0();
                    g3 g3Var4 = rVarB06.f30110b;
                    DietaryPreferences dietary = g3Var4.m().getDietary();
                    g3Var4.m().setDietary(dietaryPreferences);
                    rVarB06.g(new m(rVarB06, dietary, i11));
                    rVarB06.f30111c.f13429b.b(dietaryPreferences);
                }
                r rVarB07 = b0();
                i iVar2 = i.TEMP_ACTION_ACCT_DETAILS_FIELD_SAVE;
                dv.b bVarE2 = g.E(new Pair(dv.a.SCREEN, new dv.c("food_preferences")));
                iVar2.getClass();
                rVarB07.f30111c.c(iVar2, bVarE2);
                break;
        }
    }

    public final void e0(String str) {
        if (!StringsKt.z(str, "+", false)) {
            str = "+".concat(str);
        }
        b0().f30128u = str;
        p pVar = this.f9361g;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pVar = null;
        }
        ((EditText) pVar.f35048n).setText(str);
    }

    public final void f0(String str) {
        r rVarB0 = b0();
        str.getClass();
        rVarB0.f30127t = str;
        p pVar = this.f9361g;
        p pVar2 = null;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pVar = null;
        }
        ((EditText) pVar.f35047m).setText(str);
        p pVar3 = this.f9361g;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pVar2 = pVar3;
        }
        ((EditText) pVar2.f35047m).setSelection(str.length());
    }

    public final void g0() {
        p pVar = this.f9361g;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pVar = null;
        }
        ((EditText) pVar.f35047m).clearFocus();
        LinearLayout linearLayout = pVar.f35041f;
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        linearLayout.requestFocus();
    }

    public final void h0(int i11) {
        p pVar = this.f9361g;
        p pVar2 = null;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pVar = null;
        }
        pVar.f35043h.setVisibility(0);
        p pVar3 = this.f9361g;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pVar2 = pVar3;
        }
        pVar2.f35043h.setText(i11);
    }

    public final void i0(String str) {
        k0 k0Var = new k0(this);
        k0Var.e(R.string.profile_email_dialog_approval_title);
        k0Var.f6172c = str;
        k0Var.c(R.string.profile_email_dialog_approval_yes_button);
        k0Var.b(R.string.profile_email_dialog_approval_edit_button);
        k0Var.f6179j = false;
        k0Var.l = new mr.c(this, 2);
        k0Var.f();
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x70.c cVar = null;
        View viewInflate = getLayoutInflater().inflate(R.layout.edit_data_view, (ViewGroup) null, false);
        int i11 = R.id.cancelEmailBtn;
        Button button = (Button) pd.g.t(R.id.cancelEmailBtn, viewInflate);
        if (button != null) {
            i11 = R.id.clTextInput;
            ConstraintLayout constraintLayout = (ConstraintLayout) pd.g.t(R.id.clTextInput, viewInflate);
            if (constraintLayout != null) {
                i11 = R.id.collectionTimesView;
                ComposeView composeView = (ComposeView) pd.g.t(R.id.collectionTimesView, viewInflate);
                if (composeView != null) {
                    i11 = R.id.etTextField;
                    EditText editText = (EditText) pd.g.t(R.id.etTextField, viewInflate);
                    if (editText != null) {
                        i11 = R.id.etTextFieldDialCode;
                        EditText editText2 = (EditText) pd.g.t(R.id.etTextFieldDialCode, viewInflate);
                        if (editText2 != null) {
                            i11 = R.id.ivClear;
                            ImageView imageView = (ImageView) pd.g.t(R.id.ivClear, viewInflate);
                            if (imageView != null) {
                                i11 = R.id.lvCountrySelector;
                                ListView listView = (ListView) pd.g.t(R.id.lvCountrySelector, viewInflate);
                                if (listView != null) {
                                    i11 = R.id.lvDietarySelector;
                                    ListView listView2 = (ListView) pd.g.t(R.id.lvDietarySelector, viewInflate);
                                    if (listView2 != null) {
                                        i11 = R.id.lvGenderSelector;
                                        ListView listView3 = (ListView) pd.g.t(R.id.lvGenderSelector, viewInflate);
                                        if (listView3 != null) {
                                            i11 = R.id.miRemoveDietary;
                                            MenuItemView menuItemView = (MenuItemView) pd.g.t(R.id.miRemoveDietary, viewInflate);
                                            if (menuItemView != null) {
                                                i11 = R.id.miRemoveGender;
                                                MenuItemView menuItemView2 = (MenuItemView) pd.g.t(R.id.miRemoveGender, viewInflate);
                                                if (menuItemView2 != null) {
                                                    i11 = R.id.miRemovePhoneNumber;
                                                    MenuItemView menuItemView3 = (MenuItemView) pd.g.t(R.id.miRemovePhoneNumber, viewInflate);
                                                    if (menuItemView3 != null) {
                                                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                        i11 = R.id.toolBar;
                                                        View viewT = pd.g.t(R.id.toolBar, viewInflate);
                                                        if (viewT != null) {
                                                            b1 b1VarC = b1.c(viewT);
                                                            i11 = R.id.tvCountryLabel;
                                                            TextView textView = (TextView) pd.g.t(R.id.tvCountryLabel, viewInflate);
                                                            if (textView != null) {
                                                                i11 = R.id.tvError;
                                                                TextView textView2 = (TextView) pd.g.t(R.id.tvError, viewInflate);
                                                                if (textView2 != null) {
                                                                    i11 = R.id.tvTextFieldLabel;
                                                                    TextView textView3 = (TextView) pd.g.t(R.id.tvTextFieldLabel, viewInflate);
                                                                    if (textView3 != null) {
                                                                        i11 = R.id.tvVerifyEmailDescription;
                                                                        TextView textView4 = (TextView) pd.g.t(R.id.tvVerifyEmailDescription, viewInflate);
                                                                        if (textView4 != null) {
                                                                            i11 = R.id.tvVerifyEmailTitle;
                                                                            if (((TextView) pd.g.t(R.id.tvVerifyEmailTitle, viewInflate)) != null) {
                                                                                i11 = R.id.verifyEmailBtn;
                                                                                Button button2 = (Button) pd.g.t(R.id.verifyEmailBtn, viewInflate);
                                                                                if (button2 != null) {
                                                                                    i11 = R.id.verifyEmailLayout;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) pd.g.t(R.id.verifyEmailLayout, viewInflate);
                                                                                    if (linearLayout2 != null) {
                                                                                        this.f9361g = new p(linearLayout, button, constraintLayout, composeView, editText, editText2, imageView, listView, listView2, listView3, menuItemView, menuItemView2, menuItemView3, linearLayout, b1VarC, textView, textView2, textView3, textView4, button2, linearLayout2);
                                                                                        setContentView(linearLayout);
                                                                                        int i12 = 1;
                                                                                        f0.S(this, true);
                                                                                        getOnBackPressedDispatcher().a(this.f9366m);
                                                                                        p pVar = this.f9361g;
                                                                                        if (pVar == null) {
                                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                            pVar = null;
                                                                                        }
                                                                                        b1 b1Var = (b1) pVar.f35055u;
                                                                                        TextView textView5 = (TextView) b1Var.f34795c;
                                                                                        ImageView imageView2 = pVar.f35040e;
                                                                                        EditText editText3 = (EditText) pVar.f35047m;
                                                                                        TextView textView6 = pVar.f35044i;
                                                                                        ConstraintLayout constraintLayout2 = pVar.f35038c;
                                                                                        ((ImageButton) b1Var.f34796d).setVisibility(4);
                                                                                        or.a aVar = (or.a) b0().f30109a.a("DATA");
                                                                                        int i13 = 8;
                                                                                        int i14 = 3;
                                                                                        int i15 = 2;
                                                                                        switch (aVar == null ? -1 : d.$EnumSwitchMapping$2[aVar.ordinal()]) {
                                                                                            case -1:
                                                                                                break;
                                                                                            case 0:
                                                                                            default:
                                                                                                e40.a.f();
                                                                                                return;
                                                                                            case 1:
                                                                                                textView5.setText(R.string.profile_edit_name_title);
                                                                                                textView6.setText(R.string.profile_edit_name_label);
                                                                                                editText3.setInputType(96);
                                                                                                f0(b0().f30110b.m().getName());
                                                                                                break;
                                                                                            case 2:
                                                                                                boolean shouldVerifyEmail = b0().f30110b.n().getShouldVerifyEmail();
                                                                                                boolean hasActiveEmailChangeRequest = b0().f30110b.n().getHasActiveEmailChangeRequest();
                                                                                                if (shouldVerifyEmail || hasActiveEmailChangeRequest) {
                                                                                                    g0();
                                                                                                    getWindow().setSoftInputMode(2);
                                                                                                }
                                                                                                textView5.setText(R.string.profil_edit_email_title);
                                                                                                textView6.setText(R.string.profil_edit_email_label);
                                                                                                editText3.setInputType(32);
                                                                                                if (b0().f30110b.n().isBusiness()) {
                                                                                                    editText3.setEnabled(false);
                                                                                                    editText3.setTextColor(getColor(R.color.neutral_60));
                                                                                                    imageView2.setVisibility(8);
                                                                                                }
                                                                                                break;
                                                                                            case 3:
                                                                                                MenuItemView menuItemView4 = (MenuItemView) pVar.f35054t;
                                                                                                textView5.setText(R.string.profile_edit_phone_title);
                                                                                                textView6.setText(R.string.profile_edit_phone_header);
                                                                                                editText3.setInputType(3);
                                                                                                EditText editText4 = (EditText) pVar.f35048n;
                                                                                                editText4.setVisibility(0);
                                                                                                pVar.f35042g.setVisibility(0);
                                                                                                String phoneNumber = b0().f30110b.m().getPhoneNumber();
                                                                                                phoneNumber.getClass();
                                                                                                f0(phoneNumber);
                                                                                                if (r0.v(phoneNumber)) {
                                                                                                    String phoneCountryCodeSuggestion = b0().f30110b.n().getPhoneCountryCodeSuggestion();
                                                                                                    phoneCountryCodeSuggestion.getClass();
                                                                                                    e0(phoneCountryCodeSuggestion);
                                                                                                } else {
                                                                                                    menuItemView4.setVisibility(0);
                                                                                                    String phoneCountryCode = b0().f30110b.m().getPhoneCountryCode();
                                                                                                    if (phoneCountryCode == null) {
                                                                                                        phoneCountryCode = b0().f30110b.n().getPhoneCountryCodeSuggestion();
                                                                                                        phoneCountryCode.getClass();
                                                                                                    }
                                                                                                    e0(phoneCountryCode);
                                                                                                }
                                                                                                if (b0().f30110b.n().isBusiness()) {
                                                                                                    editText3.setEnabled(false);
                                                                                                    editText3.setTextColor(getColor(R.color.neutral_60));
                                                                                                    editText4.setEnabled(false);
                                                                                                    editText4.setTextColor(getColor(R.color.neutral_60));
                                                                                                    imageView2.setVisibility(8);
                                                                                                    menuItemView4.setVisibility(8);
                                                                                                }
                                                                                                break;
                                                                                            case 4:
                                                                                                textView5.setText(R.string.profile_edit_country_label);
                                                                                                getWindow().setSoftInputMode(2);
                                                                                                constraintLayout2.setVisibility(8);
                                                                                                v80.f0.B(m1.c(this), null, null, new h(this, pVar, cVar, i13), 3);
                                                                                                break;
                                                                                            case 5:
                                                                                                textView5.setText(R.string.profile_edit_gender_label);
                                                                                                getWindow().setSoftInputMode(2);
                                                                                                constraintLayout2.setVisibility(8);
                                                                                                ((ListView) pVar.f35051q).setVisibility(0);
                                                                                                ((MenuItemView) pVar.f35053s).setVisibility(b0().f30110b.m().getGender() != null ? 0 : 8);
                                                                                                b0().f30130w = b0().f30110b.m().getGender();
                                                                                                this.f9364j = new a(this, (UserGender[]) UserGender.INSTANCE.filterByCountry(b0().f30110b.h()).toArray(new UserGender[0]), b0().f30110b.m().getGender(), new b(this, 15));
                                                                                                p pVar2 = this.f9361g;
                                                                                                if (pVar2 == null) {
                                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                                    pVar2 = null;
                                                                                                }
                                                                                                ((ListView) pVar2.f35051q).setAdapter((ListAdapter) this.f9364j);
                                                                                                break;
                                                                                            case 6:
                                                                                                textView5.setText(R.string.profile_edit_dietary_label);
                                                                                                getWindow().setSoftInputMode(2);
                                                                                                constraintLayout2.setVisibility(8);
                                                                                                ((ListView) pVar.f35050p).setVisibility(0);
                                                                                                ((MenuItemView) pVar.f35052r).setVisibility(b0().f30110b.m().getDietary() != null ? 0 : 8);
                                                                                                b0().f30131x = b0().f30110b.m().getDietary();
                                                                                                a80.a entries = DietaryPreferences.getEntries();
                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                for (Object obj : entries) {
                                                                                                    if (((DietaryPreferences) obj) != DietaryPreferences.UNKNOWN) {
                                                                                                        arrayList.add(obj);
                                                                                                    }
                                                                                                }
                                                                                                this.f9365k = new a(this, (DietaryPreferences[]) arrayList.toArray(new DietaryPreferences[0]), b0().f30110b.m().getDietary(), new b(this, 16));
                                                                                                p pVar3 = this.f9361g;
                                                                                                if (pVar3 == null) {
                                                                                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                                    pVar3 = null;
                                                                                                }
                                                                                                ((ListView) pVar3.f35050p).setAdapter((ListAdapter) this.f9365k);
                                                                                                break;
                                                                                            case 7:
                                                                                                textView5.setText(R.string.profile_collection_times_title);
                                                                                                constraintLayout2.setVisibility(8);
                                                                                                ComposeView composeView2 = pVar.f35039d;
                                                                                                composeView2.setVisibility(0);
                                                                                                getWindow().setSoftInputMode(2);
                                                                                                composeView2.setContent(new u3.d(new lk.a(this, 18), true, 963817847));
                                                                                                break;
                                                                                        }
                                                                                        p pVar4 = this.f9361g;
                                                                                        if (pVar4 == null) {
                                                                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                            pVar4 = null;
                                                                                        }
                                                                                        ImageView imageView3 = pVar4.f35040e;
                                                                                        EditText editText5 = (EditText) pVar4.f35047m;
                                                                                        b1 b1Var2 = (b1) pVar4.f35055u;
                                                                                        mv.d.x(imageView3, new z0(pVar4, i15));
                                                                                        mv.d.x((ImageButton) b1Var2.f34796d, new b(this, i12));
                                                                                        mv.d.x((MenuItemView) pVar4.f35054t, new b(this, i15));
                                                                                        mv.d.x((ImageButton) b1Var2.f34797e, new b(this, i14));
                                                                                        editText5.setOnEditorActionListener(new m0(this, 2));
                                                                                        fl.f fVar = new fl.f(new bs.c(5, pVar4, this), 3);
                                                                                        editText5.addTextChangedListener(fVar);
                                                                                        ((EditText) pVar4.f35048n).addTextChangedListener(fVar);
                                                                                        mv.d.x((Button) pVar4.f35056v, new b(this, 4));
                                                                                        mv.d.x((Button) pVar4.l, new b(this, 5));
                                                                                        mv.d.x((MenuItemView) pVar4.f35053s, new b(this, 6));
                                                                                        mv.d.x((MenuItemView) pVar4.f35052r, new b(this, 7));
                                                                                        b0().f30116h.e(this, new dk.b(new b(this, i13), 4));
                                                                                        b0().f30118j.e(this, new dk.b(new b(this, 10), 4));
                                                                                        b0().l.e(this, new dk.b(new b(this, 11), 4));
                                                                                        b0().f30121n.e(this, new dk.b(new b(this, 12), 4));
                                                                                        b0().f30123p.e(this, new dk.b(new b(this, 13), 4));
                                                                                        b0().f30125r.e(this, new dk.b(new b(this, 14), 4));
                                                                                        c cVar2 = this.f9360f;
                                                                                        if (cVar2 == null) {
                                                                                            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
                                                                                            cVar2 = null;
                                                                                        }
                                                                                        c.b(cVar2, this, null, 6);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        this.f9366m.remove();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (((or.a) b0().f30109a.a("DATA")) == or.a.EMAIL) {
            b0().e(or.f.ON_CREATE_ACTIVITY);
        }
    }
}
