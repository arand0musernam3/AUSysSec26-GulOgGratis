package zendesk.messaging.android.internal.validation.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0001HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/FieldData;", "", "id", "", "value", "regex", "options", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "getRegex", "getOptions", "()Ljava/util/List;", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FieldData {

    @NotNull
    private final String id;

    @Nullable
    private final List<String> options;

    @Nullable
    private final String regex;

    @NotNull
    private final String type;

    @NotNull
    private final Object value;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FieldData(String str, Object obj, String str2, List list, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        List list2;
        str2 = (i11 & 4) != 0 ? null : str2;
        if ((i11 & 8) != 0) {
            str4 = str3;
            list2 = null;
        } else {
            str4 = str3;
            list2 = list;
        }
        this(str, obj, str2, list2, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FieldData copy$default(FieldData fieldData, String str, Object obj, String str2, List list, String str3, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = fieldData.id;
        }
        if ((i11 & 2) != 0) {
            obj = fieldData.value;
        }
        if ((i11 & 4) != 0) {
            str2 = fieldData.regex;
        }
        if ((i11 & 8) != 0) {
            list = fieldData.options;
        }
        if ((i11 & 16) != 0) {
            str3 = fieldData.type;
        }
        String str4 = str3;
        String str5 = str2;
        return fieldData.copy(str, obj, str5, list, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegex() {
        return this.regex;
    }

    @Nullable
    public final List<String> component4() {
        return this.options;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final FieldData copy(@NotNull String id2, @NotNull Object value, @Nullable String regex, @Nullable List<String> options, @NotNull String type) {
        id2.getClass();
        value.getClass();
        type.getClass();
        return new FieldData(id2, value, regex, options, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldData)) {
            return false;
        }
        FieldData fieldData = (FieldData) other;
        return Intrinsics.areEqual(this.id, fieldData.id) && Intrinsics.areEqual(this.value, fieldData.value) && Intrinsics.areEqual(this.regex, fieldData.regex) && Intrinsics.areEqual(this.options, fieldData.options) && Intrinsics.areEqual(this.type, fieldData.type);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getOptions() {
        return this.options;
    }

    @Nullable
    public final String getRegex() {
        return this.regex;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = (this.value.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.regex;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.options;
        return this.type.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Object obj = this.value;
        String str2 = this.regex;
        List<String> list = this.options;
        String str3 = this.type;
        StringBuilder sb2 = new StringBuilder("FieldData(id=");
        sb2.append(str);
        sb2.append(", value=");
        sb2.append(obj);
        sb2.append(", regex=");
        sb2.append(str2);
        sb2.append(", options=");
        sb2.append(list);
        sb2.append(", type=");
        return k.p(sb2, str3, ")");
    }

    public FieldData(@NotNull String str, @NotNull Object obj, @Nullable String str2, @Nullable List<String> list, @NotNull String str3) {
        str.getClass();
        obj.getClass();
        str3.getClass();
        this.id = str;
        this.value = obj;
        this.regex = str2;
        this.options = list;
        this.type = str3;
    }
}
