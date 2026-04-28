package rc;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37891b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f37890a = i11;
        this.f37891b = obj;
    }

    public static String e(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    public String a() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f37891b;
        try {
            try {
            } catch (NullPointerException e5) {
                e = e5;
            }
        } catch (IOException unused) {
        }
        boolean z11 = httpURLConnection.getResponseCode() / 100 == 2;
        if (z11) {
            return null;
        }
        try {
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + e(httpURLConnection);
        } catch (IOException e11) {
            e = e11;
        }
        ve.c.c("get error failed ", e);
        return e.getMessage();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f37890a) {
            case 0:
                ((c) this.f37891b).close();
                break;
            default:
                ((HttpURLConnection) this.f37891b).disconnect();
                break;
        }
    }
}
