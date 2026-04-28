package com.app.tgtg.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.Constants;
import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.g0;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000234B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J4\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010\u0017¨\u00065"}, d2 = {"Lcom/app/tgtg/model/remote/RewardSurveyInfo;", "Landroid/os/Parcelable;", "", "dateUtc", "storeName", "discountPercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/RewardSurveyInfo;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toJson", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/RewardSurveyInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDateUtc", "getDateUtc$annotations", "()V", "getStoreName", "getStoreName$annotations", "getDiscountPercentage", "getDiscountPercentage$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RewardSurveyInfo implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String dateUtc;

    @Nullable
    private final String discountPercentage;

    @Nullable
    private final String storeName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<RewardSurveyInfo> CREATOR = new Creator();

    @NotNull
    private static final c json = w.h(new g0(3));

    public /* synthetic */ RewardSurveyInfo(int i11, String str, String str2, String str3, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, RewardSurveyInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.dateUtc = str;
        this.storeName = str2;
        this.discountPercentage = str3;
    }

    public static /* synthetic */ RewardSurveyInfo copy$default(RewardSurveyInfo rewardSurveyInfo, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rewardSurveyInfo.dateUtc;
        }
        if ((i11 & 2) != 0) {
            str2 = rewardSurveyInfo.storeName;
        }
        if ((i11 & 4) != 0) {
            str3 = rewardSurveyInfo.discountPercentage;
        }
        return rewardSurveyInfo.copy(str, str2, str3);
    }

    @NotNull
    public static final RewardSurveyInfo fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(n90.h hVar) {
        hVar.getClass();
        hVar.f30766c = true;
        return Unit.f26487a;
    }

    public static final /* synthetic */ void write$Self$app(RewardSurveyInfo self, b output, SerialDescriptor serialDesc) {
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.dateUtc);
        output.r(serialDesc, 1, r1Var, self.storeName);
        output.r(serialDesc, 2, r1Var, self.discountPercentage);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDateUtc() {
        return this.dateUtc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDiscountPercentage() {
        return this.discountPercentage;
    }

    @NotNull
    public final RewardSurveyInfo copy(@Nullable String dateUtc, @Nullable String storeName, @Nullable String discountPercentage) {
        return new RewardSurveyInfo(dateUtc, storeName, discountPercentage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardSurveyInfo)) {
            return false;
        }
        RewardSurveyInfo rewardSurveyInfo = (RewardSurveyInfo) other;
        return Intrinsics.areEqual(this.dateUtc, rewardSurveyInfo.dateUtc) && Intrinsics.areEqual(this.storeName, rewardSurveyInfo.storeName) && Intrinsics.areEqual(this.discountPercentage, rewardSurveyInfo.discountPercentage);
    }

    @Nullable
    public final String getDateUtc() {
        return this.dateUtc;
    }

    @Nullable
    public final String getDiscountPercentage() {
        return this.discountPercentage;
    }

    @Nullable
    public final String getStoreName() {
        return this.storeName;
    }

    public int hashCode() {
        String str = this.dateUtc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.storeName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discountPercentage;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        String str = this.dateUtc;
        String str2 = this.storeName;
        return k.p(f.t("RewardSurveyInfo(dateUtc=", str, ", storeName=", str2, ", discountPercentage="), this.discountPercentage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.dateUtc);
        dest.writeString(this.storeName);
        dest.writeString(this.discountPercentage);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/remote/RewardSurveyInfo$Companion;", "", "<init>", "()V", "", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "Lcom/app/tgtg/model/remote/RewardSurveyInfo;", "fromJson", "(Ljava/lang/String;)Lcom/app/tgtg/model/remote/RewardSurveyInfo;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Ln90/c;", "json", "Ln90/c;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RewardSurveyInfo fromJson(@NotNull String s7) {
            s7.getClass();
            return (RewardSurveyInfo) RewardSurveyInfo.json.b(serializer(), s7);
        }

        @NotNull
        public final KSerializer serializer() {
            return RewardSurveyInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardSurveyInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardSurveyInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new RewardSurveyInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardSurveyInfo[] newArray(int i11) {
            return new RewardSurveyInfo[i11];
        }
    }

    @g("date_utc")
    public static /* synthetic */ void getDateUtc$annotations() {
    }

    @g("discount_percentage")
    public static /* synthetic */ void getDiscountPercentage$annotations() {
    }

    @g("store_name")
    public static /* synthetic */ void getStoreName$annotations() {
    }

    public RewardSurveyInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.dateUtc = str;
        this.storeName = str2;
        this.discountPercentage = str3;
    }
}
