package wc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import ed.k;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import q90.v;
import zc.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43383a;

    public /* synthetic */ a(int i11) {
        this.f43383a = i11;
    }

    public final Object a(Object obj, n nVar) throws PackageManager.NameNotFoundException {
        String scheme;
        String authority;
        switch (this.f43383a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!k.d(uri) && ((scheme = uri.getScheme()) == null || Intrinsics.areEqual(scheme, "file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    if (StringsKt.T(path, '/') && ((String) CollectionsKt.firstOrNull(uri.getPathSegments())) != null) {
                        if (!Intrinsics.areEqual(uri.getScheme(), "file")) {
                            return new File(uri.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null) {
                            return new File(path2);
                        }
                    }
                }
                return null;
            case 2:
                return ((v) obj).f36631i;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = nVar.f47490a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (Intrinsics.areEqual(uri2.getScheme(), "android.resource") && (authority = uri2.getAuthority()) != null && !StringsKt.H(authority) && uri2.getPathSegments().size() == 2) {
                    String authority2 = uri2.getAuthority();
                    if (authority2 == null) {
                        authority2 = "";
                    }
                    Resources resourcesForApplication = nVar.f47490a.getPackageManager().getResourcesForApplication(authority2);
                    List<String> pathSegments = uri2.getPathSegments();
                    int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                    if (identifier != 0) {
                        return Uri.parse("android.resource://" + authority2 + '/' + identifier);
                    }
                    e40.a.g(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri2, "Invalid android.resource URI: "));
                }
                return null;
            default:
                return Uri.parse((String) obj);
        }
    }
}
