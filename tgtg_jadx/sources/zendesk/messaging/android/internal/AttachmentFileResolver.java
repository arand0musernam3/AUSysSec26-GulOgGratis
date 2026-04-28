package zendesk.messaging.android.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/internal/AttachmentFileResolver;", "", "<init>", "()V", "createUriToCapturePhoto", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "createTemporaryFile", "Ljava/io/File;", "getAuthorityProvider", "", "generateFilePrefix", "timeStamp", "grantPersistentMediaAccess", "", "uri", "createUploadFileFromUri", "Lzendesk/messaging/android/internal/model/UploadFile;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AttachmentFileResolver {

    @NotNull
    public static final String SIMPLE_DATE_FORMAT = "yyyyMMdd_HHmmss";

    @NotNull
    public static final String TEMP_FILE_PREFIX = "JPEG_%s_";

    @NotNull
    public static final String TEMP_FILE_SUFFIX = ".jpg";

    private final File createTemporaryFile(Context context) throws IOException {
        String str = new SimpleDateFormat(SIMPLE_DATE_FORMAT, Locale.getDefault()).format(new Date());
        str.getClass();
        File fileCreateTempFile = File.createTempFile(generateFilePrefix(str), TEMP_FILE_SUFFIX, context.getCacheDir());
        fileCreateTempFile.createNewFile();
        fileCreateTempFile.deleteOnExit();
        return fileCreateTempFile;
    }

    private final String generateFilePrefix(String timeStamp) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(TEMP_FILE_PREFIX, Arrays.copyOf(new Object[]{timeStamp}, 1));
    }

    private final String getAuthorityProvider(Context context) {
        return k.l(context.getPackageName(), ".zendesk.messaging.provider");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zendesk.messaging.android.internal.model.UploadFile createUploadFileFromUri(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull android.net.Uri r9) {
        /*
            r7 = this;
            r8.getClass()
            r9.getClass()
            android.content.ContentResolver r0 = r8.getContentResolver()
            if (r0 == 0) goto L16
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r9
            android.database.Cursor r8 = r0.query(r1, r2, r3, r4, r5)
            goto L18
        L16:
            r1 = r9
            r8 = 0
        L18:
            if (r8 == 0) goto L1d
            r8.moveToFirst()
        L1d:
            java.lang.String r9 = ""
            if (r8 == 0) goto L30
            java.lang.String r0 = "_display_name"
            int r0 = r8.getColumnIndex(r0)
            java.lang.String r0 = r8.getString(r0)
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            r3 = r0
            goto L31
        L30:
            r3 = r9
        L31:
            if (r8 == 0) goto L3e
            java.lang.String r0 = "_size"
            int r0 = r8.getColumnIndex(r0)
            long r4 = r8.getLong(r0)
            goto L40
        L3e:
            r4 = 0
        L40:
            if (r8 == 0) goto L45
            r8.close()
        L45:
            java.lang.String r8 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r3)
            r8.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r0)
            r8.getClass()
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r8 = r2.getMimeTypeFromExtension(r8)
            if (r8 == 0) goto L6c
            java.lang.String r8 = r8.toLowerCase(r0)
            r8.getClass()
            if (r8 != 0) goto L69
            goto L6c
        L69:
            r6 = r8
        L6a:
            r8 = r1
            goto L6e
        L6c:
            r6 = r9
            goto L6a
        L6e:
            zendesk.messaging.android.internal.model.UploadFile r1 = new zendesk.messaging.android.internal.model.UploadFile
            java.lang.String r2 = r8.toString()
            r2.getClass()
            r1.<init>(r2, r3, r4, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.AttachmentFileResolver.createUploadFileFromUri(android.content.Context, android.net.Uri):zendesk.messaging.android.internal.model.UploadFile");
    }

    @Nullable
    public final Uri createUriToCapturePhoto(@NotNull Context context) {
        context.getClass();
        File fileCreateTemporaryFile = createTemporaryFile(context);
        return FileProvider.getUriForFile(context.getApplicationContext(), getAuthorityProvider(context), fileCreateTemporaryFile);
    }

    public final void grantPersistentMediaAccess(@NotNull Context context, @NotNull Uri uri) {
        context.getClass();
        uri.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            contentResolver.takePersistableUriPermission(uri, 1);
        }
    }
}
