package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.sessions.core.SessionSetupConfiguration;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jk\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020(HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u00064"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetails;", "Landroid/os/Parcelable;", "id", "", "sessionData", "amount", "Lcom/adyen/checkout/components/core/Amount;", "expiresAt", "returnUrl", "sessionSetupConfiguration", "Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "shopperLocale", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;Ljava/lang/String;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getClientKey", "()Ljava/lang/String;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getExpiresAt", "getId", "getReturnUrl", "getSessionData", "getSessionSetupConfiguration", "()Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "getShopperLocale", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SessionDetails> CREATOR = new Creator();

    @Nullable
    private final Amount amount;

    @NotNull
    private final String clientKey;

    @NotNull
    private final Environment environment;

    @NotNull
    private final String expiresAt;

    @NotNull
    private final String id;

    @Nullable
    private final String returnUrl;

    @NotNull
    private final String sessionData;

    @Nullable
    private final SessionSetupConfiguration sessionSetupConfiguration;

    @Nullable
    private final String shopperLocale;

    public SessionDetails(@NotNull String str, @NotNull String str2, @Nullable Amount amount, @NotNull String str3, @Nullable String str4, @Nullable SessionSetupConfiguration sessionSetupConfiguration, @Nullable String str5, @NotNull Environment environment, @NotNull String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        environment.getClass();
        str6.getClass();
        this.id = str;
        this.sessionData = str2;
        this.amount = amount;
        this.expiresAt = str3;
        this.returnUrl = str4;
        this.sessionSetupConfiguration = sessionSetupConfiguration;
        this.shopperLocale = str5;
        this.environment = environment;
        this.clientKey = str6;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, String str2, Amount amount, String str3, String str4, SessionSetupConfiguration sessionSetupConfiguration, String str5, Environment environment, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionDetails.id;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionDetails.sessionData;
        }
        if ((i11 & 4) != 0) {
            amount = sessionDetails.amount;
        }
        if ((i11 & 8) != 0) {
            str3 = sessionDetails.expiresAt;
        }
        if ((i11 & 16) != 0) {
            str4 = sessionDetails.returnUrl;
        }
        if ((i11 & 32) != 0) {
            sessionSetupConfiguration = sessionDetails.sessionSetupConfiguration;
        }
        if ((i11 & 64) != 0) {
            str5 = sessionDetails.shopperLocale;
        }
        if ((i11 & 128) != 0) {
            environment = sessionDetails.environment;
        }
        if ((i11 & 256) != 0) {
            str6 = sessionDetails.clientKey;
        }
        Environment environment2 = environment;
        String str7 = str6;
        SessionSetupConfiguration sessionSetupConfiguration2 = sessionSetupConfiguration;
        String str8 = str5;
        String str9 = str4;
        Amount amount2 = amount;
        return sessionDetails.copy(str, str2, amount2, str3, str9, sessionSetupConfiguration2, str8, environment2, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SessionSetupConfiguration getSessionSetupConfiguration() {
        return this.sessionSetupConfiguration;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getShopperLocale() {
        return this.shopperLocale;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getClientKey() {
        return this.clientKey;
    }

    @NotNull
    public final SessionDetails copy(@NotNull String id2, @NotNull String sessionData, @Nullable Amount amount, @NotNull String expiresAt, @Nullable String returnUrl, @Nullable SessionSetupConfiguration sessionSetupConfiguration, @Nullable String shopperLocale, @NotNull Environment environment, @NotNull String clientKey) {
        id2.getClass();
        sessionData.getClass();
        expiresAt.getClass();
        environment.getClass();
        clientKey.getClass();
        return new SessionDetails(id2, sessionData, amount, expiresAt, returnUrl, sessionSetupConfiguration, shopperLocale, environment, clientKey);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) other;
        return Intrinsics.areEqual(this.id, sessionDetails.id) && Intrinsics.areEqual(this.sessionData, sessionDetails.sessionData) && Intrinsics.areEqual(this.amount, sessionDetails.amount) && Intrinsics.areEqual(this.expiresAt, sessionDetails.expiresAt) && Intrinsics.areEqual(this.returnUrl, sessionDetails.returnUrl) && Intrinsics.areEqual(this.sessionSetupConfiguration, sessionDetails.sessionSetupConfiguration) && Intrinsics.areEqual(this.shopperLocale, sessionDetails.shopperLocale) && Intrinsics.areEqual(this.environment, sessionDetails.environment) && Intrinsics.areEqual(this.clientKey, sessionDetails.clientKey);
    }

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getClientKey() {
        return this.clientKey;
    }

    @NotNull
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @NotNull
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    public final SessionSetupConfiguration getSessionSetupConfiguration() {
        return this.sessionSetupConfiguration;
    }

    @Nullable
    public final String getShopperLocale() {
        return this.shopperLocale;
    }

    public int hashCode() {
        int iB = l1.b(this.id.hashCode() * 31, 31, this.sessionData);
        Amount amount = this.amount;
        int iB2 = l1.b((iB + (amount == null ? 0 : amount.hashCode())) * 31, 31, this.expiresAt);
        String str = this.returnUrl;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        SessionSetupConfiguration sessionSetupConfiguration = this.sessionSetupConfiguration;
        int iHashCode2 = (iHashCode + (sessionSetupConfiguration == null ? 0 : sessionSetupConfiguration.hashCode())) * 31;
        String str2 = this.shopperLocale;
        return this.clientKey.hashCode() + ((this.environment.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.sessionData;
        Amount amount = this.amount;
        String str3 = this.expiresAt;
        String str4 = this.returnUrl;
        SessionSetupConfiguration sessionSetupConfiguration = this.sessionSetupConfiguration;
        String str5 = this.shopperLocale;
        Environment environment = this.environment;
        String str6 = this.clientKey;
        StringBuilder sbT = f.t("SessionDetails(id=", str, ", sessionData=", str2, ", amount=");
        sbT.append(amount);
        sbT.append(", expiresAt=");
        sbT.append(str3);
        sbT.append(", returnUrl=");
        sbT.append(str4);
        sbT.append(", sessionSetupConfiguration=");
        sbT.append(sessionSetupConfiguration);
        sbT.append(", shopperLocale=");
        sbT.append(str5);
        sbT.append(", environment=");
        sbT.append(environment);
        sbT.append(", clientKey=");
        return k.p(sbT, str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.sessionData);
        parcel.writeParcelable(this.amount, flags);
        parcel.writeString(this.expiresAt);
        parcel.writeString(this.returnUrl);
        SessionSetupConfiguration sessionSetupConfiguration = this.sessionSetupConfiguration;
        if (sessionSetupConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sessionSetupConfiguration.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.shopperLocale);
        parcel.writeParcelable(this.environment, flags);
        parcel.writeString(this.clientKey);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionDetails createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionDetails(parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(SessionDetails.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SessionSetupConfiguration.CREATOR.createFromParcel(parcel), parcel.readString(), (Environment) parcel.readParcelable(SessionDetails.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionDetails[] newArray(int i11) {
            return new SessionDetails[i11];
        }
    }
}
