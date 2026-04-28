package zendesk.ui.android.conversation.form;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003\u0012\b\b\u0003\u0010\n\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u001e\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b!J\u000e\u0010\"\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b#J\u000e\u0010$\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b%J\u000e\u0010&\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b'J\u000e\u0010(\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b)J\u000e\u0010*\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b+J\u000e\u0010,\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b-J\u000e\u0010.\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b/J\u000e\u00100\u001a\u00020\rHÀ\u0003¢\u0006\u0002\b1J\u000e\u00102\u001a\u00020\rHÀ\u0003¢\u0006\u0002\b3Jw\u00104\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\n\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006:"}, d2 = {"Lzendesk/ui/android/conversation/form/FormState;", "", "colorAccent", "", "onErrorColor", "focusedFieldBorderColor", "fieldBorderColor", "fieldBackgroundColor", "onActionColor", "inputTextColor", "labelTextColor", "backgroundColor", StatusResponseUtils.RESULT_PENDING, "", "hasFailed", "<init>", "(IIIIIIIIIZZ)V", "getColorAccent$zendesk_ui_ui_android", "()I", "getOnErrorColor$zendesk_ui_ui_android", "getFocusedFieldBorderColor$zendesk_ui_ui_android", "getFieldBorderColor$zendesk_ui_ui_android", "getFieldBackgroundColor$zendesk_ui_ui_android", "getOnActionColor$zendesk_ui_ui_android", "getInputTextColor$zendesk_ui_ui_android", "getLabelTextColor$zendesk_ui_ui_android", "getBackgroundColor$zendesk_ui_ui_android", "getPending$zendesk_ui_ui_android", "()Z", "getHasFailed$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "component9", "component9$zendesk_ui_ui_android", "component10", "component10$zendesk_ui_ui_android", "component11", "component11$zendesk_ui_ui_android", "copy", "equals", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FormState {
    public static final int $stable = 0;
    private final int backgroundColor;
    private final int colorAccent;
    private final int fieldBackgroundColor;
    private final int fieldBorderColor;
    private final int focusedFieldBorderColor;
    private final boolean hasFailed;
    private final int inputTextColor;
    private final int labelTextColor;
    private final int onActionColor;
    private final int onErrorColor;
    private final boolean pending;

    public /* synthetic */ FormState(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z11, boolean z12, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this((i21 & 1) != 0 ? 0 : i11, (i21 & 2) != 0 ? 0 : i12, (i21 & 4) != 0 ? 0 : i13, (i21 & 8) != 0 ? 0 : i14, (i21 & 16) != 0 ? 0 : i15, (i21 & 32) != 0 ? 0 : i16, (i21 & 64) != 0 ? 0 : i17, (i21 & 128) != 0 ? 0 : i18, (i21 & 256) != 0 ? 0 : i19, (i21 & 512) != 0 ? false : z11, (i21 & 1024) != 0 ? false : z12);
    }

    public static /* synthetic */ FormState copy$default(FormState formState, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z11, boolean z12, int i21, Object obj) {
        if ((i21 & 1) != 0) {
            i11 = formState.colorAccent;
        }
        if ((i21 & 2) != 0) {
            i12 = formState.onErrorColor;
        }
        if ((i21 & 4) != 0) {
            i13 = formState.focusedFieldBorderColor;
        }
        if ((i21 & 8) != 0) {
            i14 = formState.fieldBorderColor;
        }
        if ((i21 & 16) != 0) {
            i15 = formState.fieldBackgroundColor;
        }
        if ((i21 & 32) != 0) {
            i16 = formState.onActionColor;
        }
        if ((i21 & 64) != 0) {
            i17 = formState.inputTextColor;
        }
        if ((i21 & 128) != 0) {
            i18 = formState.labelTextColor;
        }
        if ((i21 & 256) != 0) {
            i19 = formState.backgroundColor;
        }
        if ((i21 & 512) != 0) {
            z11 = formState.pending;
        }
        if ((i21 & 1024) != 0) {
            z12 = formState.hasFailed;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        int i22 = i18;
        int i23 = i19;
        int i24 = i16;
        int i25 = i17;
        int i26 = i15;
        int i27 = i13;
        return formState.copy(i11, i12, i27, i14, i26, i24, i25, i22, i23, z13, z14);
    }

    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final int getColorAccent() {
        return this.colorAccent;
    }

    /* JADX INFO: renamed from: component10$zendesk_ui_ui_android, reason: from getter */
    public final boolean getPending() {
        return this.pending;
    }

    /* JADX INFO: renamed from: component11$zendesk_ui_ui_android, reason: from getter */
    public final boolean getHasFailed() {
        return this.hasFailed;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getOnErrorColor() {
        return this.onErrorColor;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getFocusedFieldBorderColor() {
        return this.focusedFieldBorderColor;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final int getFieldBorderColor() {
        return this.fieldBorderColor;
    }

    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final int getFieldBackgroundColor() {
        return this.fieldBackgroundColor;
    }

    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final int getOnActionColor() {
        return this.onActionColor;
    }

    /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
    public final int getInputTextColor() {
        return this.inputTextColor;
    }

    /* JADX INFO: renamed from: component8$zendesk_ui_ui_android, reason: from getter */
    public final int getLabelTextColor() {
        return this.labelTextColor;
    }

    /* JADX INFO: renamed from: component9$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final FormState copy(int colorAccent, int onErrorColor, int focusedFieldBorderColor, int fieldBorderColor, int fieldBackgroundColor, int onActionColor, int inputTextColor, int labelTextColor, int backgroundColor, boolean pending, boolean hasFailed) {
        return new FormState(colorAccent, onErrorColor, focusedFieldBorderColor, fieldBorderColor, fieldBackgroundColor, onActionColor, inputTextColor, labelTextColor, backgroundColor, pending, hasFailed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormState)) {
            return false;
        }
        FormState formState = (FormState) other;
        return this.colorAccent == formState.colorAccent && this.onErrorColor == formState.onErrorColor && this.focusedFieldBorderColor == formState.focusedFieldBorderColor && this.fieldBorderColor == formState.fieldBorderColor && this.fieldBackgroundColor == formState.fieldBackgroundColor && this.onActionColor == formState.onActionColor && this.inputTextColor == formState.inputTextColor && this.labelTextColor == formState.labelTextColor && this.backgroundColor == formState.backgroundColor && this.pending == formState.pending && this.hasFailed == formState.hasFailed;
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    public final int getColorAccent$zendesk_ui_ui_android() {
        return this.colorAccent;
    }

    public final int getFieldBackgroundColor$zendesk_ui_ui_android() {
        return this.fieldBackgroundColor;
    }

    public final int getFieldBorderColor$zendesk_ui_ui_android() {
        return this.fieldBorderColor;
    }

    public final int getFocusedFieldBorderColor$zendesk_ui_ui_android() {
        return this.focusedFieldBorderColor;
    }

    public final boolean getHasFailed$zendesk_ui_ui_android() {
        return this.hasFailed;
    }

    public final int getInputTextColor$zendesk_ui_ui_android() {
        return this.inputTextColor;
    }

    public final int getLabelTextColor$zendesk_ui_ui_android() {
        return this.labelTextColor;
    }

    public final int getOnActionColor$zendesk_ui_ui_android() {
        return this.onActionColor;
    }

    public final int getOnErrorColor$zendesk_ui_ui_android() {
        return this.onErrorColor;
    }

    public final boolean getPending$zendesk_ui_ui_android() {
        return this.pending;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasFailed) + r8.k.e(r8.k.b(this.backgroundColor, r8.k.b(this.labelTextColor, r8.k.b(this.inputTextColor, r8.k.b(this.onActionColor, r8.k.b(this.fieldBackgroundColor, r8.k.b(this.fieldBorderColor, r8.k.b(this.focusedFieldBorderColor, r8.k.b(this.onErrorColor, Integer.hashCode(this.colorAccent) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.pending);
    }

    @NotNull
    public String toString() {
        int i11 = this.colorAccent;
        int i12 = this.onErrorColor;
        int i13 = this.focusedFieldBorderColor;
        int i14 = this.fieldBorderColor;
        int i15 = this.fieldBackgroundColor;
        int i16 = this.onActionColor;
        int i17 = this.inputTextColor;
        int i18 = this.labelTextColor;
        int i19 = this.backgroundColor;
        boolean z11 = this.pending;
        boolean z12 = this.hasFailed;
        StringBuilder sbR = r8.k.r(i11, i12, "FormState(colorAccent=", ", onErrorColor=", ", focusedFieldBorderColor=");
        e0.f.C(sbR, i13, ", fieldBorderColor=", i14, ", fieldBackgroundColor=");
        e0.f.C(sbR, i15, ", onActionColor=", i16, ", inputTextColor=");
        e0.f.C(sbR, i17, ", labelTextColor=", i18, ", backgroundColor=");
        sbR.append(i19);
        sbR.append(", pending=");
        sbR.append(z11);
        sbR.append(", hasFailed=");
        return s.o(sbR, z12, ")");
    }

    public FormState(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z11, boolean z12) {
        this.colorAccent = i11;
        this.onErrorColor = i12;
        this.focusedFieldBorderColor = i13;
        this.fieldBorderColor = i14;
        this.fieldBackgroundColor = i15;
        this.onActionColor = i16;
        this.inputTextColor = i17;
        this.labelTextColor = i18;
        this.backgroundColor = i19;
        this.pending = z11;
        this.hasFailed = z12;
    }

    public FormState() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 2047, null);
    }
}
