package com.app.tgtg.feature.login.terms;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.feature.login.terms.TermsConsentView;
import com.app.tgtg.model.remote.Country;
import i80.n;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import m90.z0;
import mv.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.g;
import pg.o3;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class TermsConsentView extends ConstraintLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f9069e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3 f9070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Country f9071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f9072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f9073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TermsConsentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        final int i12 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.terms_check_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i13 = R.id.cbMailConsent;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) g.t(R.id.cbMailConsent, viewInflate);
        if (appCompatCheckBox != null) {
            i13 = R.id.cbTerms;
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) g.t(R.id.cbTerms, viewInflate);
            if (appCompatCheckBox2 != null) {
                i13 = R.id.checkMailConsentLayout;
                if (((LinearLayout) g.t(R.id.checkMailConsentLayout, viewInflate)) != null) {
                    i13 = R.id.checkTermsLayout;
                    if (((LinearLayout) g.t(R.id.checkTermsLayout, viewInflate)) != null) {
                        i13 = R.id.tvMailConsent;
                        TextView textView = (TextView) g.t(R.id.tvMailConsent, viewInflate);
                        if (textView != null) {
                            i13 = R.id.tvTerms;
                            TextView textView2 = (TextView) g.t(R.id.tvTerms, viewInflate);
                            if (textView2 != null) {
                                this.f9070a = new o3((ConstraintLayout) viewInflate, appCompatCheckBox, appCompatCheckBox2, textView, textView2);
                                getBinding().f35032b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: pl.h

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ TermsConsentView f35488b;

                                    {
                                        this.f35488b = this;
                                    }

                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                                        int i14 = i12;
                                        TermsConsentView termsConsentView = this.f35488b;
                                        switch (i14) {
                                            case 0:
                                                int i15 = TermsConsentView.f9069e;
                                                termsConsentView.j(z11);
                                                break;
                                            default:
                                                int i16 = TermsConsentView.f9069e;
                                                termsConsentView.j(z11);
                                                break;
                                        }
                                    }
                                });
                                final int i14 = 1;
                                getBinding().f35033c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: pl.h

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ TermsConsentView f35488b;

                                    {
                                        this.f35488b = this;
                                    }

                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                                        int i142 = i14;
                                        TermsConsentView termsConsentView = this.f35488b;
                                        switch (i142) {
                                            case 0:
                                                int i15 = TermsConsentView.f9069e;
                                                termsConsentView.j(z11);
                                                break;
                                            default:
                                                int i16 = TermsConsentView.f9069e;
                                                termsConsentView.j(z11);
                                                break;
                                        }
                                    }
                                });
                                TextView textView3 = getBinding().f35035e;
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                String string = getResources().getString(R.string.terms_agree_terms_and_conditions);
                                string.getClass();
                                textView3.setText(String.format(string, Arrays.copyOf(new Object[]{"", "", "", ""}, 4)));
                                return;
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
        throw null;
    }

    private final o3 getBinding() {
        o3 o3Var = this.f9070a;
        o3Var.getClass();
        return o3Var;
    }

    @Nullable
    public final Country getCountry() {
        return this.f9071b;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnChecked() {
        return this.f9072c;
    }

    @Nullable
    public final n getOpenLink() {
        return this.f9073d;
    }

    public final void j(boolean z11) {
        if (getBinding().f35033c.getVisibility() != 0) {
            Function1 function1 = this.f9072c;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z11));
                return;
            }
            return;
        }
        boolean z12 = false;
        if (this.f9071b == null) {
            getBinding().f35033c.setChecked(false);
            return;
        }
        Function1 function12 = this.f9072c;
        if (function12 != null) {
            if (getBinding().f35032b.isChecked() && getBinding().f35033c.isChecked()) {
                z12 = true;
            }
            function12.invoke(Boolean.valueOf(z12));
        }
    }

    public final void k(boolean z11) {
        getBinding().f35032b.setChecked(!z11);
        getBinding().f35032b.setVisibility(z11 ? 0 : 8);
        getBinding().f35034d.setVisibility(z11 ? 0 : 8);
    }

    public final void l() {
        getBinding().f35033c.setVisibility(0);
        getBinding().f35035e.setVisibility(0);
    }

    public final void setCountry(@Nullable Country country) {
        this.f9071b = country;
        getBinding().f35033c.setChecked(false);
        if (this.f9071b != null) {
            getBinding().f35035e.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void setCountryText(@Nullable Country country) {
        setCountry(country);
        String termsUrl = country != null ? country.getTermsUrl() : null;
        if (termsUrl == null) {
            termsUrl = "";
        }
        String privacyUrl = country != null ? country.getPrivacyUrl() : null;
        if (privacyUrl == null) {
            privacyUrl = "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getResources().getString(R.string.terms_agree_terms_and_conditions);
        string.getClass();
        d.z(getBinding().f35035e, String.format(string, Arrays.copyOf(new Object[]{a0.p("<a href='", termsUrl, "'><b>"), "</b></a>", a0.p("<a href='", privacyUrl, "'><b>"), "</b></a>"}, 4)), new z0(this, 11), 2);
        AppCompatCheckBox appCompatCheckBox = getBinding().f35033c;
        String string2 = getResources().getString(R.string.terms_agree_terms_and_conditions);
        string2.getClass();
        appCompatCheckBox.setContentDescription(String.format(string2, Arrays.copyOf(new Object[]{"", "", "", ""}, 4)));
    }

    public final void setOnChecked(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f9072c = function1;
    }

    public final void setOpenLink(@Nullable n nVar) {
        this.f9073d = nVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TermsConsentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TermsConsentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ TermsConsentView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
