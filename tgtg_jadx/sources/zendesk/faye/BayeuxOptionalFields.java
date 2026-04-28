package zendesk.faye;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/faye/BayeuxOptionalFields;", "", "ext", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getExt", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.faye_faye"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BayeuxOptionalFields {

    @Nullable
    private final String ext;

    @Nullable
    private final String id;

    public /* synthetic */ BayeuxOptionalFields(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ BayeuxOptionalFields copy$default(BayeuxOptionalFields bayeuxOptionalFields, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bayeuxOptionalFields.ext;
        }
        if ((i11 & 2) != 0) {
            str2 = bayeuxOptionalFields.id;
        }
        return bayeuxOptionalFields.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExt() {
        return this.ext;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final BayeuxOptionalFields copy(@Nullable String ext, @Nullable String id2) {
        return new BayeuxOptionalFields(ext, id2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BayeuxOptionalFields)) {
            return false;
        }
        BayeuxOptionalFields bayeuxOptionalFields = (BayeuxOptionalFields) other;
        return Intrinsics.areEqual(this.ext, bayeuxOptionalFields.ext) && Intrinsics.areEqual(this.id, bayeuxOptionalFields.id);
    }

    @Nullable
    public final String getExt() {
        return this.ext;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.ext;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a.d("BayeuxOptionalFields(ext=", this.ext, ", id=", this.id, ")");
    }

    public BayeuxOptionalFields(@Nullable String str, @Nullable String str2) {
        this.ext = str;
        this.id = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BayeuxOptionalFields() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
