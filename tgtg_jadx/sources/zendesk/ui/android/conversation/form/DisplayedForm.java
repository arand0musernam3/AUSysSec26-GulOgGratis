package zendesk.ui.android.conversation.form;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lzendesk/ui/android/conversation/form/DisplayedForm;", "", "formId", "", "fields", "", "", "Lzendesk/ui/android/conversation/form/DisplayedField;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getFormId", "()Ljava/lang/String;", "getFields", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DisplayedForm {
    public static final int $stable = 8;

    @NotNull
    private final Map<Integer, DisplayedField> fields;

    @NotNull
    private final String formId;

    public DisplayedForm(@NotNull String str, @NotNull Map<Integer, DisplayedField> map) {
        str.getClass();
        map.getClass();
        this.formId = str;
        this.fields = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayedForm copy$default(DisplayedForm displayedForm, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = displayedForm.formId;
        }
        if ((i11 & 2) != 0) {
            map = displayedForm.fields;
        }
        return displayedForm.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    @NotNull
    public final Map<Integer, DisplayedField> component2() {
        return this.fields;
    }

    @NotNull
    public final DisplayedForm copy(@NotNull String formId, @NotNull Map<Integer, DisplayedField> fields) {
        formId.getClass();
        fields.getClass();
        return new DisplayedForm(formId, fields);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayedForm)) {
            return false;
        }
        DisplayedForm displayedForm = (DisplayedForm) other;
        return Intrinsics.areEqual(this.formId, displayedForm.formId) && Intrinsics.areEqual(this.fields, displayedForm.fields);
    }

    @NotNull
    public final Map<Integer, DisplayedField> getFields() {
        return this.fields;
    }

    @NotNull
    public final String getFormId() {
        return this.formId;
    }

    public int hashCode() {
        return this.fields.hashCode() + (this.formId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DisplayedForm(formId=" + this.formId + ", fields=" + this.fields + ")";
    }

    public /* synthetic */ DisplayedForm(String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? new LinkedHashMap() : map);
    }
}
