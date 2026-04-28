package zendesk.conversationkit.android.internal.rest;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import e80.m;
import ia0.b;
import ia0.c0;
import ia0.d0;
import ia0.l0;
import ia0.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/DefaultRestClientFiles;", "Lzendesk/conversationkit/android/internal/rest/RestClientFiles;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getUploadFileForUri", "Ljava/io/File;", "uri", "", "name", "cleanUpUpload", "", "clearCache", "getCacheFile", "getCacheDir", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultRestClientFiles implements RestClientFiles {

    @NotNull
    private final Context context;

    public DefaultRestClientFiles(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    private final File getCacheDir() {
        return new File(k.m(this.context.getCacheDir().getPath(), File.pathSeparator, "upload_cache"));
    }

    private final File getCacheFile(String name) {
        byte[] bytes = name.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return new File(getCacheDir(), Base64.encodeToString(bytes, 8));
    }

    @Override // zendesk.conversationkit.android.internal.rest.RestClientFiles
    public void cleanUpUpload(@NotNull String name) {
        name.getClass();
        getCacheFile(name).delete();
    }

    @Override // zendesk.conversationkit.android.internal.rest.RestClientFiles
    public void clearCache() {
        m.e(getCacheDir());
    }

    @Override // zendesk.conversationkit.android.internal.rest.RestClientFiles
    @NotNull
    public File getUploadFileForUri(@NotNull String uri, @NotNull String name) throws Exception {
        uri.getClass();
        name.getClass();
        try {
            File cacheFile = getCacheFile(name);
            if (cacheFile.exists()) {
                return cacheFile;
            }
            File parentFile = cacheFile.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            cacheFile.createNewFile();
            InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(Uri.parse(uri));
            if (inputStreamOpenInputStream == null) {
                throw new IOException("Content resolver failed to find source for ".concat(uri));
            }
            d0 d0Var = new d0(b.g(inputStreamOpenInputStream));
            c0 c0Var = new c0(new z(new FileOutputStream(cacheFile, false), new l0()));
            c0Var.b0(d0Var);
            d0Var.close();
            c0Var.close();
            return cacheFile;
        } catch (Exception e5) {
            cleanUpUpload(name);
            throw e5;
        }
    }
}
