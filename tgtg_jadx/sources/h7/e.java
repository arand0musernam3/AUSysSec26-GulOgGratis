package h7;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21527a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClipData f21528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f21531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f21532f;

    public e(e eVar) {
        ClipData clipData = eVar.f21528b;
        clipData.getClass();
        this.f21528b = clipData;
        int i11 = eVar.f21529c;
        pd.g.k(i11, 0, 5, "source");
        this.f21529c = i11;
        int i12 = eVar.f21530d;
        if ((i12 & 1) != i12) {
            m0.i1.l("Requested flags 0x", Integer.toHexString(i12), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.f21530d = i12;
        this.f21531e = eVar.f21531e;
        this.f21532f = eVar.f21532f;
    }

    @Override // h7.f
    public ClipData a() {
        return this.f21528b;
    }

    @Override // h7.d
    public void b(Uri uri) {
        this.f21531e = uri;
    }

    @Override // h7.d
    public g build() {
        return new g(new e(this));
    }

    @Override // h7.d
    public void c(int i11) {
        this.f21530d = i11;
    }

    @Override // h7.f
    public int d() {
        return this.f21530d;
    }

    @Override // h7.f
    public ContentInfo e() {
        return null;
    }

    @Override // h7.f
    public int getSource() {
        return this.f21529c;
    }

    @Override // h7.d
    public void setExtras(Bundle bundle) {
        this.f21532f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f21527a) {
            case 1:
                Uri uri = this.f21531e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f21528b.getDescription());
                sb2.append(", source=");
                int i11 = this.f21529c;
                sb2.append(i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? String.valueOf(i11) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i12 = this.f21530d;
                sb2.append((i12 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i12));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return r8.k.p(sb2, this.f21532f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e() {
    }
}
