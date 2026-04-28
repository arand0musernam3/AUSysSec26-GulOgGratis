package c40;

import android.util.Log;
import com.adyen.checkout.components.core.Address;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import org.brotli.dec.BrotliInputStream;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f7086c = Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f7087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f7088b;

    public o(File file) {
        this.f7087a = file;
    }

    @Override // c40.d
    public final void a() {
        a40.g.b(this.f7088b, "There was a problem closing the Crashlytics log file.");
        this.f7088b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // c40.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            r7 = this;
            java.io.File r0 = r7.f7087a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r2
            goto L38
        Lc:
            r7.c()
            c40.m r0 = r7.f7088b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r1}
            int r0 = r0.G()
            byte[] r0 = new byte[r0]
            c40.m r4 = r7.f7088b     // Catch: java.io.IOException -> L29
            c40.f r5 = new c40.f     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.g(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "A problem occurred while reading the Crashlytics log file."
            java.lang.String r6 = "FirebaseCrashlytics"
            android.util.Log.e(r6, r5, r4)
        L31:
            c40.n r4 = new c40.n
            r3 = r3[r1]
            r4.<init>(r0, r3)
        L38:
            if (r4 != 0) goto L3c
            r3 = r2
            goto L45
        L3c:
            int r0 = r4.f7085b
            byte[] r3 = new byte[r0]
            byte[] r4 = r4.f7084a
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
        L45:
            if (r3 == 0) goto L4f
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = c40.o.f7086c
            r0.<init>(r3, r1)
            return r0
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.o.b():java.lang.String");
    }

    public final void c() {
        File file = this.f7087a;
        if (this.f7088b == null) {
            try {
                this.f7088b = new m(file);
            } catch (IOException e5) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e5);
            }
        }
    }

    @Override // c40.d
    public final void j(long j9, String str) {
        c();
        if (this.f7088b == null) {
            return;
        }
        if (str == null) {
            str = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE));
            }
            this.f7088b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j9), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f7086c));
            while (!this.f7088b.p() && this.f7088b.G() > 65536) {
                this.f7088b.u();
            }
        } catch (IOException e5) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e5);
        }
    }
}
