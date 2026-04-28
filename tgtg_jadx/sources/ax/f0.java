package ax;

import android.graphics.Bitmap;
import android.net.Network;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import h2.b1;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import q90.u0;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4904a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4907d;

    public static void g(f0 f0Var, Network network, boolean z11, boolean z12, int i11) {
        if ((i11 & 2) != 0) {
            z11 = f0Var.f4904a;
        }
        if ((i11 & 4) != 0) {
            z12 = f0Var.f4905b;
        }
        f0Var.getClass();
        network.getClass();
        if (Intrinsics.areEqual((Network) f0Var.f4906c, network)) {
            boolean z13 = (f0Var.f4904a == z11 && f0Var.f4905b == z12) ? false : true;
            f0Var.f4904a = z11;
            f0Var.f4905b = z12;
            if (z13) {
                f0Var.e();
            }
        }
    }

    @Override // ax.d0
    public void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        i(str, null, null);
        l("%s", str2);
        n();
        ((tx.f0) this.f4907d).a();
    }

    public q90.m b() {
        return new q90.m(this.f4904a, this.f4905b, (String[]) this.f4906c, (String[]) this.f4907d);
    }

    public void c(q90.l... lVarArr) {
        if (!this.f4904a) {
            i4.a.f("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (q90.l lVar : lVarArr) {
            arrayList.add(lVar.f36541a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f4904a) {
            i4.a.f("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f4906c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            i4.a.f("At least one cipher suite is required");
        }
    }

    public lf.a d() {
        return (lf.a) ((u70.t) this.f4907d).getValue();
    }

    public void e() {
        ye.b bVar = (ye.b) ((a50.c) this.f4907d).f822b;
        if (!this.f4904a || this.f4905b) {
            bVar.f().b("AndroidNetworkListener, onNetworkUnavailable.");
            bVar.f45852a.f45901q = Boolean.TRUE;
        } else {
            bVar.f().b("AndroidNetworkListener, onNetworkAvailable.");
            bVar.f45852a.f45901q = Boolean.FALSE;
            v80.f0.B(bVar.f45854c, bVar.f45855d, null, new b1(bVar, null, 15), 2);
        }
    }

    public void f(u0... u0VarArr) {
        if (!this.f4904a) {
            i4.a.f("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(u0VarArr.length);
        for (u0 u0Var : u0VarArr) {
            arrayList.add(u0Var.a());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f4904a) {
            i4.a.f("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f4907d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            i4.a.f("At least one TLS version is required");
        }
    }

    public void h(String str, Object... objArr) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f4906c;
        if (this.f4905b) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String strEncode = URLEncoder.encode(String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), ArticleContentView.UTF_8_ENCODING_TYPE);
            strEncode.getClass();
            byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
            bytes.getClass();
            filterOutputStream.write(bytes);
            return;
        }
        if (this.f4904a) {
            Charset charset = Charsets.UTF_8;
            byte[] bytes2 = "--".getBytes(charset);
            bytes2.getClass();
            filterOutputStream.write(bytes2);
            byte[] bytes3 = h0.f4915j.getBytes(charset);
            bytes3.getClass();
            filterOutputStream.write(bytes3);
            byte[] bytes4 = "\r\n".getBytes(charset);
            bytes4.getClass();
            filterOutputStream.write(bytes4);
            this.f4904a = false;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
        byte[] bytes5 = String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)).getBytes(Charsets.UTF_8);
        bytes5.getClass();
        filterOutputStream.write(bytes5);
    }

    public void i(String str, String str2, String str3) throws IOException {
        if (this.f4905b) {
            FilterOutputStream filterOutputStream = (FilterOutputStream) this.f4906c;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(Charsets.UTF_8);
            bytes.getClass();
            filterOutputStream.write(bytes);
            return;
        }
        h("Content-Disposition: form-data; name=\"%s\"", str);
        if (str2 != null) {
            h("; filename=\"%s\"", str2);
        }
        l("", new Object[0]);
        if (str3 != null) {
            l("%s: %s", "Content-Type", str3);
        }
        l("", new Object[0]);
    }

    public void j(String str, Uri uri, String str2) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f4906c;
        str.getClass();
        uri.getClass();
        if (str2 == null) {
            str2 = "content/unknown";
        }
        i(str, str, str2);
        int i11 = tx.n0.i(a0.a().getContentResolver().openInputStream(uri), filterOutputStream);
        l("", new Object[0]);
        n();
        tx.f0 f0Var = (tx.f0) this.f4907d;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        f0Var.a();
    }

    public void k(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f4906c;
        str.getClass();
        parcelFileDescriptor.getClass();
        if (str2 == null) {
            str2 = "content/unknown";
        }
        i(str, str, str2);
        int i11 = tx.n0.i(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), filterOutputStream);
        l("", new Object[0]);
        n();
        tx.f0 f0Var = (tx.f0) this.f4907d;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        f0Var.a();
    }

    public void l(String str, Object... objArr) throws IOException {
        h(str, Arrays.copyOf(objArr, objArr.length));
        if (this.f4905b) {
            return;
        }
        h("\r\n", new Object[0]);
    }

    public void m(String str, Object obj, h0 h0Var) {
        tx.f0 f0Var = (tx.f0) this.f4907d;
        str.getClass();
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f4906c;
        String str2 = h0.f4915j;
        if (qb.e.x(obj)) {
            a(str, qb.e.o(obj));
            return;
        }
        if (obj instanceof Bitmap) {
            i(str, str, "image/png");
            ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, filterOutputStream);
            l("", new Object[0]);
            n();
            f0Var.a();
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            i(str, str, "content/unknown");
            filterOutputStream.write(bArr);
            l("", new Object[0]);
            n();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            f0Var.a();
            return;
        }
        if (obj instanceof Uri) {
            j(str, (Uri) obj, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            k(str, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (!(obj instanceof e0)) {
            i4.a.f("value is not a supported type.");
            return;
        }
        e0 e0Var = (e0) obj;
        Parcelable parcelable = e0Var.f4899b;
        String str3 = e0Var.f4898a;
        if (parcelable instanceof ParcelFileDescriptor) {
            k(str, (ParcelFileDescriptor) parcelable, str3);
        } else if (parcelable instanceof Uri) {
            j(str, (Uri) parcelable, str3);
        } else {
            i4.a.f("value is not a supported type.");
        }
    }

    public void n() throws IOException {
        if (!this.f4905b) {
            l("--%s", h0.f4915j);
            return;
        }
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f4906c;
        byte[] bytes = "&".getBytes(Charsets.UTF_8);
        bytes.getClass();
        filterOutputStream.write(bytes);
    }
}
