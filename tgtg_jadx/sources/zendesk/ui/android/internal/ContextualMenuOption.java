package zendesk.ui.android.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lzendesk/ui/android/internal/ContextualMenuOption;", "", "optionId", "", "optionTitle", "", "<init>", "(ILjava/lang/String;)V", "getOptionId", "()I", "getOptionTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ContextualMenuOption {
    public static final int $stable = 0;
    private final int optionId;

    @NotNull
    private final String optionTitle;

    public ContextualMenuOption(int i11, @NotNull String str) {
        str.getClass();
        this.optionId = i11;
        this.optionTitle = str;
    }

    public static /* synthetic */ ContextualMenuOption copy$default(ContextualMenuOption contextualMenuOption, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = contextualMenuOption.optionId;
        }
        if ((i12 & 2) != 0) {
            str = contextualMenuOption.optionTitle;
        }
        return contextualMenuOption.copy(i11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOptionId() {
        return this.optionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOptionTitle() {
        return this.optionTitle;
    }

    @NotNull
    public final ContextualMenuOption copy(int optionId, @NotNull String optionTitle) {
        optionTitle.getClass();
        return new ContextualMenuOption(optionId, optionTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextualMenuOption)) {
            return false;
        }
        ContextualMenuOption contextualMenuOption = (ContextualMenuOption) other;
        return this.optionId == contextualMenuOption.optionId && Intrinsics.areEqual(this.optionTitle, contextualMenuOption.optionTitle);
    }

    public final int getOptionId() {
        return this.optionId;
    }

    @NotNull
    public final String getOptionTitle() {
        return this.optionTitle;
    }

    public int hashCode() {
        return this.optionTitle.hashCode() + (Integer.hashCode(this.optionId) * 31);
    }

    @NotNull
    public String toString() {
        return "ContextualMenuOption(optionId=" + this.optionId + ", optionTitle=" + this.optionTitle + ")";
    }
}
