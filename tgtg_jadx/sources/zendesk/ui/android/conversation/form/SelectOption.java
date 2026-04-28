package zendesk.ui.android.conversation.form;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lzendesk/ui/android/conversation/form/SelectOption;", "", "id", "", AnnotatedPrivateKey.LABEL, "textColor", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getLabel", "getTextColor", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SelectOption {
    public static final int $stable = 0;

    @NotNull
    private final String id;

    @NotNull
    private final String label;
    private final int textColor;

    public SelectOption(@NotNull String str, @NotNull String str2, int i11) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.label = str2;
        this.textColor = i11;
    }

    public static /* synthetic */ SelectOption copy$default(SelectOption selectOption, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = selectOption.id;
        }
        if ((i12 & 2) != 0) {
            str2 = selectOption.label;
        }
        if ((i12 & 4) != 0) {
            i11 = selectOption.textColor;
        }
        return selectOption.copy(str, str2, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final SelectOption copy(@NotNull String id2, @NotNull String label, int textColor) {
        id2.getClass();
        label.getClass();
        return new SelectOption(id2, label, textColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectOption)) {
            return false;
        }
        SelectOption selectOption = (SelectOption) other;
        return Intrinsics.areEqual(this.id, selectOption.id) && Intrinsics.areEqual(this.label, selectOption.label) && this.textColor == selectOption.textColor;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.textColor) + l1.b(this.id.hashCode() * 31, 31, this.label);
    }

    @NotNull
    public String toString() {
        return r8.k.i(this.textColor, ")", e0.f.t("SelectOption(id=", this.id, ", label=", this.label, ", textColor="));
    }

    public /* synthetic */ SelectOption(String str, String str2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i12 & 4) != 0 ? 0 : i11);
    }
}
