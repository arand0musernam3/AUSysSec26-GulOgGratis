package zendesk.conversationkit.android.internal.rest.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/UploadFileDto;", "", "author", "Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "metadata", "Lzendesk/conversationkit/android/internal/rest/model/MetadataDto;", "upload", "Lzendesk/conversationkit/android/internal/rest/model/Upload;", "<init>", "(Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;Lzendesk/conversationkit/android/internal/rest/model/MetadataDto;Lzendesk/conversationkit/android/internal/rest/model/Upload;)V", "getAuthor", "()Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "getMetadata", "()Lzendesk/conversationkit/android/internal/rest/model/MetadataDto;", "getUpload", "()Lzendesk/conversationkit/android/internal/rest/model/Upload;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UploadFileDto {

    @NotNull
    private final AuthorDto author;

    @NotNull
    private final MetadataDto metadata;

    @NotNull
    private final Upload upload;

    public UploadFileDto(@NotNull AuthorDto authorDto, @NotNull MetadataDto metadataDto, @NotNull Upload upload) {
        authorDto.getClass();
        metadataDto.getClass();
        upload.getClass();
        this.author = authorDto;
        this.metadata = metadataDto;
        this.upload = upload;
    }

    public static /* synthetic */ UploadFileDto copy$default(UploadFileDto uploadFileDto, AuthorDto authorDto, MetadataDto metadataDto, Upload upload, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            authorDto = uploadFileDto.author;
        }
        if ((i11 & 2) != 0) {
            metadataDto = uploadFileDto.metadata;
        }
        if ((i11 & 4) != 0) {
            upload = uploadFileDto.upload;
        }
        return uploadFileDto.copy(authorDto, metadataDto, upload);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AuthorDto getAuthor() {
        return this.author;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MetadataDto getMetadata() {
        return this.metadata;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Upload getUpload() {
        return this.upload;
    }

    @NotNull
    public final UploadFileDto copy(@NotNull AuthorDto author, @NotNull MetadataDto metadata, @NotNull Upload upload) {
        author.getClass();
        metadata.getClass();
        upload.getClass();
        return new UploadFileDto(author, metadata, upload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadFileDto)) {
            return false;
        }
        UploadFileDto uploadFileDto = (UploadFileDto) other;
        return Intrinsics.areEqual(this.author, uploadFileDto.author) && Intrinsics.areEqual(this.metadata, uploadFileDto.metadata) && Intrinsics.areEqual(this.upload, uploadFileDto.upload);
    }

    @NotNull
    public final AuthorDto getAuthor() {
        return this.author;
    }

    @NotNull
    public final MetadataDto getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final Upload getUpload() {
        return this.upload;
    }

    public int hashCode() {
        return this.upload.hashCode() + ((this.metadata.hashCode() + (this.author.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "UploadFileDto(author=" + this.author + ", metadata=" + this.metadata + ", upload=" + this.upload + ")";
    }
}
