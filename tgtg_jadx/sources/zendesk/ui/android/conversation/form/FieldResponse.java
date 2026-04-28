package zendesk.ui.android.conversation.form;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldResponse;", "", AnnotatedPrivateKey.LABEL, "", "response", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getResponse", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FieldResponse {
    public static final int $stable = 0;

    @NotNull
    private final String label;

    @NotNull
    private final String response;

    public FieldResponse(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.label = str;
        this.response = str2;
    }

    public static /* synthetic */ FieldResponse copy$default(FieldResponse fieldResponse, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fieldResponse.label;
        }
        if ((i11 & 2) != 0) {
            str2 = fieldResponse.response;
        }
        return fieldResponse.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResponse() {
        return this.response;
    }

    @NotNull
    public final FieldResponse copy(@NotNull String label, @NotNull String response) {
        label.getClass();
        response.getClass();
        return new FieldResponse(label, response);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldResponse)) {
            return false;
        }
        FieldResponse fieldResponse = (FieldResponse) other;
        return Intrinsics.areEqual(this.label, fieldResponse.label) && Intrinsics.areEqual(this.response, fieldResponse.response);
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.response.hashCode() + (this.label.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("FieldResponse(label=", this.label, ", response=", this.response, ")");
    }
}
