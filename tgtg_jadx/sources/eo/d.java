package eo;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.g1;
import bg.k0;
import com.app.tgtg.R;
import kotlin.text.y;
import mv.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f16197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f16198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityResultLauncher f16199c;

    public d(f fVar) {
        this.f16197a = fVar;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fVar.registerForActivityResult(new g1(3), new e.b(this, 2));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f16199c = activityResultLauncherRegisterForActivityResult;
    }

    public final void a(a aVar) {
        String str = aVar.f16188a;
        String str2 = aVar.f16190c;
        String str3 = aVar.f16189b;
        String str4 = aVar.f16188a;
        if (r0.v(str)) {
            return;
        }
        f fVar = this.f16197a;
        Toast.makeText(fVar.requireActivity(), R.string.mystore_download_toast, 0).show();
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(y.n(str4, "blob:", "", false)));
        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(str4));
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String strGuessFileName = URLUtil.guessFileName(str4, str3, str2);
        strGuessFileName.getClass();
        request.setMimeType(singleton.getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(strGuessFileName)));
        if (Build.VERSION.SDK_INT < 29) {
            request.allowScanningByMediaScanner();
        }
        request.setNotificationVisibility(1);
        String str5 = Environment.DIRECTORY_DOWNLOADS;
        String strGuessFileName2 = URLUtil.guessFileName(str4, str3, str2);
        strGuessFileName2.getClass();
        request.setDestinationInExternalPublicDir(str5, strGuessFileName2);
        Object systemService = fVar.requireActivity().getSystemService("download");
        systemService.getClass();
        ((DownloadManager) systemService).enqueue(request);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j9) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        a aVar = new a(str, str3, str4);
        f fVar = this.f16197a;
        Context contextRequireContext = fVar.requireContext();
        contextRequireContext.getClass();
        if (Build.VERSION.SDK_INT >= 33 || androidx.core.app.e.a(contextRequireContext, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            a(aVar);
            return;
        }
        this.f16198b = aVar;
        if (!androidx.core.app.e.l(fVar.requireActivity(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            this.f16199c.a("android.permission.WRITE_EXTERNAL_STORAGE", null);
            return;
        }
        k0 k0Var = new k0(fVar.requireActivity());
        k0Var.e(R.string.mystore_download_permission_title);
        k0Var.a(R.string.mystore_download_permission_description);
        k0Var.c(R.string.generic_error_view_alert_go_to_settings_positive_btn);
        k0Var.l = new cw.b(this, 8);
        k0Var.b(R.string.alert_box_close_btn);
        k0Var.f();
    }
}
