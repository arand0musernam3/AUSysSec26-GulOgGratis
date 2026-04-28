package zendesk.ui.android.conversation.form;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000fJ\u000e\u0010\u0010\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0011J\u000e\u0010\u0012\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u0013J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldResponseState;", "", MessageBundle.TITLE_ENTRY, "", "response", "textColor", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getTitle$zendesk_ui_ui_android", "()Ljava/lang/String;", "getResponse$zendesk_ui_ui_android", "getTextColor$zendesk_ui_ui_android", "()I", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "copy", "equals", "", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FieldResponseState {
    public static final int $stable = 0;

    @NotNull
    private final String response;
    private final int textColor;

    @NotNull
    private final String title;

    public /* synthetic */ FieldResponseState(String str, String str2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? 0 : i11);
    }

    public static /* synthetic */ FieldResponseState copy$default(FieldResponseState fieldResponseState, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fieldResponseState.title;
        }
        if ((i12 & 2) != 0) {
            str2 = fieldResponseState.response;
        }
        if ((i12 & 4) != 0) {
            i11 = fieldResponseState.textColor;
        }
        return fieldResponseState.copy(str, str2, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final String getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final FieldResponseState copy(@NotNull String title, @NotNull String response, int textColor) {
        title.getClass();
        response.getClass();
        return new FieldResponseState(title, response, textColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldResponseState)) {
            return false;
        }
        FieldResponseState fieldResponseState = (FieldResponseState) other;
        return Intrinsics.areEqual(this.title, fieldResponseState.title) && Intrinsics.areEqual(this.response, fieldResponseState.response) && this.textColor == fieldResponseState.textColor;
    }

    @NotNull
    public final String getResponse$zendesk_ui_ui_android() {
        return this.response;
    }

    public final int getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    @NotNull
    public final String getTitle$zendesk_ui_ui_android() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.textColor) + l1.b(this.title.hashCode() * 31, 31, this.response);
    }

    @NotNull
    public String toString() {
        return r8.k.i(this.textColor, ")", e0.f.t("FieldResponseState(title=", this.title, ", response=", this.response, ", textColor="));
    }

    public FieldResponseState(@NotNull String str, @NotNull String str2, int i11) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.response = str2;
        this.textColor = i11;
    }

    public FieldResponseState() {
        this(null, null, 0, 7, null);
    }
}
