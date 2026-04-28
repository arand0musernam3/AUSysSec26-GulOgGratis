package nx;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f31443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f31444c;

    public l(String str, File file, k kVar) {
        str.getClass();
        this.f31442a = str;
        this.f31443b = file;
        this.f31444c = kVar;
    }

    public final Boolean a(String... strArr) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            strArr.getClass();
            try {
                URL url = new URL(this.f31442a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f31443b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            return a((String[]) objArr);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!set.contains(this) && zBooleanValue) {
                try {
                    this.f31444c.b(this.f31443b);
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                }
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }
}
