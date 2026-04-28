package com.app.tgtg.model.remote.widgets.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.braze.Constants;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.d;
import m90.m1;
import m90.r1;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import zendesk.ui.android.conversation.composer.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002>?B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ8\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0019J\u0010\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010.\u0012\u0004\b2\u00103\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u00101R0\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00104\u0012\u0004\b8\u00103\u001a\u0004\b5\u0010#\"\u0004\b6\u00107R(\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00109\u0012\u0004\b=\u00103\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetResponse;", "Landroid/os/Parcelable;", "", "currentTime", "", "Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetItem;", "items", "", "noOfFavourites", "<init>", "(Ljava/lang/String;Ljava/util/List;I)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toJson", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;I)Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrentTime", "setCurrentTime", "(Ljava/lang/String;)V", "getCurrentTime$annotations", "()V", "Ljava/util/List;", "getItems", "setItems", "(Ljava/util/List;)V", "getItems$annotations", "I", "getNoOfFavourites", "setNoOfFavourites", "(I)V", "getNoOfFavourites$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class FavouriteWidgetResponse implements Parcelable {

    @Nullable
    private String currentTime;

    @Nullable
    private List<FavouriteWidgetItem> items;
    private int noOfFavourites;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FavouriteWidgetResponse> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new b(22)), null};

    public /* synthetic */ FavouriteWidgetResponse(int i11, String str, List list, int i12, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.currentTime = null;
        } else {
            this.currentTime = str;
        }
        if ((i11 & 2) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
        if ((i11 & 4) == 0) {
            this.noOfFavourites = 0;
        } else {
            this.noOfFavourites = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(FavouriteWidgetItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavouriteWidgetResponse copy$default(FavouriteWidgetResponse favouriteWidgetResponse, String str, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = favouriteWidgetResponse.currentTime;
        }
        if ((i12 & 2) != 0) {
            list = favouriteWidgetResponse.items;
        }
        if ((i12 & 4) != 0) {
            i11 = favouriteWidgetResponse.noOfFavourites;
        }
        return favouriteWidgetResponse.copy(str, list, i11);
    }

    @NotNull
    public static final FavouriteWidgetResponse fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    public static final /* synthetic */ void write$Self$app(FavouriteWidgetResponse self, l90.b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.currentTime != null) {
            output.r(serialDesc, 0, r1.f29848a, self.currentTime);
        }
        if (output.C(serialDesc) || self.items != null) {
            output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.items);
        }
        if (!output.C(serialDesc) && self.noOfFavourites == 0) {
            return;
        }
        output.m(2, self.noOfFavourites, serialDesc);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrentTime() {
        return this.currentTime;
    }

    @Nullable
    public final List<FavouriteWidgetItem> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNoOfFavourites() {
        return this.noOfFavourites;
    }

    @NotNull
    public final FavouriteWidgetResponse copy(@Nullable String currentTime, @Nullable List<FavouriteWidgetItem> items, int noOfFavourites) {
        return new FavouriteWidgetResponse(currentTime, items, noOfFavourites);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavouriteWidgetResponse)) {
            return false;
        }
        FavouriteWidgetResponse favouriteWidgetResponse = (FavouriteWidgetResponse) other;
        return Intrinsics.areEqual(this.currentTime, favouriteWidgetResponse.currentTime) && Intrinsics.areEqual(this.items, favouriteWidgetResponse.items) && this.noOfFavourites == favouriteWidgetResponse.noOfFavourites;
    }

    @Nullable
    public final String getCurrentTime() {
        return this.currentTime;
    }

    @Nullable
    public final List<FavouriteWidgetItem> getItems() {
        return this.items;
    }

    public final int getNoOfFavourites() {
        return this.noOfFavourites;
    }

    public int hashCode() {
        String str = this.currentTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<FavouriteWidgetItem> list = this.items;
        return Integer.hashCode(this.noOfFavourites) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final void setCurrentTime(@Nullable String str) {
        this.currentTime = str;
    }

    public final void setItems(@Nullable List<FavouriteWidgetItem> list) {
        this.items = list;
    }

    public final void setNoOfFavourites(int i11) {
        this.noOfFavourites = i11;
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        String str = this.currentTime;
        List<FavouriteWidgetItem> list = this.items;
        int i11 = this.noOfFavourites;
        StringBuilder sb2 = new StringBuilder("FavouriteWidgetResponse(currentTime=");
        sb2.append(str);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", noOfFavourites=");
        return k.i(i11, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.currentTime);
        List<FavouriteWidgetItem> list = this.items;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((FavouriteWidgetItem) itQ.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.noOfFavourites);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetResponse$Companion;", "", "<init>", "()V", "fromJson", "Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetResponse;", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FavouriteWidgetResponse fromJson(@NotNull String s7) {
            s7.getClass();
            return (FavouriteWidgetResponse) c.f30748d.b(serializer(), s7);
        }

        @NotNull
        public final KSerializer serializer() {
            return FavouriteWidgetResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavouriteWidgetResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FavouriteWidgetResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                int iC = 0;
                while (iC != i11) {
                    iC = i.c(FavouriteWidgetItem.CREATOR, parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            return new FavouriteWidgetResponse(string, arrayList, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FavouriteWidgetResponse[] newArray(int i11) {
            return new FavouriteWidgetResponse[i11];
        }
    }

    @g("current_time")
    public static /* synthetic */ void getCurrentTime$annotations() {
    }

    @g("item_responses")
    public static /* synthetic */ void getItems$annotations() {
    }

    @g("number_of_favorites")
    public static /* synthetic */ void getNoOfFavourites$annotations() {
    }

    public FavouriteWidgetResponse() {
        this((String) null, (List) null, 0, 7, (DefaultConstructorMarker) null);
    }

    public FavouriteWidgetResponse(@Nullable String str, @Nullable List<FavouriteWidgetItem> list, int i11) {
        this.currentTime = str;
        this.items = list;
        this.noOfFavourites = i11;
    }

    public /* synthetic */ FavouriteWidgetResponse(String str, List list, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? 0 : i11);
    }
}
