package com.app.tgtg.model.remote.item.requests;

import com.appsflyer.AdRevenueScheme;
import e0.f;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.g;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002:;B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010+R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010(\u0012\u0004\b0\u0010-\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010+R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010(\u0012\u0004\b3\u0010-\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010+R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00104\u0012\u0004\b7\u0010-\u001a\u0004\b\u0007\u0010\u001e\"\u0004\b5\u00106R*\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00104\u0012\u0004\b9\u0010-\u001a\u0004\b\b\u0010\u001e\"\u0004\b8\u00106¨\u0006<"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/ConsentScreenEventRequest;", "", "", "uuid", "eventType", AdRevenueScheme.COUNTRY, "", "isLoggedIn", "isFromDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/requests/ConsentScreenEventRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/item/requests/ConsentScreenEventRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "setUuid", "(Ljava/lang/String;)V", "getUuid$annotations", "()V", "getEventType", "setEventType", "getEventType$annotations", "getCountry", "setCountry", "getCountry$annotations", "Ljava/lang/Boolean;", "setLoggedIn", "(Ljava/lang/Boolean;)V", "isLoggedIn$annotations", "setFromDeeplink", "isFromDeeplink$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ConsentScreenEventRequest {

    @NotNull
    public static final String AFTER_COOKIE_CONSENT = "AFTER_COOKIE_CONSENT";

    @NotNull
    public static final String BEFORE_COOKIE_CONSENT = "BEFORE_COOKIE_CONSENT";

    @Nullable
    private String country;

    @NotNull
    private String eventType;

    @Nullable
    private Boolean isFromDeeplink;

    @Nullable
    private Boolean isLoggedIn;

    @NotNull
    private String uuid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ConsentScreenEventRequest(int i11, String str, String str2, String str3, Boolean bool, Boolean bool2, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, ConsentScreenEventRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.eventType = str2;
        this.country = str3;
        this.isLoggedIn = bool;
        this.isFromDeeplink = bool2;
    }

    public static /* synthetic */ ConsentScreenEventRequest copy$default(ConsentScreenEventRequest consentScreenEventRequest, String str, String str2, String str3, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = consentScreenEventRequest.uuid;
        }
        if ((i11 & 2) != 0) {
            str2 = consentScreenEventRequest.eventType;
        }
        if ((i11 & 4) != 0) {
            str3 = consentScreenEventRequest.country;
        }
        if ((i11 & 8) != 0) {
            bool = consentScreenEventRequest.isLoggedIn;
        }
        if ((i11 & 16) != 0) {
            bool2 = consentScreenEventRequest.isFromDeeplink;
        }
        Boolean bool3 = bool2;
        String str4 = str3;
        return consentScreenEventRequest.copy(str, str2, str4, bool, bool3);
    }

    public static final /* synthetic */ void write$Self$app(ConsentScreenEventRequest self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.uuid);
        output.q(serialDesc, 1, self.eventType);
        output.r(serialDesc, 2, r1.f29848a, self.country);
        g gVar = g.f29797a;
        output.r(serialDesc, 3, gVar, self.isLoggedIn);
        output.r(serialDesc, 4, gVar, self.isFromDeeplink);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsFromDeeplink() {
        return this.isFromDeeplink;
    }

    @NotNull
    public final ConsentScreenEventRequest copy(@NotNull String uuid, @NotNull String eventType, @Nullable String country, @Nullable Boolean isLoggedIn, @Nullable Boolean isFromDeeplink) {
        uuid.getClass();
        eventType.getClass();
        return new ConsentScreenEventRequest(uuid, eventType, country, isLoggedIn, isFromDeeplink);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentScreenEventRequest)) {
            return false;
        }
        ConsentScreenEventRequest consentScreenEventRequest = (ConsentScreenEventRequest) other;
        return Intrinsics.areEqual(this.uuid, consentScreenEventRequest.uuid) && Intrinsics.areEqual(this.eventType, consentScreenEventRequest.eventType) && Intrinsics.areEqual(this.country, consentScreenEventRequest.country) && Intrinsics.areEqual(this.isLoggedIn, consentScreenEventRequest.isLoggedIn) && Intrinsics.areEqual(this.isFromDeeplink, consentScreenEventRequest.isFromDeeplink);
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iB = l1.b(this.uuid.hashCode() * 31, 31, this.eventType);
        String str = this.country;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isLoggedIn;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFromDeeplink;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isFromDeeplink() {
        return this.isFromDeeplink;
    }

    @Nullable
    public final Boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setEventType(@NotNull String str) {
        str.getClass();
        this.eventType = str;
    }

    public final void setFromDeeplink(@Nullable Boolean bool) {
        this.isFromDeeplink = bool;
    }

    public final void setLoggedIn(@Nullable Boolean bool) {
        this.isLoggedIn = bool;
    }

    public final void setUuid(@NotNull String str) {
        str.getClass();
        this.uuid = str;
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        String str2 = this.eventType;
        String str3 = this.country;
        Boolean bool = this.isLoggedIn;
        Boolean bool2 = this.isFromDeeplink;
        StringBuilder sbT = f.t("ConsentScreenEventRequest(uuid=", str, ", eventType=", str2, ", country=");
        sbT.append(str3);
        sbT.append(", isLoggedIn=");
        sbT.append(bool);
        sbT.append(", isFromDeeplink=");
        sbT.append(bool2);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/remote/item/requests/ConsentScreenEventRequest$Companion;", "", "<init>", "()V", ConsentScreenEventRequest.BEFORE_COOKIE_CONSENT, "", ConsentScreenEventRequest.AFTER_COOKIE_CONSENT, "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/requests/ConsentScreenEventRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ConsentScreenEventRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @i90.g("country_code")
    public static /* synthetic */ void getCountry$annotations() {
    }

    @i90.g("event_type")
    public static /* synthetic */ void getEventType$annotations() {
    }

    @i90.g("uuid")
    public static /* synthetic */ void getUuid$annotations() {
    }

    @i90.g("is_from_deeplink")
    public static /* synthetic */ void isFromDeeplink$annotations() {
    }

    @i90.g("is_logged_in")
    public static /* synthetic */ void isLoggedIn$annotations() {
    }

    public ConsentScreenEventRequest(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        str.getClass();
        str2.getClass();
        this.uuid = str;
        this.eventType = str2;
        this.country = str3;
        this.isLoggedIn = bool;
        this.isFromDeeplink = bool2;
    }
}
