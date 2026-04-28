package zendesk.conversationkit.android.internal.rest.model;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/Upload;", "", "uri", "", "name", "size", "", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getUri", "()Ljava/lang/String;", "getName", "getSize", "()J", "getMimeType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Upload {

    @NotNull
    private final String mimeType;

    @NotNull
    private final String name;
    private final long size;

    @NotNull
    private final String uri;

    public Upload(@NotNull String str, @NotNull String str2, long j9, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.uri = str;
        this.name = str2;
        this.size = j9;
        this.mimeType = str3;
    }

    public static /* synthetic */ Upload copy$default(Upload upload, String str, String str2, long j9, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = upload.uri;
        }
        if ((i11 & 2) != 0) {
            str2 = upload.name;
        }
        if ((i11 & 4) != 0) {
            j9 = upload.size;
        }
        if ((i11 & 8) != 0) {
            str3 = upload.mimeType;
        }
        String str4 = str3;
        return upload.copy(str, str2, j9, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final Upload copy(@NotNull String uri, @NotNull String name, long size, @NotNull String mimeType) {
        uri.getClass();
        name.getClass();
        mimeType.getClass();
        return new Upload(uri, name, size, mimeType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Upload)) {
            return false;
        }
        Upload upload = (Upload) other;
        return Intrinsics.areEqual(this.uri, upload.uri) && Intrinsics.areEqual(this.name, upload.name) && this.size == upload.size && Intrinsics.areEqual(this.mimeType, upload.mimeType);
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.mimeType.hashCode() + f.b(l1.b(this.uri.hashCode() * 31, 31, this.name), 31, this.size);
    }

    @NotNull
    public String toString() {
        String str = this.uri;
        String str2 = this.name;
        long j9 = this.size;
        String str3 = this.mimeType;
        StringBuilder sbT = f.t("Upload(uri=", str, ", name=", str2, ", size=");
        sbT.append(j9);
        sbT.append(", mimeType=");
        sbT.append(str3);
        sbT.append(")");
        return sbT.toString();
    }
}
