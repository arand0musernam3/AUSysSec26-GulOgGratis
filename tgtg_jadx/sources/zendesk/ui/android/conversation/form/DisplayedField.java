package zendesk.ui.android.conversation.form;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lzendesk/ui/android/conversation/form/DisplayedField;", "Landroid/os/Parcelable;", "index", "", "value", "", "<init>", "(ILjava/lang/String;)V", "getIndex", "()I", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DisplayedField implements Parcelable {
    private final int index;

    @Nullable
    private final String value;

    @NotNull
    public static final Parcelable.Creator<DisplayedField> CREATOR = new Creator();
    public static final int $stable = 8;

    public /* synthetic */ DisplayedField(int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ DisplayedField copy$default(DisplayedField displayedField, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = displayedField.index;
        }
        if ((i12 & 2) != 0) {
            str = displayedField.value;
        }
        return displayedField.copy(i11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final DisplayedField copy(int index, @Nullable String value) {
        return new DisplayedField(index, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayedField)) {
            return false;
        }
        DisplayedField displayedField = (DisplayedField) other;
        return this.index == displayedField.index && Intrinsics.areEqual(this.value, displayedField.value);
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        String str = this.value;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "DisplayedField(index=" + this.index + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.index);
        dest.writeString(this.value);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DisplayedField> {
        @Override // android.os.Parcelable.Creator
        public final DisplayedField createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new DisplayedField(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DisplayedField[] newArray(int i11) {
            return new DisplayedField[i11];
        }
    }

    public DisplayedField(int i11, @Nullable String str) {
        this.index = i11;
        this.value = str;
    }
}
