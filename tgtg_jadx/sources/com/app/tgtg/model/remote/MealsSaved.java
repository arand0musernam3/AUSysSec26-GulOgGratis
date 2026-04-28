package com.app.tgtg.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.l0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 92\u00020\u0001:\u0002:9BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010 \u0012\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010 \u0012\u0004\b)\u0010&\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010*\u0012\u0004\b/\u0010&\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010*\u0012\u0004\b2\u0010&\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R*\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010 \u0012\u0004\b5\u0010&\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R*\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010*\u0012\u0004\b8\u0010&\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.¨\u0006;"}, d2 = {"Lcom/app/tgtg/model/remote/MealsSaved;", "Landroid/os/Parcelable;", "", "countryIsoCode", "imageUrl", "", "mealsSavedLastMonth", "month", "sharingUrl", "year", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/MealsSaved;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCountryIsoCode", "()Ljava/lang/String;", "setCountryIsoCode", "(Ljava/lang/String;)V", "getCountryIsoCode$annotations", "()V", "getImageUrl", "setImageUrl", "getImageUrl$annotations", "Ljava/lang/Integer;", "getMealsSavedLastMonth", "()Ljava/lang/Integer;", "setMealsSavedLastMonth", "(Ljava/lang/Integer;)V", "getMealsSavedLastMonth$annotations", "getMonth", "setMonth", "getMonth$annotations", "getSharingUrl", "setSharingUrl", "getSharingUrl$annotations", "getYear", "setYear", "getYear$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MealsSaved implements Parcelable {

    @Nullable
    private String countryIsoCode;

    @Nullable
    private String imageUrl;

    @Nullable
    private Integer mealsSavedLastMonth;

    @Nullable
    private Integer month;

    @Nullable
    private String sharingUrl;

    @Nullable
    private Integer year;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MealsSaved> CREATOR = new Creator();

    public /* synthetic */ MealsSaved(int i11, String str, String str2, Integer num, Integer num2, String str3, Integer num3, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.countryIsoCode = null;
        } else {
            this.countryIsoCode = str;
        }
        if ((i11 & 2) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str2;
        }
        if ((i11 & 4) == 0) {
            this.mealsSavedLastMonth = null;
        } else {
            this.mealsSavedLastMonth = num;
        }
        if ((i11 & 8) == 0) {
            this.month = null;
        } else {
            this.month = num2;
        }
        if ((i11 & 16) == 0) {
            this.sharingUrl = null;
        } else {
            this.sharingUrl = str3;
        }
        if ((i11 & 32) == 0) {
            this.year = null;
        } else {
            this.year = num3;
        }
    }

    public static final /* synthetic */ void write$Self$app(MealsSaved self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.countryIsoCode != null) {
            output.r(serialDesc, 0, r1.f29848a, self.countryIsoCode);
        }
        if (output.C(serialDesc) || self.imageUrl != null) {
            output.r(serialDesc, 1, r1.f29848a, self.imageUrl);
        }
        if (output.C(serialDesc) || self.mealsSavedLastMonth != null) {
            output.r(serialDesc, 2, l0.f29821a, self.mealsSavedLastMonth);
        }
        if (output.C(serialDesc) || self.month != null) {
            output.r(serialDesc, 3, l0.f29821a, self.month);
        }
        if (output.C(serialDesc) || self.sharingUrl != null) {
            output.r(serialDesc, 4, r1.f29848a, self.sharingUrl);
        }
        if (!output.C(serialDesc) && self.year == null) {
            return;
        }
        output.r(serialDesc, 5, l0.f29821a, self.year);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final String getCountryIsoCode() {
        return this.countryIsoCode;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final Integer getMealsSavedLastMonth() {
        return this.mealsSavedLastMonth;
    }

    @Nullable
    public final Integer getMonth() {
        return this.month;
    }

    @Nullable
    public final String getSharingUrl() {
        return this.sharingUrl;
    }

    @Nullable
    public final Integer getYear() {
        return this.year;
    }

    public final void setCountryIsoCode(@Nullable String str) {
        this.countryIsoCode = str;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setMealsSavedLastMonth(@Nullable Integer num) {
        this.mealsSavedLastMonth = num;
    }

    public final void setMonth(@Nullable Integer num) {
        this.month = num;
    }

    public final void setSharingUrl(@Nullable String str) {
        this.sharingUrl = str;
    }

    public final void setYear(@Nullable Integer num) {
        this.year = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.countryIsoCode);
        dest.writeString(this.imageUrl);
        Integer num = this.mealsSavedLastMonth;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        Integer num2 = this.month;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num2);
        }
        dest.writeString(this.sharingUrl);
        Integer num3 = this.year;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/MealsSaved$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/MealsSaved;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MealsSaved$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MealsSaved> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MealsSaved createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MealsSaved(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MealsSaved[] newArray(int i11) {
            return new MealsSaved[i11];
        }
    }

    @g("country_iso_code")
    public static /* synthetic */ void getCountryIsoCode$annotations() {
    }

    @g("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @g("meals_saved_last_month")
    public static /* synthetic */ void getMealsSavedLastMonth$annotations() {
    }

    @g("month")
    public static /* synthetic */ void getMonth$annotations() {
    }

    @g("share_url")
    public static /* synthetic */ void getSharingUrl$annotations() {
    }

    @g("year")
    public static /* synthetic */ void getYear$annotations() {
    }

    public MealsSaved() {
        this((String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Integer) null, 63, (DefaultConstructorMarker) null);
    }

    public MealsSaved(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable Integer num3) {
        this.countryIsoCode = str;
        this.imageUrl = str2;
        this.mealsSavedLastMonth = num;
        this.month = num2;
        this.sharingUrl = str3;
        this.year = num3;
    }

    public /* synthetic */ MealsSaved(String str, String str2, Integer num, Integer num2, String str3, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : num3);
    }
}
