package bo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import bg.k0;
import c50.q;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.ui.BottomNavigation;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import ed.k;
import ft.j;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m0.x0;
import org.bouncycastle.iana.AEADAlgorithm;
import p70.g;
import v0.n;
import y9.w;
import zendesk.ui.android.conversation.avatar.AvatarImageView;
import zendesk.ui.android.conversation.imagecell.ImageCellView;
import zendesk.ui.android.internal.ImageLoaderFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6547b;

    public /* synthetic */ a(Context context, int i11) {
        this.f6546a = i11;
        this.f6547b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        int i11 = this.f6546a;
        j jVar = null;
        Context context = this.f6547b;
        switch (i11) {
            case 0:
                int i12 = BottomNavigation.f9155i;
                try {
                    return w6.j.b(context, R.font.menu_font);
                } catch (Resources.NotFoundException e5) {
                    sa0.a.f38953a.d(e5);
                    return null;
                }
            case 1:
                File fileP = w.p(context, "firebaseSessions/sessionConfigsDataStore.data");
                q.c(fileP);
                return fileP;
            case 2:
                File fileP2 = w.p(context, "firebaseSessions/sessionDataStore.data");
                q.c(fileP2);
                return fileP2;
            case 3:
                Context contextD = g.d(context);
                contextD.getClass();
                androidx.core.app.e.k((Activity) contextD, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, AppConstants.PERMISSIONS_REQUEST_USE_LOCATION);
                ft.c.Q();
                return Unit.f26487a;
            case 4:
                Context contextD2 = g.d(context);
                contextD2.getClass();
                k0 k0Var = new k0((Activity) contextD2);
                k0Var.e(R.string.generic_error_view_alert_go_to_settings_title);
                k0Var.a(R.string.generic_error_view_alert_go_to_settings_description);
                k0Var.c(R.string.generic_error_view_alert_go_to_settings_positive_btn);
                k0Var.l = new a(context, 6);
                k0Var.b(R.string.generic_error_view_alert_go_to_settings_negative_btn);
                k0Var.f();
                return Unit.f26487a;
            case 5:
                Context contextD3 = g.d(context);
                contextD3.getClass();
                Activity activity = (Activity) contextD3;
                j jVar2 = j.f17932h;
                if (jVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instance");
                } else {
                    jVar = jVar2;
                }
                jVar.c(activity);
                return Unit.f26487a;
            case 6:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                Context contextD4 = g.d(context);
                contextD4.getClass();
                ((Activity) contextD4).startActivityForResult(intent, AppConstants.GO_TO_GPS_SETTINGS);
                return Unit.f26487a;
            case 7:
                return android.support.v4.media.session.a.m(context);
            case 8:
                return n.B(context, "EVENT_DATA_STORE");
            case 9:
                return n.B(context, "SessionDataStore");
            case 10:
                return n.B(context, "TRACKING_SETTINGS_DATA_STORE");
            case 11:
                return n.B(context, "HAS_BEEN_SEEN_DATA_STORE");
            case 12:
                return n.B(context, "AUTH_DATA_STORE");
            case 13:
                return new x0(context);
            case 14:
                return AvatarImageView.skeletonLoaderDrawable_delegate$lambda$0(context);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Bitmap.Config[] configArr = k.f15927a;
                File cacheDir = context.getCacheDir();
                if (cacheDir != null) {
                    cacheDir.mkdirs();
                    return cacheDir;
                }
                h2.b("cacheDir == null");
                return null;
            case 16:
                Bitmap.Config[] configArr2 = k.f15927a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 != null) {
                    cacheDir2.mkdirs();
                    return cacheDir2;
                }
                h2.b("cacheDir == null");
                return null;
            case 17:
                return ImageCellView.skeletonLoaderInboundAnimation_delegate$lambda$0(context);
            case 18:
                return ImageCellView.skeletonLoaderOutboundAnimation_delegate$lambda$1(context);
            case 19:
                return ImageLoaderFactory.getImageLoader$lambda$5$lambda$1(context);
            default:
                return ImageLoaderFactory.getImageLoader$lambda$5$lambda$2(context);
        }
    }
}
