package com.app.tgtg.feature.logincharity.ui.model;

import com.app.tgtg.R;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/app/tgtg/feature/logincharity/ui/model/Country;", "", "iso", "", "charityTermsUrl", "displayName", "privacyUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIso", "()Ljava/lang/String;", "getCharityTermsUrl", "getDisplayName", "getPrivacyUrl", "iconRes", "", "getIconRes", "()Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Country {
    public static final int $stable = 0;

    @NotNull
    private final String charityTermsUrl;

    @NotNull
    private final String displayName;

    @NotNull
    private final String iso;

    @NotNull
    private final String privacyUrl;

    public Country(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.iso = str;
        this.charityTermsUrl = str2;
        this.displayName = str3;
        this.privacyUrl = str4;
    }

    public static /* synthetic */ Country copy$default(Country country, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = country.iso;
        }
        if ((i11 & 2) != 0) {
            str2 = country.charityTermsUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = country.displayName;
        }
        if ((i11 & 8) != 0) {
            str4 = country.privacyUrl;
        }
        return country.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIso() {
        return this.iso;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCharityTermsUrl() {
        return this.charityTermsUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrivacyUrl() {
        return this.privacyUrl;
    }

    @NotNull
    public final Country copy(@NotNull String iso, @NotNull String charityTermsUrl, @NotNull String displayName, @NotNull String privacyUrl) {
        iso.getClass();
        charityTermsUrl.getClass();
        displayName.getClass();
        privacyUrl.getClass();
        return new Country(iso, charityTermsUrl, displayName, privacyUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country country = (Country) other;
        return Intrinsics.areEqual(this.iso, country.iso) && Intrinsics.areEqual(this.charityTermsUrl, country.charityTermsUrl) && Intrinsics.areEqual(this.displayName, country.displayName) && Intrinsics.areEqual(this.privacyUrl, country.privacyUrl);
    }

    @NotNull
    public final String getCharityTermsUrl() {
        return this.charityTermsUrl;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public final Integer getIconRes() {
        String str = this.iso;
        switch (str.hashCode()) {
            case 2099:
                if (str.equals("AT")) {
                    return Integer.valueOf(R.drawable.ic_flag_at);
                }
                return null;
            case 2100:
                if (str.equals("AU")) {
                    return Integer.valueOf(R.drawable.ic_flag_au);
                }
                return null;
            case 2115:
                if (str.equals("BE")) {
                    return Integer.valueOf(R.drawable.ic_flag_be);
                }
                return null;
            case 2142:
                if (str.equals("CA")) {
                    return Integer.valueOf(R.drawable.ic_flag_ca);
                }
                return null;
            case 2149:
                if (str.equals("CH")) {
                    return Integer.valueOf(R.drawable.ic_flag_ch);
                }
                return null;
            case 2167:
                if (str.equals("CZ")) {
                    return Integer.valueOf(R.drawable.ic_flag_cz);
                }
                return null;
            case 2177:
                if (str.equals("DE")) {
                    return Integer.valueOf(R.drawable.ic_flag_de);
                }
                return null;
            case 2183:
                if (str.equals("DK")) {
                    return Integer.valueOf(R.drawable.ic_flag_dk);
                }
                return null;
            case 2222:
                if (str.equals("ES")) {
                    return Integer.valueOf(R.drawable.ic_flag_es);
                }
                return null;
            case 2249:
                if (str.equals("FO")) {
                    return Integer.valueOf(R.drawable.ic_flag_fo);
                }
                return null;
            case 2252:
                if (str.equals("FR")) {
                    return Integer.valueOf(R.drawable.ic_flag_fr);
                }
                return null;
            case 2267:
                if (str.equals("GB")) {
                    return Integer.valueOf(R.drawable.ic_flag_gb);
                }
                return null;
            case 2332:
                if (str.equals("IE")) {
                    return Integer.valueOf(R.drawable.ic_flag_ie);
                }
                return null;
            case 2347:
                if (str.equals("IT")) {
                    return Integer.valueOf(R.drawable.ic_flag_it);
                }
                return null;
            case 2494:
                if (str.equals("NL")) {
                    return Integer.valueOf(R.drawable.ic_flag_nl);
                }
                return null;
            case 2497:
                if (str.equals("NO")) {
                    return Integer.valueOf(R.drawable.ic_flag_no);
                }
                return null;
            case 2556:
                if (str.equals("PL")) {
                    return Integer.valueOf(R.drawable.ic_flag_pl);
                }
                return null;
            case 2564:
                if (str.equals("PT")) {
                    return Integer.valueOf(R.drawable.ic_flag_pt);
                }
                return null;
            case 2642:
                if (str.equals("SE")) {
                    return Integer.valueOf(R.drawable.ic_flag_se);
                }
                return null;
            case 2718:
                if (str.equals("US")) {
                    return Integer.valueOf(R.drawable.ic_flag_us);
                }
                return null;
            default:
                return null;
        }
    }

    @NotNull
    public final String getIso() {
        return this.iso;
    }

    @NotNull
    public final String getPrivacyUrl() {
        return this.privacyUrl;
    }

    public int hashCode() {
        return this.privacyUrl.hashCode() + l1.b(l1.b(this.iso.hashCode() * 31, 31, this.charityTermsUrl), 31, this.displayName);
    }

    @NotNull
    public String toString() {
        String str = this.iso;
        String str2 = this.charityTermsUrl;
        return f.o(f.t("Country(iso=", str, ", charityTermsUrl=", str2, ", displayName="), this.displayName, ", privacyUrl=", this.privacyUrl, ")");
    }
}
