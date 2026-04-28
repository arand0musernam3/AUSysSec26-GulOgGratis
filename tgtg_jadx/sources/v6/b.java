package v6;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f42017b = new HashMap();

    public b(String str) {
        this.f42016a = str;
    }

    public final File a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            i4.a.f(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Unable to find path from root: "));
            return null;
        }
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.f42017b.get(strDecode);
        if (file == null) {
            i4.a.f(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Unable to find configured root for "));
            return null;
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            String path = canonicalFile.getPath();
            String path2 = file.getPath();
            if (FileProvider.access$000(path).startsWith(FileProvider.access$000(path2) + '/')) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            j4.d.o(file2, "Failed to resolve canonical path for ");
            return null;
        }
    }
}
