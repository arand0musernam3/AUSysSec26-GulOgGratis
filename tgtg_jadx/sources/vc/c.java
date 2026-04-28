package vc;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import ed.k;
import kotlin.jvm.internal.Intrinsics;
import zc.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    @Override // vc.b
    public final String a(Object obj, n nVar) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.areEqual(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        Configuration configuration = nVar.f47490a.getResources().getConfiguration();
        Bitmap.Config[] configArr = k.f15927a;
        sb2.append(configuration.uiMode & 48);
        return sb2.toString();
    }
}
