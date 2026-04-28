package zendesk.core.android.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.io.File;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"URL_WHITE_SPACE_DELIMITER", "", "FILE_NAME_QUERY_PARAMETER", "getMimeType", "Landroid/net/Uri;", "doesFileExistInSDKExternalStorage", "Ljava/io/File;", "context", "Landroid/content/Context;", "getFileName", "zendesk.core_core-utilities"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FileKtxKt {

    @NotNull
    private static final String FILE_NAME_QUERY_PARAMETER = "name";

    @NotNull
    private static final String URL_WHITE_SPACE_DELIMITER = "%20";

    @Nullable
    public static final File doesFileExistInSDKExternalStorage(@NotNull String str, @NotNull Context context) {
        str.getClass();
        context.getClass();
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @NotNull
    public static final String getFileName(@NotNull String str) {
        String queryParameter;
        str.getClass();
        String strN = y.n(StringsKt.X(str, ExpiryDateInput.SEPARATOR), URL_WHITE_SPACE_DELIMITER, " ", false);
        try {
            queryParameter = Uri.parse(str).getQueryParameter(FILE_NAME_QUERY_PARAMETER);
        } catch (NullPointerException unused) {
        }
        return queryParameter == null ? strN : queryParameter;
    }

    @NotNull
    public static final String getMimeType(@NotNull Uri uri) {
        uri.getClass();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        fileExtensionFromUrl.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
        lowerCase.getClass();
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        if (mimeTypeFromExtension == null) {
            return "";
        }
        String lowerCase2 = mimeTypeFromExtension.toLowerCase(locale);
        lowerCase2.getClass();
        return lowerCase2 == null ? "" : lowerCase2;
    }
}
