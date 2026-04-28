package zendesk.conversationkit.android.internal.rest;

import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/RestClientFiles;", "", "getUploadFileForUri", "Ljava/io/File;", "uri", "", "name", "cleanUpUpload", "", "clearCache", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RestClientFiles {
    void cleanUpUpload(@NotNull String name);

    void clearCache();

    @NotNull
    File getUploadFileForUri(@NotNull String uri, @NotNull String name);
}
