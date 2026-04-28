package zendesk.ui.android.conversation.form;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0014J\u000e\u0010\u0015\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÀ\u0003¢\u0006\u0002\b\u0018J7\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lzendesk/ui/android/conversation/form/FormResponseState;", "", "textColor", "", "backgroundColor", "borderColor", "fieldResponses", "", "Lzendesk/ui/android/conversation/form/FieldResponse;", "<init>", "(IIILjava/util/List;)V", "getTextColor$zendesk_ui_ui_android", "()I", "getBackgroundColor$zendesk_ui_ui_android", "getBorderColor$zendesk_ui_ui_android", "getFieldResponses$zendesk_ui_ui_android", "()Ljava/util/List;", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "copy", "equals", "", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FormResponseState {
    public static final int $stable = 8;
    private final int backgroundColor;
    private final int borderColor;

    @NotNull
    private final List<FieldResponse> fieldResponses;
    private final int textColor;

    public FormResponseState(int i11, int i12, int i13, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? n0.f26529a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormResponseState copy$default(FormResponseState formResponseState, int i11, int i12, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = formResponseState.textColor;
        }
        if ((i14 & 2) != 0) {
            i12 = formResponseState.backgroundColor;
        }
        if ((i14 & 4) != 0) {
            i13 = formResponseState.borderColor;
        }
        if ((i14 & 8) != 0) {
            list = formResponseState.fieldResponses;
        }
        return formResponseState.copy(i11, i12, i13, list);
    }

    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final List<FieldResponse> component4$zendesk_ui_ui_android() {
        return this.fieldResponses;
    }

    @NotNull
    public final FormResponseState copy(int textColor, int backgroundColor, int borderColor, @NotNull List<FieldResponse> fieldResponses) {
        fieldResponses.getClass();
        return new FormResponseState(textColor, backgroundColor, borderColor, fieldResponses);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormResponseState)) {
            return false;
        }
        FormResponseState formResponseState = (FormResponseState) other;
        return this.textColor == formResponseState.textColor && this.backgroundColor == formResponseState.backgroundColor && this.borderColor == formResponseState.borderColor && Intrinsics.areEqual(this.fieldResponses, formResponseState.fieldResponses);
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    public final int getBorderColor$zendesk_ui_ui_android() {
        return this.borderColor;
    }

    @NotNull
    public final List<FieldResponse> getFieldResponses$zendesk_ui_ui_android() {
        return this.fieldResponses;
    }

    public final int getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    public int hashCode() {
        return this.fieldResponses.hashCode() + r8.k.b(this.borderColor, r8.k.b(this.backgroundColor, Integer.hashCode(this.textColor) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.textColor;
        int i12 = this.backgroundColor;
        int i13 = this.borderColor;
        List<FieldResponse> list = this.fieldResponses;
        StringBuilder sbR = r8.k.r(i11, i12, "FormResponseState(textColor=", ", backgroundColor=", ", borderColor=");
        sbR.append(i13);
        sbR.append(", fieldResponses=");
        sbR.append(list);
        sbR.append(")");
        return sbR.toString();
    }

    public FormResponseState(int i11, int i12, int i13, @NotNull List<FieldResponse> list) {
        list.getClass();
        this.textColor = i11;
        this.backgroundColor = i12;
        this.borderColor = i13;
        this.fieldResponses = list;
    }

    public FormResponseState() {
        this(0, 0, 0, null, 15, null);
    }
}
