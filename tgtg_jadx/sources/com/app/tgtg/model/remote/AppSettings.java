package com.app.tgtg.model.remote;

import a40.i;
import com.braze.Constants;
import e0.f;
import i90.g;
import i90.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.h0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import m90.r1;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w2.g0;
import wt.a;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002HIBs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0007¢\u0006\u0004\b\f\u0010\rBc\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J$\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J$\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J|\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010/\u0012\u0004\b3\u00104\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u00102R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010/\u0012\u0004\b7\u00104\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u00102R<\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00108\u0012\u0004\b<\u00104\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010;R*\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010/\u0012\u0004\b?\u00104\u001a\u0004\b=\u0010\u0014\"\u0004\b>\u00102R*\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010/\u0012\u0004\bB\u00104\u001a\u0004\b@\u0010\u0014\"\u0004\bA\u00102R<\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u00108\u0012\u0004\bE\u00104\u001a\u0004\bC\u0010\u0016\"\u0004\bD\u0010;R\u0011\u0010F\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/app/tgtg/model/remote/AppSettings;", "", "", "openMessageUrl", "onAppOpenMessage", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/remote/Country;", "Lkotlin/collections/ArrayList;", "countries", "purchaseRatingEnd", "purchaseRatingStart", "webViewHostAllowlist", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lm90/m1;)V", "toJson", "()Ljava/lang/String;", "getSortedCountries", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/app/tgtg/model/remote/AppSettings;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/AppSettings;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOpenMessageUrl", "setOpenMessageUrl", "(Ljava/lang/String;)V", "getOpenMessageUrl$annotations", "()V", "getOnAppOpenMessage", "setOnAppOpenMessage", "getOnAppOpenMessage$annotations", "Ljava/util/ArrayList;", "getCountries", "setCountries", "(Ljava/util/ArrayList;)V", "getCountries$annotations", "getPurchaseRatingEnd", "setPurchaseRatingEnd", "getPurchaseRatingEnd$annotations", "getPurchaseRatingStart", "setPurchaseRatingStart", "getPurchaseRatingStart$annotations", "getWebViewHostAllowlist", "setWebViewHostAllowlist", "getWebViewHostAllowlist$annotations", "isEmpty", "()Z", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AppSettings {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private static final c json;

    @Nullable
    private ArrayList<Country> countries;

    @Nullable
    private String onAppOpenMessage;

    @Nullable
    private String openMessageUrl;

    @Nullable
    private String purchaseRatingEnd;

    @Nullable
    private String purchaseRatingStart;

    @Nullable
    private ArrayList<String> webViewHostAllowlist;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, l.a(mVar, new a(0)), null, null, l.a(mVar, new a(1))};
        json = w.h(new g0(2));
    }

    public /* synthetic */ AppSettings(int i11, String str, String str2, ArrayList arrayList, String str3, String str4, ArrayList arrayList2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.openMessageUrl = null;
        } else {
            this.openMessageUrl = str;
        }
        if ((i11 & 2) == 0) {
            this.onAppOpenMessage = null;
        } else {
            this.onAppOpenMessage = str2;
        }
        if ((i11 & 4) == 0) {
            this.countries = null;
        } else {
            this.countries = arrayList;
        }
        if ((i11 & 8) == 0) {
            this.purchaseRatingEnd = null;
        } else {
            this.purchaseRatingEnd = str3;
        }
        if ((i11 & 16) == 0) {
            this.purchaseRatingStart = null;
        } else {
            this.purchaseRatingStart = str4;
        }
        if ((i11 & 32) == 0) {
            this.webViewHostAllowlist = null;
        } else {
            this.webViewHostAllowlist = arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Country$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppSettings copy$default(AppSettings appSettings, String str, String str2, ArrayList arrayList, String str3, String str4, ArrayList arrayList2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appSettings.openMessageUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = appSettings.onAppOpenMessage;
        }
        if ((i11 & 4) != 0) {
            arrayList = appSettings.countries;
        }
        if ((i11 & 8) != 0) {
            str3 = appSettings.purchaseRatingEnd;
        }
        if ((i11 & 16) != 0) {
            str4 = appSettings.purchaseRatingStart;
        }
        if ((i11 & 32) != 0) {
            arrayList2 = appSettings.webViewHostAllowlist;
        }
        String str5 = str4;
        ArrayList arrayList3 = arrayList2;
        return appSettings.copy(str, str2, arrayList, str3, str5, arrayList3);
    }

    @NotNull
    public static final AppSettings fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSortedCountries$lambda$0(Country country, Country country2) {
        return country.getDisplayName().compareTo(country2.getDisplayName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(n90.h hVar) {
        hVar.getClass();
        hVar.f30766c = true;
        return Unit.f26487a;
    }

    public static final /* synthetic */ void write$Self$app(AppSettings self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.openMessageUrl != null) {
            output.r(serialDesc, 0, r1.f29848a, self.openMessageUrl);
        }
        if (output.C(serialDesc) || self.onAppOpenMessage != null) {
            output.r(serialDesc, 1, r1.f29848a, self.onAppOpenMessage);
        }
        if (output.C(serialDesc) || self.countries != null) {
            output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.countries);
        }
        if (output.C(serialDesc) || self.purchaseRatingEnd != null) {
            output.r(serialDesc, 3, r1.f29848a, self.purchaseRatingEnd);
        }
        if (output.C(serialDesc) || self.purchaseRatingStart != null) {
            output.r(serialDesc, 4, r1.f29848a, self.purchaseRatingStart);
        }
        if (!output.C(serialDesc) && self.webViewHostAllowlist == null) {
            return;
        }
        output.r(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.webViewHostAllowlist);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOpenMessageUrl() {
        return this.openMessageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOnAppOpenMessage() {
        return this.onAppOpenMessage;
    }

    @Nullable
    public final ArrayList<Country> component3() {
        return this.countries;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPurchaseRatingEnd() {
        return this.purchaseRatingEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPurchaseRatingStart() {
        return this.purchaseRatingStart;
    }

    @Nullable
    public final ArrayList<String> component6() {
        return this.webViewHostAllowlist;
    }

    @NotNull
    public final AppSettings copy(@Nullable String openMessageUrl, @Nullable String onAppOpenMessage, @Nullable ArrayList<Country> countries, @Nullable String purchaseRatingEnd, @Nullable String purchaseRatingStart, @Nullable ArrayList<String> webViewHostAllowlist) {
        return new AppSettings(openMessageUrl, onAppOpenMessage, countries, purchaseRatingEnd, purchaseRatingStart, webViewHostAllowlist);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppSettings)) {
            return false;
        }
        AppSettings appSettings = (AppSettings) other;
        return Intrinsics.areEqual(this.openMessageUrl, appSettings.openMessageUrl) && Intrinsics.areEqual(this.onAppOpenMessage, appSettings.onAppOpenMessage) && Intrinsics.areEqual(this.countries, appSettings.countries) && Intrinsics.areEqual(this.purchaseRatingEnd, appSettings.purchaseRatingEnd) && Intrinsics.areEqual(this.purchaseRatingStart, appSettings.purchaseRatingStart) && Intrinsics.areEqual(this.webViewHostAllowlist, appSettings.webViewHostAllowlist);
    }

    @Nullable
    public final ArrayList<Country> getCountries() {
        return this.countries;
    }

    @Nullable
    public final String getOnAppOpenMessage() {
        return this.onAppOpenMessage;
    }

    @Nullable
    public final String getOpenMessageUrl() {
        return this.openMessageUrl;
    }

    @Nullable
    public final String getPurchaseRatingEnd() {
        return this.purchaseRatingEnd;
    }

    @Nullable
    public final String getPurchaseRatingStart() {
        return this.purchaseRatingStart;
    }

    @Nullable
    public final ArrayList<Country> getSortedCountries() {
        ArrayList<Country> arrayList = this.countries;
        if (arrayList == null) {
            return null;
        }
        arrayList.getClass();
        h0.r(arrayList, new i(14));
        return this.countries;
    }

    @Nullable
    public final ArrayList<String> getWebViewHostAllowlist() {
        return this.webViewHostAllowlist;
    }

    public int hashCode() {
        String str = this.openMessageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.onAppOpenMessage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<Country> arrayList = this.countries;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str3 = this.purchaseRatingEnd;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.purchaseRatingStart;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArrayList<String> arrayList2 = this.webViewHostAllowlist;
        return iHashCode5 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.countries == null;
    }

    public final void setCountries(@Nullable ArrayList<Country> arrayList) {
        this.countries = arrayList;
    }

    public final void setOnAppOpenMessage(@Nullable String str) {
        this.onAppOpenMessage = str;
    }

    public final void setOpenMessageUrl(@Nullable String str) {
        this.openMessageUrl = str;
    }

    public final void setPurchaseRatingEnd(@Nullable String str) {
        this.purchaseRatingEnd = str;
    }

    public final void setPurchaseRatingStart(@Nullable String str) {
        this.purchaseRatingStart = str;
    }

    public final void setWebViewHostAllowlist(@Nullable ArrayList<String> arrayList) {
        this.webViewHostAllowlist = arrayList;
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        String str = this.openMessageUrl;
        String str2 = this.onAppOpenMessage;
        ArrayList<Country> arrayList = this.countries;
        String str3 = this.purchaseRatingEnd;
        String str4 = this.purchaseRatingStart;
        ArrayList<String> arrayList2 = this.webViewHostAllowlist;
        StringBuilder sbT = f.t("AppSettings(openMessageUrl=", str, ", onAppOpenMessage=", str2, ", countries=");
        sbT.append(arrayList);
        sbT.append(", purchaseRatingEnd=");
        sbT.append(str3);
        sbT.append(", purchaseRatingStart=");
        sbT.append(str4);
        sbT.append(", webViewHostAllowlist=");
        sbT.append(arrayList2);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/remote/AppSettings$Companion;", "", "<init>", "()V", "", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "Lcom/app/tgtg/model/remote/AppSettings;", "fromJson", "(Ljava/lang/String;)Lcom/app/tgtg/model/remote/AppSettings;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Ln90/c;", "json", "Ln90/c;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppSettings fromJson(@NotNull String s7) {
            s7.getClass();
            return (AppSettings) AppSettings.json.b(serializer(), s7);
        }

        @NotNull
        public final KSerializer serializer() {
            return AppSettings$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("countries")
    public static /* synthetic */ void getCountries$annotations() {
    }

    @g("on_app_open_message")
    public static /* synthetic */ void getOnAppOpenMessage$annotations() {
    }

    @g("open_message_url")
    public static /* synthetic */ void getOpenMessageUrl$annotations() {
    }

    @g("purchase_rating_end")
    public static /* synthetic */ void getPurchaseRatingEnd$annotations() {
    }

    @g("purchase_rating_start")
    public static /* synthetic */ void getPurchaseRatingStart$annotations() {
    }

    @g("webview_host_allowlist")
    public static /* synthetic */ void getWebViewHostAllowlist$annotations() {
    }

    public AppSettings() {
        this((String) null, (String) null, (ArrayList) null, (String) null, (String) null, (ArrayList) null, 63, (DefaultConstructorMarker) null);
    }

    public AppSettings(@Nullable String str, @Nullable String str2, @Nullable ArrayList<Country> arrayList, @Nullable String str3, @Nullable String str4, @Nullable ArrayList<String> arrayList2) {
        this.openMessageUrl = str;
        this.onAppOpenMessage = str2;
        this.countries = arrayList;
        this.purchaseRatingEnd = str3;
        this.purchaseRatingStart = str4;
        this.webViewHostAllowlist = arrayList2;
    }

    public /* synthetic */ AppSettings(String str, String str2, ArrayList arrayList, String str3, String str4, ArrayList arrayList2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : arrayList, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : arrayList2);
    }
}
