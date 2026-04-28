package ed;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import com.app.tgtg.R;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import q90.t;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f15927a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f15928b = Bitmap.Config.HARDWARE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f15929c = new t((String[]) new ArrayList(20).toArray(new String[0]));

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || StringsKt.H(str)) {
            return null;
        }
        String strA0 = StringsKt.a0(StringsKt.a0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.W('.', StringsKt.W('/', strA0, strA0), ""));
    }

    public static final u c(View view) {
        u uVar;
        Object tag = view.getTag(R.id.coil_request_manager);
        u uVar2 = tag instanceof u ? (u) tag : null;
        if (uVar2 != null) {
            return uVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil_request_manager);
                uVar = tag2 instanceof u ? (u) tag2 : null;
                if (uVar == null) {
                    uVar = new u(view);
                    view.addOnAttachStateChangeListener(uVar);
                    view.setTag(R.id.coil_request_manager, uVar);
                }
            } finally {
            }
        }
        return uVar;
    }

    public static final boolean d(Uri uri) {
        return Intrinsics.areEqual(uri.getScheme(), "file") && Intrinsics.areEqual((String) CollectionsKt.firstOrNull(uri.getPathSegments()), "android_asset");
    }

    public static final int e(a.a aVar, ad.g gVar) {
        if (aVar instanceof ad.a) {
            return ((ad.a) aVar).f1221b;
        }
        int i11 = j.$EnumSwitchMapping$2[gVar.ordinal()];
        if (i11 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i11 == 2) {
            return Integer.MAX_VALUE;
        }
        e40.a.f();
        return 0;
    }
}
