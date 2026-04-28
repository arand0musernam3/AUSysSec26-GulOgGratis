package tc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import androidx.vectordrawable.graphics.drawable.r;
import b0.a0;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.braze.h2;
import j4.s;
import java.io.IOException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;
import qc.c0;
import qc.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f39922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zc.n f39923c;

    public /* synthetic */ b(Uri uri, zc.n nVar, int i11) {
        this.f39921a = i11;
        this.f39922b = uri;
        this.f39923c = nVar;
    }

    @Override // tc.h
    public final Object a(x70.c cVar) throws XmlPullParserException, IOException {
        Integer intOrNull;
        Drawable drawable;
        int i11 = this.f39921a;
        int i12 = 15;
        Uri uri = this.f39922b;
        zc.n nVar = this.f39923c;
        boolean z11 = true;
        switch (i11) {
            case 0:
                String strU = CollectionsKt.U(CollectionsKt.J(1, uri.getPathSegments()), ExpiryDateInput.SEPARATOR, null, null, null, 62);
                return new n(new d0(new ia0.d0(ia0.b.g(nVar.f47490a.getAssets().open(strU))), new bo.a(nVar.f47490a, i12), new qc.a(strU)), ed.k.b(MimeTypeMap.getSingleton(), strU), qc.f.DISK);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (StringsKt.H(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) CollectionsKt.X(uri.getPathSegments());
                        if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                            h2.b(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Invalid android.resource URI: "));
                            return null;
                        }
                        int iIntValue = intOrNull.intValue();
                        Context context = nVar.f47490a;
                        Resources resources = Intrinsics.areEqual(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String strB = ed.k.b(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.J(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!Intrinsics.areEqual(strB, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new n(new d0(new ia0.d0(ia0.b.g(resources.openRawResource(iIntValue, typedValue2))), new bo.a(context, i12), new c0(authority, iIntValue, typedValue2.density)), strB, qc.f.DISK);
                        }
                        if (Intrinsics.areEqual(authority, context.getPackageName())) {
                            drawable = a0.x(context, iIntValue);
                            if (drawable == null) {
                                e40.a.g(s.f(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = w6.j.f43256a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                e40.a.g(s.f(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof r)) {
                            z11 = false;
                        }
                        if (z11) {
                            drawable = new BitmapDrawable(context.getResources(), ba0.g.i(drawable, nVar.f47491b, nVar.f47493d, nVar.f47494e, nVar.f47495f));
                        }
                        return new e(drawable, z11, qc.f.DISK);
                    }
                }
                h2.b(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Invalid android.resource URI: "));
                return null;
        }
    }
}
