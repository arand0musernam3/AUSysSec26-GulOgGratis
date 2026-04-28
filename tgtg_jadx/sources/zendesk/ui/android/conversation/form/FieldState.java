package zendesk.ui.android.conversation.form;

import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aBY\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\u0006\u0012\b\b\u0003\u0010\n\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\n\u001a\u00020\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldState;", "", "placeholder", "", AnnotatedPrivateKey.LABEL, "onErrorColor", "", "borderColor", "focusedBorderColor", "inputTextColor", "labelTextColor", "inputFieldBackgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIIII)V", "getPlaceholder$zendesk_ui_ui_android", "()Ljava/lang/String;", "getLabel$zendesk_ui_ui_android", "getOnErrorColor$zendesk_ui_ui_android", "()I", "getBorderColor$zendesk_ui_ui_android", "getFocusedBorderColor$zendesk_ui_ui_android", "getInputTextColor$zendesk_ui_ui_android", "getLabelTextColor$zendesk_ui_ui_android", "getInputFieldBackgroundColor$zendesk_ui_ui_android", "Text", "Email", "Select", "Lzendesk/ui/android/conversation/form/FieldState$Email;", "Lzendesk/ui/android/conversation/form/FieldState$Select;", "Lzendesk/ui/android/conversation/form/FieldState$Text;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FieldState {
    public static final int $stable = 0;
    private final int borderColor;
    private final int focusedBorderColor;
    private final int inputFieldBackgroundColor;
    private final int inputTextColor;

    @Nullable
    private final String label;
    private final int labelTextColor;
    private final int onErrorColor;

    @Nullable
    private final String placeholder;

    public /* synthetic */ FieldState(String str, String str2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i17 & 4) != 0 ? 0 : i11, (i17 & 8) != 0 ? 0 : i12, (i17 & 16) != 0 ? 0 : i13, (i17 & 32) != 0 ? 0 : i14, (i17 & 64) != 0 ? 0 : i15, (i17 & 128) != 0 ? 0 : i16, null);
    }

    /* JADX INFO: renamed from: getBorderColor$zendesk_ui_ui_android, reason: from getter */
    public int getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: getFocusedBorderColor$zendesk_ui_ui_android, reason: from getter */
    public int getFocusedBorderColor() {
        return this.focusedBorderColor;
    }

    /* JADX INFO: renamed from: getInputFieldBackgroundColor$zendesk_ui_ui_android, reason: from getter */
    public int getInputFieldBackgroundColor() {
        return this.inputFieldBackgroundColor;
    }

    /* JADX INFO: renamed from: getInputTextColor$zendesk_ui_ui_android, reason: from getter */
    public int getInputTextColor() {
        return this.inputTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: getLabel$zendesk_ui_ui_android, reason: from getter */
    public String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: getLabelTextColor$zendesk_ui_ui_android, reason: from getter */
    public int getLabelTextColor() {
        return this.labelTextColor;
    }

    /* JADX INFO: renamed from: getOnErrorColor$zendesk_ui_ui_android, reason: from getter */
    public int getOnErrorColor() {
        return this.onErrorColor;
    }

    @Nullable
    /* JADX INFO: renamed from: getPlaceholder$zendesk_ui_ui_android, reason: from getter */
    public String getPlaceholder() {
        return this.placeholder;
    }

    private FieldState(String str, String str2, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.placeholder = str;
        this.label = str2;
        this.onErrorColor = i11;
        this.borderColor = i12;
        this.focusedBorderColor = i13;
        this.inputTextColor = i14;
        this.labelTextColor = i15;
        this.inputFieldBackgroundColor = i16;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001eJ\u000e\u0010\u001f\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b J\u000e\u0010!\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b$J\u000e\u0010%\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b&J\u000e\u0010'\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b(J\u000e\u0010)\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b*Ji\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u00072\b\b\u0003\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0007HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\t\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\f\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u00062"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldState$Email;", "Lzendesk/ui/android/conversation/form/FieldState;", "email", "", "placeholder", AnnotatedPrivateKey.LABEL, "onErrorColor", "", "borderColor", "focusedBorderColor", "inputTextColor", "labelTextColor", "inputFieldBackgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIII)V", "getEmail", "()Ljava/lang/String;", "getPlaceholder$zendesk_ui_ui_android", "getLabel$zendesk_ui_ui_android", "getOnErrorColor$zendesk_ui_ui_android", "()I", "getBorderColor$zendesk_ui_ui_android", "getFocusedBorderColor$zendesk_ui_ui_android", "getInputTextColor$zendesk_ui_ui_android", "getLabelTextColor$zendesk_ui_ui_android", "getInputFieldBackgroundColor$zendesk_ui_ui_android", "component1", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "component9", "component9$zendesk_ui_ui_android", "copy", "equals", "", "other", "", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Email extends FieldState {
        public static final int $stable = 0;
        private final int borderColor;

        @Nullable
        private final String email;
        private final int focusedBorderColor;
        private final int inputFieldBackgroundColor;
        private final int inputTextColor;

        @Nullable
        private final String label;
        private final int labelTextColor;
        private final int onErrorColor;

        @Nullable
        private final String placeholder;

        public /* synthetic */ Email(String str, String str2, String str3, int i11, int i12, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
            this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : str3, (i17 & 8) != 0 ? 0 : i11, (i17 & 16) != 0 ? 0 : i12, (i17 & 32) != 0 ? 0 : i13, (i17 & 64) != 0 ? 0 : i14, (i17 & 128) != 0 ? 0 : i15, (i17 & 256) != 0 ? 0 : i16);
        }

        public static /* synthetic */ Email copy$default(Email email, String str, String str2, String str3, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                str = email.email;
            }
            if ((i17 & 2) != 0) {
                str2 = email.placeholder;
            }
            if ((i17 & 4) != 0) {
                str3 = email.label;
            }
            if ((i17 & 8) != 0) {
                i11 = email.onErrorColor;
            }
            if ((i17 & 16) != 0) {
                i12 = email.borderColor;
            }
            if ((i17 & 32) != 0) {
                i13 = email.focusedBorderColor;
            }
            if ((i17 & 64) != 0) {
                i14 = email.inputTextColor;
            }
            if ((i17 & 128) != 0) {
                i15 = email.labelTextColor;
            }
            if ((i17 & 256) != 0) {
                i16 = email.inputFieldBackgroundColor;
            }
            int i18 = i15;
            int i19 = i16;
            int i21 = i13;
            int i22 = i14;
            int i23 = i12;
            String str4 = str3;
            return email.copy(str, str2, str4, i11, i23, i21, i22, i18, i19);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @Nullable
        /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @Nullable
        /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
        public final int getOnErrorColor() {
            return this.onErrorColor;
        }

        /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
        public final int getBorderColor() {
            return this.borderColor;
        }

        /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
        public final int getFocusedBorderColor() {
            return this.focusedBorderColor;
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
        public final int getInputFieldBackgroundColor() {
            return this.inputFieldBackgroundColor;
        }

        @NotNull
        public final Email copy(@Nullable String email, @Nullable String placeholder, @Nullable String label, int onErrorColor, int borderColor, int focusedBorderColor, int inputTextColor, int labelTextColor, int inputFieldBackgroundColor) {
            return new Email(email, placeholder, label, onErrorColor, borderColor, focusedBorderColor, inputTextColor, labelTextColor, inputFieldBackgroundColor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Email)) {
                return false;
            }
            Email email = (Email) other;
            return Intrinsics.areEqual(this.email, email.email) && Intrinsics.areEqual(this.placeholder, email.placeholder) && Intrinsics.areEqual(this.label, email.label) && this.onErrorColor == email.onErrorColor && this.borderColor == email.borderColor && this.focusedBorderColor == email.focusedBorderColor && this.inputTextColor == email.inputTextColor && this.labelTextColor == email.labelTextColor && this.inputFieldBackgroundColor == email.inputFieldBackgroundColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getBorderColor$zendesk_ui_ui_android */
        public int getBorderColor() {
            return this.borderColor;
        }

        @Nullable
        public final String getEmail() {
            return this.email;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getFocusedBorderColor$zendesk_ui_ui_android */
        public int getFocusedBorderColor() {
            return this.focusedBorderColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getInputFieldBackgroundColor$zendesk_ui_ui_android */
        public int getInputFieldBackgroundColor() {
            return this.inputFieldBackgroundColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getInputTextColor$zendesk_ui_ui_android */
        public int getInputTextColor() {
            return this.inputTextColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        @Nullable
        /* JADX INFO: renamed from: getLabel$zendesk_ui_ui_android */
        public String getLabel() {
            return this.label;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getLabelTextColor$zendesk_ui_ui_android */
        public int getLabelTextColor() {
            return this.labelTextColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getOnErrorColor$zendesk_ui_ui_android */
        public int getOnErrorColor() {
            return this.onErrorColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        @Nullable
        /* JADX INFO: renamed from: getPlaceholder$zendesk_ui_ui_android */
        public String getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            String str = this.email;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.placeholder;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.label;
            return Integer.hashCode(this.inputFieldBackgroundColor) + r8.k.b(this.labelTextColor, r8.k.b(this.inputTextColor, r8.k.b(this.focusedBorderColor, r8.k.b(this.borderColor, r8.k.b(this.onErrorColor, (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.email;
            String str2 = this.placeholder;
            String str3 = this.label;
            int i11 = this.onErrorColor;
            int i12 = this.borderColor;
            int i13 = this.focusedBorderColor;
            int i14 = this.inputTextColor;
            int i15 = this.labelTextColor;
            int i16 = this.inputFieldBackgroundColor;
            StringBuilder sbT = e0.f.t("Email(email=", str, ", placeholder=", str2, ", label=");
            sbT.append(str3);
            sbT.append(", onErrorColor=");
            sbT.append(i11);
            sbT.append(", borderColor=");
            e0.f.C(sbT, i12, ", focusedBorderColor=", i13, ", inputTextColor=");
            e0.f.C(sbT, i14, ", labelTextColor=", i15, ", inputFieldBackgroundColor=");
            return r8.k.i(i16, ")", sbT);
        }

        public Email() {
            this(null, null, null, 0, 0, 0, 0, 0, 0, 511, null);
        }

        public Email(@Nullable String str, @Nullable String str2, @Nullable String str3, int i11, int i12, int i13, int i14, int i15, int i16) {
            super(str2, str3, i12, i13, 0, 0, 0, 0, 240, null);
            this.email = str;
            this.placeholder = str2;
            this.label = str3;
            this.onErrorColor = i11;
            this.borderColor = i12;
            this.focusedBorderColor = i13;
            this.inputTextColor = i14;
            this.labelTextColor = i15;
            this.inputFieldBackgroundColor = i16;
        }
    }

    public /* synthetic */ FieldState(String str, String str2, int i11, int i12, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i11, i12, i13, i14, i15, i16);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0005\u0012\b\b\u0003\u0010\n\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\f\u001a\u00020\u0005\u0012\b\b\u0003\u0010\r\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000e\u0010\u001f\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b J\u000e\u0010!\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\"J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b$J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b&J\u000e\u0010'\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b(J\u000e\u0010)\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b*J\u000e\u0010+\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b,J\u000e\u0010-\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b.J\u000e\u0010/\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b0J\u000e\u00101\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b2J}\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\f\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\u00052\b\b\u0003\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\u0005HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\f\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0014\u0010\r\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006:"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldState$Text;", "Lzendesk/ui/android/conversation/form/FieldState;", TextBundle.TEXT_ENTRY, "", "minLength", "", "maxLength", "placeholder", AnnotatedPrivateKey.LABEL, "onErrorColor", "borderColor", "focusedBorderColor", "inputTextColor", "labelTextColor", "inputFieldBackgroundColor", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IIIIII)V", "getText", "()Ljava/lang/String;", "getMinLength$zendesk_ui_ui_android", "()I", "getMaxLength$zendesk_ui_ui_android", "getPlaceholder$zendesk_ui_ui_android", "getLabel$zendesk_ui_ui_android", "getOnErrorColor$zendesk_ui_ui_android", "getBorderColor$zendesk_ui_ui_android", "getFocusedBorderColor$zendesk_ui_ui_android", "getInputTextColor$zendesk_ui_ui_android", "getLabelTextColor$zendesk_ui_ui_android", "getInputFieldBackgroundColor$zendesk_ui_ui_android", "component1", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "component9", "component9$zendesk_ui_ui_android", "component10", "component10$zendesk_ui_ui_android", "component11", "component11$zendesk_ui_ui_android", "copy", "equals", "", "other", "", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text extends FieldState {
        public static final int $stable = 0;
        private final int borderColor;
        private final int focusedBorderColor;
        private final int inputFieldBackgroundColor;
        private final int inputTextColor;

        @Nullable
        private final String label;
        private final int labelTextColor;
        private final int maxLength;
        private final int minLength;
        private final int onErrorColor;

        @Nullable
        private final String placeholder;

        @Nullable
        private final String text;

        public /* synthetic */ Text(String str, int i11, int i12, String str2, String str3, int i13, int i14, int i15, int i16, int i17, int i18, int i19, DefaultConstructorMarker defaultConstructorMarker) {
            this((i19 & 1) != 0 ? null : str, (i19 & 2) != 0 ? 0 : i11, (i19 & 4) != 0 ? Integer.MAX_VALUE : i12, (i19 & 8) != 0 ? null : str2, (i19 & 16) != 0 ? null : str3, (i19 & 32) != 0 ? 0 : i13, (i19 & 64) != 0 ? 0 : i14, (i19 & 128) != 0 ? 0 : i15, (i19 & 256) != 0 ? 0 : i16, (i19 & 512) != 0 ? 0 : i17, (i19 & 1024) != 0 ? 0 : i18);
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i11, int i12, String str2, String str3, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Object obj) {
            if ((i19 & 1) != 0) {
                str = text.text;
            }
            if ((i19 & 2) != 0) {
                i11 = text.minLength;
            }
            if ((i19 & 4) != 0) {
                i12 = text.maxLength;
            }
            if ((i19 & 8) != 0) {
                str2 = text.placeholder;
            }
            if ((i19 & 16) != 0) {
                str3 = text.label;
            }
            if ((i19 & 32) != 0) {
                i13 = text.onErrorColor;
            }
            if ((i19 & 64) != 0) {
                i14 = text.borderColor;
            }
            if ((i19 & 128) != 0) {
                i15 = text.focusedBorderColor;
            }
            if ((i19 & 256) != 0) {
                i16 = text.inputTextColor;
            }
            if ((i19 & 512) != 0) {
                i17 = text.labelTextColor;
            }
            if ((i19 & 1024) != 0) {
                i18 = text.inputFieldBackgroundColor;
            }
            int i21 = i17;
            int i22 = i18;
            int i23 = i15;
            int i24 = i16;
            int i25 = i13;
            int i26 = i14;
            String str4 = str3;
            int i27 = i12;
            return text.copy(str, i11, i27, str2, str4, i25, i26, i23, i24, i21, i22);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component10$zendesk_ui_ui_android, reason: from getter */
        public final int getLabelTextColor() {
            return this.labelTextColor;
        }

        /* JADX INFO: renamed from: component11$zendesk_ui_ui_android, reason: from getter */
        public final int getInputFieldBackgroundColor() {
            return this.inputFieldBackgroundColor;
        }

        /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
        public final int getMinLength() {
            return this.minLength;
        }

        /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
        public final int getMaxLength() {
            return this.maxLength;
        }

        @Nullable
        /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @Nullable
        /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
        public final int getOnErrorColor() {
            return this.onErrorColor;
        }

        /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
        public final int getBorderColor() {
            return this.borderColor;
        }

        /* JADX INFO: renamed from: component8$zendesk_ui_ui_android, reason: from getter */
        public final int getFocusedBorderColor() {
            return this.focusedBorderColor;
        }

        /* JADX INFO: renamed from: component9$zendesk_ui_ui_android, reason: from getter */
        public final int getInputTextColor() {
            return this.inputTextColor;
        }

        @NotNull
        public final Text copy(@Nullable String text, int minLength, int maxLength, @Nullable String placeholder, @Nullable String label, int onErrorColor, int borderColor, int focusedBorderColor, int inputTextColor, int labelTextColor, int inputFieldBackgroundColor) {
            return new Text(text, minLength, maxLength, placeholder, label, onErrorColor, borderColor, focusedBorderColor, inputTextColor, labelTextColor, inputFieldBackgroundColor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.text, text.text) && this.minLength == text.minLength && this.maxLength == text.maxLength && Intrinsics.areEqual(this.placeholder, text.placeholder) && Intrinsics.areEqual(this.label, text.label) && this.onErrorColor == text.onErrorColor && this.borderColor == text.borderColor && this.focusedBorderColor == text.focusedBorderColor && this.inputTextColor == text.inputTextColor && this.labelTextColor == text.labelTextColor && this.inputFieldBackgroundColor == text.inputFieldBackgroundColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getBorderColor$zendesk_ui_ui_android */
        public int getBorderColor() {
            return this.borderColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getFocusedBorderColor$zendesk_ui_ui_android */
        public int getFocusedBorderColor() {
            return this.focusedBorderColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getInputFieldBackgroundColor$zendesk_ui_ui_android */
        public int getInputFieldBackgroundColor() {
            return this.inputFieldBackgroundColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getInputTextColor$zendesk_ui_ui_android */
        public int getInputTextColor() {
            return this.inputTextColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        @Nullable
        /* JADX INFO: renamed from: getLabel$zendesk_ui_ui_android */
        public String getLabel() {
            return this.label;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getLabelTextColor$zendesk_ui_ui_android */
        public int getLabelTextColor() {
            return this.labelTextColor;
        }

        public final int getMaxLength$zendesk_ui_ui_android() {
            return this.maxLength;
        }

        public final int getMinLength$zendesk_ui_ui_android() {
            return this.minLength;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getOnErrorColor$zendesk_ui_ui_android */
        public int getOnErrorColor() {
            return this.onErrorColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        @Nullable
        /* JADX INFO: renamed from: getPlaceholder$zendesk_ui_ui_android */
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.text;
            int iB = r8.k.b(this.maxLength, r8.k.b(this.minLength, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
            String str2 = this.placeholder;
            int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.label;
            return Integer.hashCode(this.inputFieldBackgroundColor) + r8.k.b(this.labelTextColor, r8.k.b(this.inputTextColor, r8.k.b(this.focusedBorderColor, r8.k.b(this.borderColor, r8.k.b(this.onErrorColor, (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            int i11 = this.minLength;
            int i12 = this.maxLength;
            String str2 = this.placeholder;
            String str3 = this.label;
            int i13 = this.onErrorColor;
            int i14 = this.borderColor;
            int i15 = this.focusedBorderColor;
            int i16 = this.inputTextColor;
            int i17 = this.labelTextColor;
            int i18 = this.inputFieldBackgroundColor;
            StringBuilder sb2 = new StringBuilder("Text(text=");
            sb2.append(str);
            sb2.append(", minLength=");
            sb2.append(i11);
            sb2.append(", maxLength=");
            sb2.append(i12);
            sb2.append(", placeholder=");
            sb2.append(str2);
            sb2.append(", label=");
            sb2.append(str3);
            sb2.append(", onErrorColor=");
            sb2.append(i13);
            sb2.append(", borderColor=");
            e0.f.C(sb2, i14, ", focusedBorderColor=", i15, ", inputTextColor=");
            e0.f.C(sb2, i16, ", labelTextColor=", i17, ", inputFieldBackgroundColor=");
            return r8.k.i(i18, ")", sb2);
        }

        public Text() {
            this(null, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 2047, null);
        }

        public Text(@Nullable String str, int i11, int i12, @Nullable String str2, @Nullable String str3, int i13, int i14, int i15, int i16, int i17, int i18) {
            super(str2, str3, i14, i15, 0, 0, 0, 0, 240, null);
            this.text = str;
            this.minLength = i11;
            this.maxLength = i12;
            this.placeholder = str2;
            this.label = str3;
            this.onErrorColor = i13;
            this.borderColor = i14;
            this.focusedBorderColor = i15;
            this.inputTextColor = i16;
            this.labelTextColor = i17;
            this.inputFieldBackgroundColor = i18;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\f\u001a\u00020\n\u0012\b\b\u0003\u0010\r\u001a\u00020\n\u0012\b\b\u0003\u0010\u000e\u001a\u00020\n\u0012\b\b\u0003\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b\"J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b$J\u000e\u0010%\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b&J\u000e\u0010'\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b(J\u000e\u0010)\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b*J\u000e\u0010+\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b,J\u000e\u0010-\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b.J\u000e\u0010/\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b0J}\u00101\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nHÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\nHÖ\u0001J\t\u00107\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\t\u001a\u00020\nX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\nX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\f\u001a\u00020\nX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\r\u001a\u00020\nX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\u000e\u001a\u00020\nX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\nX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u00068"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldState$Select;", "Lzendesk/ui/android/conversation/form/FieldState;", "options", "", "Lzendesk/ui/android/conversation/form/SelectOption;", "select", "placeholder", "", AnnotatedPrivateKey.LABEL, "onErrorColor", "", "borderColor", "focusedBorderColor", "inputTextColor", "labelTextColor", "inputFieldBackgroundColor", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIIII)V", "getOptions", "()Ljava/util/List;", "getSelect", "getPlaceholder$zendesk_ui_ui_android", "()Ljava/lang/String;", "getLabel$zendesk_ui_ui_android", "getOnErrorColor$zendesk_ui_ui_android", "()I", "getBorderColor$zendesk_ui_ui_android", "getFocusedBorderColor$zendesk_ui_ui_android", "getInputTextColor$zendesk_ui_ui_android", "getLabelTextColor$zendesk_ui_ui_android", "getInputFieldBackgroundColor$zendesk_ui_ui_android", "component1", "component2", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "component9", "component9$zendesk_ui_ui_android", "component10", "component10$zendesk_ui_ui_android", "copy", "equals", "", "other", "", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Select extends FieldState {
        public static final int $stable = 8;
        private final int borderColor;
        private final int focusedBorderColor;
        private final int inputFieldBackgroundColor;
        private final int inputTextColor;

        @Nullable
        private final String label;
        private final int labelTextColor;
        private final int onErrorColor;

        @NotNull
        private final List<SelectOption> options;

        @Nullable
        private final String placeholder;

        @NotNull
        private final List<SelectOption> select;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public Select(java.util.List r2, java.util.List r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r1 = this;
                r13 = r12 & 1
                if (r13 == 0) goto L6
                kotlin.collections.n0 r2 = kotlin.collections.n0.f26529a
            L6:
                r13 = r12 & 2
                if (r13 == 0) goto Lc
                kotlin.collections.n0 r3 = kotlin.collections.n0.f26529a
            Lc:
                r13 = r12 & 4
                r0 = 0
                if (r13 == 0) goto L12
                r4 = r0
            L12:
                r13 = r12 & 8
                if (r13 == 0) goto L17
                r5 = r0
            L17:
                r13 = r12 & 16
                r0 = 0
                if (r13 == 0) goto L1d
                r6 = r0
            L1d:
                r13 = r12 & 32
                if (r13 == 0) goto L22
                r7 = r0
            L22:
                r13 = r12 & 64
                if (r13 == 0) goto L27
                r8 = r0
            L27:
                r13 = r12 & 128(0x80, float:1.8E-43)
                if (r13 == 0) goto L2c
                r9 = r0
            L2c:
                r13 = r12 & 256(0x100, float:3.59E-43)
                if (r13 == 0) goto L31
                r10 = r0
            L31:
                r12 = r12 & 512(0x200, float:7.17E-43)
                if (r12 == 0) goto L41
                r13 = r0
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L4c
            L41:
                r13 = r11
                r12 = r10
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L4c:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.ui.android.conversation.form.FieldState.Select.<init>(java.util.List, java.util.List, java.lang.String, java.lang.String, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Select copy$default(Select select, List list, List list2, String str, String str2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                list = select.options;
            }
            if ((i17 & 2) != 0) {
                list2 = select.select;
            }
            if ((i17 & 4) != 0) {
                str = select.placeholder;
            }
            if ((i17 & 8) != 0) {
                str2 = select.label;
            }
            if ((i17 & 16) != 0) {
                i11 = select.onErrorColor;
            }
            if ((i17 & 32) != 0) {
                i12 = select.borderColor;
            }
            if ((i17 & 64) != 0) {
                i13 = select.focusedBorderColor;
            }
            if ((i17 & 128) != 0) {
                i14 = select.inputTextColor;
            }
            if ((i17 & 256) != 0) {
                i15 = select.labelTextColor;
            }
            if ((i17 & 512) != 0) {
                i16 = select.inputFieldBackgroundColor;
            }
            int i18 = i15;
            int i19 = i16;
            int i21 = i13;
            int i22 = i14;
            int i23 = i11;
            int i24 = i12;
            return select.copy(list, list2, str, str2, i23, i24, i21, i22, i18, i19);
        }

        @NotNull
        public final List<SelectOption> component1() {
            return this.options;
        }

        /* JADX INFO: renamed from: component10$zendesk_ui_ui_android, reason: from getter */
        public final int getInputFieldBackgroundColor() {
            return this.inputFieldBackgroundColor;
        }

        @NotNull
        public final List<SelectOption> component2() {
            return this.select;
        }

        @Nullable
        /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @Nullable
        /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
        public final int getOnErrorColor() {
            return this.onErrorColor;
        }

        /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
        public final int getBorderColor() {
            return this.borderColor;
        }

        /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
        public final int getFocusedBorderColor() {
            return this.focusedBorderColor;
        }

        /* JADX INFO: renamed from: component8$zendesk_ui_ui_android, reason: from getter */
        public final int getInputTextColor() {
            return this.inputTextColor;
        }

        /* JADX INFO: renamed from: component9$zendesk_ui_ui_android, reason: from getter */
        public final int getLabelTextColor() {
            return this.labelTextColor;
        }

        @NotNull
        public final Select copy(@NotNull List<SelectOption> options, @NotNull List<SelectOption> select, @Nullable String placeholder, @Nullable String label, int onErrorColor, int borderColor, int focusedBorderColor, int inputTextColor, int labelTextColor, int inputFieldBackgroundColor) {
            options.getClass();
            select.getClass();
            return new Select(options, select, placeholder, label, onErrorColor, borderColor, focusedBorderColor, inputTextColor, labelTextColor, inputFieldBackgroundColor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Select)) {
                return false;
            }
            Select select = (Select) other;
            return Intrinsics.areEqual(this.options, select.options) && Intrinsics.areEqual(this.select, select.select) && Intrinsics.areEqual(this.placeholder, select.placeholder) && Intrinsics.areEqual(this.label, select.label) && this.onErrorColor == select.onErrorColor && this.borderColor == select.borderColor && this.focusedBorderColor == select.focusedBorderColor && this.inputTextColor == select.inputTextColor && this.labelTextColor == select.labelTextColor && this.inputFieldBackgroundColor == select.inputFieldBackgroundColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getBorderColor$zendesk_ui_ui_android */
        public int getBorderColor() {
            return this.borderColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getFocusedBorderColor$zendesk_ui_ui_android */
        public int getFocusedBorderColor() {
            return this.focusedBorderColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getInputFieldBackgroundColor$zendesk_ui_ui_android */
        public int getInputFieldBackgroundColor() {
            return this.inputFieldBackgroundColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getInputTextColor$zendesk_ui_ui_android */
        public int getInputTextColor() {
            return this.inputTextColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        @Nullable
        /* JADX INFO: renamed from: getLabel$zendesk_ui_ui_android */
        public String getLabel() {
            return this.label;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getLabelTextColor$zendesk_ui_ui_android */
        public int getLabelTextColor() {
            return this.labelTextColor;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        /* JADX INFO: renamed from: getOnErrorColor$zendesk_ui_ui_android */
        public int getOnErrorColor() {
            return this.onErrorColor;
        }

        @NotNull
        public final List<SelectOption> getOptions() {
            return this.options;
        }

        @Override // zendesk.ui.android.conversation.form.FieldState
        @Nullable
        /* JADX INFO: renamed from: getPlaceholder$zendesk_ui_ui_android */
        public String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final List<SelectOption> getSelect() {
            return this.select;
        }

        public int hashCode() {
            int iC = e0.f.c(this.select, this.options.hashCode() * 31, 31);
            String str = this.placeholder;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            return Integer.hashCode(this.inputFieldBackgroundColor) + r8.k.b(this.labelTextColor, r8.k.b(this.inputTextColor, r8.k.b(this.focusedBorderColor, r8.k.b(this.borderColor, r8.k.b(this.onErrorColor, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            List<SelectOption> list = this.options;
            List<SelectOption> list2 = this.select;
            String str = this.placeholder;
            String str2 = this.label;
            int i11 = this.onErrorColor;
            int i12 = this.borderColor;
            int i13 = this.focusedBorderColor;
            int i14 = this.inputTextColor;
            int i15 = this.labelTextColor;
            int i16 = this.inputFieldBackgroundColor;
            StringBuilder sb2 = new StringBuilder("Select(options=");
            sb2.append(list);
            sb2.append(", select=");
            sb2.append(list2);
            sb2.append(", placeholder=");
            s.A(sb2, str, ", label=", str2, ", onErrorColor=");
            e0.f.C(sb2, i11, ", borderColor=", i12, ", focusedBorderColor=");
            e0.f.C(sb2, i13, ", inputTextColor=", i14, ", labelTextColor=");
            sb2.append(i15);
            sb2.append(", inputFieldBackgroundColor=");
            sb2.append(i16);
            sb2.append(")");
            return sb2.toString();
        }

        public Select() {
            this(null, null, null, null, 0, 0, 0, 0, 0, 0, 1023, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Select(@NotNull List<SelectOption> list, @NotNull List<SelectOption> list2, @Nullable String str, @Nullable String str2, int i11, int i12, int i13, int i14, int i15, int i16) {
            super(str, str2, i12, i13, 0, 0, 0, 0, 240, null);
            list.getClass();
            list2.getClass();
            this.options = list;
            this.select = list2;
            this.placeholder = str;
            this.label = str2;
            this.onErrorColor = i11;
            this.borderColor = i12;
            this.focusedBorderColor = i13;
            this.inputTextColor = i14;
            this.labelTextColor = i15;
            this.inputFieldBackgroundColor = i16;
        }
    }
}
