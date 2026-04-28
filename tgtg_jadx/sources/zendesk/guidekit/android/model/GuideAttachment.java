package zendesk.guidekit.android.model;

import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, d2 = {"Lzendesk/guidekit/android/model/GuideAttachment;", "", "id", "", "size", "fileName", "", "contentType", "contentUrl", "<init>", "(JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFileName", "()Ljava/lang/String;", "getContentType", "getContentUrl", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/guidekit/android/model/GuideAttachment;", "equals", "", "other", "hashCode", "", "toString", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GuideAttachment {

    @NotNull
    private final String contentType;

    @NotNull
    private final String contentUrl;

    @NotNull
    private final String fileName;
    private final long id;

    @Nullable
    private final Long size;

    public GuideAttachment(long j9, @Nullable Long l, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.id = j9;
        this.size = l;
        this.fileName = str;
        this.contentType = str2;
        this.contentUrl = str3;
    }

    public static /* synthetic */ GuideAttachment copy$default(GuideAttachment guideAttachment, long j9, Long l, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = guideAttachment.id;
        }
        long j11 = j9;
        if ((i11 & 2) != 0) {
            l = guideAttachment.size;
        }
        Long l7 = l;
        if ((i11 & 4) != 0) {
            str = guideAttachment.fileName;
        }
        String str4 = str;
        if ((i11 & 8) != 0) {
            str2 = guideAttachment.contentType;
        }
        String str5 = str2;
        if ((i11 & 16) != 0) {
            str3 = guideAttachment.contentUrl;
        }
        return guideAttachment.copy(j11, l7, str4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContentUrl() {
        return this.contentUrl;
    }

    @NotNull
    public final GuideAttachment copy(long id2, @Nullable Long size, @NotNull String fileName, @NotNull String contentType, @NotNull String contentUrl) {
        fileName.getClass();
        contentType.getClass();
        contentUrl.getClass();
        return new GuideAttachment(id2, size, fileName, contentType, contentUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideAttachment)) {
            return false;
        }
        GuideAttachment guideAttachment = (GuideAttachment) other;
        return this.id == guideAttachment.id && Intrinsics.areEqual(this.size, guideAttachment.size) && Intrinsics.areEqual(this.fileName, guideAttachment.fileName) && Intrinsics.areEqual(this.contentType, guideAttachment.contentType) && Intrinsics.areEqual(this.contentUrl, guideAttachment.contentUrl);
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final String getContentUrl() {
        return this.contentUrl;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        Long l = this.size;
        return this.contentUrl.hashCode() + l1.b(l1.b((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.fileName), 31, this.contentType);
    }

    @NotNull
    public String toString() {
        long j9 = this.id;
        Long l = this.size;
        String str = this.fileName;
        String str2 = this.contentType;
        String str3 = this.contentUrl;
        StringBuilder sb2 = new StringBuilder("GuideAttachment(id=");
        sb2.append(j9);
        sb2.append(", size=");
        sb2.append(l);
        s.A(sb2, ", fileName=", str, ", contentType=", str2);
        return f.n(sb2, ", contentUrl=", str3, ")");
    }
}
