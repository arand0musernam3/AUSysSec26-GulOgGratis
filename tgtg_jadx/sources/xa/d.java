package xa;

import android.content.Context;
import ex.i;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f44209b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f44210a;

    public d(Context context, File file) {
        try {
            this.f44210a = new File(i.w(file));
            if (a(context)) {
                return;
            }
            throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
        } catch (IOException e5) {
            throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e5);
        }
    }

    public final boolean a(Context context) {
        String strW = i.w(this.f44210a);
        String strW2 = i.w(context.getCacheDir());
        String strW3 = i.w(context.getDataDir());
        if ((!strW.startsWith(strW2) && !strW.startsWith(strW3)) || strW.equals(strW2) || strW.equals(strW3)) {
            return false;
        }
        for (int i11 = 0; i11 < 5; i11++) {
            if (strW.startsWith(strW3 + f44209b[i11])) {
                return false;
            }
        }
        return true;
    }
}
