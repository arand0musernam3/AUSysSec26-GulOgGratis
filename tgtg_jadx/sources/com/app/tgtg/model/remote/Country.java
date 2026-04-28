package com.app.tgtg.model.remote;

import e0.f;
import i90.g;
import i90.h;
import j4.s;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSB{\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB{\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0084\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00102\u0012\u0004\b6\u00107\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u00105R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u00102\u0012\u0004\b:\u00107\u001a\u0004\b8\u0010\u0016\"\u0004\b9\u00105R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00102\u0012\u0004\b=\u00107\u001a\u0004\b;\u0010\u0016\"\u0004\b<\u00105R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00102\u0012\u0004\b@\u00107\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u00105R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00102\u0012\u0004\bC\u00107\u001a\u0004\bA\u0010\u0016\"\u0004\bB\u00105R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010D\u0012\u0004\bH\u00107\u001a\u0004\bE\u0010\u001c\"\u0004\bF\u0010GR \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010D\u0012\u0004\bJ\u00107\u001a\u0004\bI\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\bL\u00107\u001a\u0004\bK\u0010\u0016R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\bN\u00107\u001a\u0004\bM\u0010\u0016R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\bP\u00107\u001a\u0004\bO\u0010\u0016R\u0011\u0010R\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0016¨\u0006U"}, d2 = {"Lcom/app/tgtg/model/remote/Country;", "", "", "iso", "termsUrl", "privacyUrl", "manufacturerTermsUrl", "languageIsoCode", "", "promptForNewOptIn", "bestBeforeExplainerAllowed", "charityTermsUrl", "charitySupportEmail", "accessibilityStatementUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/Country;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/Country;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getIso", "setIso", "(Ljava/lang/String;)V", "getIso$annotations", "()V", "getTermsUrl", "setTermsUrl", "getTermsUrl$annotations", "getPrivacyUrl", "setPrivacyUrl", "getPrivacyUrl$annotations", "getManufacturerTermsUrl", "setManufacturerTermsUrl", "getManufacturerTermsUrl$annotations", "getLanguageIsoCode", "setLanguageIsoCode", "getLanguageIsoCode$annotations", "Z", "getPromptForNewOptIn", "setPromptForNewOptIn", "(Z)V", "getPromptForNewOptIn$annotations", "getBestBeforeExplainerAllowed", "getBestBeforeExplainerAllowed$annotations", "getCharityTermsUrl", "getCharityTermsUrl$annotations", "getCharitySupportEmail", "getCharitySupportEmail$annotations", "getAccessibilityStatementUrl", "getAccessibilityStatementUrl$annotations", "getDisplayName", "displayName", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Country {

    @Nullable
    private final String accessibilityStatementUrl;
    private final boolean bestBeforeExplainerAllowed;

    @Nullable
    private final String charitySupportEmail;

    @Nullable
    private final String charityTermsUrl;

    @Nullable
    private String iso;

    @Nullable
    private String languageIsoCode;

    @Nullable
    private String manufacturerTermsUrl;

    @Nullable
    private String privacyUrl;
    private boolean promptForNewOptIn;

    @Nullable
    private String termsUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ Country(int i11, String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, String str6, String str7, String str8, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.iso = null;
        } else {
            this.iso = str;
        }
        if ((i11 & 2) == 0) {
            this.termsUrl = null;
        } else {
            this.termsUrl = str2;
        }
        if ((i11 & 4) == 0) {
            this.privacyUrl = null;
        } else {
            this.privacyUrl = str3;
        }
        if ((i11 & 8) == 0) {
            this.manufacturerTermsUrl = null;
        } else {
            this.manufacturerTermsUrl = str4;
        }
        if ((i11 & 16) == 0) {
            this.languageIsoCode = null;
        } else {
            this.languageIsoCode = str5;
        }
        if ((i11 & 32) == 0) {
            this.promptForNewOptIn = false;
        } else {
            this.promptForNewOptIn = z11;
        }
        if ((i11 & 64) == 0) {
            this.bestBeforeExplainerAllowed = false;
        } else {
            this.bestBeforeExplainerAllowed = z12;
        }
        if ((i11 & 128) == 0) {
            this.charityTermsUrl = null;
        } else {
            this.charityTermsUrl = str6;
        }
        if ((i11 & 256) == 0) {
            this.charitySupportEmail = null;
        } else {
            this.charitySupportEmail = str7;
        }
        if ((i11 & 512) == 0) {
            this.accessibilityStatementUrl = null;
        } else {
            this.accessibilityStatementUrl = str8;
        }
    }

    public static /* synthetic */ Country copy$default(Country country, String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = country.iso;
        }
        if ((i11 & 2) != 0) {
            str2 = country.termsUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = country.privacyUrl;
        }
        if ((i11 & 8) != 0) {
            str4 = country.manufacturerTermsUrl;
        }
        if ((i11 & 16) != 0) {
            str5 = country.languageIsoCode;
        }
        if ((i11 & 32) != 0) {
            z11 = country.promptForNewOptIn;
        }
        if ((i11 & 64) != 0) {
            z12 = country.bestBeforeExplainerAllowed;
        }
        if ((i11 & 128) != 0) {
            str6 = country.charityTermsUrl;
        }
        if ((i11 & 256) != 0) {
            str7 = country.charitySupportEmail;
        }
        if ((i11 & 512) != 0) {
            str8 = country.accessibilityStatementUrl;
        }
        String str9 = str7;
        String str10 = str8;
        boolean z13 = z12;
        String str11 = str6;
        String str12 = str5;
        boolean z14 = z11;
        return country.copy(str, str2, str3, str4, str12, z14, z13, str11, str9, str10);
    }

    public static final /* synthetic */ void write$Self$app(Country self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.iso != null) {
            output.r(serialDesc, 0, r1.f29848a, self.iso);
        }
        if (output.C(serialDesc) || self.termsUrl != null) {
            output.r(serialDesc, 1, r1.f29848a, self.termsUrl);
        }
        if (output.C(serialDesc) || self.privacyUrl != null) {
            output.r(serialDesc, 2, r1.f29848a, self.privacyUrl);
        }
        if (output.C(serialDesc) || self.manufacturerTermsUrl != null) {
            output.r(serialDesc, 3, r1.f29848a, self.manufacturerTermsUrl);
        }
        if (output.C(serialDesc) || self.languageIsoCode != null) {
            output.r(serialDesc, 4, r1.f29848a, self.languageIsoCode);
        }
        if (output.C(serialDesc) || self.promptForNewOptIn) {
            output.p(serialDesc, 5, self.promptForNewOptIn);
        }
        if (output.C(serialDesc) || self.bestBeforeExplainerAllowed) {
            output.p(serialDesc, 6, self.bestBeforeExplainerAllowed);
        }
        if (output.C(serialDesc) || self.charityTermsUrl != null) {
            output.r(serialDesc, 7, r1.f29848a, self.charityTermsUrl);
        }
        if (output.C(serialDesc) || self.charitySupportEmail != null) {
            output.r(serialDesc, 8, r1.f29848a, self.charitySupportEmail);
        }
        if (!output.C(serialDesc) && self.accessibilityStatementUrl == null) {
            return;
        }
        output.r(serialDesc, 9, r1.f29848a, self.accessibilityStatementUrl);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIso() {
        return this.iso;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAccessibilityStatementUrl() {
        return this.accessibilityStatementUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrivacyUrl() {
        return this.privacyUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getManufacturerTermsUrl() {
        return this.manufacturerTermsUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLanguageIsoCode() {
        return this.languageIsoCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getPromptForNewOptIn() {
        return this.promptForNewOptIn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getBestBeforeExplainerAllowed() {
        return this.bestBeforeExplainerAllowed;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCharityTermsUrl() {
        return this.charityTermsUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCharitySupportEmail() {
        return this.charitySupportEmail;
    }

    @NotNull
    public final Country copy(@Nullable String iso, @Nullable String termsUrl, @Nullable String privacyUrl, @Nullable String manufacturerTermsUrl, @Nullable String languageIsoCode, boolean promptForNewOptIn, boolean bestBeforeExplainerAllowed, @Nullable String charityTermsUrl, @Nullable String charitySupportEmail, @Nullable String accessibilityStatementUrl) {
        return new Country(iso, termsUrl, privacyUrl, manufacturerTermsUrl, languageIsoCode, promptForNewOptIn, bestBeforeExplainerAllowed, charityTermsUrl, charitySupportEmail, accessibilityStatementUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country country = (Country) other;
        return Intrinsics.areEqual(this.iso, country.iso) && Intrinsics.areEqual(this.termsUrl, country.termsUrl) && Intrinsics.areEqual(this.privacyUrl, country.privacyUrl) && Intrinsics.areEqual(this.manufacturerTermsUrl, country.manufacturerTermsUrl) && Intrinsics.areEqual(this.languageIsoCode, country.languageIsoCode) && this.promptForNewOptIn == country.promptForNewOptIn && this.bestBeforeExplainerAllowed == country.bestBeforeExplainerAllowed && Intrinsics.areEqual(this.charityTermsUrl, country.charityTermsUrl) && Intrinsics.areEqual(this.charitySupportEmail, country.charitySupportEmail) && Intrinsics.areEqual(this.accessibilityStatementUrl, country.accessibilityStatementUrl);
    }

    @Nullable
    public final String getAccessibilityStatementUrl() {
        return this.accessibilityStatementUrl;
    }

    public final boolean getBestBeforeExplainerAllowed() {
        return this.bestBeforeExplainerAllowed;
    }

    @Nullable
    public final String getCharitySupportEmail() {
        return this.charitySupportEmail;
    }

    @Nullable
    public final String getCharityTermsUrl() {
        return this.charityTermsUrl;
    }

    @NotNull
    public final String getDisplayName() {
        String displayCountry = new Locale("", this.iso).getDisplayCountry();
        displayCountry.getClass();
        return displayCountry;
    }

    @Nullable
    public final String getIso() {
        return this.iso;
    }

    @Nullable
    public final String getLanguageIsoCode() {
        return this.languageIsoCode;
    }

    @Nullable
    public final String getManufacturerTermsUrl() {
        return this.manufacturerTermsUrl;
    }

    @Nullable
    public final String getPrivacyUrl() {
        return this.privacyUrl;
    }

    public final boolean getPromptForNewOptIn() {
        return this.promptForNewOptIn;
    }

    @Nullable
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    public int hashCode() {
        String str = this.iso;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.termsUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.privacyUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.manufacturerTermsUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.languageIsoCode;
        int iE = k.e(k.e((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.promptForNewOptIn), 31, this.bestBeforeExplainerAllowed);
        String str6 = this.charityTermsUrl;
        int iHashCode5 = (iE + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.charitySupportEmail;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.accessibilityStatementUrl;
        return iHashCode6 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setIso(@Nullable String str) {
        this.iso = str;
    }

    public final void setLanguageIsoCode(@Nullable String str) {
        this.languageIsoCode = str;
    }

    public final void setManufacturerTermsUrl(@Nullable String str) {
        this.manufacturerTermsUrl = str;
    }

    public final void setPrivacyUrl(@Nullable String str) {
        this.privacyUrl = str;
    }

    public final void setPromptForNewOptIn(boolean z11) {
        this.promptForNewOptIn = z11;
    }

    public final void setTermsUrl(@Nullable String str) {
        this.termsUrl = str;
    }

    @NotNull
    public String toString() {
        String str = this.iso;
        String str2 = this.termsUrl;
        String str3 = this.privacyUrl;
        String str4 = this.manufacturerTermsUrl;
        String str5 = this.languageIsoCode;
        boolean z11 = this.promptForNewOptIn;
        boolean z12 = this.bestBeforeExplainerAllowed;
        String str6 = this.charityTermsUrl;
        String str7 = this.charitySupportEmail;
        String str8 = this.accessibilityStatementUrl;
        StringBuilder sbT = f.t("Country(iso=", str, ", termsUrl=", str2, ", privacyUrl=");
        s.A(sbT, str3, ", manufacturerTermsUrl=", str4, ", languageIsoCode=");
        k.z(sbT, str5, ", promptForNewOptIn=", z11, ", bestBeforeExplainerAllowed=");
        sbT.append(z12);
        sbT.append(", charityTermsUrl=");
        sbT.append(str6);
        sbT.append(", charitySupportEmail=");
        return f.o(sbT, str7, ", accessibilityStatementUrl=", str8, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/Country$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/Country;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Country$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("accessibility_statement_url")
    public static /* synthetic */ void getAccessibilityStatementUrl$annotations() {
    }

    @g("best_before_explainer_allowed")
    public static /* synthetic */ void getBestBeforeExplainerAllowed$annotations() {
    }

    @g("charity_support_email")
    public static /* synthetic */ void getCharitySupportEmail$annotations() {
    }

    @g("charity_terms_url")
    public static /* synthetic */ void getCharityTermsUrl$annotations() {
    }

    @g("country_iso_code")
    public static /* synthetic */ void getIso$annotations() {
    }

    @g("language_iso_code")
    public static /* synthetic */ void getLanguageIsoCode$annotations() {
    }

    @g("manufacturer_terms_url")
    public static /* synthetic */ void getManufacturerTermsUrl$annotations() {
    }

    @g("privacy_url")
    public static /* synthetic */ void getPrivacyUrl$annotations() {
    }

    @g("prompt_for_newsletter_opt_in")
    public static /* synthetic */ void getPromptForNewOptIn$annotations() {
    }

    @g("terms_url")
    public static /* synthetic */ void getTermsUrl$annotations() {
    }

    public Country() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public Country(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z11, boolean z12, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.iso = str;
        this.termsUrl = str2;
        this.privacyUrl = str3;
        this.manufacturerTermsUrl = str4;
        this.languageIsoCode = str5;
        this.promptForNewOptIn = z11;
        this.bestBeforeExplainerAllowed = z12;
        this.charityTermsUrl = str6;
        this.charitySupportEmail = str7;
        this.accessibilityStatementUrl = str8;
    }

    public /* synthetic */ Country(String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8);
    }
}
